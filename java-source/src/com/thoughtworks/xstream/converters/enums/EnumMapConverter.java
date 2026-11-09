/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.enums;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.collections.MapConverter;
import com.thoughtworks.xstream.core.util.Fields;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.mapper.Mapper;
import java.lang.reflect.Field;
import java.util.EnumMap;

public class EnumMapConverter
extends MapConverter {
    private final Field typeField = Fields.find(EnumMap.class, "keyType");

    public EnumMapConverter(Mapper mapper) {
        super(mapper);
    }

    public boolean canConvert(Class type) {
        return type == EnumMap.class;
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        Class type = (Class)Fields.read(this.typeField, source);
        writer.addAttribute(this.mapper().aliasForAttribute("enum-type"), this.mapper().serializedClass(type));
        super.marshal(source, writer, context);
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        Class type = this.mapper().realClass(reader.getAttribute(this.mapper().aliasForAttribute("enum-type")));
        EnumMap map = new EnumMap(type);
        this.populateMap(reader, context, map);
        return map;
    }
}

