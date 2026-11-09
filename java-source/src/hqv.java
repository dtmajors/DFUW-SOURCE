/*
 * Decompiled with CFR.
 */
public class hqv
extends hqw {
    private final hpa kZA;
    private final a kZB;
    private boolean Initialized;

    public hqv(hnc hnc2, String string, lgg lgg2, lhf lhf2, hpx.a a2, a a3, lhu lhu2) {
        super(hnc2, string, lgg2, lhf2, a2, a3.kZC);
        assert (lhu2 != null);
        this.kZB = a3;
        this.kZA = new hpa(hnc2, (String)null, lgg.rlI, lhf2, lhu2);
        this.j(this.kZA);
    }

    public void e(lhu lhu2) {
        assert (this.Initialized);
        this.kZA.a(lhu2);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
        this.ctH();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cvG() {
        assert (this.Initialized);
        super.cvG();
        lgg lgg2 = lgg.rlI;
        if (this.cvF()) {
            lgg2 = lgg2.i(this.kZB.kZD);
        }
        this.kZA.z(lgg2);
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        this.kZA.cC(this.getWidth(), this.getHeight());
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

