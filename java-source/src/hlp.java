/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public final class hlp
extends hdj {
    public final lbn kBX = new lbn(this){
        final /* synthetic */ hlp kDa;
        {
            this.kDa = hlp2;
        }

        public final void W() {
            hlp.a((hlp)this.kDa).cbP().kcd.coQ();
        }
    };
    private final lbn kCZ = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hlp kDa;
        {
            this.kDa = hlp2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hlp.b(this.kDa)) {
                throw new AssertionError();
            }
            this.kDa.cpm();
        }

        static {
            $assertionsDisabled = !hlp.class.desiredAssertionStatus();
        }
    };
    private boolean jLT;

    public hlp(hdm hdm2) {
        super(hdm2, null, "TRADING", 372, null);
        this.cc(true);
        this.jLT = true;
    }

    @Override
    protected hen cdl() {
        assert (this.jLT);
        lhf lhf2 = hiw.l(this.jLM);
        hiw hiw2 = new hiw(this.jLM, (String)null, lgg.rlI, lhf2);
        hen.f f2 = this.jLM.jYu;
        lhf2 = lhf2.p(f2.keL.kKX.kPT.ctr());
        lgg lgg2 = this.jLM.e(this.jLM.jXk.jUG, lhf2);
        hen hen2 = new hen(this.jLM, (String)null, lgg2, lhf2, f2, new hen.d(lcy.qYB), new hnu.d(this.kBX), new hen.e(true), new hen.c(this.hasAttribute(256)));
        hen2.w(hiw2);
        return hen2;
    }

    @Override
    protected void cbg() {
        assert (this.jLT);
        this.cc(false);
        this.jLT = false;
        super.cbg();
    }

    @Override
    protected boolean d(lfu lfu2) {
        boolean bl = super.d(lfu2);
        if (lfu2.eqA()) {
            this.cpm();
        }
        return bl;
    }

    public void cpm() {
        boolean bl = this.jLM.cbP().kcd.coI();
        this.jLM.jZj.ne(bl);
    }

    private void cc(boolean bl) {
        this.jLM.cbP().kcd.coG().a(bl, this.kCZ);
    }

    static /* synthetic */ hdm a(hlp hlp2) {
        return hlp2.jLM;
    }

    static /* synthetic */ boolean b(hlp hlp2) {
        return hlp2.jLT;
    }
}

