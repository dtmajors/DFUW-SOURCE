/*
 * Decompiled with CFR.
 */
public abstract class abj
extends aay {
    protected abj(wy wy2, int n, abo abo2) {
        super(wy2, n, abo2);
    }

    protected abj(wy wy2, int n, abo abo2, String string) {
        super(wy2, n, abo2, string);
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
}

