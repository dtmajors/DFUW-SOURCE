/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import java.lang.reflect.Field;

public interface ReflectionProvider {
    public Object newInstance(Class var1);

    public void visitSerializableFields(Object var1, Visitor var2);

    public void writeField(Object var1, String var2, Object var3, Class var4);

    public Class getFieldType(Object var1, String var2, Class var3);

    public boolean fieldDefinedInClass(String var1, Class var2);

    public Field getField(Class var1, String var2);
}

