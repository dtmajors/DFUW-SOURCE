/*
 * Decompiled with CFR.
 */
public abstract class lnh
extends lmv {
    public lnh(a a2) {
        super(a2);
    }

    public final double getValue() {
        return this.evL();
    }

    public final boolean es(double d2) {
        assert (this.evK().ev(d2));
        if (!this.eu(d2)) {
            return false;
        }
        this.cdX();
        return true;
    }

    public final a evK() {
        return (a)this.evb();
    }

    public final boolean a(lnh lnh2) {
        if (lnh2.h(this)) {
            return ldf.r(this.getValue(), lnh2.getValue());
        }
        return false;
    }

    @Override
    protected boolean e(lmv lmv2) {
        return this.b((lnh)lmv2);
    }

    @Override
    protected boolean f(lmv lmv2) {
        if (lmv2 instanceof lnh) {
            return this.a((lnh)lmv2);
        }
        return false;
    }

    @Override
    protected boolean d(lfu lfu2) {
        double d2 = lfu2.c("Value", this.evL());
        d2 = this.evK().ew(d2);
        return this.eu(d2);
    }

    @Override
    protected String dPh() {
        return Double.toString(this.getValue());
    }

    protected abstract double evL();

    protected abstract void et(double var1);

    private boolean b(lnh lnh2) {
        double d2 = lnh2.getValue();
        d2 = this.evK().ew(d2);
        return this.eu(d2);
    }

    private boolean eu(double d2) {
        assert (d2 >= this.evK().kLl);
        assert (d2 <= this.evK().kLm);
        if (ldf.r(d2, this.evL())) {
            return false;
        }
        this.et(d2);
        return true;
    }
}

