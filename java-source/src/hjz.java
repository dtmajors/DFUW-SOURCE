/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class hjz {
    public static final lfo ct = hbe.jAM;
    private final lha<dxq, dxq> cdh;
    private final hjr kcj;
    private final ldl kBo = new ldl();
    private final ldl kBp = new ldl();
    private final lbi<gxj> kBq = new lbi<gxj>(this){
        final /* synthetic */ hjz kBB;
        {
            this.kBB = hjz2;
        }

        public void a(gxj gxj2) {
            if (gxj2.fFl == null) {
                return;
            }
            hjz.a(this.kBB, gxj2.fFl, gxj2.fEX, gxj2.jtk, gxj2.jtl, gxj2.jtm, gxj2.jti, gxj2.jtp, gxj2.jtq, gxj2.jtr, gxj2.jtn);
        }

        public /* synthetic */ void m(Object object) {
            this.a((gxj)object);
        }
    };
    private final lbi<gxl> kBr = new lbi<gxl>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hjz kBB;
        {
            this.kBB = hjz2;
        }

        public void a(gxl gxl2) {
            if (!$assertionsDisabled && hjz.a(this.kBB) == null) {
                throw new AssertionError();
            }
            hjz.a(this.kBB, gxl2.fFg);
            hjz.b(this.kBB, gxl2.fFd);
            hjz.c(this.kBB, gxl2.fFf);
            hjz.a(this.kBB, gxl2.jts);
            hjz.b(this.kBB, gxl2.bih);
            hjz.b(this.kBB).enp();
        }

        public /* synthetic */ void m(Object object) {
            this.a((gxl)object);
        }

        static {
            $assertionsDisabled = !hjz.class.desiredAssertionStatus();
        }
    };
    private hee kBs;
    private heg kBt;
    private hee kBu;
    private heg kBv;
    private ldv fFl;
    private boolean kBw;
    private boolean kBx;
    private boolean kBy;
    private float kBz;
    private float kdN;
    private lip kBA;

    private void a(ldv ldv2, String string, ldv ldv3, bqm.b b2, bqm.b b3, ldv ldv4, ldv ldv5, bqm.b b4, bqm.b b5, ldv ldv6) {
        if (this.fFl != null) {
            this.coS();
        }
        this.fFl = ldv2;
        this.kBA = new ljg(string);
        this.coR();
        hdz hdz2 = this.kcj.kaV.a(ldv3, hel.a.kem);
        hdz hdz3 = this.kcj.kaV.a(lcr.qCJ, hel.a.ken);
        this.kBt = new heg(null, this.cdh, this.kcj, hdz2, hdz3, b2, null, "Trading_Own");
        this.kBs = new hee(null, this.cdh, this.kcj, this.kBt, hdz2, hdz2, b3, null, true);
        hdz hdz4 = this.kcj.kaV.a(ldv4, hel.a.kem);
        this.kBs.c(hdz4);
        hdz2 = this.kcj.kaV.a(ldv5, hel.a.kem);
        hdz3 = this.kcj.kaV.a(lcr.qCK, hel.a.ken);
        this.kBv = new heg(null, this.cdh, this.kcj, hdz2, hdz3, b4, null, "Trading_Other");
        this.kBu = new hee(null, this.cdh, this.kcj, this.kBv, hdz2, hdz2, b5, null, true);
        hdz4 = this.kcj.kaV.a(ldv6, hel.a.kem);
        this.kBu.c(hdz4);
        lin.a(true, this.cdh, this.fFl, 1, hec.b.kdt.ordinal());
        this.kBo.enp();
    }

    public hjz(lha<dxq, dxq> lha2, hjr hjr2) {
        this.cdh = lha2;
        this.kcj = hjr2;
        this.mU(true);
    }

    public void dispose() {
        this.mU(false);
        assert (this.kBo.isEmpty());
        assert (this.kBp.isEmpty());
    }

    public final lbl<lbn> coG() {
        return this.kBo;
    }

    public final lbl<lbn> coH() {
        return this.kBp;
    }

    public final boolean coI() {
        return this.fFl != null;
    }

    public final boolean i(hee hee2) {
        return hee2 == this.kBs || hee2 == this.kBu;
    }

    public final hee coJ() {
        if (this.fFl == null) {
            return null;
        }
        return this.kBs;
    }

    public final boolean coK() {
        return this.kBx;
    }

    public final void nN(boolean bl) {
        this.cdh.rnh.m(gxm.c(this.cdh.rng, this.fFl, bl));
    }

    public final hee coL() {
        if (this.fFl == null) {
            return null;
        }
        return this.kBu;
    }

    public final boolean coM() {
        return this.kBy;
    }

    public final boolean coN() {
        return this.kBw;
    }

    public final float coO() {
        return this.kBz;
    }

    public final float cfj() {
        return this.kdN;
    }

    public final lip coP() {
        return this.kBA;
    }

    public final void coQ() {
        assert (this.fFl != null);
        this.cdh.rnh.m(gbc.m(this.cdh.rng, this.fFl));
    }

    public final boolean d(gbb gbb2) {
        if (this.fFl == null) {
            return false;
        }
        if (!gbb2.aO().equals(this.fFl)) {
            return false;
        }
        this.coS();
        return true;
    }

    public final void coR() {
        this.cdh.rnh.m(gxk.q(this.cdh.rng, this.fFl));
    }

    private void coS() {
        this.cdh.rnh.m(fvv.e(this.cdh.rng, this.fFl, 1));
        this.fFl = null;
        this.kBo.enp();
        this.kBs.cfe();
        this.kBs.dispose();
        this.kBs = null;
        this.kBt.dispose();
        this.kBt = null;
        this.kBu.cfg();
        this.kBu.dispose();
        this.kBu = null;
        this.kBv.dispose();
        this.kBv = null;
    }

    private void mU(boolean bl) {
        this.cdh.rex.a(bl, gxj.class, this.kBq);
        this.cdh.rex.a(bl, gxl.class, this.kBr);
    }

    static /* synthetic */ void a(hjz hjz2, ldv ldv2, String string, ldv ldv3, bqm.b b2, bqm.b b3, ldv ldv4, ldv ldv5, bqm.b b4, bqm.b b5, ldv ldv6) {
        hjz2.a(ldv2, string, ldv3, b2, b3, ldv4, ldv5, b4, b5, ldv6);
    }

    static /* synthetic */ ldv a(hjz hjz2) {
        return hjz2.fFl;
    }

    static /* synthetic */ boolean a(hjz hjz2, boolean bl) {
        hjz2.kBw = bl;
        return hjz2.kBw;
    }

    static /* synthetic */ boolean b(hjz hjz2, boolean bl) {
        hjz2.kBx = bl;
        return hjz2.kBx;
    }

    static /* synthetic */ boolean c(hjz hjz2, boolean bl) {
        hjz2.kBy = bl;
        return hjz2.kBy;
    }

    static /* synthetic */ float a(hjz hjz2, float f2) {
        hjz2.kBz = f2;
        return hjz2.kBz;
    }

    static /* synthetic */ float b(hjz hjz2, float f2) {
        hjz2.kdN = f2;
        return hjz2.kdN;
    }

    static /* synthetic */ ldl b(hjz hjz2) {
        return hjz2.kBp;
    }
}

