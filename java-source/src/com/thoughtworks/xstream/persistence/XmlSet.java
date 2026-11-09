/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.persistence;

import com.thoughtworks.xstream.persistence.StreamStrategy;
import com.thoughtworks.xstream.persistence.XmlMap;
import java.util.AbstractSet;
import java.util.Iterator;

public class XmlSet
extends AbstractSet {
    private final XmlMap map;

    public XmlSet(StreamStrategy streamStrategy) {
        this.map = new XmlMap(streamStrategy);
    }

    public Iterator iterator() {
        return this.map.values().iterator();
    }

    public int size() {
        return this.map.size();
    }

    public boolean add(Object o) {
        if (this.map.containsValue(o)) {
            return false;
        }
        this.map.put(this.findEmptyKey(), o);
        return true;
    }

    private String findEmptyKey() {
        long i = System.currentTimeMillis();
        while (this.map.containsKey("" + i)) {
            ++i;
        }
        return "" + i;
    }
}

