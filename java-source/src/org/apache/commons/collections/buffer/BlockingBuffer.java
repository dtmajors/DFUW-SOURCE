/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.buffer;

import java.util.Collection;
import org.apache.commons.collections.Buffer;
import org.apache.commons.collections.BufferUnderflowException;
import org.apache.commons.collections.buffer.SynchronizedBuffer;

public class BlockingBuffer
extends SynchronizedBuffer {
    private static final long serialVersionUID = 1719328905017860541L;

    public static Buffer decorate(Buffer buffer) {
        return new BlockingBuffer(buffer);
    }

    protected BlockingBuffer(Buffer buffer) {
        super(buffer);
    }

    public boolean add(Object o2) {
        Object object = this.lock;
        synchronized (object) {
            boolean result = this.collection.add(o2);
            this.notifyAll();
            boolean bl = result;
            return bl;
        }
    }

    public boolean addAll(Collection c2) {
        Object object = this.lock;
        synchronized (object) {
            boolean result = this.collection.addAll(c2);
            this.notifyAll();
            boolean bl = result;
            return bl;
        }
    }

    public Object get() {
        Object object = this.lock;
        synchronized (object) {
            while (this.collection.isEmpty()) {
                try {
                    this.wait();
                }
                catch (InterruptedException e2) {
                    throw new BufferUnderflowException();
                }
            }
            Object object2 = this.getBuffer().get();
            return object2;
        }
    }

    public Object remove() {
        Object object = this.lock;
        synchronized (object) {
            while (this.collection.isEmpty()) {
                try {
                    this.wait();
                }
                catch (InterruptedException e2) {
                    throw new BufferUnderflowException();
                }
            }
            Object object2 = this.getBuffer().remove();
            return object2;
        }
    }
}

