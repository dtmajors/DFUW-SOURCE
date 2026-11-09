/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.alias.ClassMapper;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.core.AbstractReferenceMarshaller;
import com.thoughtworks.xstream.core.ReferenceByIdMarshaller;
import com.thoughtworks.xstream.core.SequenceGenerator;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.path.Path;
import com.thoughtworks.xstream.mapper.Mapper;

public class ReferenceByIdMarshaller
extends AbstractReferenceMarshaller {
    private final IDGenerator idGenerator;

    public ReferenceByIdMarshaller(HierarchicalStreamWriter writer, ConverterLookup converterLookup, Mapper mapper, IDGenerator idGenerator) {
        super(writer, converterLookup, mapper);
        this.idGenerator = idGenerator;
    }

    public ReferenceByIdMarshaller(HierarchicalStreamWriter writer, ConverterLookup converterLookup, Mapper mapper) {
        this(writer, converterLookup, mapper, (IDGenerator)new SequenceGenerator(1));
    }

    public ReferenceByIdMarshaller(HierarchicalStreamWriter writer, ConverterLookup converterLookup, ClassMapper classMapper, IDGenerator idGenerator) {
        this(writer, converterLookup, (Mapper)classMapper, idGenerator);
    }

    public ReferenceByIdMarshaller(HierarchicalStreamWriter writer, ConverterLookup converterLookup, ClassMapper classMapper) {
        this(writer, converterLookup, (Mapper)classMapper);
    }

    protected String createReference(Path currentPath, Object existingReferenceKey) {
        return existingReferenceKey.toString();
    }

    protected Object createReferenceKey(Path currentPath) {
        return this.idGenerator.next();
    }

    protected void fireValidReference(Object referenceKey) {
        this.writer.addAttribute(this.getMapper().aliasForAttribute("id"), referenceKey.toString());
    }
}

