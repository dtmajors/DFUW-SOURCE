/*
 * Decompiled with CFR.
 */
public class lnn<E extends Enum<E>>
extends lnl<E> {
    private final lnc rFv;
    private final int adk;

    public lnn(a<E> a2, lnc lnc2, int n) {
        super(a2);
        this.rFv = lnc2;
        this.adk = n;
    }

    public lnn(lnn<E> lnn2) {
        this(lnn2.evW(), lnn2.rFv, lnn2.adk);
    }

    public a<E> evW() {
        return (a)this.evb();
    }

    @Override
    protected final E evS() {
        return (E)((Enum)this.rFv.getObject(this.adk));
    }

    @Override
    protected final void d(E e2) {
        this.rFv.setObject(this.adk, e2);
    }
}

