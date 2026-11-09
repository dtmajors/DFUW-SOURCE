/*
 * Decompiled with CFR.
 */
public class abg
extends abe {
    public abg(wy wy2, int n) {
        super(wy2, n, abo.bdJ);
    }

    public abg(wy wy2, int n, String string) {
        super(wy2, n, abo.bdJ, string);
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
        return this.a(wy2, new abg(wy2, this.getID()));
    }
}

