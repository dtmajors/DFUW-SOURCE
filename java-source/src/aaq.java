/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cex
 */
public class aaq
extends zz
implements abv {
    public aaq(wy wy2, zb zb2, int n, int n2) {
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
        cex cex2 = this.wF().nW();
        if (cex2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Player Object is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        if (this.xB()) {
            cex2.a((abv)this, bqm.b.dEn);
        }
        if (this.xC()) {
            cex2.a((abv)this, bqm.b.dEo);
        }
    }

    @Override
    public void deactivate() {
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Condition Not Active!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        cex cex2 = this.wF().nW();
        if (cex2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Player Object is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        cex2.b((abv)this);
        super.deactivate();
    }

    @Override
    public void el(int n) {
        if (n != this.az()) {
            return;
        }
        this.xr();
    }

    @Override
    public boolean xr() {
        if (this.xn()) {
            cex cex2 = this.wF().nW();
            if (cex2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "checkCondition() : Player Object Server is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
                assert (false);
                this.av(false);
            } else {
                bri bri2;
                int n = 0;
                if (this.xB()) {
                    bri bri3 = cex2.aJC() == null ? null : (cex2.aJC().asf() == null ? null : (bri2 = cex2.aJC().asf() instanceof bri ? (bri)cex2.aJC().asf() : null));
                    if (bri2 == null) {
                        lfn.b(5, this.getClass().getSimpleName(), "checkCondition() : Backpack Inventory is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
                        assert (false);
                        this.av(false);
                    } else if (bri2.aup() == null) {
                        lfn.b(5, this.getClass().getSimpleName(), "checkCondition() : Backpack Inventory Query Manager is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
                        assert (false);
                        this.av(false);
                    } else {
                        n += bri2.aup().mp(this.az());
                    }
                }
                if (this.xC()) {
                    Object object = cex2.aMA() == null ? null : (cex2.aMA().mB() == null ? null : (cex2.aMA().mB().aJC() == null ? null : (cex2.aMA().mB().aJC().asf() == null ? null : (bri2 = cex2.aMA().mB().aJC().asf() instanceof bri ? (bri)cex2.aMA().mB().aJC().asf() : null))));
                    if (bri2 == null) {
                        lfn.b(5, this.getClass().getSimpleName(), "checkCondition() : Bank Inventory is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
                        assert (false);
                        this.av(false);
                    } else if (bri2.aup() == null) {
                        lfn.b(5, this.getClass().getSimpleName(), "checkCondition() : Bank Inventory Query Manager is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
                        assert (false);
                        this.av(false);
                    } else {
                        n += bri2.aup().mp(this.az());
                    }
                }
                this.av(n >= this.vf());
            }
        }
        return this.xl();
    }

    @Override
    public yy a(wy wy2, zb zb2) {
        return super.a(new aaq(wy2, zb2, this.getID(), this.xk()));
    }
}

