/*
 * Decompiled with CFR.
 */
public class hra
extends hpx {
    private final a kZV;
    private final hpa koV;
    private boolean Initialized;

    public hra(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2) {
        super(hnc2, string, lgg2, lhf2 != null ? lhf2 : a2.kZW.acS((int)0).kLY, hpx.a.kXo, a2.kJH);
        this.kZV = a2;
        this.koV = new hpa(hnc2, (String)null, new lgg(0, 0), lhf2, a2.kZW.acS(0));
        this.j(this.koV);
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
        lhv lhv2 = this.cvE() ? this.kZV.kZX : this.kZV.kZW;
        int n = this.cvH() ? 1 : 0;
        lhu lhu2 = lhv2.acS(n);
        this.koV.a(lhu2);
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

