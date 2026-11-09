/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 */
public class aat
extends aag
implements acg {
    public aat(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, n, n2);
        assert (false) : "Due to the fact that the trainer is not enabled anymore, noone should use this kind of trigger.";
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
            lfn.b(5, this.getClass().getSimpleName(), "activate() : PSO is null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
    }

    @Override
    public void deactivate() {
        if (!this.isActive()) {
            return;
        }
        ha ha2 = this.wF().mA();
        if (ha2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : PSO is null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        super.deactivate();
    }

    @Override
    public boolean xr() {
        ha ha2;
        if (this.xn() && (ha2 = this.wF().mA()) == null) {
            lfn.b(5, this.getClass().getSimpleName(), "checkCondition() : PSO is null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            this.av(false);
        }
        return this.xl();
    }

    @Override
    public void em(int n) {
        this.xr();
    }

    @Override
    public yy a(wy wy2, zb zb2) {
        return super.a(new aat(wy2, zb2, this.getID(), this.xk()));
    }
}

