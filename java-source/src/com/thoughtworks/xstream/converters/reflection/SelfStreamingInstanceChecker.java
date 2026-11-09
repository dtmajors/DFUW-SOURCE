/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class SelfStreamingInstanceChecker
implements Converter {
    private final Object self;
    private Converter defaultConverter;

    public SelfStreamingInstanceChecker(Converter defaultConverter, Object xstream) {
        this.defaultConverter = defaultConverter;
        this.self = xstream;
    }

    public boolean canConvert(Class type) {
        return type == this.self.getClass();
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        if (source == this.self) {
            throw new ConversionException("Cannot marshal the XStream instance in action");
        }
        this.defaultConverter.marshal(source, writer, context);
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        return this.defaultConverter.unmarshal(reader, context);
    }
}

