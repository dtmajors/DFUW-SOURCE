/*
 * Decompiled with CFR.
 */
public abstract class abe
extends aay {
    private int bdc = 0;

    protected abe(wy wy2, int n, abo abo2) {
        super(wy2, n, abo2);
    }

    protected abe(wy wy2, int n, abo abo2, String string) {
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
        ++this.bdc;
        if (this.bdc == this.xV() || this.xX()) {
            this.wF().b(this, true, false);
            this.wF().cj(this.ay(true));
            this.l(acp2.xk(), false);
        }
    }
}

