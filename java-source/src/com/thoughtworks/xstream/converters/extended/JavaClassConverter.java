/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

public class JavaClassConverter
extends AbstractSingleValueConverter {
    private ClassLoader classLoader;
    static /* synthetic */ Class class$java$lang$Class;

    public JavaClassConverter() {
        this(Thread.currentThread().getContextClassLoader());
    }

    public JavaClassConverter(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    public boolean canConvert(Class clazz) {
        return (class$java$lang$Class == null ? (class$java$lang$Class = JavaClassConverter.class$("java.lang.Class")) : class$java$lang$Class).equals(clazz);
    }

    public String toString(Object obj) {
        return ((Class)obj).getName();
    }

    public Object fromString(String str) {
        try {
            return str.equals("void") ? Void.TYPE : (str.equals("byte") ? Byte.TYPE : (str.equals("int") ? Integer.TYPE : (str.equals("long") ? Long.TYPE : (str.equals("float") ? Float.TYPE : (str.equals("boolean") ? Boolean.TYPE : (str.equals("double") ? Double.TYPE : (str.equals("char") ? Character.TYPE : (str.equals("short") ? Short.TYPE : Class.forName(str, false, this.classLoader)))))))));
        }
        catch (ClassNotFoundException e) {
            throw new ConversionException("Cannot load java class " + str, e);
        }
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

