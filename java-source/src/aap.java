/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cex
 */
public class aap
extends zy {
    private ldv bcv = null;

    public aap(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, n, n2);
    }

    @Override
    public boolean xq() {
        return false;
    }

    @Override
    protected void xs() {
        if (this.xA()) {
            cex cex2 = this.wF().nW();
            if (cex2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "onOpposingManagerChangedState() : Player Object is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
                assert (false);
                return;
            }
            ((bri)cex2.aJC().asf()).a(this.bcv, bqy.dHw);
        }
    }

    @Override
    protected void c(gds gds2) {
        this.bcv = gds2.bUa();
    }

    @Override
    public yy a(wy wy2, zb zb2) {
        return super.a(new aap(wy2, zb2, this.getID(), this.xk()));
    }
}

