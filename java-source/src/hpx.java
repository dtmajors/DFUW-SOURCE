/*
 * Decompiled with CFR.
 */
public abstract class hpx
extends hoa {
    private final a kXc;
    private final ldl kXd = new ldl();
    private final lbn kXe = new lbn(this){
        final /* synthetic */ hpx kXk;
        {
            this.kXk = hpx2;
        }

        public final void W() {
            if (this.kXk.cty()) {
                return;
            }
            if (this.kXk.cvF()) {
                this.kXk.kLu.a(hpx.c((hpx)this.kXk).kXr);
                this.kXk.cbN();
            }
        }
    };
    private final lbn jEL = new lbn(this){
        final /* synthetic */ hpx kXk;
        {
            this.kXk = hpx2;
        }

        public final void W() {
            if (hpx.d(this.kXk) <= 0) {
                return;
            }
            hpx.e(this.kXk);
            if (hpx.d(this.kXk) == 0) {
                hpx.a(this.kXk, false);
                this.kXk.cbN();
            }
        }
    };
    private final lbp kXf = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpx kXk;
        {
            this.kXk = hpx2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hpx.f(this.kXk)) {
                throw new AssertionError();
            }
            this.kXk.cbN();
            return true;
        }

        static {
            $assertionsDisabled = !hpx.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private final b kXg;
    private boolean kXh;
    private boolean kXi;
    private int kXj;

    public hpx(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, b b2) {
        super(hnc2, string, lgg2, lhf2, b2.jHw);
        this.kXc = a2;
        this.kXg = b2;
    }

    public final lbl<lbn> cvC() {
        return this.kXd;
    }

    public final a cvD() {
        assert (this.Initialized);
        return this.kXc;
    }

    public final boolean cvE() {
        assert (this.Initialized);
        assert (this.kXc == a.kXo) : this.kXc;
        return this.kXh;
    }

    public final boolean on(boolean bl) {
        assert (this.kXc == a.kXo);
        if (bl == this.kXh) {
            return false;
        }
        this.kXh = bl;
        if (this.Initialized) {
            this.ctC();
        }
        return true;
    }

    public final boolean cvF() {
        assert (this.Initialized);
        return this.kXi;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        if (this.kXj > 0) {
            this.oo(false);
            this.kXj = 0;
        }
        if (this.kXi) {
            this.cvK();
        }
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected lcu cfR() {
        assert (this.Initialized);
        if (!this.cty()) {
            return this.kLu.kNl;
        }
        return super.cfR();
    }

    @Override
    protected void cdC() {
        if (this.kXc == a.kXm && this.kXi) {
            this.cvK();
        }
        super.cdC();
    }

    @Override
    protected void ctD() {
        super.ctD();
        this.cvI();
    }

    @Override
    protected void ctF() {
        this.cvI();
        super.ctF();
    }

    @Override
    protected lcq cfJ() {
        if (!this.cty() && this.kXi) {
            return this.kXg.kXq;
        }
        return super.cfJ();
    }

    protected void cvG() {
        this.ctH();
        if (this.kXc == a.kXn) {
            this.kLu.kNC.a(this.kXi, this.kXe);
        }
        if (this.kXi) {
            this.kLu.a(this.kXg.kXs);
        } else if (!this.cqH()) {
            this.kLu.a(this.kXg.kXt);
        } else {
            this.kLu.a(this.kXg.kXu);
        }
        switch (this.kXc) {
            case kXm: {
                if (this.kXi || !this.ctz()) break;
                this.cvJ();
                break;
            }
            case kXn: {
                if (!this.kXi) break;
                this.cvJ();
                break;
            }
            case kXo: {
                if (!this.kXi) break;
                this.cvJ();
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    protected void cbN() {
        this.kXd.enp();
    }

    protected final boolean cvH() {
        if (this.kXi) {
            return true;
        }
        return this.kXc == a.kXo && this.kXh;
    }

    private final void cvI() {
        boolean bl;
        boolean bl2 = bl = this.ctA() && this.ctz();
        if (bl != this.kXi) {
            this.kXi = bl;
            this.cvG();
        }
    }

    private final void cvJ() {
        if (this.kXj > 0) {
            return;
        }
        this.kXj = 3;
        this.oo(true);
    }

    protected final void cvK() {
        assert (this.Initialized);
        assert (this.kXi || this.kXh);
        this.ctL();
    }

    private final void oo(boolean bl) {
        this.kLu.kAz.eme().a(bl, this.jEL);
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
        this.a(bl, this.kXf, 32, jpn.nLm);
    }

    static /* synthetic */ b c(hpx hpx2) {
        return hpx2.kXg;
    }

    static /* synthetic */ int d(hpx hpx2) {
        return hpx2.kXj;
    }

    static /* synthetic */ int e(hpx hpx2) {
        return hpx2.kXj--;
    }

    static /* synthetic */ void a(hpx hpx2, boolean bl) {
        hpx2.oo(bl);
    }

    static /* synthetic */ boolean f(hpx hpx2) {
        return hpx2.Initialized;
    }
}

