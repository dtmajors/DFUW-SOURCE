/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class NullConverter
implements Converter {
    static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$Mapper$Null;

    public boolean canConvert(Class type) {
        return type == null || (class$com$thoughtworks$xstream$mapper$Mapper$Null == null ? (class$com$thoughtworks$xstream$mapper$Mapper$Null = NullConverter.class$("com.thoughtworks.xstream.mapper.Mapper$Null")) : class$com$thoughtworks$xstream$mapper$Mapper$Null).isAssignableFrom(type);
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        ExtendedHierarchicalStreamWriterHelper.startNode(writer, "null", null);
        writer.endNode();
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        return null;
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

