/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections.map.AbstractLinkedMap;
import org.apache.commons.collections.map.LinkedMap;

public class LinkedMap
extends AbstractLinkedMap
implements Serializable,
Cloneable {
    private static final long serialVersionUID = 9077234323521161066L;

    public LinkedMap() {
        super(16, 0.75f, 12);
    }

    public LinkedMap(int initialCapacity) {
        super(initialCapacity);
    }

    public LinkedMap(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public LinkedMap(Map map) {
        super(map);
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

    public Object get(int index) {
        return this.getEntry(index).getKey();
    }

    public Object getValue(int index) {
        return this.getEntry(index).getValue();
    }

    public int indexOf(Object key) {
        key = this.convertKey(key);
        int i = 0;
        AbstractLinkedMap.LinkEntry entry = this.header.after;
        while (entry != this.header) {
            if (this.isEqualKey(key, entry.key)) {
                return i;
            }
            entry = entry.after;
            ++i;
        }
        return -1;
    }

    public Object remove(int index) {
        return this.remove(this.get(index));
    }

    public List asList() {
        return new LinkedMapList(this);
    }
}

