/*
 * Decompiled with CFR.
 */
import java.util.Iterator;

public class lls<T, F>
implements Iterator<T> {
    public final Iterator<F> rEf;

    public lls(Iterator<F> iterator) {
        this.rEf = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.rEf.hasNext();
    }

    @Override
    public T next() {
        return (T)this.rEf.next();
    }

    @Override
    public void remove() {
        this.rEf.remove();
    }
}

