/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.joda.time.DateTime
 *  org.joda.time.DateTimeZone
 *  org.joda.time.format.DateTimeFormatter
 *  org.joda.time.format.ISODateTimeFormat
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class ISO8601GregorianCalendarConverter
extends AbstractSingleValueConverter {
    private static final DateTimeFormatter[] formattersUTC = new DateTimeFormatter[]{ISODateTimeFormat.dateTime(), ISODateTimeFormat.dateTimeNoMillis(), ISODateTimeFormat.basicDateTime(), ISODateTimeFormat.basicOrdinalDateTime(), ISODateTimeFormat.basicOrdinalDateTimeNoMillis(), ISODateTimeFormat.basicTime(), ISODateTimeFormat.basicTimeNoMillis(), ISODateTimeFormat.basicTTime(), ISODateTimeFormat.basicTTimeNoMillis(), ISODateTimeFormat.basicWeekDateTime(), ISODateTimeFormat.basicWeekDateTimeNoMillis(), ISODateTimeFormat.ordinalDateTime(), ISODateTimeFormat.ordinalDateTimeNoMillis(), ISODateTimeFormat.time(), ISODateTimeFormat.timeNoMillis(), ISODateTimeFormat.tTime(), ISODateTimeFormat.tTimeNoMillis(), ISODateTimeFormat.weekDateTime(), ISODateTimeFormat.weekDateTimeNoMillis()};
    private static final DateTimeFormatter[] formattersNoUTC = new DateTimeFormatter[]{ISODateTimeFormat.basicDate(), ISODateTimeFormat.basicOrdinalDate(), ISODateTimeFormat.basicWeekDate(), ISODateTimeFormat.date(), ISODateTimeFormat.dateHour(), ISODateTimeFormat.dateHourMinute(), ISODateTimeFormat.dateHourMinuteSecond(), ISODateTimeFormat.dateHourMinuteSecondFraction(), ISODateTimeFormat.dateHourMinuteSecondMillis(), ISODateTimeFormat.hour(), ISODateTimeFormat.hourMinute(), ISODateTimeFormat.hourMinuteSecond(), ISODateTimeFormat.hourMinuteSecondFraction(), ISODateTimeFormat.hourMinuteSecondMillis(), ISODateTimeFormat.ordinalDate(), ISODateTimeFormat.weekDate(), ISODateTimeFormat.year(), ISODateTimeFormat.yearMonth(), ISODateTimeFormat.yearMonthDay(), ISODateTimeFormat.weekyear(), ISODateTimeFormat.weekyearWeek(), ISODateTimeFormat.weekyearWeekDay()};
    static /* synthetic */ Class class$java$util$GregorianCalendar;

    public boolean canConvert(Class type) {
        return type.equals(class$java$util$GregorianCalendar == null ? (class$java$util$GregorianCalendar = ISO8601GregorianCalendarConverter.class$("java.util.GregorianCalendar")) : class$java$util$GregorianCalendar);
    }

    public Object fromString(String str) {
        for (int i = 0; i < formattersUTC.length; ++i) {
            DateTimeFormatter formatter = formattersUTC[i];
            try {
                DateTime dt = formatter.parseDateTime(str);
                Calendar calendar = dt.toCalendar(Locale.getDefault());
                calendar.setTimeZone(TimeZone.getDefault());
                return calendar;
            }
            catch (IllegalArgumentException e) {
                continue;
            }
        }
        String timeZoneID = TimeZone.getDefault().getID();
        for (int i = 0; i < formattersNoUTC.length; ++i) {
            try {
                DateTimeFormatter formatter = formattersNoUTC[i].withZone(DateTimeZone.forID((String)timeZoneID));
                DateTime dt = formatter.parseDateTime(str);
                Calendar calendar = dt.toCalendar(Locale.getDefault());
                calendar.setTimeZone(TimeZone.getDefault());
                return calendar;
            }
            catch (IllegalArgumentException e) {
                continue;
            }
        }
        throw new ConversionException("Cannot parse date " + str);
    }

    public String toString(Object obj) {
        DateTime dt = new DateTime(obj);
        return dt.toString(formattersUTC[0]);
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

