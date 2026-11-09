/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections;

import java.util.ArrayList;
import java.util.EmptyStackException;
import org.apache.commons.collections.Buffer;
import org.apache.commons.collections.BufferUnderflowException;

public class ArrayStack
extends ArrayList
implements Buffer {
    private static final long serialVersionUID = 2130079159931574599L;

    public ArrayStack() {
    }

    public ArrayStack(int initialSize) {
        super(initialSize);
    }

    public boolean empty() {
        return this.isEmpty();
    }

    public Object peek() throws EmptyStackException {
        int n2 = this.size();
        if (n2 <= 0) {
            throw new EmptyStackException();
        }
        return this.get(n2 - 1);
    }

    public Object peek(int n2) throws EmptyStackException {
        int m = this.size() - n2 - 1;
        if (m < 0) {
            throw new EmptyStackException();
        }
        return this.get(m);
    }

    public Object pop() throws EmptyStackException {
        int n2 = this.size();
        if (n2 <= 0) {
            throw new EmptyStackException();
        }
        return this.remove(n2 - 1);
    }

    public Object push(Object item) {
        this.add(item);
        return item;
    }

    public int search(Object object) {
        int i = this.size() - 1;
        int n2 = 1;
        while (i >= 0) {
            Object current = this.get(i);
            if (object == null && current == null || object != null && object.equals(current)) {
                return n2;
            }
            --i;
            ++n2;
        }
        return -1;
    }

    public Object get() {
        int size = this.size();
        if (size == 0) {
            throw new BufferUnderflowException();
        }
        return this.get(size - 1);
    }

    public Object remove() {
        int size = this.size();
        if (size == 0) {
            throw new BufferUnderflowException();
        }
        return this.remove(size - 1);
    }
}

