/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.collection;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public class SynchronizedCollection
implements Collection,
Serializable {
    private static final long serialVersionUID = 2412805092710877986L;
    protected final Collection collection;
    protected final Object lock;

    public static Collection decorate(Collection coll) {
        return new SynchronizedCollection(coll);
    }

    protected SynchronizedCollection(Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("Collection must not be null");
        }
        this.collection = collection;
        this.lock = this;
    }

    protected SynchronizedCollection(Collection collection, Object lock) {
        if (collection == null) {
            throw new IllegalArgumentException("Collection must not be null");
        }
        this.collection = collection;
        this.lock = lock;
    }

    public boolean add(Object object) {
        Object object2 = this.lock;
        synchronized (object2) {
            boolean bl = this.collection.add(object);
            return bl;
        }
    }

    public boolean addAll(Collection coll) {
        Object object = this.lock;
        synchronized (object) {
            boolean bl = this.collection.addAll(coll);
            return bl;
        }
    }

    public void clear() {
        Object object = this.lock;
        synchronized (object) {
            this.collection.clear();
        }
    }

    public boolean contains(Object object) {
        Object object2 = this.lock;
        synchronized (object2) {
            boolean bl = this.collection.contains(object);
            return bl;
        }
    }

    public boolean containsAll(Collection coll) {
        Object object = this.lock;
        synchronized (object) {
            boolean bl = this.collection.containsAll(coll);
            return bl;
        }
    }

    public boolean isEmpty() {
        Object object = this.lock;
        synchronized (object) {
            boolean bl = this.collection.isEmpty();
            return bl;
        }
    }

    public Iterator iterator() {
        return this.collection.iterator();
    }

    public Object[] toArray() {
        Object object = this.lock;
        synchronized (object) {
            Object[] objectArray = this.collection.toArray();
            return objectArray;
        }
    }

    public Object[] toArray(Object[] object) {
        Object object2 = this.lock;
        synchronized (object2) {
            Object[] objectArray = this.collection.toArray(object);
            return objectArray;
        }
    }

    public boolean remove(Object object) {
        Object object2 = this.lock;
        synchronized (object2) {
            boolean bl = this.collection.remove(object);
            return bl;
        }
    }

    public boolean removeAll(Collection coll) {
        Object object = this.lock;
        synchronized (object) {
            boolean bl = this.collection.removeAll(coll);
            return bl;
        }
    }

    public boolean retainAll(Collection coll) {
        Object object = this.lock;
        synchronized (object) {
            boolean bl = this.collection.retainAll(coll);
            return bl;
        }
    }

    public int size() {
        Object object = this.lock;
        synchronized (object) {
            int n2 = this.collection.size();
            return n2;
        }
    }

    public boolean equals(Object object) {
        Object object2 = this.lock;
        synchronized (object2) {
            if (object == this) {
                boolean bl = true;
                return bl;
            }
            boolean bl = this.collection.equals(object);
            return bl;
        }
    }

    public int hashCode() {
        Object object = this.lock;
        synchronized (object) {
            int n2 = this.collection.hashCode();
            return n2;
        }
    }

    public String toString() {
        Object object = this.lock;
        synchronized (object) {
            String string = this.collection.toString();
            return string;
        }
    }
}

