/*
 * Decompiled with CFR.
 */
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public class lba<E>
extends AbstractCollection<E> {
    private final Collection<E> qvu;
    private final a<E> qvx;

    public lba(Collection<E> collection, a<E> a2) {
        this.qvu = collection;
        this.qvx = a2;
    }

    @Override
    public Iterator<E> iterator() {
        return new b(this);
    }

    @Override
    public int size() {
        int n = 0;
        for (E e2 : this.qvu) {
            if (!this.qvx.D(e2)) continue;
            ++n;
        }
        return n;
    }

    static /* synthetic */ Collection a(lba lba2) {
        return lba2.qvu;
    }

    static /* synthetic */ a b(lba lba2) {
        return lba2.qvx;
    }
}

