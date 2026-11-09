/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.bidimap;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.bidimap.AbstractDualBidiMap;

public abstract class AbstractDualBidiMap
implements BidiMap {
    protected final transient Map[] maps = new Map[2];
    protected transient BidiMap inverseBidiMap = null;
    protected transient Set keySet = null;
    protected transient Collection values = null;
    protected transient Set entrySet = null;

    protected AbstractDualBidiMap() {
        this.maps[0] = this.createMap();
        this.maps[1] = this.createMap();
    }

    protected AbstractDualBidiMap(Map normalMap, Map reverseMap) {
        this.maps[0] = normalMap;
        this.maps[1] = reverseMap;
    }

    protected AbstractDualBidiMap(Map normalMap, Map reverseMap, BidiMap inverseBidiMap) {
        this.maps[0] = normalMap;
        this.maps[1] = reverseMap;
        this.inverseBidiMap = inverseBidiMap;
    }

    protected Map createMap() {
        return null;
    }

    protected abstract BidiMap createBidiMap(Map var1, Map var2, BidiMap var3);

    public Object get(Object key) {
        return this.maps[0].get(key);
    }

    public int size() {
        return this.maps[0].size();
    }

    public boolean isEmpty() {
        return this.maps[0].isEmpty();
    }

    public boolean containsKey(Object key) {
        return this.maps[0].containsKey(key);
    }

    public boolean equals(Object obj) {
        return this.maps[0].equals(obj);
    }

    public int hashCode() {
        return this.maps[0].hashCode();
    }

    public String toString() {
        return this.maps[0].toString();
    }

    public Object put(Object key, Object value) {
        if (this.maps[0].containsKey(key)) {
            this.maps[1].remove(this.maps[0].get(key));
        }
        if (this.maps[1].containsKey(value)) {
            this.maps[0].remove(this.maps[1].get(value));
        }
        Object obj = this.maps[0].put(key, value);
        this.maps[1].put(value, key);
        return obj;
    }

    public void putAll(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = it.next();
            this.put(entry.getKey(), entry.getValue());
        }
    }

    public Object remove(Object key) {
        Object value = null;
        if (this.maps[0].containsKey(key)) {
            value = this.maps[0].remove(key);
            this.maps[1].remove(value);
        }
        return value;
    }

    public void clear() {
        this.maps[0].clear();
        this.maps[1].clear();
    }

    public boolean containsValue(Object value) {
        return this.maps[1].containsKey(value);
    }

    public MapIterator mapIterator() {
        return new BidiMapIterator(this);
    }

    public Object getKey(Object value) {
        return this.maps[1].get(value);
    }

    public Object removeValue(Object value) {
        Object key = null;
        if (this.maps[1].containsKey(value)) {
            key = this.maps[1].remove(value);
            this.maps[0].remove(key);
        }
        return key;
    }

    public BidiMap inverseBidiMap() {
        if (this.inverseBidiMap == null) {
            this.inverseBidiMap = this.createBidiMap(this.maps[1], this.maps[0], this);
        }
        return this.inverseBidiMap;
    }

    public Set keySet() {
        if (this.keySet == null) {
            this.keySet = new KeySet(this);
        }
        return this.keySet;
    }

    protected Iterator createKeySetIterator(Iterator iterator) {
        return new KeySetIterator(iterator, this);
    }

    public Collection values() {
        if (this.values == null) {
            this.values = new Values(this);
        }
        return this.values;
    }

    protected Iterator createValuesIterator(Iterator iterator) {
        return new ValuesIterator(iterator, this);
    }

    public Set entrySet() {
        if (this.entrySet == null) {
            this.entrySet = new EntrySet(this);
        }
        return this.entrySet;
    }

    protected Iterator createEntrySetIterator(Iterator iterator) {
        return new EntrySetIterator(iterator, this);
    }
}

