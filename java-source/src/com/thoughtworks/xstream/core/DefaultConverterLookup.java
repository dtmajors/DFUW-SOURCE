/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.alias.ClassMapper;
import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.core.util.PrioritizedList;
import com.thoughtworks.xstream.mapper.Mapper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DefaultConverterLookup
implements ConverterLookup {
    private final PrioritizedList converters = new PrioritizedList();
    private transient Map typeToConverterMap = Collections.synchronizedMap(new HashMap());
    private final Mapper mapper;

    public DefaultConverterLookup(Mapper mapper) {
        this.mapper = mapper;
    }

    public DefaultConverterLookup(ClassMapper classMapper) {
        this((Mapper)classMapper);
    }

    public Converter lookupConverterForType(Class type) {
        Converter cachedConverter = (Converter)this.typeToConverterMap.get(type);
        if (cachedConverter != null) {
            return cachedConverter;
        }
        Class mapType = this.mapper.defaultImplementationOf(type);
        Iterator iterator = this.converters.iterator();
        while (iterator.hasNext()) {
            Converter converter = (Converter)iterator.next();
            if (!converter.canConvert(mapType)) continue;
            this.typeToConverterMap.put(type, converter);
            return converter;
        }
        throw new ConversionException("No converter specified for " + type);
    }

    public void registerConverter(Converter converter, int priority) {
        this.converters.add(converter, priority);
        Iterator iter = this.typeToConverterMap.keySet().iterator();
        while (iter.hasNext()) {
            Class type = (Class)iter.next();
            if (!converter.canConvert(type)) continue;
            iter.remove();
        }
    }

    private Object readResolve() {
        this.typeToConverterMap = Collections.synchronizedMap(new HashMap());
        return this;
    }
}

