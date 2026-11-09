/*
 * Decompiled with CFR.
 */
public class hqz
extends hpx {
    private final hpa kgb;
    private boolean Initialized;
    private lhv kpT;

    public hqz(hnc hnc2, String string, lgg lgg2, lhf lhf2, hpx.a a2, hpx.b b2, lhv lhv2) {
        super(hnc2, string, lgg2, lhf2 != null ? lhf2 : lhv2.kLY, a2, b2);
        this.kpT = lhv2;
        this.kgb = new hpa(this.kLu, (String)null, lgg.rlI, this.cqv(), this.kpT.acS(0));
        this.j(this.kgb);
    }

    public final lhv cwA() {
        return this.kpT;
    }

    public final void a(lhv lhv2) {
        this.kpT = lhv2;
        this.ctH();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
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
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        this.kgb.cC(this.getWidth(), this.getHeight());
    }

    @Override
    protected void ctH() {
        super.ctH();
        int n = this.cvH() ? 1 : 0;
        lhu lhu2 = this.kpT.acS(n);
        this.kgb.a(lhu2);
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

