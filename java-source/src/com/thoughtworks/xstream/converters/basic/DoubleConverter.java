/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

public class DoubleConverter
extends AbstractSingleValueConverter {
    static /* synthetic */ Class class$java$lang$Double;

    public boolean canConvert(Class type) {
        return type.equals(Double.TYPE) || type.equals(class$java$lang$Double == null ? (class$java$lang$Double = DoubleConverter.class$("java.lang.Double")) : class$java$lang$Double);
    }

    public Object fromString(String str) {
        return Double.valueOf(str);
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

