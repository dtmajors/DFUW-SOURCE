/*
 * Decompiled with CFR.
 */
public abstract class hmn
extends hnq {
    protected final hpv kLt;

    public hmn(lbh lbh2, lnh lnh2, hpv hpv2) {
        super(lbh2, lnh2);
        this.kLt = hpv2;
    }

    public final boolean cqi() {
        return this.csJ();
    }

    public final void a(boolean bl, hms hms2) {
        this.b(bl, hms2);
    }

    @Override
    protected void cQ(double d2) {
        assert (this.isConstructed());
        this.a(d2, this.kLt);
    }

    protected void a(double d2, hpv hpv2) {
        assert (this.isConstructed());
        assert (lda.dQ(d2));
        assert (lda.by(hpv2));
    }

    protected void b(boolean bl, hms hms2) {
        assert (this.isConstructed());
        assert (lda.yk(bl));
        assert (lda.by(hms2));
    }
}

