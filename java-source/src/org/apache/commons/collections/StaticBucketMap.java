/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections.StaticBucketMap;

public final class StaticBucketMap
implements Map {
    private static final int DEFAULT_BUCKETS = 255;
    private Node[] m_buckets;
    private Lock[] m_locks;

    public StaticBucketMap() {
        this(255);
    }

    public StaticBucketMap(int numBuckets) {
        int size = Math.max(17, numBuckets);
        if (size % 2 == 0) {
            --size;
        }
        this.m_buckets = new Node[size];
        this.m_locks = new Lock[size];
        int i = 0;
        while (i < size) {
            this.m_locks[i] = new Lock(null);
            ++i;
        }
    }

    private final int getHash(Object key) {
        if (key == null) {
            return 0;
        }
        int hash = key.hashCode();
        hash += ~(hash << 15);
        hash ^= hash >>> 10;
        hash += hash << 3;
        hash ^= hash >>> 6;
        hash += ~(hash << 11);
        hash ^= hash >>> 16;
        return (hash %= this.m_buckets.length) < 0 ? hash * -1 : hash;
    }

    public Set keySet() {
        return new KeySet(this, null);
    }

    public int size() {
        int cnt = 0;
        int i = 0;
        while (i < this.m_buckets.length) {
            cnt += this.m_locks[i].size;
            ++i;
        }
        return cnt;
    }

    public Object put(Object key, Object value) {
        int hash = this.getHash(key);
        Lock lock = this.m_locks[hash];
        synchronized (lock) {
            Node n2 = this.m_buckets[hash];
            if (n2 == null) {
                n2 = new Node(null);
                n2.key = key;
                n2.value = value;
                this.m_buckets[hash] = n2;
                ++this.m_locks[hash].size;
                Object var6_6 = null;
                return var6_6;
            }
            Node next = n2;
            while (next != null) {
                n2 = next;
                if (n2.key == key || n2.key != null && n2.key.equals(key)) {
                    Object returnVal = n2.value;
                    n2.value = value;
                    Object object = returnVal;
                    return object;
                }
                next = next.next;
            }
            Node newNode = new Node(null);
            newNode.key = key;
            newNode.value = value;
            n2.next = newNode;
            ++this.m_locks[hash].size;
        }
        return null;
    }

    public Object get(Object key) {
        int hash = this.getHash(key);
        Lock lock = this.m_locks[hash];
        synchronized (lock) {
            Node n2 = this.m_buckets[hash];
            while (n2 != null) {
                if (n2.key == key || n2.key != null && n2.key.equals(key)) {
                    Object object = n2.value;
                    return object;
                }
                n2 = n2.next;
            }
        }
        return null;
    }

    public boolean containsKey(Object key) {
        int hash = this.getHash(key);
        Lock lock = this.m_locks[hash];
        synchronized (lock) {
            Node n2 = this.m_buckets[hash];
            while (n2 != null) {
                if (n2.key == null || n2.key != null && n2.key.equals(key)) {
                    boolean bl = true;
                    return bl;
                }
                n2 = n2.next;
            }
        }
        return false;
    }

    public boolean containsValue(Object value) {
        int i = 0;
        while (i < this.m_buckets.length) {
            Lock lock = this.m_locks[i];
            synchronized (lock) {
                Node n2 = this.m_buckets[i];
                while (n2 != null) {
                    if (n2.value == value || n2.value != null && n2.value.equals(value)) {
                        boolean bl = true;
                        return bl;
                    }
                    n2 = n2.next;
                }
            }
            ++i;
        }
        return false;
    }

    public Collection values() {
        return new Values(this, null);
    }

    public Set entrySet() {
        return new EntrySet(this, null);
    }

    public void putAll(Map other) {
        Iterator i = other.keySet().iterator();
        while (i.hasNext()) {
            Object key = i.next();
            this.put(key, other.get(key));
        }
    }

    public Object remove(Object key) {
        int hash = this.getHash(key);
        Lock lock = this.m_locks[hash];
        synchronized (lock) {
            Node n2 = this.m_buckets[hash];
            Node prev = null;
            while (n2 != null) {
                if (n2.key == key || n2.key != null && n2.key.equals(key)) {
                    if (null == prev) {
                        this.m_buckets[hash] = n2.next;
                    } else {
                        prev.next = n2.next;
                    }
                    --this.m_locks[hash].size;
                    Object object = n2.value;
                    return object;
                }
                prev = n2;
                n2 = n2.next;
            }
        }
        return null;
    }

    public final boolean isEmpty() {
        return this.size() == 0;
    }

    public final void clear() {
        int i = 0;
        while (i < this.m_buckets.length) {
            Lock lock;
            Lock lock2 = lock = this.m_locks[i];
            synchronized (lock2) {
                this.m_buckets[i] = null;
                lock.size = 0;
            }
            ++i;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map other = (Map)obj;
        return this.entrySet().equals(other.entrySet());
    }

    public final int hashCode() {
        int hashCode = 0;
        int i = 0;
        while (i < this.m_buckets.length) {
            Lock lock = this.m_locks[i];
            synchronized (lock) {
                Node n2 = this.m_buckets[i];
                while (n2 != null) {
                    hashCode += n2.hashCode();
                    n2 = n2.next;
                }
            }
            ++i;
        }
        return hashCode;
    }

    public void atomic(Runnable r2) {
        if (r2 == null) {
            throw new NullPointerException();
        }
        this.atomic(r2, 0);
    }

    private void atomic(Runnable r2, int bucket) {
        if (bucket >= this.m_buckets.length) {
            r2.run();
            return;
        }
        Lock lock = this.m_locks[bucket];
        synchronized (lock) {
            this.atomic(r2, bucket + 1);
        }
    }

    static /* synthetic */ Node[] access$500(StaticBucketMap x0) {
        return x0.m_buckets;
    }

    static /* synthetic */ Lock[] access$600(StaticBucketMap x0) {
        return x0.m_locks;
    }

    static /* synthetic */ int access$800(StaticBucketMap x0, Object x1) {
        return x0.getHash(x1);
    }
}

