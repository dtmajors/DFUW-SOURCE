/*
 * Decompiled with CFR.
 */
public class hob
extends hmt {
    public final boolean kRq;
    private final lbn kRr = new lbn(this){
        final /* synthetic */ hob kRs;
        {
            this.kRs = hob2;
        }

        public final void W() {
            this.kRs.d(this.kRs.cqt().cqv());
        }
    };
    private boolean Initialized;

    public hob(hnc hnc2, String string, lhf lhf2, boolean bl) {
        super(hnc2, string, lgg.rlI, lhf2);
        this.kRq = bl;
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
        hmt hmt2 = this.cqt();
        if (hmt2 != null) {
            hmt2.cqn().a(bl, this.kRr);
        }
    }
}

