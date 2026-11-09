/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cex
 */
public class aee
extends adk {
    private ldv bcv = null;

    public aee(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, n, n2);
    }

    public aee(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, n, n2, string);
    }

    @Override
    public boolean yY() {
        return false;
    }

    @Override
    protected void xs() {
        if (this.xA()) {
            cex cex2 = this.wF().nW();
            if (cex2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "onOpposingManagerChangedState() : Player Object is Null!!!... Quest = " + this.wF() + ", Task = " + this);
                assert (false);
                return;
            }
            ((bri)cex2.aJC().asf()).a(this.bcv, bqy.dHw);
        }
    }

    @Override
    protected void c(gec gec2) {
        this.bcv = gec2.bUa();
    }

    @Override
    public acp b(wy wy2, acr acr2) {
        return super.a(new aee(wy2, acr2, this.getID(), this.xk()));
    }
}

