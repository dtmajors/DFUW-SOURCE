/*
 * Decompiled with CFR.
 */
public class hbf
extends hou {
    private static lhf jAN = new lhf(100, 32);
    private static int jAO = 22;
    private final hpx jAP;
    private final hpx jAQ;
    private boolean jAR = true;
    private hbg jAS;
    private boolean Initialized;

    public static lhf caO() {
        return new lhf(hbf.jAN.rmN + hbf.jAN.rmN + jAO, hbf.jAN.H);
    }

    public hbf(hbm hbm2, lgg lgg2, int n, boolean bl) {
        super((hnc)((Object)hbm2), "", lgg2, hbf.caO(), new lhf(3, 1), new lgg(1, 0));
        a a2 = new a(this, n << 8 | 5, bl);
        a a3 = new a(this, n << 8 | 4, bl);
        lgg lgg3 = new lgg(lgg2.cf + hbf.jAN.rmN + jAO, lgg2.cg);
        this.jAP = new hqy((hnc)((Object)hbm2), "", lgg2, jAN, hpx.a.kXm, hbm2.jBT, lcx.qQD.esy());
        this.jAP.cvC().a(true, a2);
        this.jAQ = new hqy((hnc)((Object)hbm2), "", lgg3, jAN, hpx.a.kXm, hbm2.jBU, lcx.qQC.esy());
        this.jAQ.cvC().a(true, a3);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.a(ldb.rep, 0, hbf.jAN.H);
        this.a(ldb.reo, 0, hbf.jAN.rmN);
        this.a(ldb.reo, 2, hbf.jAN.rmN);
        if (this.jAR) {
            this.d(0, 0, this.jAP);
        }
        this.d(0, 2, this.jAQ);
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    private void mU(boolean bl) {
    }

    public void mV(boolean bl) {
        this.jAP.og(!bl);
        this.jAQ.og(!bl);
    }

    private hbm caP() {
        return (hbm)((Object)this.kLu);
    }

    public boolean caQ() {
        return this.jAR;
    }

    public void mW(boolean bl) {
        this.jAR = bl;
    }

    public hbg caR() {
        return this.jAS;
    }

    public void a(hbg hbg2) {
        this.jAS = hbg2;
    }

    static /* synthetic */ hbg a(hbf hbf2) {
        return hbf2.jAS;
    }

    static /* synthetic */ hpx b(hbf hbf2) {
        return hbf2.jAP;
    }

    static /* synthetic */ hpx c(hbf hbf2) {
        return hbf2.jAQ;
    }

    static /* synthetic */ hbm d(hbf hbf2) {
        return hbf2.caP();
    }
}

