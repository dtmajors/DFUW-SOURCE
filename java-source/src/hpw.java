/*
 * Decompiled with CFR.
 */
public class hpw
extends hmt {
    public static final a kWV = new a(lhu.rnR, lcq.COLORSHIFT_NEUTRAL);
    private final ldl kWW = new ldl();
    private final hpa jHl;
    private final lgs kWX = new lgs();
    private boolean Initialized;
    private lhf kWY = lhf.rnv;
    private boolean kWZ = true;
    private int kXa;
    private boolean kXb;

    public hpw(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2) {
        super(hnc2, string, lgg2, lhf2);
        if (a2.kPU == null) {
            this.jHl = null;
        } else {
            this.jHl = new hpa(this.kLu, (String)null, lgg.rlI, lhf2, a2.kPU);
            this.j(this.jHl);
            this.jHl.H(a2.ktY);
        }
    }

    public final hpa cvw() {
        return this.jHl;
    }

    public final lbl<lbn> cvx() {
        return this.kWW;
    }

    public final lgs cvy() {
        assert (this.Initialized);
        return new lgs(this.kWX);
    }

    public final void l(lgs lgs2) {
        assert (this.Initialized);
        assert (lgs2 != null);
        if (lgs2.v(this.kWX)) {
            return;
        }
        this.kWX.t(lgs2);
        this.cvB();
    }

    public final lhf cvz() {
        assert (this.Initialized);
        return this.kWY;
    }

    public final void g(lhf lhf2) {
        assert (this.Initialized);
        this.kWY = lhf2;
    }

    public final int o(ldb ldb2) {
        assert (this.Initialized);
        return this.kWY.e(ldb2);
    }

    public final void k(ldb ldb2, int n) {
        assert (this.Initialized);
        this.kWY = this.kWY.p(ldb2, n);
    }

    public final void refresh() {
        assert (this.Initialized);
        if (this.kXa > 0) {
            this.kXb = true;
            return;
        }
        this.ccd();
        this.kXb = false;
    }

    public final int b(ldb ldb2, ldd ldd2, int n) {
        assert (this.Initialized);
        return this.a(ldb2, ldd2, n);
    }

    public final boolean cvA() {
        return this.kWZ;
    }

    public final void ol(boolean bl) {
        this.kWZ = bl;
    }

    public final int l(ldb ldb2, int n) {
        assert (this.Initialized);
        return this.a(ldb2, n);
    }

    public final void om(boolean bl) {
        this.kXa += bl ? 1 : -1;
        assert (this.kXa >= 0);
        if (this.kXa == 0 && this.kXb) {
            this.refresh();
            assert (!this.kXb);
        }
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.jHl.cC(this.getWidth(), this.getHeight());
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        assert (this.kWW.isEmpty());
        this.Initialized = false;
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        this.jHl.cC(this.getWidth(), this.getHeight());
        this.refresh();
    }

    protected int a(ldb ldb2, int n) {
        int n2 = this.e(ldb2) - n;
        if (n2 < 0) {
            return 0;
        }
        return this.b(ldb2, ldd.ret, n2) - n2;
    }

    protected void ccd() {
    }

    protected int a(ldb ldb2, ldd ldd2, int n) {
        assert (this.Initialized);
        int n2 = this.a(ldb2);
        if (n2 == 0) {
            return n;
        }
        n /= n2;
        switch (ldd2) {
            case ret: {
                ++n;
                break;
            }
            case rer: {
                --n;
                break;
            }
            case res: {
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        return n *= n2;
    }

    protected int a(ldb ldb2) {
        return 0;
    }

    protected void cvB() {
        assert (this.Initialized);
        this.kWW.enp();
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

