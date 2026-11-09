/*
 * Decompiled with CFR.
 */
public class hqu
extends hqt {
    public final lnd kZy;
    private final lbn jJc = new lbn(this){
        final /* synthetic */ hqu kZz;
        {
            this.kZz = hqu2;
        }

        public final void W() {
            this.kZz.refresh();
        }
    };
    private boolean Initialized;

    public hqu(hnc hnc2, String string, lgg lgg2, lhf lhf2, hqt.a a2, lnd lnd2, String string2) {
        super(hnc2, string, lgg2, lhf2, a2, string2);
        this.kZy = lnd2;
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
    protected void cbN() {
        boolean bl = this.cvE();
        bl = !bl;
        this.kZy.yP(bl);
    }

    protected void refresh() {
        this.on(this.kZy.getValue());
    }

    private void mU(boolean bl) {
        this.kZy.cec().a(bl, this.jJc);
    }
}

