/*
 * Decompiled with CFR.
 */
public abstract class hpm<ROW, CELL, ROW_COMPONENT extends hpr<ROW, CELL, CELL_COMPONENT>, CELL_COMPONENT extends hms>
extends hop<ROW, CELL, ROW_COMPONENT, CELL_COMPONENT> {
    public final b kVA;
    public final hrh<ROW, CELL> kVB;
    public final hrs<ROW, CELL> kVC;
    public final hno jHT;
    public final hmy kVD;
    private final lbp kVE = new lbp(this){
        final /* synthetic */ hpm kVH;
        {
            this.kVH = hpm2;
        }

        public final boolean caU() {
            hpm.a(this.kVH, ldd.rer);
            return true;
        }
    };
    private final lbp kVF = new lbp(this){
        final /* synthetic */ hpm kVH;
        {
            this.kVH = hpm2;
        }

        public final boolean caU() {
            hpm.a(this.kVH, ldd.ret);
            return true;
        }
    };
    private final lbn kVG = new lbn(this){
        final /* synthetic */ hpm kVH;
        {
            this.kVH = hpm2;
        }

        public final void W() {
            hpm.a(this.kVH);
        }
    };
    private boolean Initialized;

    public hpm(hnc hnc2, String string, lgg lgg2, lhf lhf2, b b2, boolean bl, hrs<ROW, CELL> hrs2, int n, int[] nArray) {
        this(hnc2, string, lgg2, lhf2, b2, bl, new hrh<ROW, CELL>(hrs2), n, nArray);
    }

    private hpm(hnc hnc2, String string, lgg lgg2, lhf lhf2, b b2, boolean bl, hrh<ROW, CELL> hrh2, int n, int[] nArray) {
        this(hnc2, string, lgg2, lhf2, b2, bl, hrh2, hpm.b(hrh2, nArray), hpm.a(hrh2, n));
    }

    private hpm(hnc hnc2, String string, lgg lgg2, lhf lhf2, b b2, boolean bl, hrh<ROW, CELL> hrh2, hmy hmy2, hmw hmw2) {
        super(hnc2, string, lgg2, lhf2, b2.kKB, hrh2, new hmw[]{hmy2, hmw2});
        this.kVA = b2;
        this.kVB = hrh2;
        this.kVC = hrh2.kVC;
        this.kVD = hmy2;
        this.jHT = bl ? new hno(this.kSb.p(ldb.rep)) : null;
    }

    public final void a(ROW ROW, boolean bl, boolean bl2) {
        assert (this.Initialized);
        this.kVB.a(ROW, bl);
        if (bl && bl2) {
            this.kVB.J(ROW);
            ROW ROW2 = this.kVB.L(ROW);
            this.F(ROW2);
            this.F(ROW);
        }
    }

    public final void E(ROW ROW) {
        assert (this.Initialized);
        boolean bl = this.kVB.I(ROW);
        this.a(ROW, !bl, true);
    }

    public final void F(ROW ROW) {
        int n = this.kVB.K(ROW);
        if (n == -1) {
            return;
        }
        this.NB(n);
    }

    public final lbl<lbn> cvi() {
        return super.cuc();
    }

    public final ROW getSelectedItem() {
        int n = this.jHT.csE();
        if (n == -1) {
            return null;
        }
        if (n >= this.kVB.p(ldb.rep).getSize()) {
            return null;
        }
        return this.kVB.LQ(n);
    }

    public final void G(ROW ROW) {
        assert (this.Initialized);
        if (ROW == null) {
            this.jHT.Nw(-1);
        } else {
            this.kVB.J(ROW);
            int n = this.kVB.K(ROW);
            assert (n != -1);
            this.jHT.Nw(n);
        }
    }

    public final ROW cvj() {
        assert (this.Initialized);
        int n = this.cuh();
        if (n == -1) {
            return null;
        }
        return this.kVB.LQ(n);
    }

    public final void cvk() {
        this.kVB.cvk();
    }

    public ROW NN(int n) {
        if (n < 0 || n >= this.kVB.p(ldb.rep).getSize()) {
            assert (false);
            return null;
        }
        return this.kVB.LQ(n);
    }

    public final int NO(int n) {
        return this.kVA.kVK.kWg + this.kVA.kVK.kWk * this.kVB.NW(n);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.nb(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.nb(false);
        super.FG();
        this.Initialized = false;
    }

    protected int f(int n, ROW ROW) {
        assert (lda.acc(n));
        assert (lda.by(ROW));
        assert (false);
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void cvl() {
        this.om(true);
        try {
            hmw hmw2 = this.k(ldb.rep);
            if (hmw2 instanceof hmy) {
                hmy hmy2 = (hmy)hmw2;
                int n = hmw2.crs();
                for (int i = 0; i < n; ++i) {
                    ROW ROW = this.kVB.LQ(i);
                    int n2 = this.f(i, ROW);
                    hmy2.cD(i, n2);
                }
            }
            this.Nh(hmw2.cru());
            this.refresh();
        }
        finally {
            this.om(false);
        }
    }

    private void d(ldd ldd2) {
        int n;
        assert (ldd2 == ldd.ret || ldd2 == ldd.rer);
        ROW ROW = this.getSelectedItem();
        if (ROW == null) {
            return;
        }
        if (this.kVB.H(ROW) && (n = this.kVB.I(ROW)) == (ldd2 == ldd.rer ? 1 : 0)) {
            this.a(ROW, n == 0, true);
            return;
        }
        ROW ROW2 = ROW = ldd2 == ldd.rer ? this.kVC.N(ROW) : this.kVC.P(ROW);
        if (ROW != null) {
            n = this.kVB.K(ROW);
            this.jHT.Nw(n);
        }
    }

    private static hmy b(hrd<?, ?> hrd2, int[] nArray) {
        hrt hrt2 = hrd2.p(ldb.reo);
        assert (nArray.length == hrt2.getSize());
        hmy hmy2 = new hmy(hrt2, nArray[0]);
        hmy2.aF(nArray);
        return hmy2;
    }

    private static hmw a(hrd<?, ?> hrd2, int n) {
        hrt hrt2 = hrd2.p(ldb.rep);
        if (n == 0) {
            return new hmy(hrt2, 16);
        }
        return new hmx(hrt2, n);
    }

    private void nb(boolean bl) {
        this.a(bl, this.kVE, 37, jpn.nLm);
        this.a(bl, this.kVF, 39, jpn.nLm);
        this.kVB.cec().a(bl, this.kVG);
        if (this.jHT != null) {
            this.jHT.a(bl, this);
        }
    }

    static /* synthetic */ void a(hpm hpm2, ldd ldd2) {
        hpm2.d(ldd2);
    }

    static /* synthetic */ void a(hpm hpm2) {
        hpm2.cvl();
    }
}

