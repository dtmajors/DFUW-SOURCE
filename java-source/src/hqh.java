/*
 * Decompiled with CFR.
 */
public class hqh
extends hoa {
    private final lbn kXU;
    public final ldb kYf;
    private final hmr jEN = new hmr(null);
    private final hou ktO;
    private final hpa kYD;
    private final hpa kYE;
    private final hpa kYF;
    protected final a kYG;
    private final b kYH;
    private final double kLl;
    private final double kLm;
    private final double kTy;
    private final lbn kYI = new lbn(this){
        final /* synthetic */ hqh kYO;
        {
            this.kYO = hqh2;
        }

        public final void W() {
            hqh.c(this.kYO);
        }
    };
    private final lbp kYJ = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hqh kYO;
        {
            this.kYO = hqh2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hqh.d(this.kYO)) {
                throw new AssertionError();
            }
            this.kYO.c(ldd.ret);
            return true;
        }

        static {
            $assertionsDisabled = !hqh.class.desiredAssertionStatus();
        }
    };
    private final lbp kYK = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hqh kYO;
        {
            this.kYO = hqh2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hqh.d(this.kYO)) {
                throw new AssertionError();
            }
            this.kYO.c(ldd.rer);
            return true;
        }

        static {
            $assertionsDisabled = !hqh.class.desiredAssertionStatus();
        }
    };
    private final lbp kYL = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hqh kYO;
        {
            this.kYO = hqh2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hqh.d(this.kYO)) {
                throw new AssertionError();
            }
            this.kYO.c(ldd.rer);
            return true;
        }

        static {
            $assertionsDisabled = !hqh.class.desiredAssertionStatus();
        }
    };
    private final lbp kYM = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hqh kYO;
        {
            this.kYO = hqh2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hqh.d(this.kYO)) {
                throw new AssertionError();
            }
            this.kYO.c(ldd.ret);
            return true;
        }

        static {
            $assertionsDisabled = !hqh.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private int kTt;
    private double kTu;
    private int kYN;
    private double kLr;
    private boolean kXi;

    public hqh(hnc hnc2, String string, lgg lgg2, lhf lhf2, b b2, double d2, double d3, boolean bl, double d4, double d5, lbn lbn2) {
        super(hnc2, string, lgg2, lhf2, b2.jHw);
        int n;
        int n2;
        int n3;
        lgg lgg3;
        lgg lgg4;
        lhf lhf3;
        lhf lhf4;
        lgg lgg5;
        assert (d2 <= d4);
        assert (d4 <= d3);
        this.kYH = b2;
        this.kXU = lbn2;
        this.kYf = b2.kYf;
        if (bl) {
            double d6 = d2;
            d2 = d3;
            d3 = d6;
        }
        this.kLl = d2;
        this.kLm = d3;
        this.kTy = d5;
        this.kLr = d4;
        hpx.b b3 = new hpx.b(b2.jHw, b2.jHw.kwY, lhi.rnE, lhi.rnE, lhi.rnE, lhi.rnE);
        lhv lhv2 = new lhv(this.kYH.kYT);
        lgg lgg6 = new lgg(0, 0);
        switch (this.kYH.kYf) {
            case reo: {
                lgg5 = new lgg(0, (this.getHeight() - this.kYH.kYR.kLY.H) / 2);
                lhf4 = new lhf(this.getWidth(), this.kYH.kYR.kLY.H);
                lhf3 = new lhf(3, 1);
                lgg4 = new lgg(1, 0);
                lgg3 = new lgg(2, 0);
                n3 = this.kYH.kYQ.kLY.rmN;
                n2 = this.getWidth() - (this.kYH.kYQ.kLY.rmN + this.kYH.kYS.kLY.rmN);
                n = this.kYH.kYS.kLY.rmN;
                break;
            }
            case rep: {
                lgg5 = new lgg((this.getWidth() - this.kYH.kYR.kLY.rmN) / 2, 0);
                lhf4 = new lhf(this.kYH.kYR.kLY.rmN, this.getHeight());
                lhf3 = new lhf(1, 3);
                lgg4 = new lgg(0, 1);
                lgg3 = new lgg(0, 2);
                n3 = this.kYH.kYQ.kLY.H;
                n2 = this.getHeight() - (this.kYH.kYQ.kLY.H + this.kYH.kYS.kLY.H);
                n = this.kYH.kYS.kLY.H;
                break;
            }
            default: {
                assert (false);
                lgg5 = lgg.rlI;
                lhf4 = lhf.rnv;
                lhf3 = lhf.rnv;
                lgg4 = lgg.rlI;
                lgg3 = lgg.rlI;
                n3 = 0;
                n2 = 0;
                n = 0;
            }
        }
        this.ktO = new hou(hnc2, null, lgg5, lhf4, lhf3, lgg4);
        this.ktO.a(this.kYH.kYf, 0, n3);
        this.ktO.a(this.kYH.kYf, 1, n2);
        this.ktO.a(this.kYH.kYf, 2, n);
        this.ktO.a(this.kYH.kYf.eni(), 0, this.e(this.kYH.kYf.eni()));
        this.j(this.ktO);
        this.kYD = new hpa(hnc2, (String)null, lgg.rlI, lhf.rnv, this.kYH.kYQ);
        this.kYD.H(this.kYH.kfb);
        this.ktO.d(lgg6.cg, lgg6.cf, this.kYD);
        this.kYE = new hpa(hnc2, (String)null, lgg.rlI, lhf.rnv, this.kYH.kYR);
        this.kYE.H(this.kYH.kfb);
        this.ktO.d(lgg4.cg, lgg4.cf, this.kYE);
        this.kYF = new hpa(hnc2, (String)null, lgg.rlI, lhf.rnv, this.kYH.kYS);
        this.kYF.H(this.kYH.kfb);
        this.ktO.d(lgg3.cg, lgg3.cf, this.kYF);
        this.kYG = new a(hnc2, (String)null, lgg.rlI, b3, lhv2, this);
        this.j(this.kYG);
    }

    public final double cqa() {
        return this.kLl;
    }

    public final double cqb() {
        return this.kLm;
    }

    public final double cum() {
        return this.kLr;
    }

    public final boolean cR(double d2) {
        if (ldf.r(d2 = hqh.c(this.kLl, d2, this.kLm), this.kLr)) {
            return false;
        }
        this.kLr = d2;
        if (this.Initialized) {
            this.ciT();
        }
        return true;
    }

    public final boolean c(ldd ldd2) {
        assert (ldd2 == ldd.ret || ldd2 == ldd.rer);
        double d2 = this.kLr + this.kTy * (double)ldd2.reu;
        return this.cR(d2);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
        this.cwl();
        this.cwk();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cbM() {
        assert (this.Initialized);
        super.cbM();
        if (!this.kYG.cqQ()) {
            int n = this.cwo();
            this.NT(n);
        }
    }

    @Override
    protected void ctB() {
        assert (this.Initialized);
        super.ctB();
        this.kYG.og(this.cty());
    }

    @Override
    protected void ctF() {
        super.ctF();
        this.cwi();
        this.cwj();
    }

    @Override
    protected void ctD() {
        super.ctD();
        this.cwi();
    }

    @Override
    protected void ctG() {
        this.kLu.a(this.kYH.jHw.kRp);
    }

    protected void cvG() {
    }

    protected void cuq() {
        this.cwn();
    }

    protected void ciT() {
        this.cwn();
        if (this.kXU != null) {
            this.kXU.W();
        }
    }

    protected void cur() {
        this.cwm();
        this.ciT();
    }

    protected void cwh() {
        this.cwk();
    }

    private void cwi() {
        boolean bl;
        assert (this.Initialized);
        boolean bl2 = bl = this.ctA() && this.ctz() || this.kLu.crV() == this.kYG;
        if (bl == this.kXi) {
            return;
        }
        this.kXi = bl;
        this.cvG();
    }

    private void cwj() {
        lcq lcq2 = this.cty() ? this.kYH.jHw.kxa : (this.ctz() || this.kXi ? this.kYH.jHw.kwY : lcq.COLORSHIFT_NEUTRAL);
        this.jEN.J(lcq2);
    }

    private void cwk() {
        int n;
        int n2;
        int n3 = this.kYN;
        switch (this.kYH.kYf) {
            case reo: {
                n2 = this.kYD.getWidth() + n3 - this.kYG.getWidth() / 2;
                n = (this.getHeight() - this.kYG.getHeight()) / 2;
                break;
            }
            case rep: {
                n2 = (this.getWidth() - this.kYG.getWidth()) / 2;
                n = this.kYD.getHeight() + n3 - this.kYG.getHeight() / 2;
                break;
            }
            default: {
                assert (false);
                return;
            }
        }
        this.kYG.cB(n2, n);
    }

    private void cwl() {
        int n = this.kYE.e(this.kYH.kYf);
        this.NG(n);
    }

    private void NT(int n) {
        n = Math.max(n, 0);
        n = Math.min(n, this.kYE.e(this.kYf) - 1);
        double d2 = this.NU(n);
        this.cR(d2);
    }

    protected final boolean NG(int n) {
        assert (n >= 0);
        if (n == 0) {
            n = 1;
        }
        if (n == this.kTt) {
            return false;
        }
        this.kTt = n;
        this.cwm();
        return true;
    }

    private void cwm() {
        double d2 = this.kLm - this.kLl;
        double d3 = (double)(this.kTt - 1) / d2;
        if (Double.isNaN(d3) || Double.isInfinite(d3)) {
            d3 = 0.0;
        }
        if (ldf.r(d3, this.kTu)) {
            return;
        }
        this.kTu = d3;
        this.cuq();
    }

    protected final double NU(int n) {
        assert (n >= 0);
        assert (n < this.kTt);
        double d2 = this.kLl + (double)n / this.kTu;
        d2 = hqh.c(this.kLl, d2, this.kLm);
        return d2;
    }

    protected final int cX(double d2) {
        assert (hqh.b(this.kLl, d2, this.kLm));
        int n = (int)((d2 - this.kLl) * this.kTu);
        assert (n >= 0);
        assert (n < this.kTt);
        return n;
    }

    private void cwn() {
        double d2 = this.cum();
        int n = this.cX(d2);
        this.NV(n);
    }

    protected int cwo() {
        int n = this.cqu().r(this.kYf);
        return n -= this.kYD.e(this.kYf) - 1;
    }

    private void NV(int n) {
        if (n == this.kYN) {
            return;
        }
        this.kYN = n;
        this.cwh();
    }

    private static boolean b(double d2, double d3, double d4) {
        if (d2 > d4) {
            double d5 = d2;
            d2 = d4;
            d4 = d5;
        }
        return d2 <= d3 && d3 <= d4;
    }

    private static double c(double d2, double d3, double d4) {
        if (d2 > d4) {
            double d5 = d2;
            d2 = d4;
            d4 = d5;
        }
        if (d3 < d2) {
            d3 = d2;
        }
        if (d3 > d4) {
            d3 = d4;
        }
        return d3;
    }

    private void mU(boolean bl) {
        this.jEN.a(bl, this.kYD);
        this.jEN.a(bl, this.kYE);
        this.jEN.a(bl, this.kYF);
        this.kYE.cqn().a(bl, this.kYI);
        switch (this.kYf) {
            case reo: {
                this.a(bl, this.kYL, 37, jpn.nLm);
                this.a(bl, this.kYM, 39, jpn.nLm);
                break;
            }
            case rep: {
                this.a(bl, this.kYJ, 38, jpn.nLm);
                this.a(bl, this.kYK, 40, jpn.nLm);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    static /* synthetic */ void a(hqh hqh2, int n) {
        hqh2.NT(n);
    }

    static /* synthetic */ b b(hqh hqh2) {
        return hqh2.kYH;
    }

    static /* synthetic */ void c(hqh hqh2) {
        hqh2.cwl();
    }

    static /* synthetic */ boolean d(hqh hqh2) {
        return hqh2.Initialized;
    }
}

