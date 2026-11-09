/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class lcl<E>
implements Set<E> {
    private final lck<E, E> qwe;

    public lcl(int n) {
        this.qwe = new lck(n);
    }

    @Override
    public int size() {
        return this.qwe.size();
    }

    @Override
    public boolean isEmpty() {
        return this.qwe.isEmpty();
    }

    @Override
    public boolean contains(Object object) {
        return this.qwe.containsKey(object);
    }

    @Override
    public Iterator<E> iterator() {
        return this.qwe.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        assert (false);
        return null;
    }

    @Override
    public <T> T[] toArray(T[] TArray) {
        return this.qwe.keySet().toArray(TArray);
    }

    @Override
    public boolean add(E e2) {
        return this.qwe.put(e2, e2) == null;
    }

    @Override
    public boolean remove(Object object) {
        return this.qwe.remove(object) != null;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return this.qwe.keySet().containsAll(collection);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        boolean bl = false;
        for (E e2 : collection) {
            bl |= this.add(e2);
        }
        return bl;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        assert (false);
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        assert (false);
        return false;
    }

    @Override
    public void clear() {
        this.qwe.clear();
    }

    public final boolean a(lcl<E> lcl2) {
        return this.qwe.equals(lcl2.qwe);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof lcl) {
            return this.a((lcl)object);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.qwe.hashCode();
    }
}

