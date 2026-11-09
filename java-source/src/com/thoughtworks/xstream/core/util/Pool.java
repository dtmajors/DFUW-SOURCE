/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.core.util.Pool;
import java.text.DateFormat;

public class Pool {
    private final int initialPoolSize;
    private final int maxPoolSize;
    private final Factory factory;
    private transient Object[] pool;
    private transient int nextAvailable;
    private transient Object mutex = new Object();

    public Pool(int initialPoolSize, int maxPoolSize, Factory factory) {
        this.initialPoolSize = initialPoolSize;
        this.maxPoolSize = maxPoolSize;
        this.factory = factory;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object fetchFromPool() {
        Object result;
        Object object = this.mutex;
        synchronized (object) {
            if (this.pool == null) {
                this.pool = new DateFormat[this.maxPoolSize];
                this.nextAvailable = this.initialPoolSize;
                while (this.nextAvailable > 0) {
                    this.putInPool(this.factory.newInstance());
                }
            }
            while (this.nextAvailable == this.maxPoolSize) {
                try {
                    this.mutex.wait();
                }
                catch (InterruptedException e2) {
                    throw new RuntimeException("Interrupted whilst waiting for a free item in the pool : " + e2.getMessage());
                }
            }
            if ((result = this.pool[this.nextAvailable++]) == null) {
                result = this.factory.newInstance();
                this.putInPool(result);
                ++this.nextAvailable;
            }
        }
        return result;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void putInPool(Object object) {
        Object object2 = this.mutex;
        synchronized (object2) {
            this.pool[--this.nextAvailable] = object;
            this.mutex.notify();
        }
    }

    private Object readResolve() {
        this.mutex = new Object();
        return this;
    }
}

