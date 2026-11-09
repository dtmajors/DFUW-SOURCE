/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.alias.ClassMapper;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CachingMapper
extends MapperWrapper {
    private transient Map cache = Collections.synchronizedMap(new HashMap());

    public CachingMapper(Mapper wrapped) {
        super(wrapped);
    }

    public CachingMapper(ClassMapper wrapped) {
        this((Mapper)wrapped);
    }

    public Class realClass(String elementName) {
        Class cached = (Class)this.cache.get(elementName);
        if (cached != null) {
            return cached;
        }
        Class result = super.realClass(elementName);
        this.cache.put(elementName, result);
        return result;
    }

    private Object readResolve() {
        this.cache = Collections.synchronizedMap(new HashMap());
        return this;
    }
}

