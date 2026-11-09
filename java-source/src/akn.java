/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cwx
 *  mcs
 */
public class akn
extends aja
implements aki {
    private boolean bqA = false;

    public akn() {
        this.bog = ajb.b.bpf;
    }

    public void b(cwx cwx2) {
        this.bqA = true;
        this.bok = mcs.uzL.bD(new Object[0]);
    }

    @Override
    public final void reset() {
        super.reset();
        this.bqA = false;
    }

    @Override
    protected final boolean BU() {
        return !this.bqA;
    }

    @Override
    public void Ch() {
        assert (this.boj.bfF());
        assert (!this.bqA);
        this.boj.jk().a(this);
    }

    @Override
    public final void Ci() {
        assert (this.boj.bfF());
        this.boj.jk().a((akn)null);
    }
}

