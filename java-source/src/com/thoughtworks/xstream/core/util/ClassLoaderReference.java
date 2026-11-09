/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.core.util.ClassLoaderReference;

public class ClassLoaderReference
extends ClassLoader {
    private transient ClassLoader reference;

    public ClassLoaderReference(ClassLoader reference) {
        this.reference = reference;
    }

    public Class loadClass(String name) throws ClassNotFoundException {
        return this.reference.loadClass(name);
    }

    public ClassLoader getReference() {
        return this.reference;
    }

    public void setReference(ClassLoader reference) {
        this.reference = reference;
    }

    private Object writeReplace() {
        return new Replacement();
    }
}

