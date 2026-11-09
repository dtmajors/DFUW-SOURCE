/*
 * Decompiled with CFR.
 */
public class wc
extends wr {
    public lcp aYt = null;

    public wc() {
        super((byte)3);
    }

    @Override
    public void c(uk uk2) {
        super.c(uk2);
        uc uc2 = (uc)uk2;
        if (uc2.aWl == null) {
            this.aYt = null;
            return;
        }
        this.aYt = new lcp(uc2.aWl.r, uc2.aWl.g, uc2.aWl.b, uc2.aWl.a);
    }

    @Override
    protected void d(uk uk2) {
        super.d(uk2);
        uc uc2 = (uc)uk2;
        uc2.aWl = this.aYt != null ? lcp.b(this.aYt) : null;
    }

    @Override
    public boolean e(uk uk2) {
        if (!super.e(uk2)) {
            return false;
        }
        uc uc2 = (uc)uk2;
        if (this.aYt == null) {
            assert (uc2.aWl == null);
            return true;
        }
        return this.aYt.U(uc2.aWl);
    }
}

