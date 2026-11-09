/*
 * Decompiled with CFR.
 */
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public class laz<B, E extends B>
extends AbstractCollection<E> {
    private final Collection<B> qvu;

    public laz(Collection<B> collection) {
        this.qvu = collection;
    }

    @Override
    public Iterator<E> iterator() {
        return new a(this);
    }

    @Override
    public int size() {
        return this.qvu.size();
    }

    static /* synthetic */ Collection a(laz laz2) {
        return laz2.qvu;
    }
}

