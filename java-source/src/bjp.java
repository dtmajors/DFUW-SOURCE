/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class bjp {
    private ldv Rs;
    private String ResourceTypeName;
    private int ResourceType;
    private ljq dph;
    private lgl dpi;

    public final boolean apQ() {
        return lea.enW().isDescendant(this.ResourceType, cug.fss);
    }

    public final boolean apR() {
        return lea.enW().isDescendant(this.ResourceType, cug.fst);
    }

    public final boolean apS() {
        return lea.enW().isDescendant(this.ResourceType, cug.fsu);
    }

    public final ldv oq() {
        return this.Rs;
    }

    public final void hC(ldv ldv2) {
        this.Rs = ldv2;
    }

    public final String apT() {
        return this.ResourceTypeName;
    }

    public final void fK(String string) {
        this.ResourceTypeName = string;
    }

    public final int az() {
        return this.ResourceType;
    }

    public final void l(int n) {
        this.ResourceType = n;
    }

    public final ljq apU() {
        return this.dph;
    }

    public final void aQ(ljq ljq2) {
        this.dph = ljq2;
    }

    public final lgl apV() {
        return this.dpi;
    }

    public final void d(lgl lgl2) {
        this.dpi = lgl2;
    }
}

