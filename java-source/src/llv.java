/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class llv<T, F>
implements List<T> {
    public final List<F> rEg;

    public static <T, F> List<T> cc(List<F> list) {
        return new llv<T, F>(list);
    }

    public llv(List<F> list) {
        this.rEg = list;
    }

    @Override
    public int size() {
        return this.rEg.size();
    }

    @Override
    public boolean isEmpty() {
        return this.rEg.isEmpty();
    }

    @Override
    public boolean contains(Object object) {
        return this.rEg.contains(object);
    }

    @Override
    public Iterator<T> iterator() {
        return new lls(this.rEg.iterator());
    }

    @Override
    public Object[] toArray() {
        return this.rEg.toArray();
    }

    @Override
    public <X> X[] toArray(X[] XArray) {
        return this.rEg.toArray(XArray);
    }

    @Override
    public boolean add(T t) {
        return this.rEg.add(t);
    }

    @Override
    public boolean remove(Object object) {
        return this.rEg.remove(object);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return this.rEg.containsAll(collection);
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        boolean bl = false;
        for (T t : collection) {
            bl |= this.rEg.add(t);
        }
        return bl;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return this.rEg.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return this.rEg.retainAll(collection);
    }

    @Override
    public void clear() {
        this.rEg.clear();
    }

    @Override
    public boolean equals(Object object) {
        return ((Object)this.rEg).equals(object);
    }

    @Override
    public int hashCode() {
        return ((Object)this.rEg).hashCode();
    }

    @Override
    public T get(int n) {
        return (T)this.rEg.get(n);
    }

    @Override
    public T set(int n, T t) {
        return (T)this.rEg.set(n, t);
    }

    @Override
    public void add(int n, T t) {
        this.rEg.add(n, t);
    }

    @Override
    public boolean addAll(int n, Collection<? extends T> collection) {
        for (T t : collection) {
            this.rEg.add(n++, t);
        }
        return collection.size() != 0;
    }

    @Override
    public T remove(int n) {
        return (T)this.rEg.remove(n);
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
    public ListIterator<T> listIterator() {
        return new llw(this.rEg.listIterator());
    }

    @Override
    public ListIterator<T> listIterator(int n) {
        return new llw(this.rEg.listIterator(n));
    }

    @Override
    public List<T> subList(int n, int n2) {
        return new llv<T, F>(this.rEg.subList(n, n2));
    }
}

