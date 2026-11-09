/*
 * Decompiled with CFR.
 */
public class lnm<E extends Enum<E>>
extends lnl<E> {
    private E rFE;

    public lnm(a<E> a2) {
        this(a2, ((Enum[])a2.rFD.getEnumConstants())[0]);
    }

    public lnm(a<E> a2, E e2) {
        super(a2);
        this.rFE = e2;
    }

    public lnm(lnm<E> lnm2) {
        this(lnm2.evU(), lnm2.rFE);
    }

    public final a<E> evU() {
        return (a)this.evb();
    }

    @Override
    protected final E evS() {
        return this.rFE;
    }

    @Override
    protected final void d(E e2) {
        this.rFE = e2;
    }
}

