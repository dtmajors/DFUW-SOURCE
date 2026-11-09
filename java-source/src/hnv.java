/*
 * Decompiled with CFR.
 */
public class hnv
extends hpv {
    private final hpa jHl;
    private boolean Initialized;

    public hnv(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2) {
        super(hnc2, string, lgg2, lhf2);
        assert (a2 != null);
        this.jHl = new hpa(this.kLu, (String)null, lgg.rlI, lhf2, a2.kPU);
        this.jHl.H(a2.ktY);
        this.j(this.jHl);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cce() {
        this.jHl.d(this.cqv());
    }
}

