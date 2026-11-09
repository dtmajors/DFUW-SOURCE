/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.collections;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.mapper.Mapper;

public abstract class AbstractCollectionConverter
implements Converter {
    private final Mapper mapper;

    public abstract boolean canConvert(Class var1);

    public AbstractCollectionConverter(Mapper mapper) {
        this.mapper = mapper;
    }

    protected Mapper mapper() {
        return this.mapper;
    }

    public abstract void marshal(Object var1, HierarchicalStreamWriter var2, MarshallingContext var3);

    public abstract Object unmarshal(HierarchicalStreamReader var1, UnmarshallingContext var2);

    protected void writeItem(Object item, MarshallingContext context, HierarchicalStreamWriter writer) {
        if (item == null) {
            String name = this.mapper().serializedClass(null);
            writer.startNode(name);
            writer.endNode();
        } else {
            String name = this.mapper().serializedClass(item.getClass());
            ExtendedHierarchicalStreamWriterHelper.startNode(writer, name, item.getClass());
            context.convertAnother(item);
            writer.endNode();
        }
    }

    protected Object readItem(HierarchicalStreamReader reader, UnmarshallingContext context, Object current) {
        String classAttribute = reader.getAttribute(this.mapper().aliasForAttribute("class"));
        Class type = classAttribute == null ? this.mapper().realClass(reader.getNodeName()) : this.mapper().realClass(classAttribute);
        return context.convertAnother(current, type);
    }

    protected Object createCollection(Class type) {
        Class defaultType = this.mapper().defaultImplementationOf(type);
        try {
            return defaultType.newInstance();
        }
        catch (InstantiationException e) {
            throw new ConversionException("Cannot instantiate " + defaultType.getName(), e);
        }
        catch (IllegalAccessException e) {
            throw new ConversionException("Cannot instantiate " + defaultType.getName(), e);
        }
    }
}

