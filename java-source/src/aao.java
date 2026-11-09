/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 */
public class aao
extends zx
implements acb {
    @Override
    protected boolean wP() {
        return false;
    }

    public aao(wy wy2, zb zb2, int n, int n2) {
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
        ha ha2 = this.wF().mA();
        if (ha2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : PSO is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        ha2.a((acb)this);
    }

    @Override
    public void deactivate() {
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Condition Not Active!!!... Quest = " + this.wF() + ", Condition = " + this);
            return;
        }
        ha ha2 = this.wF().mA();
        if (ha2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : PSO is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        ha2.b((acb)this);
        super.deactivate();
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
                this.av(ha2.ld() == this.xz());
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
        return super.a(new aao(wy2, zb2, this.getID(), this.xk()));
    }
}

