/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.annotations;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamContainedType;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamConverters;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamImplicitCollection;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter;
import com.thoughtworks.xstream.mapper.Mapper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public class Annotations {
    private static final Set<Class<?>> visitedTypes = new HashSet();

    private Annotations() {
    }

    public static synchronized void configureAliases(XStream xstream, Class<?> ... topLevelClasses) {
        visitedTypes.clear();
        for (Class<?> topLevelClass : topLevelClasses) {
            Annotations.configureClass(xstream, topLevelClass);
        }
    }

    private static synchronized void configureClass(XStream xstream, Class<?> configurableClass) {
        Class<?>[] interfaces;
        if (configurableClass == null || visitedTypes.contains(configurableClass)) {
            return;
        }
        if (Converter.class.isAssignableFrom(configurableClass)) {
            Class<?> converterType = configurableClass;
            Annotations.registerConverter(xstream, converterType);
            return;
        }
        visitedTypes.add(configurableClass);
        Class<?> element = configurableClass;
        if (configurableClass.isAnnotationPresent(XStreamConverters.class)) {
            XStreamConverters convertersAnnotation = element.getAnnotation(XStreamConverters.class);
            for (XStreamConverter converterAnnotation : convertersAnnotation.value()) {
                Annotations.registerConverter(xstream, converterAnnotation.value());
            }
        }
        if (configurableClass.isAnnotationPresent(XStreamConverter.class)) {
            XStreamConverter converterAnnotation = element.getAnnotation(XStreamConverter.class);
            Annotations.registerConverter(xstream, converterAnnotation.value());
        }
        if (configurableClass.isAnnotationPresent(XStreamAlias.class)) {
            XStreamAlias aliasAnnotation = element.getAnnotation(XStreamAlias.class);
            if (aliasAnnotation.impl() != Void.class) {
                xstream.alias(aliasAnnotation.value(), configurableClass, aliasAnnotation.impl());
                if (configurableClass.isInterface()) {
                    Annotations.configureClass(xstream, aliasAnnotation.impl());
                    return;
                }
            } else {
                xstream.alias(aliasAnnotation.value(), configurableClass);
            }
        }
        if (configurableClass.isAnnotationPresent(XStreamImplicitCollection.class)) {
            XStreamImplicitCollection implicitColAnnotation = element.getAnnotation(XStreamImplicitCollection.class);
            String fieldName = implicitColAnnotation.value();
            String itemFieldName = implicitColAnnotation.item();
            try {
                Field field = configurableClass.getDeclaredField(fieldName);
                Class itemType = Annotations.getFieldParameterizedType(field, xstream);
                if (itemType == null) {
                    xstream.addImplicitCollection(configurableClass, fieldName);
                } else if (itemFieldName.equals("")) {
                    xstream.addImplicitCollection(configurableClass, fieldName, itemType);
                } else {
                    xstream.addImplicitCollection(configurableClass, fieldName, itemFieldName, itemType);
                }
            }
            catch (Exception e) {
                System.err.println("Fail to derive ImplicitCollection member type");
            }
        }
        Field[] fields = configurableClass.getDeclaredFields();
        for (Field field : fields) {
            XStreamAlias fieldXStreamAliasAnnotation;
            if (field.isSynthetic()) continue;
            Class<?> fieldType = field.getType();
            if (field.isAnnotationPresent(XStreamContainedType.class)) {
                Annotations.configureClass(xstream, fieldType);
                Annotations.configureParameterizedTypes(field, xstream);
            }
            boolean shouldAlias = field.isAnnotationPresent(XStreamAlias.class);
            boolean isAttribute = field.isAnnotationPresent(XStreamAsAttribute.class);
            if (shouldAlias && !isAttribute) {
                fieldXStreamAliasAnnotation = field.getAnnotation(XStreamAlias.class);
                xstream.aliasField(fieldXStreamAliasAnnotation.value(), configurableClass, field.getName());
                Annotations.configureClass(xstream, field.getType());
            }
            if (isAttribute) {
                xstream.useAttributeFor(configurableClass, field.getName());
                if (shouldAlias) {
                    fieldXStreamAliasAnnotation = field.getAnnotation(XStreamAlias.class);
                    xstream.aliasAttribute(configurableClass, field.getName(), fieldXStreamAliasAnnotation.value());
                }
                Annotations.configureClass(xstream, field.getType());
            }
            if (field.isAnnotationPresent(XStreamImplicit.class)) {
                if (!Collection.class.isAssignableFrom(field.getType())) {
                    throw new XStream.InitializationException("@XStreamImplicit must be assigned to Collection types, but \"" + field.getDeclaringClass().getName() + ":" + field.getName() + " is of type " + field.getType().getName());
                }
                XStreamImplicit implicitAnnotation = field.getAnnotation(XStreamImplicit.class);
                String fieldName = field.getName();
                String itemFieldName = implicitAnnotation.itemFieldName();
                Class itemType = Annotations.getFieldParameterizedType(field, xstream);
                if (itemFieldName != null && !"".equals(itemFieldName)) {
                    xstream.addImplicitCollection(configurableClass, fieldName, itemFieldName, itemType);
                } else {
                    xstream.addImplicitCollection(configurableClass, fieldName, itemType);
                }
            }
            if (!field.isAnnotationPresent(XStreamOmitField.class)) continue;
            String fieldName = field.getName();
            xstream.omitField(configurableClass, fieldName);
        }
        for (Class<?> memberClass : configurableClass.getDeclaredClasses()) {
            Annotations.configureClass(xstream, memberClass);
        }
        Class<?> superClass = configurableClass.getSuperclass();
        if (superClass != null && !Object.class.equals(superClass)) {
            Annotations.configureClass(xstream, superClass);
        }
        for (Class<?> intf : interfaces = configurableClass.getInterfaces()) {
            Annotations.configureClass(xstream, intf);
        }
    }

    private static void registerConverter(XStream xstream, Class<? extends Converter> converterType) {
        Converter converter;
        if (visitedTypes.contains(converterType)) {
            return;
        }
        visitedTypes.add(converterType);
        if (AbstractCollectionConverter.class.isAssignableFrom(converterType)) {
            try {
                Constructor<? extends Converter> converterConstructor = converterType.getConstructor(Mapper.class);
                converter = converterConstructor.newInstance(xstream.getMapper());
            }
            catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        try {
            converter = converterType.newInstance();
        }
        catch (Exception e) {
            e.printStackTrace();
            return;
        }
        xstream.registerConverter(converter);
    }

    private static Class getFieldParameterizedType(Field field, XStream xstream) {
        if (field.getGenericType() instanceof ParameterizedType) {
            ParameterizedType pType = (ParameterizedType)field.getGenericType();
            Class<?> type = (Class<?>)pType.getActualTypeArguments()[0];
            if (type.isInterface()) {
                Class<?> element = type;
                XStreamAlias alias = element.getAnnotation(XStreamAlias.class);
                Annotations.configureClass(xstream, type);
                type = alias.impl();
                assert (!type.isInterface()) : type;
            }
            return type;
        }
        assert (false) : "Field is raw type :" + field;
        return null;
    }

    private static void configureParameterizedTypes(Field field, XStream xstream) {
        if (field.getGenericType() instanceof ParameterizedType) {
            Type[] types;
            ParameterizedType pType = (ParameterizedType)field.getGenericType();
            for (Type parameter : types = pType.getActualTypeArguments()) {
                Class type = (Class)parameter;
                Annotations.configureClass(xstream, type);
            }
        }
    }
}

