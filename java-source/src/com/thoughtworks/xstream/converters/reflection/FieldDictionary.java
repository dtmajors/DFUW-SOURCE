/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.reflection.FieldKey;
import com.thoughtworks.xstream.converters.reflection.FieldKeySorter;
import com.thoughtworks.xstream.converters.reflection.ImmutableFieldKeySorter;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.core.util.OrderRetainingMap;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class FieldDictionary {
    private final Map keyedByFieldNameCache = new WeakHashMap();
    private final Map keyedByFieldKeyCache = new WeakHashMap();
    private final FieldKeySorter sorter;
    static /* synthetic */ Class class$java$lang$Object;

    public FieldDictionary() {
        this(new ImmutableFieldKeySorter());
    }

    public FieldDictionary(FieldKeySorter sorter) {
        this.sorter = sorter;
    }

    public Iterator serializableFieldsFor(Class cls2) {
        return this.buildMap(cls2, true).values().iterator();
    }

    public Field field(Class cls2, String name, Class definedIn) {
        Map fields = this.buildMap(cls2, definedIn != null);
        Field field = (Field)fields.get(definedIn != null ? new FieldKey(name, definedIn, 0) : name);
        if (field == null) {
            throw new ObjectAccessException("No such field " + cls2.getName() + "." + name);
        }
        return field;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Map buildMap(Class type, boolean tupleKeyed) {
        Class cls2 = type;
        Map map = this.keyedByFieldNameCache;
        synchronized (map) {
            Map map2 = this.keyedByFieldKeyCache;
            synchronized (map2) {
                if (!this.keyedByFieldNameCache.containsKey(type)) {
                    HashMap<String, Field> keyedByFieldName = new HashMap<String, Field>();
                    OrderRetainingMap keyedByFieldKey = new OrderRetainingMap();
                    while (!(class$java$lang$Object == null ? FieldDictionary.class$("java.lang.Object") : class$java$lang$Object).equals(cls2)) {
                        int i;
                        Field[] fields = cls2.getDeclaredFields();
                        if (JVM.reverseFieldDefinition()) {
                            i = fields.length >> 1;
                            while (i-- > 0) {
                                int idx = fields.length - i - 1;
                                Field field = fields[i];
                                fields[i] = fields[idx];
                                fields[idx] = field;
                            }
                        }
                        for (i = 0; i < fields.length; ++i) {
                            Field field = fields[i];
                            FieldKey fieldKey = new FieldKey(field.getName(), field.getDeclaringClass(), i);
                            field.setAccessible(true);
                            Field existent = (Field)keyedByFieldName.get(field.getName());
                            if (existent == null || (existent.getModifiers() & 8) != 0 && (field.getModifiers() & 8) == 0) {
                                keyedByFieldName.put(field.getName(), field);
                            }
                            keyedByFieldKey.put(fieldKey, field);
                        }
                        cls2 = cls2.getSuperclass();
                    }
                    this.keyedByFieldNameCache.put(type, keyedByFieldName);
                    this.keyedByFieldKeyCache.put(type, this.sorter.sort(type, keyedByFieldKey));
                }
            }
        }
        return (Map)(tupleKeyed ? this.keyedByFieldKeyCache.get(type) : this.keyedByFieldNameCache.get(type));
    }

    static /* synthetic */ Class class$(String x0) {
        try {
            return Class.forName(x0);
        }
        catch (ClassNotFoundException x1) {
            throw new NoClassDefFoundError(x1.getMessage());
        }
    }
}

