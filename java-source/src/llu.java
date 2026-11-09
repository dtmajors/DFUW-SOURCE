/*
 * Decompiled with CFR.
 */
import java.util.Iterator;

public class llu<E>
implements Iterator<E> {
    public final Iterator<E> rEf;

    public llu(Iterator<E> iterator) {
        this.rEf = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.rEf.hasNext();
    }

    @Override
    public E next() {
        return this.rEf.next();
    }

    @Override
    public void remove() {
        this.rEf.remove();
    }
}

