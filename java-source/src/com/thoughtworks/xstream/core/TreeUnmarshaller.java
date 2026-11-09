/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.alias.ClassMapper;
import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.converters.DataHolder;
import com.thoughtworks.xstream.converters.ErrorWriter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.MapBackedDataHolder;
import com.thoughtworks.xstream.core.util.FastStack;
import com.thoughtworks.xstream.core.util.PrioritizedList;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.mapper.Mapper;
import java.util.Iterator;

public class TreeUnmarshaller
implements UnmarshallingContext {
    private Object root;
    protected HierarchicalStreamReader reader;
    private ConverterLookup converterLookup;
    private Mapper mapper;
    private FastStack types = new FastStack(16);
    private DataHolder dataHolder;
    private final PrioritizedList validationList = new PrioritizedList();

    public TreeUnmarshaller(Object root, HierarchicalStreamReader reader, ConverterLookup converterLookup, Mapper mapper) {
        this.root = root;
        this.reader = reader;
        this.converterLookup = converterLookup;
        this.mapper = mapper;
    }

    public TreeUnmarshaller(Object root, HierarchicalStreamReader reader, ConverterLookup converterLookup, ClassMapper classMapper) {
        this(root, reader, converterLookup, (Mapper)classMapper);
    }

    public Object convertAnother(Object parent, Class type) {
        Converter converter = this.converterLookup.lookupConverterForType(type);
        return this.convert(parent, type, converter);
    }

    public Object convertAnother(Object parent, Class type, Converter converter) {
        return this.convert(parent, type, converter);
    }

    protected Object convert(Object parent, Class type, Converter converter) {
        try {
            this.types.push(this.mapper.defaultImplementationOf(type));
            Object result = converter.unmarshal(this.reader, this);
            this.types.popSilently();
            return result;
        }
        catch (ConversionException conversionException) {
            this.addInformationTo(conversionException, type);
            throw conversionException;
        }
        catch (RuntimeException e) {
            ConversionException conversionException = new ConversionException(e);
            this.addInformationTo(conversionException, type);
            throw conversionException;
        }
    }

    private void addInformationTo(ErrorWriter errorWriter, Class type) {
        errorWriter.add("class", type.getName());
        errorWriter.add("required-type", this.getRequiredType().getName());
        this.reader.appendErrors(errorWriter);
    }

    public void addCompletionCallback(Runnable work, int priority) {
        this.validationList.add(work, priority);
    }

    public Object currentObject() {
        return this.types.size() == 1 ? this.root : null;
    }

    public Class getRequiredType() {
        return (Class)this.types.peek();
    }

    public Object get(Object key) {
        this.lazilyCreateDataHolder();
        return this.dataHolder.get(key);
    }

    public void put(Object key, Object value) {
        this.lazilyCreateDataHolder();
        this.dataHolder.put(key, value);
    }

    public Iterator keys() {
        this.lazilyCreateDataHolder();
        return this.dataHolder.keys();
    }

    private void lazilyCreateDataHolder() {
        if (this.dataHolder == null) {
            this.dataHolder = new MapBackedDataHolder();
        }
    }

    public Object start(DataHolder dataHolder) {
        this.dataHolder = dataHolder;
        String classAttribute = this.reader.getAttribute(this.mapper.aliasForAttribute("class"));
        Class type = classAttribute == null ? this.mapper.realClass(this.reader.getNodeName()) : this.mapper.realClass(classAttribute);
        Object result = this.convertAnother(null, type);
        Iterator validations = this.validationList.iterator();
        while (validations.hasNext()) {
            Runnable runnable = (Runnable)validations.next();
            runnable.run();
        }
        return result;
    }

    protected Mapper getMapper() {
        return this.mapper;
    }
}

