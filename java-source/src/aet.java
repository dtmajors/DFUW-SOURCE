/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 */
public class aet
extends aed
implements ace {
    public aet(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, n, n2);
    }

    public aet(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, n, n2, string);
    }

    @Override
    public void activate() {
        if (this.isActive()) {
            return;
        }
        super.activate();
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Task Not Active!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        cex cex2 = this.wF().nW();
        if (cex2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Player Object Server is Null!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        cex2.c((ace)this);
    }

    @Override
    public void deactivate() {
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Task Not Active!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        cex cex2 = this.wF().nW();
        if (cex2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Player Object Server is Null!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        cex2.d((ace)this);
        super.deactivate();
    }

    @Override
    public void E(int n, int n2) {
        if (n == this.zg() && (n2 == this.az() || lea.enW().isDescendant(n2, this.az()))) {
            this.aC(true);
        }
    }

    @Override
    public acp b(wy wy2, acr acr2) {
        return super.a(new aet(wy2, acr2, this.getID(), this.xk()));
    }
}

