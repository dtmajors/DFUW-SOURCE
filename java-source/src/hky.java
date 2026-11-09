/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public final class hky
extends hdj {
    private static final boolean kCx = false;

    public hky(hdm hdm2) {
        super(hdm2, null, "MAIN_MENU", 277, null);
    }

    @Override
    protected hen cdl() {
        hen.f f2 = this.jLM.jXJ;
        hha hha2 = new hha(this.jLM, null, lgg.rlI);
        lhf lhf2 = hha2.cqv().p(f2.keL.kKX.kPT.ctr());
        lgg lgg2 = this.jLM.e(this.jLM.jXk.jTZ, lhf2);
        hen hen2 = new hen(this.jLM, (String)null, lgg2, lhf2, f2, new hen.d(lcy.qYh), new hen.e(true), new hen.c(this.hasAttribute(256)));
        hen2.w(hha2);
        hen2.cfD();
        return hen2;
    }
}

