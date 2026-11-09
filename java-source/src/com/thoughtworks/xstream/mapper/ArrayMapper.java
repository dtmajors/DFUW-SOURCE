/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.alias.ClassMapper;
import com.thoughtworks.xstream.mapper.CannotResolveClassException;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import java.util.Arrays;
import java.util.Collection;

public class ArrayMapper
extends MapperWrapper {
    private static final Collection BOXED_TYPES = Arrays.asList(class$java$lang$Boolean == null ? (class$java$lang$Boolean = ArrayMapper.class$("java.lang.Boolean")) : class$java$lang$Boolean, class$java$lang$Byte == null ? (class$java$lang$Byte = ArrayMapper.class$("java.lang.Byte")) : class$java$lang$Byte, class$java$lang$Character == null ? (class$java$lang$Character = ArrayMapper.class$("java.lang.Character")) : class$java$lang$Character, class$java$lang$Short == null ? (class$java$lang$Short = ArrayMapper.class$("java.lang.Short")) : class$java$lang$Short, class$java$lang$Integer == null ? (class$java$lang$Integer = ArrayMapper.class$("java.lang.Integer")) : class$java$lang$Integer, class$java$lang$Long == null ? (class$java$lang$Long = ArrayMapper.class$("java.lang.Long")) : class$java$lang$Long, class$java$lang$Float == null ? (class$java$lang$Float = ArrayMapper.class$("java.lang.Float")) : class$java$lang$Float, class$java$lang$Double == null ? (class$java$lang$Double = ArrayMapper.class$("java.lang.Double")) : class$java$lang$Double);
    static /* synthetic */ Class class$java$lang$Boolean;
    static /* synthetic */ Class class$java$lang$Byte;
    static /* synthetic */ Class class$java$lang$Character;
    static /* synthetic */ Class class$java$lang$Short;
    static /* synthetic */ Class class$java$lang$Integer;
    static /* synthetic */ Class class$java$lang$Long;
    static /* synthetic */ Class class$java$lang$Float;
    static /* synthetic */ Class class$java$lang$Double;

    public ArrayMapper(Mapper wrapped) {
        super(wrapped);
    }

    public ArrayMapper(ClassMapper wrapped) {
        this((Mapper)wrapped);
    }

    public String serializedClass(Class type) {
        StringBuffer arraySuffix = new StringBuffer();
        while (type.isArray()) {
            type = type.getComponentType();
            arraySuffix.append("-array");
        }
        String name = this.boxedTypeName(type);
        if (name == null) {
            name = super.serializedClass(type);
        }
        if (arraySuffix.length() > 0) {
            return name + arraySuffix;
        }
        return name;
    }

    public Class realClass(String elementName) {
        int dimensions = 0;
        while (elementName.endsWith("-array")) {
            elementName = elementName.substring(0, elementName.length() - 6);
            ++dimensions;
        }
        if (dimensions > 0) {
            Class componentType = this.primitiveClassNamed(elementName);
            if (componentType == null) {
                componentType = super.realClass(elementName);
            }
            try {
                return this.arrayType(dimensions, componentType);
            }
            catch (ClassNotFoundException e2) {
                throw new CannotResolveClassException(elementName + " : " + e2.getMessage());
            }
        }
        return super.realClass(elementName);
    }

    private Class arrayType(int dimensions, Class componentType) throws ClassNotFoundException {
        StringBuffer className = new StringBuffer();
        for (int i = 0; i < dimensions; ++i) {
            className.append('[');
        }
        if (componentType.isPrimitive()) {
            className.append(this.charThatJavaUsesToRepresentPrimitiveArrayType(componentType));
            return Class.forName(className.toString());
        }
        className.append('L').append(componentType.getName()).append(';');
        return Class.forName(className.toString(), false, componentType.getClassLoader());
    }

    private Class primitiveClassNamed(String name) {
        return name.equals("void") ? Void.TYPE : (name.equals("boolean") ? Boolean.TYPE : (name.equals("byte") ? Byte.TYPE : (name.equals("char") ? Character.TYPE : (name.equals("short") ? Short.TYPE : (name.equals("int") ? Integer.TYPE : (name.equals("long") ? Long.TYPE : (name.equals("float") ? Float.TYPE : (name.equals("double") ? Double.TYPE : null))))))));
    }

    private char charThatJavaUsesToRepresentPrimitiveArrayType(Class primvCls) {
        return (char)(primvCls == Boolean.TYPE ? 90 : (primvCls == Byte.TYPE ? 66 : (primvCls == Character.TYPE ? 67 : (primvCls == Short.TYPE ? 83 : (primvCls == Integer.TYPE ? 73 : (primvCls == Long.TYPE ? 74 : (primvCls == Float.TYPE ? 70 : (primvCls == Double.TYPE ? 68 : 0))))))));
    }

    private String boxedTypeName(Class type) {
        return BOXED_TYPES.contains(type) ? type.getName() : null;
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

