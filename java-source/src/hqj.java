/*
 * Decompiled with CFR.
 */
public class hqj
extends hqh {
    public final lnh kYX;
    private final lbn jJc = new lbn(this){
        final /* synthetic */ hqj kYY;
        {
            this.kYY = hqj2;
        }

        public final void W() {
            this.kYY.refresh();
        }
    };
    private boolean Initialized;

    public hqj(hnc hnc2, String string, lgg lgg2, lhf lhf2, hqh.b b2, lnh lnh2, boolean bl, int n, double d2) {
        super(hnc2, string, lgg2, lhf2, b2, lnh2.evK().kLl, lnh2.evK().kLm, bl, lnh2.getValue(), d2, null);
        assert (lda.acc(n));
        this.kYX = lnh2;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.refresh();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ciT() {
        super.ciT();
        this.kYX.es(this.cum());
    }

    protected void refresh() {
        this.cR(this.kYX.getValue());
    }

    private void mU(boolean bl) {
        this.kYX.cec().a(bl, this.jJc);
    }
}

