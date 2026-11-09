/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public class hcv
extends hog {
    private final hqj jJe;
    private final hqe<hdm.a> jJf;
    private final hqj jJg;
    private final hqu jJh;
    private final hqu jJi;
    private final hqu jJj;
    private final hqj jJk;
    private final hqj jJl;
    private final hqj jJm;
    private final hqj jJn;
    private final hqj jJo;
    private final hqu jJp;
    private final hqu jJq;
    private final hqu jJr;
    private final hqu jJs;
    private final hqu jJt;
    private final hqu jJu;
    private final hqu jJv;
    private final hql jJw;
    private final hqu jJx;
    private final hdd jJy;
    private final lbn jJz = new lbn(this){
        final /* synthetic */ hcv jJC;
        {
            this.jJC = hcv2;
        }

        public final void W() {
            double d2 = hcv.a(this.jJC).ccX().getValue();
            d2 = Math.min(hcv.a(this.jJC).ccW().getValue(), d2);
            hcv.a(this.jJC).ccX().es(d2);
            double d3 = hcv.a(this.jJC).ccY().getValue();
            d3 = Math.min(d2, d3);
            hcv.a(this.jJC).ccY().es(d3);
        }
    };
    private final lbn jJA = new lbn(this){
        final /* synthetic */ hcv jJC;
        {
            this.jJC = hcv2;
        }

        public final void W() {
            double d2 = hcv.a(this.jJC).ccW().getValue();
            d2 = Math.max(d2, hcv.a(this.jJC).ccX().getValue());
            hcv.a(this.jJC).ccW().es(d2);
            double d3 = hcv.a(this.jJC).ccY().getValue();
            d3 = Math.min(hcv.a(this.jJC).ccX().getValue(), d3);
            hcv.a(this.jJC).ccY().es(d3);
        }
    };
    private final lbn jJB = new lbn(this){
        final /* synthetic */ hcv jJC;
        {
            this.jJC = hcv2;
        }

        public final void W() {
            double d2 = hcv.a(this.jJC).ccX().getValue();
            d2 = Math.max(hcv.a(this.jJC).ccY().getValue(), d2);
            hcv.a(this.jJC).ccX().es(d2);
            double d3 = hcv.a(this.jJC).ccW().getValue();
            d3 = Math.max(d3, hcv.a(this.jJC).ccX().getValue());
            hcv.a(this.jJC).ccW().es(d3);
        }
    };
    private boolean Initialized;

    public hcv(hdm hdm2, String string, lgg lgg2, int n, hdd hdd2) {
        this(hdm2, string, lgg2, n, hdm2.kKl, hdd2);
    }

    private hcv(hdm hdm2, String string, lgg lgg2, int n, hog.a a2, hdd hdd2) {
        super((hnc)hdm2, string, lgg2, new lhf(n, 1000), a2);
        this.jJy = hdd2;
        int n2 = a2.kRX.cf;
        int n3 = a2.kRX.cg;
        int n4 = 20;
        int n5 = 10;
        int n6 = n4 + n5;
        int n7 = 140;
        int n8 = this.getWidth() - (a2.kRX.cf * 2 + n7 + a2.kRY.cf);
        this.jJe = new hqj(this.kLu, null, new lgg(n2, n3), new lhf(n7, n4), hdm2.kKx, hdd2.ccM(), false, 2, 100.0);
        this.j(this.jJe);
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n2 += n7 + a2.kRY.cf, n3), new lhf(n8, n4), hdm2.kIT, lcy.qWj.esy());
        this.j(hpe2);
        n2 = a2.kRX.cf;
        this.jJf = new hqe<hdm.a>(this.kLu, null, new lgg(n2, n3 += n6), new lhf(n7, n4), hdm2.kKH, hdm2.kKE, 200, hdd2.ccP());
        this.j(this.jJf);
        hpe2 = new hpe(this.kLu, null, new lgg(n2 += n7 + a2.kRY.cf, n3), new lhf(n8, n4), hdm2.kIT, lcy.qWk.esy());
        this.j(hpe2);
        n2 = a2.kRX.cf;
        this.jJg = new hqj(this.kLu, null, new lgg(n2, n3 += n6), new lhf(n7, n4), hdm2.kKx, hdd2.ccQ(), false, 2, 0.1);
        this.j(this.jJg);
        hpe2 = new hpe(this.kLu, null, new lgg(n2 += n7 + a2.kRY.cf, n3), new lhf(n8, n4), hdm2.kIT, lcy.qWl.esy());
        this.j(hpe2);
        n2 = a2.kRX.cf;
        hqt.a a3 = hdm2.kJI;
        this.jJh = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n7 - a3.kpT.kLY.rmN, n3 += n6), new lhf(a3.kpT.kLY.rmN + a3.kZx + n8, n4), a3, hdd2.ccR(), lcy.qWm.esy());
        this.j(this.jJh);
        n2 = a2.kRX.cf;
        this.jJi = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n7 - a3.kpT.kLY.rmN, n3 += n6), new lhf(a3.kpT.kLY.rmN + a3.kZx + n8, n4), a3, hdd2.ccS(), lcy.qWn.esy());
        this.j(this.jJi);
        n2 = a2.kRX.cf;
        this.jJj = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n7 - a3.kpT.kLY.rmN, n3 += n6), new lhf(a3.kpT.kLY.rmN + a3.kZx + n8, n4), a3, hdd2.ccT(), lcy.qWo.esy());
        this.j(this.jJj);
        n2 = a2.kRX.cf;
        this.jJk = new hqj(this.kLu, null, new lgg(n2, n3 += n6), new lhf(n7, n4), hdm2.kKx, hdd2.ccU(), false, 2, 0.1);
        this.j(this.jJk);
        hpe2 = new hpe(this.kLu, null, new lgg(n2 += n7 + a2.kRY.cf, n3), new lhf(n8, n4), hdm2.kIT, lcy.qWq.esy());
        this.j(hpe2);
        n2 = a2.kRX.cf;
        this.jJl = new hqj(this.kLu, null, new lgg(n2, n3 += n6), new lhf(n7, n4), hdm2.kKx, hdd2.ccV(), false, 2, 0.1);
        this.j(this.jJl);
        hpe2 = new hpe(this.kLu, null, new lgg(n2 += n7 + a2.kRY.cf, n3), new lhf(n8, n4), hdm2.kIT, lcy.qWr.esy());
        this.j(hpe2);
        n2 = a2.kRX.cf;
        this.jJm = new hqj(this.kLu, null, new lgg(n2, n3 += n6), new lhf(n7, n4), hdm2.kKx, hdd2.ccW(), false, 2, 0.01);
        this.j(this.jJm);
        hpe2 = new hpe(this.kLu, null, new lgg(n2 += n7 + a2.kRY.cf, n3), new lhf(n8, n4), hdm2.kIT, lcy.qWs.esy());
        this.j(hpe2);
        n2 = a2.kRX.cf;
        this.jJn = new hqj(this.kLu, null, new lgg(n2, n3 += n6), new lhf(n7, n4), hdm2.kKx, hdd2.ccX(), false, 2, 0.01);
        this.j(this.jJn);
        hpe2 = new hpe(this.kLu, null, new lgg(n2 += n7 + a2.kRY.cf, n3), new lhf(n8, n4), hdm2.kIT, lcy.qWt.esy());
        this.j(hpe2);
        n2 = a2.kRX.cf;
        this.jJo = new hqj(this.kLu, null, new lgg(n2, n3 += n6), new lhf(n7, n4), hdm2.kKx, hdd2.ccY(), false, 2, 0.01);
        this.j(this.jJo);
        hpe2 = new hpe(this.kLu, null, new lgg(n2 += n7 + a2.kRY.cf, n3), new lhf(n8, n4), hdm2.kIT, lcy.qWu.esy());
        this.j(hpe2);
        n2 = a2.kRX.cf;
        this.jJp = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n7 - a3.kpT.kLY.rmN, n3 += n6), new lhf(a3.kpT.kLY.rmN + a3.kZx + n8, n4), a3, hdd2.ccZ(), lcy.qWv.esy());
        this.j(this.jJp);
        n2 = a2.kRX.cf;
        this.jJq = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n7 - a3.kpT.kLY.rmN, n3 += n6), new lhf(a3.kpT.kLY.rmN + a3.kZx + n8, n4), a3, hdd2.cda(), lcy.qWw.esy());
        this.j(this.jJq);
        n2 = a2.kRX.cf;
        this.jJr = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n7 - a3.kpT.kLY.rmN, n3 += n6), new lhf(a3.kpT.kLY.rmN + a3.kZx + n8, n4), a3, hdd2.cdb(), lcy.qWx.esy());
        this.j(this.jJr);
        n2 = a2.kRX.cf;
        this.jJs = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n7 - a3.kpT.kLY.rmN, n3 += n6), new lhf(a3.kpT.kLY.rmN + a3.kZx + n8, n4), a3, hdd2.cdc(), lcy.qWA.esy());
        this.j(this.jJs);
        n2 = a2.kRX.cf;
        this.jJt = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n7 - hdm2.kJI.kpT.kLY.rmN, n3 += n6), new lhf(hdm2.kJI.kpT.kLY.rmN + hdm2.kJI.kZx + n8, n4), hdm2.kJI, hdd2.ccN(), "Display FPS");
        this.j(this.jJt);
        n2 = a2.kRX.cf;
        this.jJu = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n7 - hdm2.kJI.kpT.kLY.rmN, n3 += n6), new lhf(hdm2.kJI.kpT.kLY.rmN + hdm2.kJI.kZx + n8, n4), hdm2.kJI, hdd2.ccO(), "Display Ping");
        this.j(this.jJu);
        n2 = a2.kRX.cf;
        this.jJv = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n7 - a3.kpT.kLY.rmN, n3 += n6), new lhf(a3.kpT.kLY.rmN + a3.kZx + n8, n4), a3, hdd2.cdd(), lcy.qWB.esy());
        this.j(this.jJv);
        n2 = a2.kRX.cf;
        this.jJx = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n7 - a3.kpT.kLY.rmN, n3 += n6), new lhf(a3.kpT.kLY.rmN + a3.kZx + n8, n4), a3, hdd2.cdf(), lcy.qWD.esy());
        this.j(this.jJx);
        n2 = a2.kRX.cf;
        this.jJw = new hql(this.kLu, null, new lgg(a2.kRX.cf, n3 += n6), new lhf(n7, n4), ((hdm)this.kLu).kKx, hdd2.cde(), false);
        this.j(this.jJw);
        hpe2 = new hpe(this.kLu, null, new lgg(n2 += n7 + a2.kRY.cf, n3), new lhf(n8, n4), hdm2.kIT, lcy.qWC.esy());
        this.j(hpe2);
        n2 = a2.kRX.cf;
        this.cC(n, n3 += n6);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.ccu();
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

    private void ccu() {
    }

    private void mU(boolean bl) {
        this.jJy.ccW().cec().a(bl, this.jJz);
        this.jJy.ccX().cec().a(bl, this.jJA);
        this.jJy.ccY().cec().a(bl, this.jJB);
    }

    static /* synthetic */ hdd a(hcv hcv2) {
        return hcv2.jJy;
    }
}

