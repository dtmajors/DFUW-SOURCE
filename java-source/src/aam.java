/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 */
public class aam
extends zv {
    public aam(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, n, n2);
    }

    @Override
    public boolean xr() {
        if (this.xn()) {
            ha ha2 = this.wF().mA();
            if (ha2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "checkCondition() : Persistent Session Object is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
                assert (false);
                this.av(false);
            } else {
                this.av(ha2.js() == this.cB());
            }
        }
        return this.xl();
    }

    @Override
    public yy a(wy wy2, zb zb2) {
        return super.a(new aam(wy2, zb2, this.getID(), this.xk()));
    }
}

