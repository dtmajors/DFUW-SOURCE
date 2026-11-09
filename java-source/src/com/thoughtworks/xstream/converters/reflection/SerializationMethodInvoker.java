/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SerializationMethodInvoker {
    private Map cache = Collections.synchronizedMap(new HashMap());
    private static final Object NO_METHOD = new Object();
    private static final Object[] EMPTY_ARGS = new Object[0];
    static /* synthetic */ Class class$java$io$ObjectInputStream;
    static /* synthetic */ Class class$java$io$ObjectOutputStream;

    public Object callReadResolve(Object result) {
        if (result == null) {
            return null;
        }
        Method readResolveMethod = this.getMethod(result.getClass(), "readResolve", null, true);
        if (readResolveMethod != null) {
            try {
                return readResolveMethod.invoke(result, EMPTY_ARGS);
            }
            catch (IllegalAccessException e) {
                throw new ObjectAccessException("Could not call " + result.getClass().getName() + ".readResolve()", e);
            }
            catch (InvocationTargetException e) {
                throw new ObjectAccessException("Could not call " + result.getClass().getName() + ".readResolve()", e.getTargetException());
            }
        }
        return result;
    }

    public Object callWriteReplace(Object object) {
        if (object == null) {
            return null;
        }
        Method writeReplaceMethod = this.getMethod(object.getClass(), "writeReplace", null, true);
        if (writeReplaceMethod != null) {
            try {
                Object[] EMPTY_ARGS = new Object[]{};
                return writeReplaceMethod.invoke(object, EMPTY_ARGS);
            }
            catch (IllegalAccessException e) {
                throw new ObjectAccessException("Could not call " + object.getClass().getName() + ".writeReplace()", e);
            }
            catch (InvocationTargetException e) {
                throw new ObjectAccessException("Could not call " + object.getClass().getName() + ".writeReplace()", e.getTargetException());
            }
        }
        return object;
    }

    public boolean supportsReadObject(Class type, boolean includeBaseClasses) {
        return this.getMethod(type, "readObject", new Class[]{class$java$io$ObjectInputStream == null ? (class$java$io$ObjectInputStream = SerializationMethodInvoker.class$("java.io.ObjectInputStream")) : class$java$io$ObjectInputStream}, includeBaseClasses) != null;
    }

    public void callReadObject(Class type, Object object, ObjectInputStream stream) {
        try {
            Method readObjectMethod = this.getMethod(type, "readObject", new Class[]{class$java$io$ObjectInputStream == null ? (class$java$io$ObjectInputStream = SerializationMethodInvoker.class$("java.io.ObjectInputStream")) : class$java$io$ObjectInputStream}, false);
            readObjectMethod.invoke(object, stream);
        }
        catch (IllegalAccessException e) {
            throw new ConversionException("Could not call " + object.getClass().getName() + ".readObject()", e);
        }
        catch (InvocationTargetException e) {
            throw new ConversionException("Could not call " + object.getClass().getName() + ".readObject()", e.getTargetException());
        }
    }

    public boolean supportsWriteObject(Class type, boolean includeBaseClasses) {
        return this.getMethod(type, "writeObject", new Class[]{class$java$io$ObjectOutputStream == null ? (class$java$io$ObjectOutputStream = SerializationMethodInvoker.class$("java.io.ObjectOutputStream")) : class$java$io$ObjectOutputStream}, includeBaseClasses) != null;
    }

    public void callWriteObject(Class type, Object instance, ObjectOutputStream stream) {
        try {
            Method readObjectMethod = this.getMethod(type, "writeObject", new Class[]{class$java$io$ObjectOutputStream == null ? (class$java$io$ObjectOutputStream = SerializationMethodInvoker.class$("java.io.ObjectOutputStream")) : class$java$io$ObjectOutputStream}, false);
            readObjectMethod.invoke(instance, stream);
        }
        catch (IllegalAccessException e) {
            throw new ConversionException("Could not call " + instance.getClass().getName() + ".writeObject()", e);
        }
        catch (InvocationTargetException e) {
            throw new ConversionException("Could not call " + instance.getClass().getName() + ".writeObject()", e.getTargetException());
        }
    }

    private Method getMethod(Class type, String name, Class[] parameterTypes, boolean includeBaseclasses) {
        String key = type.getName() + "." + name + "." + includeBaseclasses;
        if (this.cache.containsKey(key)) {
            Object result = this.cache.get(key);
            return result == NO_METHOD ? null : result;
        }
        if (includeBaseclasses) {
            while (type != null) {
                try {
                    Method result = type.getDeclaredMethod(name, parameterTypes);
                    result.setAccessible(true);
                    this.cache.put(key, result);
                    return result;
                }
                catch (NoSuchMethodException e) {
                    type = type.getSuperclass();
                }
            }
            this.cache.put(key, NO_METHOD);
            return null;
        }
        try {
            Method result = type.getDeclaredMethod(name, parameterTypes);
            result.setAccessible(true);
            this.cache.put(key, result);
            return result;
        }
        catch (NoSuchMethodException e) {
            this.cache.put(key, NO_METHOD);
            return null;
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
}

