/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.sql.Timestamp;

public class SqlTimestampConverter
extends AbstractSingleValueConverter {
    static /* synthetic */ Class class$java$sql$Timestamp;

    public boolean canConvert(Class type) {
        return type.equals(class$java$sql$Timestamp == null ? (class$java$sql$Timestamp = SqlTimestampConverter.class$("java.sql.Timestamp")) : class$java$sql$Timestamp);
    }

    public Object fromString(String str) {
        return Timestamp.valueOf(str);
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

