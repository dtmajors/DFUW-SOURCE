/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

public class ShortConverter
extends AbstractSingleValueConverter {
    static /* synthetic */ Class class$java$lang$Short;

    public boolean canConvert(Class type) {
        return type.equals(Short.TYPE) || type.equals(class$java$lang$Short == null ? (class$java$lang$Short = ShortConverter.class$("java.lang.Short")) : class$java$lang$Short);
    }

    public Object fromString(String str) {
        int value = Integer.decode(str);
        if (value < Short.MIN_VALUE || value > 65535) {
            throw new NumberFormatException("For input string: \"" + str + '\"');
        }
        return new Short((short)value);
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

