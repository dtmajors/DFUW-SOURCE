/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Collections;
import java.util.List;

public abstract class kfc<E>
extends kfa {
    protected final List<E> fu = lcw.qHe ? Collections.synchronizedList(lcn.emA()) : lcn.emA();

    @Override
    public int dVG() {
        return 16;
    }

    public final void p(E e) {
        if (!this.bdP) {
            this.fu.add(e);
        }
    }

    public final E getObject() {
        if (this.fu.isEmpty()) {
            return null;
        }
        return this.fu.remove(0);
    }

    @Override
    public final boolean isEmpty() {
        return this.fu.isEmpty();
    }
}

