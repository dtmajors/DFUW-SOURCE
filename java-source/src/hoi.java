/*
 * Decompiled with CFR.
 */
public abstract class hoi<CELL, CELL_COMPONENT extends hms>
extends hoj<CELL_COMPONENT> {
    public final hrr<CELL> kSb;
    private final lbn kSc = new lbn(this){
        final /* synthetic */ hoi kSd;
        {
            this.kSd = hoi2;
        }

        public final void W() {
            this.kSd.refresh();
        }
    };
    private boolean Initialized;

    public hoi(hnc hnc2, String string, lgg lgg2, lhf lhf2, hoj.b b2, hrr<CELL> hrr2, hmw[] hmwArray) {
        super(hnc2, string, lgg2, lhf2, b2, hmwArray);
        this.kSb = hrr2;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.nb(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.nb(false);
        super.FG();
        this.Initialized = false;
    }

    private void nb(boolean bl) {
        this.kSb.cec().a(bl, this.kSc);
    }
}

