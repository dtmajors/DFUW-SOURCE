/*
 * Decompiled with CFR.
 */
public class hbs
extends hnv {
    private hpe jEc;
    private hpe jEd;
    private hbj jEe;
    private hbf jBJ;
    private boolean jEf = true;
    private hpa jEg;

    public hbs(hbm hbm2, lgg lgg2) {
        super((hnc)((Object)hbm2), "", lgg2, new lhf(hbo.jDs.kLY.rmN, hbm2.kND.cqv().H - 40), hbs.cbs());
        lbq lbq2 = new lhf(280, 50);
        Object object = new lgg(140, 12);
        this.jEc = new hpe((hnc)((Object)hbm2), "", (lgg)object, (lhf)lbq2, hbm2.jBY, "Choose Gender");
        this.j(this.jEc);
        this.jEg = this.jEf ? new hpa((hnc)((Object)hbm2), (String)null, new lgg(275, 100), new lhf(256, 256), hbo.jDu) : new hpa((hnc)((Object)hbm2), (String)null, new lgg(275, 100), new lhf(256, 256), hbo.jDt);
        this.j(this.jEg);
        lbq2 = new lgg(210, 310);
        object = new a(this, 771);
        a a2 = new a(this, 770);
        lgs lgs2 = new lgs((lgg)lbq2, 256, 64);
        this.jEe = new hbj(hbm2, lgs2, (lbn)object, a2, "", false);
        this.j(this.jEe);
        this.jBJ = hbm2.I(3, true);
        this.cbo().jCr.j(this.jBJ);
        this.jBJ.mV(false);
        hbm2.cbc();
    }

    private static hnv.a cbs() {
        return new hnv.a(hbo.jDs, lcq.COLORSHIFT_NEUTRAL);
    }

    @Override
    protected void FF() {
        super.FF();
    }

    @Override
    protected void FG() {
        super.FG();
    }

    public void mV(boolean bl) {
        this.jEe.mV(bl);
        this.jBJ.mV(bl);
    }

    public void ma(String string) {
        this.jEe.lW(string);
    }

    public void mY(boolean bl) {
        this.jEf = bl;
        if (this.jEf) {
            this.jEg.a(hbo.jDu);
        } else {
            this.jEg.a(hbo.jDt);
        }
    }

    protected final hbm cbo() {
        return (hbm)((Object)this.kLu);
    }
}

