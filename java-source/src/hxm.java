/*
 * Decompiled with CFR.
 */
public class hxm
extends hxj {
    private float lkz;
    private float lkB;
    private float lkA;
    private float lkC;
    private final boolean lks;

    public hxm(hxh hxh2, float f2, boolean bl) {
        super(hxh2, f2);
        this.lks = bl;
        if (this.lks) {
            this.lkz = -4000.0f;
            this.lkB = -4000.0f;
            this.lkA = hxh2.getX();
            this.lkC = hxh2.getY();
        } else {
            this.lkz = hxh2.getX();
            this.lkB = hxh2.getY();
            this.lkA = -hxh2.getWidth();
            this.lkC = -hxh2.getHeight();
        }
    }

    @Override
    protected void cDx() {
        if (this.lks) {
            this.lkz = -this.cDt().getWidth();
            this.lkB = -this.cDt().getHeight();
        }
        this.a(new hxs(hxi.lkg, this.lkz, this.lkA, hyf.lnq));
        this.a(new hxs(hxi.lkh, this.lkB, this.lkC, hyf.lnq));
    }

    @Override
    protected void aoU() {
    }
}

