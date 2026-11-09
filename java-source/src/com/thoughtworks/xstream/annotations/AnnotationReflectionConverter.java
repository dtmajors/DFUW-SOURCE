/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.annotations;

import com.thoughtworks.xstream.annotations.AnnotationProvider;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.converters.reflection.ReflectionConverter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.mapper.Mapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public class AnnotationReflectionConverter
extends ReflectionConverter {
    private final AnnotationProvider annotationProvider;
    private final Map<Class<? extends Converter>, Converter> cachedConverters;

    public AnnotationReflectionConverter(Mapper mapper, ReflectionProvider reflectionProvider, AnnotationProvider annotationProvider) {
        super(mapper, reflectionProvider);
        this.annotationProvider = annotationProvider;
        this.cachedConverters = new HashMap<Class<? extends Converter>, Converter>();
    }

    @Override
    protected void marshallField(MarshallingContext context, Object newObj, Field field) {
        XStreamConverter annotation = this.annotationProvider.getAnnotation(field, XStreamConverter.class);
        if (annotation != null) {
            Class<? extends Converter> type = annotation.value();
            this.ensureCache(type);
            context.convertAnother(newObj, this.cachedConverters.get(type));
        } else {
            context.convertAnother(newObj);
        }
    }

    private void ensureCache(Class<? extends Converter> type) {
        if (!this.cachedConverters.containsKey(type)) {
            this.cachedConverters.put(type, this.newInstance(type));
        }
    }

    @Override
    protected Object unmarshallField(UnmarshallingContext context, Object result, Class type, Field field) {
        XStreamConverter annotation = this.annotationProvider.getAnnotation(field, XStreamConverter.class);
        if (annotation != null) {
            Class<? extends Converter> converterType = annotation.value();
            this.ensureCache(converterType);
            return context.convertAnother(result, type, this.cachedConverters.get(converterType));
        }
        return context.convertAnother(result, type);
    }

    private Converter newInstance(Class<? extends Converter> converterType) {
        Converter converter;
        try {
            converter = converterType.getConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (InvocationTargetException e) {
            throw new ObjectAccessException("Cannot construct " + converterType.getName(), e.getCause());
        }
        catch (InstantiationException e) {
            throw new ObjectAccessException("Cannot construct " + converterType.getName(), e);
        }
        catch (IllegalAccessException e) {
            throw new ObjectAccessException("Cannot construct " + converterType.getName(), e);
        }
        catch (NoSuchMethodException e) {
            throw new ObjectAccessException("Cannot construct " + converterType.getName(), e);
        }
        return converter;
    }
}

