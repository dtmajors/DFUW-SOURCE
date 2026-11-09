/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.reflection.FieldDictionary;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sun.misc.Unsafe;
import sun.reflect.ReflectionFactory;

public class Sun14ReflectionProvider
extends PureJavaReflectionProvider {
    private static final Unsafe unsafe;
    private static final Exception exception;
    private transient ReflectionFactory reflectionFactory = ReflectionFactory.getReflectionFactory();
    private transient Map constructorCache = Collections.synchronizedMap(new HashMap());
    static /* synthetic */ Class class$java$lang$Object;

    public Sun14ReflectionProvider() {
    }

    public Sun14ReflectionProvider(FieldDictionary dic) {
        super(dic);
    }

    public Object newInstance(Class type) {
        try {
            Constructor customConstructor = this.getMungedConstructor(type);
            return customConstructor.newInstance(new Object[0]);
        }
        catch (NoSuchMethodException e) {
            throw new ObjectAccessException("Cannot construct " + type.getName(), e);
        }
        catch (SecurityException e) {
            throw new ObjectAccessException("Cannot construct " + type.getName(), e);
        }
        catch (InstantiationException e) {
            throw new ObjectAccessException("Cannot construct " + type.getName(), e);
        }
        catch (IllegalAccessException e) {
            throw new ObjectAccessException("Cannot construct " + type.getName(), e);
        }
        catch (IllegalArgumentException e) {
            throw new ObjectAccessException("Cannot construct " + type.getName(), e);
        }
        catch (InvocationTargetException e) {
            throw new ObjectAccessException("Cannot construct " + type.getName(), e);
        }
    }

    private Constructor getMungedConstructor(Class type) throws NoSuchMethodException {
        if (!this.constructorCache.containsKey(type)) {
            Constructor javaLangObjectConstructor = (class$java$lang$Object == null ? (class$java$lang$Object = Sun14ReflectionProvider.class$("java.lang.Object")) : class$java$lang$Object).getDeclaredConstructor(new Class[0]);
            Constructor<?> customConstructor = this.reflectionFactory.newConstructorForSerialization(type, javaLangObjectConstructor);
            this.constructorCache.put(type, customConstructor);
        }
        return (Constructor)this.constructorCache.get(type);
    }

    public void writeField(Object object, String fieldName, Object value, Class definedIn) {
        this.write(this.fieldDictionary.field(object.getClass(), fieldName, definedIn), object, value);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void write(Field field, Object object, Object value) {
        if (exception != null) {
            throw new ObjectAccessException("Could not set field " + object.getClass() + "." + field.getName(), exception);
        }
        try {
            long offset = unsafe.objectFieldOffset(field);
            Class<?> type = field.getType();
            if (type.isPrimitive()) {
                if (type.equals(Integer.TYPE)) {
                    unsafe.putInt(object, offset, (Integer)value);
                    return;
                } else if (type.equals(Long.TYPE)) {
                    unsafe.putLong(object, offset, (Long)value);
                    return;
                } else if (type.equals(Short.TYPE)) {
                    unsafe.putShort(object, offset, (Short)value);
                    return;
                } else if (type.equals(Character.TYPE)) {
                    unsafe.putChar(object, offset, ((Character)value).charValue());
                    return;
                } else if (type.equals(Byte.TYPE)) {
                    unsafe.putByte(object, offset, (Byte)value);
                    return;
                } else if (type.equals(Float.TYPE)) {
                    unsafe.putFloat(object, offset, ((Float)value).floatValue());
                    return;
                } else if (type.equals(Double.TYPE)) {
                    unsafe.putDouble(object, offset, (Double)value);
                    return;
                } else {
                    if (!type.equals(Boolean.TYPE)) throw new ObjectAccessException("Could not set field " + object.getClass() + "." + field.getName() + ": Unknown type " + type);
                    unsafe.putBoolean(object, offset, (Boolean)value);
                }
                return;
            } else {
                unsafe.putObject(object, offset, value);
            }
            return;
        }
        catch (IllegalArgumentException e) {
            throw new ObjectAccessException("Could not set field " + object.getClass() + "." + field.getName(), e);
        }
    }

    protected void validateFieldAccess(Field field) {
    }

    protected Object readResolve() {
        super.readResolve();
        this.constructorCache = Collections.synchronizedMap(new HashMap());
        this.reflectionFactory = ReflectionFactory.getReflectionFactory();
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

    static {
        Unsafe u = null;
        Exception ex2 = null;
        try {
            Class<?> objectStreamClass = Class.forName("sun.misc.Unsafe");
            Field unsafeField = objectStreamClass.getDeclaredField("theUnsafe");
            unsafeField.setAccessible(true);
            u = (Unsafe)unsafeField.get(null);
        }
        catch (ClassNotFoundException e) {
            ex2 = e;
        }
        catch (SecurityException e) {
            ex2 = e;
        }
        catch (NoSuchFieldException e) {
            ex2 = e;
        }
        catch (IllegalArgumentException e) {
            ex2 = e;
        }
        catch (IllegalAccessException e) {
            ex2 = e;
        }
        exception = ex2;
        unsafe = u;
    }
}

