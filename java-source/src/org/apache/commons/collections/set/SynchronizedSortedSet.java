/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.set;

import java.util.Comparator;
import java.util.SortedSet;
import org.apache.commons.collections.collection.SynchronizedCollection;

public class SynchronizedSortedSet
extends SynchronizedCollection
implements SortedSet {
    private static final long serialVersionUID = 2775582861954500111L;

    public static SortedSet decorate(SortedSet set) {
        return new SynchronizedSortedSet(set);
    }

    protected SynchronizedSortedSet(SortedSet set) {
        super(set);
    }

    protected SynchronizedSortedSet(SortedSet set, Object lock) {
        super(set, lock);
    }

    protected SortedSet getSortedSet() {
        return (SortedSet)this.collection;
    }

    public SortedSet subSet(Object fromElement, Object toElement) {
        Object object = this.lock;
        synchronized (object) {
            SortedSet<Object> set = this.getSortedSet().subSet(fromElement, toElement);
            SynchronizedSortedSet synchronizedSortedSet = new SynchronizedSortedSet(set, this.lock);
            return synchronizedSortedSet;
        }
    }

    public SortedSet headSet(Object toElement) {
        Object object = this.lock;
        synchronized (object) {
            SortedSet<Object> set = this.getSortedSet().headSet(toElement);
            SynchronizedSortedSet synchronizedSortedSet = new SynchronizedSortedSet(set, this.lock);
            return synchronizedSortedSet;
        }
    }

    public SortedSet tailSet(Object fromElement) {
        Object object = this.lock;
        synchronized (object) {
            SortedSet<Object> set = this.getSortedSet().tailSet(fromElement);
            SynchronizedSortedSet synchronizedSortedSet = new SynchronizedSortedSet(set, this.lock);
            return synchronizedSortedSet;
        }
    }

    public Object first() {
        Object object = this.lock;
        synchronized (object) {
            Object e2 = this.getSortedSet().first();
            return e2;
        }
    }

    public Object last() {
        Object object = this.lock;
        synchronized (object) {
            Object e2 = this.getSortedSet().last();
            return e2;
        }
    }

    public Comparator comparator() {
        Object object = this.lock;
        synchronized (object) {
            Comparator comparator = this.getSortedSet().comparator();
            return comparator;
        }
    }
}

