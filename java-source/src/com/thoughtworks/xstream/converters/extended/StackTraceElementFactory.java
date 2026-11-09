/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.ConversionException;
import java.lang.reflect.Field;

public class StackTraceElementFactory {
    static /* synthetic */ Class class$java$lang$StackTraceElement;

    public StackTraceElement nativeMethodElement(String declaringClass, String methodName) {
        return this.create(declaringClass, methodName, "Native Method", -2);
    }

    public StackTraceElement unknownSourceElement(String declaringClass, String methodName) {
        return this.create(declaringClass, methodName, "Unknown Source", -1);
    }

    public StackTraceElement element(String declaringClass, String methodName, String fileName) {
        return this.create(declaringClass, methodName, fileName, -1);
    }

    public StackTraceElement element(String declaringClass, String methodName, String fileName, int lineNumber) {
        return this.create(declaringClass, methodName, fileName, lineNumber);
    }

    private StackTraceElement create(String declaringClass, String methodName, String fileName, int lineNumber) {
        StackTraceElement result = new Throwable().getStackTrace()[0];
        this.setField(result, "declaringClass", declaringClass);
        this.setField(result, "methodName", methodName);
        this.setField(result, "fileName", fileName);
        this.setField(result, "lineNumber", new Integer(lineNumber));
        return result;
    }

    private void setField(StackTraceElement element, String fieldName, Object value) {
        try {
            Field field = (class$java$lang$StackTraceElement == null ? (class$java$lang$StackTraceElement = StackTraceElementFactory.class$("java.lang.StackTraceElement")) : class$java$lang$StackTraceElement).getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(element, value);
        }
        catch (Exception e) {
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

