/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 */
public class aan
extends zw
implements abt {
    public aan(wy wy2, zb zb2, int n, int n2) {
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
        ha2.a((abt)this);
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
        ha2.b((abt)this);
        super.deactivate();
    }

    @Override
    public void e(int n, int n2, int n3) {
        this.xr();
    }

    @Override
    public boolean xr() {
        ha ha2;
        if (this.xn() && (ha2 = this.wF().mA()) == null) {
            lfn.b(5, this.getClass().getSimpleName(), "checkCondition() : Persistent Session Object is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            this.av(false);
        }
        return this.xl();
    }

    @Override
    public yy a(wy wy2, zb zb2) {
        return super.a(new aan(wy2, zb2, this.getID(), this.xk()));
    }
}

