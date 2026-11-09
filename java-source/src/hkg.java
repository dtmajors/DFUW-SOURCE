/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdk
 *  hdm
 */
public class hkg
extends hdj {
    public hkg(hdm hdm2) {
        super(hdm2, null, "COLORCHOOSER", 0, null);
    }

    @Override
    protected hen cdl() {
        hen.f f2 = this.jLM.jXH;
        int n = lea.rhD.size();
        int n2 = (n + 4 - 1) / 4;
        lhf lhf2 = new lhf(hdk.jNP.rmN * 4, hdk.jNP.H * n2);
        lhf lhf3 = lhf2.p(f2.keL.kKX.kPT.ctr());
        hen hen2 = new hen(this.jLM, (String)null, lgg.rlI, lhf3, f2, new hnu.e(lhf3, lhf3));
        hfj hfj2 = new hfj(this.jLM, (String)null, lgg.rlI, lhf2);
        hen2.w(hfj2);
        return hen2;
    }
}

