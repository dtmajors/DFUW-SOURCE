/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class clj {
    private ldv diQ;
    private String YU;
    private String YV;
    private boolean eIQ;

    public static final int rx(int n) {
        int n2 = 0;
        if (n == cug.fre) {
            n2 = 5;
        } else if (n == cug.frf) {
            n2 = 10;
        } else assert (false);
        return n2;
    }

    public final ldv aoC() {
        return this.diQ;
    }

    public final void hh(ldv ldv2) {
        this.diQ = ldv2;
    }

    public final String iP() {
        return this.YU;
    }

    public final void aM(String string) {
        this.YU = string;
    }

    public final String iR() {
        return this.YV;
    }

    public final void aN(String string) {
        this.YV = string;
    }

    public lip aSc() {
        return new ljk(this.YU + " " + this.YV);
    }

    public final boolean aSd() {
        return this.eIQ;
    }

    public final void gm(boolean bl) {
        this.eIQ = bl;
    }
}

