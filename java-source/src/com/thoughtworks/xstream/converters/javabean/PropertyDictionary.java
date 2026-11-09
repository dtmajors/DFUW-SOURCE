/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.javabean;

import com.thoughtworks.xstream.converters.javabean.BeanProperty;
import com.thoughtworks.xstream.converters.javabean.PropertyDictionary;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import java.beans.Introspector;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PropertyDictionary {
    private final Map keyedByPropertyNameCache = Collections.synchronizedMap(new HashMap());

    public Iterator serializablePropertiesFor(Class cls2) {
        return this.buildMap(cls2).values().iterator();
    }

    public BeanProperty property(Class cls2, String name) {
        Map properties = this.buildMap(cls2);
        BeanProperty property = (BeanProperty)properties.get(name);
        if (property == null) {
            throw new ObjectAccessException("No such property " + cls2.getName() + "." + name);
        }
        return property;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Map buildMap(Class cls2) {
        String clsName = cls2.getName();
        if (!this.keyedByPropertyNameCache.containsKey(clsName)) {
            Map map = this.keyedByPropertyNameCache;
            synchronized (map) {
                if (!this.keyedByPropertyNameCache.containsKey(clsName)) {
                    HashMap propertyMap = new HashMap();
                    Method[] methods = cls2.getMethods();
                    for (int i = 0; i < methods.length; ++i) {
                        BeanProperty property;
                        String propertyName;
                        if (!Modifier.isPublic(methods[i].getModifiers()) || Modifier.isStatic(methods[i].getModifiers())) continue;
                        String methodName = methods[i].getName();
                        Class<?>[] parameters = methods[i].getParameterTypes();
                        Class<?> returnType = methods[i].getReturnType();
                        if ((methodName.startsWith("get") || methodName.startsWith("is")) && parameters.length == 0 && returnType != Void.TYPE) {
                            propertyName = methodName.startsWith("get") ? Introspector.decapitalize(methodName.substring(3)) : Introspector.decapitalize(methodName.substring(2));
                            property = this.getBeanProperty(propertyMap, cls2, propertyName, returnType);
                            property.setGetterMethod(methods[i]);
                            continue;
                        }
                        if (!methodName.startsWith("set") || parameters.length != 1 || returnType != Void.TYPE) continue;
                        propertyName = Introspector.decapitalize(methodName.substring(3));
                        property = this.getBeanProperty(propertyMap, cls2, propertyName, parameters[0]);
                        property.setSetterMethod(methods[i]);
                    }
                    ArrayList<BeanProperty> serializableProperties = new ArrayList<BeanProperty>();
                    Iterator it = propertyMap.values().iterator();
                    while (it.hasNext()) {
                        BeanProperty property = (BeanProperty)it.next();
                        if (!property.isReadable() || !property.isWritable()) continue;
                        serializableProperties.add(property);
                    }
                    Collections.sort(serializableProperties, new BeanPropertyComparator(null));
                    OrderRetainingMap keyedByFieldName = new OrderRetainingMap(null);
                    Iterator it2 = serializableProperties.iterator();
                    while (it2.hasNext()) {
                        BeanProperty property = (BeanProperty)it2.next();
                        keyedByFieldName.put(property.getName(), property);
                    }
                    this.keyedByPropertyNameCache.put(clsName, keyedByFieldName);
                }
            }
        }
        return (Map)this.keyedByPropertyNameCache.get(clsName);
    }

    private BeanProperty getBeanProperty(Map propertyMap, Class cls2, String propertyName, Class type) {
        PropertyKey key = new PropertyKey(propertyName, type);
        BeanProperty property = (BeanProperty)propertyMap.get(key);
        if (property == null) {
            property = new BeanProperty(cls2, propertyName, type);
            propertyMap.put(key, property);
        }
        return property;
    }
}

