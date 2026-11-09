/*
 * Decompiled with CFR.
 */
public class abk
extends abj {
    @Override
    public boolean xX() {
        return true;
    }

    public abk(wy wy2, int n) {
        super(wy2, n, abo.bdF);
    }

    public abk(wy wy2, int n, String string) {
        super(wy2, n, abo.bdF, string);
    }

    protected abk(wy wy2, int n, abo abo2) {
        super(wy2, n, abo2);
    }

    protected abk(wy wy2, int n, abo abo2, String string) {
        super(wy2, n, abo2, string);
    }

    @Override
    public void c(acp acp2) {
        if (acp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "taskCompleted() : Task Parameter is Null!!!... Quest = " + this.wF() + ", Node = " + this);
            assert (false);
            return;
        }
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "taskCompleted() : Quest is Not Active!!!... Quest = " + this.wF() + ", Node = " + this + ", Task = " + acp2);
            assert (false);
            return;
        }
        this.wF().b(this, true, false);
        this.wF().cj(this.ay(true));
        this.l(acp2.xk(), false);
    }

    @Override
    public aaz h(wy wy2) {
        return this.a(wy2, new abk(wy2, this.getID()));
    }
}

