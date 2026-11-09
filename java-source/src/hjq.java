/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class hjq {
    public static final lfo ct = hbe.jAM;
    private final lha<dxq, dxq> cdh;
    private final hjr kcj;
    private final hjh kck;
    private final ldl kAe = new ldl();
    private final lbi<fjw> kAf = new lbi<fjw>(this){
        final /* synthetic */ hjq kAp;
        {
            this.kAp = hjq2;
        }

        public void a(fjw fjw2) {
            this.kAp.a(fjw2.aO(), fjw2.iOk, fjw2.iOj, fjw2.iOm, fjw2.iOl, fjw2.iOn, fjw2.iOo, fjw2.iOp, fjw2.iOq, fjw2.iOr, fjw2.dxF, fjw2.dAu);
        }

        public /* synthetic */ void m(Object object) {
            this.a((fjw)object);
        }
    };
    private final lbi<fka> kAg = new lbi<fka>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hjq kAp;
        {
            this.kAp = hjq2;
        }

        public void a(fka fka2) {
            if (!$assertionsDisabled && !lda.by(fka2)) {
                throw new AssertionError();
            }
            this.kAp.deactivate();
        }

        public /* synthetic */ void m(Object object) {
            this.a((fka)object);
        }

        static {
            $assertionsDisabled = !hjq.class.desiredAssertionStatus();
        }
    };
    private hee kAh;
    private heg kAi;
    private hee kAj;
    private ldv kAk;
    private ldv kAl;
    private ldv kAm;
    private ldv iOm;
    private ldv iOl;
    private ldv iOn;
    private ldv iOo;
    private ldv iOp;
    private ldv iOq;
    private boolean kAn;
    private hjv kAo;

    public void a(lbi<ghy> lbi2, boolean bl) {
        this.cdh.rex.a(bl, ghy.class, lbi2);
    }

    public hjq(lha<dxq, dxq> lha2, hjr hjr2, hjh hjh2) {
        this.cdh = lha2;
        this.kcj = hjr2;
        this.kck = hjh2;
        this.mU(true);
    }

    public void dispose() {
        if (this.kAk != null) {
            this.deactivate();
        }
        this.mU(false);
        assert (this.kAe.isEmpty());
        if (this.kAh != null && this.kAh.kdQ != null) {
            this.kAh.kdQ.cc(false);
            this.kAh.kdQ = null;
            this.kAh = null;
        }
    }

    public final lbl<lbn> cnV() {
        return this.kAe;
    }

    public final void cnW() {
        assert (this.isActive());
        this.cdh.rnh.m(fkb.j(this.cdh.rng, this.kAk));
    }

    public final void cnX() {
        if (this.kAo == null) {
            return;
        }
        this.kAo.cow();
    }

    public final void qY(ldv ldv2) {
        fku fku2 = fku.b(this.cdh.rng);
        fku2.iOY = ldv2;
        fku2.on(this.iOl);
        this.cdh.rnh.m(fku2);
    }

    public final boolean isActive() {
        return this.kAk != null;
    }

    public final ldv cnY() {
        return this.kAl;
    }

    public final ldv cnZ() {
        return this.kAm;
    }

    public final ldv coa() {
        return this.iOn;
    }

    public ldv cob() {
        return this.iOo;
    }

    public ldv coc() {
        return this.iOp;
    }

    public final ldv cod() {
        return this.iOm;
    }

    public final ldv coe() {
        return this.iOl;
    }

    public final hee cof() {
        return this.kAj;
    }

    public final hee cog() {
        return this.kAh;
    }

    public final hjv coh() {
        return this.kAo;
    }

    public final void a(ldv ldv2, ldv ldv3, ldv ldv4, ldv ldv5, ldv ldv6, ldv ldv7, ldv ldv8, ldv ldv9, ldv ldv10, boolean bl, ldv ldv11, ldv ldv12) {
        hdz hdz2;
        if (ldv2 == null) {
            return;
        }
        if (this.kAk != null) {
            this.deactivate();
        }
        this.kcj.ra(ldv12);
        this.kAk = ldv2;
        this.kAl = ldv3;
        this.kAm = ldv4;
        this.iOm = ldv5;
        this.iOl = ldv6;
        this.iOn = ldv7;
        this.iOo = ldv8;
        this.iOp = ldv9;
        this.iOq = ldv10;
        this.kAn = bl;
        if (ldv11 != null) {
            hdz2 = this.kcj.kaV.a(ldv11, hel.a.kem);
            this.kAh = new hee(null, this.cdh, this.kcj, this.kck.kyz, hdz2, hdz2, bqm.b.dEO, null, true);
            this.kAh.cfd();
        }
        if (ldv12 != null) {
            hdz2 = this.kcj.kaV.a(ldv12, hel.a.ken);
            hdz hdz3 = this.kcj.kaV.a(lcr.qCH, hel.a.ken);
            this.kAi = new heg(null, this.cdh, this.kcj, hdz2, hdz3, bqm.b.dEK, null, "Vendor");
            hdz2 = this.kcj.kaV.a(ldv12, hel.a.kel);
            this.kAj = new hee(null, this.cdh, this.kcj, this.kAi, hdz2, hdz2, bqm.b.dEm, null, true);
            this.kAj.c(this.kAj.kdD);
        }
        if (this.iOl != null) {
            this.kAo = new hjv(this.iOl, this.cdh, hec.b.kdq.ordinal());
        }
        this.kAe.enp();
    }

    public final void deactivate() {
        if (this.kAk == null) {
            return;
        }
        this.kcj.ra(null);
        this.kAk = null;
        this.kAe.enp();
        if (this.kAj != null) {
            if (this.kAj.isActive()) {
                this.kAj.cfg();
            }
            this.kAj.dispose();
            this.kAj = null;
        }
        if (this.kAi != null) {
            this.kAi.dispose();
            this.kAi = null;
        }
        if (this.kAh != null) {
            this.kAh.cfe();
        }
        if (this.kAo != null) {
            this.kAo.dispose();
            this.kAo = null;
        }
        this.kAl = null;
        this.kAm = null;
        this.iOl = null;
        this.iOn = null;
        this.iOo = null;
        this.iOp = null;
        this.iOq = null;
        this.kAn = false;
    }

    private void mU(boolean bl) {
        this.cdh.rex.a(bl, fjw.class, this.kAf);
        this.cdh.rex.a(bl, fka.class, this.kAg);
    }

    public ldv coi() {
        return this.iOq;
    }

    public void qZ(ldv ldv2) {
        this.iOq = ldv2;
    }

    public boolean coj() {
        return this.kAn;
    }

    public void nM(boolean bl) {
        this.kAn = bl;
    }
}

