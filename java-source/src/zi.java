/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 */
public class zi
extends zx
implements acb {
    @Override
    protected boolean wP() {
        return false;
    }

    public zi(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, n, n2);
    }

    @Override
    public void at(boolean bl) {
        if (this.isActive()) {
            return;
        }
        super.at(bl);
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Condition Not Active!!!... Quest = " + this.wF() + ", Condition = " + this);
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
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Condition Not Active!!!... Quest = " + this.wF() + ", Condition = " + this);
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
    public boolean xr() {
        if (this.xn()) {
            cew cew2 = this.wF().nY();
            if (cew2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "checkCondition() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
                assert (false);
                this.av(false);
            } else {
                this.av(cew2.ld() == this.xz());
            }
        }
        return this.xl();
    }

    @Override
    public void eh(int n) {
        this.xr();
    }

    @Override
    public void ei(int n) {
        this.xr();
    }

    @Override
    public yy a(wy wy2, zb zb2) {
        return super.a(new zi(wy2, zb2, this.getID(), this.xk()));
    }
}

