/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.collections;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.mapper.Mapper;
import java.util.Iterator;
import java.util.Map;

public class MapConverter
extends AbstractCollectionConverter {
    static /* synthetic */ Class class$java$util$HashMap;
    static /* synthetic */ Class class$java$util$Hashtable;
    static /* synthetic */ Class class$java$util$Map$Entry;

    public MapConverter(Mapper mapper) {
        super(mapper);
    }

    public boolean canConvert(Class type) {
        return type.equals(class$java$util$HashMap == null ? (class$java$util$HashMap = MapConverter.class$("java.util.HashMap")) : class$java$util$HashMap) || type.equals(class$java$util$Hashtable == null ? (class$java$util$Hashtable = MapConverter.class$("java.util.Hashtable")) : class$java$util$Hashtable) || type.getName().equals("java.util.LinkedHashMap") || type.getName().equals("sun.font.AttributeMap");
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        Map map = (Map)source;
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            writer.startNode(this.mapper().serializedClass(class$java$util$Map$Entry == null ? MapConverter.class$("java.util.Map$Entry") : class$java$util$Map$Entry));
            this.writeItem(entry.getKey(), context, writer);
            this.writeItem(entry.getValue(), context, writer);
            writer.endNode();
        }
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        Map map = (Map)this.createCollection(context.getRequiredType());
        this.populateMap(reader, context, map);
        return map;
    }

    protected void populateMap(HierarchicalStreamReader reader, UnmarshallingContext context, Map map) {
        while (reader.hasMoreChildren()) {
            reader.moveDown();
            reader.moveDown();
            Object key = this.readItem(reader, context, map);
            reader.moveUp();
            reader.moveDown();
            Object value = this.readItem(reader, context, map);
            reader.moveUp();
            map.put(key, value);
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

