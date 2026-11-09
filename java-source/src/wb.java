/*
 * Decompiled with CFR.
 */
public class wb
extends wr {
    public lcp aYt = null;

    public wb() {
        super((byte)2);
    }

    @Override
    public void c(uk uk2) {
        super.c(uk2);
        ub ub2 = (ub)uk2;
        if (ub2.aWk == null) {
            this.aYt = null;
            return;
        }
        this.aYt = new lcp(ub2.aWk.bVf(), ub2.aWk.bVg(), ub2.aWk.bVh(), 1.0f);
    }

    @Override
    public void d(uk uk2) {
        super.d(uk2);
        ub ub2 = (ub)uk2;
        ub2.aWk = this.aYt != null ? lcp.a(this.aYt) : null;
    }

    @Override
    public boolean e(uk uk2) {
        if (!super.e(uk2)) {
            return false;
        }
        ub ub2 = (ub)uk2;
        if (this.aYt == null) {
            assert (ub2.aWk == null);
            return true;
        }
        return this.aYt.m(ub2.aWk);
    }
}

