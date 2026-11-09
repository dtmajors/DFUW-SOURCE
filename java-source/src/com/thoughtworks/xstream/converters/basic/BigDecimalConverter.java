/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.math.BigDecimal;

public class BigDecimalConverter
extends AbstractSingleValueConverter {
    static /* synthetic */ Class class$java$math$BigDecimal;

    public boolean canConvert(Class type) {
        return type.equals(class$java$math$BigDecimal == null ? (class$java$math$BigDecimal = BigDecimalConverter.class$("java.math.BigDecimal")) : class$java$math$BigDecimal);
    }

    public Object fromString(String str) {
        return new BigDecimal(str);
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

