/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.extended.ISO8601GregorianCalendarConverter;
import java.util.Calendar;
import java.util.Date;

public class ISO8601DateConverter
extends ISO8601GregorianCalendarConverter {
    static /* synthetic */ Class class$java$util$Date;

    public boolean canConvert(Class type) {
        return type.equals(class$java$util$Date == null ? (class$java$util$Date = ISO8601DateConverter.class$("java.util.Date")) : class$java$util$Date);
    }

    public Object fromString(String str) {
        return ((Calendar)super.fromString(str)).getTime();
    }

    public String toString(Object obj) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime((Date)obj);
        return super.toString(calendar);
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

