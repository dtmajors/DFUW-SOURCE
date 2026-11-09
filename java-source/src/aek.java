/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 */
public class aek
extends adq
implements abu {
    public aek(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, n, n2);
    }

    public aek(wy wy2, acr acr2, int n, int n2, String string) {
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
        cex2.a((abu)this);
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
        cex2.b((abu)this);
        super.deactivate();
    }

    @Override
    public void D(int n, int n2) {
        if (this.isComplete()) {
            return;
        }
        if (n == this.az() || lea.enW().isDescendant(n, this.az())) {
            this.eq(this.ze() + n2);
            this.aD(false);
            this.yZ();
        }
    }

    @Override
    public boolean yZ() {
        if (this.xn()) {
            this.aC(this.ze() >= this.vf());
        }
        return this.isComplete();
    }

    @Override
    protected void b(gec gec2) {
        if (gec2 != null) {
            gec2.Jc(this.ze());
        }
    }

    @Override
    public acp b(wy wy2, acr acr2) {
        return super.a(new aek(wy2, acr2, this.getID(), this.xk()));
    }
}

