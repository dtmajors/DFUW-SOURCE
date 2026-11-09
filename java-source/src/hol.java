/*
 * Decompiled with CFR.
 */
public abstract class hol
extends hmt {
    private boolean Initialized;
    private int kOa;

    public final void layout() {
        assert (this.Initialized);
        if (this.kOa > 0) {
            return;
        }
        ++this.kOa;
        this.cuf();
        --this.kOa;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.layout();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        this.layout();
    }

    protected abstract void cuf();

    protected hol(hnc hnc2, String string, lgg lgg2, lhf lhf2) {
        super(hnc2, string, lgg2, lhf2);
    }
}

