/*
 * Decompiled with CFR.
 */
public class hbt
extends hnv {
    private hpe jEc;
    private hpe jEd;
    private hbj jEe;
    private hbf jBJ;
    private boolean jEi = true;
    private hpa jEj;
    private hpe jEk;

    public hbt(hbm hbm2, lgg lgg2) {
        super((hnc)((Object)hbm2), "", lgg2, new lhf(hbo.jDr.kLY.rmN, hbm2.kND.cqv().H - 40), hbt.cbs());
        Object object = new lhf(200, 50);
        Object object2 = new lgg(140, 44);
        this.jEc = new hpe((hnc)((Object)hbm2), "", (lgg)object2, (lhf)object, hbm2.jBZ, "no racename");
        this.j(this.jEc);
        object = new lhf(280, 50);
        object2 = new lgg(140, 12);
        Object object3 = new hpe((hnc)((Object)hbm2), "", (lgg)object2, (lhf)object, hbm2.jBY, "Choose your character's race");
        this.j((hms)object3);
        this.jEj = new hpa((hnc)((Object)hbm2), (String)null, new lgg(278, 84), new lhf(98, 98), hbo.jDq[1]);
        this.j(this.jEj);
        object = "no description";
        object2 = new lhf(176, 350);
        object3 = new lgg(246, 210);
        this.jEd = new hpe((hnc)((Object)hbm2), "", (lgg)object3, (lhf)object2, hbm2.jCb, (String)object);
        this.j(this.jEd);
        object = "no faction description";
        object2 = new lhf(176, 150);
        object3 = new lgg(246, 490);
        this.jEk = new hpe((hnc)((Object)hbm2), "", (lgg)object3, (lhf)object2, hbm2.jCb, (String)object);
        this.j(this.jEk);
        object = new lgg(200, 549);
        if (hbm2.cbd().H <= 600) {
            object = new lgg(0, hbm2.cbd().H - 100);
        }
        object2 = new a(this, 515);
        object3 = new a(this, 514);
        lgs lgs2 = new lgs((lgg)object, 256, 64);
        this.jEe = new hbj(hbm2, lgs2, (lbn)object2, (lbn)object3, "", false);
        this.j(this.jEe);
        this.jBJ = hbm2.I(2, true);
        this.jBJ.mW(false);
        this.cbo().jCr.j(this.jBJ);
        this.jBJ.mV(this.jEi);
    }

    private static hnv.a cbs() {
        return new hnv.a(hbo.jDr, lcq.COLORSHIFT_NEUTRAL);
    }

    @Override
    protected void FF() {
        super.FF();
    }

    public void a(cp cp2) {
        this.jEj.a(hbo.jDq[cg.A(cp2.bl())]);
        this.jEe.lW(cp2.bl());
        this.jEc.mV(cp2.bO());
        this.jEd.mV(cp2.getDescription());
        this.jEk.mV(cp2.bP());
    }

    public void mV(boolean bl) {
        this.jEi = true;
        this.jEe.mV(bl);
        this.jBJ.mV(bl);
    }

    protected final hbm cbo() {
        return (hbm)((Object)this.kLu);
    }

    static /* synthetic */ boolean a(hbt hbt2) {
        return hbt2.jEi;
    }

    static /* synthetic */ boolean a(hbt hbt2, boolean bl) {
        hbt2.jEi = bl;
        return hbt2.jEi;
    }
}

