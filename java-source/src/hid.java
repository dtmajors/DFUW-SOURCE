/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hid
extends hoz {
    private boolean Initialized;

    public hid(hnc hnc2, String string, lgg lgg2, hoz.c c2, String string2, String string3, hoz.a[] aArray, String string4, boolean bl, Object object, hoz.a a2, hoz.a a3, lbn lbn2, int n) {
        super(hnc2, string, lgg2, c2, string2, string3, aArray, string4, bl, object, a2, a3, lbn2, n);
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
    protected void cbM() {
        assert (this.Initialized);
        this.cmf().cfI();
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hen cmf() {
        return (hen)this.cqt();
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

