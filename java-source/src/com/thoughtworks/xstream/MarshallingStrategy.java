/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream;

import com.thoughtworks.xstream.alias.ClassMapper;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.converters.DataHolder;
import com.thoughtworks.xstream.core.DefaultConverterLookup;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.mapper.Mapper;

public interface MarshallingStrategy {
    public Object unmarshal(Object var1, HierarchicalStreamReader var2, DataHolder var3, ConverterLookup var4, Mapper var5);

    public void marshal(HierarchicalStreamWriter var1, Object var2, ConverterLookup var3, Mapper var4, DataHolder var5);

    public Object unmarshal(Object var1, HierarchicalStreamReader var2, DataHolder var3, DefaultConverterLookup var4, ClassMapper var5);

    public void marshal(HierarchicalStreamWriter var1, Object var2, DefaultConverterLookup var3, ClassMapper var4, DataHolder var5);
}

