/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.list;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections.collection.SynchronizedCollection;

public class SynchronizedList
extends SynchronizedCollection
implements List {
    private static final long serialVersionUID = -1403835447328619437L;

    public static List decorate(List list) {
        return new SynchronizedList(list);
    }

    protected SynchronizedList(List list) {
        super(list);
    }

    protected SynchronizedList(List list, Object lock) {
        super(list, lock);
    }

    protected List getList() {
        return (List)this.collection;
    }

    public void add(int index, Object object) {
        Object object2 = this.lock;
        synchronized (object2) {
            this.getList().add(index, object);
        }
    }

    public boolean addAll(int index, Collection coll) {
        Object object = this.lock;
        synchronized (object) {
            boolean bl = this.getList().addAll(index, coll);
            return bl;
        }
    }

    public Object get(int index) {
        Object object = this.lock;
        synchronized (object) {
            Object e2 = this.getList().get(index);
            return e2;
        }
    }

    public int indexOf(Object object) {
        Object object2 = this.lock;
        synchronized (object2) {
            int n = this.getList().indexOf(object);
            return n;
        }
    }

    public int lastIndexOf(Object object) {
        Object object2 = this.lock;
        synchronized (object2) {
            int n = this.getList().lastIndexOf(object);
            return n;
        }
    }

    public ListIterator listIterator() {
        return this.getList().listIterator();
    }

    public ListIterator listIterator(int index) {
        return this.getList().listIterator(index);
    }

    public Object remove(int index) {
        Object object = this.lock;
        synchronized (object) {
            Object e2 = this.getList().remove(index);
            return e2;
        }
    }

    public Object set(int index, Object object) {
        Object object2 = this.lock;
        synchronized (object2) {
            Object object3 = this.getList().set(index, object);
            return object3;
        }
    }

    public List subList(int fromIndex, int toIndex) {
        Object object = this.lock;
        synchronized (object) {
            List list = this.getList().subList(fromIndex, toIndex);
            SynchronizedList synchronizedList = new SynchronizedList(list, this.lock);
            return synchronizedList;
        }
    }
}

