/*
 * Decompiled with CFR.
 */
public class hqk
extends hqh {
    public final lnp kYZ;
    private final lbn jJc = new lbn(this){
        final /* synthetic */ hqk kZa;
        {
            this.kZa = hqk2;
        }

        public final void W() {
            this.kZa.refresh();
        }
    };
    private boolean Initialized;

    public hqk(hnc hnc2, String string, lgg lgg2, lhf lhf2, hqh.b b2, lnp lnp2, boolean bl, int n, double d2) {
        super(hnc2, string, lgg2, lhf2, b2, lnp2.evY().rFJ, lnp2.evY().rFK, bl, lnp2.getValue(), d2, null);
        assert (lda.acc(n));
        this.kYZ = lnp2;
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
        this.kYZ.nH((float)this.cum());
    }

    protected void refresh() {
        this.cR(this.kYZ.getValue());
    }

    private void mU(boolean bl) {
        this.kYZ.cec().a(bl, this.jJc);
    }
}

