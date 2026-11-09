/*
 * Decompiled with CFR.
 */
public class gtd
extends gtn {
    protected ljq Position = null;
    protected ljq my = null;
    protected int gTT = -1;

    gtd() {
        super(8962);
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public ljq getRotation() {
        return this.my;
    }

    public void setRotation(ljq ljq2) {
        this.my = ljq2;
    }

    public int bvW() {
        return this.gTT;
    }

    public void BC(int n) {
        this.gTT = n;
    }
}

