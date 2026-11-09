/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public final class hko
extends hdj {
    public hko(hdm hdm2) {
        super(hdm2, null, "HOTBAR", 15, joj.nIz);
    }

    @Override
    public boolean d(lfu lfu2) {
        boolean bl = false;
        return bl |= super.d(lfu2);
    }

    @Override
    protected hen cdl() {
        hep hep2 = new hep(this.jLM, (String)null, lgg.rlI, new hdj.a(this));
        lhf lhf2 = hep2.cqv();
        lgg lgg2 = this.jLM.e(this.jLM.jXk.jUg, lhf2);
        hep2.z(lgg2);
        return hep2;
    }
}

