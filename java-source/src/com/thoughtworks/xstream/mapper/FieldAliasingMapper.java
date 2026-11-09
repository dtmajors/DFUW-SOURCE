/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.alias.ClassMapper;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FieldAliasingMapper
extends MapperWrapper {
    protected final Map fieldToAliasMap = new HashMap();
    protected final Map aliasToFieldMap = new HashMap();
    protected final Set fieldsToOmit = new HashSet();

    public FieldAliasingMapper(Mapper wrapped) {
        super(wrapped);
    }

    public FieldAliasingMapper(ClassMapper wrapped) {
        this((Mapper)wrapped);
    }

    public void addFieldAlias(String alias, Class type, String fieldName) {
        this.fieldToAliasMap.put(this.key(type, fieldName), alias);
        this.aliasToFieldMap.put(this.key(type, alias), fieldName);
    }

    private Object key(Class type, String value) {
        return type.getName() + '.' + value;
    }

    public String serializedMember(Class type, String memberName) {
        String alias = (String)this.fieldToAliasMap.get(this.key(type, memberName));
        if (alias == null) {
            return super.serializedMember(type, memberName);
        }
        return alias;
    }

    public String realMember(Class type, String serialized) {
        String real = null;
        for (Class declaringType = type; real == null && declaringType != null; declaringType = declaringType.getSuperclass()) {
            real = (String)this.aliasToFieldMap.get(this.key(declaringType, serialized));
        }
        if (real == null) {
            return super.realMember(type, serialized);
        }
        return real;
    }

    public boolean shouldSerializeMember(Class definedIn, String fieldName) {
        return !this.fieldsToOmit.contains(this.key(definedIn, fieldName));
    }

    public void omitField(Class type, String fieldName) {
        this.fieldsToOmit.add(this.key(type, fieldName));
    }
}

