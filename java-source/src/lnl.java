/*
 * Decompiled with CFR.
 */
public abstract class lnl<E extends Enum<E>>
extends lmv {
    public lnl(a<E> a2) {
        super(a2);
    }

    public final E evQ() {
        return this.evS();
    }

    public final boolean c(E e2) {
        boolean bl = this.e(e2);
        if (bl) {
            this.cdX();
        }
        return bl;
    }

    public final a<E> evR() {
        return (a)this.evb();
    }

    public final boolean a(lnl<E> lnl2) {
        if (!this.c(lnl2)) {
            return false;
        }
        this.cdX();
        return true;
    }

    public final boolean b(lnl<E> lnl2) {
        if (lnl2.h(this)) {
            return this.evQ() == lnl2.evQ();
        }
        return false;
    }

    @Override
    protected boolean e(lmv lmv2) {
        return this.c((lnl)lmv2);
    }

    @Override
    protected boolean f(lmv lmv2) {
        if (lmv2 instanceof lnl) {
            return this.b((lnl)lmv2);
        }
        return false;
    }

    @Override
    protected boolean d(lfu lfu2) {
        E e2 = lfu2.b("Value", this.evQ());
        return this.e(e2);
    }

    @Override
    protected String dPh() {
        E e2 = this.evQ();
        if (e2 == null) {
            return "null";
        }
        return ((Enum)e2).toString();
    }

    protected abstract E evS();

    protected abstract void d(E var1);

    private boolean c(lnl<E> lnl2) {
        assert (this.evb().b(lnl2.evb()));
        return this.e(lnl2.evQ());
    }

    protected final boolean e(E e2) {
        assert (this.evR().rFD.isInstance(e2));
        if (e2 == this.evQ()) {
            return false;
        }
        this.d(e2);
        return true;
    }
}

