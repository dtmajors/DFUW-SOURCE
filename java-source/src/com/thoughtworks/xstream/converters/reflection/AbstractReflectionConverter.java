/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker;
import com.thoughtworks.xstream.core.util.Primitives;
import com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.mapper.Mapper;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class AbstractReflectionConverter
implements Converter {
    protected final ReflectionProvider reflectionProvider;
    protected final Mapper mapper;
    protected transient SerializationMethodInvoker serializationMethodInvoker;
    private transient ReflectionProvider pureJavaReflectionProvider;
    static /* synthetic */ Class class$java$util$Collection;

    public AbstractReflectionConverter(Mapper mapper, ReflectionProvider reflectionProvider) {
        this.mapper = mapper;
        this.reflectionProvider = reflectionProvider;
        this.serializationMethodInvoker = new SerializationMethodInvoker();
    }

    public void marshal(Object original, HierarchicalStreamWriter writer, MarshallingContext context) {
        Object source = this.serializationMethodInvoker.callWriteReplace(original);
        if (source.getClass() != original.getClass()) {
            writer.addAttribute(this.mapper.aliasForAttribute("resolves-to"), this.mapper.serializedClass(source.getClass()));
        }
        this.doMarshal(source, writer, context);
    }

    protected void doMarshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        HashSet seenFields = new HashSet();
        HashSet seenAsAttributes = new HashSet();
        this.reflectionProvider.visitSerializableFields(source, new ReflectionProvider.Visitor(this, writer, seenAsAttributes){
            private final /* synthetic */ HierarchicalStreamWriter val$writer;
            private final /* synthetic */ Set val$seenAsAttributes;
            private final /* synthetic */ AbstractReflectionConverter this$0;
            {
                this.this$0 = abstractReflectionConverter;
                this.val$writer = hierarchicalStreamWriter;
                this.val$seenAsAttributes = set;
            }

            public void visit(String fieldName, Class type, Class definedIn, Object value) {
                SingleValueConverter converter = this.this$0.mapper.getConverterFromItemType(fieldName, type, definedIn);
                if (converter == null) {
                    converter = this.this$0.mapper.getConverterFromItemType(fieldName, type);
                }
                if (converter == null) {
                    converter = this.this$0.mapper.getConverterFromItemType(type);
                }
                if (converter != null) {
                    String str;
                    if (value != null && (str = converter.toString(value)) != null) {
                        this.val$writer.addAttribute(this.this$0.mapper.aliasForAttribute(definedIn, fieldName), str);
                    }
                    this.val$seenAsAttributes.add(fieldName);
                }
            }
        });
        this.reflectionProvider.visitSerializableFields(source, new ReflectionProvider.Visitor(this, seenAsAttributes, source, context, seenFields, writer){
            private final /* synthetic */ Set val$seenAsAttributes;
            private final /* synthetic */ Object val$source;
            private final /* synthetic */ MarshallingContext val$context;
            private final /* synthetic */ Set val$seenFields;
            private final /* synthetic */ HierarchicalStreamWriter val$writer;
            private final /* synthetic */ AbstractReflectionConverter this$0;
            {
                this.this$0 = abstractReflectionConverter;
                this.val$seenAsAttributes = set;
                this.val$source = object;
                this.val$context = marshallingContext;
                this.val$seenFields = set2;
                this.val$writer = hierarchicalStreamWriter;
            }

            public void visit(String fieldName, Class fieldType, Class definedIn, Object newObj) {
                if (!this.val$seenAsAttributes.contains(fieldName) && newObj != null) {
                    Mapper.ImplicitCollectionMapping mapping = this.this$0.mapper.getImplicitCollectionDefForFieldName(this.val$source.getClass(), fieldName);
                    if (mapping != null) {
                        if (mapping.getItemFieldName() != null) {
                            Collection list = (Collection)newObj;
                            Iterator<E> iter = list.iterator();
                            while (iter.hasNext()) {
                                E obj = iter.next();
                                this.writeField(fieldName, mapping.getItemFieldName(), mapping.getItemType(), definedIn, obj);
                            }
                        } else {
                            this.val$context.convertAnother(newObj);
                        }
                    } else {
                        this.writeField(fieldName, fieldName, fieldType, definedIn, newObj);
                        this.val$seenFields.add(fieldName);
                    }
                }
            }

            private void writeField(String fieldName, String aliasName, Class fieldType, Class definedIn, Object newObj) {
                if (!this.this$0.mapper.shouldSerializeMember(definedIn, aliasName)) {
                    return;
                }
                ExtendedHierarchicalStreamWriterHelper.startNode(this.val$writer, this.this$0.mapper.serializedMember(definedIn, aliasName), fieldType);
                Class<?> actualType = newObj.getClass();
                Class defaultType = this.this$0.mapper.defaultImplementationOf(fieldType);
                if (!actualType.equals(defaultType)) {
                    this.val$writer.addAttribute(this.this$0.mapper.aliasForAttribute("class"), this.this$0.mapper.serializedClass(actualType));
                }
                if (this.val$seenFields.contains(aliasName)) {
                    this.val$writer.addAttribute(this.this$0.mapper.aliasForAttribute("defined-in"), this.this$0.mapper.serializedClass(definedIn));
                }
                Field field = this.this$0.reflectionProvider.getField(definedIn, fieldName);
                this.this$0.marshallField(this.val$context, newObj, field);
                this.val$writer.endNode();
            }
        });
    }

    protected void marshallField(MarshallingContext context, Object newObj, Field field) {
        context.convertAnother(newObj);
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        Object result = this.instantiateNewInstance(reader, context);
        result = this.doUnmarshal(result, reader, context);
        return this.serializationMethodInvoker.callReadResolve(result);
    }

    public Object doUnmarshal(Object result, HierarchicalStreamReader reader, UnmarshallingContext context) {
        Object value;
        Class type;
        SeenFields seenFields = new SeenFields(null);
        Iterator it = reader.getAttributeNames();
        while (it.hasNext()) {
            String attrAlias = (String)it.next();
            String attrName = this.mapper.attributeForAlias(result.getClass(), attrAlias);
            Class classDefiningField = this.determineWhichClassDefinesField(reader);
            boolean fieldExistsInClass = this.reflectionProvider.fieldDefinedInClass(attrName, result.getClass());
            if (!fieldExistsInClass) continue;
            Field field = this.reflectionProvider.getField(result.getClass(), attrName);
            if (Modifier.isTransient(field.getModifiers())) {
                reader.moveUp();
                continue;
            }
            SingleValueConverter converter = this.mapper.getConverterFromAttribute(field.getDeclaringClass(), attrName);
            if (converter == null) {
                converter = this.mapper.getConverterFromAttribute(attrName);
            }
            type = field.getType();
            if (converter == null) {
                converter = this.mapper.getConverterFromItemType(type);
            }
            if (converter == null) continue;
            value = converter.fromString(reader.getAttribute(attrAlias));
            if (type.isPrimitive()) {
                type = Primitives.box(type);
            }
            if (value != null && !type.isAssignableFrom(value.getClass())) {
                throw new ConversionException("Cannot convert type " + value.getClass().getName() + " to type " + type.getName());
            }
            this.reflectionProvider.writeField(result, attrName, value, classDefiningField);
            seenFields.add(classDefiningField, attrName);
        }
        Map implicitCollectionsForCurrentObject = null;
        while (reader.hasMoreChildren()) {
            reader.moveDown();
            String originalNodeName = reader.getNodeName();
            String fieldName = this.mapper.realMember(result.getClass(), originalNodeName);
            Mapper.ImplicitCollectionMapping implicitCollectionMapping = this.mapper.getImplicitCollectionDefForFieldName(result.getClass(), fieldName);
            Class classDefiningField = this.determineWhichClassDefinesField(reader);
            boolean fieldExistsInClass = implicitCollectionMapping == null && this.reflectionProvider.fieldDefinedInClass(fieldName, result.getClass());
            Class clazz = type = implicitCollectionMapping == null ? this.determineType(reader, fieldExistsInClass, result, fieldName, classDefiningField) : implicitCollectionMapping.getItemType();
            if (fieldExistsInClass) {
                Field field = this.reflectionProvider.getField(result.getClass(), fieldName);
                if (Modifier.isTransient(field.getModifiers())) {
                    reader.moveUp();
                    continue;
                }
                value = this.unmarshallField(context, result, type, field);
                Class definedType = this.reflectionProvider.getFieldType(result, fieldName, classDefiningField);
                if (!definedType.isPrimitive()) {
                    type = definedType;
                }
            } else {
                Object object = value = type != null ? context.convertAnother(result, type) : null;
            }
            if (value != null && !type.isAssignableFrom(value.getClass())) {
                throw new ConversionException("Cannot convert type " + value.getClass().getName() + " to type " + type.getName());
            }
            if (fieldExistsInClass) {
                this.reflectionProvider.writeField(result, fieldName, value, classDefiningField);
                seenFields.add(classDefiningField, fieldName);
            } else if (type != null) {
                implicitCollectionsForCurrentObject = this.writeValueToImplicitCollection(context, value, implicitCollectionsForCurrentObject, result, originalNodeName);
            }
            reader.moveUp();
        }
        return result;
    }

    protected Object unmarshallField(UnmarshallingContext context, Object result, Class type, Field field) {
        return context.convertAnother(result, type);
    }

    private Map writeValueToImplicitCollection(UnmarshallingContext context, Object value, Map implicitCollections, Object result, String itemFieldName) {
        String fieldName = this.mapper.getFieldNameForItemTypeAndName(context.getRequiredType(), value.getClass(), itemFieldName);
        if (fieldName != null) {
            Collection collection;
            if (implicitCollections == null) {
                implicitCollections = new HashMap<String, Collection>();
            }
            if ((collection = (Collection)implicitCollections.get(fieldName)) == null) {
                Class fieldType;
                if (!(class$java$util$Collection == null ? (class$java$util$Collection = AbstractReflectionConverter.class$("java.util.Collection")) : class$java$util$Collection).isAssignableFrom(fieldType = this.mapper.defaultImplementationOf(this.reflectionProvider.getFieldType(result, fieldName, null)))) {
                    throw new ObjectAccessException("Field " + fieldName + " of " + result.getClass().getName() + " is configured for an implicit Collection, but field is of type " + fieldType.getName());
                }
                if (this.pureJavaReflectionProvider == null) {
                    this.pureJavaReflectionProvider = new PureJavaReflectionProvider();
                }
                collection = (Collection)this.pureJavaReflectionProvider.newInstance(fieldType);
                this.reflectionProvider.writeField(result, fieldName, collection, null);
                implicitCollections.put(fieldName, collection);
            }
            collection.add(value);
        }
        return implicitCollections;
    }

    private Class determineWhichClassDefinesField(HierarchicalStreamReader reader) {
        String definedIn = reader.getAttribute(this.mapper.aliasForAttribute("defined-in"));
        return definedIn == null ? null : this.mapper.realClass(definedIn);
    }

    protected Object instantiateNewInstance(HierarchicalStreamReader reader, UnmarshallingContext context) {
        String readResolveValue = reader.getAttribute(this.mapper.aliasForAttribute("resolves-to"));
        Object currentObject = context.currentObject();
        if (currentObject != null) {
            return currentObject;
        }
        if (readResolveValue != null) {
            return this.reflectionProvider.newInstance(this.mapper.realClass(readResolveValue));
        }
        return this.reflectionProvider.newInstance(context.getRequiredType());
    }

    private Class determineType(HierarchicalStreamReader reader, boolean validField, Object result, String fieldName, Class definedInCls) {
        String classAttribute = reader.getAttribute(this.mapper.aliasForAttribute("class"));
        if (classAttribute != null) {
            return this.mapper.realClass(classAttribute);
        }
        if (!validField) {
            Class itemType = this.mapper.getItemTypeForItemFieldName(result.getClass(), fieldName);
            if (itemType != null) {
                return itemType;
            }
            String originalNodeName = reader.getNodeName();
            if (definedInCls == null) {
                for (definedInCls = result.getClass(); definedInCls != null; definedInCls = definedInCls.getSuperclass()) {
                    if (this.mapper.shouldSerializeMember(definedInCls, originalNodeName)) continue;
                    return null;
                }
            }
            return this.mapper.realClass(originalNodeName);
        }
        return this.mapper.defaultImplementationOf(this.reflectionProvider.getFieldType(result, fieldName, definedInCls));
    }

    private Object readResolve() {
        this.serializationMethodInvoker = new SerializationMethodInvoker();
        return this;
    }

    static /* synthetic */ Class class$(String x0) {
        try {
            return Class.forName(x0);
        }
        catch (ClassNotFoundException x1) {
            throw new NoClassDefFoundError(x1.getMessage());
        }
    }
}

