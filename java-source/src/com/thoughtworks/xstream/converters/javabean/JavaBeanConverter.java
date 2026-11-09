/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.javabean;

import com.thoughtworks.xstream.alias.ClassMapper;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.javabean.BeanProvider;
import com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.mapper.Mapper;

public class JavaBeanConverter
implements Converter {
    private Mapper classMapper;
    private String classAttributeIdentifier;
    private BeanProvider beanProvider;

    public JavaBeanConverter(Mapper mapper, String classAttributeIdentifier) {
        this.classMapper = mapper;
        this.classAttributeIdentifier = classAttributeIdentifier;
        this.beanProvider = new BeanProvider();
    }

    public JavaBeanConverter(ClassMapper classMapper, String classAttributeIdentifier) {
        this((Mapper)classMapper, classAttributeIdentifier);
    }

    public boolean canConvert(Class type) {
        return this.beanProvider.canInstantiate(type);
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        this.beanProvider.visitSerializableProperties(source, new BeanProvider.Visitor(this, writer, source, context){
            private final /* synthetic */ HierarchicalStreamWriter val$writer;
            private final /* synthetic */ Object val$source;
            private final /* synthetic */ MarshallingContext val$context;
            private final /* synthetic */ JavaBeanConverter this$0;
            {
                this.this$0 = javaBeanConverter;
                this.val$writer = hierarchicalStreamWriter;
                this.val$source = object;
                this.val$context = marshallingContext;
            }

            public void visit(String propertyName, Class fieldType, Object newObj) {
                if (newObj != null) {
                    this.writeField(propertyName, fieldType, newObj);
                }
            }

            private void writeField(String propertyName, Class fieldType, Object newObj) {
                ExtendedHierarchicalStreamWriterHelper.startNode(this.val$writer, JavaBeanConverter.access$000(this.this$0).serializedMember(this.val$source.getClass(), propertyName), fieldType);
                Class<?> actualType = newObj.getClass();
                Class defaultType = JavaBeanConverter.access$000(this.this$0).defaultImplementationOf(fieldType);
                if (!actualType.equals(defaultType)) {
                    this.val$writer.addAttribute(JavaBeanConverter.access$100(this.this$0), JavaBeanConverter.access$000(this.this$0).serializedClass(actualType));
                }
                this.val$context.convertAnother(newObj);
                this.val$writer.endNode();
            }
        });
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        Object result = this.instantiateNewInstance(context);
        while (reader.hasMoreChildren()) {
            reader.moveDown();
            String propertyName = this.classMapper.realMember(result.getClass(), reader.getNodeName());
            boolean propertyExistsInClass = this.beanProvider.propertyDefinedInClass(propertyName, result.getClass());
            Class type = this.determineType(reader, result, propertyName);
            Object value = context.convertAnother(result, type);
            if (propertyExistsInClass) {
                this.beanProvider.writeProperty(result, propertyName, value);
            }
            reader.moveUp();
        }
        return result;
    }

    private Object instantiateNewInstance(UnmarshallingContext context) {
        Object result = context.currentObject();
        if (result == null) {
            result = this.beanProvider.newInstance(context.getRequiredType());
        }
        return result;
    }

    private Class determineType(HierarchicalStreamReader reader, Object result, String fieldName) {
        String classAttribute = reader.getAttribute(this.classAttributeIdentifier);
        if (classAttribute != null) {
            return this.classMapper.realClass(classAttribute);
        }
        return this.classMapper.defaultImplementationOf(this.beanProvider.getPropertyType(result, fieldName));
    }

    static /* synthetic */ Mapper access$000(JavaBeanConverter x0) {
        return x0.classMapper;
    }

    static /* synthetic */ String access$100(JavaBeanConverter x0) {
        return x0.classAttributeIdentifier;
    }
}

