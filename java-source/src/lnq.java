/*
 * Decompiled with CFR.
 */
public class lnq
extends lnp {
    private float Pz;

    public lnq() {
        this(a.rFL, 0.0f);
    }

    public lnq(float f) {
        this(a.rFL, f);
    }

    public lnq(a a2) {
        this(a2, a2.nL(0.0f));
    }

    public lnq(a a2, float f) {
        super(a2);
        assert (f >= a2.rFJ);
        assert (f <= a2.rFK);
        this.Pz = f;
    }

    public lnq(lnq lnq2) {
        super(lnq2.ewc());
    }

    public final a ewc() {
        return (a)this.evb();
    }

    @Override
    protected final float evZ() {
        return this.Pz;
    }

    @Override
    protected final void nI(float f) {
        this.Pz = f;
    }
}

