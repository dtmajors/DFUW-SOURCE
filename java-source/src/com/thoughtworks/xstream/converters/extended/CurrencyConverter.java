/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.util.Currency;

public class CurrencyConverter
extends AbstractSingleValueConverter {
    static /* synthetic */ Class class$java$util$Currency;

    public boolean canConvert(Class type) {
        return type.equals(class$java$util$Currency == null ? (class$java$util$Currency = CurrencyConverter.class$("java.util.Currency")) : class$java$util$Currency);
    }

    public Object fromString(String str) {
        return Currency.getInstance(str);
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

