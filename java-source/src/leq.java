/*
 * Decompiled with CFR.
 */
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class leq<E>
extends AbstractSequentialList<E>
implements Serializable,
Cloneable,
Queue<E> {
    private transient a<E> rjf = new a<Object>(null, null, null);
    private transient int Size = 0;
    private b rjg = null;
    private b rjh = null;
    private static final long serialVersionUID = 876323262645176354L;

    public leq() {
        this.rjf.rjk = this.rjf;
        this.rjf.rjj = this.rjf.rjk;
    }

    public leq(Collection<? extends E> collection) {
        this();
        this.addAll(collection);
    }

    public E getFirst() {
        if (this.Size == 0) {
            throw new NoSuchElementException();
        }
        return this.rjf.rjj.rji;
    }

    public E getLast() {
        if (this.Size == 0) {
            throw new NoSuchElementException();
        }
        return this.rjf.rjk.rji;
    }

    public E removeFirst() {
        return this.a(this.rjf.rjj);
    }

    public E removeLast() {
        return this.a(this.rjf.rjk);
    }

    public void addFirst(E e2) {
        this.a(e2, this.rjf.rjj);
    }

    public void addLast(E e2) {
        this.a(e2, this.rjf);
    }

    @Override
    public boolean contains(Object object) {
        return this.indexOf(object) != -1;
    }

    @Override
    public int size() {
        return this.Size;
    }

    @Override
    public boolean add(E e2) {
        this.a(e2, this.rjf);
        return true;
    }

    @Override
    public boolean remove(Object object) {
        if (object == null) {
            a a2 = this.rjf.rjj;
            while (a2 != this.rjf) {
                if (a2.rji == null) {
                    this.a(a2);
                    return true;
                }
                a2 = a2.rjj;
            }
        } else {
            a a3 = this.rjf.rjj;
            while (a3 != this.rjf) {
                if (object.equals(a3.rji)) {
                    this.a(a3);
                    return true;
                }
                a3 = a3.rjj;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return this.addAll(this.Size, collection);
    }

    @Override
    public boolean addAll(int n, Collection<? extends E> collection) {
        if (n < 0 || n > this.Size) {
            throw new IndexOutOfBoundsException("Index: " + n + ", Size: " + this.Size);
        }
        Object[] objectArray = collection.toArray();
        int n2 = objectArray.length;
        if (n2 == 0) {
            return false;
        }
        a<E> a2 = n == this.Size ? this.rjf : this.act(n);
        a<Object> a3 = a2.rjk;
        for (int i = 0; i < n2; ++i) {
            a<Object> a4 = new a<Object>(objectArray[i], a2, a3);
            a3.rjj = a4;
            a3 = a4;
        }
        a2.rjk = a3;
        this.Size += n2;
        return true;
    }

    @Override
    public void clear() {
        assert (this.rjg == null);
        a a2 = this.rjf.rjj;
        while (a2 != this.rjf) {
            a a3 = a2.rjj;
            a2.rjk = null;
            a2.rjj = null;
            a2.rji = null;
            a2 = a3;
        }
        this.rjf.rjk = this.rjf;
        this.rjf.rjj = this.rjf.rjk;
        this.Size = 0;
    }

    @Override
    public E get(int n) {
        return this.act((int)n).rji;
    }

    @Override
    public E set(int n, E e2) {
        a<E> a2 = this.act(n);
        Object e3 = a2.rji;
        a2.rji = e2;
        return e3;
    }

    @Override
    public void add(int n, E e2) {
        this.a(e2, n == this.Size ? this.rjf : this.act(n));
    }

    @Override
    public E remove(int n) {
        return this.a(this.act(n));
    }

    private a<E> act(int n) {
        if (n < 0 || n >= this.Size) {
            throw new IndexOutOfBoundsException("Index: " + n + ", Size: " + this.Size);
        }
        a<E> a2 = this.rjf;
        if (n < this.Size >> 1) {
            for (int i = 0; i <= n; ++i) {
                a2 = a2.rjj;
            }
        } else {
            for (int i = this.Size; i > n; --i) {
                a2 = a2.rjk;
            }
        }
        return a2;
    }

    @Override
    public int indexOf(Object object) {
        int n = 0;
        if (object == null) {
            a a2 = this.rjf.rjj;
            while (a2 != this.rjf) {
                if (a2.rji == null) {
                    return n;
                }
                ++n;
                a2 = a2.rjj;
            }
        } else {
            a a3 = this.rjf.rjj;
            while (a3 != this.rjf) {
                if (object.equals(a3.rji)) {
                    return n;
                }
                ++n;
                a3 = a3.rjj;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int n = this.Size;
        if (object == null) {
            a a2 = this.rjf.rjk;
            while (a2 != this.rjf) {
                --n;
                if (a2.rji == null) {
                    return n;
                }
                a2 = a2.rjk;
            }
        } else {
            a a3 = this.rjf.rjk;
            while (a3 != this.rjf) {
                --n;
                if (object.equals(a3.rji)) {
                    return n;
                }
                a3 = a3.rjk;
            }
        }
        return -1;
    }

    @Override
    public E peek() {
        if (this.Size == 0) {
            return null;
        }
        return this.getFirst();
    }

    @Override
    public E element() {
        return this.getFirst();
    }

    @Override
    public E poll() {
        if (this.Size == 0) {
            return null;
        }
        return this.removeFirst();
    }

    @Override
    public E remove() {
        return this.removeFirst();
    }

    @Override
    public boolean offer(E e2) {
        return this.add(e2);
    }

    private boolean a(b b2) {
        b b3 = this.rjg;
        while (b3 != null) {
            if (b3 == b2) {
                return true;
            }
            b3 = b3.rjl;
        }
        return false;
    }

    private boolean eqj() {
        b b2 = this.rjg;
        while (b2 != null) {
            if (b2 == this.rjg ? !$assertionsDisabled && b2.rjm != null : !$assertionsDisabled && b2.rjm.rjl != b2) {
                throw new AssertionError();
            }
            if (b2 == this.rjh ? !$assertionsDisabled && b2.rjl != null : !$assertionsDisabled && b2.rjl.rjm != b2) {
                throw new AssertionError();
            }
            b2 = b2.rjl;
        }
        return true;
    }

    private void b(b b2) {
        assert (!this.a(b2));
        b2.rjm = null;
        if (this.rjg != null) {
            this.rjg.rjm = b2;
        }
        b2.rjl = this.rjg;
        this.rjg = b2;
        if (this.rjh == null) {
            this.rjh = b2;
        }
        assert (this.eqj());
        assert (this.a(b2));
    }

    private void c(b b2) {
        assert (this.a(b2));
        if (b2.rjl == null) {
            assert (this.rjh == b2);
            this.rjh = b2.rjm;
        } else {
            assert (this.rjh != b2);
            b2.rjl.rjm = b2.rjm;
        }
        if (b2.rjm == null) {
            assert (this.rjg == b2);
            this.rjg = b2.rjl;
        } else {
            assert (this.rjg != b2);
            b2.rjm.rjl = b2.rjl;
        }
        assert (this.eqj());
        assert (!this.a(b2));
    }

    public void finalize() {
        assert (this.rjg == null);
    }

    @Override
    public ListIterator<E> listIterator(int n) {
        assert (n == 0);
        return new b(this);
    }

    private a<E> a(E e2, a<E> a2) {
        a<E> a3 = new a<E>(e2, a2, a2.rjk);
        a3.rjk.rjj = a3;
        a3.rjj.rjk = a3;
        ++this.Size;
        return a3;
    }

    private E a(a<E> a2) {
        if (a2 == this.rjf) {
            throw new NoSuchElementException();
        }
        b b2 = this.rjg;
        while (b2 != null) {
            b2.b(a2);
            b2 = b2.rjl;
        }
        b2 = a2.rji;
        a2.rjk.rjj = a2.rjj;
        a2.rjj.rjk = a2.rjk;
        a2.rjk = null;
        a2.rjj = null;
        a2.rji = null;
        --this.Size;
        return (E)b2;
    }

    public Object clone() {
        leq leq2 = null;
        try {
            leq2 = (leq)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
        leq2.rjf = new a<Object>(null, null, null);
        leq2.rjf.rjk = leq2.rjf;
        leq2.rjf.rjj = leq2.rjf.rjk;
        leq2.Size = 0;
        a a2 = this.rjf.rjj;
        while (a2 != this.rjf) {
            leq2.add(a2.rji);
            a2 = a2.rjj;
        }
        return leq2;
    }

    @Override
    public Object[] toArray() {
        Object[] objectArray = new Object[this.Size];
        int n = 0;
        a a2 = this.rjf.rjj;
        while (a2 != this.rjf) {
            objectArray[n++] = a2.rji;
            a2 = a2.rjj;
        }
        return objectArray;
    }

    @Override
    public <T> T[] toArray(T[] objectArray) {
        if (objectArray.length < this.Size) {
            objectArray = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), this.Size);
        }
        int n = 0;
        T[] TArray = objectArray;
        a a2 = this.rjf.rjj;
        while (a2 != this.rjf) {
            TArray[n++] = a2.rji;
            a2 = a2.rjj;
        }
        if (objectArray.length > this.Size) {
            objectArray[this.Size] = null;
        }
        return objectArray;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.Size);
        a a2 = this.rjf.rjj;
        while (a2 != this.rjf) {
            objectOutputStream.writeObject(a2.rji);
            a2 = a2.rjj;
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int n = objectInputStream.readInt();
        this.rjf = new a<Object>(null, null, null);
        this.rjf.rjk = this.rjf;
        this.rjf.rjj = this.rjf.rjk;
        for (int i = 0; i < n; ++i) {
            this.a(objectInputStream.readObject(), this.rjf);
        }
    }

    static /* synthetic */ int a(leq leq2) {
        return leq2.Size;
    }

    static /* synthetic */ a b(leq leq2) {
        return leq2.rjf;
    }

    static /* synthetic */ void a(leq leq2, b b2) {
        leq2.b(b2);
    }

    static /* synthetic */ void b(leq leq2, b b2) {
        leq2.c(b2);
    }
}

