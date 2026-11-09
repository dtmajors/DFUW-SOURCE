/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.list;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import org.apache.commons.collections.list.TreeList;

public class TreeList
extends AbstractList {
    private AVLNode root;
    private int size;

    public TreeList() {
    }

    public TreeList(Collection coll) {
        this.addAll(coll);
    }

    public Object get(int index) {
        this.checkInterval(index, 0, this.size() - 1);
        return this.root.get(index).getValue();
    }

    public int size() {
        return this.size;
    }

    public Iterator iterator() {
        return this.listIterator(0);
    }

    public ListIterator listIterator() {
        return this.listIterator(0);
    }

    public ListIterator listIterator(int fromIndex) {
        this.checkInterval(fromIndex, 0, this.size());
        return new TreeListIterator(this, fromIndex);
    }

    public int indexOf(Object object) {
        if (this.root == null) {
            return -1;
        }
        return this.root.indexOf(object, this.root.relativePosition);
    }

    public boolean contains(Object object) {
        return this.indexOf(object) >= 0;
    }

    public Object[] toArray() {
        Object[] array = new Object[this.size()];
        if (this.root != null) {
            this.root.toArray(array, this.root.relativePosition);
        }
        return array;
    }

    public void add(int index, Object obj) {
        ++this.modCount;
        this.checkInterval(index, 0, this.size());
        this.root = this.root == null ? new AVLNode(index, obj, null, null, null) : this.root.insert(index, obj);
        ++this.size;
    }

    public Object set(int index, Object obj) {
        this.checkInterval(index, 0, this.size() - 1);
        AVLNode node = this.root.get(index);
        Object result = node.value;
        node.setValue(obj);
        return result;
    }

    public Object remove(int index) {
        ++this.modCount;
        this.checkInterval(index, 0, this.size() - 1);
        Object result = this.get(index);
        this.root = this.root.remove(index);
        --this.size;
        return result;
    }

    public void clear() {
        ++this.modCount;
        this.root = null;
        this.size = 0;
    }

    private void checkInterval(int index, int startIndex, int endIndex) {
        if (index < startIndex || index > endIndex) {
            throw new IndexOutOfBoundsException("Invalid index:" + index + ", size=" + this.size());
        }
    }

    static /* synthetic */ int access$301(TreeList x0) {
        return x0.modCount;
    }

    static /* synthetic */ AVLNode access$400(TreeList x0) {
        return x0.root;
    }

    static /* synthetic */ int access$501(TreeList x0) {
        return x0.modCount;
    }
}

