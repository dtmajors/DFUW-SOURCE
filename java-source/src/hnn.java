/*
 * Decompiled with CFR.
 */
public class hnn
extends hnk {
    private int kOX = -1;
    private int kOY = -1;

    public hnn(hrt hrt2) {
        super(hrt2);
        this.mU(true);
    }

    public final boolean R(int n, boolean bl) {
        int n2 = bl ? this.kOY : n;
        return this.cH(n, n2);
    }

    public final boolean cH(int n, int n2) {
        assert (n == -1 || n >= 0 && n <= this.csB());
        assert (n2 == -1 || n2 >= 0 && n2 <= this.csB());
        if (n == this.kOX && n2 == this.kOY) {
            return false;
        }
        this.kOX = n;
        this.kOY = n2;
        this.csy();
        return true;
    }

    @Override
    protected void cbg() {
        this.mU(false);
        super.cbg();
    }

    @Override
    protected void csx() {
        int n;
        int n2 = this.kOX;
        int n3 = this.csB();
        if (n2 >= n3) {
            n2 = n3 - 1;
        }
        if ((n = this.kOY) >= n3) {
            n = n3 - 1;
        }
        this.cH(n2, n);
    }

    @Override
    protected boolean Nt(int n) {
        int n2 = this.kOX;
        int n3 = this.kOY;
        if (n2 > n3) {
            int n4 = n2;
            n2 = n3;
            n3 = n4;
        }
        return n >= n2 && n <= n3;
    }

    @Override
    protected boolean Q(int n, boolean bl) {
        return this.R(n, bl);
    }

    @Override
    protected boolean oc(boolean bl) {
        if (this.kOY == -1) {
            return false;
        }
        if (!bl) {
            boolean bl2 = this.R(-1, false);
            assert (bl2);
        }
        return true;
    }

    @Override
    protected boolean od(boolean bl) {
        int n;
        int n2 = this.kOX;
        int n3 = this.kOY;
        if (n2 > n3) {
            n = n2;
            n2 = n3;
            n3 = n;
        }
        if (n2 == 0 && n3 == this.csB() - 1) {
            return false;
        }
        if (!bl) {
            n = this.cH(this.csB() - 1, 0) ? 1 : 0;
            assert (n != 0);
        }
        return true;
    }

    @Override
    protected int csz() {
        return Math.min(this.kOY, this.kOX);
    }

    @Override
    protected int Nu(int n) {
        assert (n >= 0 && n < this.csB());
        int n2 = this.kOY;
        int n3 = this.kOX;
        if (n2 > n3) {
            int n4 = n2;
            n2 = n3;
            n3 = n4;
        }
        if (++n >= n2 && n <= n3) {
            return n;
        }
        return -1;
    }

    @Override
    protected int csA() {
        return this.kOX;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

