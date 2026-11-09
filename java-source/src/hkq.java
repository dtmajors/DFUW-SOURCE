/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public final class hkq
extends hdj {
    private final lbn kBX = new lbn(this){
        final /* synthetic */ hkq kCg;
        {
            this.kCg = hkq2;
        }

        public final void W() {
            hkq.a((hkq)this.kCg).cbP().kci.cnW();
        }
    };
    private final lbn kCf = new lbn(this){
        final /* synthetic */ hkq kCg;
        {
            this.kCg = hkq2;
        }

        public final void W() {
            hkq.b(this.kCg);
        }
    };

    public hkq(hdm hdm2) {
        super(hdm2, null, "INTERACTION", 204, null);
        this.cc(true);
        this.cpb();
    }

    @Override
    protected void cbg() {
        this.cc(false);
        super.cbg();
    }

    @Override
    protected hen cdl() {
        hen.f f2 = this.jLM.jXO;
        lhf lhf2 = this.jLM.jXk.jPb;
        lgg lgg2 = this.jLM.e(this.jLM.jXk.jUy, lhf2);
        hen hen2 = new hen(this.jLM, (String)null, lgg2, lhf2, f2, new hnu.e(this.jLM.jXk.jPc, this.jLM.jXk.jPd), new hen.d(lcy.qYu), new hnu.d(this.kBX), new hen.e(true), new hen.c(this.hasAttribute(256)));
        hgc hgc2 = new hgc(this.jLM, null, lgg.rlI, lhf.rnv, this.jLM.cbP().kci);
        hen2.w(hgc2);
        return hen2;
    }

    private void cpb() {
        boolean bl = this.cbP().kci.isActive();
        this.ne(bl);
    }

    @Override
    protected boolean d(lfu lfu2) {
        boolean bl = super.d(lfu2);
        if (lfu2.eqA()) {
            this.cpb();
        }
        return bl;
    }

    @Override
    protected void nf(boolean bl) {
        if (!bl && this.cbP().kci.isActive()) {
            this.jLM.cbP().kci.cnW();
            return;
        }
        super.nf(bl);
    }

    private hec cbP() {
        return this.jLM.cbP();
    }

    private void cc(boolean bl) {
        this.cbP().kci.cnV().a(bl, this.kCf);
    }

    static /* synthetic */ hdm a(hkq hkq2) {
        return hkq2.jLM;
    }

    static /* synthetic */ void b(hkq hkq2) {
        hkq2.cpb();
    }
}

