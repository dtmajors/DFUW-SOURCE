/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.alias.ClassMapper;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;

public class OuterClassMapper
extends MapperWrapper {
    private final String alias;

    public OuterClassMapper(Mapper wrapped) {
        this(wrapped, "outer-class");
    }

    public OuterClassMapper(Mapper wrapped, String alias) {
        super(wrapped);
        this.alias = alias;
    }

    public OuterClassMapper(ClassMapper wrapped) {
        this((Mapper)wrapped);
    }

    public OuterClassMapper(ClassMapper wrapped, String alias) {
        this((Mapper)wrapped, alias);
    }

    public String serializedMember(Class type, String memberName) {
        if (memberName.equals("this$0")) {
            return this.alias;
        }
        return super.serializedMember(type, memberName);
    }

    public String realMember(Class type, String serialized) {
        if (serialized.equals(this.alias)) {
            return "this$0";
        }
        return super.realMember(type, serialized);
    }
}

