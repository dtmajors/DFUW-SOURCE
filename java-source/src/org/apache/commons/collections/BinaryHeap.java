/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections;

import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections.Buffer;
import org.apache.commons.collections.BufferUnderflowException;
import org.apache.commons.collections.PriorityQueue;

public final class BinaryHeap
extends AbstractCollection
implements PriorityQueue,
Buffer {
    private static final int DEFAULT_CAPACITY = 13;
    int m_size;
    Object[] m_elements;
    boolean m_isMinHeap;
    Comparator m_comparator;

    public BinaryHeap() {
        this(13, true);
    }

    public BinaryHeap(Comparator comparator) {
        this();
        this.m_comparator = comparator;
    }

    public BinaryHeap(int capacity) {
        this(capacity, true);
    }

    public BinaryHeap(int capacity, Comparator comparator) {
        this(capacity);
        this.m_comparator = comparator;
    }

    public BinaryHeap(boolean isMinHeap) {
        this(13, isMinHeap);
    }

    public BinaryHeap(boolean isMinHeap, Comparator comparator) {
        this(isMinHeap);
        this.m_comparator = comparator;
    }

    public BinaryHeap(int capacity, boolean isMinHeap) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("invalid capacity");
        }
        this.m_isMinHeap = isMinHeap;
        this.m_elements = new Object[capacity + 1];
    }

    public BinaryHeap(int capacity, boolean isMinHeap, Comparator comparator) {
        this(capacity, isMinHeap);
        this.m_comparator = comparator;
    }

    public void clear() {
        this.m_elements = new Object[this.m_elements.length];
        this.m_size = 0;
    }

    public boolean isEmpty() {
        return this.m_size == 0;
    }

    public boolean isFull() {
        return this.m_elements.length == this.m_size + 1;
    }

    public void insert(Object element) {
        if (this.isFull()) {
            this.grow();
        }
        if (this.m_isMinHeap) {
            this.percolateUpMinHeap(element);
        } else {
            this.percolateUpMaxHeap(element);
        }
    }

    public Object peek() throws NoSuchElementException {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.m_elements[1];
    }

    public Object pop() throws NoSuchElementException {
        Object result = this.peek();
        this.m_elements[1] = this.m_elements[this.m_size--];
        this.m_elements[this.m_size + 1] = null;
        if (this.m_size != 0) {
            if (this.m_isMinHeap) {
                this.percolateDownMinHeap(1);
            } else {
                this.percolateDownMaxHeap(1);
            }
        }
        return result;
    }

    protected void percolateDownMinHeap(int index) {
        Object element = this.m_elements[index];
        int hole = index;
        while (hole * 2 <= this.m_size) {
            int child = hole * 2;
            if (child != this.m_size && this.compare(this.m_elements[child + 1], this.m_elements[child]) < 0) {
                ++child;
            }
            if (this.compare(this.m_elements[child], element) >= 0) break;
            this.m_elements[hole] = this.m_elements[child];
            hole = child;
        }
        this.m_elements[hole] = element;
    }

    protected void percolateDownMaxHeap(int index) {
        Object element = this.m_elements[index];
        int hole = index;
        while (hole * 2 <= this.m_size) {
            int child = hole * 2;
            if (child != this.m_size && this.compare(this.m_elements[child + 1], this.m_elements[child]) > 0) {
                ++child;
            }
            if (this.compare(this.m_elements[child], element) <= 0) break;
            this.m_elements[hole] = this.m_elements[child];
            hole = child;
        }
        this.m_elements[hole] = element;
    }

    protected void percolateUpMinHeap(int index) {
        int hole = index;
        Object element = this.m_elements[hole];
        while (hole > 1 && this.compare(element, this.m_elements[hole / 2]) < 0) {
            int next = hole / 2;
            this.m_elements[hole] = this.m_elements[next];
            hole = next;
        }
        this.m_elements[hole] = element;
    }

    protected void percolateUpMinHeap(Object element) {
        this.m_elements[++this.m_size] = element;
        this.percolateUpMinHeap(this.m_size);
    }

    protected void percolateUpMaxHeap(int index) {
        int hole = index;
        Object element = this.m_elements[hole];
        while (hole > 1 && this.compare(element, this.m_elements[hole / 2]) > 0) {
            int next = hole / 2;
            this.m_elements[hole] = this.m_elements[next];
            hole = next;
        }
        this.m_elements[hole] = element;
    }

    protected void percolateUpMaxHeap(Object element) {
        this.m_elements[++this.m_size] = element;
        this.percolateUpMaxHeap(this.m_size);
    }

    private int compare(Object a2, Object b2) {
        if (this.m_comparator != null) {
            return this.m_comparator.compare(a2, b2);
        }
        return ((Comparable)a2).compareTo(b2);
    }

    protected void grow() {
        Object[] elements = new Object[this.m_elements.length * 2];
        System.arraycopy(this.m_elements, 0, elements, 0, this.m_elements.length);
        this.m_elements = elements;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[ ");
        int i = 1;
        while (i < this.m_size + 1) {
            if (i != 1) {
                sb.append(", ");
            }
            sb.append(this.m_elements[i]);
            ++i;
        }
        sb.append(" ]");
        return sb.toString();
    }

    public Iterator iterator() {
        return new Iterator(this){
            private int index;
            private int lastReturnedIndex;
            private final /* synthetic */ BinaryHeap this$0;
            {
                this.this$0 = this$0;
                this.index = 1;
                this.lastReturnedIndex = -1;
            }

            public boolean hasNext() {
                return this.index <= this.this$0.m_size;
            }

            public Object next() {
                if (!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                this.lastReturnedIndex = this.index++;
                return this.this$0.m_elements[this.lastReturnedIndex];
            }

            public void remove() {
                if (this.lastReturnedIndex == -1) {
                    throw new IllegalStateException();
                }
                this.this$0.m_elements[this.lastReturnedIndex] = this.this$0.m_elements[this.this$0.m_size];
                this.this$0.m_elements[this.this$0.m_size] = null;
                --this.this$0.m_size;
                if (this.this$0.m_size != 0 && this.lastReturnedIndex <= this.this$0.m_size) {
                    int compareToParent = 0;
                    if (this.lastReturnedIndex > 1) {
                        compareToParent = BinaryHeap.access$000(this.this$0, this.this$0.m_elements[this.lastReturnedIndex], this.this$0.m_elements[this.lastReturnedIndex / 2]);
                    }
                    if (this.this$0.m_isMinHeap) {
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

    public boolean add(Object object) {
        this.insert(object);
        return true;
    }

    public Object get() {
        try {
            return this.peek();
        }
        catch (NoSuchElementException e2) {
            throw new BufferUnderflowException();
        }
    }

    public Object remove() {
        try {
            return this.pop();
        }
        catch (NoSuchElementException e2) {
            throw new BufferUnderflowException();
        }
    }

    public int size() {
        return this.m_size;
    }

    static /* synthetic */ int access$000(BinaryHeap x0, Object x1, Object x2) {
        return x0.compare(x1, x2);
    }
}

