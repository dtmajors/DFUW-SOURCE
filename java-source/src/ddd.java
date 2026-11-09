/*
 * Decompiled with CFR.
 */
public class ddd
extends dde {
    private boolean gea = true;
    private dbo geb = null;

    public boolean bjP() {
        return this.gea;
    }

    public void hI(boolean bl) {
        this.gea = bl;
    }

    public dbo bjQ() {
        return this.geb;
    }

    public void e(dbo dbo2) {
        assert (dbo2 != null);
        this.geb = dbo2;
    }

    @Override
    public cxd.r bjR() {
        if (this.geb instanceof dbp) {
            return cxd.r.fSt;
        }
        if (this.geb instanceof dbq) {
            return cxd.r.fSu;
        }
        return null;
    }

    @Override
    protected void a(dde dde2) {
        assert (this.geb != null);
        super.a(dde2);
        ddd ddd2 = (ddd)dde2;
        ddd2.hI(this.gea);
        ddd2.e(this.geb.biZ());
    }
}

