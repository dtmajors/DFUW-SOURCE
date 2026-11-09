/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.mapper.CannotResolveClassException;
import com.thoughtworks.xstream.mapper.Mapper;

public class DefaultMapper
implements Mapper {
    private final ClassLoader classLoader;
    private transient String classAttributeIdentifier;

    public DefaultMapper(ClassLoader classLoader) {
        this.classLoader = classLoader;
        this.classAttributeIdentifier = "class";
    }

    public DefaultMapper(ClassLoader classLoader, String classAttributeIdentifier) {
        this(classLoader);
        this.classAttributeIdentifier = classAttributeIdentifier == null ? "class" : classAttributeIdentifier;
    }

    private Object readResolve() {
        this.classAttributeIdentifier = "class";
        return this;
    }

    public String serializedClass(Class type) {
        return type.getName();
    }

    public Class realClass(String elementName) {
        try {
            return this.classLoader.loadClass(elementName);
        }
        catch (ClassNotFoundException e2) {
            throw new CannotResolveClassException(elementName + " : " + e2.getMessage());
        }
    }

    public Class defaultImplementationOf(Class type) {
        return type;
    }

    public String attributeForClassDefiningField() {
        return "defined-in";
    }

    public String attributeForReadResolveField() {
        return "resolves-to";
    }

    public String attributeForEnumType() {
        return "enum-type";
    }

    public String attributeForImplementationClass() {
        return this.classAttributeIdentifier;
    }

    public String aliasForAttribute(String attribute) {
        return attribute;
    }

    public String attributeForAlias(String alias) {
        return alias;
    }

    public boolean isImmutableValueType(Class type) {
        return false;
    }

    public String getFieldNameForItemTypeAndName(Class definedIn, Class itemType, String itemFieldName) {
        return null;
    }

    public Class getItemTypeForItemFieldName(Class definedIn, String itemFieldName) {
        return null;
    }

    public Mapper.ImplicitCollectionMapping getImplicitCollectionDefForFieldName(Class itemType, String fieldName) {
        return null;
    }

    public boolean shouldSerializeMember(Class definedIn, String fieldName) {
        return true;
    }

    public String lookupName(Class type) {
        return this.serializedClass(type);
    }

    public Class lookupType(String elementName) {
        return this.realClass(elementName);
    }

    public String serializedMember(Class type, String memberName) {
        return memberName;
    }

    public String realMember(Class type, String serialized) {
        return serialized;
    }

    public SingleValueConverter getConverterFromAttribute(String name) {
        return null;
    }

    public SingleValueConverter getConverterFromItemType(String fieldName, Class type) {
        return null;
    }

    public SingleValueConverter getConverterFromItemType(Class type) {
        return null;
    }

    public Mapper lookupMapperOfType(Class type) {
        return null;
    }

    public SingleValueConverter getConverterFromItemType(String fieldName, Class type, Class definedIn) {
        return null;
    }

    public String aliasForAttribute(Class definedIn, String fieldName) {
        return fieldName;
    }

    public String attributeForAlias(Class definedIn, String alias) {
        return alias;
    }

    public SingleValueConverter getConverterFromAttribute(Class type, String attribute) {
        return null;
    }
}

