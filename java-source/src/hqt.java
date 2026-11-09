/*
 * Decompiled with CFR.
 */
public class hqt
extends hpx {
    private final a kZw;
    private final hpa koV;
    private final hpe kuQ;
    private boolean Initialized;

    public static lhf a(hnc hnc2, a a2, String string) {
        lhf lhf2 = hnc2.a(a2.kiK.jFE, string);
        int n = a2.kpT.kLY.rmN + a2.kZx + lhf2.rmN;
        int n2 = Math.max(a2.kpT.kLY.H, lhf2.H);
        return new lhf(n, n2);
    }

    public hqt(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, String string2) {
        super(hnc2, string, lgg2, lhf2, hpx.a.kXo, a2.kJH);
        assert (string2 != null);
        this.kZw = a2;
        this.koV = new hpa(hnc2, (String)null, new lgg(0, (this.getHeight() - a2.kpT.kLY.H) / 2), null, a2.kpT.acS(0));
        this.j(this.koV);
        int n = a2.kpT.kLY.rmN + a2.kZx;
        this.kuQ = new hpe(hnc2, null, new lgg(n, 0), new lhf(this.getWidth() - n, this.getHeight()), a2.kiK, string2);
        this.j(this.kuQ);
    }

    public void setText(String string) {
        assert (this.Initialized);
        this.kuQ.mV(string);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
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
    protected void ctH() {
        super.ctH();
        int n = this.cvH() ? 1 : 0;
        lhu lhu2 = this.kZw.kpT.acS(n);
        this.koV.a(lhu2);
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

