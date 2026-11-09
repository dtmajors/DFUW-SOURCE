/*
 * Decompiled with CFR.
 */
public class bsp {
    private ldv dJs;
    private ldv aCE;
    private int ResourceType;
    private ljq Position;

    public bsp(ldv ldv2, ldv ldv3, int n, ljq ljq2) {
        this.dJs = ldv2;
        this.aCE = ldv3;
        this.ResourceType = n;
        this.Position = ljq2;
    }

    public ldv axa() {
        return this.dJs;
    }

    public void ju(ldv ldv2) {
        this.dJs = ldv2;
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public ldv sV() {
        return this.aCE;
    }

    public void jv(ldv ldv2) {
        this.aCE = ldv2;
    }
}

