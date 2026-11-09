/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import org.apache.commons.collections.map.AbstractHashedMap;
import org.apache.commons.collections.map.IdentityMap;

public class IdentityMap
extends AbstractHashedMap
implements Serializable,
Cloneable {
    private static final long serialVersionUID = 2028493495224302329L;

    public IdentityMap() {
        super(16, 0.75f, 12);
    }

    public IdentityMap(int initialCapacity) {
        super(initialCapacity);
    }

    public IdentityMap(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public IdentityMap(Map map) {
        super(map);
    }

    protected int hash(Object key) {
        return System.identityHashCode(key);
    }

    protected boolean isEqualKey(Object key1, Object key2) {
        return key1 == key2;
    }

    protected boolean isEqualValue(Object value1, Object value2) {
        return value1 == value2;
    }

    protected AbstractHashedMap.HashEntry createEntry(AbstractHashedMap.HashEntry next, int hashCode, Object key, Object value) {
        return new IdentityEntry(next, hashCode, key, value);
    }

    public Object clone() {
        return super.clone();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        this.doWriteObject(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.doReadObject(in);
    }
}

