/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

public class FloatConverter
extends AbstractSingleValueConverter {
    static /* synthetic */ Class class$java$lang$Float;

    public boolean canConvert(Class type) {
        return type.equals(Float.TYPE) || type.equals(class$java$lang$Float == null ? (class$java$lang$Float = FloatConverter.class$("java.lang.Float")) : class$java$lang$Float);
    }

    public Object fromString(String str) {
        return Float.valueOf(str);
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

