/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 */
public class zm
extends aab
implements aca {
    private float bcw = 0.0f;

    public zm(wy wy2, zb zb2, int n, int n2) {
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
        this.bcw = Float.MAX_VALUE;
        cew cew2 = this.wF().nY();
        if (cew2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        cew2.a((aca)this, this.az());
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
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        cew2.b((aca)this, this.az());
        super.deactivate();
    }

    @Override
    public boolean xr() {
        if (this.xn()) {
            this.av(this.bcw <= this.xD());
        }
        return this.xl();
    }

    @Override
    public void a(int n, float f2, ldv ldv2, ljq ljq2) {
        this.bcw = f2;
        this.xr();
    }

    @Override
    public yy a(wy wy2, zb zb2) {
        return super.a(new zm(wy2, zb2, this.getID(), this.xk()));
    }
}

