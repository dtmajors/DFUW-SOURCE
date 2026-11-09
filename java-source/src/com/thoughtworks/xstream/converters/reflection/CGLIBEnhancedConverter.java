/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  net.sf.cglib.proxy.Callback
 *  net.sf.cglib.proxy.Enhancer
 *  net.sf.cglib.proxy.Factory
 */
package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.converters.reflection.SerializableConverter;
import com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.mapper.Mapper;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.Factory;

public class CGLIBEnhancedConverter
extends SerializableConverter {
    private static String DEFAULT_NAMING_MARKER = "$$EnhancerByCGLIB$$";
    private static String CALLBACK_MARKER = "CGLIB$CALLBACK_";
    private transient Map fieldCache;
    private final Mapper mapper;
    static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$CGLIBMapper$Marker;
    static /* synthetic */ Class class$net$sf$cglib$proxy$Factory;
    static /* synthetic */ Class class$java$lang$Object;
    static /* synthetic */ Class class$net$sf$cglib$proxy$MethodInterceptor;
    static /* synthetic */ Class class$java$lang$String;
    static /* synthetic */ Class class$java$lang$Class;

    public CGLIBEnhancedConverter(Mapper mapper, ReflectionProvider reflectionProvider) {
        super(mapper, new CGLIBFilteringReflectionProvider(reflectionProvider));
        this.mapper = mapper;
        this.fieldCache = new HashMap();
    }

    public boolean canConvert(Class type) {
        return Enhancer.isEnhanced((Class)type) && type.getName().indexOf(DEFAULT_NAMING_MARKER) > 0 || type == (class$com$thoughtworks$xstream$mapper$CGLIBMapper$Marker == null ? (class$com$thoughtworks$xstream$mapper$CGLIBMapper$Marker = CGLIBEnhancedConverter.class$("com.thoughtworks.xstream.mapper.CGLIBMapper$Marker")) : class$com$thoughtworks$xstream$mapper$CGLIBMapper$Marker);
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        Callback[] callbacks;
        Class<?> type = source.getClass();
        boolean hasFactory = (class$net$sf$cglib$proxy$Factory == null ? (class$net$sf$cglib$proxy$Factory = CGLIBEnhancedConverter.class$("net.sf.cglib.proxy.Factory")) : class$net$sf$cglib$proxy$Factory).isAssignableFrom(type);
        ExtendedHierarchicalStreamWriterHelper.startNode(writer, "type", type);
        context.convertAnother(type.getSuperclass());
        writer.endNode();
        writer.startNode("interfaces");
        Class<?>[] interfaces = type.getInterfaces();
        for (int i = 0; i < interfaces.length; ++i) {
            if (interfaces[i] == (class$net$sf$cglib$proxy$Factory == null ? CGLIBEnhancedConverter.class$("net.sf.cglib.proxy.Factory") : class$net$sf$cglib$proxy$Factory)) continue;
            ExtendedHierarchicalStreamWriterHelper.startNode(writer, this.mapper.serializedClass(interfaces[i].getClass()), interfaces[i].getClass());
            context.convertAnother(interfaces[i]);
            writer.endNode();
        }
        writer.endNode();
        writer.startNode("hasFactory");
        writer.setValue(String.valueOf(hasFactory && type.getSuperclass() != (class$java$lang$Object == null ? (class$java$lang$Object = CGLIBEnhancedConverter.class$("java.lang.Object")) : class$java$lang$Object)));
        writer.endNode();
        Callback[] callbackArray = callbacks = hasFactory ? ((Factory)source).getCallbacks() : this.getCallbacks(source);
        if (callbacks.length > 1) {
            throw new ConversionException("Cannot handle CGLIB enhanced proxies with multiple callbacks");
        }
        boolean isInterceptor = (class$net$sf$cglib$proxy$MethodInterceptor == null ? (class$net$sf$cglib$proxy$MethodInterceptor = CGLIBEnhancedConverter.class$("net.sf.cglib.proxy.MethodInterceptor")) : class$net$sf$cglib$proxy$MethodInterceptor).isAssignableFrom(callbacks[0].getClass());
        ExtendedHierarchicalStreamWriterHelper.startNode(writer, this.mapper.serializedClass(callbacks[0].getClass()), callbacks[0].getClass());
        context.convertAnother(callbacks[0]);
        writer.endNode();
        try {
            Field field = type.getDeclaredField("serialVersionUID");
            field.setAccessible(true);
            long serialVersionUID = field.getLong(null);
            ExtendedHierarchicalStreamWriterHelper.startNode(writer, "serialVersionUID", class$java$lang$String == null ? (class$java$lang$String = CGLIBEnhancedConverter.class$("java.lang.String")) : class$java$lang$String);
            writer.setValue(String.valueOf(serialVersionUID));
            writer.endNode();
        }
        catch (NoSuchFieldException e) {
        }
        catch (IllegalAccessException e) {
            // empty catch block
        }
        if (isInterceptor && type.getSuperclass() != (class$java$lang$Object == null ? (class$java$lang$Object = CGLIBEnhancedConverter.class$("java.lang.Object")) : class$java$lang$Object)) {
            writer.startNode("instance");
            super.doMarshalConditionally(source, writer, context);
            writer.endNode();
        }
    }

    private Callback[] getCallbacks(Object source) {
        Class<?> type = source.getClass();
        ArrayList<Field> fields = (ArrayList<Field>)this.fieldCache.get(type.getName());
        if (fields == null) {
            fields = new ArrayList<Field>();
            this.fieldCache.put(type.getName(), fields);
            int i = 0;
            while (true) {
                try {
                    Field field = type.getDeclaredField(CALLBACK_MARKER + i);
                    field.setAccessible(true);
                    fields.add(field);
                }
                catch (NoSuchFieldException e) {
                    break;
                }
                ++i;
            }
        }
        ArrayList<Object> list = new ArrayList<Object>();
        for (int i = 0; i < fields.size(); ++i) {
            try {
                Field field = (Field)fields.get(i);
                list.add(field.get(source));
                continue;
            }
            catch (IllegalAccessException e) {
                throw new ObjectAccessException("Access to " + type.getName() + "." + CALLBACK_MARKER + i + " not allowed");
            }
        }
        return list.toArray(new Callback[list.size()]);
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        Enhancer enhancer = new Enhancer();
        reader.moveDown();
        enhancer.setSuperclass((Class)context.convertAnother(null, class$java$lang$Class == null ? (class$java$lang$Class = CGLIBEnhancedConverter.class$("java.lang.Class")) : class$java$lang$Class));
        reader.moveUp();
        reader.moveDown();
        ArrayList<Object> interfaces = new ArrayList<Object>();
        while (reader.hasMoreChildren()) {
            reader.moveDown();
            interfaces.add(context.convertAnother(null, this.mapper.realClass(reader.getNodeName())));
            reader.moveUp();
        }
        enhancer.setInterfaces(interfaces.toArray(new Class[interfaces.size()]));
        reader.moveUp();
        reader.moveDown();
        enhancer.setUseFactory(Boolean.getBoolean(reader.getValue()));
        reader.moveUp();
        reader.moveDown();
        enhancer.setCallback((Callback)context.convertAnother(null, this.mapper.realClass(reader.getNodeName())));
        reader.moveUp();
        Object result = null;
        while (reader.hasMoreChildren()) {
            reader.moveDown();
            if (reader.getNodeName().equals("serialVersionUID")) {
                enhancer.setSerialVersionUID(Long.valueOf(reader.getValue()));
            } else if (reader.getNodeName().equals("instance")) {
                result = enhancer.create();
                super.doUnmarshalConditionally(result, reader, context);
            }
            reader.moveUp();
        }
        return this.serializationMethodInvoker.callReadResolve(result == null ? enhancer.create() : result);
    }

    protected List hierarchyFor(Class type) {
        List typeHierarchy = super.hierarchyFor(type);
        typeHierarchy.remove(typeHierarchy.size() - 1);
        return typeHierarchy;
    }

    private Object readResolve() {
        this.fieldCache = new HashMap();
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

