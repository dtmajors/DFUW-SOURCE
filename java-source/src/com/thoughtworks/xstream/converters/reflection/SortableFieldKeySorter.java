/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.reflection.FieldKey;
import com.thoughtworks.xstream.converters.reflection.FieldKeySorter;
import com.thoughtworks.xstream.converters.reflection.SortableFieldKeySorter;
import com.thoughtworks.xstream.core.util.OrderRetainingMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;

public class SortableFieldKeySorter
implements FieldKeySorter {
    private final Map map = new WeakHashMap();

    public Map sort(Class type, Map keyedByFieldKey) {
        if (this.map.containsKey(type)) {
            OrderRetainingMap result = new OrderRetainingMap();
            FieldKey[] fieldKeys = keyedByFieldKey.keySet().toArray(new FieldKey[keyedByFieldKey.size()]);
            Arrays.sort(fieldKeys, (Comparator)this.map.get(type));
            for (int i = 0; i < fieldKeys.length; ++i) {
                result.put(fieldKeys[i], keyedByFieldKey.get(fieldKeys[i]));
            }
            return result;
        }
        return keyedByFieldKey;
    }

    public void registerFieldOrder(Class type, String[] fields) {
        this.map.put(type, new FieldComparator(this, fields));
    }
}

