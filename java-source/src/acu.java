/*
 * Decompiled with CFR.
 */
public class acu
extends adl {
    public acu(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, n, n2);
    }

    public acu(wy wy2, acr acr2, int n, int n2, String string) {
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
    }

    @Override
    public void deactivate() {
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Task Not Active!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        super.deactivate();
    }

    @Override
    protected jcn zd() {
        return this.yV() ? new jcn(this.getID(), this.yp(), true, true, this.wF().dF(this.xT()).xQ()) : new jcn(this.getID(), this.yp(), true, true);
    }

    @Override
    public acp b(wy wy2, acr acr2) {
        return super.a(new acu(wy2, acr2, this.getID(), this.xk()));
    }
}

