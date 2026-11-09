/*
 * Decompiled with CFR.
 */
public class abh
extends aay {
    public abh(wy wy2, int n) {
        super(wy2, n, abo.bdD);
    }

    public abh(wy wy2, int n, String string) {
        super(wy2, n, abo.bdD, string);
    }

    protected abh(wy wy2, int n, abo abo2) {
        super(wy2, n, abo2);
    }

    protected abh(wy wy2, int n, abo abo2, String string) {
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

    @Override
    public void a(int n, int n2, boolean bl, boolean bl2) {
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "receiveInput() : Quest is Not Active!!!... Quest = " + this.wF() + ", Node = " + this + ", In-Edge ID = " + n + ", Input-Value = " + n2);
            assert (false);
            return;
        }
        this.wF().a(this, bl, bl2);
    }

    @Override
    public aaz h(wy wy2) {
        return this.a(wy2, new abh(wy2, this.getID()));
    }
}

