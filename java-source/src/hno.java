/*
 * Decompiled with CFR.
 */
public class hno
extends hnk {
    private int kOX = -1;
    private int kOZ = -1;

    public hno(hrt hrt2) {
        super(hrt2);
        this.nb(true);
    }

    public final int csE() {
        return this.kOZ;
    }

    public final boolean Nw(int n) {
        assert (n == -1 || n >= 0 && n <= this.csB()) : n + " " + this.csB();
        if (n == this.kOZ) {
            return false;
        }
        this.kOX = n;
        this.kOZ = n;
        this.csy();
        return true;
    }

    public final boolean S(int n, boolean bl) {
        assert (n >= 0 && n < this.csB());
        return this.Nw(bl ? n : -1);
    }

    @Override
    protected void cbg() {
        this.nb(false);
        super.cbg();
    }

    @Override
    protected void csx() {
        if (this.kOZ >= this.csB()) {
            this.Nw(this.csB() - 1);
        }
    }

    @Override
    protected boolean Nt(int n) {
        return n == this.kOZ;
    }

    @Override
    protected boolean Q(int n, boolean bl) {
        assert (lda.yk(bl));
        return this.Nw(n);
    }

    @Override
    protected boolean oc(boolean bl) {
        if (this.kOZ == -1) {
            return false;
        }
        if (!bl) {
            boolean bl2 = this.Nw(-1);
            assert (bl2);
        }
        return true;
    }

    @Override
    protected boolean od(boolean bl) {
        assert (lda.yk(bl));
        return false;
    }

    @Override
    protected int csz() {
        return this.kOZ;
    }

    @Override
    protected int Nu(int n) {
        assert (lda.acc(n));
        return -1;
    }

    @Override
    protected int csA() {
        return this.kOX;
    }

    private void nb(boolean bl) {
        assert (lda.yk(bl));
    }
}

