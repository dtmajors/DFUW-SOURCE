/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.alias.ClassMapper;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DefaultImplementationsMapper
extends MapperWrapper {
    private final Map typeToImpl = new HashMap();
    private transient Map implToType = new HashMap();
    static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$Mapper$Null;
    static /* synthetic */ Class class$java$lang$Boolean;
    static /* synthetic */ Class class$java$lang$Character;
    static /* synthetic */ Class class$java$lang$Integer;
    static /* synthetic */ Class class$java$lang$Float;
    static /* synthetic */ Class class$java$lang$Double;
    static /* synthetic */ Class class$java$lang$Short;
    static /* synthetic */ Class class$java$lang$Byte;
    static /* synthetic */ Class class$java$lang$Long;

    public DefaultImplementationsMapper(Mapper wrapped) {
        super(wrapped);
        this.addDefaults();
    }

    public DefaultImplementationsMapper(ClassMapper wrapped) {
        this((Mapper)wrapped);
    }

    protected void addDefaults() {
        this.addDefaultImplementation(null, class$com$thoughtworks$xstream$mapper$Mapper$Null == null ? (class$com$thoughtworks$xstream$mapper$Mapper$Null = DefaultImplementationsMapper.class$("com.thoughtworks.xstream.mapper.Mapper$Null")) : class$com$thoughtworks$xstream$mapper$Mapper$Null);
        this.addDefaultImplementation(class$java$lang$Boolean == null ? (class$java$lang$Boolean = DefaultImplementationsMapper.class$("java.lang.Boolean")) : class$java$lang$Boolean, Boolean.TYPE);
        this.addDefaultImplementation(class$java$lang$Character == null ? (class$java$lang$Character = DefaultImplementationsMapper.class$("java.lang.Character")) : class$java$lang$Character, Character.TYPE);
        this.addDefaultImplementation(class$java$lang$Integer == null ? (class$java$lang$Integer = DefaultImplementationsMapper.class$("java.lang.Integer")) : class$java$lang$Integer, Integer.TYPE);
        this.addDefaultImplementation(class$java$lang$Float == null ? (class$java$lang$Float = DefaultImplementationsMapper.class$("java.lang.Float")) : class$java$lang$Float, Float.TYPE);
        this.addDefaultImplementation(class$java$lang$Double == null ? (class$java$lang$Double = DefaultImplementationsMapper.class$("java.lang.Double")) : class$java$lang$Double, Double.TYPE);
        this.addDefaultImplementation(class$java$lang$Short == null ? (class$java$lang$Short = DefaultImplementationsMapper.class$("java.lang.Short")) : class$java$lang$Short, Short.TYPE);
        this.addDefaultImplementation(class$java$lang$Byte == null ? (class$java$lang$Byte = DefaultImplementationsMapper.class$("java.lang.Byte")) : class$java$lang$Byte, Byte.TYPE);
        this.addDefaultImplementation(class$java$lang$Long == null ? (class$java$lang$Long = DefaultImplementationsMapper.class$("java.lang.Long")) : class$java$lang$Long, Long.TYPE);
    }

    public void addDefaultImplementation(Class defaultImplementation, Class ofType) {
        this.typeToImpl.put(ofType, defaultImplementation);
        this.implToType.put(defaultImplementation, ofType);
    }

    public String serializedClass(Class type) {
        Class baseType = (Class)this.implToType.get(type);
        return baseType == null ? super.serializedClass(type) : super.serializedClass(baseType);
    }

    public Class defaultImplementationOf(Class type) {
        if (this.typeToImpl.containsKey(type)) {
            return (Class)this.typeToImpl.get(type);
        }
        return super.defaultImplementationOf(type);
    }

    private Object readResolve() {
        this.implToType = new HashMap();
        Iterator iter = this.typeToImpl.keySet().iterator();
        while (iter.hasNext()) {
            Object type = iter.next();
            this.implToType.put(this.typeToImpl.get(type), type);
        }
        return this;
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

