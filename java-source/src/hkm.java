/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public final class hkm
extends hdj {
    private final lbn kCb = new lbn(this){
        final /* synthetic */ hkm kCc;
        {
            this.kCc = hkm2;
        }

        public final void W() {
            hkm.a(this.kCc);
        }
    };

    public hkm(hdm hdm2) {
        super(hdm2, null, "DESCRIPTION", 311, joj.nIx);
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
        lhf lhf2 = this.jLM.jXk.jUj;
        lgg lgg2 = this.jLM.e(this.jLM.jXk.jUi, lhf2);
        hen hen2 = new hen(this.jLM, (String)null, lgg2, lhf2, this.jLM.jXO, new hen.e(true), new hnu.e(this.jLM.jXk.jUk, this.jLM.jXk.jUl));
        hpt hpt2 = new hpt((hnc)this.jLM, null, lgg.rlI, lhf.rnv, this.jLM.kJW);
        hen2.w(hpt2);
        hft hft2 = new hft(this.jLM, (String)null, lgg.rlI, lhf.rnv);
        hpt2.cqd().a(hft2);
        return hen2;
    }

    private void coY() {
        boolean bl = this.jLM.jZL.cda().getValue();
        this.ne(bl);
    }

    private void nb(boolean bl) {
        this.jLM.jZL.cda().cec().a(bl, this.kCb);
    }

    static /* synthetic */ void a(hkm hkm2) {
        hkm2.coY();
    }
}

