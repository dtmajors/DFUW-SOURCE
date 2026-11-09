/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.core.ReferenceByIdMarshaller;

public class SequenceGenerator
implements ReferenceByIdMarshaller.IDGenerator {
    private int counter;

    public SequenceGenerator(int startsAt) {
        this.counter = startsAt;
    }

    public String next() {
        return String.valueOf(this.counter++);
    }
}

