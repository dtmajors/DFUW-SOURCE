/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters;

import com.thoughtworks.xstream.converters.ErrorWriter;
import com.thoughtworks.xstream.core.BaseException;
import com.thoughtworks.xstream.core.util.OrderRetainingMap;
import java.util.Iterator;
import java.util.Map;

public class ConversionException
extends BaseException
implements ErrorWriter {
    private Map stuff = new OrderRetainingMap();
    protected Throwable cause;

    public ConversionException(String msg, Throwable cause) {
        super(msg);
        if (msg != null) {
            this.add("message", msg);
        }
        if (cause != null) {
            this.add("cause-exception", cause.getClass().getName());
            this.add("cause-message", cause instanceof ConversionException ? ((ConversionException)cause).getShortMessage() : cause.getMessage());
            this.cause = cause;
        }
    }

    public ConversionException(String msg) {
        super(msg);
    }

    public ConversionException(Throwable cause) {
        this(cause.getMessage(), cause);
    }

    public String get(String errorKey) {
        return (String)this.stuff.get(errorKey);
    }

    public void add(String name, String information) {
        this.stuff.put(name, information);
    }

    public Iterator keys() {
        return this.stuff.keySet().iterator();
    }

    public String getMessage() {
        StringBuffer result = new StringBuffer();
        if (super.getMessage() != null) {
            result.append(super.getMessage());
        }
        result.append("\n---- Debugging information ----");
        Iterator iterator = this.keys();
        while (iterator.hasNext()) {
            String k = (String)iterator.next();
            String v = this.get(k);
            result.append('\n').append(k);
            int padding = 20 - k.length();
            for (int i = 0; i < padding; ++i) {
                result.append(' ');
            }
            result.append(": ").append(v);
        }
        result.append("\n-------------------------------");
        return result.toString();
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getShortMessage() {
        return super.getMessage();
    }
}

