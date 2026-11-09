/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public final class hls
extends hdj {
    public hls(hdm hdm2) {
        super(hdm2, null, "VITALSTATS", 311, joj.nIH);
    }

    @Override
    protected hen cdl() {
        hen.f f2 = hls.q(this.jLM);
        lhf lhf2 = this.jLM.jXk.jRi.kLY;
        lhf2 = lhf2.p(hls.q((hdm)this.jLM).keL.kKX.kPT.ctr());
        lgg lgg2 = this.jLM.e(this.jLM.jXk.jUo, lhf2);
        hen hen2 = new hen(this.jLM, (String)null, lgg2, lhf2, f2, new hen.e(true), new hlw.a(true), new hen.c(this.hasAttribute(256)));
        hjd hjd2 = new hjd(this.jLM, (String)null, lgg.rlI, this.jLM.jXk.jRi.kLY);
        hen2.w(hjd2);
        return hen2;
    }

    private static hen.f q(hdm hdm2) {
        return hdm2.jXH;
    }
}

