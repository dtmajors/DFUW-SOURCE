/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class cqc {
    private ldv Rs;
    private String ResourceTypeName;
    private int ResourceType;
    private ljq dph;
    private lgl dpi;

    public boolean aYq() {
        assert (this.ResourceType > 0);
        return lea.enW().isDescendant(this.ResourceType, cug.fqO);
    }

    public boolean aYr() {
        return lea.enW().isDescendant(this.ResourceType, cug.fqP);
    }

    public int getBase() {
        String string = this.ResourceTypeName + "_Base";
        return lea.enW().getType(string);
    }

    public final ldv oq() {
        return this.Rs;
    }

    public final void hC(ldv ldv2) {
        this.Rs = ldv2;
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

    public final String apT() {
        return this.ResourceTypeName;
    }

    public final void fK(String string) {
        this.ResourceTypeName = string;
    }
}

