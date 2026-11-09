/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public final class hks
extends hkr {
    public hks(hdm hdm2) {
        super(hdm2, null, "INVENTORY_BACKPACK", hdm2.jXk.jMz, hdm2.jXG, true, true, false, false, joj.nIs);
        this.j(hdm2.cbP().kck.kyA);
    }

    @Override
    protected hgm cpc() {
        lgg lgg2 = new lgg(this.jLM.jXk.jMA.rmN - this.jLM.jXk.jPK.rmN / 2, this.jLM.jXk.jMA.H - this.jLM.jXk.jPK.H / 2);
        hgm hgm2 = new hgm(this.jLM, null, lgg.rlI, lhf.rnv, this.jLM.jYD, this.cjv(), lgg2);
        return hgm2;
    }
}

