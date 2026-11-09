/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateConverter
extends AbstractSingleValueConverter {
    private final ThreadSafeSimpleDateFormat defaultFormat;
    private final ThreadSafeSimpleDateFormat[] acceptableFormats;
    static /* synthetic */ Class class$java$util$Date;

    public DateConverter() {
        this("yyyy-MM-dd HH:mm:ss.S z", new String[]{"yyyy-MM-dd HH:mm:ss.S a", "yyyy-MM-dd HH:mm:ssz", "yyyy-MM-dd HH:mm:ss z", "yyyy-MM-dd HH:mm:ssa"});
    }

    public DateConverter(String defaultFormat, String[] acceptableFormats) {
        this.defaultFormat = new ThreadSafeSimpleDateFormat(defaultFormat, 4, 20);
        this.acceptableFormats = new ThreadSafeSimpleDateFormat[acceptableFormats.length];
        for (int i = 0; i < acceptableFormats.length; ++i) {
            this.acceptableFormats[i] = new ThreadSafeSimpleDateFormat(acceptableFormats[i], 1, 20);
        }
    }

    public boolean canConvert(Class type) {
        return type.equals(class$java$util$Date == null ? (class$java$util$Date = DateConverter.class$("java.util.Date")) : class$java$util$Date);
    }

    public Object fromString(String str) {
        try {
            return this.defaultFormat.parse(str);
        }
        catch (ParseException e) {
            for (int i = 0; i < this.acceptableFormats.length; ++i) {
                try {
                    return this.acceptableFormats[i].parse(str);
                }
                catch (ParseException e2) {
                    continue;
                }
            }
            throw new ConversionException("Cannot parse date " + str);
        }
    }

    public String toString(Object obj) {
        return this.defaultFormat.format((Date)obj);
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

