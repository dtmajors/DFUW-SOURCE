/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public class hcw
extends hog {
    private final jok jJD;
    private final hqj jJE;
    private final hqj jJF;
    private final hqu jJG;
    private final hqj jJH;
    private final hqu jJI;
    private final hqj jJJ;
    private final hqj jJK;
    private final hqj jJL;
    private final lbn jJM = new lbn(this){
        final /* synthetic */ hcw jJP;
        {
            this.jJP = hcw2;
        }

        public final void W() {
            double d2 = hcw.a(this.jJP).dON().getValue();
            hcw.a(this.jJP).dOO().es(d2);
        }
    };
    private final lbn jJN = new lbn(this){
        final /* synthetic */ hcw jJP;
        {
            this.jJP = hcw2;
        }

        public final void W() {
            double d2 = hcw.a(this.jJP).dOS().getValue();
            hcw.a(this.jJP).dOT().es(d2);
        }
    };
    private final lbn jJO = new lbn(this){
        final /* synthetic */ hcw jJP;
        {
            this.jJP = hcw2;
        }

        public final void W() {
            double d2 = hcw.a(this.jJP).dOT().getValue();
            hcw.a(this.jJP).dOU().es(d2);
        }
    };
    private boolean Initialized;

    public hcw(hdm hdm2, String string, lgg lgg2, int n, jok jok2) {
        this(hdm2, string, lgg2, n, hdm2.kKl, jok2);
    }

    private hcw(hdm hdm2, String string, lgg lgg2, int n, hog.a a2, jok jok2) {
        super((hnc)hdm2, string, lgg2, new lhf(n, 1000), a2);
        this.jJD = jok2;
        int n2 = 20;
        int n3 = 10;
        int n4 = 140;
        int n5 = this.getWidth() - (a2.kRX.cf * 2 + n4 + a2.kRY.cf);
        int n6 = a2.kRX.cf;
        int n7 = a2.kRX.cg;
        this.jJE = new hqj(this.kLu, null, new lgg(n6, n7), new lhf(n4, n2), this.cbO().kKx, jok2.dON(), false, 5, 1.0E-5);
        this.j(this.jJE);
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n6 += n4 + a2.kRY.cf, n7), new lhf(n5, n2), this.cbO().kIT, lcy.qWa.esy());
        this.j(hpe2);
        n6 = a2.kRX.cf;
        this.jJF = new hqj(this.kLu, null, new lgg(n6, n7 += n2 + n3), new lhf(n4, n2), this.cbO().kKx, jok2.dOO(), false, 5, 1.0E-5);
        this.j(this.jJF);
        hpe2 = new hpe(this.kLu, null, new lgg(n6 += n4 + a2.kRY.cf, n7), new lhf(n5, n2), this.cbO().kIT, lcy.qWb.esy());
        this.j(hpe2);
        n6 = a2.kRX.cf;
        hqt.a a3 = this.cbO().kJI;
        this.jJG = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n4 - a3.kpT.kLY.rmN, n7 += n2 + n3), new lhf(a3.kpT.kLY.rmN + a3.kZx + n5, n2), a3, jok2.dOQ(), lcy.qWc.esy());
        this.j(this.jJG);
        n6 += n4 + a2.kRY.cf;
        n6 = a2.kRX.cf;
        this.jJH = new hqj(this.kLu, null, new lgg(n6, n7 += n2 + n3), new lhf(n4, n2), this.cbO().kKx, jok2.dOR(), false, 5, 1.0E-5);
        this.j(this.jJH);
        hpe2 = new hpe(this.kLu, null, new lgg(n6 += n4 + a2.kRY.cf, n7), new lhf(n5, n2), this.cbO().kIT, lcy.qWd.esy());
        this.j(hpe2);
        n6 = a2.kRX.cf;
        this.jJI = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n4 - a3.kpT.kLY.rmN, n7 += n2 + n3), new lhf(a3.kpT.kLY.rmN + a3.kZx + n5, n2), a3, jok2.dOP(), lcy.qWe.esy());
        this.j(this.jJI);
        n6 = a2.kRX.cf;
        this.jJJ = new hqj(this.kLu, null, new lgg(n6, n7 += n2 + n3), new lhf(n4, n2), this.cbO().kKx, jok2.dOS(), false, 5, 1.0E-5);
        this.j(this.jJJ);
        hpe2 = new hpe(this.kLu, null, new lgg(n6 += n4 + a2.kRY.cf, n7), new lhf(n5, n2), this.cbO().kIT, lcy.qWf.esy());
        this.j(hpe2);
        n6 = a2.kRX.cf;
        this.jJK = new hqj(this.kLu, null, new lgg(n6, n7 += n2 + n3), new lhf(n4, n2), this.cbO().kKx, jok2.dOT(), false, 5, 1.0E-5);
        this.j(this.jJK);
        hpe2 = new hpe(this.kLu, null, new lgg(n6 += n4 + a2.kRY.cf, n7), new lhf(n5, n2), this.cbO().kIT, lcy.qWg.esy());
        this.j(hpe2);
        n6 = a2.kRX.cf;
        this.jJL = new hqj(this.kLu, null, new lgg(n6, n7 += n2 + n3), new lhf(n4, n2), this.cbO().kKx, jok2.dOU(), false, 5, 1.0E-5);
        this.j(this.jJL);
        hpe2 = new hpe(this.kLu, null, new lgg(n6 += n4 + a2.kRY.cf, n7), new lhf(n5, n2), this.cbO().kIT, lcy.qWh.esy());
        this.j(hpe2);
        this.cC(n, (n7 += n2) + a2.kRX.cg);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.refresh();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ccd() {
        super.ccd();
        this.ccu();
    }

    private hdm cbO() {
        return (hdm)this.kLu;
    }

    protected void ccu() {
    }

    private void mU(boolean bl) {
        this.jJD.dON().cec().a(bl, this.jJM);
        this.jJD.dOS().cec().a(bl, this.jJN);
        this.jJD.dOT().cec().a(bl, this.jJO);
    }

    static /* synthetic */ jok a(hcw hcw2) {
        return hcw2.jJD;
    }
}

