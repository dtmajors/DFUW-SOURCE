/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 */
public class aak
extends zr
implements abp {
    public aak(wy wy2, zb zb2, int n, int n2) {
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
        ha2.a((abp)this);
    }

    @Override
    public void deactivate() {
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Condition Not Active!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        ha ha2 = this.wF().mA();
        if (ha2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : PSO is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        ha2.b((abp)this);
        super.deactivate();
    }

    @Override
    public void B(int n, int n2) {
        this.xr();
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
                this.av(this.xv().A(ha2.getAlignment(), this.getAlignment()));
            }
        }
        return this.xl();
    }

    @Override
    public yy a(wy wy2, zb zb2) {
        return super.a(new aak(wy2, zb2, this.getID(), this.xk()));
    }
}

