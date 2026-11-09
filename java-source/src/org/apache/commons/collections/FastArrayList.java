/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections.FastArrayList;

public class FastArrayList
extends ArrayList {
    protected ArrayList list = null;
    protected boolean fast = false;

    public FastArrayList() {
        this.list = new ArrayList();
    }

    public FastArrayList(int capacity) {
        this.list = new ArrayList(capacity);
    }

    public FastArrayList(Collection collection) {
        this.list = new ArrayList(collection);
    }

    public boolean getFast() {
        return this.fast;
    }

    public void setFast(boolean fast) {
        this.fast = fast;
    }

    public boolean add(Object element) {
        if (this.fast) {
            FastArrayList fastArrayList = this;
            synchronized (fastArrayList) {
                ArrayList temp = (ArrayList)this.list.clone();
                boolean result = temp.add(element);
                this.list = temp;
                boolean bl = result;
                return bl;
            }
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            boolean bl = this.list.add(element);
            return bl;
        }
    }

    public void add(int index, Object element) {
        if (this.fast) {
            FastArrayList fastArrayList = this;
            synchronized (fastArrayList) {
                ArrayList temp = (ArrayList)this.list.clone();
                temp.add(index, element);
                this.list = temp;
            }
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            this.list.add(index, element);
        }
    }

    public boolean addAll(Collection collection) {
        if (this.fast) {
            FastArrayList fastArrayList = this;
            synchronized (fastArrayList) {
                ArrayList temp = (ArrayList)this.list.clone();
                boolean result = temp.addAll(collection);
                this.list = temp;
                boolean bl = result;
                return bl;
            }
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            boolean bl = this.list.addAll(collection);
            return bl;
        }
    }

    public boolean addAll(int index, Collection collection) {
        if (this.fast) {
            FastArrayList fastArrayList = this;
            synchronized (fastArrayList) {
                ArrayList temp = (ArrayList)this.list.clone();
                boolean result = temp.addAll(index, collection);
                this.list = temp;
                boolean bl = result;
                return bl;
            }
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            boolean bl = this.list.addAll(index, collection);
            return bl;
        }
    }

    public void clear() {
        if (this.fast) {
            FastArrayList fastArrayList = this;
            synchronized (fastArrayList) {
                ArrayList temp = (ArrayList)this.list.clone();
                temp.clear();
                this.list = temp;
            }
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            this.list.clear();
        }
    }

    public Object clone() {
        FastArrayList results = null;
        if (this.fast) {
            results = new FastArrayList((Collection)this.list);
        } else {
            ArrayList arrayList = this.list;
            synchronized (arrayList) {
                results = new FastArrayList((Collection)this.list);
            }
        }
        results.setFast(this.getFast());
        return results;
    }

    public boolean contains(Object element) {
        if (this.fast) {
            return this.list.contains(element);
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            boolean bl = this.list.contains(element);
            return bl;
        }
    }

    public boolean containsAll(Collection collection) {
        if (this.fast) {
            return this.list.containsAll(collection);
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            boolean bl = this.list.containsAll(collection);
            return bl;
        }
    }

    public void ensureCapacity(int capacity) {
        if (this.fast) {
            FastArrayList fastArrayList = this;
            synchronized (fastArrayList) {
                ArrayList temp = (ArrayList)this.list.clone();
                temp.ensureCapacity(capacity);
                this.list = temp;
            }
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            this.list.ensureCapacity(capacity);
        }
    }

    public boolean equals(Object o2) {
        if (o2 == this) {
            return true;
        }
        if (!(o2 instanceof List)) {
            return false;
        }
        List lo = (List)o2;
        if (this.fast) {
            ListIterator li1 = ((AbstractList)this.list).listIterator();
            ListIterator li2 = lo.listIterator();
            while (li1.hasNext() && li2.hasNext()) {
                Object o1 = li1.next();
                Object o22 = li2.next();
                if (o1 == null ? o22 == null : o1.equals(o22)) continue;
                return false;
            }
            return !li1.hasNext() && !li2.hasNext();
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            ListIterator li1 = ((AbstractList)this.list).listIterator();
            ListIterator li2 = lo.listIterator();
            while (li1.hasNext() && li2.hasNext()) {
                Object o1 = li1.next();
                Object o23 = li2.next();
                if (o1 == null ? o23 == null : o1.equals(o23)) continue;
                boolean bl = false;
                return bl;
            }
            boolean bl = !li1.hasNext() && !li2.hasNext();
            return bl;
        }
    }

    public Object get(int index) {
        if (this.fast) {
            return this.list.get(index);
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            Object e2 = this.list.get(index);
            return e2;
        }
    }

    public int hashCode() {
        if (this.fast) {
            int hashCode = 1;
            Iterator i = ((AbstractList)this.list).iterator();
            while (i.hasNext()) {
                Object o2 = i.next();
                hashCode = 31 * hashCode + (o2 == null ? 0 : o2.hashCode());
            }
            return hashCode;
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            int hashCode = 1;
            Iterator i = ((AbstractList)this.list).iterator();
            while (i.hasNext()) {
                Object o3 = i.next();
                hashCode = 31 * hashCode + (o3 == null ? 0 : o3.hashCode());
            }
            int n2 = hashCode;
            return n2;
        }
    }

    public int indexOf(Object element) {
        if (this.fast) {
            return this.list.indexOf(element);
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            int n2 = this.list.indexOf(element);
            return n2;
        }
    }

    public boolean isEmpty() {
        if (this.fast) {
            return this.list.isEmpty();
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            boolean bl = this.list.isEmpty();
            return bl;
        }
    }

    public Iterator iterator() {
        if (this.fast) {
            return new ListIter(this, 0);
        }
        return ((AbstractList)this.list).iterator();
    }

    public int lastIndexOf(Object element) {
        if (this.fast) {
            return this.list.lastIndexOf(element);
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            int n2 = this.list.lastIndexOf(element);
            return n2;
        }
    }

    public ListIterator listIterator() {
        if (this.fast) {
            return new ListIter(this, 0);
        }
        return ((AbstractList)this.list).listIterator();
    }

    public ListIterator listIterator(int index) {
        if (this.fast) {
            return new ListIter(this, index);
        }
        return ((AbstractList)this.list).listIterator(index);
    }

    public Object remove(int index) {
        if (this.fast) {
            FastArrayList fastArrayList = this;
            synchronized (fastArrayList) {
                ArrayList temp = (ArrayList)this.list.clone();
                Object result = temp.remove(index);
                this.list = temp;
                Object e2 = result;
                return e2;
            }
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            Object e3 = this.list.remove(index);
            return e3;
        }
    }

    public boolean remove(Object element) {
        if (this.fast) {
            FastArrayList fastArrayList = this;
            synchronized (fastArrayList) {
                ArrayList temp = (ArrayList)this.list.clone();
                boolean result = ((AbstractCollection)temp).remove(element);
                this.list = temp;
                boolean bl = result;
                return bl;
            }
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            boolean bl = ((AbstractCollection)this.list).remove(element);
            return bl;
        }
    }

    public boolean removeAll(Collection collection) {
        if (this.fast) {
            FastArrayList fastArrayList = this;
            synchronized (fastArrayList) {
                ArrayList temp = (ArrayList)this.list.clone();
                boolean result = ((AbstractCollection)temp).removeAll(collection);
                this.list = temp;
                boolean bl = result;
                return bl;
            }
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            boolean bl = ((AbstractCollection)this.list).removeAll(collection);
            return bl;
        }
    }

    public boolean retainAll(Collection collection) {
        if (this.fast) {
            FastArrayList fastArrayList = this;
            synchronized (fastArrayList) {
                ArrayList temp = (ArrayList)this.list.clone();
                boolean result = ((AbstractCollection)temp).retainAll(collection);
                this.list = temp;
                boolean bl = result;
                return bl;
            }
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            boolean bl = ((AbstractCollection)this.list).retainAll(collection);
            return bl;
        }
    }

    public Object set(int index, Object element) {
        if (this.fast) {
            return this.list.set(index, element);
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            Object object = this.list.set(index, element);
            return object;
        }
    }

    public int size() {
        if (this.fast) {
            return this.list.size();
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            int n2 = this.list.size();
            return n2;
        }
    }

    public List subList(int fromIndex, int toIndex) {
        if (this.fast) {
            return new SubList(this, fromIndex, toIndex);
        }
        return ((AbstractList)this.list).subList(fromIndex, toIndex);
    }

    public Object[] toArray() {
        if (this.fast) {
            return this.list.toArray();
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            Object[] objectArray = this.list.toArray();
            return objectArray;
        }
    }

    public Object[] toArray(Object[] array) {
        if (this.fast) {
            return this.list.toArray(array);
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            Object[] objectArray = this.list.toArray(array);
            return objectArray;
        }
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("FastArrayList[");
        sb.append(this.list.toString());
        sb.append("]");
        return sb.toString();
    }

    public void trimToSize() {
        if (this.fast) {
            FastArrayList fastArrayList = this;
            synchronized (fastArrayList) {
                ArrayList temp = (ArrayList)this.list.clone();
                temp.trimToSize();
                this.list = temp;
            }
        }
        ArrayList arrayList = this.list;
        synchronized (arrayList) {
            this.list.trimToSize();
        }
    }
}

