/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.alias.ClassMapper;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;

public class EnumMapper
extends MapperWrapper {
    private static JVM jvm = new JVM();
    private static final Class enumClass = jvm.loadClass("java.lang.Enum");
    private static final boolean active = enumClass != null;
    private static final Class enumSetClass = active ? jvm.loadClass("java.util.EnumSet") : null;

    public EnumMapper(Mapper wrapped) {
        super(wrapped);
    }

    public EnumMapper(ClassMapper wrapped) {
        this((Mapper)wrapped);
    }

    public String serializedClass(Class type) {
        if (!active) {
            return super.serializedClass(type);
        }
        if (enumClass.isAssignableFrom(type) && type.getSuperclass() != enumClass) {
            return super.serializedClass(type.getSuperclass());
        }
        if (enumSetClass.isAssignableFrom(type)) {
            return super.serializedClass(enumSetClass);
        }
        return super.serializedClass(type);
    }
}

