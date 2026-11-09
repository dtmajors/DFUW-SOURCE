/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections.map.StaticBucketMap;

public final class StaticBucketMap
implements Map {
    private static final int DEFAULT_BUCKETS = 255;
    private Node[] buckets;
    private Lock[] locks;

    public StaticBucketMap() {
        this(255);
    }

    public StaticBucketMap(int numBuckets) {
        int size = Math.max(17, numBuckets);
        if (size % 2 == 0) {
            --size;
        }
        this.buckets = new Node[size];
        this.locks = new Lock[size];
        int i = 0;
        while (i < size) {
            this.locks[i] = new Lock(null);
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
        return (hash %= this.buckets.length) < 0 ? hash * -1 : hash;
    }

    public int size() {
        int cnt = 0;
        int i = 0;
        while (i < this.buckets.length) {
            cnt += this.locks[i].size;
            ++i;
        }
        return cnt;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public Object get(Object key) {
        int hash = this.getHash(key);
        Lock lock = this.locks[hash];
        synchronized (lock) {
            Node n = this.buckets[hash];
            while (n != null) {
                if (n.key == key || n.key != null && n.key.equals(key)) {
                    Object object = n.value;
                    return object;
                }
                n = n.next;
            }
        }
        return null;
    }

    public boolean containsKey(Object key) {
        int hash = this.getHash(key);
        Lock lock = this.locks[hash];
        synchronized (lock) {
            Node n = this.buckets[hash];
            while (n != null) {
                if (n.key == null || n.key != null && n.key.equals(key)) {
                    boolean bl = true;
                    return bl;
                }
                n = n.next;
            }
        }
        return false;
    }

    public boolean containsValue(Object value) {
        int i = 0;
        while (i < this.buckets.length) {
            Lock lock = this.locks[i];
            synchronized (lock) {
                Node n = this.buckets[i];
                while (n != null) {
                    if (n.value == value || n.value != null && n.value.equals(value)) {
                        boolean bl = true;
                        return bl;
                    }
                    n = n.next;
                }
            }
            ++i;
        }
        return false;
    }

    public Object put(Object key, Object value) {
        int hash = this.getHash(key);
        Lock lock = this.locks[hash];
        synchronized (lock) {
            Node n = this.buckets[hash];
            if (n == null) {
                n = new Node(null);
                n.key = key;
                n.value = value;
                this.buckets[hash] = n;
                ++this.locks[hash].size;
                Object var6_6 = null;
                return var6_6;
            }
            Node next = n;
            while (next != null) {
                n = next;
                if (n.key == key || n.key != null && n.key.equals(key)) {
                    Object returnVal = n.value;
                    n.value = value;
                    Object object = returnVal;
                    return object;
                }
                next = next.next;
            }
            Node newNode = new Node(null);
            newNode.key = key;
            newNode.value = value;
            n.next = newNode;
            ++this.locks[hash].size;
        }
        return null;
    }

    public Object remove(Object key) {
        int hash = this.getHash(key);
        Lock lock = this.locks[hash];
        synchronized (lock) {
            Node n = this.buckets[hash];
            Node prev = null;
            while (n != null) {
                if (n.key == key || n.key != null && n.key.equals(key)) {
                    if (null == prev) {
                        this.buckets[hash] = n.next;
                    } else {
                        prev.next = n.next;
                    }
                    --this.locks[hash].size;
                    Object object = n.value;
                    return object;
                }
                prev = n;
                n = n.next;
            }
        }
        return null;
    }

    public Set keySet() {
        return new KeySet(this, null);
    }

    public Collection values() {
        return new Values(this, null);
    }

    public Set entrySet() {
        return new EntrySet(this, null);
    }

    public void putAll(Map map) {
        Iterator i = map.keySet().iterator();
        while (i.hasNext()) {
            Object key = i.next();
            this.put(key, map.get(key));
        }
    }

    public void clear() {
        int i = 0;
        while (i < this.buckets.length) {
            Lock lock;
            Lock lock2 = lock = this.locks[i];
            synchronized (lock2) {
                this.buckets[i] = null;
                lock.size = 0;
            }
            ++i;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map other = (Map)obj;
        return this.entrySet().equals(other.entrySet());
    }

    public int hashCode() {
        int hashCode = 0;
        int i = 0;
        while (i < this.buckets.length) {
            Lock lock = this.locks[i];
            synchronized (lock) {
                Node n = this.buckets[i];
                while (n != null) {
                    hashCode += n.hashCode();
                    n = n.next;
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
        if (bucket >= this.buckets.length) {
            r2.run();
            return;
        }
        Lock lock = this.locks[bucket];
        synchronized (lock) {
            this.atomic(r2, bucket + 1);
        }
    }

    static /* synthetic */ Node[] access$500(StaticBucketMap x0) {
        return x0.buckets;
    }

    static /* synthetic */ Lock[] access$600(StaticBucketMap x0) {
        return x0.locks;
    }

    static /* synthetic */ int access$800(StaticBucketMap x0, Object x1) {
        return x0.getHash(x1);
    }
}

