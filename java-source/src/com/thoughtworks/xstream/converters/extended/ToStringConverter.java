/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ToStringConverter
extends AbstractSingleValueConverter {
    private final Class clazz;
    private final Constructor ctor;
    static /* synthetic */ Class class$java$lang$String;

    public ToStringConverter(Class clazz) throws NoSuchMethodException {
        this.clazz = clazz;
        this.ctor = clazz.getConstructor(class$java$lang$String == null ? (class$java$lang$String = ToStringConverter.class$("java.lang.String")) : class$java$lang$String);
    }

    public boolean canConvert(Class type) {
        return type.equals(this.clazz);
    }

    public String toString(Object obj) {
        return obj == null ? null : obj.toString();
    }

    public Object fromString(String str) {
        try {
            return this.ctor.newInstance(str);
        }
        catch (InstantiationException e) {
            throw new ConversionException("Unable to instantiate single String param constructor", e);
        }
        catch (IllegalAccessException e) {
            throw new ConversionException("Unable to access single String param constructor", e);
        }
        catch (InvocationTargetException e) {
            throw new ConversionException("Unable to target single String param constructor", e.getTargetException());
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

