/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import com.thoughtworks.xstream.converters.extended.StackTraceElementFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StackTraceElementConverter
extends AbstractSingleValueConverter {
    private static final Pattern PATTERN = Pattern.compile("^(.+)\\.([^\\(]+)\\(([^:]*)(:(\\d+))?\\)$");
    private static final StackTraceElementFactory FACTORY = new StackTraceElementFactory();
    static /* synthetic */ Class class$java$lang$StackTraceElement;

    public boolean canConvert(Class type) {
        return (class$java$lang$StackTraceElement == null ? (class$java$lang$StackTraceElement = StackTraceElementConverter.class$("java.lang.StackTraceElement")) : class$java$lang$StackTraceElement).equals(type);
    }

    public String toString(Object obj) {
        String s = super.toString(obj);
        return s.replaceFirst(":\\?\\?\\?", "");
    }

    public Object fromString(String str) {
        Matcher matcher = PATTERN.matcher(str);
        if (matcher.matches()) {
            String declaringClass = matcher.group(1);
            String methodName = matcher.group(2);
            String fileName = matcher.group(3);
            if (fileName.equals("Unknown Source")) {
                return FACTORY.unknownSourceElement(declaringClass, methodName);
            }
            if (fileName.equals("Native Method")) {
                return FACTORY.nativeMethodElement(declaringClass, methodName);
            }
            if (matcher.group(4) != null) {
                int lineNumber = Integer.parseInt(matcher.group(5));
                return FACTORY.element(declaringClass, methodName, fileName, lineNumber);
            }
            return FACTORY.element(declaringClass, methodName, fileName);
        }
        throw new ConversionException("Could not parse StackTraceElement : " + str);
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

