/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.collections;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.mapper.Mapper;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConverter
extends AbstractCollectionConverter {
    static /* synthetic */ Class class$java$util$ArrayList;
    static /* synthetic */ Class class$java$util$HashSet;
    static /* synthetic */ Class class$java$util$LinkedList;
    static /* synthetic */ Class class$java$util$Vector;

    public CollectionConverter(Mapper mapper) {
        super(mapper);
    }

    public boolean canConvert(Class type) {
        return type.equals(class$java$util$ArrayList == null ? (class$java$util$ArrayList = CollectionConverter.class$("java.util.ArrayList")) : class$java$util$ArrayList) || type.equals(class$java$util$HashSet == null ? (class$java$util$HashSet = CollectionConverter.class$("java.util.HashSet")) : class$java$util$HashSet) || type.equals(class$java$util$LinkedList == null ? (class$java$util$LinkedList = CollectionConverter.class$("java.util.LinkedList")) : class$java$util$LinkedList) || type.equals(class$java$util$Vector == null ? (class$java$util$Vector = CollectionConverter.class$("java.util.Vector")) : class$java$util$Vector) || JVM.is14() && type.getName().equals("java.util.LinkedHashSet");
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        Collection collection = (Collection)source;
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object item = iterator.next();
            this.writeItem(item, context, writer);
        }
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        Collection collection = (Collection)this.createCollection(context.getRequiredType());
        this.populateCollection(reader, context, collection);
        return collection;
    }

    protected void populateCollection(HierarchicalStreamReader reader, UnmarshallingContext context, Collection collection) {
        while (reader.hasMoreChildren()) {
            reader.moveDown();
            Object item = this.readItem(reader, context, collection);
            collection.add(item);
            reader.moveUp();
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

