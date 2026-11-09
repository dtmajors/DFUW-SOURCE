/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
import java.util.LinkedList;

public class hep
extends hen
implements lbr {
    private final hov kfi;
    private final hpa kfj;
    private final hpx kfk;
    private final hpx kfl;
    private final hqz kfm;
    private final hqz kfn;
    private final hmt kfo;
    private final hfw kfp;
    private final lnt kfq;
    private final hfx kfr;
    public final lnm.a<a> kfs = new lnm.a<a>(a.class);
    private final lnm<a> kft = this.kfs.evV();
    private final lnm<a> kfu = this.kfs.evV();
    private final lbn kfv = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hep kfD;
        {
            this.kfD = hep2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hep.a(this.kfD)) {
                throw new AssertionError();
            }
            a a2 = hep.b(this.kfD).evQ() == a.kfF ? a.kfG : a.kfF;
            hep.a(this.kfD, a2, true);
        }

        static {
            $assertionsDisabled = !hep.class.desiredAssertionStatus();
        }
    };
    private final lbn kfw = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hep kfD;
        {
            this.kfD = hep2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hep.a(this.kfD)) {
                throw new AssertionError();
            }
            a a2 = hep.b(this.kfD).evQ() == a.kfF ? a.kfH : a.kfF;
            hep.a(this.kfD, a2, true);
        }

        static {
            $assertionsDisabled = !hep.class.desiredAssertionStatus();
        }
    };
    private final lbn kfx = new lbn(this){
        final /* synthetic */ hep kfD;
        {
            this.kfD = hep2;
        }

        public final void W() {
            hep.a(this.kfD, -1);
        }
    };
    private final lbn kfy = new lbn(this){
        final /* synthetic */ hep kfD;
        {
            this.kfD = hep2;
        }

        public final void W() {
            hep.a(this.kfD, 1);
        }
    };
    private final lbn kfz = new lbn(this){
        final /* synthetic */ hep kfD;
        {
            this.kfD = hep2;
        }

        public final void W() {
            hep.c(this.kfD);
        }
    };
    private final lbn kfA = new lbn(this){
        final /* synthetic */ hep kfD;
        {
            this.kfD = hep2;
        }

        public final void W() {
            hep.d(this.kfD);
        }
    };
    private final jor kfB = new jor(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hep kfD;
        {
            this.kfD = hep2;
        }

        public final void a(jov jov2, boolean bl) {
            if (!$assertionsDisabled && jov2 != joj.nIP) {
                throw new AssertionError();
            }
            if (bl) {
                hep.e(this.kfD);
            }
        }

        static {
            $assertionsDisabled = !hep.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private hnp kfC;

    public hep(hdm hdm2, String string, lgg lgg2, lbn lbn2) {
        this(hdm2, string, lgg2, hdm2.jXW, lbn2);
    }

    private hep(hdm hdm2, String string, lgg lgg2, hen.f f2, lbn lbn2) {
        super(hdm2, string, lgg2, hep.a(false, f2), f2, new hnu.d(lbn2), new hen.e(true), new hlw.a(true), new hen.c(true));
        assert (hdm2.jXk.jOn.kLY.H == hdm2.jXk.jOo.kLY.H);
        this.kfq = hdm2.cbP().kcm.kzO;
        this.kfu.c(a.kfH);
        this.kft.c(a.kfF);
        this.kfm = new hqz((hnc)hdm2, null, new lgg(0, 17), null, hpx.a.kXm, hdm2.kJH, hdm2.jXk.jOp);
        this.j(this.kfm);
        this.kfn = new hqz((hnc)hdm2, null, new lgg(39, 17), null, hpx.a.kXm, hdm2.kJH, hdm2.jXk.jOq);
        this.j(this.kfn);
        this.kfo = new hmt((hnc)hdm2, null, lgg.rlI, lhf.rnv);
        this.w(this.kfo);
        this.kfp = new hfw(hdm2, null, lgg.rlI);
        this.kfo.j(this.kfp);
        this.kfi = new hov(this.kLu, null, new lgg(7, this.csX().kPT.cto() + hfw.kld.H), hdm2.jXk.jOv.kLY);
        this.j(this.kfi);
        this.kfj = new hpa(this.kLu, (String)null, lgg.rlI, null, hdm2.jXk.jOv);
        this.kfi.j(this.kfj);
        this.kfk = new hqz(this.kLu, null, new lgg(0, 17), null, hpx.a.kXm, hdm2.kJH, hdm2.jXk.jOn);
        this.j(this.kfk);
        this.kfl = new hqz(this.kLu, null, new lgg(27, 17), null, hpx.a.kXm, hdm2.kJH, hdm2.jXk.jOo);
        this.j(this.kfl);
        this.kfr = new hfx(hdm2, null, lgg.rlI);
        this.j(this.kfr);
    }

    private static final lhf a(boolean bl, hen.f f2) {
        int n = bl ? hjo.kzH.rmN : 1;
        hnz.d d2 = f2.keL.kKX.kPT;
        return new lhf(d2.ctn() + hfw.kle.rmN * n + d2.ctp(), d2.cto() + hfw.kld.H + hfw.kle.H * hjo.kzH.H + d2.ctq());
    }

    @Override
    public final boolean a(lfu lfu2) {
        boolean bl = false;
        boolean bl2 = lfu2.a("State", this.kft);
        bl |= bl2;
        if (bl |= lfu2.a("PreviousState", this.kfu)) {
            this.refresh();
        }
        return bl;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.nb(true);
        this.refresh();
        this.kfi.cqF();
        this.kfk.cqF();
        this.kfl.cqF();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.nb(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected lcu cfR() {
        assert (this.Initialized);
        lgg lgg2 = this.cqu();
        hms hms2 = this.a(lgg2, hms.class);
        if (hms2 != null) {
            if (this.a(hms2)) {
                return hms2.cqJ();
            }
            if (hms2 == this.kfk) {
                return hms2.cqJ();
            }
            if (hms2 == this.kfl) {
                return hms2.cqJ();
            }
            if (hms2 == this.kfm) {
                return hms2.cqJ();
            }
            if (hms2 == this.kfn) {
                return hms2.cqJ();
            }
            int n = this.kfk.d(ldb.rep);
            int n2 = n + this.kfk.getHeight();
            if (lgg2.cg >= n && lgg2.cg < n2) {
                return this.kLu.kNw;
            }
            if (hms2 == this.kfo) {
                return hms2.cqJ();
            }
            return this.kLu.kNw;
        }
        return super.cfR();
    }

    @Override
    protected void cbM() {
        assert (this.Initialized);
        lgs lgs2 = new lgs();
        lgs2.cf = this.kfk.d(ldb.reo) + this.kfk.getWidth();
        lgs2.cg = this.kfk.d(ldb.rep);
        lgs2.rmN = this.kfl.d(ldb.reo) - lgs2.cf;
        lgs2.H = this.kfk.getHeight();
        if (lgs2.A(this.cqu())) {
            this.cfI();
            return;
        }
        super.cbM();
    }

    @Override
    protected void ccc() {
        assert (this.Initialized);
        lgg lgg2 = this.cqu();
        if (this.b((hms)this.kfk, lgg2)) {
            lip lip2;
            lip lip3;
            LinkedList<hnt> linkedList = new LinkedList<hnt>();
            linkedList.add(new hnt(this.cbO().jGU, lcy.qYY.esy()));
            jos jos2 = joj.nIl;
            jox<? extends jpf> jox2 = this.cbO().jZx.e(jos2);
            if (jox2 != null) {
                lip3 = jox2.awO();
                lip2 = lcy.rbg.a(lip3);
                linkedList.add(new hnt(this.cbO().jGU, lip2.esy()));
            }
            if ((jox2 = this.cbO().jZx.e(jos2 = joj.nIj)) != null) {
                lip3 = jox2.awO();
                lip2 = lcy.rbh.a(lip3);
                linkedList.add(new hnt(this.cbO().jGU, lip2.esy()));
            }
            this.kLu.a(null, linkedList);
            return;
        }
        if (this.b((hms)this.kfl, lgg2)) {
            lip lip4;
            lip lip5;
            LinkedList<hnt> linkedList = new LinkedList<hnt>();
            linkedList.add(new hnt(this.cbO().jGU, lcy.qYZ.esy()));
            jos jos3 = joj.nIm;
            jox<? extends jpf> jox3 = this.cbO().jZx.e(jos3);
            if (jox3 != null) {
                lip5 = jox3.awO();
                lip4 = lcy.rbg.a(lip5);
                linkedList.add(new hnt(this.cbO().jGU, lip4.esy()));
            }
            if ((jox3 = this.cbO().jZx.e(jos3 = joj.nIj)) != null) {
                lip5 = jox3.awO();
                lip4 = lcy.rbh.a(lip5);
                linkedList.add(new hnt(this.cbO().jGU, lip4.esy()));
            }
            this.kLu.a(null, linkedList);
            return;
        }
        super.ccc();
    }

    @Override
    protected void cfS() {
        super.cfS();
        this.cfU();
    }

    @Override
    protected void cfT() {
        super.cfT();
        this.cqt().a((hms)this, (float)this.kLu.crO());
        this.kfC = null;
        this.refresh();
    }

    @Override
    protected void cce() {
        super.cce();
        this.refresh();
    }

    @Override
    protected boolean co(int n, int n2) {
        if (!super.co(n, n2)) {
            return false;
        }
        lgs lgs2 = this.csU();
        if (n2 < lgs2.cf + lgs2.H + 2) {
            return true;
        }
        n = this.kfr.a((hms)this, ldb.reo, n);
        n2 = this.kfr.a((hms)this, ldb.rep, n2);
        return this.kfr.contains(n, n2);
    }

    private void refresh() {
        boolean bl = this.cfV() != a.kfF;
        this.kfm.a(bl ? this.cbO().jXk.jOr : this.cbO().jXk.jOp);
        this.kfn.a(bl ? this.cbO().jXk.jOs : this.cbO().jXk.jOq);
        int n = this.kfp.c(ldb.reo, this.kfq.getValue());
        int n2 = this.kfp.getWidth() - this.csW().rmN;
        n = Math.min(n, n2);
        this.kfp.a(new lgg(-n, 0), bl ? 0.0f : (float)this.cbO().crO());
        this.kfn.cB(this.getWidth() - this.kfn.getWidth(), this.kfn.cqw().cg);
        this.kfl.cB(this.getWidth() - this.kfl.getWidth(), this.kfl.cqw().cg);
        this.cfU();
    }

    private void a(a a2, boolean bl) {
        if (a2 == this.kft.evQ()) {
            return;
        }
        this.kfu.a(this.kft);
        boolean bl2 = this.kft.c(a2);
        assert (bl2);
        this.nl(bl);
    }

    private void nl(boolean bl) {
        float f2 = bl ? (float)this.kLu.crO() : 0.0f;
        lhf lhf2 = hep.a(this.kft.evQ() != a.kfF, this.keq);
        if (this.kfu.evQ() == a.kfF && this.kft.evQ() == a.kfG || this.kfu.evQ() == a.kfG && this.kft.evQ() == a.kfF) {
            lgg lgg2 = this.cqw();
            this.b(lgg2.cf + (this.getWidth() - lhf2.rmN), lgg2.cg, f2);
        }
        if (this.kfC == null) {
            this.kfC = new hnp(this.kLu.kAz, this);
        }
        this.kfC.b(lhf2, f2);
        this.refresh();
    }

    protected hdm cbO() {
        return (hdm)this.kLu;
    }

    protected hec cbP() {
        return this.cbO().cbP();
    }

    private void Mb(int n) {
        assert (n == 1 || n == -1);
        int n2 = this.kfq.getValue();
        if ((n2 += n) < 0) {
            n2 = hjo.kzH.rmN - 1;
        } else if (n2 >= hjo.kzH.rmN) {
            n2 = 0;
        }
        this.kfq.adI(n2);
    }

    private void cfU() {
        int n;
        switch (this.cfV()) {
            case kfF: {
                n = 0;
                break;
            }
            case kfH: {
                n = 0;
                break;
            }
            case kfG: {
                n = this.getWidth() - this.kfr.getWidth();
                break;
            }
            default: {
                assert (false);
                n = 0;
            }
        }
        int n2 = this.getHeight() - this.keq.keL.kKX.kPT.ctq();
        this.kfr.cB(n, n2);
    }

    private a cfV() {
        if (this.kfC != null && this.kfu.evQ() != a.kfF) {
            return (a)((Object)this.kfu.evQ());
        }
        return (a)((Object)this.kft.evQ());
    }

    private void cfW() {
        if (!this.cbO().cdw() && this.cbO().jZL.cdd().getValue()) {
            this.a(a.kfF, true);
        }
    }

    private void cfX() {
        a a2 = this.kft.evQ() == a.kfF ? (a)((Object)this.kfu.evQ()) : a.kfF;
        this.a(a2, true);
    }

    private void nb(boolean bl) {
        this.kfq.cec().a(bl, this.kfz);
        this.kfm.cvC().a(bl, this.kfv);
        this.kfn.cvC().a(bl, this.kfw);
        this.kfk.cvC().a(bl, this.kfx);
        this.kfl.cvC().a(bl, this.kfy);
        this.cbO().cdu().a(bl, this.kfA);
        this.cbP().kzI.a(bl, joj.nIP, this.kfB);
    }

    static /* synthetic */ boolean a(hep hep2) {
        return hep2.Initialized;
    }

    static /* synthetic */ lnm b(hep hep2) {
        return hep2.kft;
    }

    static /* synthetic */ void a(hep hep2, a a2, boolean bl) {
        hep2.a(a2, bl);
    }

    static /* synthetic */ void a(hep hep2, int n) {
        hep2.Mb(n);
    }

    static /* synthetic */ void c(hep hep2) {
        hep2.refresh();
    }

    static /* synthetic */ void d(hep hep2) {
        hep2.cfW();
    }

    static /* synthetic */ void e(hep hep2) {
        hep2.cfX();
    }
}

