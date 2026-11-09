/*
 * Decompiled with CFR.
 */
public class ddo
extends ddj {
    public boolean gem = false;
    public float dum = 0.0f;

    public ddo() {
        super(cxd.s.fSB);
    }

    @Override
    public boolean bkb() {
        return this.gem;
    }

    @Override
    protected void b(ddj ddj2) {
        super.b(ddj2);
        ddo ddo2 = (ddo)ddj2;
        ddo2.gem = this.gem;
        ddo2.dum = this.dum;
    }
}

