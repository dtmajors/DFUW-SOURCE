/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 */
public class aeq
extends adz
implements abr {
    public aeq(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, n, n2);
    }

    public aeq(wy wy2, acr acr2, int n, int n2, String string) {
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
        cex2.a((abr)this);
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
        cex2.b((abr)this);
        super.deactivate();
    }

    @Override
    public void a(float f, int n, int n2) {
        if (this.isComplete()) {
            return;
        }
        if (n == this.zg()) {
            this.W(this.zf() + Math.abs(f));
            this.aD(false);
            this.yZ();
        }
    }

    @Override
    public boolean yZ() {
        if (this.xn()) {
            this.aC(this.zf() >= this.uO());
        }
        return this.isComplete();
    }

    @Override
    public acp b(wy wy2, acr acr2) {
        return super.a(new aeq(wy2, acr2, this.getID(), this.xk()));
    }
}

