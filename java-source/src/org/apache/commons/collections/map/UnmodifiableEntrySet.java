/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.map;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections.Unmodifiable;
import org.apache.commons.collections.map.UnmodifiableEntrySet;
import org.apache.commons.collections.set.AbstractSetDecorator;

public final class UnmodifiableEntrySet
extends AbstractSetDecorator
implements Unmodifiable {
    public static Set decorate(Set set) {
        if (set instanceof Unmodifiable) {
            return set;
        }
        return new UnmodifiableEntrySet(set);
    }

    private UnmodifiableEntrySet(Set set) {
        super(set);
    }

    public boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection coll) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection coll) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection coll) {
        throw new UnsupportedOperationException();
    }

    public Iterator iterator() {
        return new UnmodifiableEntrySetIterator(this.collection.iterator());
    }

    public Object[] toArray() {
        Object[] array = this.collection.toArray();
        int i = 0;
        while (i < array.length) {
            array[i] = new UnmodifiableEntry((Map.Entry)array[i]);
            ++i;
        }
        return array;
    }

    public Object[] toArray(Object[] array) {
        Object[] result = array;
        if (array.length > 0) {
            result = (Object[])Array.newInstance(array.getClass().getComponentType(), 0);
        }
        result = this.collection.toArray(result);
        int i = 0;
        while (i < result.length) {
            result[i] = new UnmodifiableEntry((Map.Entry)result[i]);
            ++i;
        }
        if (result.length > array.length) {
            return result;
        }
        System.arraycopy(result, 0, array, 0, result.length);
        if (array.length > result.length) {
            array[result.length] = null;
        }
        return array;
    }
}

