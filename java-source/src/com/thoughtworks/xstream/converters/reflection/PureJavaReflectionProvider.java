/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.reflection.FieldDictionary;
import com.thoughtworks.xstream.converters.reflection.ImmutableFieldKeySorter;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.core.JVM;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PureJavaReflectionProvider
implements ReflectionProvider {
    private transient Map serializedDataCache = Collections.synchronizedMap(new HashMap());
    protected transient FieldDictionary fieldDictionary;
    static /* synthetic */ Class class$java$io$Serializable;

    public PureJavaReflectionProvider() {
        this(new FieldDictionary(new ImmutableFieldKeySorter()));
    }

    public PureJavaReflectionProvider(FieldDictionary fieldDictionary) {
        this.fieldDictionary = fieldDictionary;
    }

    public Object newInstance(Class type) {
        try {
            Constructor<?>[] constructors = type.getDeclaredConstructors();
            for (int i = 0; i < constructors.length; ++i) {
                if (constructors[i].getParameterTypes().length != 0) continue;
                if (!Modifier.isPublic(constructors[i].getModifiers())) {
                    constructors[i].setAccessible(true);
                }
                return constructors[i].newInstance(new Object[0]);
            }
            if ((class$java$io$Serializable == null ? (class$java$io$Serializable = PureJavaReflectionProvider.class$("java.io.Serializable")) : class$java$io$Serializable).isAssignableFrom(type)) {
                return this.instantiateUsingSerialization(type);
            }
            throw new ObjectAccessException("Cannot construct " + type.getName() + " as it does not have a no-args constructor");
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
            throw new ObjectAccessException("Constructor for " + type.getName() + " threw an exception", e.getTargetException());
        }
    }

    private Object instantiateUsingSerialization(Class type) {
        try {
            byte[] data;
            if (this.serializedDataCache.containsKey(type)) {
                data = (byte[])this.serializedDataCache.get(type);
            } else {
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                DataOutputStream stream = new DataOutputStream(bytes);
                stream.writeShort(-21267);
                stream.writeShort(5);
                stream.writeByte(115);
                stream.writeByte(114);
                stream.writeUTF(type.getName());
                stream.writeLong(ObjectStreamClass.lookup(type).getSerialVersionUID());
                stream.writeByte(2);
                stream.writeShort(0);
                stream.writeByte(120);
                stream.writeByte(112);
                data = bytes.toByteArray();
                this.serializedDataCache.put(type, data);
            }
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(data));
            return in.readObject();
        }
        catch (IOException e) {
            throw new ObjectAccessException("Cannot create " + type.getName() + " by JDK serialization", e);
        }
        catch (ClassNotFoundException e) {
            throw new ObjectAccessException("Cannot find class " + e.getMessage());
        }
    }

    public void visitSerializableFields(Object object, ReflectionProvider.Visitor visitor) {
        Iterator iterator = this.fieldDictionary.serializableFieldsFor(object.getClass());
        while (iterator.hasNext()) {
            Field field = (Field)iterator.next();
            if (!this.fieldModifiersSupported(field)) continue;
            this.validateFieldAccess(field);
            try {
                Object value = field.get(object);
                visitor.visit(field.getName(), field.getType(), field.getDeclaringClass(), value);
            }
            catch (IllegalArgumentException e) {
                throw new ObjectAccessException("Could not get field " + field.getClass() + "." + field.getName(), e);
            }
            catch (IllegalAccessException e) {
                throw new ObjectAccessException("Could not get field " + field.getClass() + "." + field.getName(), e);
            }
        }
    }

    public void writeField(Object object, String fieldName, Object value, Class definedIn) {
        Field field = this.fieldDictionary.field(object.getClass(), fieldName, definedIn);
        this.validateFieldAccess(field);
        try {
            field.set(object, value);
        }
        catch (IllegalArgumentException e) {
            throw new ObjectAccessException("Could not set field " + object.getClass() + "." + field.getName(), e);
        }
        catch (IllegalAccessException e) {
            throw new ObjectAccessException("Could not set field " + object.getClass() + "." + field.getName(), e);
        }
    }

    public Class getFieldType(Object object, String fieldName, Class definedIn) {
        return this.fieldDictionary.field(object.getClass(), fieldName, definedIn).getType();
    }

    public boolean fieldDefinedInClass(String fieldName, Class type) {
        try {
            Field field = this.fieldDictionary.field(type, fieldName, null);
            return this.fieldModifiersSupported(field) || Modifier.isTransient(field.getModifiers());
        }
        catch (ObjectAccessException e) {
            return false;
        }
    }

    protected boolean fieldModifiersSupported(Field field) {
        return !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers());
    }

    protected void validateFieldAccess(Field field) {
        if (Modifier.isFinal(field.getModifiers())) {
            if (JVM.is15()) {
                field.setAccessible(true);
            } else {
                throw new ObjectAccessException("Invalid final field " + field.getDeclaringClass().getName() + "." + field.getName());
            }
        }
    }

    public Field getField(Class definedIn, String fieldName) {
        return this.fieldDictionary.field(definedIn, fieldName, null);
    }

    protected Object readResolve() {
        this.serializedDataCache = Collections.synchronizedMap(new HashMap());
        this.fieldDictionary = new FieldDictionary();
        return this;
    }

    public void setFieldDictionary(FieldDictionary dictionary) {
        this.fieldDictionary = dictionary;
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

