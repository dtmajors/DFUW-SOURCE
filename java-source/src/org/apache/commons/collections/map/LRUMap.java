/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import org.apache.commons.collections.BoundedMap;
import org.apache.commons.collections.map.AbstractHashedMap;
import org.apache.commons.collections.map.AbstractLinkedMap;

public class LRUMap
extends AbstractLinkedMap
implements BoundedMap,
Serializable,
Cloneable {
    static final long serialVersionUID = -612114643488955218L;
    protected static final int DEFAULT_MAX_SIZE = 100;
    private transient int maxSize;
    private boolean scanUntilRemovable;

    public LRUMap() {
        this(100, 0.75f, false);
    }

    public LRUMap(int maxSize) {
        this(maxSize, 0.75f);
    }

    public LRUMap(int maxSize, boolean scanUntilRemovable) {
        this(maxSize, 0.75f, scanUntilRemovable);
    }

    public LRUMap(int maxSize, float loadFactor) {
        this(maxSize, loadFactor, false);
    }

    public LRUMap(int maxSize, float loadFactor, boolean scanUntilRemovable) {
        super(maxSize < 1 ? 16 : maxSize, loadFactor);
        if (maxSize < 1) {
            throw new IllegalArgumentException("LRUMap max size must be greater than 0");
        }
        this.maxSize = maxSize;
        this.scanUntilRemovable = scanUntilRemovable;
    }

    public LRUMap(Map map) {
        this(map, false);
    }

    public LRUMap(Map map, boolean scanUntilRemovable) {
        this(map.size(), 0.75f, scanUntilRemovable);
        this.putAll(map);
    }

    public Object get(Object key) {
        AbstractLinkedMap.LinkEntry entry = (AbstractLinkedMap.LinkEntry)this.getEntry(key);
        if (entry == null) {
            return null;
        }
        this.moveToMRU(entry);
        return entry.getValue();
    }

    protected void moveToMRU(AbstractLinkedMap.LinkEntry entry) {
        if (entry.after != this.header) {
            ++this.modCount;
            entry.before.after = entry.after;
            entry.after.before = entry.before;
            entry.after = this.header;
            entry.before = this.header.before;
            this.header.before.after = entry;
            this.header.before = entry;
        }
    }

    protected void updateEntry(AbstractHashedMap.HashEntry entry, Object newValue) {
        this.moveToMRU((AbstractLinkedMap.LinkEntry)entry);
        entry.setValue(newValue);
    }

    protected void addMapping(int hashIndex, int hashCode, Object key, Object value) {
        if (this.isFull()) {
            AbstractLinkedMap.LinkEntry reuse = this.header.after;
            boolean removeLRUEntry = false;
            if (this.scanUntilRemovable) {
                while (reuse != this.header) {
                    if (this.removeLRU(reuse)) {
                        removeLRUEntry = true;
                        break;
                    }
                    reuse = reuse.after;
                }
            } else {
                removeLRUEntry = this.removeLRU(reuse);
            }
            if (removeLRUEntry) {
                this.reuseMapping(reuse, hashIndex, hashCode, key, value);
            } else {
                super.addMapping(hashIndex, hashCode, key, value);
            }
        } else {
            super.addMapping(hashIndex, hashCode, key, value);
        }
    }

    protected void reuseMapping(AbstractLinkedMap.LinkEntry entry, int hashIndex, int hashCode, Object key, Object value) {
        int removeIndex = this.hashIndex(entry.hashCode, this.data.length);
        AbstractHashedMap.HashEntry loop = this.data[removeIndex];
        AbstractHashedMap.HashEntry previous = null;
        while (loop != entry) {
            previous = loop;
            loop = loop.next;
        }
        ++this.modCount;
        this.removeEntry(entry, removeIndex, previous);
        this.reuseEntry(entry, hashIndex, hashCode, key, value);
        this.addEntry(entry, hashIndex);
    }

    protected boolean removeLRU(AbstractLinkedMap.LinkEntry entry) {
        return true;
    }

    public boolean isFull() {
        return this.size >= this.maxSize;
    }

    public int maxSize() {
        return this.maxSize;
    }

    public boolean isScanUntilRemovable() {
        return this.scanUntilRemovable;
    }

    public Object clone() {
        return super.clone();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        this.doWriteObject(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.doReadObject(in);
    }

    protected void doWriteObject(ObjectOutputStream out) throws IOException {
        out.writeInt(this.maxSize);
        super.doWriteObject(out);
    }

    protected void doReadObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        this.maxSize = in.readInt();
        super.doReadObject(in);
    }
}

