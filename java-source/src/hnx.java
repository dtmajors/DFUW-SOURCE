/*
 * Decompiled with CFR.
 */
public class hnx
extends hnw {
    private final hpa jHl;
    private boolean Initialized;

    public hnx(hnc hnc2, String string, lgg lgg2, lhf lhf2, hpw.a a2) {
        super(hnc2, string, lgg2, lhf2, false);
        assert (a2 != null);
        this.jHl = new hpa(hnc2, (String)null, lgg.rlI, lhf2, a2.kPU);
        this.j(this.jHl);
        this.jHl.H(a2.ktY);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.nb(true);
        this.layout();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.nb(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        this.layout();
    }

    @Override
    protected <C extends hms> C c(lgg lgg2, Class<C> clazz) {
        Object object = super.c(lgg2, clazz);
        if (object == this.jHl && clazz.isAssignableFrom(hpw.class)) {
            object = this.cte();
        }
        return object;
    }

    @Override
    protected int j(ldb ldb2) {
        int n = super.j(ldb2);
        return n + this.cte().l(ldb2, this.e(ldb2));
    }

    private void layout() {
        this.jHl.d(this.cqv());
    }

    private void nb(boolean bl) {
        assert (lda.yk(bl));
    }
}

