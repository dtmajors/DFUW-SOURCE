/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.basic;

import java.text.ParseException;
import java.util.Date;

public class ThreadSafeSimpleDateFormat
extends com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat {
    public ThreadSafeSimpleDateFormat(String format, int initialPoolSize, int maxPoolSize) {
        super(format, initialPoolSize, maxPoolSize);
    }

    public String format(Date date) {
        return super.format(date);
    }

    public Date parse(String date) throws ParseException {
        return super.parse(date);
    }
}

