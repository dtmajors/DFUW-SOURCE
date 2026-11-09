/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.math.BigInteger;

public class BigIntegerConverter
extends AbstractSingleValueConverter {
    static /* synthetic */ Class class$java$math$BigInteger;

    public boolean canConvert(Class type) {
        return type.equals(class$java$math$BigInteger == null ? (class$java$math$BigInteger = BigIntegerConverter.class$("java.math.BigInteger")) : class$java$math$BigInteger);
    }

    public Object fromString(String str) {
        return new BigInteger(str);
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

