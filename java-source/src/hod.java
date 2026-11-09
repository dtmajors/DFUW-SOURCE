/*
 * Decompiled with CFR.
 */
public class hod
extends hob {
    private boolean Initialized;

    public hod(hnc hnc2, String string) {
        super(hnc2, string, hnc2.kND.cqv(), false);
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
        this.Initialized = false;
        super.FG();
    }

    @Override
    protected boolean co(int n, int n2) {
        return false;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

