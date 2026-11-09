/*
 * Decompiled with CFR.
 */
public class zp
extends aai
implements abs {
    public zp(wy wy2, zb zb2, int n, int n2) {
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
        bex bex2 = this.wF().wh();
        if (bex2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Environment Manager Client is Nul!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        bex2.a(this);
    }

    @Override
    public void deactivate() {
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Condition Not Active!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        bex bex2 = this.wF().wh();
        if (bex2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Environment Manager Client is Nul!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        bex2.b(this);
        super.deactivate();
    }

    @Override
    public boolean xr() {
        if (this.xn()) {
            bex bex2 = this.wF().wh();
            if (bex2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "checkCondition() : Environment Manager Client is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
                assert (false);
                this.av(false);
            } else {
                switch (this.xK()) {
                    case bcP: {
                        this.av(!bex2.anK() && !bex2.anL());
                        break;
                    }
                    case bcQ: {
                        this.av(bex2.anK() && !bex2.anL());
                        break;
                    }
                    case bcR: {
                        this.av(!bex2.anK() && bex2.anL());
                    }
                }
            }
        }
        return this.xl();
    }

    @Override
    public void xu() {
        this.xr();
    }

    @Override
    public yy a(wy wy2, zb zb2) {
        return super.a(new zp(wy2, zb2, this.getID(), this.xk()));
    }
}

