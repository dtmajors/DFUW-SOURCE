/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.sql.Date;

public class SqlDateConverter
extends AbstractSingleValueConverter {
    static /* synthetic */ Class class$java$sql$Date;

    public boolean canConvert(Class type) {
        return type.equals(class$java$sql$Date == null ? (class$java$sql$Date = SqlDateConverter.class$("java.sql.Date")) : class$java$sql$Date);
    }

    public Object fromString(String str) {
        return Date.valueOf(str);
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

