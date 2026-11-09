/*
 * Decompiled with CFR.
 */
public class ddr
extends ddj {
    public float Radius = 0.0f;
    public boolean dtb = true;

    public ddr() {
        super(cxd.s.fSE);
    }

    @Override
    protected void b(ddj ddj2) {
        super.b(ddj2);
        ddr ddr2 = (ddr)ddj2;
        ddr2.Radius = this.Radius;
        ddr2.dtb = this.dtb;
    }
}

