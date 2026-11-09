/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.buffer;

import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections.Buffer;
import org.apache.commons.collections.BufferUnderflowException;

public class PriorityBuffer
extends AbstractCollection
implements Buffer {
    private static final int DEFAULT_CAPACITY = 13;
    protected Object[] elements;
    protected int size;
    protected boolean ascendingOrder;
    protected Comparator comparator;

    public PriorityBuffer() {
        this(13, true, null);
    }

    public PriorityBuffer(Comparator comparator) {
        this(13, true, comparator);
    }

    public PriorityBuffer(boolean ascendingOrder) {
        this(13, ascendingOrder, null);
    }

    public PriorityBuffer(boolean ascendingOrder, Comparator comparator) {
        this(13, ascendingOrder, comparator);
    }

    public PriorityBuffer(int capacity) {
        this(capacity, true, null);
    }

    public PriorityBuffer(int capacity, Comparator comparator) {
        this(capacity, true, comparator);
    }

    public PriorityBuffer(int capacity, boolean ascendingOrder) {
        this(capacity, ascendingOrder, null);
    }

    public PriorityBuffer(int capacity, boolean ascendingOrder, Comparator comparator) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("invalid capacity");
        }
        this.ascendingOrder = ascendingOrder;
        this.elements = new Object[capacity + 1];
        this.comparator = comparator;
    }

    public boolean isAscendingOrder() {
        return this.ascendingOrder;
    }

    public Comparator comparator() {
        return this.comparator;
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        this.elements = new Object[this.elements.length];
        this.size = 0;
    }

    public boolean add(Object element) {
        if (this.isAtCapacity()) {
            this.grow();
        }
        if (this.ascendingOrder) {
            this.percolateUpMinHeap(element);
        } else {
            this.percolateUpMaxHeap(element);
        }
        return true;
    }

    public Object get() {
        if (this.isEmpty()) {
            throw new BufferUnderflowException();
        }
        return this.elements[1];
    }

    public Object remove() {
        Object result = this.get();
        this.elements[1] = this.elements[this.size--];
        this.elements[this.size + 1] = null;
        if (this.size != 0) {
            if (this.ascendingOrder) {
                this.percolateDownMinHeap(1);
            } else {
                this.percolateDownMaxHeap(1);
            }
        }
        return result;
    }

    protected boolean isAtCapacity() {
        return this.elements.length == this.size + 1;
    }

    protected void percolateDownMinHeap(int index) {
        Object element = this.elements[index];
        int hole = index;
        while (hole * 2 <= this.size) {
            int child = hole * 2;
            if (child != this.size && this.compare(this.elements[child + 1], this.elements[child]) < 0) {
                ++child;
            }
            if (this.compare(this.elements[child], element) >= 0) break;
            this.elements[hole] = this.elements[child];
            hole = child;
        }
        this.elements[hole] = element;
    }

    protected void percolateDownMaxHeap(int index) {
        Object element = this.elements[index];
        int hole = index;
        while (hole * 2 <= this.size) {
            int child = hole * 2;
            if (child != this.size && this.compare(this.elements[child + 1], this.elements[child]) > 0) {
                ++child;
            }
            if (this.compare(this.elements[child], element) <= 0) break;
            this.elements[hole] = this.elements[child];
            hole = child;
        }
        this.elements[hole] = element;
    }

    protected void percolateUpMinHeap(int index) {
        int hole = index;
        Object element = this.elements[hole];
        while (hole > 1 && this.compare(element, this.elements[hole / 2]) < 0) {
            int next = hole / 2;
            this.elements[hole] = this.elements[next];
            hole = next;
        }
        this.elements[hole] = element;
    }

    protected void percolateUpMinHeap(Object element) {
        this.elements[++this.size] = element;
        this.percolateUpMinHeap(this.size);
    }

    protected void percolateUpMaxHeap(int index) {
        int hole = index;
        Object element = this.elements[hole];
        while (hole > 1 && this.compare(element, this.elements[hole / 2]) > 0) {
            int next = hole / 2;
            this.elements[hole] = this.elements[next];
            hole = next;
        }
        this.elements[hole] = element;
    }

    protected void percolateUpMaxHeap(Object element) {
        this.elements[++this.size] = element;
        this.percolateUpMaxHeap(this.size);
    }

    protected int compare(Object a2, Object b2) {
        if (this.comparator != null) {
            return this.comparator.compare(a2, b2);
        }
        return ((Comparable)a2).compareTo(b2);
    }

    protected void grow() {
        Object[] array = new Object[this.elements.length * 2];
        System.arraycopy(this.elements, 0, array, 0, this.elements.length);
        this.elements = array;
    }

    public Iterator iterator() {
        return new Iterator(this){
            private int index;
            private int lastReturnedIndex;
            private final /* synthetic */ PriorityBuffer this$0;
            {
                this.this$0 = this$0;
                this.index = 1;
                this.lastReturnedIndex = -1;
            }

            public boolean hasNext() {
                return this.index <= this.this$0.size;
            }

            public Object next() {
                if (!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                this.lastReturnedIndex = this.index++;
                return this.this$0.elements[this.lastReturnedIndex];
            }

            public void remove() {
                if (this.lastReturnedIndex == -1) {
                    throw new IllegalStateException();
                }
                this.this$0.elements[this.lastReturnedIndex] = this.this$0.elements[this.this$0.size];
                this.this$0.elements[this.this$0.size] = null;
                --this.this$0.size;
                if (this.this$0.size != 0 && this.lastReturnedIndex <= this.this$0.size) {
                    int compareToParent = 0;
                    if (this.lastReturnedIndex > 1) {
                        compareToParent = this.this$0.compare(this.this$0.elements[this.lastReturnedIndex], this.this$0.elements[this.lastReturnedIndex / 2]);
                    }
                    if (this.this$0.ascendingOrder) {
                        if (this.lastReturnedIndex > 1 && compareToParent < 0) {
                            this.this$0.percolateUpMinHeap(this.lastReturnedIndex);
                        } else {
                            this.this$0.percolateDownMinHeap(this.lastReturnedIndex);
                        }
                    } else if (this.lastReturnedIndex > 1 && compareToParent > 0) {
                        this.this$0.percolateUpMaxHeap(this.lastReturnedIndex);
                    } else {
                        this.this$0.percolateDownMaxHeap(this.lastReturnedIndex);
                    }
                }
                --this.index;
                this.lastReturnedIndex = -1;
            }
        };
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[ ");
        int i = 1;
        while (i < this.size + 1) {
            if (i != 1) {
                sb.append(", ");
            }
            sb.append(this.elements[i]);
            ++i;
        }
        sb.append(" ]");
        return sb.toString();
    }
}

