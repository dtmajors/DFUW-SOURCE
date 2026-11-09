/*
 * Decompiled with CFR.
 */
public class hpv
extends hmt {
    private final hmr jEN = new hmr(null);
    private boolean Initialized;
    private lcq kTB = lcq.COLORSHIFT_NEUTRAL;

    public hpv(hnc hnc2, String string, lgg lgg2, lhf lhf2) {
        super(hnc2, string, lgg2, lhf2);
    }

    public final lcq cvt() {
        return this.kTB;
    }

    public final boolean K(lcq lcq2) {
        if (lcq2.X(this.kTB)) {
            return false;
        }
        this.kTB = lcq2;
        this.cjQ();
        return true;
    }

    public final lcq cuw() {
        return this.jEN.getColor();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        assert (this.cqt() instanceof hob);
        this.mU(true);
        this.cjQ();
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
        if (this.cfL()) {
            this.cqV();
        }
        super.cbM();
    }

    @Override
    protected void a(boolean bl, hms hms2, int n) {
        assert (this.Initialized);
        assert (this.cqt() != this);
        super.a(bl, hms2, n);
        if (hms2 instanceof hoy) {
            this.jEN.a(bl, (hoy)hms2);
        }
    }

    @Override
    protected void ccf() {
        assert (this.Initialized);
        super.ccf();
        if (!this.Initialized) {
            return;
        }
        if (this.isFocusOwner()) {
            this.cqF();
        }
        this.cjQ();
    }

    protected boolean cfL() {
        if (this.isFocusOwner()) {
            return false;
        }
        return !this.kLu.csd();
    }

    protected lcq cfJ() {
        return this.kTB;
    }

    protected void cvu() {
    }

    protected final void cjQ() {
        assert (this.Initialized);
        lcq lcq2 = this.cfJ();
        if (!this.jEN.J(lcq2)) {
            return;
        }
        this.cvu();
    }

    protected final hoc cvv() {
        return (hoc)this.cqT();
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

