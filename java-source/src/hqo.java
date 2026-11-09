/*
 * Decompiled with CFR.
 */
public class hqo
extends hqm {
    public final lnp kYZ;
    private final lbn jJc = new lbn(this){
        final /* synthetic */ hqo kZp;
        {
            this.kZp = hqo2;
        }

        public final void W() {
            this.kZp.refresh();
        }
    };
    private boolean Initialized;

    public hqo(hnc hnc2, String string, lgg lgg2, lhf lhf2, hqm.a a2, lnp lnp2, int n, float f2) {
        super(hnc2, string, lgg2, lhf2, a2, lnp2.evY().rFJ, lnp2.evY().rFK, lnp2.getValue(), n, f2);
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
        this.kYZ.nH((float)this.cqg().cpZ());
    }

    protected void refresh() {
        this.cqg().cP(this.kYZ.getValue());
    }

    private void mU(boolean bl) {
        this.kYZ.cec().a(bl, this.jJc);
    }
}

