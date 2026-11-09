/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.bag;

import java.util.Comparator;
import org.apache.commons.collections.Bag;
import org.apache.commons.collections.SortedBag;
import org.apache.commons.collections.bag.SynchronizedBag;

public class SynchronizedSortedBag
extends SynchronizedBag
implements SortedBag {
    private static final long serialVersionUID = 722374056718497858L;

    public static SortedBag decorate(SortedBag bag) {
        return new SynchronizedSortedBag(bag);
    }

    protected SynchronizedSortedBag(SortedBag bag) {
        super(bag);
    }

    protected SynchronizedSortedBag(Bag bag, Object lock) {
        super(bag, lock);
    }

    protected SortedBag getSortedBag() {
        return (SortedBag)this.collection;
    }

    public synchronized Object first() {
        Object object = this.lock;
        synchronized (object) {
            Object object2 = this.getSortedBag().first();
            return object2;
        }
    }

    public synchronized Object last() {
        Object object = this.lock;
        synchronized (object) {
            Object object2 = this.getSortedBag().last();
            return object2;
        }
    }

    public synchronized Comparator comparator() {
        Object object = this.lock;
        synchronized (object) {
            Comparator comparator = this.getSortedBag().comparator();
            return comparator;
        }
    }
}

