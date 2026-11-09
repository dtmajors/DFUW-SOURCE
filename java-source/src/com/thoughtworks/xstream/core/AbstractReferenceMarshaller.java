/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.core.AbstractReferenceMarshaller;
import com.thoughtworks.xstream.core.TreeMarshaller;
import com.thoughtworks.xstream.core.util.ObjectIdDictionary;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.path.Path;
import com.thoughtworks.xstream.io.path.PathTracker;
import com.thoughtworks.xstream.io.path.PathTrackingWriter;
import com.thoughtworks.xstream.mapper.Mapper;

public abstract class AbstractReferenceMarshaller
extends TreeMarshaller {
    private ObjectIdDictionary references = new ObjectIdDictionary();
    private ObjectIdDictionary implicitElements = new ObjectIdDictionary();
    private PathTracker pathTracker = new PathTracker();
    private Path lastPath;

    public AbstractReferenceMarshaller(HierarchicalStreamWriter writer, ConverterLookup converterLookup, Mapper mapper) {
        super(writer, converterLookup, mapper);
        this.writer = new PathTrackingWriter(writer, this.pathTracker);
    }

    public void convert(Object item, Converter converter) {
        if (this.getMapper().isImmutableValueType(item.getClass())) {
            converter.marshal(item, this.writer, this);
        } else {
            Path currentPath = this.pathTracker.getPath();
            Object existingReferenceKey = this.references.lookupId(item);
            if (existingReferenceKey != null) {
                this.writer.addAttribute(this.getMapper().aliasForAttribute("reference"), this.createReference(currentPath, existingReferenceKey));
            } else {
                if (this.implicitElements.lookupId(item) != null) {
                    throw new ReferencedImplicitElementException(item, currentPath);
                }
                Object newReferenceKey = this.createReferenceKey(currentPath);
                if (this.lastPath == null || !currentPath.isAncestor(this.lastPath)) {
                    this.fireValidReference(newReferenceKey);
                    this.lastPath = currentPath;
                    this.references.associateId(item, newReferenceKey);
                } else {
                    this.implicitElements.associateId(item, newReferenceKey);
                }
                converter.marshal(item, this.writer, this);
            }
        }
    }

    protected abstract String createReference(Path var1, Object var2);

    protected abstract Object createReferenceKey(Path var1);

    protected abstract void fireValidReference(Object var1);
}

