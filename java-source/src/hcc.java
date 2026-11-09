/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hcc
extends hpx
implements hmb {
    private final hmr jEN = new hmr(null);
    public final int jEO;
    public final int jEP;
    public final lbn jEQ = new lbn(this){
        final /* synthetic */ hcc jES;
        {
            this.jES = hcc2;
        }

        public final void W() {
            hcc.a(this.jES);
        }
    };
    private boolean Initialized;
    private hgq jER;

    public hcc(hdm hdm2, String string, lgg lgg2, lhf lhf2, hpx.b b2, int n, int n2) {
        super((hnc)hdm2, string, lgg2, lhf2, hpx.a.kXm, b2);
        this.jEO = n;
        this.jEP = n2;
    }

    public final void refresh() {
        hdv hdv2 = this.cbP().kcm.cx(this.jEO, this.jEP);
        assert (hdv2 != null);
        hdu hdu2 = this.cbP().kcm.cy(this.jEO, this.jEP);
        if (this.jER != null && (hdv2 != this.jER.kaW || hdu2 != this.jER.kmX)) {
            this.cbS();
        }
        if (this.jER == null) {
            this.a(hdv2, hdu2);
        }
        this.cbR();
    }

    @Override
    public void cbJ() {
        assert (this.Initialized);
        assert (this.cbO().jZG.cpS());
        if (this.cvF()) {
            this.cvK();
        }
    }

    @Override
    public void cbK() {
        this.cbQ();
    }

    @Override
    public boolean a(hmt hmt2, boolean bl) {
        if (hmt2 instanceof hfu) {
            if (!bl) {
                this.c(this.cbO().jZG.cpN());
                this.cbP().kcm.cw(this.jEO, this.jEP);
                return false;
            }
        } else {
            if (hmt2 instanceof hfw) {
                hfw hfw2 = (hfw)hmt2;
                return hfw2.a(this, bl);
            }
            return false;
        }
        return true;
    }

    @Override
    public void cbL() {
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
        if (this.jER != null) {
            this.na(false);
        }
        this.nb(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cbM() {
        assert (this.Initialized);
        super.cbM();
        this.cbO().jZG.a(this, this.kLu.crN());
    }

    @Override
    protected void cbN() {
        super.cbN();
        this.cbP().kcm.cA(this.jEO, this.jEP);
        this.cbP().kcm.cnS();
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private void cbQ() {
        assert (this.Initialized);
        lcq lcq2 = lcq.COLORSHIFT_NEUTRAL;
        if (this.jER.kmX == null) {
            lcq2 = lcq2.V(this.cbO().jXk.jNZ);
        } else if (this.jER.kmX.isConstructed() && !this.jER.kmX.isEnabled()) {
            lcq2 = lcq2.V(this.cbO().kIn.kED);
        }
        if (this.cbO().jZG.cpS() && this.cbO().jZG.cpL() == this) {
            if (!this.cbO().jZG.cpM()) {
                lcq2 = lcq2.V(this.cbO().jXk.jNW);
            }
        } else if (this.cqQ()) {
            lcq2 = lcq2.V(this.cbO().kIn.kEE);
        }
        this.jEN.J(lcq2);
    }

    private void cbR() {
        hdu hdu2 = this.cbP().kcm.cy(this.jEO, this.jEP);
        this.og(hdu2 == null || !hdu2.isConstructed() || !hdu2.isEnabled());
        this.cbQ();
    }

    private void a(hdv hdv2, hdu hdu2) {
        assert (this.jER == null);
        if (hdv2 instanceof hdw) {
            this.jER = new hgy(this.cbO(), null, lgg.rlI, this.cqv(), (hdz)hdu2, (hdw)hdv2, true, false, false, true);
        } else if (hdv2 instanceof hdx) {
            this.jER = new hgz(this.cbO(), (String)null, lgg.rlI, (hdx)hdv2, (hea)hdu2, false, false);
        } else assert (false) : hdu2;
        this.j(this.jER);
        this.na(true);
    }

    private void cbS() {
        assert (this.jER != null);
        this.na(false);
        if (this.jER.isInitialized()) {
            this.jER.remove();
        }
        this.jER = null;
    }

    private void na(boolean bl) {
        this.jEN.a(bl, this.jER.koV);
        if (this.jER.kmX != null) {
            this.jER.kmX.cec().a(bl, this.jEQ);
        }
    }

    private void nb(boolean bl) {
        assert (lda.yk(bl));
    }

    static /* synthetic */ void a(hcc hcc2) {
        hcc2.cbR();
    }
}

