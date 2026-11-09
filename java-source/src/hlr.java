/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public class hlr
extends hdj {
    private final hdm dXw;
    private ldv aCK;
    private ljq kDn;
    private final lbn kBX = new lbn(this){
        final /* synthetic */ hlr kDo;
        {
            this.kDo = hlr2;
        }

        public final void W() {
            this.kDo.ne(false);
        }
    };

    public hlr(hdm hdm2) {
        super(hdm2, null, "TREASUREMAP", 372, null);
        this.dXw = hdm2;
    }

    public final ldv cps() {
        return this.aCK;
    }

    public final void p(ldv ldv2, ljq ljq2) {
        this.aCK = ldv2;
        this.kDn = ljq2;
    }

    @Override
    protected void nf(boolean bl) {
        super.nf(bl);
        if (!bl) {
            this.aCK = null;
            this.kDn = null;
        }
    }

    @Override
    protected hen cdl() {
        assert (this.aCK != null);
        assert (this.kDn != null);
        hen.f f2 = this.jLM.jXJ;
        hen hen2 = new hen(this.jLM, (String)null, lgg.rlI, lhf.rnv, f2, new hen.d(lcy.qYG), new hnu.d(this.kBX), new hen.e(true), new hen.c(this.hasAttribute(256)));
        hpl hpl2 = new hpl(this.dXw, lgg.rlI);
        lhf lhf2 = hpl2.cqv();
        lhf2 = lhf2.p(hen2.cfF().keL.kKX.kPT.ctr());
        hen2.d(lhf2);
        hen2.w(hpl2);
        hpl2.cX(this.kDn);
        lgg lgg2 = this.jLM.e(this.jLM.jXk.jUC, lhf2);
        hen2.z(lgg2);
        return hen2;
    }
}

