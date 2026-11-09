/*
 * Decompiled with CFR.
 */
public abstract class lnx
extends lmv {
    public lnx(a a2) {
        super(a2);
    }

    public final long getValue() {
        return this.ewq();
    }

    public final boolean ax(long l) {
        assert (this.ewp().aB(l));
        if (!this.az(l)) {
            return false;
        }
        this.cdX();
        return true;
    }

    public final a ewp() {
        return (a)this.evb();
    }

    public final boolean a(lnx lnx2) {
        if (!this.c(lnx2)) {
            return false;
        }
        this.cdX();
        return true;
    }

    public final boolean b(lnx lnx2) {
        assert (lnx2.h(this));
        return this.getValue() == lnx2.getValue();
    }

    @Override
    protected boolean e(lmv lmv2) {
        return this.c((lnx)lmv2);
    }

    @Override
    protected boolean f(lmv lmv2) {
        if (lmv2 instanceof lnx) {
            return this.b((lnx)lmv2);
        }
        return false;
    }

    @Override
    protected boolean d(lfu lfu2) {
        long l = lfu2.b("Value", this.getValue());
        l = this.ewp().aA(l);
        return this.az(l);
    }

    @Override
    protected String dPh() {
        return Long.toString(this.getValue());
    }

    protected abstract long ewq();

    protected abstract void ay(long var1);

    private boolean c(lnx lnx2) {
        long l = lnx2.getValue();
        l = this.ewp().aA(l);
        return this.az(l);
    }

    private boolean az(long l) {
        assert (l >= this.ewp().rFV);
        assert (l <= this.ewp().rFW);
        if (l == this.getValue()) {
            return false;
        }
        this.ay(l);
        return true;
    }
}

