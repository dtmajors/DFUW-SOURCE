/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CompositeClassLoader
extends ClassLoader {
    private final List classLoaders = Collections.synchronizedList(new ArrayList());
    static /* synthetic */ Class class$java$lang$Object;

    public CompositeClassLoader() {
        this.add((class$java$lang$Object == null ? (class$java$lang$Object = CompositeClassLoader.class$("java.lang.Object")) : class$java$lang$Object).getClassLoader());
        this.add(this.getClass().getClassLoader());
    }

    public void add(ClassLoader classLoader) {
        if (classLoader != null) {
            this.classLoaders.add(0, classLoader);
        }
    }

    public Class loadClass(String name) throws ClassNotFoundException {
        Iterator iterator = this.classLoaders.iterator();
        while (iterator.hasNext()) {
            ClassLoader classLoader = (ClassLoader)iterator.next();
            try {
                return classLoader.loadClass(name);
            }
            catch (ClassNotFoundException notFound) {
            }
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            return contextClassLoader.loadClass(name);
        }
        throw new ClassNotFoundException(name);
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

