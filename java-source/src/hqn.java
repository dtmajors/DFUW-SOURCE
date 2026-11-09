/*
 * Decompiled with CFR.
 */
public class hqn
extends hqm {
    public final lnh kYX;
    private final lbn jJc = new lbn(this){
        final /* synthetic */ hqn kZo;
        {
            this.kZo = hqn2;
        }

        public final void W() {
            this.kZo.refresh();
        }
    };
    private boolean Initialized;

    public hqn(hnc hnc2, String string, lgg lgg2, lhf lhf2, hqm.a a2, lnh lnh2, int n, double d2) {
        super(hnc2, string, lgg2, lhf2, a2, lnh2.evK().kLl, lnh2.evK().kLm, lnh2.getValue(), n, d2);
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
        this.kYX.es(this.cqg().cpZ());
    }

    protected void refresh() {
        this.cqg().cP(this.kYX.getValue());
    }

    private void mU(boolean bl) {
        this.kYX.cec().a(bl, this.jJc);
    }
}

