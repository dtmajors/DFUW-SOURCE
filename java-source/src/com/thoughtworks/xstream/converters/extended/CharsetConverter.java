/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.nio.charset.Charset;

public class CharsetConverter
extends AbstractSingleValueConverter {
    static /* synthetic */ Class class$java$nio$charset$Charset;

    public boolean canConvert(Class type) {
        return (class$java$nio$charset$Charset == null ? (class$java$nio$charset$Charset = CharsetConverter.class$("java.nio.charset.Charset")) : class$java$nio$charset$Charset).isAssignableFrom(type);
    }

    public String toString(Object obj) {
        return obj == null ? null : ((Charset)obj).name();
    }

    public Object fromString(String str) {
        return Charset.forName(str);
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

