/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections.ReferenceMap;
import org.apache.commons.collections.keyvalue.DefaultMapEntry;

public class ReferenceMap
extends AbstractMap {
    private static final long serialVersionUID = -3370601314380922368L;
    public static final int HARD = 0;
    public static final int SOFT = 1;
    public static final int WEAK = 2;
    private int keyType;
    private int valueType;
    private float loadFactor;
    private boolean purgeValues = false;
    private transient ReferenceQueue queue = new ReferenceQueue();
    private transient Entry[] table;
    private transient int size;
    private transient int threshold;
    private volatile transient int modCount;
    private transient Set keySet;
    private transient Set entrySet;
    private transient Collection values;

    public ReferenceMap() {
        this(0, 1);
    }

    public ReferenceMap(int keyType, int valueType, boolean purgeValues) {
        this(keyType, valueType);
        this.purgeValues = purgeValues;
    }

    public ReferenceMap(int keyType, int valueType) {
        this(keyType, valueType, 16, 0.75f);
    }

    public ReferenceMap(int keyType, int valueType, int capacity, float loadFactor, boolean purgeValues) {
        this(keyType, valueType, capacity, loadFactor);
        this.purgeValues = purgeValues;
    }

    public ReferenceMap(int keyType, int valueType, int capacity, float loadFactor) {
        ReferenceMap.verify("keyType", keyType);
        ReferenceMap.verify("valueType", valueType);
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity must be positive");
        }
        if (loadFactor <= 0.0f || loadFactor >= 1.0f) {
            throw new IllegalArgumentException("Load factor must be greater than 0 and less than 1.");
        }
        this.keyType = keyType;
        this.valueType = valueType;
        int v = 1;
        while (v < capacity) {
            v *= 2;
        }
        this.table = new Entry[v];
        this.loadFactor = loadFactor;
        this.threshold = (int)((float)v * loadFactor);
    }

    private static void verify(String name, int type) {
        if (type < 0 || type > 2) {
            throw new IllegalArgumentException(name + " must be HARD, SOFT, WEAK.");
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeInt(this.table.length);
        Iterator iter = this.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry)iter.next();
            out.writeObject(entry.getKey());
            out.writeObject(entry.getValue());
        }
        out.writeObject(null);
    }

    private void readObject(ObjectInputStream inp) throws IOException, ClassNotFoundException {
        inp.defaultReadObject();
        this.table = new Entry[inp.readInt()];
        this.threshold = (int)((float)this.table.length * this.loadFactor);
        this.queue = new ReferenceQueue();
        Object key = inp.readObject();
        while (key != null) {
            Object value = inp.readObject();
            this.put(key, value);
            key = inp.readObject();
        }
    }

    private Object toReference(int type, Object referent, int hash) {
        switch (type) {
            case 0: {
                return referent;
            }
            case 1: {
                return new SoftRef(hash, referent, this.queue);
            }
            case 2: {
                return new WeakRef(hash, referent, this.queue);
            }
        }
        throw new Error();
    }

    private Entry getEntry(Object key) {
        if (key == null) {
            return null;
        }
        int hash = key.hashCode();
        int index = this.indexFor(hash);
        Entry entry = this.table[index];
        while (entry != null) {
            if (entry.hash == hash && key.equals(entry.getKey())) {
                return entry;
            }
            entry = entry.next;
        }
        return null;
    }

    private int indexFor(int hash) {
        hash += ~(hash << 15);
        hash ^= hash >>> 10;
        hash += hash << 3;
        hash ^= hash >>> 6;
        hash += ~(hash << 11);
        hash ^= hash >>> 16;
        return hash & this.table.length - 1;
    }

    private void resize() {
        Entry[] old = this.table;
        this.table = new Entry[old.length * 2];
        int i = 0;
        while (i < old.length) {
            Entry next = old[i];
            while (next != null) {
                Entry entry = next;
                next = next.next;
                int index = this.indexFor(entry.hash);
                entry.next = this.table[index];
                this.table[index] = entry;
            }
            old[i] = null;
            ++i;
        }
        this.threshold = (int)((float)this.table.length * this.loadFactor);
    }

    private void purge() {
        Reference ref = this.queue.poll();
        while (ref != null) {
            this.purge(ref);
            ref = this.queue.poll();
        }
    }

    private void purge(Reference ref) {
        int hash = ref.hashCode();
        int index = this.indexFor(hash);
        Entry previous = null;
        Entry entry = this.table[index];
        while (entry != null) {
            if (entry.purge(ref)) {
                if (previous == null) {
                    this.table[index] = entry.next;
                } else {
                    previous.next = entry.next;
                }
                --this.size;
                return;
            }
            previous = entry;
            entry = entry.next;
        }
    }

    public int size() {
        this.purge();
        return this.size;
    }

    public boolean isEmpty() {
        this.purge();
        return this.size == 0;
    }

    public boolean containsKey(Object key) {
        this.purge();
        Entry entry = this.getEntry(key);
        if (entry == null) {
            return false;
        }
        return entry.getValue() != null;
    }

    public Object get(Object key) {
        this.purge();
        Entry entry = this.getEntry(key);
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public Object put(Object key, Object value) {
        if (key == null) {
            throw new NullPointerException("null keys not allowed");
        }
        if (value == null) {
            throw new NullPointerException("null values not allowed");
        }
        this.purge();
        if (this.size + 1 > this.threshold) {
            this.resize();
        }
        int hash = key.hashCode();
        int index = this.indexFor(hash);
        Entry entry = this.table[index];
        while (entry != null) {
            if (hash == entry.hash && key.equals(entry.getKey())) {
                Object result = entry.getValue();
                entry.setValue(value);
                return result;
            }
            entry = entry.next;
        }
        ++this.size;
        ++this.modCount;
        key = this.toReference(this.keyType, key, hash);
        value = this.toReference(this.valueType, value, hash);
        this.table[index] = new Entry(this, key, hash, value, this.table[index]);
        return null;
    }

    public Object remove(Object key) {
        if (key == null) {
            return null;
        }
        this.purge();
        int hash = key.hashCode();
        int index = this.indexFor(hash);
        Entry previous = null;
        Entry entry = this.table[index];
        while (entry != null) {
            if (hash == entry.hash && key.equals(entry.getKey())) {
                if (previous == null) {
                    this.table[index] = entry.next;
                } else {
                    previous.next = entry.next;
                }
                --this.size;
                ++this.modCount;
                return entry.getValue();
            }
            previous = entry;
            entry = entry.next;
        }
        return null;
    }

    public void clear() {
        Arrays.fill(this.table, null);
        this.size = 0;
        while (this.queue.poll() != null) {
        }
    }

    public Set entrySet() {
        if (this.entrySet != null) {
            return this.entrySet;
        }
        this.entrySet = new AbstractSet(this){
            private final /* synthetic */ ReferenceMap this$0;
            {
                this.this$0 = this$0;
            }

            public int size() {
                return this.this$0.size();
            }

            public void clear() {
                this.this$0.clear();
            }

            public boolean contains(Object o2) {
                if (o2 == null) {
                    return false;
                }
                if (!(o2 instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry e2 = (Map.Entry)o2;
                Entry e22 = ReferenceMap.access$000(this.this$0, e2.getKey());
                return e22 != null && e2.equals(e22);
            }

            public boolean remove(Object o2) {
                boolean r2 = this.contains(o2);
                if (r2) {
                    Map.Entry e2 = (Map.Entry)o2;
                    this.this$0.remove(e2.getKey());
                }
                return r2;
            }

            public Iterator iterator() {
                return new EntryIterator(this.this$0);
            }

            public Object[] toArray() {
                return this.toArray(new Object[0]);
            }

            public Object[] toArray(Object[] arr) {
                ArrayList<DefaultMapEntry> list = new ArrayList<DefaultMapEntry>();
                Iterator iterator = this.iterator();
                while (iterator.hasNext()) {
                    Entry e2 = (Entry)iterator.next();
                    list.add(new DefaultMapEntry(e2.getKey(), e2.getValue()));
                }
                return list.toArray(arr);
            }
        };
        return this.entrySet;
    }

    public Set keySet() {
        if (this.keySet != null) {
            return this.keySet;
        }
        this.keySet = new AbstractSet(this){
            private final /* synthetic */ ReferenceMap this$0;
            {
                this.this$0 = this$0;
            }

            public int size() {
                return this.this$0.size();
            }

            public Iterator iterator() {
                return new KeyIterator(this.this$0, null);
            }

            public boolean contains(Object o2) {
                return this.this$0.containsKey(o2);
            }

            public boolean remove(Object o2) {
                Object r2 = this.this$0.remove(o2);
                return r2 != null;
            }

            public void clear() {
                this.this$0.clear();
            }

            public Object[] toArray() {
                return this.toArray(new Object[0]);
            }

            public Object[] toArray(Object[] array) {
                ArrayList<E> c2 = new ArrayList<E>(this.size());
                Iterator it = this.iterator();
                while (it.hasNext()) {
                    c2.add(it.next());
                }
                return c2.toArray(array);
            }
        };
        return this.keySet;
    }

    public Collection values() {
        if (this.values != null) {
            return this.values;
        }
        this.values = new AbstractCollection(this){
            private final /* synthetic */ ReferenceMap this$0;
            {
                this.this$0 = this$0;
            }

            public int size() {
                return this.this$0.size();
            }

            public void clear() {
                this.this$0.clear();
            }

            public Iterator iterator() {
                return new ValueIterator(this.this$0, null);
            }

            public Object[] toArray() {
                return this.toArray(new Object[0]);
            }

            public Object[] toArray(Object[] array) {
                ArrayList<E> c2 = new ArrayList<E>(this.size());
                Iterator it = this.iterator();
                while (it.hasNext()) {
                    c2.add(it.next());
                }
                return c2.toArray(array);
            }
        };
        return this.values;
    }

    static /* synthetic */ Entry access$000(ReferenceMap x0, Object x1) {
        return x0.getEntry(x1);
    }

    static /* synthetic */ int access$300(ReferenceMap x0) {
        return x0.keyType;
    }

    static /* synthetic */ int access$400(ReferenceMap x0) {
        return x0.valueType;
    }

    static /* synthetic */ Object access$500(ReferenceMap x0, int x1, Object x2, int x3) {
        return x0.toReference(x1, x2, x3);
    }

    static /* synthetic */ boolean access$600(ReferenceMap x0) {
        return x0.purgeValues;
    }

    static /* synthetic */ Entry[] access$700(ReferenceMap x0) {
        return x0.table;
    }

    static /* synthetic */ int access$800(ReferenceMap x0) {
        return x0.modCount;
    }
}

