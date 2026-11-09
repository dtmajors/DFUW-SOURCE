/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

public class LongConverter
extends AbstractSingleValueConverter {
    static /* synthetic */ Class class$java$lang$Long;

    public boolean canConvert(Class type) {
        return type.equals(Long.TYPE) || type.equals(class$java$lang$Long == null ? (class$java$lang$Long = LongConverter.class$("java.lang.Long")) : class$java$lang$Long);
    }

    public Object fromString(String str) {
        return Long.decode(str);
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

