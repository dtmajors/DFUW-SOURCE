/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.collection.CompositeCollection;
import org.apache.commons.collections.map.CompositeMap;
import org.apache.commons.collections.set.CompositeSet;

public class CompositeMap
implements Map {
    private Map[] composite;
    private MapMutator mutator;

    public CompositeMap() {
        this(new Map[0], null);
    }

    public CompositeMap(Map one, Map two) {
        this(new Map[]{one, two}, null);
    }

    public CompositeMap(Map one, Map two, MapMutator mutator) {
        this(new Map[]{one, two}, mutator);
    }

    public CompositeMap(Map[] composite) {
        this(composite, null);
    }

    public CompositeMap(Map[] composite, MapMutator mutator) {
        this.mutator = mutator;
        this.composite = new Map[0];
        int i = composite.length - 1;
        while (i >= 0) {
            this.addComposited(composite[i]);
            --i;
        }
    }

    public void setMutator(MapMutator mutator) {
        this.mutator = mutator;
    }

    public synchronized void addComposited(Map map) throws IllegalArgumentException {
        int i = this.composite.length - 1;
        while (i >= 0) {
            Collection intersect = CollectionUtils.intersection(this.composite[i].keySet(), map.keySet());
            if (intersect.size() != 0) {
                if (this.mutator == null) {
                    throw new IllegalArgumentException("Key collision adding Map to CompositeMap");
                }
                this.mutator.resolveCollision(this, this.composite[i], map, intersect);
            }
            --i;
        }
        Map[] temp = new Map[this.composite.length + 1];
        System.arraycopy(this.composite, 0, temp, 0, this.composite.length);
        temp[temp.length - 1] = map;
        this.composite = temp;
    }

    public synchronized Map removeComposited(Map map) {
        int size = this.composite.length;
        int i = 0;
        while (i < size) {
            if (this.composite[i].equals(map)) {
                Map[] temp = new Map[size - 1];
                System.arraycopy(this.composite, 0, temp, 0, i);
                System.arraycopy(this.composite, i + 1, temp, i, size - i - 1);
                this.composite = temp;
                return map;
            }
            ++i;
        }
        return null;
    }

    public void clear() {
        int i = this.composite.length - 1;
        while (i >= 0) {
            this.composite[i].clear();
            --i;
        }
    }

    public boolean containsKey(Object key) {
        int i = this.composite.length - 1;
        while (i >= 0) {
            if (this.composite[i].containsKey(key)) {
                return true;
            }
            --i;
        }
        return false;
    }

    public boolean containsValue(Object value) {
        int i = this.composite.length - 1;
        while (i >= 0) {
            if (this.composite[i].containsValue(value)) {
                return true;
            }
            --i;
        }
        return false;
    }

    public Set entrySet() {
        CompositeSet entries = new CompositeSet();
        int i = this.composite.length - 1;
        while (i >= 0) {
            entries.addComposited(this.composite[i].entrySet());
            --i;
        }
        return entries;
    }

    public Object get(Object key) {
        int i = this.composite.length - 1;
        while (i >= 0) {
            if (this.composite[i].containsKey(key)) {
                return this.composite[i].get(key);
            }
            --i;
        }
        return null;
    }

    public boolean isEmpty() {
        int i = this.composite.length - 1;
        while (i >= 0) {
            if (!this.composite[i].isEmpty()) {
                return false;
            }
            --i;
        }
        return true;
    }

    public Set keySet() {
        CompositeSet keys = new CompositeSet();
        int i = this.composite.length - 1;
        while (i >= 0) {
            keys.addComposited(this.composite[i].keySet());
            --i;
        }
        return keys;
    }

    public Object put(Object key, Object value) {
        if (this.mutator == null) {
            throw new UnsupportedOperationException("No mutator specified");
        }
        return this.mutator.put(this, this.composite, key, value);
    }

    public void putAll(Map map) {
        if (this.mutator == null) {
            throw new UnsupportedOperationException("No mutator specified");
        }
        this.mutator.putAll(this, this.composite, map);
    }

    public Object remove(Object key) {
        int i = this.composite.length - 1;
        while (i >= 0) {
            if (this.composite[i].containsKey(key)) {
                return this.composite[i].remove(key);
            }
            --i;
        }
        return null;
    }

    public int size() {
        int size = 0;
        int i = this.composite.length - 1;
        while (i >= 0) {
            size += this.composite[i].size();
            --i;
        }
        return size;
    }

    public Collection values() {
        CompositeCollection keys = new CompositeCollection();
        int i = this.composite.length - 1;
        while (i >= 0) {
            keys.addComposited(this.composite[i].values());
            --i;
        }
        return keys;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map)obj;
            return this.entrySet().equals(map.entrySet());
        }
        return false;
    }

    public int hashCode() {
        int code = 0;
        Iterator i = this.entrySet().iterator();
        while (i.hasNext()) {
            code += i.next().hashCode();
        }
        return code;
    }
}

