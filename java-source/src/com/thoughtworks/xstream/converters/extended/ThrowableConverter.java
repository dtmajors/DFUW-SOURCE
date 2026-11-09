/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class ThrowableConverter
implements Converter {
    private Converter defaultConverter;
    static /* synthetic */ Class class$java$lang$Throwable;

    public ThrowableConverter(Converter defaultConverter) {
        this.defaultConverter = defaultConverter;
    }

    public boolean canConvert(Class type) {
        return (class$java$lang$Throwable == null ? (class$java$lang$Throwable = ThrowableConverter.class$("java.lang.Throwable")) : class$java$lang$Throwable).isAssignableFrom(type);
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        Throwable throwable = (Throwable)source;
        if (throwable.getCause() == null) {
            try {
                throwable.initCause(null);
            }
            catch (IllegalStateException e) {
                // empty catch block
            }
        }
        throwable.getStackTrace();
        this.defaultConverter.marshal(throwable, writer, context);
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        return this.defaultConverter.unmarshal(reader, context);
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

