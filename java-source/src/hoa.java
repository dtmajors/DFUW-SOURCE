/*
 * Decompiled with CFR.
 */
public class hoa
extends hmt {
    private final hmr jEN = new hmr(null);
    private final a kRk;
    private boolean Initialized;
    private boolean kRl;
    private boolean kRm;
    private boolean kRn;
    private boolean kRo;

    public hoa(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2) {
        super(hnc2, string, lgg2, lhf2);
        assert (a2 != null);
        this.kRk = a2;
    }

    public final boolean cty() {
        return this.kRo;
    }

    public final boolean og(boolean bl) {
        if (bl == this.kRo) {
            return false;
        }
        this.kRo = bl;
        if (this.Initialized) {
            this.ctB();
        }
        return true;
    }

    public final boolean ctz() {
        assert (this.Initialized);
        return this.kRl;
    }

    public final boolean ctA() {
        assert (this.Initialized);
        this.ctK();
        return this.kRm;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.nb(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.nb(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cbM() {
        assert (this.Initialized);
        if (this.kRm) {
            return;
        }
        if (this.kRo) {
            this.ctG();
            return;
        }
        this.crb();
        this.ctJ();
        this.ctK();
        super.cbM();
    }

    @Override
    protected void cbv() {
        assert (this.Initialized);
        if (this.crd()) {
            this.crc();
        }
        this.ctJ();
        this.ctK();
        super.cbv();
    }

    @Override
    protected void cdC() {
        assert (this.Initialized);
        super.cdC();
        this.ctJ();
        this.ctK();
    }

    @Override
    protected void chL() {
        assert (this.Initialized);
        super.chL();
        this.ctI();
    }

    @Override
    protected void cbu() {
        assert (this.Initialized);
        super.cbu();
        this.ctI();
    }

    @Override
    protected void chK() {
        assert (this.Initialized);
        super.chK();
        this.ctI();
    }

    @Override
    protected void a(boolean bl, hms hms2, int n) {
        super.a(bl, hms2, n);
        if (hms2 instanceof hoy) {
            this.jEN.a(bl, (hoy)hms2);
        }
    }

    @Override
    protected void ccf() {
        assert (this.Initialized);
        super.ccf();
        this.ctJ();
    }

    protected void ctB() {
        this.ctH();
    }

    protected void ctC() {
        this.ctH();
    }

    protected void ctD() {
    }

    protected void ctE() {
        this.ctH();
    }

    protected void ctF() {
        this.ctJ();
    }

    protected void ctG() {
        this.kLu.a(this.kRk.kRp);
    }

    protected void ctH() {
        lcq lcq2 = this.cfJ();
        this.jEN.J(lcq2);
    }

    protected lcq cfJ() {
        if (this.kRo) {
            return this.kRk.kxa;
        }
        if (this.kRn) {
            return this.kRk.kwY;
        }
        return lcq.COLORSHIFT_NEUTRAL;
    }

    private final void ctI() {
        boolean bl = this.cqQ();
        if (bl != this.kRl) {
            this.kRl = bl;
            this.ctF();
        }
    }

    private final void ctJ() {
        boolean bl = this.cqP();
        if (bl != this.kRn) {
            this.kRn = bl;
            this.ctE();
        }
    }

    private final void ctK() {
        boolean bl;
        boolean bl2 = bl = this.kLu.csc() && this.crd();
        if (bl != this.kRm) {
            this.kRm = bl;
            this.ctD();
        }
    }

    protected final void ctL() {
        boolean bl = this.kRl;
        this.kRl = false;
        this.ctK();
        this.kRl = bl;
        this.ctK();
    }

    private void nb(boolean bl) {
        assert (lda.yk(bl));
    }
}

