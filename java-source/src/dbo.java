/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lkv
 */
public abstract class dbo {
    private cxd.p fZr = null;
    private cxd.t gcn = null;
    private cxd.i gco = null;
    private boolean gcp = false;

    public final cxd.p biV() {
        return this.fZr;
    }

    public final void j(cxd.p p2) {
        this.fZr = p2;
    }

    public final cxd.t biW() {
        return this.gcn;
    }

    public final void c(cxd.t t2) {
        this.gcn = t2;
    }

    public cxd.i biX() {
        return this.gco;
    }

    public void a(cxd.i i2) {
        this.gco = i2;
    }

    public boolean biY() {
        return this.gcp;
    }

    public void hC(boolean bl) {
        this.gcp = bl;
    }

    public final dbo biZ() {
        dbo dbo2 = null;
        try {
            Class<?> clazz = this.getClass();
            dbo2 = (dbo)clazz.newInstance();
            this.d(dbo2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return dbo2;
    }

    public final String bja() {
        if (this.fZr == null) {
            return null;
        }
        return this.fZr.name();
    }

    public final String bjb() {
        if (this.gcn == null) {
            return null;
        }
        return this.gcn.name();
    }

    public abstract int aDI();

    public final String aDK() {
        return lkv.adr((int)this.aDI());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": SkillPart='");
        stringBuilder.append(this.bja());
        stringBuilder.append("' TargetObject='");
        stringBuilder.append(this.bjb());
        stringBuilder.append("' AnimationName='");
        stringBuilder.append(this.aDK());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    protected void d(dbo dbo2) {
        dbo2.j(this.fZr);
        dbo2.c(this.gcn);
        dbo2.a(this.gco);
        dbo2.hC(this.gcp);
    }
}

