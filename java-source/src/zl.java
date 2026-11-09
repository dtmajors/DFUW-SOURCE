/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 */
public class zl
extends aaa
implements abz {
    public zl(wy wy2, zb zb2, int n, int n2) {
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
        cew2.a((abz)this);
    }

    @Override
    public void deactivate() {
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Condition Not Active!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        cew cew2 = this.wF().nY();
        if (cew2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        cew2.b((abz)this);
        super.deactivate();
    }

    @Override
    public void h(int n, ldv ldv2) {
        if (n == this.az()) {
            this.av(true);
        }
    }

    @Override
    public yy a(wy wy2, zb zb2) {
        return super.a(new zl(wy2, zb2, this.getID(), this.xk()));
    }
}

