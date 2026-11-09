/*
 * Decompiled with CFR.
 */
public class hog
extends how {
    public final a kRT;
    private final lbp kPw = new lbp(this){
        final /* synthetic */ hog kRW;
        {
            this.kRW = hog2;
        }

        public final boolean caU() {
            this.kRW.b(ldd.ret);
            return true;
        }
    };
    private final lbp kPx = new lbp(this){
        final /* synthetic */ hog kRW;
        {
            this.kRW = hog2;
        }

        public final boolean caU() {
            this.kRW.b(ldd.rer);
            return true;
        }
    };
    private boolean Initialized;
    private hoa kRU;
    private boolean kRV = false;

    public hog(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2) {
        super(hnc2, string, lgg2, lhf2, a2.jGJ);
        this.kRT = a2;
    }

    public final void ctY() {
        this.kRV = true;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
        if (!this.kRV) {
            this.kRU = this.ctQ();
            if (this.kRU != null) {
                this.kRU.cqV();
            }
        }
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cbM() {
        hoa hoa2 = (hoa)this.b(this.cqu(), hoa.class);
        if (hoa2 != null && !hoa2.cty()) {
            this.b(hoa2);
        }
        super.cbM();
    }

    @Override
    protected int a(ldb ldb2) {
        if (ldb2 == ldb.rep) {
            return 16;
        }
        return super.a(ldb2);
    }

    @Override
    protected void crr() {
        hms hms2 = this.crp();
        if (hms2 != null) {
            lgs lgs2 = hms2.cqD();
            lgs2 = lgs2.o(this.kRT.kRZ);
            this.l(lgs2);
        }
    }

    protected void b(ldd ldd2) {
        assert (this.Initialized);
        assert (ldd2 == ldd.rer || ldd2 == ldd.ret);
        hoa hoa2 = this.ctZ();
        hoa2 = hoa2 == null ? this.ctQ() : this.a(hoa2, ldd2);
        this.b(hoa2);
    }

    protected hoa ctQ() {
        return this.cua();
    }

    protected boolean a(hoa hoa2) {
        assert (this.o(hoa2));
        return hoa2.cty();
    }

    protected final hoa ctZ() {
        return this.kRU;
    }

    protected final void b(hoa hoa2) {
        assert (hoa2 != null);
        assert (this.o(hoa2));
        if (hoa2.isFocusOwner() && hoa2 == this.kRU) {
            return;
        }
        this.kRU = hoa2;
        this.kRU.cqV();
    }

    protected final hoa cua() {
        int n = this.a(-1, ldd.ret);
        return n == -1 ? null : (hoa)this.crn().get(n);
    }

    protected final hoa cub() {
        assert (this.Initialized);
        hoa hoa2 = this.cua();
        if (hoa2 == null) {
            return null;
        }
        return this.a(hoa2, ldd.rer);
    }

    protected final hoa a(hoa hoa2, ldd ldd2) {
        assert (ldd2 == ldd.rer || ldd2 == ldd.ret);
        assert (hoa2 != null && hoa2.isInitialized() && this.o(hoa2));
        if (!this.n(hoa2)) {
            hmt hmt2 = hoa2;
            do {
                if ((hmt2 = hmt2.cqt()) == this) {
                    hmt2 = this.cua();
                    break;
                }
                if (hmt2 != null) continue;
                return null;
            } while (!this.n(hmt2) || !(hmt2 instanceof hoa));
            hoa2 = hmt2;
        }
        int n = this.crn().indexOf(hoa2);
        return (n = this.a(n, ldd2)) == -1 ? null : (hoa)this.crn().get(n);
    }

    protected final int a(int n, ldd ldd2) {
        block6: {
            hoa hoa2;
            hms hms2;
            assert (n == -1 || n >= 0 && n < this.crn().size());
            assert (ldd2 == ldd.rer || ldd2 == ldd.ret);
            int n2 = this.crn().size();
            if (n2 == 0) {
                return -1;
            }
            boolean bl = false;
            do {
                if (ldd2 == ldd.rer) {
                    if (--n >= 0) continue;
                    if (!bl) {
                        n = n2 - 1;
                        bl = true;
                        continue;
                    }
                    break block6;
                }
                if (++n < n2) continue;
                if (bl) break block6;
                n = 0;
                bl = true;
            } while (!((hms2 = this.crn().get(n)) instanceof hoa) || this.a(hoa2 = (hoa)hms2));
            return n;
        }
        return -1;
    }

    private void mU(boolean bl) {
        this.a(bl, this.kPw, 9, jpn.nLm);
        this.a(bl, this.kPx, 9, jpn.nLH);
    }
}

