/*
 * Decompiled with CFR.
 */
public class yk
extends xx {
    public yk(wy wy2, xl xl2, int n) {
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
    }

    @Override
    public xj a(wy wy2, xl xl2) {
        return super.a(new yk(wy2, xl2, this.getID()));
    }
}

