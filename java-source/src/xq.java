/*
 * Decompiled with CFR.
 */
public class xq
extends ya {
    private int bby = -1;

    public xq(wy wy2, xl xl2, int n) {
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
        if (this.bby >= 0) {
            return;
        }
        this.bby = jcc.dwT().a(this.wF().getID(), null, this.wZ(), this.xa());
    }

    @Override
    public void wO() {
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "perform() : Quest is Not Active!!!... Quest = " + this.wF() + ", Action = " + this);
            assert (false);
            return;
        }
        if (this.bby < 0) {
            return;
        }
        jcc.dwT().fm(this.wF().getID(), this.bby);
    }

    @Override
    public xj a(wy wy2, xl xl2) {
        return super.a(new xq(wy2, xl2, this.getID()));
    }
}

