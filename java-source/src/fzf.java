/*
 * Decompiled with CFR.
 */
public class fzf
extends fzb {
    private int gOd;
    private String jbe;
    public String aMH;

    fzf() {
        super(7198);
    }

    public final void a(px px2) {
        this.gOd = px2 == null ? -1 : px2.ordinal();
    }

    public final px uk() {
        if (this.gOd < 0 || this.gOd >= px.aKH.length) {
            return null;
        }
        return px.aKH[this.gOd];
    }

    public final ldv oq() {
        if (this.jbe == null) {
            return null;
        }
        return ldv.zp(this.jbe);
    }

    public final void hC(ldv ldv2) {
        this.jbe = ldv2 == null ? null : ldv2.fk();
    }

    public final String bSR() {
        return this.jbe;
    }

    public final void kP(String string) {
        this.jbe = string;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " FromGUID=" + this.aO() + " ToGUID=" + this.amk() + " Operation=" + (Object)((Object)this.uk()) + " ObjectIdentifier=" + this.jbe;
    }
}

