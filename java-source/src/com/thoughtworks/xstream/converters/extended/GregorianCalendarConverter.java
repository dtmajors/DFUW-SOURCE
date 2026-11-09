/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalendarConverter
implements Converter {
    static /* synthetic */ Class class$java$util$GregorianCalendar;

    public boolean canConvert(Class type) {
        return type.equals(class$java$util$GregorianCalendar == null ? (class$java$util$GregorianCalendar = GregorianCalendarConverter.class$("java.util.GregorianCalendar")) : class$java$util$GregorianCalendar);
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        GregorianCalendar calendar = (GregorianCalendar)source;
        writer.startNode("time");
        long timeInMillis = calendar.getTime().getTime();
        writer.setValue(String.valueOf(timeInMillis));
        writer.endNode();
        writer.startNode("timezone");
        writer.setValue(calendar.getTimeZone().getID());
        writer.endNode();
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        String timeZone;
        reader.moveDown();
        long timeInMillis = Long.parseLong(reader.getValue());
        reader.moveUp();
        if (reader.hasMoreChildren()) {
            reader.moveDown();
            timeZone = reader.getValue();
            reader.moveUp();
        } else {
            timeZone = TimeZone.getDefault().getID();
        }
        GregorianCalendar result = new GregorianCalendar();
        result.setTimeZone(TimeZone.getTimeZone(timeZone));
        result.setTime(new Date(timeInMillis));
        return result;
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

