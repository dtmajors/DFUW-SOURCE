/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.util.CustomObjectInputStream;
import com.thoughtworks.xstream.core.util.CustomObjectOutputStream;
import com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.mapper.Mapper;
import java.io.Externalizable;
import java.io.IOException;
import java.io.NotActiveException;
import java.io.ObjectInputValidation;
import java.util.Map;

public class ExternalizableConverter
implements Converter {
    private Mapper mapper;
    static /* synthetic */ Class class$java$io$Externalizable;

    public ExternalizableConverter(Mapper mapper) {
        this.mapper = mapper;
    }

    public boolean canConvert(Class type) {
        return (class$java$io$Externalizable == null ? (class$java$io$Externalizable = ExternalizableConverter.class$("java.io.Externalizable")) : class$java$io$Externalizable).isAssignableFrom(type);
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        try {
            Externalizable externalizable = (Externalizable)source;
            CustomObjectOutputStream.StreamCallback callback = new CustomObjectOutputStream.StreamCallback(this, writer, context){
                private final /* synthetic */ HierarchicalStreamWriter val$writer;
                private final /* synthetic */ MarshallingContext val$context;
                private final /* synthetic */ ExternalizableConverter this$0;
                {
                    this.this$0 = externalizableConverter;
                    this.val$writer = hierarchicalStreamWriter;
                    this.val$context = marshallingContext;
                }

                public void writeToStream(Object object) {
                    if (object == null) {
                        this.val$writer.startNode("null");
                        this.val$writer.endNode();
                    } else {
                        ExtendedHierarchicalStreamWriterHelper.startNode(this.val$writer, ExternalizableConverter.access$000(this.this$0).serializedClass(object.getClass()), object.getClass());
                        this.val$context.convertAnother(object);
                        this.val$writer.endNode();
                    }
                }

                public void writeFieldsToStream(Map fields) {
                    throw new UnsupportedOperationException();
                }

                public void defaultWriteObject() {
                    throw new UnsupportedOperationException();
                }

                public void flush() {
                    this.val$writer.flush();
                }

                public void close() {
                    throw new UnsupportedOperationException("Objects are not allowed to call ObjecOutput.close() from writeExternal()");
                }
            };
            CustomObjectOutputStream objectOutput = CustomObjectOutputStream.getInstance(context, callback);
            externalizable.writeExternal(objectOutput);
            objectOutput.popCallback();
        }
        catch (IOException e) {
            throw new ConversionException("Cannot serialize " + source.getClass().getName() + " using Externalization", e);
        }
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        Class type = context.getRequiredType();
        try {
            Externalizable externalizable = (Externalizable)type.newInstance();
            CustomObjectInputStream.StreamCallback callback = new CustomObjectInputStream.StreamCallback(this, reader, context, externalizable){
                private final /* synthetic */ HierarchicalStreamReader val$reader;
                private final /* synthetic */ UnmarshallingContext val$context;
                private final /* synthetic */ Externalizable val$externalizable;
                private final /* synthetic */ ExternalizableConverter this$0;
                {
                    this.this$0 = externalizableConverter;
                    this.val$reader = hierarchicalStreamReader;
                    this.val$context = unmarshallingContext;
                    this.val$externalizable = externalizable;
                }

                public Object readFromStream() {
                    this.val$reader.moveDown();
                    Object streamItem = this.val$context.convertAnother(this.val$externalizable, ExternalizableConverter.access$000(this.this$0).realClass(this.val$reader.getNodeName()));
                    this.val$reader.moveUp();
                    return streamItem;
                }

                public Map readFieldsFromStream() {
                    throw new UnsupportedOperationException();
                }

                public void defaultReadObject() {
                    throw new UnsupportedOperationException();
                }

                public void registerValidation(ObjectInputValidation validation, int priority) throws NotActiveException {
                    throw new NotActiveException("stream inactive");
                }

                public void close() {
                    throw new UnsupportedOperationException("Objects are not allowed to call ObjectInput.close() from readExternal()");
                }
            };
            CustomObjectInputStream objectInput = CustomObjectInputStream.getInstance(context, callback);
            externalizable.readExternal(objectInput);
            objectInput.popCallback();
            return externalizable;
        }
        catch (InstantiationException e) {
            throw new ConversionException("Cannot construct " + type.getClass(), e);
        }
        catch (IllegalAccessException e) {
            throw new ConversionException("Cannot construct " + type.getClass(), e);
        }
        catch (IOException e) {
            throw new ConversionException("Cannot externalize " + type.getClass(), e);
        }
        catch (ClassNotFoundException e) {
            throw new ConversionException("Cannot externalize " + type.getClass(), e);
        }
    }

    static /* synthetic */ Class class$(String x0) {
        try {
            return Class.forName(x0);
        }
        catch (ClassNotFoundException x1) {
            throw new NoClassDefFoundError(x1.getMessage());
        }
    }

    static /* synthetic */ Mapper access$000(ExternalizableConverter x0) {
        return x0.mapper;
    }
}

