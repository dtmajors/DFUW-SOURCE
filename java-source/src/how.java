/*
 * Decompiled with CFR.
 */
public class how
extends hpw {
    private boolean Initialized;
    private lgg kTo;
    private int kTp;
    private int kTq;
    private boolean kTr;

    public how(hnc hnc2, String string, lgg lgg2, lhf lhf2, hpw.a a2) {
        super(hnc2, string, lgg2, lhf2, a2);
    }

    public final lgg cul() {
        return this.kTo;
    }

    public final void G(lgg lgg2) {
        this.kTo = lgg2;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.kTp = this.getWidth();
        this.kTq = this.getHeight();
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        if (this.kTo != null) {
            assert (!this.kTr);
            this.kTr = true;
            this.layout();
            this.kTr = false;
        }
    }

    private void layout() {
        hms hms2;
        int n;
        assert (this.Initialized);
        super.cce();
        int n2 = this.getWidth();
        int n3 = this.getHeight();
        int n4 = n2 - this.kTp;
        int n5 = n3 - this.kTq;
        int n6 = this.crn().size();
        lgs[] lgsArray = new lgs[n6];
        for (n = 0; n < n6; ++n) {
            hms2 = this.crn().get(n);
            if (hms2 == this.cvw()) continue;
            lgs lgs2 = hms2.cqD();
            if (this.kTo.cg != -1 && lgs2.cg + lgs2.H > this.kTo.cg) {
                if (lgs2.cg > this.kTo.cg) {
                    lgs2.cg += n5;
                } else {
                    lgs2.H += n5;
                }
            }
            if (this.kTo.cf != -1 && lgs2.cf + lgs2.rmN > this.kTo.cf) {
                if (lgs2.cf > this.kTo.cf) {
                    lgs2.cf += n4;
                } else {
                    lgs2.rmN += n4;
                }
            }
            if (lgs2.rmN < 0 || lgs2.H < 0) {
                return;
            }
            lgsArray[n] = lgs2;
        }
        for (n = 0; n < n6; ++n) {
            hms2 = this.crn().get(n);
            if (hms2 == this.cvw()) continue;
            hms2.j(lgsArray[n]);
        }
        this.kTp = n2;
        this.kTq = n3;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

