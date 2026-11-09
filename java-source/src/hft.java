/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hft
extends hpw {
    private final hpa kkS;
    private final hpe kkT;
    private final hpe kkU;
    private final lbn kkV = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hft kkX;
        {
            this.kkX = hft2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hft.a(this.kkX)) {
                throw new AssertionError();
            }
            int n = this.kkX.cqt().getWidth();
            this.kkX.d(hft.a(this.kkX, n));
            hft.b(this.kkX);
        }

        static {
            $assertionsDisabled = !hft.class.desiredAssertionStatus();
        }
    };
    private final lbn kkW = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hft kkX;
        {
            this.kkX = hft2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hft.a(this.kkX)) {
                throw new AssertionError();
            }
            this.kkX.refresh();
        }

        static {
            $assertionsDisabled = !hft.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;

    public hft(hdm hdm2, String string, lgg lgg2, lhf lhf2) {
        super((hnc)hdm2, string, lgg2, lhf2, hpw.kWV);
        this.kkS = new hpa(this.kLu, (String)null, lgg.rlI, lhf.rnv, lhu.rnR);
        this.j(this.kkS);
        this.kkT = new hpe((hnc)hdm2, null, lgg.rlI, lhf.rnv, hdm2.kJd, "");
        this.j(this.kkT);
        this.kkU = new hpe((hnc)hdm2, null, lgg.rlI, lhf.rnv, hdm2.kJg, "");
        this.j(this.kkU);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected lcu cfR() {
        assert (this.Initialized);
        return this.kLu.kNw;
    }

    @Override
    protected void cbM() {
        super.cbM();
        if (!this.kLu.csd()) {
            this.cbO().jZG.a(this.cir(), this.kLu.crN());
        }
    }

    @Override
    protected void ccd() {
        hdw hdw2;
        super.ccd();
        lhu lhu2 = lhu.rnR;
        lip lip2 = ljg.roH;
        lip lip3 = ljg.roH;
        if (this.cbP().kcl.coD() && (hdw2 = this.cbP().kcl.coA()) != null) {
            lhu lhu3 = hdw2.awW();
            if (lhu3 != null) {
                lhu2 = lhu3;
            }
            lip2 = hdw2.cdY();
            lip3 = hdw2.cei();
        }
        this.kkS.a(lhu2);
        this.kkT.mV(((lip)lip2).esy());
        this.kkU.mV(((lip)lip3).esy());
        this.ccm();
    }

    private final void ccm() {
        int n = 4;
        int n2 = 4;
        lhu lhu2 = this.kkS.atw();
        if (lhu2 != lhu.rnR) {
            this.kkS.cB(n, n2);
            this.kkS.d(lhu2.kLY);
            n += lhu2.kLY.rmN + 4;
        }
        this.kkT.cB(n, n2);
        this.kkT.cC(200, 16);
        int n3 = 20;
        if (lhu2 != lhu.rnR) {
            n3 = Math.max(n3, lhu2.kLY.H);
        }
        n = 0;
        this.kkU.cB(n, n2 += n3 + 4);
        int n4 = this.getWidth();
        n3 = this.kLu.a(this.kkU.cuW().jFE, this.kkU.getText(), true, n4, true);
        this.kkU.cC(n4, n3);
        this.cC(n4, n2 + n3);
    }

    private final lhf Mr(int n) {
        int n2 = 100;
        return new lhf(n, n2);
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private hnu cir() {
        hmt hmt2 = this;
        while (!(hmt2 instanceof hnu)) {
            hmt2 = hmt2.cqt();
        }
        return (hnu)hmt2;
    }

    private void mU(boolean bl) {
        this.cqt().cqn().a(bl, this.kkV);
        this.cbP().kcl.coy().a(bl, this.kkW);
    }

    static /* synthetic */ boolean a(hft hft2) {
        return hft2.Initialized;
    }

    static /* synthetic */ lhf a(hft hft2, int n) {
        return hft2.Mr(n);
    }

    static /* synthetic */ void b(hft hft2) {
        hft2.ccm();
    }
}

