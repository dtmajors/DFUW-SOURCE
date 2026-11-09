/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.collection;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.collections.collection.CompositeCollection;
import org.apache.commons.collections.iterators.EmptyIterator;
import org.apache.commons.collections.iterators.IteratorChain;
import org.apache.commons.collections.list.UnmodifiableList;

public class CompositeCollection
implements Collection {
    protected CollectionMutator mutator;
    protected Collection[] all = new Collection[0];

    public CompositeCollection() {
    }

    public CompositeCollection(Collection coll) {
        this();
        this.addComposited(coll);
    }

    public CompositeCollection(Collection[] colls) {
        this();
        this.addComposited(colls);
    }

    public int size() {
        int size = 0;
        int i = this.all.length - 1;
        while (i >= 0) {
            size += this.all[i].size();
            --i;
        }
        return size;
    }

    public boolean isEmpty() {
        int i = this.all.length - 1;
        while (i >= 0) {
            if (!this.all[i].isEmpty()) {
                return false;
            }
            --i;
        }
        return true;
    }

    public boolean contains(Object obj) {
        int i = this.all.length - 1;
        while (i >= 0) {
            if (this.all[i].contains(obj)) {
                return true;
            }
            --i;
        }
        return false;
    }

    public Iterator iterator() {
        if (this.all.length == 0) {
            return EmptyIterator.INSTANCE;
        }
        IteratorChain chain = new IteratorChain();
        int i = 0;
        while (i < this.all.length) {
            chain.addIterator(this.all[i].iterator());
            ++i;
        }
        return chain;
    }

    public Object[] toArray() {
        Object[] result = new Object[this.size()];
        int i = 0;
        Iterator it = this.iterator();
        while (it.hasNext()) {
            result[i] = it.next();
            ++i;
        }
        return result;
    }

    public Object[] toArray(Object[] array) {
        int size = this.size();
        Object[] result = null;
        result = array.length >= size ? array : (Object[])Array.newInstance(array.getClass().getComponentType(), size);
        int offset = 0;
        int i = 0;
        while (i < this.all.length) {
            Iterator it = this.all[i].iterator();
            while (it.hasNext()) {
                result[offset++] = it.next();
            }
            ++i;
        }
        if (result.length > size) {
            result[size] = null;
        }
        return result;
    }

    public boolean add(Object obj) {
        if (this.mutator == null) {
            throw new UnsupportedOperationException("add() is not supported on CompositeCollection without a CollectionMutator strategy");
        }
        return this.mutator.add(this, this.all, obj);
    }

    public boolean remove(Object obj) {
        if (this.mutator == null) {
            throw new UnsupportedOperationException("remove() is not supported on CompositeCollection without a CollectionMutator strategy");
        }
        return this.mutator.remove(this, this.all, obj);
    }

    public boolean containsAll(Collection coll) {
        Iterator it = coll.iterator();
        while (it.hasNext()) {
            if (this.contains(it.next())) continue;
            return false;
        }
        return true;
    }

    public boolean addAll(Collection coll) {
        if (this.mutator == null) {
            throw new UnsupportedOperationException("addAll() is not supported on CompositeCollection without a CollectionMutator strategy");
        }
        return this.mutator.addAll(this, this.all, coll);
    }

    public boolean removeAll(Collection coll) {
        if (coll.size() == 0) {
            return false;
        }
        boolean changed = false;
        int i = this.all.length - 1;
        while (i >= 0) {
            changed = this.all[i].removeAll(coll) || changed;
            --i;
        }
        return changed;
    }

    public boolean retainAll(Collection coll) {
        boolean changed = false;
        int i = this.all.length - 1;
        while (i >= 0) {
            changed = this.all[i].retainAll(coll) || changed;
            --i;
        }
        return changed;
    }

    public void clear() {
        int i = 0;
        while (i < this.all.length) {
            this.all[i].clear();
            ++i;
        }
    }

    public void setMutator(CollectionMutator mutator) {
        this.mutator = mutator;
    }

    public void addComposited(Collection[] comps) {
        ArrayList<Collection> list = new ArrayList<Collection>(Arrays.asList(this.all));
        list.addAll(Arrays.asList(comps));
        this.all = list.toArray(new Collection[list.size()]);
    }

    public void addComposited(Collection c2) {
        this.addComposited(new Collection[]{c2});
    }

    public void addComposited(Collection c2, Collection d2) {
        this.addComposited(new Collection[]{c2, d2});
    }

    public void removeComposited(Collection coll) {
        ArrayList<Collection> list = new ArrayList<Collection>(this.all.length);
        list.addAll(Arrays.asList(this.all));
        ((AbstractCollection)list).remove(coll);
        this.all = list.toArray(new Collection[list.size()]);
    }

    public Collection toCollection() {
        return new ArrayList(this);
    }

    public Collection getCollections() {
        return UnmodifiableList.decorate(Arrays.asList(this.all));
    }
}

