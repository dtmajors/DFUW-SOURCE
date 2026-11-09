/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
import java.util.LinkedList;

public class hfx
extends hmt {
    private final hpa kln;
    private final hpa klo;
    private final hpa klp;
    private final hpa klq;
    private final lbn klr = new lbn(this){
        final /* synthetic */ hfx klx;
        {
            this.klx = hfx2;
        }

        public final void W() {
            hfx.a(this.klx);
        }
    };
    private final lbn kls = new lbn(this){
        final /* synthetic */ hfx klx;
        {
            this.klx = hfx2;
        }

        public final void W() {
            hfx.b(this.klx);
        }
    };
    private final lbn klt = new lbn(this){
        final /* synthetic */ hfx klx;
        {
            this.klx = hfx2;
        }

        public final void W() {
            hfx.c(this.klx);
            hfx.d(this.klx);
        }
    };
    private final lbn klu = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hfx klx;
        {
            this.klx = hfx2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hfx.e(this.klx)) {
                throw new AssertionError();
            }
            if (this.klx.kLu.crX() != null) {
                this.klx.kLu.crW();
            }
            hfx.g(this.klx).esg().a(false, hfx.f(this.klx));
            hfx.a(this.klx, null);
        }

        static {
            $assertionsDisabled = !hfx.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private lib klv;
    private hgz klw;

    private static final hpa a(hnc hnc2, String string, lgg lgg2, int n, int n2, int n3, int n4, String string2) {
        lhu lhu2 = new lhu(n, n2, n3, n4, string2 + ".dds");
        lbg lbg2 = lio.Ar("texture/dds/" + string2 + "_s.bmp");
        if (lbg2 != null && (n != 0 || n2 != 0)) {
            lbg2 = new lcg(n, n2, n3, n4, lbg2);
        }
        return new hpa(hnc2, string, lgg2, null, lhu2, lbg2);
    }

    public hfx(hdm hdm2, String string, lgg lgg2) {
        super((hnc)hdm2, string, lgg2, lhf.rnv);
        int n = 0;
        this.kln = hfx.a((hnc)hdm2, null, new lgg(7, n), 0, 0, 32, 4, "gui/border/hotbar/dongle_hinge");
        this.j(this.kln);
        this.klo = hfx.a((hnc)hdm2, null, new lgg(0, n += this.kln.getHeight()), 1, 0, 46, 47, "gui/border/hotbar/dongle_skill");
        this.j(this.klo);
        this.klp = hfx.a((hnc)hdm2, null, new lgg(0, n += this.klo.getHeight()), 1, 2, 46, 48, "gui/hotbar/dongle_item_sheathed");
        this.j(this.klp);
        this.klq = new hpa((hnc)hdm2, null, this.klp.cqw().fY(7, 0), new lhf(35, 35), lhu.rnR, lio.Ar("texture/dds/dongle_item_sheathed_s.bmp"));
        this.j(this.klq);
        this.cC(this.klp.getWidth(), n += this.klp.getHeight());
        this.ciA();
        this.ciy();
        this.ciz();
    }

    public final void H(lcq lcq2) {
        this.kln.H(lcq2);
        this.klo.H(lcq2);
        this.klp.H(lcq2);
        this.klq.H(lcq2);
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
        if (this.klv != null) {
            this.klv.stop();
            this.klv = null;
        }
        this.nb(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ccc() {
        assert (this.Initialized);
        hms hms2 = this.a(this.cqu(), hms.class);
        if (hms2 != null && hms2 == this.klw) {
            this.o((lgg)null);
            return;
        }
        super.ccc();
    }

    @Override
    protected void cbM() {
        super.cbM();
        this.cbO().jYT.cdh().cfI();
    }

    @Override
    protected lcu cfR() {
        return this.kLu.kNw;
    }

    @Override
    protected boolean co(int n, int n2) {
        if (!super.co(n, n2)) {
            return false;
        }
        for (hms hms2 : this.crn()) {
            int n3;
            int n4;
            if (!hms2.contains(n4 = hms2.a(this, ldb.reo, n), n3 = hms2.a(this, ldb.rep, n2))) continue;
            return true;
        }
        return false;
    }

    private void cix() {
        hea hea2 = this.cbP().kck.cju();
        if (hea2 != null) {
            lgg lgg2 = this.klw.cqD().cfx();
            lgg2 = this.kLu.kND.a((hms)this, lgg2);
            lgg2 = new lgg(lgg2.cf + 10, lgg2.cg - 45);
            this.o(lgg2);
            if (this.klv != null) {
                this.klv.stop();
                this.klv = null;
            }
            this.klv = new lib(this.kLu.kNg, false);
            this.klv.ee(this.cbO().jZL.ccV().getValue());
            this.klv.esg().a(true, this.klu);
            return;
        }
    }

    private void o(lgg lgg2) {
        LinkedList<hnt> linkedList = new LinkedList<hnt>();
        lhu lhu2 = null;
        hea hea2 = this.cbP().kck.cju();
        if (hea2 != null) {
            this.cbO().a((hdu)hea2, hea2.kaW, linkedList);
            lhu2 = hea2.kaW.atw();
        } else {
            linkedList.add(new hnt(this.cbO().kKo, lcy.qZd.esy()));
            linkedList.add(new hnt(this.cbO().jGV, lcy.qZe.esy()));
        }
        this.kLu.a(lgg2, lhu2, linkedList);
    }

    private void ciy() {
        hdz hdz2 = this.cbP().kck.cns();
        if (hdz2 == null) {
            this.klq.a(lhu.rnR);
        } else {
            this.klq.a(hdz2.ceB().atw());
            float f2 = 0.5625f;
            this.klq.N(f2, f2);
        }
    }

    private void ciz() {
        boolean bl = this.cbP().kck.cnt();
        this.klp.a(bl ? this.cbO().jXk.jOm : this.cbO().jXk.jOl);
    }

    private hdm cbO() {
        return (hdm)this.kLu;
    }

    private hec cbP() {
        return this.cbO().cbP();
    }

    private void ciA() {
        hea hea2 = this.cbP().kck.cju();
        if (this.klw != null && hea2 != this.klw.kmX) {
            this.klw.remove();
            this.klw = null;
        }
        if (hea2 != null && this.klw == null) {
            lgg lgg2 = this.klo.cqw();
            this.klw = new hgz(this.cbO(), (String)null, new lgg(lgg2.cf + 7, lgg2.cg + 11), hea2.ceG(), hea2, false, false);
            this.j(this.klw);
        }
    }

    private void nb(boolean bl) {
        this.cbP().kck.cmZ().a(bl, this.klt);
        this.cbP().kck.cnp().a(bl, this.klr);
        this.cbP().kck.cnr().a(bl, this.kls);
    }

    static /* synthetic */ void a(hfx hfx2) {
        hfx2.ciy();
    }

    static /* synthetic */ void b(hfx hfx2) {
        hfx2.ciz();
    }

    static /* synthetic */ void c(hfx hfx2) {
        hfx2.ciA();
    }

    static /* synthetic */ void d(hfx hfx2) {
        hfx2.cix();
    }

    static /* synthetic */ boolean e(hfx hfx2) {
        return hfx2.Initialized;
    }

    static /* synthetic */ lbn f(hfx hfx2) {
        return hfx2.klu;
    }

    static /* synthetic */ lib g(hfx hfx2) {
        return hfx2.klv;
    }

    static /* synthetic */ lib a(hfx hfx2, lib lib2) {
        hfx2.klv = lib2;
        return hfx2.klv;
    }
}

