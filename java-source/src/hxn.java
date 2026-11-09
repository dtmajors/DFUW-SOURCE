/*
 * Decompiled with CFR.
 */
public class hxn
extends hxj {
    public static final float lkF = 0.001f;
    private float lkG;
    private float lkH;
    private final boolean lks;

    public hxn(hxh hxh2, float f2, boolean bl) {
        super(hxh2, f2);
        this.lks = bl;
        if (this.lks) {
            this.lkG = 0.001f;
            this.lkH = hxh2.cCZ();
        } else {
            this.lkH = 0.001f;
            this.lkG = hxh2.cCZ();
        }
    }

    @Override
    protected void cDx() {
        hxs hxs2 = new hxs(hxi.lke, this.lkG, this.lkH, hyf.lnq);
        this.a(hxs2);
        hxs2 = new hxs(hxi.lkf, this.lkG, this.lkH, hyf.lnq);
        this.a(hxs2);
    }

    @Override
    protected void aoU() {
    }
}

