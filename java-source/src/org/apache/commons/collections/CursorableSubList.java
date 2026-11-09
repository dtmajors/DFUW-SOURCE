/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections.CursorableLinkedList;

class CursorableSubList
extends CursorableLinkedList
implements List {
    protected CursorableLinkedList _list = null;
    protected CursorableLinkedList.Listable _pre = null;
    protected CursorableLinkedList.Listable _post = null;

    CursorableSubList(CursorableLinkedList list, int from, int to) {
        if (0 > from || list.size() < to) {
            throw new IndexOutOfBoundsException();
        }
        if (from > to) {
            throw new IllegalArgumentException();
        }
        this._list = list;
        if (from < list.size()) {
            this._head.setNext(this._list.getListableAt(from));
            this._pre = null == this._head.next() ? null : this._head.next().prev();
        } else {
            this._pre = this._list.getListableAt(from - 1);
        }
        if (from == to) {
            this._head.setNext(null);
            this._head.setPrev(null);
            this._post = to < list.size() ? this._list.getListableAt(to) : null;
        } else {
            this._head.setPrev(this._list.getListableAt(to - 1));
            this._post = this._head.prev().next();
        }
        this._size = to - from;
        this._modCount = this._list._modCount;
    }

    public void clear() {
        this.checkForComod();
        Iterator it = this.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public Iterator iterator() {
        this.checkForComod();
        return super.iterator();
    }

    public int size() {
        this.checkForComod();
        return super.size();
    }

    public boolean isEmpty() {
        this.checkForComod();
        return super.isEmpty();
    }

    public Object[] toArray() {
        this.checkForComod();
        return super.toArray();
    }

    public Object[] toArray(Object[] a2) {
        this.checkForComod();
        return super.toArray(a2);
    }

    public boolean contains(Object o2) {
        this.checkForComod();
        return super.contains(o2);
    }

    public boolean remove(Object o2) {
        this.checkForComod();
        return super.remove(o2);
    }

    public Object removeFirst() {
        this.checkForComod();
        return super.removeFirst();
    }

    public Object removeLast() {
        this.checkForComod();
        return super.removeLast();
    }

    public boolean addAll(Collection c2) {
        this.checkForComod();
        return super.addAll(c2);
    }

    public boolean add(Object o2) {
        this.checkForComod();
        return super.add(o2);
    }

    public boolean addFirst(Object o2) {
        this.checkForComod();
        return super.addFirst(o2);
    }

    public boolean addLast(Object o2) {
        this.checkForComod();
        return super.addLast(o2);
    }

    public boolean removeAll(Collection c2) {
        this.checkForComod();
        return super.removeAll(c2);
    }

    public boolean containsAll(Collection c2) {
        this.checkForComod();
        return super.containsAll(c2);
    }

    public boolean addAll(int index, Collection c2) {
        this.checkForComod();
        return super.addAll(index, c2);
    }

    public int hashCode() {
        this.checkForComod();
        return super.hashCode();
    }

    public boolean retainAll(Collection c2) {
        this.checkForComod();
        return super.retainAll(c2);
    }

    public Object set(int index, Object element) {
        this.checkForComod();
        return super.set(index, element);
    }

    public boolean equals(Object o2) {
        this.checkForComod();
        return super.equals(o2);
    }

    public Object get(int index) {
        this.checkForComod();
        return super.get(index);
    }

    public Object getFirst() {
        this.checkForComod();
        return super.getFirst();
    }

    public Object getLast() {
        this.checkForComod();
        return super.getLast();
    }

    public void add(int index, Object element) {
        this.checkForComod();
        super.add(index, element);
    }

    public ListIterator listIterator(int index) {
        this.checkForComod();
        return super.listIterator(index);
    }

    public Object remove(int index) {
        this.checkForComod();
        return super.remove(index);
    }

    public int indexOf(Object o2) {
        this.checkForComod();
        return super.indexOf(o2);
    }

    public int lastIndexOf(Object o2) {
        this.checkForComod();
        return super.lastIndexOf(o2);
    }

    public ListIterator listIterator() {
        this.checkForComod();
        return super.listIterator();
    }

    public List subList(int fromIndex, int toIndex) {
        this.checkForComod();
        return super.subList(fromIndex, toIndex);
    }

    protected CursorableLinkedList.Listable insertListable(CursorableLinkedList.Listable before, CursorableLinkedList.Listable after, Object value) {
        ++this._modCount;
        ++this._size;
        CursorableLinkedList.Listable elt = this._list.insertListable(null == before ? this._pre : before, null == after ? this._post : after, value);
        if (null == this._head.next()) {
            this._head.setNext(elt);
            this._head.setPrev(elt);
        }
        if (before == this._head.prev()) {
            this._head.setPrev(elt);
        }
        if (after == this._head.next()) {
            this._head.setNext(elt);
        }
        this.broadcastListableInserted(elt);
        return elt;
    }

    protected void removeListable(CursorableLinkedList.Listable elt) {
        ++this._modCount;
        --this._size;
        if (this._head.next() == elt && this._head.prev() == elt) {
            this._head.setNext(null);
            this._head.setPrev(null);
        }
        if (this._head.next() == elt) {
            this._head.setNext(elt.next());
        }
        if (this._head.prev() == elt) {
            this._head.setPrev(elt.prev());
        }
        this._list.removeListable(elt);
        this.broadcastListableRemoved(elt);
    }

    protected void checkForComod() throws ConcurrentModificationException {
        if (this._modCount != this._list._modCount) {
            throw new ConcurrentModificationException();
        }
    }
}

