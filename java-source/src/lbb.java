/*
 * Decompiled with CFR.
 */
public class lbb<E>
implements lba.a<E> {
    public final Class<? extends E> qvA;
    public final boolean qvB;

    public lbb(Class<? extends E> clazz) {
        this(clazz, false);
    }

    public lbb(Class<? extends E> clazz, boolean bl) {
        this.qvA = clazz;
        this.qvB = bl;
    }

    @Override
    public boolean D(E e2) {
        return this.qvA.isInstance(e2) ^ this.qvB;
    }
}

