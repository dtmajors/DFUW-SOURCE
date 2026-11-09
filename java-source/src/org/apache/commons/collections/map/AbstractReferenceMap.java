/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.map.AbstractHashedMap;
import org.apache.commons.collections.map.AbstractReferenceMap;

public abstract class AbstractReferenceMap
extends AbstractHashedMap {
    public static final int HARD = 0;
    public static final int SOFT = 1;
    public static final int WEAK = 2;
    protected int keyType;
    protected int valueType;
    protected boolean purgeValues;
    private transient ReferenceQueue queue;

    protected AbstractReferenceMap() {
    }

    protected AbstractReferenceMap(int keyType, int valueType, int capacity, float loadFactor, boolean purgeValues) {
        super(capacity, loadFactor);
        AbstractReferenceMap.verify("keyType", keyType);
        AbstractReferenceMap.verify("valueType", valueType);
        this.keyType = keyType;
        this.valueType = valueType;
        this.purgeValues = purgeValues;
    }

    protected void init() {
        this.queue = new ReferenceQueue();
    }

    private static void verify(String name, int type) {
        if (type < 0 || type > 2) {
            throw new IllegalArgumentException(name + " must be HARD, SOFT, WEAK.");
        }
    }

    public int size() {
        this.purgeBeforeRead();
        return super.size();
    }

    public boolean isEmpty() {
        this.purgeBeforeRead();
        return super.isEmpty();
    }

    public boolean containsKey(Object key) {
        this.purgeBeforeRead();
        AbstractHashedMap.HashEntry entry = this.getEntry(key);
        if (entry == null) {
            return false;
        }
        return entry.getValue() != null;
    }

    public boolean containsValue(Object value) {
        this.purgeBeforeRead();
        if (value == null) {
            return false;
        }
        return super.containsValue(value);
    }

    public Object get(Object key) {
        this.purgeBeforeRead();
        AbstractHashedMap.HashEntry entry = this.getEntry(key);
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
        this.purgeBeforeWrite();
        return super.put(key, value);
    }

    public Object remove(Object key) {
        if (key == null) {
            return null;
        }
        this.purgeBeforeWrite();
        return super.remove(key);
    }

    public void clear() {
        super.clear();
        while (this.queue.poll() != null) {
        }
    }

    public MapIterator mapIterator() {
        return new ReferenceMapIterator(this);
    }

    public Set entrySet() {
        if (this.entrySet == null) {
            this.entrySet = new ReferenceEntrySet(this);
        }
        return this.entrySet;
    }

    public Set keySet() {
        if (this.keySet == null) {
            this.keySet = new ReferenceKeySet(this);
        }
        return this.keySet;
    }

    public Collection values() {
        if (this.values == null) {
            this.values = new ReferenceValues(this);
        }
        return this.values;
    }

    protected void purgeBeforeRead() {
        this.purge();
    }

    protected void purgeBeforeWrite() {
        this.purge();
    }

    protected void purge() {
        Reference ref = this.queue.poll();
        while (ref != null) {
            this.purge(ref);
            ref = this.queue.poll();
        }
    }

    protected void purge(Reference ref) {
        int hash = ref.hashCode();
        int index = this.hashIndex(hash, this.data.length);
        AbstractHashedMap.HashEntry previous = null;
        AbstractHashedMap.HashEntry entry = this.data[index];
        while (entry != null) {
            if (((ReferenceEntry)entry).purge(ref)) {
                if (previous == null) {
                    this.data[index] = entry.next;
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

    protected AbstractHashedMap.HashEntry getEntry(Object key) {
        if (key == null) {
            return null;
        }
        return super.getEntry(key);
    }

    protected int hashEntry(Object key, Object value) {
        return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
    }

    protected boolean isEqualKey(Object key1, Object key2) {
        key2 = this.keyType > 0 ? ((Reference)key2).get() : key2;
        return key1 == key2 || key1.equals(key2);
    }

    protected AbstractHashedMap.HashEntry createEntry(AbstractHashedMap.HashEntry next, int hashCode, Object key, Object value) {
        return new ReferenceEntry(this, next, hashCode, key, value);
    }

    protected Iterator createEntrySetIterator() {
        return new ReferenceEntrySetIterator(this);
    }

    protected Iterator createKeySetIterator() {
        return new ReferenceKeySetIterator(this);
    }

    protected Iterator createValuesIterator() {
        return new ReferenceValuesIterator(this);
    }

    protected void doWriteObject(ObjectOutputStream out) throws IOException {
        out.writeInt(this.keyType);
        out.writeInt(this.valueType);
        out.writeBoolean(this.purgeValues);
        out.writeFloat(this.loadFactor);
        out.writeInt(this.data.length);
        MapIterator it = this.mapIterator();
        while (it.hasNext()) {
            out.writeObject(it.next());
            out.writeObject(it.getValue());
        }
        out.writeObject(null);
    }

    protected void doReadObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        Object key;
        this.keyType = in.readInt();
        this.valueType = in.readInt();
        this.purgeValues = in.readBoolean();
        this.loadFactor = in.readFloat();
        int capacity = in.readInt();
        this.init();
        this.data = new AbstractHashedMap.HashEntry[capacity];
        while ((key = in.readObject()) != null) {
            Object value = in.readObject();
            this.put(key, value);
        }
        this.threshold = this.calculateThreshold(this.data.length, this.loadFactor);
    }

    static /* synthetic */ ReferenceQueue access$000(AbstractReferenceMap x0) {
        return x0.queue;
    }
}

