/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public class hle
extends hdj {
    public final hdm dXw;

    public hle(hdm hdm2) {
        super(hdm2, null, "OPTIONS_AUDIO", 286, null);
        this.dXw = hdm2;
    }

    @Override
    protected hen cdl() {
        hen.f f2 = this.jLM.jXO;
        hdj.a a2 = new hdj.a(this);
        lhf lhf2 = this.jLM.jXk.jVk;
        lgg lgg2 = this.jLM.e(this.jLM.jXk.jVj, lhf2);
        hen hen2 = new hen(this.jLM, (String)null, lgg2, lhf2, f2, new hnu.e(this.jLM.jXk.jVl, this.jLM.jXk.jVm), new hen.d(lcy.qVU), new hnu.d(a2), new hen.e(true), new hen.c(this.hasAttribute(256)));
        hof hof2 = new hof((hnc)this.jLM, (String)null, lgg.rlI, hen2.csW(), this.jLM.kKm, true, true, false, true, (lbn)a2, lcy.qZH.esy());
        hen2.w(hof2);
        hml hml2 = new hml(hof2, ((hec)this.dXw.jWV).kct.kxH, false);
        hof2.a(hml2);
        String string = null;
        this.jLM.jXk.getClass();
        hcp hcp2 = new hcp(this.jLM, string, lgg.rlI, 464, (atk)hml2.cqe());
        hof2.a(hcp2);
        return hen2;
    }
}

