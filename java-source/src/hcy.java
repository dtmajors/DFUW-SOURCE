/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hcy
extends hcx {
    private final hqu jJV;
    private boolean Initialized;

    public hcy(hdm hdm2, String string, lgg lgg2, int n, hdf hdf2) {
        super(hdm2, string, lgg2, n, hdf2);
        int n2 = this.kRT.kRX.cf;
        int n3 = this.kRT.kRX.cg;
        int n4 = this.getWidth() - (n2 * 2 + 140 + this.kRT.kRY.cf);
        int n5 = n2;
        int n6 = this.getHeight() - n3 + 20 + 10;
        hqt.a a2 = this.cbO().kJI;
        this.jJV = null;
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

    private hdm cbO() {
        return (hdm)this.kLu;
    }

    private void ccu() {
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

