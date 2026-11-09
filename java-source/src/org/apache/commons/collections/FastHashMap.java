/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections.FastHashMap;

public class FastHashMap
extends HashMap {
    protected HashMap map = null;
    protected boolean fast = false;

    public FastHashMap() {
        this.map = new HashMap();
    }

    public FastHashMap(int capacity) {
        this.map = new HashMap(capacity);
    }

    public FastHashMap(int capacity, float factor) {
        this.map = new HashMap(capacity, factor);
    }

    public FastHashMap(Map map) {
        this.map = new HashMap(map);
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
        HashMap hashMap = this.map;
        synchronized (hashMap) {
            Object v = this.map.get(key);
            return v;
        }
    }

    public int size() {
        if (this.fast) {
            return this.map.size();
        }
        HashMap hashMap = this.map;
        synchronized (hashMap) {
            int n2 = this.map.size();
            return n2;
        }
    }

    public boolean isEmpty() {
        if (this.fast) {
            return this.map.isEmpty();
        }
        HashMap hashMap = this.map;
        synchronized (hashMap) {
            boolean bl = this.map.isEmpty();
            return bl;
        }
    }

    public boolean containsKey(Object key) {
        if (this.fast) {
            return this.map.containsKey(key);
        }
        HashMap hashMap = this.map;
        synchronized (hashMap) {
            boolean bl = this.map.containsKey(key);
            return bl;
        }
    }

    public boolean containsValue(Object value) {
        if (this.fast) {
            return this.map.containsValue(value);
        }
        HashMap hashMap = this.map;
        synchronized (hashMap) {
            boolean bl = this.map.containsValue(value);
            return bl;
        }
    }

    public Object put(Object key, Object value) {
        if (this.fast) {
            FastHashMap fastHashMap = this;
            synchronized (fastHashMap) {
                HashMap temp = (HashMap)this.map.clone();
                Object result = temp.put(key, value);
                this.map = temp;
                Object object = result;
                return object;
            }
        }
        HashMap hashMap = this.map;
        synchronized (hashMap) {
            Object object = this.map.put(key, value);
            return object;
        }
    }

    public void putAll(Map in) {
        if (this.fast) {
            FastHashMap fastHashMap = this;
            synchronized (fastHashMap) {
                HashMap temp = (HashMap)this.map.clone();
                temp.putAll(in);
                this.map = temp;
            }
        }
        HashMap hashMap = this.map;
        synchronized (hashMap) {
            this.map.putAll(in);
        }
    }

    public Object remove(Object key) {
        if (this.fast) {
            FastHashMap fastHashMap = this;
            synchronized (fastHashMap) {
                HashMap temp = (HashMap)this.map.clone();
                Object result = temp.remove(key);
                this.map = temp;
                Object v = result;
                return v;
            }
        }
        HashMap hashMap = this.map;
        synchronized (hashMap) {
            Object v = this.map.remove(key);
            return v;
        }
    }

    public void clear() {
        if (this.fast) {
            FastHashMap fastHashMap = this;
            synchronized (fastHashMap) {
                this.map = new HashMap();
            }
        }
        HashMap hashMap = this.map;
        synchronized (hashMap) {
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
        HashMap hashMap = this.map;
        synchronized (hashMap) {
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
        HashMap hashMap = this.map;
        synchronized (hashMap) {
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
        FastHashMap results = null;
        if (this.fast) {
            results = new FastHashMap((Map)this.map);
        } else {
            HashMap hashMap = this.map;
            synchronized (hashMap) {
                results = new FastHashMap((Map)this.map);
            }
        }
        results.setFast(this.getFast());
        return results;
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

