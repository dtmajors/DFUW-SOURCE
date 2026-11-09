/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.alias;

import com.thoughtworks.xstream.core.BaseException;

public class CannotResolveClassException
extends BaseException {
    public CannotResolveClassException(String className) {
        super(className);
    }
}

