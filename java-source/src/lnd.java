/*
 * Decompiled with CFR.
 */
public abstract class lnd
extends lmv {
    public lnd(a a2) {
        super(a2);
    }

    public final boolean getValue() {
        return this.evF();
    }

    public final boolean yP(boolean bl) {
        if (!this.yR(bl)) {
            return false;
        }
        this.cdX();
        return true;
    }

    public final void evE() {
        this.yP(!this.getValue());
    }

    public final boolean a(lnd lnd2) {
        return this.getValue() == lnd2.getValue();
    }

    @Override
    protected boolean e(lmv lmv2) {
        return this.b((lnd)lmv2);
    }

    @Override
    protected boolean f(lmv lmv2) {
        if (lmv2 instanceof lnd) {
            return this.a((lnd)lmv2);
        }
        return false;
    }

    @Override
    protected boolean d(lfu lfu2) {
        return this.yR(lfu2.V("Value", this.getValue()));
    }

    @Override
    protected String dPh() {
        return Boolean.toString(this.getValue());
    }

    protected abstract boolean evF();

    protected abstract void yQ(boolean var1);

    protected boolean b(lnd lnd2) {
        return this.yR(lnd2.getValue());
    }

    protected boolean yR(boolean bl) {
        if (bl == this.getValue()) {
            return false;
        }
        this.yQ(bl);
        return true;
    }
}

