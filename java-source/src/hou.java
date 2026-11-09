/*
 * Decompiled with CFR.
 */
public class hou
extends hmt {
    private final hne kli;
    private boolean Initialized;

    public hou(hnc hnc2, String string, lgg lgg2, lhf lhf2, lhf lhf3, lgg lgg3) {
        super(hnc2, string, lgg2, lhf2);
        this.kli = new hne(lhf3, lgg3);
    }

    public final int getRowCount() {
        return this.kli.getRowCount();
    }

    public final int cst() {
        return this.kli.f(ldb.reo);
    }

    public final int f(ldb ldb2) {
        return this.kli.f(ldb2);
    }

    public final hms cP(int n, int n2) {
        assert (this.Initialized);
        return this.kli.cE(n, n2);
    }

    public final void d(int n, int n2, hms hms2) {
        assert (n >= 0 && n < this.getRowCount()) : n;
        assert (n2 >= 0 && n2 < this.cst()) : n2;
        assert (this.kli.cE(n, n2) == null);
        if (hms2 != null) {
            this.j(hms2);
        }
        this.kli.a(n, n2, hms2);
    }

    public final hms b(int n, int n2, hms hms2) {
        assert (this.Initialized);
        assert (n >= 0 && n < this.getRowCount()) : n;
        assert (n2 >= 0 && n2 < this.cst()) : n2;
        if (hms2 != null) {
            this.j(hms2);
        }
        this.kli.b(n, n2, hms2);
        if (hms2 != null) {
            this.ccm();
        }
        return hms2;
    }

    public final int f(ldb ldb2, int n) {
        assert (this.Initialized);
        return this.kli.f(ldb2, n);
    }

    public final boolean a(ldb ldb2, int n, int n2) {
        if (!this.kli.a(ldb2, n, n2)) {
            return false;
        }
        if (this.Initialized) {
            this.ccm();
        }
        return true;
    }

    public final lhf cF(int n, int n2) {
        return this.kli.cF(n, n2);
    }

    public final lgg cG(int n, int n2) {
        return this.kli.cG(n, n2);
    }

    public final void ccm() {
        int n = 3;
        if (!this.kli.a(this.cqv(), n)) {
            // empty if block
        }
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
        this.ccm();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        this.ccm();
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

