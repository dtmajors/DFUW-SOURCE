/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hlk
extends hdj {
    private hek ktB;

    public hlk(hdm hdm2, int n) {
        super(hdm2, null, "Partymember" + n, 820, null);
    }

    public final hek cpl() {
        return this.ktB;
    }

    public final void c(hek hek2) {
        this.ktB = hek2;
    }

    @Override
    protected hen cdl() {
        assert (this.ktB != null);
        hhs hhs2 = new hhs(this.jLM, (String)null, lgg.rlI, this.ktB);
        lhf lhf2 = hlk.p(this.jLM);
        lgg lgg2 = hlk.b(this.jLM, lhf2);
        hev hev2 = new hev(this.jLM, (String)null, lgg2, lhf2, this.jLM.jXM, this.ktB.kef);
        hev2.w(hhs2);
        return hev2;
    }

    @Override
    public String toString() {
        return super.toString() + " Partymember " + this.ktB.kef.esy();
    }

    private static lhf p(hdm hdm2) {
        lhf lhf2 = hdm2.jYr.kPU.kLY;
        lhf lhf3 = hdm2.jXL.keL.kKX.kPT.ctr();
        lhf2 = lhf2.p(lhf3);
        return lhf2;
    }

    private static lgg b(hdm hdm2, lhf lhf2) {
        lgs lgs2 = new lgs(lgg.rlI, hdm2.kND.cqv());
        lgs2 = lgs2.gc(-(lgs2.rmN / 4), -(lgs2.H / 4));
        lgg lgg2 = lgs2.a(hdm2.cbP().eNu);
        return new lgg(lgg2.cf - lhf2.rmN / 2, lgg2.cg - lhf2.H / 2);
    }
}

