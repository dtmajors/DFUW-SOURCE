/*
 * Decompiled with CFR.
 */
public class hbl
extends hou {
    private static final lhf jBl = new lhf(90, 32);
    private final hpe jBm;
    private final hqm jBn;
    private boolean Initialized;
    private cs jBo;

    public hbl(hbm hbm2, lgs lgs2, lbn lbn2, boolean bl, cs cs2) {
        super((hnc)((Object)hbm2), "", lgs2.aI(), lgs2.cqv(), new lhf(2, 1), new lgg(1, 0));
        lbn lbn3 = lbn2;
        this.jBo = cs2;
        lhf lhf2 = null;
        this.jBm = new hpe((hnc)((Object)hbm2), "", lgs2.aI(), lgs2.cqv(), hbm2.jBu, this.jBo.getName());
        hqm.a a2 = hbm2.jBO;
        lgs lgs3 = new lgs(lgs2.cf + hbl.jBl.rmN, lgs2.cg, lgs2.rmN - hbl.jBl.rmN, lgs2.H);
        this.jBn = new hqm((hnc)((Object)hbm2), "", lgs3.aI(), lgs3.cqv(), a2, this.jBo.co(), this.jBo.cn(), this.jBo.cr(), 0, 1.0);
        this.jBn.cqg().cpY().a(true, lbn3);
        if (bl) {
            this.d(lhf2);
            this.z(lgs2.aI());
        }
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.a(ldb.rep, 0, hbl.jBl.H);
        this.a(ldb.reo, 0, hbl.jBl.rmN);
        this.d(0, 0, this.jBm);
        this.d(0, 1, this.jBn);
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
        this.jBm.mV(string);
    }

    public void LE(int n) {
        this.jBn.cqg().cP(n);
    }

    public int caX() {
        return (int)this.jBn.cqg().cpZ();
    }

    private void mU(boolean bl) {
    }
}

