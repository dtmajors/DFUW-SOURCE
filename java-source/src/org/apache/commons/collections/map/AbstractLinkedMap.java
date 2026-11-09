/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.OrderedMap;
import org.apache.commons.collections.OrderedMapIterator;
import org.apache.commons.collections.iterators.EmptyOrderedIterator;
import org.apache.commons.collections.iterators.EmptyOrderedMapIterator;
import org.apache.commons.collections.map.AbstractHashedMap;
import org.apache.commons.collections.map.AbstractLinkedMap;

public class AbstractLinkedMap
extends AbstractHashedMap
implements OrderedMap {
    protected transient LinkEntry header;

    protected AbstractLinkedMap() {
    }

    protected AbstractLinkedMap(int initialCapacity, float loadFactor, int threshold) {
        super(initialCapacity, loadFactor, threshold);
    }

    protected AbstractLinkedMap(int initialCapacity) {
        super(initialCapacity);
    }

    protected AbstractLinkedMap(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    protected AbstractLinkedMap(Map map) {
        super(map);
    }

    protected void init() {
        this.header.before = this.header.after = (this.header = new LinkEntry(null, -1, null, null));
    }

    public boolean containsValue(Object value) {
        if (value == null) {
            LinkEntry entry = this.header.after;
            while (entry != this.header) {
                if (entry.getValue() == null) {
                    return true;
                }
                entry = entry.after;
            }
        } else {
            LinkEntry entry = this.header.after;
            while (entry != this.header) {
                if (this.isEqualValue(value, entry.getValue())) {
                    return true;
                }
                entry = entry.after;
            }
        }
        return false;
    }

    public void clear() {
        super.clear();
        this.header.before = this.header.after = this.header;
    }

    public Object firstKey() {
        if (this.size == 0) {
            throw new NoSuchElementException("Map is empty");
        }
        return this.header.after.getKey();
    }

    public Object lastKey() {
        if (this.size == 0) {
            throw new NoSuchElementException("Map is empty");
        }
        return this.header.before.getKey();
    }

    public Object nextKey(Object key) {
        LinkEntry entry = (LinkEntry)this.getEntry(key);
        return entry == null || entry.after == this.header ? null : entry.after.getKey();
    }

    public Object previousKey(Object key) {
        LinkEntry entry = (LinkEntry)this.getEntry(key);
        return entry == null || entry.before == this.header ? null : entry.before.getKey();
    }

    protected LinkEntry getEntry(int index) {
        LinkEntry entry;
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " is less than zero");
        }
        if (index >= this.size) {
            throw new IndexOutOfBoundsException("Index " + index + " is invalid for size " + this.size);
        }
        if (index < this.size / 2) {
            entry = this.header.after;
            int currentIndex = 0;
            while (currentIndex < index) {
                entry = entry.after;
                ++currentIndex;
            }
        } else {
            entry = this.header;
            int currentIndex = this.size;
            while (currentIndex > index) {
                entry = entry.before;
                --currentIndex;
            }
        }
        return entry;
    }

    protected void addEntry(AbstractHashedMap.HashEntry entry, int hashIndex) {
        LinkEntry link = (LinkEntry)entry;
        link.after = this.header;
        link.before = this.header.before;
        this.header.before.after = link;
        this.header.before = link;
        this.data[hashIndex] = entry;
    }

    protected AbstractHashedMap.HashEntry createEntry(AbstractHashedMap.HashEntry next, int hashCode, Object key, Object value) {
        return new LinkEntry(next, hashCode, key, value);
    }

    protected void removeEntry(AbstractHashedMap.HashEntry entry, int hashIndex, AbstractHashedMap.HashEntry previous) {
        LinkEntry link = (LinkEntry)entry;
        link.before.after = link.after;
        link.after.before = link.before;
        link.after = null;
        link.before = null;
        super.removeEntry(entry, hashIndex, previous);
    }

    protected LinkEntry entryBefore(LinkEntry entry) {
        return entry.before;
    }

    protected LinkEntry entryAfter(LinkEntry entry) {
        return entry.after;
    }

    public MapIterator mapIterator() {
        if (this.size == 0) {
            return EmptyOrderedMapIterator.INSTANCE;
        }
        return new LinkMapIterator(this);
    }

    public OrderedMapIterator orderedMapIterator() {
        if (this.size == 0) {
            return EmptyOrderedMapIterator.INSTANCE;
        }
        return new LinkMapIterator(this);
    }

    protected Iterator createEntrySetIterator() {
        if (this.size() == 0) {
            return EmptyOrderedIterator.INSTANCE;
        }
        return new EntrySetIterator(this);
    }

    protected Iterator createKeySetIterator() {
        if (this.size() == 0) {
            return EmptyOrderedIterator.INSTANCE;
        }
        return new KeySetIterator(this);
    }

    protected Iterator createValuesIterator() {
        if (this.size() == 0) {
            return EmptyOrderedIterator.INSTANCE;
        }
        return new ValuesIterator(this);
    }
}

