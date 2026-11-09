/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.alias.ClassMapper;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import java.lang.reflect.Proxy;

public class DynamicProxyMapper
extends MapperWrapper {
    private String alias;
    static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$DynamicProxyMapper$DynamicProxy;

    public DynamicProxyMapper(Mapper wrapped) {
        this(wrapped, "dynamic-proxy");
    }

    public DynamicProxyMapper(Mapper wrapped, String alias) {
        super(wrapped);
        this.alias = alias;
    }

    public DynamicProxyMapper(ClassMapper wrapped) {
        this((Mapper)wrapped);
    }

    public DynamicProxyMapper(ClassMapper wrapped, String alias) {
        this((Mapper)wrapped, alias);
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String serializedClass(Class type) {
        if (Proxy.isProxyClass(type)) {
            return this.alias;
        }
        return super.serializedClass(type);
    }

    public Class realClass(String elementName) {
        if (elementName.equals(this.alias)) {
            return class$com$thoughtworks$xstream$mapper$DynamicProxyMapper$DynamicProxy == null ? (class$com$thoughtworks$xstream$mapper$DynamicProxyMapper$DynamicProxy = DynamicProxyMapper.class$("com.thoughtworks.xstream.mapper.DynamicProxyMapper$DynamicProxy")) : class$com$thoughtworks$xstream$mapper$DynamicProxyMapper$DynamicProxy;
        }
        return super.realClass(elementName);
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

