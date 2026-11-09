/*
 * Decompiled with CFR.
 */
public class hqd
extends hpz {
    private final b kXT;
    private final lbn kXU;
    private final hpx jCx;
    private final double kLl;
    private final double kLm;
    private final boolean kXV;
    private final double kTy;
    private final lbn kXW = new lbn(this){
        final /* synthetic */ hqd kXY;
        {
            this.kXY = hqd2;
        }

        public final void W() {
            this.kXY.cW(hqd.a(this.kXY).cum());
        }
    };
    private boolean Initialized;
    private a kXX;
    private double kLr;
    private double kLn;

    public hqd(hnc hnc2, String string, lgg lgg2, lhf lhf2, b b2, lhv lhv2, double d2, double d3, boolean bl, double d4, double d5, lbn lbn2) {
        super(hnc2, string, lgg2, lhf2 != null ? lhf2 : lhv2.kLY, b2.kJH.jHw);
        assert (d2 <= d4);
        assert (d4 <= d3);
        this.kXT = b2;
        this.kLl = d2;
        this.kLm = d3;
        this.kXV = bl;
        this.kTy = d5;
        this.kXU = lbn2;
        this.kLr = d4;
        this.jCx = new hqz(hnc2, null, lgg.rlI, lhf2, hpx.a.kXo, b2.kJH, lhv2);
        this.j(this.jCx);
    }

    public final double cum() {
        return this.kLr;
    }

    public final void cW(double d2) {
        if (this.kLr == d2) {
            return;
        }
        this.kLr = d2;
        if (this.Initialized) {
            this.cwc();
        }
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

    protected void cwc() {
        this.kXU.W();
    }

    @Override
    protected void cvQ() {
        this.cW(this.kXX.cum());
    }

    @Override
    protected void cvR() {
        this.cW(this.kLn);
    }

    @Override
    protected hms cvS() {
        lhf lhf2 = new lhf(16, 64);
        lgg lgg2 = new lgg((this.getWidth() - lhf2.rmN) / 2, this.getHeight());
        lgg2 = this.kLu.kND.a((hms)this, lgg2);
        this.kXX = new a(this.kLu, null, lgg2, lhf2, this.kXT.kKx, this.kLl, this.kLm, this.kXV, this.kLr, this.kTy, this.kXW);
        return this.kXX;
    }

    @Override
    protected void op(boolean bl) {
        if (bl) {
            this.kLn = this.kLr;
        }
        this.jCx.on(bl);
        super.op(bl);
    }

    private void nb(boolean bl) {
        assert (lda.yk(bl));
    }

    static /* synthetic */ a a(hqd hqd2) {
        return hqd2.kXX;
    }
}

