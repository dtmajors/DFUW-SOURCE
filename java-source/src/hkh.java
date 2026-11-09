/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public final class hkh
extends hdj {
    private final lbn kBO = new lbn(this){
        final /* synthetic */ hkh kBP;
        {
            this.kBP = hkh2;
        }

        public final void W() {
            hkh.a(this.kBP);
        }
    };

    public hkh(hdm hdm2) {
        super(hdm2, null, "COMPASS", 311, joj.nII);
        this.nb(true);
        this.coY();
    }

    @Override
    protected void cbg() {
        super.cbg();
        this.nb(false);
    }

    @Override
    protected hen cdl() {
        hen.f f2 = this.jLM.jXJ;
        lhf lhf2 = this.jLM.jXk.jRs.kLY;
        lhf2 = lhf2.p(f2.keL.kKX.kPT.ctr());
        lgg lgg2 = this.jLM.e(this.jLM.jXk.jUp, lhf2);
        hen hen2 = new hen(this.jLM, (String)null, lgg2, lhf2, f2, new hen.e(true), new hlw.a(true), new hen.c(this.hasAttribute(256)));
        hfr hfr2 = new hfr(this.jLM, (String)null, lgg.rlI, this.jLM.jXk.jRs.kLY);
        hen2.w(hfr2);
        return hen2;
    }

    private void coY() {
        boolean bl = this.jLM.jZL.cdb().getValue();
        this.ne(bl);
    }

    private void nb(boolean bl) {
        this.jLM.jZL.cdb().cec().a(bl, this.kBO);
    }

    static /* synthetic */ void a(hkh hkh2) {
        hkh2.coY();
    }
}

