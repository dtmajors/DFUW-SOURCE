/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.OrderedMap;
import org.apache.commons.collections.OrderedMapIterator;
import org.apache.commons.collections.list.UnmodifiableList;
import org.apache.commons.collections.map.AbstractMapDecorator;
import org.apache.commons.collections.map.ListOrderedMap;

public class ListOrderedMap
extends AbstractMapDecorator
implements OrderedMap,
Serializable {
    private static final long serialVersionUID = 2728177751851003750L;
    protected final List insertOrder = new ArrayList();

    public static OrderedMap decorate(Map map) {
        return new ListOrderedMap(map);
    }

    public ListOrderedMap() {
        this(new HashMap());
    }

    protected ListOrderedMap(Map map) {
        super(map);
        this.insertOrder.addAll(this.getMap().keySet());
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(this.map);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.map = (Map)in.readObject();
    }

    public MapIterator mapIterator() {
        return this.orderedMapIterator();
    }

    public OrderedMapIterator orderedMapIterator() {
        return new ListOrderedMapIterator(this);
    }

    public Object firstKey() {
        if (this.size() == 0) {
            throw new NoSuchElementException("Map is empty");
        }
        return this.insertOrder.get(0);
    }

    public Object lastKey() {
        if (this.size() == 0) {
            throw new NoSuchElementException("Map is empty");
        }
        return this.insertOrder.get(this.size() - 1);
    }

    public Object nextKey(Object key) {
        int index = this.insertOrder.indexOf(key);
        if (index >= 0 && index < this.size() - 1) {
            return this.insertOrder.get(index + 1);
        }
        return null;
    }

    public Object previousKey(Object key) {
        int index = this.insertOrder.indexOf(key);
        if (index > 0) {
            return this.insertOrder.get(index - 1);
        }
        return null;
    }

    public Object put(Object key, Object value) {
        if (this.getMap().containsKey(key)) {
            return this.getMap().put(key, value);
        }
        Object result = this.getMap().put(key, value);
        this.insertOrder.add(key);
        return result;
    }

    public void putAll(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = it.next();
            this.put(entry.getKey(), entry.getValue());
        }
    }

    public Object remove(Object key) {
        Object result = this.getMap().remove(key);
        this.insertOrder.remove(key);
        return result;
    }

    public void clear() {
        this.getMap().clear();
        this.insertOrder.clear();
    }

    public Set keySet() {
        return new KeySetView(this);
    }

    public Collection values() {
        return new ValuesView(this);
    }

    public Set entrySet() {
        return new EntrySetView(this, this.insertOrder);
    }

    public String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        StringBuffer buf = new StringBuffer();
        buf.append('{');
        boolean first = true;
        Iterator it = this.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (first) {
                first = false;
            } else {
                buf.append(", ");
            }
            buf.append((Object)(key == this ? "(this Map)" : key));
            buf.append('=');
            buf.append((Object)(value == this ? "(this Map)" : value));
        }
        buf.append('}');
        return buf.toString();
    }

    public Object get(int index) {
        return this.insertOrder.get(index);
    }

    public Object getValue(int index) {
        return this.get(this.insertOrder.get(index));
    }

    public int indexOf(Object key) {
        return this.insertOrder.indexOf(key);
    }

    public Object remove(int index) {
        return this.remove(this.get(index));
    }

    public List asList() {
        return UnmodifiableList.decorate(this.insertOrder);
    }
}

