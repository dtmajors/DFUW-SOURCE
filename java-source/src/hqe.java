/*
 * Decompiled with CFR.
 */
public class hqe<E extends Enum<E>>
extends hqa<E> {
    public final lnl<E> kXZ;
    private final lbn jJc = new lbn(this){
        final /* synthetic */ hqe kYa;
        {
            this.kYa = hqe2;
        }

        public final void W() {
            hqe.a(this.kYa);
        }
    };
    private boolean Initialized;

    public hqe(hnc hnc2, String string, lgg lgg2, lhf lhf2, hqa.a a2, hoq.c c2, int n, lnl<E> lnl2) {
        this(hnc2, string, lgg2, lhf2, a2, c2, n, lnl2, new hrg(lnl2.evR().rFD));
    }

    private hqe(hnc hnc2, String string, lgg lgg2, lhf lhf2, hqa.a a2, hoq.c c2, int n, lnl<E> lnl2, hrg<E> hrg2) {
        super(hnc2, string, lgg2, lhf2, a2, c2, n, hrg2, null);
        this.kXZ = lnl2;
        this.jHT.Nw(((Enum)lnl2.evQ()).ordinal());
        this.ccu();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void csy() {
        super.csy();
        int n = this.jHT.csE();
        Enum enum_ = ((Enum[])this.kXZ.evR().rFD.getEnumConstants())[n];
        this.kXZ.c(enum_);
    }

    private final void ccu() {
        int n = ((Enum)this.kXZ.evQ()).ordinal();
        this.jHT.Nw(n);
    }

    private void mU(boolean bl) {
        this.kXZ.cec().a(bl, this.jJc);
    }

    static /* synthetic */ void a(hqe hqe2) {
        hqe2.ccu();
    }
}

