/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.bidimap;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.OrderedBidiMap;
import org.apache.commons.collections.OrderedMap;
import org.apache.commons.collections.OrderedMapIterator;
import org.apache.commons.collections.SortedBidiMap;
import org.apache.commons.collections.bidimap.AbstractDualBidiMap;
import org.apache.commons.collections.bidimap.DualTreeBidiMap;

public class DualTreeBidiMap
extends AbstractDualBidiMap
implements SortedBidiMap,
Serializable {
    private static final long serialVersionUID = 721969328361809L;
    protected final Comparator comparator;

    public DualTreeBidiMap() {
        super(new TreeMap(), new TreeMap());
        this.comparator = null;
    }

    public DualTreeBidiMap(Map map) {
        super(new TreeMap(), new TreeMap());
        this.putAll(map);
        this.comparator = null;
    }

    public DualTreeBidiMap(Comparator comparator) {
        super(new TreeMap(comparator), new TreeMap(comparator));
        this.comparator = comparator;
    }

    protected DualTreeBidiMap(Map normalMap, Map reverseMap, BidiMap inverseBidiMap) {
        super(normalMap, reverseMap, inverseBidiMap);
        this.comparator = ((SortedMap)normalMap).comparator();
    }

    protected BidiMap createBidiMap(Map normalMap, Map reverseMap, BidiMap inverseMap) {
        return new DualTreeBidiMap(normalMap, reverseMap, inverseMap);
    }

    public Comparator comparator() {
        return ((SortedMap)this.maps[0]).comparator();
    }

    public Object firstKey() {
        return ((SortedMap)this.maps[0]).firstKey();
    }

    public Object lastKey() {
        return ((SortedMap)this.maps[0]).lastKey();
    }

    public Object nextKey(Object key) {
        if (this.isEmpty()) {
            return null;
        }
        if (this.maps[0] instanceof OrderedMap) {
            return ((OrderedMap)this.maps[0]).nextKey(key);
        }
        SortedMap sm = (SortedMap)this.maps[0];
        Iterator it = sm.tailMap(key).keySet().iterator();
        it.next();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public Object previousKey(Object key) {
        if (this.isEmpty()) {
            return null;
        }
        if (this.maps[0] instanceof OrderedMap) {
            return ((OrderedMap)this.maps[0]).previousKey(key);
        }
        SortedMap sm = (SortedMap)this.maps[0];
        SortedMap hm = sm.headMap(key);
        if (hm.isEmpty()) {
            return null;
        }
        return hm.lastKey();
    }

    public OrderedMapIterator orderedMapIterator() {
        return new BidiOrderedMapIterator(this);
    }

    public SortedBidiMap inverseSortedBidiMap() {
        return (SortedBidiMap)this.inverseBidiMap();
    }

    public OrderedBidiMap inverseOrderedBidiMap() {
        return (OrderedBidiMap)this.inverseBidiMap();
    }

    public SortedMap headMap(Object toKey) {
        SortedMap sub = ((SortedMap)this.maps[0]).headMap(toKey);
        return new ViewMap(this, sub);
    }

    public SortedMap tailMap(Object fromKey) {
        SortedMap sub = ((SortedMap)this.maps[0]).tailMap(fromKey);
        return new ViewMap(this, sub);
    }

    public SortedMap subMap(Object fromKey, Object toKey) {
        SortedMap sub = ((SortedMap)this.maps[0]).subMap(fromKey, toKey);
        return new ViewMap(this, sub);
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(this.maps[0]);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.maps[0] = new TreeMap(this.comparator);
        this.maps[1] = new TreeMap(this.comparator);
        Map map = (Map)in.readObject();
        this.putAll(map);
    }
}

