/*
 * Decompiled with CFR.
 */
public class hpr<ROW, CELL, CELL_COMPONENT extends hms>
extends hmt
implements lbn {
    private final a kWd;
    private final hpm<ROW, CELL, ?, CELL_COMPONENT> kVI;
    private ROW kWe;
    private hqz kWf;
    private int kWg;

    public hpr(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, hpm<ROW, CELL, ?, CELL_COMPONENT> hpm2) {
        super(hnc2, string, lgg2, lhf2);
        assert (hpm2 != null);
        this.kVI = hpm2;
        this.kWd = a2;
    }

    public final void a(ROW ROW, int n, boolean bl, boolean bl2) {
        this.kWe = ROW;
        if (bl) {
            lhv lhv2;
            lgg lgg2 = new lgg(n - this.kWd.kWh.kLY.rmN, (this.getHeight() - this.kWd.kWh.kLY.H) / 2);
            lhv lhv3 = lhv2 = bl2 ? this.kWd.kWi : this.kWd.kWh;
            if (this.kWf == null) {
                this.kWf = new hqz(this.kLu, null, lgg2, null, hpx.a.kXm, this.kWd.kJH, lhv2);
                this.kWf.cvC().a(true, this);
                this.j(this.kWf);
            } else {
                this.kWf.z(lgg2);
                this.kWf.a(lhv2);
            }
        } else if (this.kWf != null) {
            this.kWf.remove();
            this.kWf = null;
        }
        if (this.kWg != n) {
            this.kWg = n;
            this.cvp();
        }
    }

    public final int cvo() {
        return this.kWg;
    }

    protected void cvp() {
    }

    @Override
    public final void W() {
        this.kVI.E(this.kWe);
    }
}

