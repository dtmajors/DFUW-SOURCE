/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections.CursorableLinkedList;
import org.apache.commons.collections.CursorableSubList;

public class CursorableLinkedList
implements List,
Serializable {
    private static final long serialVersionUID = 8836393098519411393L;
    protected transient int _size = 0;
    protected transient Listable _head = new Listable(null, null, null);
    protected transient int _modCount = 0;
    protected transient List _cursors = new ArrayList();

    public boolean add(Object o2) {
        this.insertListable(this._head.prev(), null, o2);
        return true;
    }

    public void add(int index, Object element) {
        if (index == this._size) {
            this.add(element);
        } else {
            if (index < 0 || index > this._size) {
                throw new IndexOutOfBoundsException(String.valueOf(index) + " < 0 or " + String.valueOf(index) + " > " + this._size);
            }
            Listable succ = this.isEmpty() ? null : this.getListableAt(index);
            Listable pred = null == succ ? null : succ.prev();
            this.insertListable(pred, succ, element);
        }
    }

    public boolean addAll(Collection c2) {
        if (c2.isEmpty()) {
            return false;
        }
        Iterator it = c2.iterator();
        while (it.hasNext()) {
            this.insertListable(this._head.prev(), null, it.next());
        }
        return true;
    }

    public boolean addAll(int index, Collection c2) {
        if (c2.isEmpty()) {
            return false;
        }
        if (this._size == index || this._size == 0) {
            return this.addAll(c2);
        }
        Listable succ = this.getListableAt(index);
        Listable pred = null == succ ? null : succ.prev();
        Iterator it = c2.iterator();
        while (it.hasNext()) {
            pred = this.insertListable(pred, succ, it.next());
        }
        return true;
    }

    public boolean addFirst(Object o2) {
        this.insertListable(null, this._head.next(), o2);
        return true;
    }

    public boolean addLast(Object o2) {
        this.insertListable(this._head.prev(), null, o2);
        return true;
    }

    public void clear() {
        Iterator it = this.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public boolean contains(Object o2) {
        Listable elt = this._head.next();
        Listable past = null;
        while (null != elt && past != this._head.prev()) {
            if (null == o2 && null == elt.value() || o2 != null && o2.equals(elt.value())) {
                return true;
            }
            past = elt;
            elt = past.next();
        }
        return false;
    }

    public boolean containsAll(Collection c2) {
        Iterator it = c2.iterator();
        while (it.hasNext()) {
            if (this.contains(it.next())) continue;
            return false;
        }
        return true;
    }

    public Cursor cursor() {
        return new Cursor(this, 0);
    }

    public Cursor cursor(int i) {
        return new Cursor(this, i);
    }

    public boolean equals(Object o2) {
        if (o2 == this) {
            return true;
        }
        if (!(o2 instanceof List)) {
            return false;
        }
        ListIterator it = ((List)o2).listIterator();
        Listable elt = this._head.next();
        Listable past = null;
        while (null != elt && past != this._head.prev()) {
            block7: {
                block6: {
                    if (!it.hasNext()) break block6;
                    boolean bl = null == elt.value() ? null != it.next() : !elt.value().equals(it.next());
                    if (!bl) break block7;
                }
                return false;
            }
            past = elt;
            elt = past.next();
        }
        return !it.hasNext();
    }

    public Object get(int index) {
        return this.getListableAt(index).value();
    }

    public Object getFirst() {
        try {
            return this._head.next().value();
        }
        catch (NullPointerException e2) {
            throw new NoSuchElementException();
        }
    }

    public Object getLast() {
        try {
            return this._head.prev().value();
        }
        catch (NullPointerException e2) {
            throw new NoSuchElementException();
        }
    }

    public int hashCode() {
        int hash = 1;
        Listable elt = this._head.next();
        Listable past = null;
        while (null != elt && past != this._head.prev()) {
            hash = 31 * hash + (null == elt.value() ? 0 : elt.value().hashCode());
            past = elt;
            elt = past.next();
        }
        return hash;
    }

    public int indexOf(Object o2) {
        int ndx = 0;
        if (null == o2) {
            Listable elt = this._head.next();
            Listable past = null;
            while (null != elt && past != this._head.prev()) {
                if (null == elt.value()) {
                    return ndx;
                }
                ++ndx;
                past = elt;
                elt = past.next();
            }
        } else {
            Listable elt = this._head.next();
            Listable past = null;
            while (null != elt && past != this._head.prev()) {
                if (o2.equals(elt.value())) {
                    return ndx;
                }
                ++ndx;
                past = elt;
                elt = past.next();
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return 0 == this._size;
    }

    public Iterator iterator() {
        return this.listIterator(0);
    }

    public int lastIndexOf(Object o2) {
        int ndx = this._size - 1;
        if (null == o2) {
            Listable elt = this._head.prev();
            Listable past = null;
            while (null != elt && past != this._head.next()) {
                if (null == elt.value()) {
                    return ndx;
                }
                --ndx;
                past = elt;
                elt = past.prev();
            }
        } else {
            Listable elt = this._head.prev();
            Listable past = null;
            while (null != elt && past != this._head.next()) {
                if (o2.equals(elt.value())) {
                    return ndx;
                }
                --ndx;
                past = elt;
                elt = past.prev();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return this.listIterator(0);
    }

    public ListIterator listIterator(int index) {
        if (index < 0 || index > this._size) {
            throw new IndexOutOfBoundsException(index + " < 0 or > " + this._size);
        }
        return new ListIter(this, index);
    }

    public boolean remove(Object o2) {
        Listable elt = this._head.next();
        Listable past = null;
        while (null != elt && past != this._head.prev()) {
            if (null == o2 && null == elt.value()) {
                this.removeListable(elt);
                return true;
            }
            if (o2 != null && o2.equals(elt.value())) {
                this.removeListable(elt);
                return true;
            }
            past = elt;
            elt = past.next();
        }
        return false;
    }

    public Object remove(int index) {
        Listable elt = this.getListableAt(index);
        Object ret = elt.value();
        this.removeListable(elt);
        return ret;
    }

    public boolean removeAll(Collection c2) {
        if (0 == c2.size() || 0 == this._size) {
            return false;
        }
        boolean changed = false;
        Iterator it = this.iterator();
        while (it.hasNext()) {
            if (!c2.contains(it.next())) continue;
            it.remove();
            changed = true;
        }
        return changed;
    }

    public Object removeFirst() {
        if (this._head.next() != null) {
            Object val = this._head.next().value();
            this.removeListable(this._head.next());
            return val;
        }
        throw new NoSuchElementException();
    }

    public Object removeLast() {
        if (this._head.prev() != null) {
            Object val = this._head.prev().value();
            this.removeListable(this._head.prev());
            return val;
        }
        throw new NoSuchElementException();
    }

    public boolean retainAll(Collection c2) {
        boolean changed = false;
        Iterator it = this.iterator();
        while (it.hasNext()) {
            if (c2.contains(it.next())) continue;
            it.remove();
            changed = true;
        }
        return changed;
    }

    public Object set(int index, Object element) {
        Listable elt = this.getListableAt(index);
        Object val = elt.setValue(element);
        this.broadcastListableChanged(elt);
        return val;
    }

    public int size() {
        return this._size;
    }

    public Object[] toArray() {
        Object[] array = new Object[this._size];
        int i = 0;
        Listable elt = this._head.next();
        Listable past = null;
        while (null != elt && past != this._head.prev()) {
            array[i++] = elt.value();
            past = elt;
            elt = past.next();
        }
        return array;
    }

    public Object[] toArray(Object[] a2) {
        if (a2.length < this._size) {
            a2 = (Object[])Array.newInstance(a2.getClass().getComponentType(), this._size);
        }
        int i = 0;
        Listable elt = this._head.next();
        Listable past = null;
        while (null != elt && past != this._head.prev()) {
            a2[i++] = elt.value();
            past = elt;
            elt = past.next();
        }
        if (a2.length > this._size) {
            a2[this._size] = null;
        }
        return a2;
    }

    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append("[");
        Listable elt = this._head.next();
        Listable past = null;
        while (null != elt && past != this._head.prev()) {
            if (this._head.next() != elt) {
                buf.append(", ");
            }
            buf.append(elt.value());
            past = elt;
            elt = past.next();
        }
        buf.append("]");
        return buf.toString();
    }

    public List subList(int i, int j) {
        if (i < 0 || j > this._size || i > j) {
            throw new IndexOutOfBoundsException();
        }
        if (i == 0 && j == this._size) {
            return this;
        }
        return new CursorableSubList(this, i, j);
    }

    protected Listable insertListable(Listable before, Listable after, Object value) {
        ++this._modCount;
        ++this._size;
        Listable elt = new Listable(before, after, value);
        if (null != before) {
            before.setNext(elt);
        } else {
            this._head.setNext(elt);
        }
        if (null != after) {
            after.setPrev(elt);
        } else {
            this._head.setPrev(elt);
        }
        this.broadcastListableInserted(elt);
        return elt;
    }

    protected void removeListable(Listable elt) {
        ++this._modCount;
        --this._size;
        if (this._head.next() == elt) {
            this._head.setNext(elt.next());
        }
        if (null != elt.next()) {
            elt.next().setPrev(elt.prev());
        }
        if (this._head.prev() == elt) {
            this._head.setPrev(elt.prev());
        }
        if (null != elt.prev()) {
            elt.prev().setNext(elt.next());
        }
        this.broadcastListableRemoved(elt);
    }

    protected Listable getListableAt(int index) {
        if (index < 0 || index >= this._size) {
            throw new IndexOutOfBoundsException(String.valueOf(index) + " < 0 or " + String.valueOf(index) + " >= " + this._size);
        }
        if (index <= this._size / 2) {
            Listable elt = this._head.next();
            int i = 0;
            while (i < index) {
                elt = elt.next();
                ++i;
            }
            return elt;
        }
        Listable elt = this._head.prev();
        int i = this._size - 1;
        while (i > index) {
            elt = elt.prev();
            --i;
        }
        return elt;
    }

    protected void registerCursor(Cursor cur2) {
        Iterator it = this._cursors.iterator();
        while (it.hasNext()) {
            WeakReference ref = (WeakReference)it.next();
            if (ref.get() != null) continue;
            it.remove();
        }
        this._cursors.add(new WeakReference<Cursor>(cur2));
    }

    protected void unregisterCursor(Cursor cur2) {
        Iterator it = this._cursors.iterator();
        while (it.hasNext()) {
            WeakReference ref = (WeakReference)it.next();
            Cursor cursor = (Cursor)ref.get();
            if (cursor == null) {
                it.remove();
                continue;
            }
            if (cursor != cur2) continue;
            ref.clear();
            it.remove();
            break;
        }
    }

    protected void invalidateCursors() {
        Iterator it = this._cursors.iterator();
        while (it.hasNext()) {
            WeakReference ref = (WeakReference)it.next();
            Cursor cursor = (Cursor)ref.get();
            if (cursor != null) {
                cursor.invalidate();
                ref.clear();
            }
            it.remove();
        }
    }

    protected void broadcastListableChanged(Listable elt) {
        Iterator it = this._cursors.iterator();
        while (it.hasNext()) {
            WeakReference ref = (WeakReference)it.next();
            Cursor cursor = (Cursor)ref.get();
            if (cursor == null) {
                it.remove();
                continue;
            }
            cursor.listableChanged(elt);
        }
    }

    protected void broadcastListableRemoved(Listable elt) {
        Iterator it = this._cursors.iterator();
        while (it.hasNext()) {
            WeakReference ref = (WeakReference)it.next();
            Cursor cursor = (Cursor)ref.get();
            if (cursor == null) {
                it.remove();
                continue;
            }
            cursor.listableRemoved(elt);
        }
    }

    protected void broadcastListableInserted(Listable elt) {
        Iterator it = this._cursors.iterator();
        while (it.hasNext()) {
            WeakReference ref = (WeakReference)it.next();
            Cursor cursor = (Cursor)ref.get();
            if (cursor == null) {
                it.remove();
                continue;
            }
            cursor.listableInserted(elt);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeInt(this._size);
        Listable cur2 = this._head.next();
        while (cur2 != null) {
            out.writeObject(cur2.value());
            cur2 = cur2.next();
        }
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this._size = 0;
        this._modCount = 0;
        this._cursors = new ArrayList();
        this._head = new Listable(null, null, null);
        int size = in.readInt();
        int i = 0;
        while (i < size) {
            this.add(in.readObject());
            ++i;
        }
    }
}

