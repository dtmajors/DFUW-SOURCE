/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public abstract class hsg {
    public static final hbe jzX = hbe.jAM;
    public final lbh kAz;
    public final lic kNg;
    public final ldv dbx;
    public final lbd jWH;
    public final jpj jWW;
    public final hrx jWK;
    public final lha<dxq, dxq> cdh;
    public final lha<kgz, kgh> jWJ;
    public final jom kzI;
    private final ldv fbk;
    private final lbi<kgt> lbt = new lbi<kgt>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hsg lbC;
        {
            this.lbC = hsg2;
        }

        public void b(kgt kgt2) {
            if (!$assertionsDisabled && !hsg.a(this.lbC)) {
                throw new AssertionError();
            }
            if (kgt2.dRw().equals(hsg.b(this.lbC))) {
                boolean bl = !kgt2.dYZ();
                lgs lgs2 = new lgs(kgt2.dYW(), kgt2.dYY(), kgt2.dYX() - kgt2.dYW(), kgt2.dYV() - kgt2.dYY());
                this.lbC.a(bl, lgs2);
            }
        }

        public /* synthetic */ void m(Object object) {
            this.b((kgt)object);
        }

        static {
            $assertionsDisabled = !hsg.class.desiredAssertionStatus();
        }
    };
    private final lbi<fji> lbu = new lbi<fji>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hsg lbC;
        {
            this.lbC = hsg2;
        }

        public void a(fji fji2) {
            if (!$assertionsDisabled && !hsg.a(this.lbC)) {
                throw new AssertionError();
            }
            if (hsg.c(this.lbC) != null) {
                hsg.c(this.lbC).m(fji2.iNH);
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((fji)object);
        }

        static {
            $assertionsDisabled = !hsg.class.desiredAssertionStatus();
        }
    };
    public final lbt<jpp> lbv = new lbt<jpp>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hsg lbC;
        {
            this.lbC = hsg2;
        }

        public final void a(boolean bl, lbi<jpp> lbi2) {
            if (!$assertionsDisabled && !hsg.a(this.lbC)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && lbi2 == null) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && hsg.c(this.lbC) != (bl ? null : lbi2)) {
                throw new AssertionError();
            }
            if (bl) {
                hsg.a(this.lbC, lbi2);
            } else {
                hsg.a(this.lbC, null);
            }
        }

        static {
            $assertionsDisabled = !hsg.class.desiredAssertionStatus();
        }
    };
    private final lbi<fjk> lbw = new lbi<fjk>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hsg lbC;
        {
            this.lbC = hsg2;
        }

        public final void a(fjk fjk2) {
            if (fjk2.iNI < 0 || fjk2.iNI > 3) {
                if (!$assertionsDisabled) {
                    throw new AssertionError();
                }
                hsg.a(this.lbC, 0.0);
            } else {
                hsg.a(this.lbC, (float)(1 + fjk2.iNI) * 0.25f);
                if (!($assertionsDisabled || hsg.d(this.lbC) >= 0.25 && hsg.d(this.lbC) <= 1.0)) {
                    throw new AssertionError((Object)(fjk2.iNI + " -> " + hsg.d(this.lbC)));
                }
            }
            if (fjk2.iNJ < 0 || fjk2.iNJ > 31) {
                if (!$assertionsDisabled) {
                    throw new AssertionError();
                }
                hsg.b(this.lbC, 0.0);
            } else {
                hsg.b(this.lbC, (31.0f - (float)fjk2.iNJ) / 31.0f * 0.37f + 0.03f);
                if (!($assertionsDisabled || hsg.e(this.lbC) >= (double)0.03f && hsg.e(this.lbC) <= (double)0.4f)) {
                    throw new AssertionError((Object)(fjk2.iNJ + " -> " + hsg.e(this.lbC)));
                }
            }
            hsg.c(this.lbC, (double)fjk2.iNO / 1000.0);
            hsg.a(this.lbC, fjk2.iNK);
        }

        public /* synthetic */ void m(Object object) {
            this.a((fjk)object);
        }

        static {
            $assertionsDisabled = !hsg.class.desiredAssertionStatus();
        }
    };
    public final hmd kNh = new hmd(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hsg lbC;
        {
            this.lbC = hsg2;
        }

        public final double cpW() {
            if (!$assertionsDisabled && !hsg.a(this.lbC)) {
                throw new AssertionError();
            }
            return hsg.d(this.lbC);
        }

        public final double cpX() {
            if (!$assertionsDisabled && !hsg.a(this.lbC)) {
                throw new AssertionError();
            }
            return hsg.e(this.lbC);
        }

        static {
            $assertionsDisabled = !hsg.class.desiredAssertionStatus();
        }
    };
    private boolean jLT;
    private lbi<jpp> lbx;
    private double lby = 0.25;
    private double lbz = 0.033;
    private int lbA;
    private double lbB;

    public hsg(ldv ldv2, lbd lbd2, lbh lbh2, jpj jpj2, hrx hrx2, jom jom2, lha<dxq, dxq> lha2, lha<kgz, kgh> lha3) {
        this.kAz = lbh2;
        this.dbx = ldv2;
        this.jWH = lbd2;
        this.jWW = jpj2;
        this.kzI = jom2;
        this.jWK = hrx2;
        this.cdh = lha2;
        this.jWJ = lha3;
        this.kNg = new lic(lbh2);
        this.fbk = this.jWH.caL();
        this.jLT = true;
        this.mU(true);
        this.cdh.rnh.m(fjj.g(this.cdh.rng, lcr.qAD));
        this.jWK.c(null);
    }

    public final void dispose() {
        assert (this.jLT);
        this.cbg();
        assert (!this.jLT);
    }

    public final void c(lcu lcu2) {
        assert (this.jLT);
        this.jWK.c(lcu2);
    }

    public final double csa() {
        assert (this.jLT);
        return this.lbB;
    }

    public final int csb() {
        assert (this.jLT);
        return this.lbA;
    }

    public final void ot(boolean bl) {
        assert (this.jLT);
        this.jWK.ot(bl);
    }

    public final void ou(boolean bl) {
        assert (this.jLT);
        this.jWK.ou(bl);
    }

    public final boolean cwQ() {
        assert (this.jLT);
        return this.jWK.cwQ();
    }

    public final void ov(boolean bl) {
        assert (this.jLT);
        this.jWK.ov(bl);
    }

    public final void a(lhi lhi2) {
        assert (this.jLT);
        if (lhi2 == lhi.rnE) {
            return;
        }
    }

    protected void cbg() {
        assert (this.jLT);
        this.mU(false);
        this.jWH.qR(this.fbk);
        this.kNg.dispose();
        this.jLT = false;
    }

    private void oF(boolean bl) {
        kfz kfz2 = new kfz();
        kfz2.WI(bl ? 1 : 2);
        kfz2.tr(this.jWH.caL());
        kfz2.sy(this.fbk);
        this.jWJ.rnh.m(kfz2);
    }

    protected void a(boolean bl, lgs lgs2) {
    }

    protected final boolean isConstructed() {
        return this.jLT;
    }

    private void mU(boolean bl) {
        this.oF(bl);
        this.jWJ.rex.a(bl, kgt.class, this.lbt);
        this.cdh.rex.a(bl, fji.class, this.lbu);
        this.cdh.rex.a(bl, fjk.class, this.lbw);
    }

    static /* synthetic */ boolean a(hsg hsg2) {
        return hsg2.jLT;
    }

    static /* synthetic */ ldv b(hsg hsg2) {
        return hsg2.fbk;
    }

    static /* synthetic */ lbi c(hsg hsg2) {
        return hsg2.lbx;
    }

    static /* synthetic */ lbi a(hsg hsg2, lbi lbi2) {
        hsg2.lbx = lbi2;
        return hsg2.lbx;
    }

    static /* synthetic */ double a(hsg hsg2, double d2) {
        hsg2.lby = d2;
        return hsg2.lby;
    }

    static /* synthetic */ double d(hsg hsg2) {
        return hsg2.lby;
    }

    static /* synthetic */ double b(hsg hsg2, double d2) {
        hsg2.lbz = d2;
        return hsg2.lbz;
    }

    static /* synthetic */ double e(hsg hsg2) {
        return hsg2.lbz;
    }

    static /* synthetic */ double c(hsg hsg2, double d2) {
        hsg2.lbB = d2;
        return hsg2.lbB;
    }

    static /* synthetic */ int a(hsg hsg2, int n) {
        hsg2.lbA = n;
        return hsg2.lbA;
    }
}

