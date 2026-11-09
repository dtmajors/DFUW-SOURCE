/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public class hkn
extends hdj {
    private final lbn kCd = new lbn(this){
        final /* synthetic */ hkn kCe;
        {
            this.kCe = hkn2;
        }

        public final void W() {
            hkn.a(this.kCe);
        }
    };

    public hkn(hdm hdm2) {
        super(hdm2, null, "ENCHANTING", 372, null);
    }

    @Override
    protected hen cdl() {
        hen.f f2 = this.jLM.jXJ;
        hen hen2 = new hen(this.jLM, (String)null, lgg.rlI, lhf.rnv, f2, new hen.d(lcy.qYw), new hnu.d(this.kCd), new hen.e(true), new hen.c(this.hasAttribute(256)));
        hgo hgo2 = new hgo(this.jLM, (String)null, lgg.rlI, this.jLM.cbP().kck.kyC, this.jLM.jZA.cdS());
        hen2.w(hgo2);
        lhf lhf2 = new lhf(477, 487);
        lhf2 = lhf2.p(hen2.cfF().keL.kKX.kPT.ctr());
        hen2.d(lhf2);
        lgg lgg2 = this.jLM.e(this.jLM.jXk.jUD, lhf2);
        hen2.z(lgg2);
        return hen2;
    }

    @Override
    protected void cbg() {
        if (this.cdi()) {
            this.cpa();
        }
        super.cbg();
    }

    private void cpa() {
        this.jLM.cbP().kcg.cnL();
    }

    static /* synthetic */ void a(hkn hkn2) {
        hkn2.cpa();
    }
}

