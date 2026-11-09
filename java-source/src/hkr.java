/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public abstract class hkr
extends hdj {
    protected final lhf kBL;
    protected final hen.f kCh;
    private final lbn kCi = new lbn(this){
        final /* synthetic */ hkr kCn;
        {
            this.kCn = hkr2;
        }

        public final void W() {
            if (this.kCn.cdi()) {
                return;
            }
            this.kCn.cdk();
        }
    };
    private final lbn kCj = new lbn(this){
        final /* synthetic */ hkr kCn;
        {
            this.kCn = hkr2;
        }

        public final void W() {
            this.kCn.cdh().cqV();
        }
    };
    private final lbn kCk = new lbn(this){
        final /* synthetic */ hkr kCn;
        {
            this.kCn = hkr2;
        }

        public final void W() {
            if (!this.kCn.cdi()) {
                return;
            }
            this.kCn.closeWindow();
        }
    };
    private final lbn kCl = new lbn(this){
        final /* synthetic */ hkr kCn;
        {
            this.kCn = hkr2;
        }

        public final void W() {
            this.kCn.cpd();
        }
    };
    private final lbn kCm = new lbn(this){
        final /* synthetic */ hkr kCn;
        {
            this.kCn = hkr2;
        }

        public final void W() {
            this.kCn.cpe();
        }
    };
    public final lbn kBX = new lbn(this){
        final /* synthetic */ hkr kCn;
        {
            this.kCn = hkr2;
        }

        public final void W() {
            if (!hkr.a(this.kCn).isConstructed() || !hkr.a(this.kCn).isActive()) {
                this.kCn.j(null);
                if (this.kCn.cdi()) {
                    this.kCn.closeWindow();
                }
            }
            hkr.a(this.kCn).cfe();
        }
    };
    private hee kdT;

    public hkr(hdm hdm2, String string, String string2, lhf lhf2, hen.f f2, boolean bl, boolean bl2, boolean bl3, boolean bl4, jov jov2) {
        super(hdm2, string, string2, 4 | (bl ? 1 : 0) | (bl2 ? 2 : 0) | (bl3 ? 64 : 0) | (bl4 ? 128 : 272), jov2);
        this.kBL = lhf2;
        this.kCh = f2;
    }

    public hee cjv() {
        return this.kdT;
    }

    public void j(hee hee2) {
        if (this.kdT != null) {
            if (this.kdT.isActive()) {
                this.kdT.cfe();
                if (this.cdi()) {
                    this.closeWindow();
                }
            }
            this.cc(false);
        }
        this.kdT = hee2;
        if (this.kdT != null) {
            this.cc(true);
            if (this.kdT.isActive()) {
                this.cdk();
            }
        }
    }

    @Override
    protected hen cdl() {
        assert (this.kdT != null);
        assert (this.kdT != this.jLM.cbP().kci.cog());
        assert (this.kdT != this.jLM.cbP().kck.kyC);
        hgm hgm2 = this.cpc();
        lgg lgg2 = hkr.b(this.jLM, this.kBL);
        lhf lhf2 = this.kBL.p(this.kCh.keL.kKX.kPT.ctr());
        hen hen2 = new hen(this.jLM, (String)null, lgg2, lhf2, this.kCh, new hen.d(this.kdT.cdY()), new hnu.d(this.kBX), new hen.e(true), new hen.c(this.hasAttribute(256)));
        hen2.w(hgm2);
        return hen2;
    }

    @Override
    protected void nf(boolean bl) {
        if (bl) {
            if (this.kdT != null && !this.kdT.isActive()) {
                this.kdT.cfd();
                return;
            }
        } else if (this.kdT != null && this.kdT.isActive()) {
            this.kdT.cfe();
            return;
        }
        super.nf(bl);
    }

    @Override
    protected void cbg() {
        super.cbg();
        if (this.kdT != null) {
            this.cc(false);
        }
    }

    @Override
    protected void cdm() {
        if (this.kdT != null) {
            this.kdT.cfd();
        }
    }

    protected abstract hgm cpc();

    protected void cpd() {
        this.j(null);
    }

    protected void cpe() {
        if (this.cdi()) {
            lip lip2 = this.kdT.cdY();
            this.cdh().f(lip2);
        }
    }

    private static final lgg b(hdm hdm2, lhf lhf2) {
        lgs lgs2 = new lgs(lgg.rlI, hdm2.kND.cqv());
        lgs2 = lgs2.gc(-(lgs2.rmN / 3), -(lgs2.H / 3));
        lgg lgg2 = lgs2.a(hdm2.cbP().eNu);
        return new lgg(lgg2.cf - lhf2.rmN / 2, lgg2.cg - lhf2.H / 2);
    }

    private String cpf() {
        return null;
    }

    private void cc(boolean bl) {
        this.kdT.ceX().a(bl, this.kCi);
        this.kdT.ceY().a(bl, this.kCj);
        this.kdT.ceZ().a(bl, this.kCk);
        this.kdT.ceb().a(bl, this.kCl);
        this.kdT.cfc().a(bl, this.kCm);
    }

    static /* synthetic */ hee a(hkr hkr2) {
        return hkr2.kdT;
    }
}

