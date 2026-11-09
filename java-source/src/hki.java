/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hki
extends hdj {
    private final lip iKP;
    private final lip kBQ;
    private final hoz.a[] kaA;
    private final hoz.a jEv;
    private final lbn kaB;
    private hoz.a kBR;

    public hki(hdm hdm2, String string, lip lip2, lip lip3, hoz.a[] aArray, hoz.a a2, lbn lbn2) {
        super(hdm2, null, "GENERIC_CONFIRMATION_" + string, 308, null);
        this.iKP = lip2;
        this.kBQ = lip3;
        this.kaA = aArray;
        this.jEv = a2;
        this.kaB = lbn2;
    }

    public final hoz.a coZ() {
        return this.kBR;
    }

    @Override
    protected hen cdl() {
        assert (!this.cdi());
        lhf lhf2 = hki.a(this.jLM, this.iKP, this.kBQ, this.kaA);
        lgg lgg2 = this.jLM.kND.cqE().l(lhf2);
        hen hen2 = new hen(this.jLM, (String)null, lgg2, lhf2, this.jLM.jXJ, new hen.d(this.iKP), new hnu.d(new hdj.a(this)), new hen.e(true), new hen.c(this.hasAttribute(256)));
        hoz hoz2 = new hoz((hnc)this.jLM, (String)null, lgg.rlI, this.jLM.kKG, this.iKP.esy(), this.kBQ.esy(), this.kaA, null, false, this, this.kaA[0], this.jEv, new a(this, hen2), this.jLM.kIn.kIk);
        hen2.w(hoz2);
        return hen2;
    }

    @Override
    protected void nf(boolean bl) {
        if (!bl) {
            this.kaB.W();
        }
        super.nf(bl);
    }

    private static lhf a(hdm hdm2, lip lip2, lip lip3, hoz.a[] aArray) {
        lhf lhf2 = hoz.a((hnc)hdm2, lip2.esy(), lip3.esy(), hdm2.kKG, aArray, null, hdm2.kIn.kIk);
        lhf2 = lhf2.p(hdm2.jXJ.keL.kKX.kPT.ctr());
        return lhf2;
    }
}

