/*
 * Decompiled with CFR.
 */
public class hqy
extends hqw {
    private final hpe kuQ;
    private final a kZQ;
    private boolean Initialized;

    public hqy(hnc hnc2, String string, lgg lgg2, lhf lhf2, hpx.a a2, a a3, String string2) {
        super(hnc2, string, lgg2, lhf2, a2, a3.kZC);
        assert (string2 != null);
        this.kZQ = a3;
        this.kuQ = new hpe(hnc2, null, lgg.rlI, lhf.rnv, a3.kiK, string2);
        this.j(this.kuQ);
    }

    public void setText(String string) {
        this.kuQ.mV(string);
    }

    public String getText() {
        return this.kuQ.getText();
    }

    public void c(hpe.c c2) {
        this.kuQ.a(c2);
    }

    public void M(lcq lcq2) {
        this.kuQ.H(lcq2);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
        this.ccm();
        this.ctH();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cvG() {
        assert (this.Initialized);
        super.cvG();
        this.ccm();
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        this.ccm();
    }

    private void ccm() {
        int n = this.kZQ.kZR;
        int n2 = this.kZQ.kZS;
        if (this.cvF()) {
            n += this.kZQ.kZD.rmN;
            n2 += this.kZQ.kZD.H;
        }
        this.kuQ.h(n, n2, Math.max(0, this.getWidth() - (this.kZQ.kZR + this.kZQ.kZT)), Math.max(0, this.getHeight() - (this.kZQ.kZS + this.kZQ.kZU)));
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

