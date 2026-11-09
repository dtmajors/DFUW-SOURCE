/*
 * Decompiled with CFR.
 */
public class xr
extends yb {
    public xr(wy wy2, xl xl2, int n) {
        super(wy2, xl2, n);
    }

    @Override
    public boolean wK() {
        return true;
    }

    @Override
    public void perform() {
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "perform() : Quest is Not Active!!!... Quest = " + this.wF() + ", Action = " + this);
            assert (false);
            return;
        }
        jcc.dwT().fn(this.wF().getID(), this.xb());
    }

    @Override
    public void wO() {
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "perform() : Quest is Not Active!!!... Quest = " + this.wF() + ", Action = " + this);
            assert (false);
            return;
        }
        jcc.dwT().fo(this.wF().getID(), this.xb());
    }

    @Override
    public xj a(wy wy2, xl xl2) {
        return super.a(new xr(wy2, xl2, this.getID()));
    }
}

