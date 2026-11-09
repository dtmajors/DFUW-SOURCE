/*
 * Decompiled with CFR.
 */
public abstract class lnp
extends lmv {
    public lnp(a a2) {
        super(a2);
    }

    public final float getValue() {
        return this.evZ();
    }

    public final boolean nH(float f) {
        assert (this.evY().nK(f));
        if (!this.nJ(f)) {
            return false;
        }
        this.cdX();
        return true;
    }

    public final a evY() {
        return (a)this.evb();
    }

    public final boolean a(lnp lnp2) {
        if (!this.c(lnp2)) {
            return false;
        }
        this.cdX();
        return true;
    }

    public final boolean b(lnp lnp2) {
        assert (lnp2.h(this));
        return this.getValue() == lnp2.getValue();
    }

    @Override
    protected boolean e(lmv lmv2) {
        return this.c((lnp)lmv2);
    }

    @Override
    protected boolean f(lmv lmv2) {
        if (lmv2 instanceof lnp) {
            return this.b((lnp)lmv2);
        }
        return false;
    }

    @Override
    protected boolean d(lfu lfu2) {
        float f = lfu2.e("Value", this.getValue());
        f = this.evY().nL(f);
        return this.nJ(f);
    }

    @Override
    protected String dPh() {
        return Float.toString(this.getValue());
    }

    protected abstract float evZ();

    protected abstract void nI(float var1);

    private boolean c(lnp lnp2) {
        float f = lnp2.getValue();
        f = this.evY().nL(f);
        return this.nJ(f);
    }

    private boolean nJ(float f) {
        assert (f >= this.evY().rFJ);
        assert (f <= this.evY().rFK);
        if (ldq.ai(f, this.getValue())) {
            return false;
        }
        this.nI(f);
        return true;
    }
}

