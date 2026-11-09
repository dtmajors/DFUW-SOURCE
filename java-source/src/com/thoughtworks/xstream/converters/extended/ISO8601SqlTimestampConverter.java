/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.extended.ISO8601DateConverter;
import java.sql.Timestamp;
import java.util.Date;

public class ISO8601SqlTimestampConverter
extends ISO8601DateConverter {
    private static final String PADDING = "000000000";
    static /* synthetic */ Class class$java$sql$Timestamp;

    public boolean canConvert(Class type) {
        return type.equals(class$java$sql$Timestamp == null ? (class$java$sql$Timestamp = ISO8601SqlTimestampConverter.class$("java.sql.Timestamp")) : class$java$sql$Timestamp);
    }

    public Object fromString(String str) {
        int idxFraction = str.lastIndexOf(46);
        int nanos = 0;
        if (idxFraction > 0) {
            int idx = idxFraction + 1;
            while (Character.isDigit(str.charAt(idx))) {
                ++idx;
            }
            nanos = Integer.parseInt(str.substring(idxFraction + 1, idx));
            str = str.substring(0, idxFraction) + str.substring(idx);
        }
        Date date = (Date)super.fromString(str);
        Timestamp timestamp = new Timestamp(date.getTime());
        timestamp.setNanos(nanos);
        return timestamp;
    }

    public String toString(Object obj) {
        Timestamp timestamp = (Timestamp)obj;
        String str = super.toString(new Date(timestamp.getTime() / 1000L * 1000L));
        String nanos = String.valueOf(timestamp.getNanos());
        int idxFraction = str.lastIndexOf(46);
        str = str.substring(0, idxFraction + 1) + PADDING.substring(nanos.length()) + nanos + str.substring(idxFraction + 4);
        return str;
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

