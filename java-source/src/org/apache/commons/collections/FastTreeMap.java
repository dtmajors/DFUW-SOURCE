/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections.FastTreeMap;

public class FastTreeMap
extends TreeMap {
    protected TreeMap map = null;
    protected boolean fast = false;

    public FastTreeMap() {
        this.map = new TreeMap();
    }

    public FastTreeMap(Comparator comparator) {
        this.map = new TreeMap(comparator);
    }

    public FastTreeMap(Map map) {
        this.map = new TreeMap(map);
    }

    public FastTreeMap(SortedMap map) {
        this.map = new TreeMap(map);
    }

    public boolean getFast() {
        return this.fast;
    }

    public void setFast(boolean fast) {
        this.fast = fast;
    }

    public Object get(Object key) {
        if (this.fast) {
            return this.map.get(key);
        }
        TreeMap treeMap = this.map;
        synchronized (treeMap) {
            Object v = this.map.get(key);
            return v;
        }
    }

    public int size() {
        if (this.fast) {
            return this.map.size();
        }
        TreeMap treeMap = this.map;
        synchronized (treeMap) {
            int n2 = this.map.size();
            return n2;
        }
    }

    public boolean isEmpty() {
        if (this.fast) {
            return this.map.isEmpty();
        }
        TreeMap treeMap = this.map;
        synchronized (treeMap) {
            boolean bl = this.map.isEmpty();
            return bl;
        }
    }

    public boolean containsKey(Object key) {
        if (this.fast) {
            return this.map.containsKey(key);
        }
        TreeMap treeMap = this.map;
        synchronized (treeMap) {
            boolean bl = this.map.containsKey(key);
            return bl;
        }
    }

    public boolean containsValue(Object value) {
        if (this.fast) {
            return this.map.containsValue(value);
        }
        TreeMap treeMap = this.map;
        synchronized (treeMap) {
            boolean bl = this.map.containsValue(value);
            return bl;
        }
    }

    public Comparator comparator() {
        if (this.fast) {
            return this.map.comparator();
        }
        TreeMap treeMap = this.map;
        synchronized (treeMap) {
            Comparator comparator = this.map.comparator();
            return comparator;
        }
    }

    public Object firstKey() {
        if (this.fast) {
            return this.map.firstKey();
        }
        TreeMap treeMap = this.map;
        synchronized (treeMap) {
            Object k = this.map.firstKey();
            return k;
        }
    }

    public Object lastKey() {
        if (this.fast) {
            return this.map.lastKey();
        }
        TreeMap treeMap = this.map;
        synchronized (treeMap) {
            Object k = this.map.lastKey();
            return k;
        }
    }

    public Object put(Object key, Object value) {
        if (this.fast) {
            FastTreeMap fastTreeMap = this;
            synchronized (fastTreeMap) {
                TreeMap temp = (TreeMap)this.map.clone();
                Object result = temp.put(key, value);
                this.map = temp;
                Object object = result;
                return object;
            }
        }
        TreeMap treeMap = this.map;
        synchronized (treeMap) {
            Object object = this.map.put(key, value);
            return object;
        }
    }

    public void putAll(Map in) {
        if (this.fast) {
            FastTreeMap fastTreeMap = this;
            synchronized (fastTreeMap) {
                TreeMap temp = (TreeMap)this.map.clone();
                temp.putAll(in);
                this.map = temp;
            }
        }
        TreeMap treeMap = this.map;
        synchronized (treeMap) {
            this.map.putAll(in);
        }
    }

    public Object remove(Object key) {
        if (this.fast) {
            FastTreeMap fastTreeMap = this;
            synchronized (fastTreeMap) {
                TreeMap temp = (TreeMap)this.map.clone();
                Object result = temp.remove(key);
                this.map = temp;
                Object v = result;
                return v;
            }
        }
        TreeMap treeMap = this.map;
        synchronized (treeMap) {
            Object v = this.map.remove(key);
            return v;
        }
    }

    public void clear() {
        if (this.fast) {
            FastTreeMap fastTreeMap = this;
            synchronized (fastTreeMap) {
                this.map = new TreeMap();
            }
        }
        TreeMap treeMap = this.map;
        synchronized (treeMap) {
            this.map.clear();
        }
    }

    public boolean equals(Object o2) {
        if (o2 == this) {
            return true;
        }
        if (!(o2 instanceof Map)) {
            return false;
        }
        Map mo = (Map)o2;
        if (this.fast) {
            if (mo.size() != this.map.size()) {
                return false;
            }
            Iterator i = this.map.entrySet().iterator();
            while (i.hasNext()) {
                Map.Entry e2 = i.next();
                Object key = e2.getKey();
                Object value = e2.getValue();
                if (!(value == null ? mo.get(key) != null || !mo.containsKey(key) : !value.equals(mo.get(key)))) continue;
                return false;
            }
            return true;
        }
        TreeMap treeMap = this.map;
        synchronized (treeMap) {
            if (mo.size() != this.map.size()) {
                boolean e2 = false;
                return e2;
            }
            Iterator i = this.map.entrySet().iterator();
            while (i.hasNext()) {
                Map.Entry e3 = i.next();
                Object key = e3.getKey();
                Object value = e3.getValue();
                if (value == null) {
                    if (mo.get(key) == null && mo.containsKey(key)) continue;
                    boolean bl = false;
                    return bl;
                }
                if (value.equals(mo.get(key))) continue;
                boolean bl = false;
                return bl;
            }
            boolean bl = true;
            return bl;
        }
    }

    public int hashCode() {
        if (this.fast) {
            int h = 0;
            Iterator i = this.map.entrySet().iterator();
            while (i.hasNext()) {
                h += ((Object)i.next()).hashCode();
            }
            return h;
        }
        TreeMap treeMap = this.map;
        synchronized (treeMap) {
            int h = 0;
            Iterator i = this.map.entrySet().iterator();
            while (i.hasNext()) {
                h += ((Object)i.next()).hashCode();
            }
            int n2 = h;
            return n2;
        }
    }

    public Object clone() {
        FastTreeMap results = null;
        if (this.fast) {
            results = new FastTreeMap((SortedMap)this.map);
        } else {
            TreeMap treeMap = this.map;
            synchronized (treeMap) {
                results = new FastTreeMap((SortedMap)this.map);
            }
        }
        results.setFast(this.getFast());
        return results;
    }

    public SortedMap headMap(Object key) {
        if (this.fast) {
            return this.map.headMap(key);
        }
        TreeMap treeMap = this.map;
        synchronized (treeMap) {
            SortedMap sortedMap = this.map.headMap(key);
            return sortedMap;
        }
    }

    public SortedMap subMap(Object fromKey, Object toKey) {
        if (this.fast) {
            return this.map.subMap(fromKey, toKey);
        }
        TreeMap treeMap = this.map;
        synchronized (treeMap) {
            SortedMap sortedMap = this.map.subMap(fromKey, toKey);
            return sortedMap;
        }
    }

    public SortedMap tailMap(Object key) {
        if (this.fast) {
            return this.map.tailMap(key);
        }
        TreeMap treeMap = this.map;
        synchronized (treeMap) {
            SortedMap sortedMap = this.map.tailMap(key);
            return sortedMap;
        }
    }

    public Set entrySet() {
        return new EntrySet(this, null);
    }

    public Set keySet() {
        return new KeySet(this, null);
    }

    public Collection values() {
        return new Values(this, null);
    }
}

