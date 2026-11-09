/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

public class ByteConverter
extends AbstractSingleValueConverter {
    static /* synthetic */ Class class$java$lang$Byte;

    public boolean canConvert(Class type) {
        return type.equals(Byte.TYPE) || type.equals(class$java$lang$Byte == null ? (class$java$lang$Byte = ByteConverter.class$("java.lang.Byte")) : class$java$lang$Byte);
    }

    public Object fromString(String str) {
        int value = Integer.decode(str);
        if (value < -128 || value > 255) {
            throw new NumberFormatException("For input string: \"" + str + '\"');
        }
        return new Byte((byte)value);
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

