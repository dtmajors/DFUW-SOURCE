/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.net.MalformedURLException;
import java.net.URL;

public class URLConverter
extends AbstractSingleValueConverter {
    static /* synthetic */ Class class$java$net$URL;

    public boolean canConvert(Class type) {
        return type.equals(class$java$net$URL == null ? (class$java$net$URL = URLConverter.class$("java.net.URL")) : class$java$net$URL);
    }

    public Object fromString(String str) {
        try {
            return new URL(str);
        }
        catch (MalformedURLException e) {
            throw new ConversionException(e);
        }
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

