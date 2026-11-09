/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cex
 */
public class aeh
extends adn
implements abv {
    public aeh(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, n, n2);
    }

    public aeh(wy wy2, acr acr2, int n, int n2, String string) {
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
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Task Not Active!!!... Quest = " + this.wF() + ", Task = " + this);
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
        if (this.isComplete()) {
            return;
        }
        if (n != this.az()) {
            return;
        }
        this.yZ();
    }

    @Override
    public boolean yZ() {
        if (this.xn()) {
            cex cex2 = this.wF().nW();
            if (cex2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "checkCompletion() : Player Object Server is Null!!!... Quest = " + this.wF() + ", Task = " + this);
                assert (false);
                this.aC(false);
            } else {
                bri bri2;
                int n = 0;
                if (this.xB()) {
                    bri bri3 = cex2.aJC() == null ? null : (cex2.aJC().asf() == null ? null : (bri2 = cex2.aJC().asf() instanceof bri ? (bri)cex2.aJC().asf() : null));
                    if (bri2 == null) {
                        lfn.b(5, this.getClass().getSimpleName(), "checkCompletion() : Backpack Inventory is Null!!!... Quest = " + this.wF() + ", Task = " + this);
                        assert (false);
                        this.aC(false);
                    } else if (bri2.aup() == null) {
                        lfn.b(5, this.getClass().getSimpleName(), "checkCompletion() : Backpack Inventory Query Manager is Null!!!... Quest = " + this.wF() + ", Task = " + this);
                        assert (false);
                        this.aC(false);
                    } else {
                        n += bri2.aup().mp(this.az());
                    }
                }
                if (this.xC()) {
                    Object object = cex2.aMA() == null ? null : (cex2.aMA().mB() == null ? null : (cex2.aMA().mB().aJC() == null ? null : (cex2.aMA().mB().aJC().asf() == null ? null : (bri2 = cex2.aMA().mB().aJC().asf() instanceof bri ? (bri)cex2.aMA().mB().aJC().asf() : null))));
                    if (bri2 == null) {
                        lfn.b(5, this.getClass().getSimpleName(), "checkCompletion() : Bank Inventory is Null!!!... Quest = " + this.wF() + ", Task = " + this);
                        assert (false);
                        this.aC(false);
                    } else if (bri2.aup() == null) {
                        lfn.b(5, this.getClass().getSimpleName(), "checkCompletion() : Bank Inventory Query Manager is Null!!!... Quest = " + this.wF() + ", Task = " + this);
                        assert (false);
                        this.aC(false);
                    } else {
                        n += bri2.aup().mp(this.az());
                    }
                }
                if (n != this.ze()) {
                    this.eq(n);
                    this.aD(false);
                    this.aC(n >= this.vf());
                }
            }
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
        return super.a(new aeh(wy2, acr2, this.getID(), this.xk()));
    }
}

