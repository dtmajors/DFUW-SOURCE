/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AttributeMapper
extends MapperWrapper {
    private final Map fieldNameToTypeMap = new HashMap();
    private final Set typeSet = new HashSet();
    private ConverterLookup converterLookup;
    private final Set fieldToUseAsAttribute = new HashSet();

    public AttributeMapper(Mapper wrapped) {
        this(wrapped, null);
    }

    public AttributeMapper(Mapper wrapped, ConverterLookup converterLookup) {
        super(wrapped);
        this.converterLookup = converterLookup;
    }

    public void setConverterLookup(ConverterLookup converterLookup) {
        this.converterLookup = converterLookup;
    }

    public void addAttributeFor(String fieldName, Class type) {
        this.fieldNameToTypeMap.put(fieldName, type);
    }

    public void addAttributeFor(Class type) {
        this.typeSet.add(type);
    }

    protected SingleValueConverter getLocalConverterFromItemType(Class type) {
        Converter converter = this.converterLookup.lookupConverterForType(type);
        if (converter != null && converter instanceof SingleValueConverter) {
            return (SingleValueConverter)((Object)converter);
        }
        return null;
    }

    public SingleValueConverter getConverterFromItemType(String fieldName, Class type) {
        if (this.fieldNameToTypeMap.get(fieldName) == type) {
            return this.getLocalConverterFromItemType(type);
        }
        return null;
    }

    public SingleValueConverter getConverterFromItemType(String fieldName, Class type, Class definedIn) {
        Field field = this.getField(definedIn, fieldName);
        if (this.fieldToUseAsAttribute.contains(field)) {
            return this.getLocalConverterFromItemType(type);
        }
        return this.getConverterFromItemType(fieldName, type);
    }

    public SingleValueConverter getConverterFromItemType(Class type) {
        if (this.typeSet.contains(type)) {
            return this.getLocalConverterFromItemType(type);
        }
        return null;
    }

    public SingleValueConverter getConverterFromAttribute(String attributeName) {
        SingleValueConverter converter = null;
        Class type = (Class)this.fieldNameToTypeMap.get(attributeName);
        if (type != null) {
            converter = this.getLocalConverterFromItemType(type);
        }
        return converter;
    }

    public SingleValueConverter getConverterFromAttribute(Class type, String attribute) {
        Field field = this.getField(type, attribute);
        if (this.fieldToUseAsAttribute.contains(field)) {
            return this.getLocalConverterFromItemType(field.getType());
        }
        return this.getConverterFromAttribute(attribute);
    }

    public void addAttributeFor(Field field) {
        this.fieldToUseAsAttribute.add(field);
    }

    private Field getField(Class definedIn, String fieldName) {
        try {
            return definedIn.getDeclaredField(fieldName);
        }
        catch (NoSuchFieldException e2) {
            throw new IllegalArgumentException(fieldName + " is not a proper field of " + definedIn.getName());
        }
    }
}

