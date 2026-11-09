/*
 * Decompiled with CFR.
 */
public class hps<ROW, CELL, CELL_COMPONENT extends hms>
extends hpr<ROW, CELL, CELL_COMPONENT> {
    public final hpa kgb;

    public hps(hnc hnc2, String string, lgg lgg2, lhf lhf2, hpr.a a2, hpm<ROW, CELL, ?, CELL_COMPONENT> hpm2) {
        super(hnc2, string, lgg2, lhf2, a2, hpm2);
        this.kgb = new hpa(hnc2, string, lgg.rlI, lhf2, lhu.rnR);
        this.j(this.kgb);
    }

    @Override
    protected void cvp() {
        this.resize();
    }

    @Override
    protected void cce() {
        this.resize();
    }

    private void resize() {
        int n = this.cvo();
        this.kgb.h(n, 0, this.getWidth() - n, this.getHeight());
    }
}

