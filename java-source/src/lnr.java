/*
 * Decompiled with CFR.
 */
public class lnr
extends lnp {
    private final lnc rFv;
    private final int adk;

    public lnr(a a2, lnc lnc2, int n) {
        super(a2);
        this.rFv = lnc2;
        this.adk = n;
    }

    public lnr(lnr lnr2) {
        this(lnr2.ewd(), lnr2.rFv, lnr2.adk);
    }

    public a ewd() {
        return (a)this.evb();
    }

    @Override
    protected final float evZ() {
        return this.rFv.getFloat(this.adk);
    }

    @Override
    protected final void nI(float f) {
        this.rFv.setFloat(this.adk, f);
    }
}

