/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.sql.Time;

public class SqlTimeConverter
extends AbstractSingleValueConverter {
    static /* synthetic */ Class class$java$sql$Time;

    public boolean canConvert(Class type) {
        return type.equals(class$java$sql$Time == null ? (class$java$sql$Time = SqlTimeConverter.class$("java.sql.Time")) : class$java$sql$Time);
    }

    public Object fromString(String str) {
        return Time.valueOf(str);
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

