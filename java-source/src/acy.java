/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 */
public class acy
extends adp
implements acb {
    public acy(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, n, n2);
    }

    public acy(wy wy2, acr acr2, int n, int n2, String string) {
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
        cew cew2 = this.wF().nY();
        if (cew2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        cew2.a((acb)this);
    }

    @Override
    public void deactivate() {
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Task Not Active!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        cew cew2 = this.wF().nY();
        if (cew2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        cew2.b((acb)this);
        super.deactivate();
    }

    @Override
    public boolean yZ() {
        if (this.xn()) {
            cew cew2 = this.wF().nY();
            if (cew2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "checkCompletion() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Task = " + this);
                assert (false);
                this.aC(false);
            } else {
                this.aC(cew2.ld() == this.xz());
            }
        }
        return this.isComplete();
    }

    @Override
    public void eh(int n) {
        this.yZ();
    }

    @Override
    public void ei(int n) {
        this.yZ();
    }

    @Override
    public acp b(wy wy2, acr acr2) {
        return super.a(new acy(wy2, acr2, this.getID(), this.xk()));
    }
}

