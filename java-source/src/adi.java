/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cxd
 */
public class adi
extends aec
implements ace {
    public adi(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, n, n2);
    }

    public adi(wy wy2, acr acr2, int n, int n2, String string) {
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
        if (cxd.xA((int)this.zg())) {
            cew cew2 = this.wF().nY();
            if (cew2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "activate() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Task = " + this);
                assert (false);
                return;
            }
            cew2.a((ace)this);
        }
    }

    @Override
    public void deactivate() {
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Task Not Active!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        if (cxd.xA((int)this.zg())) {
            cew cew2 = this.wF().nY();
            if (cew2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Task = " + this);
                assert (false);
                return;
            }
            cew2.b((ace)this);
        }
        super.deactivate();
    }

    @Override
    public void E(int n, int n2) {
        if (!cxd.xA((int)n)) {
            return;
        }
        if (n == this.zg()) {
            this.aC(true);
        }
    }

    @Override
    public acp b(wy wy2, acr acr2) {
        return super.a(new adi(wy2, acr2, this.getID(), this.xk()));
    }
}

