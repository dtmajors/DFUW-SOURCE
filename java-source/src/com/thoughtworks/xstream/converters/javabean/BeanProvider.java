/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.javabean;

import com.thoughtworks.xstream.converters.javabean.BeanProperty;
import com.thoughtworks.xstream.converters.javabean.BeanProvider;
import com.thoughtworks.xstream.converters.javabean.PropertyDictionary;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Iterator;

public class BeanProvider {
    protected PropertyDictionary propertyDictionary = new PropertyDictionary();
    protected static final Object[] NO_PARAMS = new Object[0];

    public Object newInstance(Class type) {
        try {
            return this.getDefaultConstrutor(type).newInstance(NO_PARAMS);
        }
        catch (InstantiationException e) {
            throw new ObjectAccessException("Cannot construct " + type.getName(), e);
        }
        catch (IllegalAccessException e) {
            throw new ObjectAccessException("Cannot construct " + type.getName(), e);
        }
        catch (InvocationTargetException e) {
            if (e.getTargetException() instanceof RuntimeException) {
                throw (RuntimeException)e.getTargetException();
            }
            if (e.getTargetException() instanceof Error) {
                throw (Error)e.getTargetException();
            }
            throw new ObjectAccessException("Constructor for " + type.getName() + " threw an exception", e);
        }
    }

    public void visitSerializableProperties(Object object, Visitor visitor) {
        Iterator iterator = this.propertyDictionary.serializablePropertiesFor(object.getClass());
        while (iterator.hasNext()) {
            BeanProperty property = (BeanProperty)iterator.next();
            try {
                Object value = property.get(object);
                visitor.visit(property.getName(), property.getType(), value);
            }
            catch (IllegalArgumentException e) {
                throw new ObjectAccessException("Could not get property " + property.getClass() + "." + property.getName(), e);
            }
            catch (IllegalAccessException e) {
                throw new ObjectAccessException("Could not get property " + property.getClass() + "." + property.getName(), e);
            }
        }
    }

    public void writeProperty(Object object, String propertyName, Object value) {
        BeanProperty property = this.propertyDictionary.property(object.getClass(), propertyName);
        try {
            property.set(object, value);
        }
        catch (IllegalArgumentException e) {
            throw new ObjectAccessException("Could not set property " + object.getClass() + "." + property.getName(), e);
        }
        catch (IllegalAccessException e) {
            throw new ObjectAccessException("Could not set property " + object.getClass() + "." + property.getName(), e);
        }
    }

    public Class getPropertyType(Object object, String name) {
        return this.propertyDictionary.property(object.getClass(), name).getType();
    }

    public boolean propertyDefinedInClass(String name, Class type) {
        return this.propertyDictionary.property(type, name) != null;
    }

    public boolean canInstantiate(Class type) {
        return this.getDefaultConstrutor(type) != null;
    }

    protected Constructor getDefaultConstrutor(Class type) {
        Constructor<?>[] constructors = type.getConstructors();
        for (int i = 0; i < constructors.length; ++i) {
            Constructor<?> c2 = constructors[i];
            if (c2.getParameterTypes().length != 0 || !Modifier.isPublic(c2.getModifiers())) continue;
            return c2;
        }
        return null;
    }
}

