/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

public class BooleanConverter
extends AbstractSingleValueConverter {
    public static final BooleanConverter TRUE_FALSE = new BooleanConverter("true", "false", false);
    public static final BooleanConverter YES_NO = new BooleanConverter("yes", "no", false);
    public static final BooleanConverter BINARY = new BooleanConverter("1", "0", true);
    private final String positive;
    private final String negative;
    private final boolean caseSensitive;
    static /* synthetic */ Class class$java$lang$Boolean;

    public BooleanConverter(String positive, String negative, boolean caseSensitive) {
        this.positive = positive;
        this.negative = negative;
        this.caseSensitive = caseSensitive;
    }

    public BooleanConverter() {
        this("true", "false", false);
    }

    public boolean shouldConvert(Class type, Object value) {
        return true;
    }

    public boolean canConvert(Class type) {
        return type.equals(Boolean.TYPE) || type.equals(class$java$lang$Boolean == null ? (class$java$lang$Boolean = BooleanConverter.class$("java.lang.Boolean")) : class$java$lang$Boolean);
    }

    public Object fromString(String str) {
        if (this.caseSensitive) {
            return this.positive.equals(str) ? Boolean.TRUE : Boolean.FALSE;
        }
        return this.positive.equalsIgnoreCase(str) ? Boolean.TRUE : Boolean.FALSE;
    }

    public String toString(Object obj) {
        Boolean value = (Boolean)obj;
        return obj == null ? null : (value != false ? this.positive : this.negative);
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

