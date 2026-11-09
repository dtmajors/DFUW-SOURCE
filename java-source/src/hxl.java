/*
 * Decompiled with CFR.
 */
public class hxl
extends hxj {
    private final boolean lks;
    private float lkv;
    private float lkw;
    private float lkx;
    private float lky;
    private float lkz;
    private float lkA;
    private float lkB;
    private float lkC;
    public static final float lkD = 0.9f;
    public static final float lkE = 0.001f;

    public hxl(hxh hxh2, float f2, boolean bl) {
        super(hxh2, f2);
        this.lks = bl;
        if (this.lks) {
            this.lkv = 0.9f * hxh2.cCZ();
            this.lkw = hxh2.cCZ();
            this.lkx = 0.001f * hxh2.cDa();
            this.lky = hxh2.cDa();
            this.lkz = (hxh2.getWidth() - hxh2.getWidth() * 0.9f) / 2.0f + hxh2.getX();
            this.lkA = hxh2.getX();
            this.lkB = (hxh2.getHeight() - hxh2.getHeight() * 0.001f) / 2.0f + hxh2.getY();
            this.lkC = hxh2.getY();
        } else {
            this.lkw = 0.9f * hxh2.cCZ();
            this.lkv = hxh2.cCZ();
            this.lky = 0.001f * hxh2.cDa();
            this.lkx = hxh2.cDa();
            this.lkA = (hxh2.getWidth() - hxh2.getWidth() * 0.9f) / 2.0f + hxh2.getX();
            this.lkz = hxh2.getX();
            this.lkC = (hxh2.getHeight() - hxh2.getHeight() * 0.001f) / 2.0f + hxh2.getY();
            this.lkB = hxh2.getY();
        }
    }

    @Override
    protected void cDx() {
        hxs hxs2 = new hxs(hxi.lke, this.lkv, this.lkw, hyf.lnq);
        this.a(hxs2);
        hxs2 = new hxs(hxi.lkf, this.lkx, this.lky, this.lks ? hyf.lnu : hyf.lnt);
        this.a(hxs2);
        hxs2 = new hxs(hxi.lkg, this.lkz, this.lkA, hyf.lnq);
        this.a(hxs2);
        hxs2 = new hxs(hxi.lkh, this.lkB, this.lkC, this.lks ? hyf.lnu : hyf.lnt);
        this.a(hxs2);
    }

    @Override
    protected void aoU() {
    }
}

