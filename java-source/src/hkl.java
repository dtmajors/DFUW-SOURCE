/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public class hkl
extends hdj {
    private final lbn kBX = new lbn(this){
        final /* synthetic */ hkl kCa;
        {
            this.kCa = hkl2;
        }

        public final void W() {
            hkl.a((hkl)this.kCa).cbP().kcf.cnF();
        }
    };

    public hkl(hdm hdm2) {
        super(hdm2, null, "CRAFTING", 372, null);
    }

    @Override
    protected hen cdl() {
        hen.f f2 = this.jLM.jXJ;
        hen hen2 = new hen(this.jLM, (String)null, lgg.rlI, lhf.rnv, f2, new hen.d(lcy.qYv), new hnu.d(this.kBX), new hen.e(true), new hen.c(this.hasAttribute(256)));
        hfs hfs2 = new hfs(this.jLM, (String)null, lgg.rlI, this.jLM.jZz.cdP(), this.jLM.jZz.cdQ());
        hen2.w(hfs2);
        lhf lhf2 = hfs2.cqv();
        lhf2 = lhf2.p(hen2.cfF().keL.kKX.kPT.ctr());
        hen2.d(lhf2);
        lgg lgg2 = this.jLM.e(this.jLM.jXk.jUA, lhf2);
        hen2.z(lgg2);
        return hen2;
    }

    static /* synthetic */ hdm a(hkl hkl2) {
        return hkl2.jLM;
    }
}

