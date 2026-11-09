/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.buffer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections.Buffer;
import org.apache.commons.collections.BufferUnderflowException;

public class UnboundedFifoBuffer
extends AbstractCollection
implements Buffer,
Serializable {
    private static final long serialVersionUID = -3482960336579541419L;
    protected transient Object[] buffer;
    protected transient int head;
    protected transient int tail;

    public UnboundedFifoBuffer() {
        this(32);
    }

    public UnboundedFifoBuffer(int initialSize) {
        if (initialSize <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        this.buffer = new Object[initialSize + 1];
        this.head = 0;
        this.tail = 0;
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
        int size = in.readInt();
        this.buffer = new Object[size];
        int i = 0;
        while (i < size) {
            this.buffer[i] = in.readObject();
            ++i;
        }
        this.head = 0;
        this.tail = size;
    }

    public int size() {
        int size = 0;
        size = this.tail < this.head ? this.buffer.length - this.head + this.tail : this.tail - this.head;
        return size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public boolean add(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempted to add null object to buffer");
        }
        if (this.size() + 1 >= this.buffer.length) {
            Object[] tmp = new Object[(this.buffer.length - 1) * 2 + 1];
            int j = 0;
            int i = this.head;
            while (i != this.tail) {
                tmp[j] = this.buffer[i];
                this.buffer[i] = null;
                ++j;
                if (++i != this.buffer.length) continue;
                i = 0;
            }
            this.buffer = tmp;
            this.head = 0;
            this.tail = j;
        }
        this.buffer[this.tail] = obj;
        ++this.tail;
        if (this.tail >= this.buffer.length) {
            this.tail = 0;
        }
        return true;
    }

    public Object get() {
        if (this.isEmpty()) {
            throw new BufferUnderflowException("The buffer is already empty");
        }
        return this.buffer[this.head];
    }

    public Object remove() {
        if (this.isEmpty()) {
            throw new BufferUnderflowException("The buffer is already empty");
        }
        Object element = this.buffer[this.head];
        if (null != element) {
            this.buffer[this.head] = null;
            ++this.head;
            if (this.head >= this.buffer.length) {
                this.head = 0;
            }
        }
        return element;
    }

    private int increment(int index) {
        if (++index >= this.buffer.length) {
            index = 0;
        }
        return index;
    }

    private int decrement(int index) {
        if (--index < 0) {
            index = this.buffer.length - 1;
        }
        return index;
    }

    public Iterator iterator() {
        return new Iterator(this){
            private int index;
            private int lastReturnedIndex;
            private final /* synthetic */ UnboundedFifoBuffer this$0;
            {
                this.this$0 = this$0;
                this.index = this.this$0.head;
                this.lastReturnedIndex = -1;
            }

            public boolean hasNext() {
                return this.index != this.this$0.tail;
            }

            public Object next() {
                if (!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                this.lastReturnedIndex = this.index;
                this.index = UnboundedFifoBuffer.access$000(this.this$0, this.index);
                return this.this$0.buffer[this.lastReturnedIndex];
            }

            public void remove() {
                if (this.lastReturnedIndex == -1) {
                    throw new IllegalStateException();
                }
                if (this.lastReturnedIndex == this.this$0.head) {
                    this.this$0.remove();
                    this.lastReturnedIndex = -1;
                    return;
                }
                int i = this.lastReturnedIndex + 1;
                while (i != this.this$0.tail) {
                    if (i >= this.this$0.buffer.length) {
                        this.this$0.buffer[i - 1] = this.this$0.buffer[0];
                        i = 0;
                        continue;
                    }
                    this.this$0.buffer[i - 1] = this.this$0.buffer[i];
                    ++i;
                }
                this.lastReturnedIndex = -1;
                this.this$0.tail = UnboundedFifoBuffer.access$100(this.this$0, this.this$0.tail);
                this.this$0.buffer[this.this$0.tail] = null;
                this.index = UnboundedFifoBuffer.access$100(this.this$0, this.index);
            }
        };
    }

    static /* synthetic */ int access$000(UnboundedFifoBuffer x0, int x1) {
        return x0.increment(x1);
    }

    static /* synthetic */ int access$100(UnboundedFifoBuffer x0, int x1) {
        return x0.decrement(x1);
    }
}

