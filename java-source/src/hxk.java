/*
 * Decompiled with CFR.
 */
public class hxk
extends hxj {
    public static final float lkr = 0.0f;
    private final boolean lks;
    private float lkt;
    private float lku;

    public hxk(hxh hxh2, float f2, boolean bl) {
        super(hxh2, f2);
        this.lks = bl;
        if (this.lks) {
            this.lkt = 0.0f;
            this.lku = hxh2.getAlpha();
        } else {
            this.lkt = hxh2.getAlpha();
            this.lku = 0.0f;
        }
    }

    @Override
    protected void cDx() {
        hxs hxs2 = new hxs(hxi.lkj, this.lkt, this.lku, hyf.lnq);
        this.a(hxs2);
    }

    @Override
    protected void aoU() {
    }
}

