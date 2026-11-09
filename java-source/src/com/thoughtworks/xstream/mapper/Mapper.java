/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.mapper.Mapper;

public interface Mapper {
    public String serializedClass(Class var1);

    public Class realClass(String var1);

    public String serializedMember(Class var1, String var2);

    public String realMember(Class var1, String var2);

    public boolean isImmutableValueType(Class var1);

    public Class defaultImplementationOf(Class var1);

    public String attributeForImplementationClass();

    public String attributeForClassDefiningField();

    public String attributeForReadResolveField();

    public String attributeForEnumType();

    public String aliasForAttribute(String var1);

    public String attributeForAlias(String var1);

    public String getFieldNameForItemTypeAndName(Class var1, Class var2, String var3);

    public Class getItemTypeForItemFieldName(Class var1, String var2);

    public ImplicitCollectionMapping getImplicitCollectionDefForFieldName(Class var1, String var2);

    public boolean shouldSerializeMember(Class var1, String var2);

    public SingleValueConverter getConverterFromItemType(String var1, Class var2);

    public SingleValueConverter getConverterFromItemType(Class var1);

    public SingleValueConverter getConverterFromAttribute(String var1);

    public Mapper lookupMapperOfType(Class var1);

    public SingleValueConverter getConverterFromItemType(String var1, Class var2, Class var3);

    public String aliasForAttribute(Class var1, String var2);

    public String attributeForAlias(Class var1, String var2);

    public SingleValueConverter getConverterFromAttribute(Class var1, String var2);
}

