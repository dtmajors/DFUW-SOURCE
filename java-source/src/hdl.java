/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 *  lcy
 */
import java.util.Arrays;

public class hdl {
    public static final hbe jzX = hbe.jAM;
    public final ldv dbx;
    public final lbd jWH;
    public final lha<dxq, dxq> cdh;
    public final lha<miw, mii> jWI;
    public final lha<kgz, kgh> jWJ;
    private final hrx jWK;
    private final hsi jDE;
    private final jqh jWL;
    private final lcm jWM = new lcm();
    private final lbn jWN = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hdl jXb;
        {
            this.jXb = hdl2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hdl.a(this.jXb)) {
                throw new AssertionError();
            }
            hdl.a(this.jXb, true);
            hdl.b(this.jXb);
        }

        static {
            $assertionsDisabled = !hdl.class.desiredAssertionStatus();
        }
    };
    private final lbi<fjp> jWO = new lbi<fjp>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hdl jXb;
        {
            this.jXb = hdl2;
        }

        public void a(fjp fjp2) {
            if (!$assertionsDisabled && !hdl.a(this.jXb)) {
                throw new AssertionError();
            }
            this.jXb.jWW = fjp2.iNU;
            hdl.a(this.jXb, fjp2.iNV);
            hdl.b(this.jXb);
        }

        public /* synthetic */ void m(Object object) {
            this.a((fjp)object);
        }

        static {
            $assertionsDisabled = !hdl.class.desiredAssertionStatus();
        }
    };
    private final lbi<gpr> jWP = new lbi<gpr>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hdl jXb;
        {
            this.jXb = hdl2;
        }

        public void b(gpr gpr2) {
            if (!$assertionsDisabled && !hdl.a(this.jXb)) {
                throw new AssertionError();
            }
            if (gpr2.alW == null) {
                return;
            }
            switch (gpr2.alW.aFG) {
                default: {
                    break;
                }
                case 3: {
                    hdl.b(this.jXb, false);
                    hdl.a(this.jXb, gpr2.alW);
                    hdl.b(this.jXb, true);
                    break;
                }
                case 1: {
                    hdl.a(this.jXb, gpr2.alW);
                    hdl.b(this.jXb, true);
                    break;
                }
                case 2: 
                case 4: {
                    hdl.b(this.jXb, false);
                }
            }
        }

        public /* synthetic */ void m(Object object) {
            this.b((gpr)object);
        }

        static {
            $assertionsDisabled = !hdl.class.desiredAssertionStatus();
        }
    };
    private final lbi<egm> jWQ = new lbi<egm>(this){
        final /* synthetic */ hdl jXb;
        {
            this.jXb = hdl2;
        }

        public void a(egm egm2) {
            hdl.a(this.jXb, egm2.ipz);
            Arrays.sort(hdl.c(this.jXb));
            hdl.b(this.jXb);
        }

        public /* synthetic */ void m(Object object) {
            this.a((egm)object);
        }
    };
    private final jor jWR = new jor(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hdl jXb;
        {
            this.jXb = hdl2;
        }

        public final void a(jov jov2, boolean bl) {
            if (!$assertionsDisabled && !hdl.a(this.jXb)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && jov2 != joj.nId) {
                throw new AssertionError();
            }
            if (bl) {
                boolean bl2 = !hdl.d(this.jXb);
                hdl.c(this.jXb, bl2);
            }
        }

        static {
            $assertionsDisabled = !hdl.class.desiredAssertionStatus();
        }
    };
    private boolean jLT;
    private ldv hC;
    private int SN;
    private ldv gZb;
    private ldv gZe;
    private ldv gZd;
    private ldv jWS;
    private boolean gnL;
    private boolean jWT = true;
    private String[] jWU;
    private hsg jWV;
    public jpj jWW;
    private joz.a jWX;
    private a jWY = a.jXd;
    private boolean jWZ;
    private int jXa;

    public hdl(ldv ldv2, lbd lbd2, lha<dxq, dxq> lha2, lha<miw, mii> lha3, lha<kgz, kgh> lha4, lha<ktl, knt> lha5) {
        assert (lcw.fyl.x < lcw.fym.x);
        assert (lcw.fyl.y < lcw.fym.y);
        assert (lcw.fyl.rlV < lcw.fym.rlV);
        this.dbx = ldv2;
        this.jWH = lbd2;
        this.cdh = lha2;
        this.jWI = lha3;
        this.jWJ = lha4;
        this.jWL = new jqh(lcr.qAD, this.cdh);
        this.jWK = new hrx(this.jWM, this.cdh, this.jWI);
        String string = lcy.qRF.esy();
        if (lcw.enb()) {
            string = string + " (Standalone)";
        }
        this.jWK.setTitle(string);
        this.jDE = new hsi(this.dbx, this.jWH, this.jWM, lha5, "gui/generic_error.dds");
        this.jLT = true;
        this.mU(true);
        this.cdh.rnh.m(gpq.o(this.cdh.rng, lcr.qzp));
    }

    public final void dispose() {
        assert (this.jLT);
        this.a(a.jXd);
        this.jWK.dispose();
        this.jWL.dispose();
        this.mU(false);
        this.jLT = false;
    }

    public final void b(double d2, double d3, int n) {
        assert (this.jLT);
        this.jWM.b(d2, d3, n);
        this.jDE.chi();
    }

    private void ng(boolean bl) {
        if (bl == this.gnL) {
            return;
        }
        this.gnL = bl;
        this.cdo();
    }

    private void nh(boolean bl) {
        if (bl == this.jWT) {
            return;
        }
        this.jWT = bl;
        this.cdp();
    }

    private void cdo() {
        if (this.gnL && this.jWU == null) {
            this.cdh.rnh.m(egl.b(this.cdh.rng, lcr.qCL));
        }
        this.cdq();
    }

    private void cdp() {
        this.cdq();
    }

    private void cdq() {
        a a2 = this.cdr();
        this.a(a2);
    }

    private a cdr() {
        if (!this.jWT) {
            return a.jXd;
        }
        if (this.jWW == null) {
            return a.jXd;
        }
        if (lcw.bn && !this.jWZ) {
            return a.jXf;
        }
        if (this.jWU == null) {
            return a.jXd;
        }
        if (!this.gnL) {
            return a.jXd;
        }
        return a.jXe;
    }

    private void a(a a2) {
        if (a2 == this.jWY) {
            return;
        }
        this.jWY = a2;
        this.cds();
    }

    private void cds() {
        switch (this.jWY) {
            case jXd: {
                assert (this.jWV != null);
                if (this.jWV != null) {
                    this.jWV.dispose();
                }
                this.jWV = null;
                assert (this.cdh.rex.emf() == this.jXa);
                break;
            }
            case jXe: {
                assert (this.jWV == null);
                this.jXa = this.cdh.rex.emf();
                this.jWV = new hec(this.dbx, this.jWH, this.jWM, this.jWW, this.jWX, this.jWK, this.jWL.kzI, this.cdh, this.jWJ, this.jDE, this.hC, this.SN, this.gZb, this.gZe, this.gZd, this.jWS, this.jWU);
                this.cdh.rnh.m(fez.d(this.cdh.rng, lcr.qzp));
                break;
            }
            case jXf: {
                assert (this.jWV == null);
                this.jXa = this.cdh.rex.emf();
                this.jWV = new hbp(this.dbx, this.jWH, this.jWM, this.jWW, this.jWK, this.jWL.kzI, this.cdh, this.jWJ, this.jDE, this.jWN);
                break;
            }
            default: {
                assert (false) : this.jWY;
                break;
            }
        }
    }

    private void c(boolean bl, ldv ldv2, int n) {
        this.cdh.rnh.m(bl ? fpi.c(this.cdh.rng, ldv2, n) : fpl.d(this.cdh.rng, ldv2, n));
    }

    private void i(dsu dsu2) {
        this.hC = dsu2.gYY;
        this.SN = dsu2.SN;
        this.gZb = dsu2.gZb;
        this.gZe = dsu2.gZe;
        this.gZd = dsu2.gZd;
        this.jWS = dsu2.gZc;
    }

    private void mU(boolean bl) {
        this.c(bl, lcr.qzp, 1);
        jom jom2 = this.jWL.kzI;
        jom2.a(bl, joj.nId, this.jWR);
        this.cdh.rex.a(bl, gpr.class, this.jWP);
        this.cdh.rex.a(bl, egm.class, this.jWQ);
        this.cdh.rex.a(bl, fjp.class, this.jWO);
    }

    static /* synthetic */ boolean a(hdl hdl2) {
        return hdl2.jLT;
    }

    static /* synthetic */ boolean a(hdl hdl2, boolean bl) {
        hdl2.jWZ = bl;
        return hdl2.jWZ;
    }

    static /* synthetic */ void b(hdl hdl2) {
        hdl2.cdq();
    }

    static /* synthetic */ joz.a a(hdl hdl2, joz.a a2) {
        hdl2.jWX = a2;
        return hdl2.jWX;
    }

    static /* synthetic */ void b(hdl hdl2, boolean bl) {
        hdl2.ng(bl);
    }

    static /* synthetic */ void a(hdl hdl2, dsu dsu2) {
        hdl2.i(dsu2);
    }

    static /* synthetic */ String[] a(hdl hdl2, String[] stringArray) {
        hdl2.jWU = stringArray;
        return stringArray;
    }

    static /* synthetic */ String[] c(hdl hdl2) {
        return hdl2.jWU;
    }

    static /* synthetic */ boolean d(hdl hdl2) {
        return hdl2.jWT;
    }

    static /* synthetic */ void c(hdl hdl2, boolean bl) {
        hdl2.nh(bl);
    }
}

