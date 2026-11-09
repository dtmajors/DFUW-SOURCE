/*
 * Decompiled with CFR.
 */
public class yp
extends ye {
    public yp(wy wy2, xl xl2, int n) {
        super(wy2, xl2, n);
    }

    @Override
    public void perform() {
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "perform() : Quest is Not Active!!!... Quest = " + this.wF() + ", Action = " + this);
            assert (false);
            return;
        }
        if (this.wH()) {
            return;
        }
        aco.yS().a(this.xc(), this.av(), this);
        super.perform();
    }

    @Override
    public void wO() {
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "perform() : Quest is Not Active!!!... Quest = " + this.wF() + ", Action = " + this);
            assert (false);
            return;
        }
        aco.yS().a(this.xc(), this);
        super.wO();
    }

    @Override
    public xj a(wy wy2, xl xl2) {
        return super.a(new yp(wy2, xl2, this.getID()));
    }
}

