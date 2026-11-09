/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.bag;

import java.util.Set;
import org.apache.commons.collections.Bag;
import org.apache.commons.collections.bag.SynchronizedBag;
import org.apache.commons.collections.collection.SynchronizedCollection;

public class SynchronizedBag
extends SynchronizedCollection
implements Bag {
    private static final long serialVersionUID = 8084674570753837109L;

    public static Bag decorate(Bag bag) {
        return new SynchronizedBag(bag);
    }

    protected SynchronizedBag(Bag bag) {
        super(bag);
    }

    protected SynchronizedBag(Bag bag, Object lock) {
        super(bag, lock);
    }

    protected Bag getBag() {
        return (Bag)this.collection;
    }

    public boolean add(Object object, int count) {
        Object object2 = this.lock;
        synchronized (object2) {
            boolean bl = this.getBag().add(object, count);
            return bl;
        }
    }

    public boolean remove(Object object, int count) {
        Object object2 = this.lock;
        synchronized (object2) {
            boolean bl = this.getBag().remove(object, count);
            return bl;
        }
    }

    public Set uniqueSet() {
        Object object = this.lock;
        synchronized (object) {
            Set set = this.getBag().uniqueSet();
            SynchronizedBagSet synchronizedBagSet = new SynchronizedBagSet(this, set, this.lock);
            return synchronizedBagSet;
        }
    }

    public int getCount(Object object) {
        Object object2 = this.lock;
        synchronized (object2) {
            int n2 = this.getBag().getCount(object);
            return n2;
        }
    }
}

