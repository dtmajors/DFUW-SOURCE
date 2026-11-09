/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class llx<E>
extends llr<E>
implements List<E> {
    public final List<E> rEg;

    public llx(List<E> list) {
        super(list);
        this.rEg = list;
    }

    @Override
    public E get(int n) {
        return this.rEg.get(n);
    }

    @Override
    public E set(int n, E e2) {
        return this.rEg.set(n, e2);
    }

    @Override
    public void add(int n, E e2) {
        this.rEg.add(n, e2);
    }

    @Override
    public boolean addAll(int n, Collection<? extends E> collection) {
        return this.rEg.addAll(n, collection);
    }

    @Override
    public E remove(int n) {
        return this.rEg.remove(n);
    }

    @Override
    public int indexOf(Object object) {
        return this.rEg.indexOf(object);
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.rEg.lastIndexOf(object);
    }

    @Override
    public ListIterator<E> listIterator() {
        return this.rEg.listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int n) {
        return this.rEg.listIterator(n);
    }

    @Override
    public List<E> subList(int n, int n2) {
        return this.rEg.subList(n, n2);
    }
}

