/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdk
 *  hdm
 *  lcy
 */
import java.util.LinkedList;
import java.util.Set;

public class hcq
extends hoh {
    private static final int jHK = 2;
    private final hoz.a jHL = new hoz.a(lcy.qUR);
    private final hoz.a jHM = new hoz.a(lcy.qUS, true);
    private final hoe.a jHN;
    private final joz jHO;
    private final hqr jHP;
    private final hoq<jos> jHQ;
    private final hpe jHR;
    private final b jHS;
    private final hno jHT;
    private final lbn jHU = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hcq jIe;
        {
            this.jIe = hcq2;
        }

        public final void W() {
            jox<? extends jpf> jox2;
            jos jos2;
            if (!$assertionsDisabled && !hcq.a(this.jIe)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && hcq.b(this.jIe) == null) {
                throw new AssertionError();
            }
            hie hie2 = hcq.c(this.jIe);
            if (!hie2.isCompleted()) {
                jos2 = null;
                jox2 = null;
            } else {
                jox2 = hie2.cmg();
                a a2 = (a)hie2.ccw();
                jos2 = a2.iNw;
            }
            hcq.a(this.jIe, false);
            hcq.a(this.jIe, null);
            if (jox2 == null) {
                return;
            }
            hcq.a(this.jIe, jox2);
            hcq.a(this.jIe, jos2);
            this.jIe.kLu.kAz.b(hcq.d(this.jIe));
        }

        static {
            $assertionsDisabled = !hcq.class.desiredAssertionStatus();
        }
    };
    private final lbn jHV = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hcq jIe;
        {
            this.jIe = hcq2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hcq.a(this.jIe)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && hcq.b(this.jIe) != null) {
                throw new AssertionError();
            }
            hcq.a(this.jIe, hcq.e(this.jIe), hcq.f(this.jIe));
        }

        static {
            $assertionsDisabled = !hcq.class.desiredAssertionStatus();
        }
    };
    private final lbn jHW = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hcq jIe;
        {
            this.jIe = hcq2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hcq.a(this.jIe)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && hcq.g(this.jIe) == null) {
                throw new AssertionError();
            }
            hoz hoz2 = (hoz)hcq.g(this.jIe).csT();
            boolean bl = hoz2.cuF();
            hcq.h((hcq)this.jIe).jZL.ccT().yP(!bl);
            hoz.a a2 = hoz2.coZ();
            if (a2 == hcq.i(this.jIe)) {
                c c2 = (c)hoz2.ccw();
                hcq.j(this.jIe).a(c2.jIk, null);
                hcq.j(this.jIe).a(c2.jIl, c2.jId);
            }
            hcq.b(this.jIe, null);
        }

        static {
            $assertionsDisabled = !hcq.class.desiredAssertionStatus();
        }
    };
    private final lbp jHX = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hcq jIe;
        {
            this.jIe = hcq2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hcq.a(this.jIe)) {
                throw new AssertionError();
            }
            int n = hcq.k(this.jIe).csE();
            if (n == -1) {
                return true;
            }
            jos jos2 = hcq.l(this.jIe).LP(n);
            hcq.j(this.jIe).a(jos2, null);
            return true;
        }

        static {
            $assertionsDisabled = !hcq.class.desiredAssertionStatus();
        }
    };
    private final lbn jHY = new lbn(this){
        final /* synthetic */ hcq jIe;
        {
            this.jIe = hcq2;
        }

        public final void W() {
            if (!this.jIe.kLu.csc() && hcq.m(this.jIe)) {
                hcq.b(this.jIe, false);
                hcq.n(this.jIe);
            }
        }
    };
    private final lbn jHZ = new lbn(this){
        final /* synthetic */ hcq jIe;
        {
            this.jIe = hcq2;
        }

        public final void W() {
            hcq.b(this.jIe, false);
            if (this.jIe.kLu.csc()) {
                hcq.b(this.jIe, true);
                return;
            }
            hcq.n(this.jIe);
        }
    };
    private boolean Initialized;
    private hnu jIa;
    private hnu jIb;
    private boolean jIc;
    private jox<? extends jpf> jId;
    private jos iNw;

    public hcq(hdm hdm2, String string, lgg lgg2, lhf lhf2, joz joz2, jow jow2, lbn lbn2) {
        this(hdm2, string, lgg2, lhf2, hdm2.kmY, joz2, jow2, lbn2, lcy.qZy.esy());
    }

    private hcq(hdm hdm2, String string, lgg lgg2, lhf lhf2, hoe.a a2, joz joz2, jow jow2, lbn lbn2, String string2) {
        super((hnc)hdm2, string, lgg2, lhf2, a2, true, true, true, true, lbn2, string2);
        hml hml2 = new hml(this, joz2, false);
        this.a(hml2);
        this.jHO = (joz)hml2.cqe();
        this.jHN = a2;
        this.jHS = new b(this.jHO, jow2);
        this.jHT = new hno(this.jHS.p(ldb.rep));
        this.jHR = new hpe(this.kLu, null, lgg.rlI, lhf.rnv, hdm2.kIZ, lcy.qZx.esy());
        this.j(this.jHR);
        this.jHP = new hqr(this.kLu, (String)null, lgg.rlI, lhf.rnv, hdm2.kJZ);
        this.j(this.jHP);
        this.jHQ = new hoq<jos>(this.kLu, null, lgg.rlI, lhf.rnv, hdm2.kKz, new hoq.c[]{hdm2.kKE, hdm2.kKE}, new int[]{230, 300}, this.jHS, this.jHT);
        this.jHP.cwt().cqd().a(this.jHQ);
        this.ccm();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.jHQ.refresh();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        if (this.jIa != null) {
            this.ccj();
        }
        if (this.jIb != null) {
            this.cck();
        }
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ccc() {
        assert (this.Initialized);
        int n = this.jHQ.cuh();
        if (n != -1) {
            jos jos2 = this.jHS.LP(n);
            LinkedList<hnt> linkedList = new LinkedList<hnt>();
            linkedList.add(new hnt(this.cbO().kKo, jos2.awO().esy()));
            linkedList.add(new hnt(this.cbO().jGV, jos2.awP().esy()));
            lip lip2 = jos2.nKR == null ? lcy.qRt : this.c(jos2);
            lfb lfb2 = lcy.rbj;
            linkedList.add(new hnt(this.cbO().jGU, lfb2.a(lip2).esy()));
            this.kLu.a(null, linkedList);
            return;
        }
        super.ccc();
    }

    @Override
    protected void ccd() {
        super.ccd();
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        this.ccm();
    }

    @Override
    protected boolean a(int n, boolean bl, Set<jpn> set) {
        assert (this.Initialized);
        if (super.a(n, bl, set)) {
            return true;
        }
        return this.jHP.b(n, bl, set);
    }

    private hdm cbO() {
        return (hdm)this.kLu;
    }

    private void a(jos jos2) {
        assert (this.Initialized);
        assert (this.jIa == null);
        hnu.f f2 = this.cbO().kKL;
        lhf lhf2 = this.ccl().jPn.p(f2.kPT.ctr());
        this.jIa = new hnu(this.kLu, (String)null, this.kLu.kND.cqE().l(lhf2), lhf2, f2, new hnu.b[0]);
        this.jIa.w(this.b(jos2));
        this.kLu.a("Binding Prompt", (hms)this.jIa);
        this.jIa.cqV();
        this.nc(true);
    }

    private void nc(boolean bl) {
        hie hie2 = (hie)this.jIa.csT();
        hie2.cql().a(bl, this.jHU);
    }

    private void a(jox<? extends jpf> jox2, jos jos2) {
        assert (jox2 != null);
        assert (jos2 != null);
        jos jos3 = this.jHO.b(jox2);
        if (jos3 == jos2) {
            return;
        }
        if (jos3 != null) {
            if (this.cbO().jZL.ccT().getValue()) {
                this.a(jox2, jos3, jos2);
                return;
            }
            this.jHO.a(jos3, null);
        }
        this.jHO.a(jos2, jox2);
    }

    private void a(jox<? extends jpf> jox2, jos jos2, jos jos3) {
        this.jIb = this.cbO().a(lcy.rbi.a(jox2.awO(), jos2.awO(), jos3.awO()).esy(), null, new hoz.a[]{this.jHL, this.jHM}, lcy.qVb.esy(), !this.cbO().jZL.ccT().getValue(), (Object)new c(jox2, jos2, jos3), this.jHL, this.jHM, this.jHW);
    }

    private hie cci() {
        assert (this.Initialized);
        assert (this.jIa != null);
        return (hie)this.jIa.csT();
    }

    private void ccj() {
        assert (this.Initialized);
        assert (this.jIa != null);
        this.kLu.t(this.jIa);
        assert (this.jIa == null);
    }

    private void cck() {
        assert (this.Initialized);
        assert (this.jIb != null);
        this.kLu.t(this.jIb);
        assert (this.jIb == null);
    }

    private hec cbP() {
        return this.cbO().cbP();
    }

    protected final hdk ccl() {
        return this.cbO().jXk;
    }

    private hie b(jos jos2) {
        lip lip2 = jos2.awO();
        if (jos2 instanceof jov) {
            return new hig(this.kLu, null, lgg.rlI, this.ccl().jPn, this.cbO().jXz, lcy.rba.a(lip2), new a(jos2));
        }
        if (jos2 instanceof jou) {
            return new hif(this.kLu, null, lgg.rlI, this.ccl().jPn, this.cbO().jXz, lcy.rbb.a(lip2), new a(jos2));
        }
        assert (false);
        return null;
    }

    private lip c(jos jos2) {
        jox<jpf> jox2;
        jpj jpj2 = this.jHO.dPg().iNU;
        try {
            jox2 = jox.a(jos2.nKR, jpj2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return ljg.roH;
        }
        return jox2.awO();
    }

    private void ccm() {
        int n = this.getWidth() - this.jHN.krh.kRX.cf * 2;
        int n2 = this.jHN.krh.kRX.cf;
        int n3 = this.jHN.krh.kRX.cg;
        this.jHR.j(new lgs(n2, n3, n, 64));
        n3 += this.jHR.getHeight();
        int n4 = this.getHeight() - ((n3 += this.jHN.krh.kRY.cg) + this.ctP());
        this.jHP.j(new lgs(n2, n3, n, n4));
        n3 += n4;
        n3 += this.jHN.krh.kRY.cg;
    }

    private void ccn() {
        int n = this.jHQ.cuh();
        if (n != -1) {
            jos jos2 = this.jHS.LP(n);
            this.a(jos2);
        }
    }

    private void mU(boolean bl) {
        this.a(bl, this.jHX, 46, jpn.nLm);
        this.kLu.cqo().a(bl, this.jHY);
        this.jHQ.cuc().a(bl, this.jHZ);
    }

    static /* synthetic */ boolean a(hcq hcq2) {
        return hcq2.Initialized;
    }

    static /* synthetic */ hnu b(hcq hcq2) {
        return hcq2.jIa;
    }

    static /* synthetic */ hie c(hcq hcq2) {
        return hcq2.cci();
    }

    static /* synthetic */ void a(hcq hcq2, boolean bl) {
        hcq2.nc(bl);
    }

    static /* synthetic */ hnu a(hcq hcq2, hnu hnu2) {
        hcq2.jIa = hnu2;
        return hcq2.jIa;
    }

    static /* synthetic */ jox a(hcq hcq2, jox jox2) {
        hcq2.jId = jox2;
        return hcq2.jId;
    }

    static /* synthetic */ jos a(hcq hcq2, jos jos2) {
        hcq2.iNw = jos2;
        return hcq2.iNw;
    }

    static /* synthetic */ lbn d(hcq hcq2) {
        return hcq2.jHV;
    }

    static /* synthetic */ jox e(hcq hcq2) {
        return hcq2.jId;
    }

    static /* synthetic */ jos f(hcq hcq2) {
        return hcq2.iNw;
    }

    static /* synthetic */ void a(hcq hcq2, jox jox2, jos jos2) {
        hcq2.a(jox2, jos2);
    }

    static /* synthetic */ hnu g(hcq hcq2) {
        return hcq2.jIb;
    }

    static /* synthetic */ hdm h(hcq hcq2) {
        return hcq2.cbO();
    }

    static /* synthetic */ hoz.a i(hcq hcq2) {
        return hcq2.jHL;
    }

    static /* synthetic */ joz j(hcq hcq2) {
        return hcq2.jHO;
    }

    static /* synthetic */ hnu b(hcq hcq2, hnu hnu2) {
        hcq2.jIb = hnu2;
        return hcq2.jIb;
    }

    static /* synthetic */ hno k(hcq hcq2) {
        return hcq2.jHT;
    }

    static /* synthetic */ b l(hcq hcq2) {
        return hcq2.jHS;
    }

    static /* synthetic */ boolean m(hcq hcq2) {
        return hcq2.jIc;
    }

    static /* synthetic */ boolean b(hcq hcq2, boolean bl) {
        hcq2.jIc = bl;
        return hcq2.jIc;
    }

    static /* synthetic */ void n(hcq hcq2) {
        hcq2.ccn();
    }
}

