/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.enums;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.util.Fields;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.mapper.Mapper;
import java.lang.reflect.Field;
import java.util.EnumSet;

public class EnumSetConverter
implements Converter {
    private static final Field typeField;
    private final Mapper mapper;

    public EnumSetConverter(Mapper mapper) {
        this.mapper = mapper;
    }

    public boolean canConvert(Class type) {
        return EnumSet.class.isAssignableFrom(type);
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        EnumSet set = (EnumSet)source;
        Class enumTypeForSet = (Class)Fields.read(typeField, set);
        writer.addAttribute(this.mapper.aliasForAttribute("enum-type"), this.mapper.serializedClass(enumTypeForSet));
        writer.setValue(this.joinEnumValues(set));
    }

    private String joinEnumValues(EnumSet set) {
        boolean seenFirst = false;
        StringBuffer result = new StringBuffer();
        for (Enum value : set) {
            if (seenFirst) {
                result.append(',');
            } else {
                seenFirst = true;
            }
            result.append(value.name());
        }
        return result.toString();
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        Class enumTypeForSet = this.mapper.realClass(reader.getAttribute(this.mapper.aliasForAttribute("enum-type")));
        EnumSet set = EnumSet.noneOf(enumTypeForSet);
        String[] enumValues = reader.getValue().split(",");
        for (int i = 0; i < enumValues.length; ++i) {
            String enumValue = enumValues[i];
            if (enumValue.length() <= 0) continue;
            set.add(Enum.valueOf(enumTypeForSet, enumValue));
        }
        return set;
    }

    static {
        Field assumedTypeField = null;
        Field[] fields = EnumSet.class.getDeclaredFields();
        for (int i = 0; i < fields.length; ++i) {
            if (fields[i].getType() != Class.class) continue;
            assumedTypeField = fields[i];
            assumedTypeField.setAccessible(true);
            break;
        }
        if (assumedTypeField == null) {
            throw new InternalError("Cannot detect element type of EnumSet");
        }
        typeField = assumedTypeField;
    }
}

