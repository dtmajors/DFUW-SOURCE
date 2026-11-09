/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
public abstract class akh
extends aja
implements aki,
cyk {
    protected cvk.a bqu = null;
    protected boolean bqv = true;
    protected boolean bqw = false;
    protected ldv bqx = null;

    @Override
    public final cvk.a Do() {
        return this.bqu;
    }

    public final void a(cvk.a a2) {
        this.bqu = a2;
    }

    @Override
    protected final boolean BU() {
        if (!this.bqv) {
            // empty if block
        }
        return this.bqv;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        akh akh2 = (akh)aja2;
        akh2.a(this.bqu);
    }

    protected final void Dp() {
        this.bok = null;
        switch (this.bqu) {
            case fzJ: {
                this.bok = mcs.uAu.bD(this.boj.Bu());
                break;
            }
            case fzL: {
                this.bok = mcs.uAu.bD(this.boj.Bu());
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public final void Dq() {
        this.bqv = false;
    }

    @Override
    public void Dr() {
    }

    @Override
    public void fP(int n) {
    }

    @Override
    public void Ch() {
        assert (this.bqu != null);
        assert (this.boj.bfF());
        assert (!this.bqw);
        assert (this.bqv);
    }

    @Override
    public final void Ci() {
        assert (this.bqu != null);
        assert (this.boj.bfF());
        if (this.bqw) {
            this.boj.jk().bhj().b(this, this.bqx);
            this.bqv = true;
            this.bqw = false;
            this.bqx = null;
        }
    }
}

