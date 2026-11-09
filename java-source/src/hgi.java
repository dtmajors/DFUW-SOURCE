/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public class hgi
extends hou {
    private final ldv kmg;
    private final how knR;
    private final hpa knS;
    private final hpa kmi;
    private final hgm kdg;
    private final how kmk;
    private final hpe knT;
    private final hpe kml;
    private final hpe kmm;
    private final hqy knU;
    private final lbn knV = new lbn(this){
        final /* synthetic */ hgi knX;
        {
            this.knX = hgi2;
        }

        public final void W() {
            hgi.a(this.knX);
        }
    };
    private final lbn knW = new lbn(this){
        final /* synthetic */ hgi knX;
        {
            this.knX = hgi2;
        }

        public final void W() {
            hgi.b(this.knX);
        }
    };
    private boolean Initialized;

    public hgi(hdm hdm2, String string, lgg lgg2, lhf lhf2, ldv ldv2) {
        super((hnc)hdm2, string, lgg2, lhf2, new lhf(1, 5), new lgg(0, 2));
        assert (ldv2 != null);
        this.kmg = ldv2;
        this.a(ldb.reo, 0, 350);
        hdm2.jXk.getClass();
        this.a(ldb.rep, 0, 40);
        this.a(ldb.rep, 1, 4);
        this.a(ldb.rep, 2, 300);
        this.a(ldb.rep, 3, 4);
        hdm2.jXk.getClass();
        this.a(ldb.rep, 4, 40);
        this.knR = new how(this.kLu, null, lgg.rlI, lhf.rnv, hdm2.kKk);
        this.d(0, 0, this.knR);
        String string2 = null;
        lgg lgg3 = new lgg(10, 10);
        hdm2.jXk.getClass();
        this.knT = new hpe(this.kLu, string2, lgg3, new lhf(250, 40 - 20), hdm2.kIT, lcy.qVI.esy());
        this.knR.j(this.knT);
        this.knS = new hpa(this.kLu, (String)null, lgg.rlI, lhf.rnv, hdm2.jXk.jOa);
        this.d(1, 0, this.knS);
        this.kdg = new hgm(hdm2, null, lgg.rlI, lhf.rnv, hdm2.kKv, this.cbP().kci.cog(), null);
        this.d(2, 0, this.kdg);
        this.p(this.kdg);
        this.kmi = new hpa(this.kLu, (String)null, lgg.rlI, lhf.rnv, hdm2.jXk.jOa);
        this.d(3, 0, this.kmi);
        this.kmk = new how(this.kLu, null, lgg.rlI, lhf.rnv, hdm2.kKk);
        this.d(4, 0, this.kmk);
        this.kml = new hpe(this.kLu, null, new lgg(10, 10), new lhf(148, 32), hdm2.kIy, lcy.qVJ.esy());
        this.kmk.j(this.kml);
        this.kmm = new hpe(this.kLu, null, new lgg(140, 2), new lhf(66, 32), hdm2.kIX, lcy.qVc.esy());
        this.kmk.j(this.kmm);
        this.knU = new hqy(this.kLu, null, new lgg(338, 4), new lhf(128, 32), hpx.a.kXm, hdm2.kJK, lcy.qVK.esy());
        this.knU.cvC().a(true, this.knV);
        this.kmk.j(this.knU);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
        this.refresh();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        this.Initialized = false;
        super.FG();
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private float ciG() {
        float f2 = 0.0f;
        for (hdu hdu2 : this.cbP().kci.cog().cfh()) {
            hdz hdz2 = (hdz)hdu2;
            et et2 = hdz2.ah(1552);
            if (et2 == null) continue;
            float f3 = et2.fN();
            f2 += f3;
        }
        return f2;
    }

    private void cjt() {
        this.cbP().kck.qX(this.kmg);
    }

    private void refresh() {
        float f2 = this.ciG();
        ljd ljd2 = new ljd(f2);
        this.kmm.mV(((lip)ljd2).esy());
        this.knU.og(ldq.ai(f2, 0.0f));
    }

    private void mU(boolean bl) {
        this.cbP().kci.cog().cfa().a(bl, this.knW);
    }

    static /* synthetic */ void a(hgi hgi2) {
        hgi2.cjt();
    }

    static /* synthetic */ void b(hgi hgi2) {
        hgi2.refresh();
    }
}

