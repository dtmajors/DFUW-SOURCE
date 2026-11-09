/*
 * Decompiled with CFR.
 */
public class hbi
extends hou {
    private static final lhf jBb = new lhf(51, 45);
    private static final lhf jBc = new lhf(256, 45);
    private static final lhf jBd = new lhf(61, 45);
    private final hpa jBe;
    private final hpi jBf;
    private final hpa jBg;
    private boolean Initialized;

    public static lhf a(hbm hbm2, String string) {
        hpi.a a2 = hbm2.cbf();
        lhf lhf2 = hbm2.a(a2.kiK.jFE, string);
        return new lhf(hbi.jBb.rmN + lhf2.rmN + hbi.jBd.rmN, hbi.jBb.H);
    }

    public hbi(hbm hbm2, lgs lgs2, String string) {
        super((hnc)((Object)hbm2), "", lgs2.aI(), lgs2.cqv(), new lhf(3, 1), new lgg(1, 0));
        lgs2.cf = 0;
        lhf lhf2 = hbi.a(hbm2, string);
        lgs2.c(hbm2.kND.cqv());
        lgg lgg2 = lgs2.l(lhf2);
        lgs2.cf = lgg2.cf;
        lhu lhu2 = new lhu(jBb, "gui/char_textfield_cap_left.dds");
        lhu lhu3 = new lhu(jBd, "gui/char_textfield_cap_right.dds");
        hqv.a a2 = new hqv.a(hbm2.kJJ, hbm2.kIn.kEi);
        this.jBe = new hpa((hnc)((Object)hbm2), "", lgs2.aI(), lgs2.cqv(), lhu2);
        this.jBe.H(hbm2.kIn.kEE);
        this.jBf = new hpi((hnc)((Object)hbm2), "", lgs2.aI(), lgs2.cqv(), hbm2.jBK, lgg.rlI, string);
        this.jBg = new hpa((hnc)((Object)hbm2), "", lgs2.aI(), lgs2.cqv(), lhu3);
        this.jBg.H(hbm2.kIn.kEE);
        this.d(lhf2);
        this.z(lgs2.aI());
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.a(ldb.rep, 0, hbi.jBb.H);
        this.a(ldb.reo, 0, hbi.jBb.rmN);
        this.a(ldb.reo, 2, hbi.jBd.rmN);
        this.d(0, 0, this.jBe);
        this.d(0, 1, this.jBf);
        this.d(0, 2, this.jBg);
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
}

