/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class JavaMethodConverter
implements Converter {
    private final ClassLoader classLoader;
    static /* synthetic */ Class class$com$thoughtworks$xstream$converters$extended$JavaMethodConverter;
    static /* synthetic */ Class class$java$lang$reflect$Method;
    static /* synthetic */ Class class$java$lang$reflect$Constructor;

    public JavaMethodConverter() {
        this((class$com$thoughtworks$xstream$converters$extended$JavaMethodConverter == null ? (class$com$thoughtworks$xstream$converters$extended$JavaMethodConverter = JavaMethodConverter.class$("com.thoughtworks.xstream.converters.extended.JavaMethodConverter")) : class$com$thoughtworks$xstream$converters$extended$JavaMethodConverter).getClassLoader());
    }

    public JavaMethodConverter(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    public boolean canConvert(Class type) {
        return type.equals(class$java$lang$reflect$Method == null ? (class$java$lang$reflect$Method = JavaMethodConverter.class$("java.lang.reflect.Method")) : class$java$lang$reflect$Method) || type.equals(class$java$lang$reflect$Constructor == null ? (class$java$lang$reflect$Constructor = JavaMethodConverter.class$("java.lang.reflect.Constructor")) : class$java$lang$reflect$Constructor);
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        if (source instanceof Method) {
            Method method = (Method)source;
            String declaringClassName = method.getDeclaringClass().getName();
            this.marshalMethod(writer, declaringClassName, method.getName(), method.getParameterTypes());
        } else {
            Constructor method = (Constructor)source;
            String declaringClassName = method.getDeclaringClass().getName();
            this.marshalMethod(writer, declaringClassName, null, method.getParameterTypes());
        }
    }

    private void marshalMethod(HierarchicalStreamWriter writer, String declaringClassName, String methodName, Class[] parameterTypes) {
        writer.startNode("class");
        writer.setValue(declaringClassName);
        writer.endNode();
        if (methodName != null) {
            writer.startNode("name");
            writer.setValue(methodName);
            writer.endNode();
        }
        writer.startNode("parameter-types");
        for (int i = 0; i < parameterTypes.length; ++i) {
            Class parameterType = parameterTypes[i];
            writer.startNode("class");
            writer.setValue(parameterType.getName());
            writer.endNode();
        }
        writer.endNode();
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        try {
            boolean isMethodNotConstructor = context.getRequiredType().equals(class$java$lang$reflect$Method == null ? (class$java$lang$reflect$Method = JavaMethodConverter.class$("java.lang.reflect.Method")) : class$java$lang$reflect$Method);
            reader.moveDown();
            String declaringClassName = reader.getValue();
            Class declaringClass = this.loadClass(declaringClassName);
            reader.moveUp();
            String methodName = null;
            if (isMethodNotConstructor) {
                reader.moveDown();
                methodName = reader.getValue();
                reader.moveUp();
            }
            reader.moveDown();
            ArrayList<Class> parameterTypeList = new ArrayList<Class>();
            while (reader.hasMoreChildren()) {
                reader.moveDown();
                String parameterTypeName = reader.getValue();
                parameterTypeList.add(this.loadClass(parameterTypeName));
                reader.moveUp();
            }
            Class[] parameterTypes = parameterTypeList.toArray(new Class[parameterTypeList.size()]);
            reader.moveUp();
            if (isMethodNotConstructor) {
                return declaringClass.getDeclaredMethod(methodName, parameterTypes);
            }
            return declaringClass.getDeclaredConstructor(parameterTypes);
        }
        catch (ClassNotFoundException e) {
            throw new ConversionException(e);
        }
        catch (NoSuchMethodException e) {
            throw new ConversionException(e);
        }
    }

    private Class loadClass(String className) throws ClassNotFoundException {
        Class primitiveClass = this.primitiveClassForName(className);
        if (primitiveClass != null) {
            return primitiveClass;
        }
        return this.classLoader.loadClass(className);
    }

    private Class primitiveClassForName(String name) {
        return name.equals("void") ? Void.TYPE : (name.equals("boolean") ? Boolean.TYPE : (name.equals("byte") ? Byte.TYPE : (name.equals("char") ? Character.TYPE : (name.equals("short") ? Short.TYPE : (name.equals("int") ? Integer.TYPE : (name.equals("long") ? Long.TYPE : (name.equals("float") ? Float.TYPE : (name.equals("double") ? Double.TYPE : null))))))));
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

