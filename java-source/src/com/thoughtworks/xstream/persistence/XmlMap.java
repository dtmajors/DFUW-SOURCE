/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.persistence;

import com.thoughtworks.xstream.persistence.StreamStrategy;
import com.thoughtworks.xstream.persistence.XmlMap;
import java.util.AbstractMap;
import java.util.Set;

public class XmlMap
extends AbstractMap {
    private final StreamStrategy streamStrategy;

    public XmlMap(StreamStrategy streamStrategy) {
        this.streamStrategy = streamStrategy;
    }

    public int size() {
        return this.streamStrategy.size();
    }

    public Object get(Object key) {
        return this.streamStrategy.get(key);
    }

    public Object put(Object key, Object value) {
        return this.streamStrategy.put(key, value);
    }

    public Object remove(Object key) {
        return this.streamStrategy.remove(key);
    }

    public Set entrySet() {
        return new XmlMapEntries(this);
    }

    static /* synthetic */ StreamStrategy access$000(XmlMap x0) {
        return x0.streamStrategy;
    }
}

