/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hlv
 */
public class hlt
extends hoc {
    private boolean Initialized;

    public hlt(hlv hlv2, String string, boolean bl) {
        super((hnc)hlv2, string, hlv2.kND.cqv(), bl);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

