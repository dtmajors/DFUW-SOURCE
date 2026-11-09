/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.util.Locale;

public class LocaleConverter
extends AbstractSingleValueConverter {
    static /* synthetic */ Class class$java$util$Locale;

    public boolean canConvert(Class type) {
        return type.equals(class$java$util$Locale == null ? (class$java$util$Locale = LocaleConverter.class$("java.util.Locale")) : class$java$util$Locale);
    }

    public Object fromString(String str) {
        String variant;
        String country;
        String language;
        int[] underscorePositions = this.underscorePositions(str);
        if (underscorePositions[0] == -1) {
            language = str;
            country = "";
            variant = "";
        } else if (underscorePositions[1] == -1) {
            language = str.substring(0, underscorePositions[0]);
            country = str.substring(underscorePositions[0] + 1);
            variant = "";
        } else {
            language = str.substring(0, underscorePositions[0]);
            country = str.substring(underscorePositions[0] + 1, underscorePositions[1]);
            variant = str.substring(underscorePositions[1] + 1);
        }
        return new Locale(language, country, variant);
    }

    private int[] underscorePositions(String in) {
        int[] result = new int[2];
        for (int i = 0; i < result.length; ++i) {
            int last = i == 0 ? 0 : result[i - 1];
            result[i] = in.indexOf(95, last + 1);
        }
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

