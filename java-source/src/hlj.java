/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public class hlj
extends hdj {
    public final hdm dXw;

    public hlj(hdm hdm2) {
        super(hdm2, null, "OPTIONS_VIDEO", 286, null);
        this.dXw = hdm2;
    }

    @Override
    protected hen cdl() {
        hen.f f2 = this.jLM.jXO;
        hdj.a a2 = new hdj.a(this);
        lhf lhf2 = this.jLM.jXk.jVf;
        lgg lgg2 = this.jLM.e(this.jLM.jXk.jVe, lhf2);
        hen hen2 = new hen(this.jLM, (String)null, lgg2, lhf2, f2, new hnu.e(this.jLM.jXk.jVg, this.jLM.jXk.jVh), new hen.d(lcy.qVT), new hnu.d(a2), new hen.e(true), new hen.c(this.hasAttribute(256)));
        hof hof2 = new hof((hnc)this.jLM, (String)null, lgg.rlI, hen2.csW(), this.jLM.kKm, true, true, true, true, (lbn)a2, lcy.qZG.esy());
        hen2.w(hof2);
        hml hml2 = new hml(hof2, ((hec)this.dXw.jWV).kcs.kzF, false);
        hof2.a(hml2);
        String string = null;
        this.jLM.jXk.getClass();
        hda hda2 = new hda(this.jLM, string, lgg.rlI, 464, (cqu)hml2.cqe());
        hof2.a(hda2);
        return hen2;
    }
}

