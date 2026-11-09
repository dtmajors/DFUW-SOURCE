/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.core.TreeUnmarshaller;
import com.thoughtworks.xstream.core.util.FastStack;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.mapper.Mapper;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractReferenceUnmarshaller
extends TreeUnmarshaller {
    private Map values = new HashMap();
    private FastStack parentStack = new FastStack(16);

    public AbstractReferenceUnmarshaller(Object root, HierarchicalStreamReader reader, ConverterLookup converterLookup, Mapper mapper) {
        super(root, reader, converterLookup, mapper);
    }

    protected Object convert(Object parent, Class type, Converter converter) {
        String reference;
        Object parentReferenceKey;
        if (this.parentStack.size() > 0 && (parentReferenceKey = this.parentStack.peek()) != null && !this.values.containsKey(parentReferenceKey)) {
            this.values.put(parentReferenceKey, parent);
        }
        if ((reference = this.reader.getAttribute(this.getMapper().aliasForAttribute("reference"))) != null) {
            return this.values.get(this.getReferenceKey(reference));
        }
        Object currentReferenceKey = this.getCurrentReferenceKey();
        this.parentStack.push(currentReferenceKey);
        Object result = super.convert(parent, type, converter);
        if (currentReferenceKey != null) {
            this.values.put(currentReferenceKey, result);
        }
        this.parentStack.popSilently();
        return result;
    }

    protected abstract Object getReferenceKey(String var1);

    protected abstract Object getCurrentReferenceKey();
}

