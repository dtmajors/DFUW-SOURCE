/*
 * Decompiled with CFR.
 */
public class hof
extends hoh {
    private final a kRR;
    private final hqr kRS;
    private boolean Initialized;

    public hof(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, boolean bl, boolean bl2, boolean bl3, boolean bl4, lbn lbn2, String string2) {
        super(hnc2, string, lgg2, lhf2, a2.kmY, bl, bl2, bl3, bl4, lbn2, string2);
        this.kRR = a2;
        this.kRS = new hqr(hnc2, (String)null, this.kRR.kmY.krh.kRX, this.ctX(), this.kRR.jGK);
        this.j(this.kRS);
    }

    public final void a(hog hog2) {
        assert (hog2 != null);
        assert (!this.Initialized);
        assert (this.kRS.cwt().cqd().cpH() == null);
        this.kRS.cwt().cqd().a(hog2);
    }

    public final void ctV() {
        lhf lhf2 = this.kRS.cqv();
        this.kRS.cti();
        lhf lhf3 = this.kRS.cqv();
        lhf lhf4 = this.cqv().p(lhf3).q(lhf2);
        this.d(lhf4);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        assert (this.kRS.cwt().cqd().cpH() != null);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.ccm();
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
        this.ccm();
    }

    @Override
    protected void b(ldd ldd2) {
        assert (this.Initialized);
        assert (ldd2 == ldd.rer || ldd2 == ldd.ret);
        hog hog2 = this.ctW();
        hoa hoa2 = this.ctZ();
        hoa2 = hoa2 == null ? this.ctQ() : (hog2.o(hoa2) ? (ldd2 == ldd.ret && hoa2 == hog2.cub() ? this.cua() : (ldd2 == ldd.rer && hoa2 == hog2.cua() ? this.cub() : hog2.a(hoa2, ldd2))) : (ldd2 == ldd.ret && hoa2 == this.cub() ? hog2.cua() : (ldd2 == ldd.rer && hoa2 == this.cua() ? hog2.cub() : this.a(hoa2, ldd2))));
        this.b(hoa2);
    }

    @Override
    protected hoa ctQ() {
        return this.ctW().ctQ();
    }

    @Override
    protected boolean a(hoa hoa2) {
        assert (this.o(hoa2));
        if (super.a(hoa2)) {
            return true;
        }
        return hoa2 == this.kRS;
    }

    private hog ctW() {
        return (hog)this.kRS.cwt().cqd().cpH();
    }

    private void ccm() {
        this.kRS.d(this.ctX());
    }

    private lhf ctX() {
        int n = this.getWidth() - this.kRR.kmY.krh.kRX.cf * 2;
        int n2 = this.getHeight() - this.kRR.kmY.krh.kRX.cg - this.ctP();
        return new lhf(n, n2);
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

