/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

public class StringBufferConverter
extends AbstractSingleValueConverter {
    static /* synthetic */ Class class$java$lang$StringBuffer;

    public Object fromString(String str) {
        return new StringBuffer(str);
    }

    public boolean canConvert(Class type) {
        return type.equals(class$java$lang$StringBuffer == null ? (class$java$lang$StringBuffer = StringBufferConverter.class$("java.lang.StringBuffer")) : class$java$lang$StringBuffer);
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

