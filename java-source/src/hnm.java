/*
 * Decompiled with CFR.
 */
public class hnm
extends hnk {
    public hnm(hrt hrt2) {
        super(hrt2);
    }

    @Override
    protected void cbg() {
        super.cbg();
    }

    @Override
    protected void csx() {
    }

    @Override
    protected boolean Nt(int n) {
        assert (lda.acc(n));
        return false;
    }

    @Override
    protected boolean Q(int n, boolean bl) {
        assert (lda.acc(n));
        assert (lda.yk(bl));
        return false;
    }

    @Override
    protected boolean oc(boolean bl) {
        assert (lda.yk(bl));
        return false;
    }

    @Override
    protected boolean od(boolean bl) {
        assert (lda.yk(bl));
        return false;
    }

    @Override
    protected int csz() {
        return -1;
    }

    @Override
    protected int Nu(int n) {
        assert (lda.acc(n));
        assert (false);
        return -1;
    }

    @Override
    protected int csA() {
        return -1;
    }
}

