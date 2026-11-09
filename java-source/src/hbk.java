/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hlv
 */
public class hbk
extends hou {
    private static final lhf jBh = new lhf(32, 32);
    private int jBi = 0;
    private int bHh = 0;
    private final hpx jBj;
    private final hpi jBf;
    private final hpx jBk;
    private boolean Initialized;

    public static lhf a(hlv hlv2, String string) {
        lhf lhf2 = hlv2.a(hlv2.jBt.kiK.jFE, string);
        return new lhf(hbk.jBh.rmN + lhf2.rmN + hbk.jBh.rmN, hbk.jBh.H);
    }

    public hbk(hlv hlv2, lgs lgs2, lbn lbn2, lbn lbn3, String string, boolean bl) {
        super((hnc)hlv2, "", lgs2.aI(), lgs2.cqv(), new lhf(3, 1), new lgg(1, 0));
        lhf lhf2 = null;
        if (bl) {
            lgs2.cf = 0;
            lhf2 = hbk.a(hlv2, string);
            lhf2 = new lhf(220, lhf2.H);
            lgs2.c(hlv2.kND.cqv());
            lgg lgg2 = lgs2.l(lhf2);
            lgs2.cf = lgg2.cf;
        }
        this.jBj = new hqz((hnc)hlv2, "", lgg.rlI, lgs2.cqv(), hpx.a.kXm, hlv2.kJH, hbo.jDn);
        this.jBj.cvC().a(true, lbn2);
        this.jBf = new hpi((hnc)hlv2, "", lgg.rlI, lgs2.cqv(), hlv2.jBt, lgg.rlI, string);
        this.jBk = new hqz((hnc)hlv2, "", lgg.rlI, lgs2.cqv(), hpx.a.kXm, hlv2.kJH, hbo.jDm);
        this.jBk.cvC().a(true, lbn3);
        this.a(ldb.rep, 0, hbk.jBh.H);
        this.a(ldb.reo, 0, hbk.jBh.rmN);
        this.a(ldb.reo, 2, hbk.jBh.rmN);
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

