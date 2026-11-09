/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.mapper.AttributeAliasingMapper;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AttributeAliasingMapper
extends MapperWrapper {
    private final Map aliasToName = new HashMap();
    private transient Map nameToAlias = new HashMap();
    private final Map fieldToAlias = new HashMap();
    private final Map aliasToField = new HashMap();

    public AttributeAliasingMapper(Mapper wrapped) {
        super(wrapped);
    }

    public void addAliasFor(String attributeName, String alias) {
        this.aliasToName.put(alias, attributeName);
        this.nameToAlias.put(attributeName, alias);
    }

    public String aliasForAttribute(String attribute) {
        String alias = (String)this.nameToAlias.get(attribute);
        return alias == null ? super.aliasForAttribute(attribute) : alias;
    }

    public String attributeForAlias(String alias) {
        String name = (String)this.aliasToName.get(alias);
        return name == null ? super.attributeForAlias(alias) : name;
    }

    private String getAliasForName(String name) {
        String alias = (String)this.nameToAlias.get(name);
        return alias == null ? name : alias;
    }

    private Object readResolve() {
        this.nameToAlias = new HashMap();
        Iterator iter = this.aliasToName.keySet().iterator();
        while (iter.hasNext()) {
            Object alias = iter.next();
            this.nameToAlias.put(this.aliasToName.get(alias), alias);
        }
        return this;
    }

    public String aliasForAttribute(Class definedIn, String fieldName) {
        Field field = this.getField(definedIn, fieldName);
        if (this.fieldToAlias.containsKey(field)) {
            return (String)this.fieldToAlias.get(field);
        }
        return this.aliasForAttribute(fieldName);
    }

    public String attributeForAlias(Class definedIn, String alias) {
        if (this.aliasToField.containsKey(this.makeKey(definedIn, alias))) {
            return (String)this.aliasToField.get(this.makeKey(definedIn, alias));
        }
        return this.attributeForAlias(alias);
    }

    private AliasInfo makeKey(Class definedIn, String alias) {
        return new AliasInfo(this, definedIn, alias);
    }

    public void addAliasFor(Class definedIn, String fieldName, String alias) {
        try {
            Field field = definedIn.getDeclaredField(fieldName);
            this.fieldToAlias.put(field, alias);
            this.aliasToField.put(this.makeKey(definedIn, alias), fieldName);
        }
        catch (SecurityException e2) {
            throw new IllegalArgumentException(fieldName + " is not a proper field of " + definedIn.getName());
        }
        catch (NoSuchFieldException e3) {
            throw new IllegalArgumentException(fieldName + " is not a proper field of " + definedIn.getName());
        }
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

