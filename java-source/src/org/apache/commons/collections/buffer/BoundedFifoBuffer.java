/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.buffer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections.BoundedCollection;
import org.apache.commons.collections.Buffer;
import org.apache.commons.collections.BufferOverflowException;
import org.apache.commons.collections.BufferUnderflowException;

public class BoundedFifoBuffer
extends AbstractCollection
implements Buffer,
BoundedCollection,
Serializable {
    private static final long serialVersionUID = 5603722811189451017L;
    private transient Object[] elements;
    private transient int start = 0;
    private transient int end = 0;
    private transient boolean full = false;
    private final int maxElements;

    public BoundedFifoBuffer() {
        this(32);
    }

    public BoundedFifoBuffer(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        this.elements = new Object[size];
        this.maxElements = this.elements.length;
    }

    public BoundedFifoBuffer(Collection coll) {
        this(coll.size());
        this.addAll(coll);
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeInt(this.size());
        Iterator it = this.iterator();
        while (it.hasNext()) {
            out.writeObject(it.next());
        }
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.elements = new Object[this.maxElements];
        int size = in.readInt();
        int i = 0;
        while (i < size) {
            this.elements[i] = in.readObject();
            ++i;
        }
        this.start = 0;
        this.end = size;
        this.full = size == this.maxElements;
    }

    public int size() {
        int size = 0;
        size = this.end < this.start ? this.maxElements - this.start + this.end : (this.end == this.start ? (this.full ? this.maxElements : 0) : this.end - this.start);
        return size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public boolean isFull() {
        return this.size() == this.maxElements;
    }

    public int maxSize() {
        return this.maxElements;
    }

    public void clear() {
        this.full = false;
        this.start = 0;
        this.end = 0;
        Arrays.fill(this.elements, null);
    }

    public boolean add(Object element) {
        if (null == element) {
            throw new NullPointerException("Attempted to add null object to buffer");
        }
        if (this.full) {
            throw new BufferOverflowException("The buffer cannot hold more than " + this.maxElements + " objects.");
        }
        this.elements[this.end++] = element;
        if (this.end >= this.maxElements) {
            this.end = 0;
        }
        if (this.end == this.start) {
            this.full = true;
        }
        return true;
    }

    public Object get() {
        if (this.isEmpty()) {
            throw new BufferUnderflowException("The buffer is already empty");
        }
        return this.elements[this.start];
    }

    public Object remove() {
        if (this.isEmpty()) {
            throw new BufferUnderflowException("The buffer is already empty");
        }
        Object element = this.elements[this.start];
        if (null != element) {
            this.elements[this.start++] = null;
            if (this.start >= this.maxElements) {
                this.start = 0;
            }
            this.full = false;
        }
        return element;
    }

    private int increment(int index) {
        if (++index >= this.maxElements) {
            index = 0;
        }
        return index;
    }

    private int decrement(int index) {
        if (--index < 0) {
            index = this.maxElements - 1;
        }
        return index;
    }

    public Iterator iterator() {
        return new Iterator(this){
            private int index;
            private int lastReturnedIndex;
            private boolean isFirst;
            private final /* synthetic */ BoundedFifoBuffer this$0;
            {
                this.this$0 = this$0;
                this.index = BoundedFifoBuffer.access$000(this.this$0);
                this.lastReturnedIndex = -1;
                this.isFirst = BoundedFifoBuffer.access$100(this.this$0);
            }

            public boolean hasNext() {
                return this.isFirst || this.index != BoundedFifoBuffer.access$200(this.this$0);
            }

            public Object next() {
                if (!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                this.isFirst = false;
                this.lastReturnedIndex = this.index;
                this.index = BoundedFifoBuffer.access$300(this.this$0, this.index);
                return BoundedFifoBuffer.access$400(this.this$0)[this.lastReturnedIndex];
            }

            public void remove() {
                if (this.lastReturnedIndex == -1) {
                    throw new IllegalStateException();
                }
                if (this.lastReturnedIndex == BoundedFifoBuffer.access$000(this.this$0)) {
                    this.this$0.remove();
                    this.lastReturnedIndex = -1;
                    return;
                }
                int i = this.lastReturnedIndex + 1;
                while (i != BoundedFifoBuffer.access$200(this.this$0)) {
                    if (i >= BoundedFifoBuffer.access$500(this.this$0)) {
                        BoundedFifoBuffer.access$400((BoundedFifoBuffer)this.this$0)[i - 1] = BoundedFifoBuffer.access$400(this.this$0)[0];
                        i = 0;
                        continue;
                    }
                    BoundedFifoBuffer.access$400((BoundedFifoBuffer)this.this$0)[i - 1] = BoundedFifoBuffer.access$400(this.this$0)[i];
                    ++i;
                }
                this.lastReturnedIndex = -1;
                BoundedFifoBuffer.access$202(this.this$0, BoundedFifoBuffer.access$600(this.this$0, BoundedFifoBuffer.access$200(this.this$0)));
                BoundedFifoBuffer.access$400((BoundedFifoBuffer)this.this$0)[BoundedFifoBuffer.access$200((BoundedFifoBuffer)this.this$0)] = null;
                BoundedFifoBuffer.access$102(this.this$0, false);
                this.index = BoundedFifoBuffer.access$600(this.this$0, this.index);
            }
        };
    }

    static /* synthetic */ int access$000(BoundedFifoBuffer x0) {
        return x0.start;
    }

    static /* synthetic */ boolean access$100(BoundedFifoBuffer x0) {
        return x0.full;
    }

    static /* synthetic */ int access$200(BoundedFifoBuffer x0) {
        return x0.end;
    }

    static /* synthetic */ int access$300(BoundedFifoBuffer x0, int x1) {
        return x0.increment(x1);
    }

    static /* synthetic */ Object[] access$400(BoundedFifoBuffer x0) {
        return x0.elements;
    }

    static /* synthetic */ int access$500(BoundedFifoBuffer x0) {
        return x0.maxElements;
    }

    static /* synthetic */ int access$202(BoundedFifoBuffer x0, int x1) {
        x0.end = x1;
        return x0.end;
    }

    static /* synthetic */ int access$600(BoundedFifoBuffer x0, int x1) {
        return x0.decrement(x1);
    }

    static /* synthetic */ boolean access$102(BoundedFifoBuffer x0, boolean x1) {
        x0.full = x1;
        return x0.full;
    }
}

