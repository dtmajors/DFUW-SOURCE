/*
 * Decompiled with CFR.
 */
public class hpg
extends hmt {
    private final hpe kVp;
    private final hpe kVq;
    private boolean Initialized;

    public hpg(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, String string2) {
        super(hnc2, string, lgg2, lhf2);
        this.kVq = new hpe(this.kLu, null, lgg.rlI.k(a2.kVt), lhf2, hpg.a(a2, true), string2);
        this.j(this.kVq);
        this.kVp = new hpe(this.kLu, null, lgg.rlI, lhf2, hpg.a(a2, false), string2);
        this.j(this.kVp);
    }

    public final String getText() {
        return this.kVp.getText();
    }

    public final boolean mV(String string) {
        assert (string != null);
        if (!this.kVp.mV(string)) {
            return false;
        }
        this.kVq.mV(string);
        return true;
    }

    public final hpe.c cve() {
        return this.kVp.cuW();
    }

    public final void a(lcq lcq2, lcq lcq3) {
        this.kVp.H(lcq2);
        this.kVq.H(lcq3);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        this.Initialized = false;
        super.FG();
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        lhf lhf2 = this.cqv();
        this.kVq.d(lhf2);
        this.kVp.d(lhf2);
    }

    @Override
    public String toString() {
        return null;
    }

    private static hpe.c a(a a2, boolean bl) {
        lcq lcq2 = bl ? a2.kVs : a2.kVr;
        return new hpe.d(a2.jFE, lcq2, a2.kUX, a2.kUY, a2.kUW);
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

