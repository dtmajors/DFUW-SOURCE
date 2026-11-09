/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  net.sf.cglib.proxy.Enhancer
 */
package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import net.sf.cglib.proxy.Enhancer;

public class CGLIBMapper
extends MapperWrapper {
    private static String DEFAULT_NAMING_MARKER = "$$EnhancerByCGLIB$$";
    private final String alias;
    static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$CGLIBMapper$Marker;

    public CGLIBMapper(Mapper wrapped) {
        this(wrapped, "CGLIB-enhanced-proxy");
    }

    public CGLIBMapper(Mapper wrapped, String alias) {
        super(wrapped);
        this.alias = alias;
    }

    public String serializedClass(Class type) {
        return type.getName().indexOf(DEFAULT_NAMING_MARKER) > 0 && Enhancer.isEnhanced((Class)type) ? this.alias : super.serializedClass(type);
    }

    public Class realClass(String elementName) {
        Class clazz = elementName.equals(this.alias) ? (class$com$thoughtworks$xstream$mapper$CGLIBMapper$Marker == null ? (class$com$thoughtworks$xstream$mapper$CGLIBMapper$Marker = CGLIBMapper.class$("com.thoughtworks.xstream.mapper.CGLIBMapper$Marker")) : class$com$thoughtworks$xstream$mapper$CGLIBMapper$Marker) : super.realClass(elementName);
        return clazz;
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

