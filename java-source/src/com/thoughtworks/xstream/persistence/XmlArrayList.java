/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.persistence;

import com.thoughtworks.xstream.persistence.StreamStrategy;
import com.thoughtworks.xstream.persistence.XmlMap;
import java.util.AbstractList;

public class XmlArrayList
extends AbstractList {
    private final XmlMap map;

    public XmlArrayList(StreamStrategy streamStrategy) {
        this.map = new XmlMap(streamStrategy);
    }

    public int size() {
        return this.map.size();
    }

    public Object set(int index, Object element) {
        this.rangeCheck(index);
        Object value = this.get(index);
        this.map.put(String.valueOf(index), element);
        return value;
    }

    public void add(int index, Object element) {
        int size = this.size();
        if (index >= size + 1 || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        int to = index != size ? index - 1 : index;
        for (int i = size; i > to; --i) {
            this.map.put(String.valueOf(i + 1), this.map.get(String.valueOf(i)));
        }
        this.map.put(String.valueOf(index), element);
    }

    private void rangeCheck(int index) {
        int size = this.size();
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public Object get(int index) {
        this.rangeCheck(index);
        return this.map.get(String.valueOf(index));
    }

    public Object remove(int index) {
        int size = this.size();
        this.rangeCheck(index);
        Object value = this.map.get(String.valueOf(index));
        for (int i = index; i < size - 1; ++i) {
            this.map.put(String.valueOf(i), this.map.get(String.valueOf(i + 1)));
        }
        this.map.remove(String.valueOf(size - 1));
        return value;
    }
}

