/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public class hlq
extends hdj {
    private static bqm.b kDb;
    private static final hoz.a jHL;
    private static final hoz.a jHM;
    private final lbn kDc = new lbn(this){
        final /* synthetic */ hlq kDh;
        {
            this.kDh = hlq2;
        }

        public final void W() {
            if (hlq.a((hlq)this.kDh).jZG.cpS()) {
                hms hms2;
                if (!hlq.b(this.kDh) && (hms2 = hlq.c((hlq)this.kDh).jZG.cpL()) instanceof hgy) {
                    hlq.d(this.kDh);
                }
            } else if (hlq.b(this.kDh)) {
                hlq.e(this.kDh);
            }
        }
    };
    private final lbn kDd = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hlq kDh;
        {
            this.kDh = hlq2;
        }

        public final void W() {
            if (!$assertionsDisabled && hlq.f(this.kDh) == null) {
                throw new AssertionError();
            }
            hoz hoz2 = (hoz)hlq.f(this.kDh).csT();
            a a2 = (a)hoz2.ccw();
            hlq.g((hlq)this.kDh).jZL.ccR().yP(!hoz2.cuF());
            hlq.a(this.kDh, null);
            hoz.a a3 = hoz2.coZ();
            if (a3 == hlq.cpr()) {
                if (a2.kDi.isInitialized()) {
                    a2.kDi.remove();
                }
                hlq.h(this.kDh).cbP().b(a2.kDi.cjV());
            } else {
                hgm hgm2;
                if (a2.kDi.isInitialized()) {
                    a2.kDi.c(a2.kDj);
                    a2.kDi.z(a2.kDk);
                }
                if (a2.kDj instanceof hgm && (hgm2 = (hgm)a2.kDj).isInitialized()) {
                    hgm2.kdT.cff();
                }
            }
        }

        static {
            $assertionsDisabled = !hlq.class.desiredAssertionStatus();
        }
    };
    private final lbn kDe = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hlq kDh;
        {
            this.kDh = hlq2;
        }

        public final void W() {
            if (!$assertionsDisabled && hlq.f(this.kDh) == null) {
                throw new AssertionError();
            }
            hoz hoz2 = (hoz)hlq.f(this.kDh).csT();
            b b2 = (b)hoz2.ccw();
            hlq.i((hlq)this.kDh).jZL.ccR().yP(!hoz2.cuF());
            hlq.a(this.kDh, null);
            hoz.a a2 = hoz2.coZ();
            if (a2 == hlq.cpr()) {
                hlq.j(this.kDh).cbP().a(b2.kdD, b2.kDl, b2.kDm);
            }
        }

        static {
            $assertionsDisabled = !hlq.class.desiredAssertionStatus();
        }
    };
    private hnu kDf;
    private hex kDg;

    public hlq(hdm hdm2) {
        super(hdm2, null, "TRASHBIN", 16, null);
        this.cc(true);
    }

    public boolean a(hgy hgy2, boolean bl) {
        hdz hdz2 = hgy2.cjV();
        hgm hgm2 = (hgm)this.jLM.jZG.cpN();
        hee hee2 = hgm2.cjv();
        if (!hdz2.ceB().a(hee2, null, false)) {
            if (hee2.kdC.kdF != kDb) {
                kDb = hee2.kdC.kdF;
            }
            return false;
        }
        kDb = null;
        if (!bl) {
            if (this.jLM.jZL.ccR().getValue()) {
                hgy2.c(this.jLM.jZG.cpN());
                lip lip2 = lcy.raH.a(hdz2.cdY());
                a a2 = new a(hgy2, this.jLM.jZG.cpN(), this.jLM.jZG.cpO());
                this.kDf = this.jLM.a(lip2.esy(), null, new hoz.a[]{jHL, jHM}, lcy.qVb.esy(), !this.jLM.jZL.ccR().getValue(), (Object)a2, jHL, jHM, this.kDd);
            } else {
                this.jLM.cbP().b(hgy2.cjV());
                hgy2.remove();
            }
        }
        return true;
    }

    public final void b(hdz hdz2, int n, int n2) {
        if (this.jLM.jZL.ccR().getValue()) {
            lip lip2 = lcy.raI.a(hdz2.cdY(), new ljf(n2));
            b b2 = new b(hdz2, n, n2);
            this.kDf = this.jLM.a(lip2.esy(), null, new hoz.a[]{jHL, jHM}, lcy.qVb.esy(), !this.jLM.jZL.ccR().getValue(), (Object)b2, jHL, jHM, this.kDe);
        } else {
            this.jLM.cbP().a(hdz2, n, n2);
        }
    }

    @Override
    protected hen cdl() {
        return null;
    }

    @Override
    protected void cbg() {
        if (this.kDf != null) {
            this.cpn();
        }
        this.cc(false);
        super.cbg();
    }

    private void cpn() {
        this.jLM.t((hms)this.kDf);
        assert (this.kDf == null);
    }

    private void cpo() {
        this.kDg.remove();
        this.kDg = null;
    }

    private void cpp() {
        lhf lhf2 = this.jLM.jXk.jOT.kLY;
        lhf lhf3 = this.jLM.kND.cqv();
        lgg lgg2 = new lgg(lhf3.rmN - lhf2.rmN, lhf3.H - lhf2.H);
        this.kDg = new hex(this.jLM, (String)null, lgg2, lhf2);
        this.jLM.jZH.j(this.kDg);
    }

    private boolean cpq() {
        return this.kDg != null;
    }

    private void cc(boolean bl) {
        this.jLM.jZG.cpT().a(bl, this.kDc);
    }

    static /* synthetic */ hdm a(hlq hlq2) {
        return hlq2.jLM;
    }

    static /* synthetic */ boolean b(hlq hlq2) {
        return hlq2.cpq();
    }

    static /* synthetic */ hdm c(hlq hlq2) {
        return hlq2.jLM;
    }

    static /* synthetic */ void d(hlq hlq2) {
        hlq2.cpp();
    }

    static /* synthetic */ void e(hlq hlq2) {
        hlq2.cpo();
    }

    static /* synthetic */ hnu f(hlq hlq2) {
        return hlq2.kDf;
    }

    static /* synthetic */ hdm g(hlq hlq2) {
        return hlq2.jLM;
    }

    static /* synthetic */ hnu a(hlq hlq2, hnu hnu2) {
        hlq2.kDf = hnu2;
        return hlq2.kDf;
    }

    static /* synthetic */ hoz.a cpr() {
        return jHL;
    }

    static /* synthetic */ hdm h(hlq hlq2) {
        return hlq2.jLM;
    }

    static /* synthetic */ hdm i(hlq hlq2) {
        return hlq2.jLM;
    }

    static /* synthetic */ hdm j(hlq hlq2) {
        return hlq2.jLM;
    }

    static {
        jHL = new hoz.a(lcy.qUR);
        jHM = new hoz.a(lcy.qUS, true);
    }
}

