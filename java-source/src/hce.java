/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hce
extends hqx
implements hmb {
    private boolean Initialized;

    public hce(hdm hdm2, String string, hmi hmi2, hqx.a a2, boolean bl, boolean bl2) {
        super((hnc)hdm2, string, hmi2, a2, bl, bl2);
    }

    @Override
    public void cbJ() {
        assert (this.Initialized);
        assert (this.cbO().jZG.cpS());
        if (this.cvF()) {
            this.cvK();
        }
    }

    @Override
    public void cbK() {
    }

    @Override
    public boolean a(hmt hmt2, boolean bl) {
        assert (lda.yk(bl));
        if (!(hmt2 instanceof hir)) {
            return false;
        }
        hir hir2 = (hir)hmt2;
        return hir2.a(this, bl);
    }

    @Override
    public void cbL() {
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        this.Initialized = false;
        super.FG();
    }

    @Override
    protected void cbM() {
        assert (this.Initialized);
        super.cbM();
        if (this.cwz() == null) {
            this.cbO().jZG.a(this, this.kLu.crN());
        }
    }

    private hdm cbO() {
        return (hdm)this.kLu;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

