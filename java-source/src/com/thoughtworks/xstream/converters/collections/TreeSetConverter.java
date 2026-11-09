/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.collections;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.collections.CollectionConverter;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.mapper.Mapper;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetConverter
extends CollectionConverter {
    static /* synthetic */ Class class$java$util$TreeSet;

    public TreeSetConverter(Mapper mapper) {
        super(mapper);
    }

    public boolean canConvert(Class type) {
        return type.equals(class$java$util$TreeSet == null ? (class$java$util$TreeSet = TreeSetConverter.class$("java.util.TreeSet")) : class$java$util$TreeSet);
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        TreeSet treeSet = (TreeSet)source;
        Comparator comparator = treeSet.comparator();
        if (comparator == null) {
            writer.startNode("no-comparator");
            writer.endNode();
        } else {
            writer.startNode("comparator");
            writer.addAttribute("class", this.mapper().serializedClass(comparator.getClass()));
            context.convertAnother(comparator);
            writer.endNode();
        }
        super.marshal(source, writer, context);
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        TreeSet result;
        reader.moveDown();
        if (reader.getNodeName().equals("comparator")) {
            String comparatorClass = reader.getAttribute("class");
            Comparator comparator = (Comparator)context.convertAnother(null, this.mapper().realClass(comparatorClass));
            result = new TreeSet(comparator);
        } else if (reader.getNodeName().equals("no-comparator")) {
            result = new TreeSet();
        } else {
            throw new ConversionException("TreeSet does not contain <comparator> element");
        }
        reader.moveUp();
        super.populateCollection(reader, context, result);
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

