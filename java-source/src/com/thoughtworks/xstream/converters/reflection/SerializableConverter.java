/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.converters.reflection.SerializableConverter;
import com.thoughtworks.xstream.core.util.CustomObjectInputStream;
import com.thoughtworks.xstream.core.util.CustomObjectOutputStream;
import com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.mapper.Mapper;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputValidation;
import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SerializableConverter
extends AbstractReflectionConverter {
    private static final String ELEMENT_NULL = "null";
    private static final String ELEMENT_DEFAULT = "default";
    private static final String ELEMENT_UNSERIALIZABLE_PARENTS = "unserializable-parents";
    private static final String ATTRIBUTE_CLASS = "class";
    private static final String ATTRIBUTE_SERIALIZATION = "serialization";
    private static final String ATTRIBUTE_VALUE_CUSTOM = "custom";
    private static final String ELEMENT_FIELDS = "fields";
    private static final String ELEMENT_FIELD = "field";
    private static final String ATTRIBUTE_NAME = "name";
    static /* synthetic */ Class class$java$io$Serializable;
    static /* synthetic */ Class class$java$lang$Object;

    public SerializableConverter(Mapper mapper, ReflectionProvider reflectionProvider) {
        super(mapper, new UnserializableParentsReflectionProvider(reflectionProvider));
    }

    public boolean canConvert(Class type) {
        return this.isSerializable(type);
    }

    private boolean isSerializable(Class type) {
        return (class$java$io$Serializable == null ? (class$java$io$Serializable = SerializableConverter.class$("java.io.Serializable")) : class$java$io$Serializable).isAssignableFrom(type) && (this.serializationMethodInvoker.supportsReadObject(type, true) || this.serializationMethodInvoker.supportsWriteObject(type, true));
    }

    public void doMarshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        writer.addAttribute(ATTRIBUTE_SERIALIZATION, ATTRIBUTE_VALUE_CUSTOM);
        Class[] currentType = new Class[1];
        boolean[] writtenClassWrapper = new boolean[]{false};
        CustomObjectOutputStream.StreamCallback callback = new CustomObjectOutputStream.StreamCallback(this, writer, context, currentType, source, writtenClassWrapper){
            private final /* synthetic */ HierarchicalStreamWriter val$writer;
            private final /* synthetic */ MarshallingContext val$context;
            private final /* synthetic */ Class[] val$currentType;
            private final /* synthetic */ Object val$source;
            private final /* synthetic */ boolean[] val$writtenClassWrapper;
            private final /* synthetic */ SerializableConverter this$0;
            {
                this.this$0 = serializableConverter;
                this.val$writer = hierarchicalStreamWriter;
                this.val$context = marshallingContext;
                this.val$currentType = classArray;
                this.val$source = object;
                this.val$writtenClassWrapper = blArray;
            }

            public void writeToStream(Object object) {
                if (object == null) {
                    this.val$writer.startNode("null");
                    this.val$writer.endNode();
                } else {
                    ExtendedHierarchicalStreamWriterHelper.startNode(this.val$writer, this.this$0.mapper.serializedClass(object.getClass()), object.getClass());
                    this.val$context.convertAnother(object);
                    this.val$writer.endNode();
                }
            }

            public void writeFieldsToStream(Map fields) {
                ObjectStreamClass objectStreamClass = ObjectStreamClass.lookup(this.val$currentType[0]);
                this.val$writer.startNode("default");
                Iterator<K> iterator = fields.keySet().iterator();
                while (iterator.hasNext()) {
                    String name = (String)iterator.next();
                    ObjectStreamField field = objectStreamClass.getField(name);
                    V value = fields.get(name);
                    if (field == null) {
                        throw new ObjectAccessException("Class " + value.getClass().getName() + " may not write a field named '" + name + "'");
                    }
                    if (value == null) continue;
                    this.val$writer.startNode(this.this$0.mapper.serializedMember(this.val$currentType[0], name));
                    if (field.getType() != value.getClass() && !field.getType().isPrimitive()) {
                        this.val$writer.addAttribute("class", this.this$0.mapper.serializedClass(value.getClass()));
                    }
                    this.val$context.convertAnother(value);
                    this.val$writer.endNode();
                }
                this.val$writer.endNode();
            }

            public void defaultWriteObject() {
                boolean writtenDefaultFields = false;
                ObjectStreamClass objectStreamClass = ObjectStreamClass.lookup(this.val$currentType[0]);
                if (objectStreamClass == null) {
                    return;
                }
                ObjectStreamField[] fields = objectStreamClass.getFields();
                for (int i = 0; i < fields.length; ++i) {
                    ObjectStreamField field = fields[i];
                    Object value = SerializableConverter.access$000(this.this$0, field, this.val$currentType[0], this.val$source);
                    if (value == null) continue;
                    if (!this.val$writtenClassWrapper[0]) {
                        this.val$writer.startNode(this.this$0.mapper.serializedClass(this.val$currentType[0]));
                        this.val$writtenClassWrapper[0] = true;
                    }
                    if (!writtenDefaultFields) {
                        this.val$writer.startNode("default");
                        writtenDefaultFields = true;
                    }
                    this.val$writer.startNode(this.this$0.mapper.serializedMember(this.val$currentType[0], field.getName()));
                    Class<?> actualType = value.getClass();
                    Class defaultType = this.this$0.mapper.defaultImplementationOf(field.getType());
                    if (!actualType.equals(defaultType)) {
                        this.val$writer.addAttribute("class", this.this$0.mapper.serializedClass(actualType));
                    }
                    this.val$context.convertAnother(value);
                    this.val$writer.endNode();
                }
                if (this.val$writtenClassWrapper[0] && !writtenDefaultFields) {
                    this.val$writer.startNode("default");
                    this.val$writer.endNode();
                } else if (writtenDefaultFields) {
                    this.val$writer.endNode();
                }
            }

            public void flush() {
                this.val$writer.flush();
            }

            public void close() {
                throw new UnsupportedOperationException("Objects are not allowed to call ObjectOutputStream.close() from writeObject()");
            }
        };
        try {
            boolean mustHandleUnserializableParent = false;
            Iterator classHieararchy = this.hierarchyFor(source.getClass()).iterator();
            while (classHieararchy.hasNext()) {
                currentType[0] = (Class)classHieararchy.next();
                if (!(class$java$io$Serializable == null ? SerializableConverter.class$("java.io.Serializable") : class$java$io$Serializable).isAssignableFrom(currentType[0])) {
                    mustHandleUnserializableParent = true;
                    continue;
                }
                if (mustHandleUnserializableParent) {
                    this.marshalUnserializableParent(writer, context, source);
                    mustHandleUnserializableParent = false;
                }
                if (this.serializationMethodInvoker.supportsWriteObject(currentType[0], false)) {
                    writtenClassWrapper[0] = true;
                    writer.startNode(this.mapper.serializedClass(currentType[0]));
                    CustomObjectOutputStream objectOutputStream = CustomObjectOutputStream.getInstance(context, callback);
                    this.serializationMethodInvoker.callWriteObject(currentType[0], source, objectOutputStream);
                    objectOutputStream.popCallback();
                    writer.endNode();
                    continue;
                }
                if (this.serializationMethodInvoker.supportsReadObject(currentType[0], false)) {
                    writtenClassWrapper[0] = true;
                    writer.startNode(this.mapper.serializedClass(currentType[0]));
                    callback.defaultWriteObject();
                    writer.endNode();
                    continue;
                }
                writtenClassWrapper[0] = false;
                callback.defaultWriteObject();
                if (!writtenClassWrapper[0]) continue;
                writer.endNode();
            }
        }
        catch (IOException e) {
            throw new ObjectAccessException("Could not call defaultWriteObject()", e);
        }
    }

    private void marshalUnserializableParent(HierarchicalStreamWriter writer, MarshallingContext context, Object replacedSource) {
        writer.startNode(ELEMENT_UNSERIALIZABLE_PARENTS);
        super.doMarshal(replacedSource, writer, context);
        writer.endNode();
    }

    private Object readField(ObjectStreamField field, Class type, Object instance) {
        try {
            Field javaField = type.getDeclaredField(field.getName());
            javaField.setAccessible(true);
            return javaField.get(instance);
        }
        catch (IllegalArgumentException e) {
            throw new ObjectAccessException("Could not get field " + field.getClass() + "." + field.getName(), e);
        }
        catch (IllegalAccessException e) {
            throw new ObjectAccessException("Could not get field " + field.getClass() + "." + field.getName(), e);
        }
        catch (NoSuchFieldException e) {
            throw new ObjectAccessException("Could not get field " + field.getClass() + "." + field.getName(), e);
        }
        catch (SecurityException e) {
            throw new ObjectAccessException("Could not get field " + field.getClass() + "." + field.getName(), e);
        }
    }

    protected List hierarchyFor(Class type) {
        ArrayList result = new ArrayList();
        while (type != (class$java$lang$Object == null ? SerializableConverter.class$("java.lang.Object") : class$java$lang$Object)) {
            result.add(type);
            type = type.getSuperclass();
        }
        Collections.reverse(result);
        return result;
    }

    public Object doUnmarshal(Object result, HierarchicalStreamReader reader, UnmarshallingContext context) {
        Class[] currentType = new Class[1];
        if (!ATTRIBUTE_VALUE_CUSTOM.equals(reader.getAttribute(ATTRIBUTE_SERIALIZATION))) {
            throw new ConversionException("Cannot deserialize object with new readObject()/writeObject() methods");
        }
        CustomObjectInputStream.StreamCallback callback = new CustomObjectInputStream.StreamCallback(this, reader, context, result, currentType){
            private final /* synthetic */ HierarchicalStreamReader val$reader;
            private final /* synthetic */ UnmarshallingContext val$context;
            private final /* synthetic */ Object val$result;
            private final /* synthetic */ Class[] val$currentType;
            private final /* synthetic */ SerializableConverter this$0;
            {
                this.this$0 = serializableConverter;
                this.val$reader = hierarchicalStreamReader;
                this.val$context = unmarshallingContext;
                this.val$result = object;
                this.val$currentType = classArray;
            }

            public Object readFromStream() {
                this.val$reader.moveDown();
                Class type = this.this$0.mapper.realClass(this.val$reader.getNodeName());
                Object value = this.val$context.convertAnother(this.val$result, type);
                this.val$reader.moveUp();
                return value;
            }

            public Map readFieldsFromStream() {
                HashMap<String, Object> fields = new HashMap<String, Object>();
                this.val$reader.moveDown();
                if (this.val$reader.getNodeName().equals("fields")) {
                    while (this.val$reader.hasMoreChildren()) {
                        this.val$reader.moveDown();
                        if (!this.val$reader.getNodeName().equals("field")) {
                            throw new ConversionException("Expected <field/> element inside <field/>");
                        }
                        String name = this.val$reader.getAttribute("name");
                        Class type = this.this$0.mapper.realClass(this.val$reader.getAttribute("class"));
                        Object value = this.val$context.convertAnother(this.val$result, type);
                        fields.put(name, value);
                        this.val$reader.moveUp();
                    }
                } else if (this.val$reader.getNodeName().equals("default")) {
                    ObjectStreamClass objectStreamClass = ObjectStreamClass.lookup(this.val$currentType[0]);
                    while (this.val$reader.hasMoreChildren()) {
                        Class<?> type;
                        this.val$reader.moveDown();
                        String name = this.val$reader.getNodeName();
                        String typeName = this.val$reader.getAttribute("class");
                        if (typeName != null) {
                            type = this.this$0.mapper.realClass(typeName);
                        } else {
                            ObjectStreamField field = objectStreamClass.getField(name);
                            if (field == null) {
                                throw new ObjectAccessException("Class " + this.val$currentType[0] + " does not contain a field named '" + name + "'");
                            }
                            type = field.getType();
                        }
                        Object value = this.val$context.convertAnother(this.val$result, type);
                        fields.put(name, value);
                        this.val$reader.moveUp();
                    }
                } else {
                    throw new ConversionException("Expected <fields/> or <default/> element when calling ObjectInputStream.readFields()");
                }
                this.val$reader.moveUp();
                return fields;
            }

            public void defaultReadObject() {
                if (!this.val$reader.hasMoreChildren()) {
                    return;
                }
                this.val$reader.moveDown();
                if (!this.val$reader.getNodeName().equals("default")) {
                    throw new ConversionException("Expected <default/> element in readObject() stream");
                }
                while (this.val$reader.hasMoreChildren()) {
                    this.val$reader.moveDown();
                    String fieldName = this.this$0.mapper.realMember(this.val$currentType[0], this.val$reader.getNodeName());
                    String classAttribute = this.val$reader.getAttribute("class");
                    Class type = classAttribute != null ? this.this$0.mapper.realClass(classAttribute) : this.this$0.mapper.defaultImplementationOf(this.this$0.reflectionProvider.getFieldType(this.val$result, fieldName, this.val$currentType[0]));
                    Object value = this.val$context.convertAnother(this.val$result, type);
                    this.this$0.reflectionProvider.writeField(this.val$result, fieldName, value, this.val$currentType[0]);
                    this.val$reader.moveUp();
                }
                this.val$reader.moveUp();
            }

            public void registerValidation(ObjectInputValidation validation, int priority) {
                this.val$context.addCompletionCallback(new Runnable(this, validation){
                    private final /* synthetic */ ObjectInputValidation val$validation;
                    private final /* synthetic */ 2 this$1;
                    {
                        this.this$1 = var1_1;
                        this.val$validation = objectInputValidation;
                    }

                    public void run() {
                        try {
                            this.val$validation.validateObject();
                        }
                        catch (InvalidObjectException e) {
                            throw new ObjectAccessException("Cannot validate object : " + e.getMessage(), e);
                        }
                    }
                }, priority);
            }

            public void close() {
                throw new UnsupportedOperationException("Objects are not allowed to call ObjectInputStream.close() from readObject()");
            }
        };
        while (reader.hasMoreChildren()) {
            reader.moveDown();
            String nodeName = reader.getNodeName();
            if (nodeName.equals(ELEMENT_UNSERIALIZABLE_PARENTS)) {
                super.doUnmarshal(result, reader, context);
            } else {
                currentType[0] = this.mapper.defaultImplementationOf(this.mapper.realClass(nodeName));
                if (this.serializationMethodInvoker.supportsReadObject(currentType[0], false)) {
                    CustomObjectInputStream objectInputStream = CustomObjectInputStream.getInstance(context, callback);
                    this.serializationMethodInvoker.callReadObject(currentType[0], result, objectInputStream);
                    objectInputStream.popCallback();
                } else {
                    try {
                        callback.defaultReadObject();
                    }
                    catch (IOException e) {
                        throw new ObjectAccessException("Could not call defaultWriteObject()", e);
                    }
                }
            }
            reader.moveUp();
        }
        return result;
    }

    protected void doMarshalConditionally(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        if (this.isSerializable(source.getClass())) {
            this.doMarshal(source, writer, context);
        } else {
            super.doMarshal(source, writer, context);
        }
    }

    protected Object doUnmarshalConditionally(Object result, HierarchicalStreamReader reader, UnmarshallingContext context) {
        return this.isSerializable(result.getClass()) ? this.doUnmarshal(result, reader, context) : super.doUnmarshal(result, reader, context);
    }

    static /* synthetic */ Class class$(String x0) {
        try {
            return Class.forName(x0);
        }
        catch (ClassNotFoundException x1) {
            throw new NoClassDefFoundError(x1.getMessage());
        }
    }

    static /* synthetic */ Object access$000(SerializableConverter x0, ObjectStreamField x1, Class x2, Object x3) {
        return x0.readField(x1, x2, x3);
    }
}

