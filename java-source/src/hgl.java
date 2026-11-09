/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
import java.util.ArrayList;
import java.util.Collection;

public class hgl
extends hou {
    private static final lhf jGE = new lhf(0, 4);
    private static final int kmF = 450;
    private static final hoz.a jHL = new hoz.a(lcy.qUR);
    private static final hoz.a jHM = new hoz.a(lcy.qUS, true);
    private final ArrayList<hdu> kmG = new ArrayList();
    private final ldv kmI;
    private final how kmk;
    private final hpx kmJ;
    private final hpa kmK;
    private final lbn kmM = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgl koa;
        {
            this.koa = hgl2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hgl.a(this.koa)) {
                throw new AssertionError();
            }
            hea hea2 = hgl.b(this.koa);
            if (hea2 == null) {
                return;
            }
            hgl.a(this.koa, hea2);
        }

        static {
            $assertionsDisabled = !hgl.class.desiredAssertionStatus();
        }
    };
    private final lbn kmR = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgl koa;
        {
            this.koa = hgl2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hgl.a(this.koa)) {
                throw new AssertionError();
            }
            hea hea2 = hgl.b(this.koa);
            if (hea2 == null) {
                return;
            }
            if (!hgl.b(this.koa, hea2)) {
                this.koa.kLu.a(this.koa.cbO().kIn.kEB);
                return;
            }
            hgl.a(this.koa, hea2);
        }

        static {
            $assertionsDisabled = !hgl.class.desiredAssertionStatus();
        }
    };
    private final lbn kmN = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgl koa;
        {
            this.koa = hgl2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hgl.a(this.koa)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && hgl.c(this.koa) == null) {
                throw new AssertionError();
            }
            hoz hoz2 = (hoz)hgl.c(this.koa).csT();
            a a2 = (a)hoz2.ccw();
            this.koa.cbO().jZL.ccS().yP(!hoz2.cuF());
            hgl.a(this.koa, null);
            hoz.a a3 = hoz2.coZ();
            if (a3 == hgl.ciS()) {
                hgl.c(this.koa, a2.kmX);
            }
        }

        static {
            $assertionsDisabled = !hgl.class.desiredAssertionStatus();
        }
    };
    private final lbn kmr = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgl koa;
        {
            this.koa = hgl2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hgl.a(this.koa)) {
                throw new AssertionError();
            }
            hgl.d(this.koa);
            hgl.e(this.koa);
            hgl.f(this.koa);
        }

        static {
            $assertionsDisabled = !hgl.class.desiredAssertionStatus();
        }
    };
    private final lbn kmP = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgl koa;
        {
            this.koa = hgl2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hgl.a(this.koa)) {
                throw new AssertionError();
            }
            hgl.f(this.koa);
        }

        static {
            $assertionsDisabled = !hgl.class.desiredAssertionStatus();
        }
    };
    private final lbn kmS = new lbn(this){
        final /* synthetic */ hgl koa;
        {
            this.koa = hgl2;
        }

        public final void W() {
            hgl.e(this.koa);
        }
    };
    private final lbn kmQ = new lbn(this){
        final /* synthetic */ hgl koa;
        {
            this.koa = hgl2;
        }

        public final void W() {
            hgl.e(this.koa);
        }
    };
    private boolean Initialized;
    private hnu kmT;
    private final hqr jGH;
    private final hjb knY;
    private final lij<hdx> knZ = new lij();

    @Override
    protected boolean LM(int n) {
        this.jGH.Nj(n);
        return true;
    }

    public hgl(hdm hdm2, String string, lgg lgg2, lhf lhf2, ldv ldv2) {
        super((hnc)hdm2, string, lgg2, lhf2, new lhf(1, 3), lgg.rlI);
        assert (ldv2 != null);
        this.kmI = ldv2;
        this.a(ldb.reo, 0, 360);
        this.a(ldb.rep, 0, 300);
        this.a(ldb.rep, 1, hdm2.jXk.jOa.kLY.H);
        hdm2.jXk.getClass();
        this.a(ldb.rep, 2, 40);
        int n = hgl.jGE.rmN;
        int n2 = hgl.jGE.H;
        hjb.d d2 = new hjb.d(hdm2.kKD, 16, hdm2.kIy, hdm2.kIy, hdm2.kIs, hdm2.kIy, hdm2.kIn.kFn);
        this.jGH = new hqr(this.kLu, (String)null, new lgg(n, n2), lhf.rnv, hdm2.jGK);
        n2 += this.jGH.getHeight();
        n2 += hgl.jGE.H;
        this.knY = new hjb(this.cbO(), (String)null, lgg.rlI, lhf.rnv, d2, true, this.knZ);
        this.jGH.cwt().cqd().a(this.knY);
        this.d(0, 0, this.jGH);
        this.p(this.jGH);
        this.kmK = new hpa((hnc)hdm2, (String)null, lgg.rlI, lhf.rnv, hdm2.jXk.jOa);
        this.d(1, 0, this.kmK);
        this.kmk = new how((hnc)hdm2, null, lgg.rlI, lhf.rnv, hdm2.kKk);
        this.d(2, 0, this.kmk);
        this.kmJ = new hqy((hnc)hdm2, null, new lgg(338, 4), new lhf(128, 32), hpx.a.kXm, hdm2.kJK, lcy.qVA.esy());
        this.kmJ.cvC().a(true, this.kmM);
        this.kmJ.og(true);
        this.kmk.j(this.kmJ);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
        this.layout();
        this.ciR();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        if (this.kmT != null) {
            this.ciQ();
        }
        this.mU(false);
        super.FG();
        this.kmG.clear();
        this.Initialized = false;
    }

    @Override
    protected void cce() {
        super.cce();
    }

    @Override
    protected void ccc() {
        assert (this.Initialized);
        super.ccc();
    }

    private hea cju() {
        hdx hdx2 = (hdx)this.knY.getSelectedItem();
        if (hdx2 == null) {
            return null;
        }
        hea hea2 = this.b(hdx2);
        if (hea2 == null) {
            return null;
        }
        return hea2;
    }

    private void layout() {
        int n = this.getHeight() - hgl.jGE.H * 2 - this.kmJ.getHeight();
        this.jGH.cC(this.getWidth(), n);
        int n2 = this.jGH.cwt().cqd().cpJ().rmN;
        if (n2 < 450) {
            n2 = 450;
        }
        this.knY.MS(n2);
    }

    private hdm ciO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.ciO().cbP();
    }

    private void i(hdu hdu2) {
        if (this.cbO().jZL.ccS().getValue()) {
            lip lip2 = hdu2.cdY();
            float f2 = hdu2.Bb();
            ljd ljd2 = new ljd(f2);
            this.kmT = this.cbO().a(lcy.raK.a(lip2, ljd2).esy(), null, new hoz.a[]{jHL, jHM}, lcy.qVb.esy(), !this.cbO().jZL.ccS().getValue(), (Object)new a(hdu2), jHL, jHM, this.kmN);
        } else {
            this.j(hdu2);
        }
        this.ciR();
    }

    private void j(hdu hdu2) {
        this.cbP().kck.j(this.kmI, hdu2.dbx, 1);
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    private void ciP() {
        hea hea2 = this.cju();
        this.kmJ.og(hea2 == null || !this.l(hea2));
    }

    private void ciQ() {
        assert (this.Initialized);
        assert (this.kmT != null);
        this.kLu.t(this.kmT);
        assert (this.kmT == null);
    }

    private boolean l(hdu hdu2) {
        float f2 = hdu2.Bb();
        return f2 <= this.cbP().kck.kyz.cfq();
    }

    private void ciR() {
        hdx hdx2;
        this.knZ.clear();
        for (hdx2 = hdx.kbF.cev(); hdx2 != null; hdx2 = hdx2.cew()) {
            this.a(null, hdx2);
        }
        for (hdx2 = hdx.kbG.cev(); hdx2 != null; hdx2 = hdx2.cew()) {
            this.a(null, hdx2);
        }
        this.knZ.a(null, hdx.kbg, true);
        this.knY.cmP().notifyChanged();
        hdx2 = this.knY.kVC.P(null);
        if (hdx2 != null && this.knY.kVC.O(hdx2)) {
            this.knY.a(hdx2, true, false);
        }
    }

    private int a(hdx hdx2, hdx hdx3) {
        this.knZ.d(hdx3, hdx2, null);
        int n = 0;
        if (hdx3.cem() != null) {
            hdx hdx4;
            for (hdx4 = hdx3.cev(); hdx4 != null; hdx4 = hdx4.cew()) {
                n += this.a(hdx3, hdx4);
            }
            for (hdx4 = (hdx)hdx3.cem(); hdx4 != null; hdx4 = (hdx)hdx4.cen()) {
                n += this.b(hdx3, hdx4);
            }
        } else {
            for (hdx hdx5 = (hdx)hdx3.cem(); hdx5 != null; hdx5 = (hdx)hdx5.cen()) {
                n += this.b(hdx3, hdx5);
            }
        }
        if (this.knZ.getChildCount(hdx3) == 0) {
            this.knZ.af(hdx3);
        }
        return n;
    }

    private int b(hdx hdx2, hdx hdx3) {
        if (hdx3.cex()) {
            return 0;
        }
        if (!cxj.bx(dsv.byP().jp(), hdx3.Type)) {
            return 0;
        }
        int n = this.c(hdx2, hdx3);
        for (hdx hdx4 = (hdx)hdx3.cem(); hdx4 != null; hdx4 = (hdx)hdx4.cen()) {
            n += this.b(hdx2, hdx4);
        }
        return n;
    }

    private int c(hdx hdx2, hdx hdx3) {
        if (hdx3.ceu() && this.b(hdx3) != null && this.cbP().kck.b(hdx3) == null) {
            this.knZ.d(hdx3, hdx2, null);
            return 1;
        }
        return 0;
    }

    private final hea b(hdx hdx2) {
        Collection<hdu> collection = this.cbP().kci.cof().cfh();
        Collection<hea> collection2 = lin.a(collection, hea.class);
        for (hea hea2 : collection2) {
            if (!hea2.kaW.c(hdx2)) continue;
            return hea2;
        }
        return null;
    }

    private void mU(boolean bl) {
        this.cbP().kck.kyz.cfa().a(bl, this.kmr);
        this.knY.cqn().a(bl, this.kmQ);
        this.knY.cvi().a(bl, this.kmR);
        this.knY.jHT.crt().a(bl, this.kmP);
        this.jGH.cwt().cqd().cpI().a(bl, this.kmS);
    }

    static /* synthetic */ boolean a(hgl hgl2) {
        return hgl2.Initialized;
    }

    static /* synthetic */ hea b(hgl hgl2) {
        return hgl2.cju();
    }

    static /* synthetic */ void a(hgl hgl2, hdu hdu2) {
        hgl2.i(hdu2);
    }

    static /* synthetic */ boolean b(hgl hgl2, hdu hdu2) {
        return hgl2.l(hdu2);
    }

    static /* synthetic */ hnu c(hgl hgl2) {
        return hgl2.kmT;
    }

    static /* synthetic */ hnu a(hgl hgl2, hnu hnu2) {
        hgl2.kmT = hnu2;
        return hgl2.kmT;
    }

    static /* synthetic */ hoz.a ciS() {
        return jHL;
    }

    static /* synthetic */ void c(hgl hgl2, hdu hdu2) {
        hgl2.j(hdu2);
    }

    static /* synthetic */ void d(hgl hgl2) {
        hgl2.ciR();
    }

    static /* synthetic */ void e(hgl hgl2) {
        hgl2.layout();
    }

    static /* synthetic */ void f(hgl hgl2) {
        hgl2.ciP();
    }
}

