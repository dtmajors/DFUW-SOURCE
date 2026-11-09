/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

public class IntConverter
extends AbstractSingleValueConverter {
    static /* synthetic */ Class class$java$lang$Integer;

    public boolean canConvert(Class type) {
        return type.equals(Integer.TYPE) || type.equals(class$java$lang$Integer == null ? (class$java$lang$Integer = IntConverter.class$("java.lang.Integer")) : class$java$lang$Integer);
    }

    public Object fromString(String str) {
        long value = Long.decode(str);
        if (value < Integer.MIN_VALUE || value > 0xFFFFFFFFL) {
            throw new NumberFormatException("For input string: \"" + str + '\"');
        }
        return new Integer((int)value);
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

