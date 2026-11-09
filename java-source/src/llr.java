/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Iterator;

public class llr<E>
implements Collection<E> {
    public final Collection<E> rEe;

    public llr(Collection<E> collection) {
        this.rEe = collection;
    }

    @Override
    public int size() {
        return this.rEe.size();
    }

    @Override
    public boolean isEmpty() {
        return this.rEe.isEmpty();
    }

    @Override
    public boolean contains(Object object) {
        return this.rEe.contains(object);
    }

    @Override
    public Iterator<E> iterator() {
        return this.rEe.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.rEe.toArray();
    }

    @Override
    public <T> T[] toArray(T[] TArray) {
        return this.rEe.toArray(TArray);
    }

    @Override
    public boolean add(E e2) {
        return this.rEe.add(e2);
    }

    @Override
    public boolean remove(Object object) {
        return this.rEe.remove(object);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return this.rEe.containsAll(collection);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return this.rEe.addAll(collection);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return this.rEe.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return this.rEe.retainAll(collection);
    }

    @Override
    public void clear() {
        this.rEe.clear();
    }

    @Override
    public boolean equals(Object object) {
        return ((Object)this.rEe).equals(object);
    }

    @Override
    public int hashCode() {
        return ((Object)this.rEe).hashCode();
    }
}

