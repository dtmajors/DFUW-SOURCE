/*
 * Decompiled with CFR.
 */
public class hbj
extends hou {
    private static final lhf jBh = new lhf(64, 64);
    private int jBi = 0;
    private int bHh = 0;
    private final hpx jBj;
    private final hpi jBf;
    private final hpx jBk;
    private boolean Initialized;

    public static lhf a(hbm hbm2, String string) {
        hpi.a a2 = hbm2.cbf();
        lhf lhf2 = hbm2.a(a2.kiK.jFE, string);
        return new lhf(hbj.jBh.rmN + lhf2.rmN + hbj.jBh.rmN + 10, hbj.jBh.H);
    }

    public hbj(hbm hbm2, lgs lgs2, lbn lbn2, lbn lbn3, String string, boolean bl) {
        super((hnc)((Object)hbm2), "", lgs2.aI(), lgs2.cqv(), new lhf(3, 1), new lgg(1, 0));
        lhf lhf2 = null;
        if (bl) {
            lgs2.cf = 0;
            lhf2 = hbj.a(hbm2, string);
            lhf2 = new lhf(220, lhf2.H);
            lgs2.c(hbm2.kND.cqv());
            lgg lgg2 = lgs2.l(lhf2);
            lgs2.cf = lgg2.cf;
        }
        this.jBj = new hqz((hnc)((Object)hbm2), "", lgg.rlI, lgs2.cqv(), hpx.a.kXm, hbm2.kJH, hbo.jDl);
        this.jBj.cvC().a(true, lbn2);
        this.jBf = new hpi((hnc)((Object)hbm2), "", lgg.rlI, lgs2.cqv(), hbm2.jBs, lgg.rlI, string);
        this.jBk = new hqz((hnc)((Object)hbm2), "", lgg.rlI, lgs2.cqv(), hpx.a.kXm, hbm2.kJH, hbo.jDk);
        this.jBk.cvC().a(true, lbn3);
        this.a(ldb.rep, 0, hbj.jBh.H);
        this.a(ldb.reo, 0, hbj.jBh.rmN);
        this.a(ldb.reo, 2, hbj.jBh.rmN);
        this.d(0, 0, this.jBj);
        this.d(0, 1, this.jBf);
        this.d(0, 2, this.jBk);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    public void lW(String string) {
        this.jBf.setText(string);
    }

    private void mU(boolean bl) {
    }

    public int caV() {
        return this.bHh;
    }

    public void LC(int n) {
        this.bHh = n;
    }

    public int caW() {
        return this.jBi;
    }

    public void LD(int n) {
        this.jBi = n;
    }

    public void mV(boolean bl) {
        this.jBj.og(!bl);
        this.jBk.og(!bl);
    }
}

