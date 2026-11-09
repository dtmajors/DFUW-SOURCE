/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hcz
extends hcx {
    private boolean Initialized;

    public hcz(hdm hdm2, String string, lgg lgg2, int n, hdg hdg2) {
        super(hdm2, string, lgg2, n, hdg2);
        int n2 = this.kRT.kRX.cf;
        int n3 = this.kRT.kRX.cg;
        int n4 = this.getWidth() - (n2 * 2 + 140 + this.kRT.kRY.cf);
        int n5 = n2;
        int n6 = this.getHeight() - n3 + 20 + 10;
        assert (lda.acc(n4));
        assert (lda.acc(n5));
        this.cC(n, n6 + n3);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.ccu();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ccd() {
        super.ccd();
        this.ccu();
    }

    private void ccu() {
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

