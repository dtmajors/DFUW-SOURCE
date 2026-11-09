/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Iterator;

public class llq<E>
extends llr<E> {
    private final ldl kaY = new ldl();

    public llq(Collection<E> collection) {
        super(collection);
    }

    public lbl<lbn> cec() {
        return this.kaY;
    }

    @Override
    public Iterator<E> iterator() {
        return new llt(this.rEe.iterator());
    }

    @Override
    public boolean add(E e2) {
        if (!this.rEe.add(e2)) {
            return false;
        }
        this.dak();
        return true;
    }

    @Override
    public boolean remove(Object object) {
        if (!this.rEe.remove(object)) {
            return false;
        }
        this.dak();
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        if (!this.rEe.addAll(collection)) {
            return false;
        }
        this.dak();
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        if (!this.rEe.removeAll(collection)) {
            return false;
        }
        this.dak();
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return this.rEe.retainAll(collection);
    }

    @Override
    public void clear() {
        int n = this.rEe.size();
        this.rEe.clear();
        if (this.rEe.size() == n) {
            return;
        }
        this.dak();
    }

    protected void dak() {
        this.kaY.enp();
    }
}

