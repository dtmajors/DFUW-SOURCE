/*
 * Decompiled with CFR.
 */
import java.util.ListIterator;

public class llw<T, F>
implements ListIterator<T> {
    public final ListIterator<F> rEh;

    public llw(ListIterator<F> listIterator) {
        this.rEh = listIterator;
    }

    @Override
    public boolean hasNext() {
        return this.rEh.hasNext();
    }

    @Override
    public T next() {
        return (T)this.rEh.next();
    }

    @Override
    public void remove() {
        this.rEh.remove();
    }

    @Override
    public boolean hasPrevious() {
        return this.rEh.hasPrevious();
    }

    @Override
    public T previous() {
        return (T)this.rEh.previous();
    }

    @Override
    public int nextIndex() {
        return this.rEh.nextIndex();
    }

    @Override
    public int previousIndex() {
        return this.rEh.previousIndex();
    }

    @Override
    public void set(T t) {
        this.rEh.set(t);
    }

    @Override
    public void add(T t) {
        this.rEh.add(t);
    }
}

