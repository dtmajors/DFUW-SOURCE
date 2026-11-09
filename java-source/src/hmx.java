/*
 * Decompiled with CFR.
 */
public class hmx
extends hmw {
    private int kMx;
    private int kMy;

    public hmx(hrt hrt2, int n) {
        super(hrt2);
        this.kMx = n;
        this.nb(true);
    }

    public final int crv() {
        return this.kMx;
    }

    public final boolean Nn(int n) {
        if (n == this.kMx) {
            return false;
        }
        this.kMx = n;
        return true;
    }

    @Override
    public int crs() {
        return this.kMy;
    }

    @Override
    public int cru() {
        return this.kMx * this.kMy;
    }

    @Override
    public int Nk(int n) {
        assert (n >= 0 && n < this.kMy) : n;
        return this.kMx;
    }

    @Override
    public int Nl(int n) {
        assert (n >= 0 && n < this.kMy) : n;
        int n2 = this.kMx * n;
        assert (n2 >= 0 && n2 < this.cru());
        return n2;
    }

    @Override
    public int Nm(int n) {
        assert (n >= 0 && n < this.cru()) : n;
        int n2 = n / this.kMx;
        assert (n2 >= 0 && n2 < this.kMy);
        return n2;
    }

    @Override
    protected void ccd() {
        int n = this.kMu.getSize();
        if (this.kMy == n) {
            return;
        }
        this.kMy = n;
        super.ccd();
    }

    @Override
    protected void cbg() {
        this.nb(false);
        super.cbg();
    }

    private void nb(boolean bl) {
        assert (lda.yk(bl));
    }
}

