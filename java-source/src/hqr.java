/*
 * Decompiled with CFR.
 */
public class hqr
extends hqs {
    private final hpt kZs;
    private final a kZt;
    private boolean Initialized;

    public hqr(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2) {
        this(hnc2, string, lgg2, lhf2, a2, hmk.a.kKZ, hmk.a.kKZ);
    }

    public hqr(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, hmk.a a3, hmk.a a4) {
        super(hnc2, string, lgg2, lhf2, a2.kJY);
        this.kZt = a2;
        this.kZs = new hpt(hnc2, null, lgg.rlI, lhf2, this.kZt.kZu, a3, a4);
        this.w(this.kZs);
    }

    public final hmk cwt() {
        return this.kZs;
    }

    public final void cti() {
        this.kZs.cti();
        lhf lhf2 = this.kZs.cqv();
        lhf2 = lhf2.p(this.kZt.kJY.kPT.ctr());
        this.d(lhf2);
    }

    @Override
    protected boolean cqP() {
        return false;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.nb(true);
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.nb(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ctB() {
        super.ctB();
    }

    private void nb(boolean bl) {
        assert (lda.yk(bl));
    }
}

