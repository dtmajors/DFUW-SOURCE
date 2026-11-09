/*
 * Decompiled with CFR.
 */
public class hoe
extends hog {
    private final a jHN;
    public final lbn kBN;
    public final String kRt;
    private final hqy kRu;
    private final hqy kRv;
    private final hqy kRw;
    private final hqy kkz;
    private final int kRx;
    private boolean Initialized;
    private hnu kRy;
    private hoz.a kRz;
    private hoz.a kRA;
    private final lbn kRB = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hoe kRF;
        {
            this.kRF = hoe2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hoe.a(this.kRF)) {
                throw new AssertionError();
            }
            if (this.kRF.kRt != null) {
                hoe.a(this.kRF, new hoz.a(hoe.b((hoe)this.kRF).kRP));
                hoe.b(this.kRF, new hoz.a(hoe.b((hoe)this.kRF).kRQ));
                hoe.a(this.kRF, this.kRF.kLu.a(this.kRF.kRt, null, new hoz.a[]{hoe.c(this.kRF), hoe.d(this.kRF)}, null, hoe.c(this.kRF), hoe.d(this.kRF), hoe.e(this.kRF)));
            } else {
                this.kRF.ctS();
            }
        }

        static {
            $assertionsDisabled = !hoe.class.desiredAssertionStatus();
        }
    };
    private final lbn kRC = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hoe kRF;
        {
            this.kRF = hoe2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hoe.a(this.kRF)) {
                throw new AssertionError();
            }
            this.kRF.ccx();
            hoe.f(this.kRF);
        }

        static {
            $assertionsDisabled = !hoe.class.desiredAssertionStatus();
        }
    };
    private final lbn kRD = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hoe kRF;
        {
            this.kRF = hoe2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hoe.a(this.kRF)) {
                throw new AssertionError();
            }
            this.kRF.ccx();
        }

        static {
            $assertionsDisabled = !hoe.class.desiredAssertionStatus();
        }
    };
    private final lbn kkJ = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hoe kRF;
        {
            this.kRF = hoe2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hoe.a(this.kRF)) {
                throw new AssertionError();
            }
            if (!this.kRF.ccA() || !this.kRF.ccz()) {
                this.kRF.ccy();
            }
            hoe.f(this.kRF);
        }

        static {
            $assertionsDisabled = !hoe.class.desiredAssertionStatus();
        }
    };
    private final lbp kPy = new lbp(this){
        final /* synthetic */ hoe kRF;
        {
            this.kRF = hoe2;
        }

        public final boolean caU() {
            if (this.kRF.ccA()) {
                this.kRF.ccx();
                hoe.f(this.kRF);
            } else {
                this.kRF.kLu.a(this.kRF.kLu.crS());
            }
            return true;
        }
    };
    private final lbp khJ = new lbp(this){
        final /* synthetic */ hoe kRF;
        {
            this.kRF = hoe2;
        }

        public final boolean caU() {
            this.kRF.ccy();
            hoe.f(this.kRF);
            return true;
        }
    };
    private final lbn kRE = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hoe kRF;
        {
            this.kRF = hoe2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hoe.a(this.kRF)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && hoe.g(this.kRF) == null) {
                throw new AssertionError();
            }
            hoz hoz2 = (hoz)hoe.g(this.kRF).csT();
            hoz.a a2 = hoz2.coZ();
            if (a2 == hoe.c(this.kRF)) {
                this.kRF.ctS();
            }
            hoe.a(this.kRF, null);
        }

        static {
            $assertionsDisabled = !hoe.class.desiredAssertionStatus();
        }
    };

    public hoe(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, boolean bl, boolean bl2, boolean bl3, boolean bl4, lbn lbn2, String string2) {
        super(hnc2, string, lgg2, lhf2, a2.krh);
        this.jHN = a2;
        this.kBN = lbn2;
        this.kRt = string2;
        if (!bl4) {
            this.kRu = null;
        } else {
            this.kRu = new hqy(this.kLu, null, lgg.rlI, this.jHN.kRN, hpx.a.kXm, this.jHN.jHz, this.jHN.kRM.esy());
            this.kRu.cvC().a(true, this.kRB);
            this.j(this.kRu);
        }
        if (!bl) {
            this.kRw = null;
        } else {
            this.kRw = new hqy(this.kLu, null, lgg.rlI, this.jHN.kRH, hpx.a.kXm, this.jHN.jHz, this.jHN.kRG.esy());
            this.kRw.cvC().a(true, this.kRC);
            this.j(this.kRw);
        }
        if (!bl2) {
            this.kkz = null;
        } else {
            this.kkz = new hqy(this.kLu, null, lgg.rlI, this.jHN.kRJ, hpx.a.kXm, this.jHN.jHz, this.jHN.kRI.esy());
            this.kkz.cvC().a(true, this.kkJ);
            this.j(this.kkz);
        }
        if (!bl3) {
            this.kRv = null;
        } else {
            this.kRv = new hqy(this.kLu, null, lgg.rlI, this.jHN.kRL, hpx.a.kXm, this.jHN.jHz, this.jHN.kRK.esy());
            this.kRv.cvC().a(true, this.kRD);
            this.j(this.kRv);
        }
        this.kRx = this.crn().size();
    }

    public final int ctP() {
        return this.jHN.krh.kRX.cg + this.ctU() + this.jHN.krh.kRY.cg;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.ccm();
        this.ccu();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        if (this.kRy != null) {
            this.ctT();
        }
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ccd() {
        super.ccd();
        this.ccu();
    }

    @Override
    protected void cce() {
        super.cce();
        this.ccm();
    }

    @Override
    protected hoa ctQ() {
        int n = this.a(this.kRx - 1, ldd.ret);
        return n == -1 ? null : (hoa)this.crn().get(n);
    }

    protected boolean ctR() {
        return false;
    }

    protected boolean ccA() {
        return true;
    }

    protected boolean ccz() {
        return false;
    }

    protected void ccx() {
    }

    protected void ctS() {
    }

    protected void ccy() {
    }

    private void ccm() {
        int n = this.jHN.krh.kRX.cf;
        int n2 = this.getHeight() - (this.ctU() + this.jHN.krh.kRX.cg);
        if (this.kRu != null) {
            this.kRu.cB(n, n2);
            n += this.kRu.getWidth() + this.jHN.krh.kRY.cf;
        }
        n = this.getWidth() - this.jHN.krh.kRX.cf;
        if (this.kRv != null) {
            this.kRv.cB(n -= this.jHN.kRL.rmN, n2);
            n -= this.jHN.krh.kRY.cf;
        }
        if (this.kkz != null) {
            this.kkz.cB(n -= this.jHN.kRJ.rmN, n2);
            n -= this.jHN.krh.kRY.cf;
        }
        if (this.kRw != null) {
            this.kRw.cB(n -= this.jHN.kRH.rmN, n2);
            n -= this.jHN.krh.kRY.cf;
        }
    }

    private void ccu() {
        boolean bl;
        boolean bl2 = this.ccA();
        boolean bl3 = bl = bl2 && this.ccz();
        if (this.kRu != null) {
            this.kRu.og(!bl2 || this.ctR());
        }
        if (this.kRw != null) {
            this.kRw.og(!bl2 || bl);
        }
        if (this.kRv != null) {
            this.kRv.og(!bl2 || bl);
        }
        if (this.kkz != null) {
            lip lip2 = !bl2 || !bl ? this.jHN.kRI : this.jHN.kRO;
            this.kkz.setText(lip2.esy());
        }
    }

    private void close() {
        if (this.kBN != null) {
            this.kBN.W();
        }
    }

    private void ctT() {
        assert (this.Initialized);
        assert (this.kRy != null);
        this.kLu.t(this.kRy);
        assert (this.kRy == null);
    }

    private int ctU() {
        int n = 0;
        if (this.kRw != null && this.jHN.kRH.H > n) {
            n = this.jHN.kRH.H;
        }
        if (this.kkz != null && this.jHN.kRJ.H > n) {
            n = this.jHN.kRJ.H;
        }
        if (this.kRv != null && this.jHN.kRL.H > n) {
            n = this.jHN.kRL.H;
        }
        if (this.kRu != null && this.jHN.kRN.H > n) {
            n = this.jHN.kRN.H;
        }
        return n;
    }

    private void mU(boolean bl) {
        this.a(bl, this.kPy, 13, jpn.nLm);
        this.a(bl, this.khJ, 27, jpn.nLm);
    }

    static /* synthetic */ boolean a(hoe hoe2) {
        return hoe2.Initialized;
    }

    static /* synthetic */ hoz.a a(hoe hoe2, hoz.a a2) {
        hoe2.kRz = a2;
        return hoe2.kRz;
    }

    static /* synthetic */ a b(hoe hoe2) {
        return hoe2.jHN;
    }

    static /* synthetic */ hoz.a b(hoe hoe2, hoz.a a2) {
        hoe2.kRA = a2;
        return hoe2.kRA;
    }

    static /* synthetic */ hnu a(hoe hoe2, hnu hnu2) {
        hoe2.kRy = hnu2;
        return hoe2.kRy;
    }

    static /* synthetic */ hoz.a c(hoe hoe2) {
        return hoe2.kRz;
    }

    static /* synthetic */ hoz.a d(hoe hoe2) {
        return hoe2.kRA;
    }

    static /* synthetic */ lbn e(hoe hoe2) {
        return hoe2.kRE;
    }

    static /* synthetic */ void f(hoe hoe2) {
        hoe2.close();
    }

    static /* synthetic */ hnu g(hoe hoe2) {
        return hoe2.kRy;
    }
}

