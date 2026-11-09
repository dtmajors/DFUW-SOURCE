/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.map;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections.BoundedMap;
import org.apache.commons.collections.KeyValue;
import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.OrderedMap;
import org.apache.commons.collections.OrderedMapIterator;
import org.apache.commons.collections.keyvalue.TiedMapEntry;
import org.apache.commons.collections.map.SingletonMap;

public class SingletonMap
implements OrderedMap,
BoundedMap,
KeyValue,
Serializable,
Cloneable {
    private static final long serialVersionUID = -8931271118676803261L;
    private final Object key;
    private Object value;

    public SingletonMap() {
        this.key = null;
    }

    public SingletonMap(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public SingletonMap(KeyValue keyValue) {
        this.key = keyValue.getKey();
        this.value = keyValue.getValue();
    }

    public SingletonMap(Map.Entry entry) {
        this.key = entry.getKey();
        this.value = entry.getValue();
    }

    public SingletonMap(Map map) {
        if (map.size() != 1) {
            throw new IllegalArgumentException("The map size must be 1");
        }
        Map.Entry entry = map.entrySet().iterator().next();
        this.key = entry.getKey();
        this.value = entry.getValue();
    }

    public Object getKey() {
        return this.key;
    }

    public Object getValue() {
        return this.value;
    }

    public Object setValue(Object value) {
        Object old = this.value;
        this.value = value;
        return old;
    }

    public boolean isFull() {
        return true;
    }

    public int maxSize() {
        return 1;
    }

    public Object get(Object key) {
        if (this.isEqualKey(key)) {
            return this.value;
        }
        return null;
    }

    public int size() {
        return 1;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean containsKey(Object key) {
        return this.isEqualKey(key);
    }

    public boolean containsValue(Object value) {
        return this.isEqualValue(value);
    }

    public Object put(Object key, Object value) {
        if (this.isEqualKey(key)) {
            return this.setValue(value);
        }
        throw new IllegalArgumentException("Cannot put new key/value pair - Map is fixed size singleton");
    }

    public void putAll(Map map) {
        switch (map.size()) {
            case 0: {
                return;
            }
            case 1: {
                Map.Entry entry = map.entrySet().iterator().next();
                this.put(entry.getKey(), entry.getValue());
                return;
            }
        }
        throw new IllegalArgumentException("The map size must be 0 or 1");
    }

    public Object remove(Object key) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    public Set entrySet() {
        TiedMapEntry entry = new TiedMapEntry(this, this.getKey());
        return Collections.singleton(entry);
    }

    public Set keySet() {
        return Collections.singleton(this.key);
    }

    public Collection values() {
        return new SingletonValues(this);
    }

    public MapIterator mapIterator() {
        return new SingletonMapIterator(this);
    }

    public OrderedMapIterator orderedMapIterator() {
        return new SingletonMapIterator(this);
    }

    public Object firstKey() {
        return this.getKey();
    }

    public Object lastKey() {
        return this.getKey();
    }

    public Object nextKey(Object key) {
        return null;
    }

    public Object previousKey(Object key) {
        return null;
    }

    protected boolean isEqualKey(Object key) {
        return key == null ? this.getKey() == null : key.equals(this.getKey());
    }

    protected boolean isEqualValue(Object value) {
        return value == null ? this.getValue() == null : value.equals(this.getValue());
    }

    /*
     * WARNING - void declaration
     */
    public Object clone() {
        try {
            void ex;
            SingletonMap cloned = (SingletonMap)super.clone();
            return ex;
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError();
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
        if (other.size() != 1) {
            return false;
        }
        Map.Entry entry = other.entrySet().iterator().next();
        return this.isEqualKey(entry.getKey()) && this.isEqualValue(entry.getValue());
    }

    public int hashCode() {
        return (this.getKey() == null ? 0 : this.getKey().hashCode()) ^ (this.getValue() == null ? 0 : this.getValue().hashCode());
    }

    public String toString() {
        return new StringBuffer(128).append('{').append(this.getKey() == this ? "(this Map)" : this.getKey()).append('=').append(this.getValue() == this ? "(this Map)" : this.getValue()).append('}').toString();
    }
}

