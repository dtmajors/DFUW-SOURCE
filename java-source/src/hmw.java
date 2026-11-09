/*
 * Decompiled with CFR.
 */
public abstract class hmw {
    private final ldl kMt = new ldl();
    public final hrt kMu;
    private final lbn kMv = new lbn(this){
        final /* synthetic */ hmw kMw;
        {
            this.kMw = hmw2;
        }

        public final void W() {
            this.kMw.ccd();
        }
    };

    public hmw(hrt hrt2) {
        this.kMu = hrt2;
        this.nb(true);
    }

    public final void dispose() {
        this.cbg();
    }

    public final void refresh() {
        this.ccd();
    }

    public int crs() {
        return this.kMu.getSize();
    }

    public final lbl<lbn> crt() {
        return this.kMt;
    }

    public abstract int cru();

    public abstract int Nk(int var1);

    public abstract int Nl(int var1);

    public abstract int Nm(int var1);

    protected void cbg() {
        this.nb(false);
    }

    protected void ccd() {
        this.kMt.enp();
    }

    private void nb(boolean bl) {
        this.kMu.cwH().a(bl, this.kMv);
    }
}

