/*
 * Decompiled with CFR.
 */
public abstract class hoj<CELL_COMPONENT extends hms>
extends hpw {
    private final lbn kSg = new lbn(this){
        final /* synthetic */ hoj kSl;
        {
            this.kSl = hoj2;
        }

        public final void W() {
            this.kSl.refresh();
        }
    };
    private final ldl kSh = new ldl();
    private final hmw[] kSi;
    private final lax<CELL_COMPONENT> kSj = new lax();
    private boolean Initialized;
    private lgg kSk;

    public hoj(hnc hnc2, String string, lgg lgg2, lhf lhf2, b b2, hmw[] hmwArray) {
        super(hnc2, string, lgg2, lhf2, b2.khH);
        assert (hmwArray != null);
        assert (hmwArray.length == ldb.values().length);
        assert (hmwArray[ldb.reo.ordinal()] != null);
        assert (hmwArray[ldb.rep.ordinal()] != null);
        this.kSi = hmwArray;
    }

    public final hmw k(ldb ldb2) {
        return this.kSi[ldb2.ordinal()];
    }

    public final lbl<lbn> cuc() {
        return this.kSh;
    }

    public final int b(ldb ldb2, int n) {
        if (n < 0 || n >= this.kSi[ldb2.ordinal()].cru()) {
            return -1;
        }
        int n2 = this.kSi[ldb2.ordinal()].Nm(n);
        assert (n2 >= 0 && n2 < this.kSi[ldb2.ordinal()].crs());
        return n2;
    }

    public final int c(ldb ldb2, int n) {
        assert (n >= 0 && n < this.kSi[ldb2.ordinal()].crs());
        return this.kSi[ldb2.ordinal()].Nl(n);
    }

    public final lgg m(lgg lgg2) {
        int n = this.b(ldb.reo, lgg2.cf);
        int n2 = this.b(ldb.rep, lgg2.cg);
        if (n == -1 || n2 == -1) {
            return null;
        }
        assert (n >= 0 && n < this.kSi[ldb.reo.ordinal()].crs());
        assert (n2 >= 0 && n2 < this.kSi[ldb.rep.ordinal()].crs());
        return new lgg(n, n2);
    }

    public final lgg n(lgg lgg2) {
        assert (lgg2.cf >= 0 && lgg2.cf < this.kSi[ldb.reo.ordinal()].crs());
        assert (lgg2.cg >= 0 && lgg2.cg < this.kSi[ldb.rep.ordinal()].crs());
        int n = this.kSi[ldb.reo.ordinal()].Nl(lgg2.cf);
        int n2 = this.kSi[ldb.rep.ordinal()].Nl(lgg2.cg);
        return new lgg(n, n2);
    }

    public final int l(ldb ldb2) {
        if (this.kSk == null) {
            return -1;
        }
        return this.kSk.r(ldb2);
    }

    public final int f(ldb ldb2, int n) {
        return this.kSi[ldb2.ordinal()].Nk(n);
    }

    public final int a(ldb ldb2, ldd ldd2, hnj hnj2, int n) {
        assert (ldd2 == ldd.ret || ldd2 == ldd.rer);
        assert (n >= 0 && n < this.k(ldb.rep).crs());
        int n2 = this.k(ldb.rep).crs();
        block0 : switch (hnj2) {
            case kOw: {
                if (ldd2 == ldd.ret) {
                    if (n >= n2 - 1) break;
                    ++n;
                    break;
                }
                if (n <= 0) break;
                --n;
                break;
            }
            case kOx: {
                int n3;
                int n4;
                int n5 = this.o(ldb2);
                int n6 = n4 = this.c(ldb2, n);
                while ((n3 = this.b(ldb2, ldd2, n6)) != n6) {
                    n6 = n3;
                    n3 = n6 - n4;
                    assert (Math.signum(n3) == Math.signum(ldd2.reu));
                    assert (Math.signum(n3 *= ldd2.reu) == 1.0f);
                    if (n3 >= n5) break block0;
                    if (ldd2 == ldd.ret) {
                        if (n >= n2 - 1) break block0;
                        ++n;
                        continue;
                    }
                    if (n <= 0) break block0;
                    --n;
                }
                break;
            }
            case kOy: {
                n = ldd2 == ldd.rer ? 0 : n2 - 1;
                break;
            }
            default: {
                assert (false) : hnj2;
                break;
            }
        }
        return n;
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
        assert (this.kSh.isEmpty());
        this.Initialized = false;
    }

    @Override
    protected int a(ldb ldb2, ldd ldd2, int n) {
        int n2 = this.kSi[ldb2.ordinal()].crs();
        if (n2 == 0) {
            return 0;
        }
        int n3 = this.kSi[ldb2.ordinal()].cru();
        if (n3 == 0) {
            return 0;
        }
        if (n >= n3) {
            n = n3 - 1;
        }
        if (n < 0) {
            n = 0;
        }
        int n4 = this.kSi[ldb2.ordinal()].Nm(n);
        assert (n4 >= 0 && n4 < n2);
        switch (ldd2) {
            case rer: {
                if (n4 <= 0) break;
                --n4;
                break;
            }
            case ret: {
                if (n4 + 1 >= n2) break;
                ++n4;
                break;
            }
        }
        return this.kSi[ldb2.ordinal()].Nl(n4);
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
    }

    @Override
    protected void chd() {
        assert (this.Initialized);
        super.chd();
        this.cud();
        this.refresh();
    }

    @Override
    protected void cbu() {
        assert (this.Initialized);
        super.cbu();
        this.cud();
    }

    @Override
    protected void cbM() {
        assert (this.Initialized);
        super.cbM();
        if (this.kSk == null) {
            return;
        }
        if (this.kLu.csd()) {
            this.kSh.enp();
        }
    }

    @Override
    protected void cbv() {
        assert (this.Initialized);
        super.cbv();
    }

    @Override
    protected void chK() {
        assert (this.Initialized);
        super.chK();
        this.cud();
    }

    @Override
    protected void ccd() {
        int n;
        int n2;
        assert (this.Initialized);
        super.ccd();
        for (hmw hmw2 : this.kSi) {
            hmw2.refresh();
        }
        this.cC(this.k(ldb.reo).cru(), this.k(ldb.rep).cru());
        lgs lgs2 = this.cqU();
        ldb[] ldbArray = ldb.values();
        int n3 = ldbArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            int n4;
            ldb ldb2 = ldbArray[n2];
            int n5 = lgs2.r(ldb2);
            int n6 = lgs2.e(ldb2);
            if (n5 < 0) {
                n6 += n5;
                n5 = 0;
            }
            if (n5 > (n4 = this.k(ldb2).cru())) {
                return;
            }
            assert (n6 >= 0);
            if (n5 + n6 > n4) {
                n6 = n4 - n5;
            }
            lgs2.n(ldb2, n5);
            lgs2.o(ldb2, n6);
            assert (lgs2.rmN >= 0);
            assert (lgs2.H >= 0);
        }
        if (lgs2.rmN == 0 || lgs2.H == 0) {
            return;
        }
        int n7 = this.k(ldb.reo).crs() == 0 ? 0 : this.k(ldb.reo).Nm(lgs2.cf);
        int n8 = n3 = lgs2.rmN == 0 ? n7 : this.k(ldb.reo).Nm(lgs2.cf + lgs2.rmN - 1);
        assert (n3 >= n7);
        n2 = this.k(ldb.rep).crs() == 0 ? 0 : this.k(ldb.rep).Nm(lgs2.cg);
        int n9 = n = lgs2.H == 0 ? n2 : this.k(ldb.rep).Nm(lgs2.cg + lgs2.H - 1);
        assert (n >= n2);
        this.f(n2, n7, n, n3);
        if (!lgs2.isEmpty()) {
            a<CELL_COMPONENT> a2 = this.cmN();
            a2.i(n2, n7, n, n3);
        }
        this.cud();
    }

    protected void f(int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        assert (this.Initialized);
        int n7 = this.kSj.getRowCount();
        int n8 = n3 - n + 1;
        int n9 = n7 == 0 ? 0 : this.kSj.cst();
        int n10 = n4 - n2 + 1;
        int n11 = Math.min(n8, n7);
        int n12 = Math.min(n10, n9);
        for (n6 = 0; n6 < n11; ++n6) {
            for (n5 = n10; n5 < n9; ++n5) {
                this.cM(n6, n5);
            }
        }
        for (n6 = n8; n6 < n7; ++n6) {
            for (n5 = 0; n5 < n12; ++n5) {
                this.cM(n6, n5);
            }
        }
        for (n6 = n8; n6 < n7; ++n6) {
            for (n5 = n10; n5 < n9; ++n5) {
                this.cM(n6, n5);
            }
        }
        this.kSj.resize(n8, n10);
        for (n6 = 0; n6 < n11; ++n6) {
            for (n5 = n9; n5 < n10; ++n5) {
                this.cL(n6, n5);
            }
        }
        for (n6 = n7; n6 < n8; ++n6) {
            for (n5 = 0; n5 < n12; ++n5) {
                this.cL(n6, n5);
            }
        }
        for (n6 = n7; n6 < n8; ++n6) {
            for (n5 = n9; n5 < n10; ++n5) {
                this.cL(n6, n5);
            }
        }
    }

    protected abstract CELL_COMPONENT cJ(int var1, int var2);

    protected abstract a<CELL_COMPONENT> cmN();

    protected final CELL_COMPONENT cK(int n, int n2) {
        return (CELL_COMPONENT)((hms)this.kSj.fM(n, n2));
    }

    private void cud() {
        lgg lgg2;
        if (!this.cqQ()) {
            lgg2 = null;
        } else {
            lgg lgg3 = this.cqu();
            lgg2 = this.m(lgg3);
        }
        if (lin.i(lgg2, this.kSk)) {
            return;
        }
        this.kSk = lgg2;
        this.refresh();
    }

    private void cL(int n, int n2) {
        CELL_COMPONENT CELL_COMPONENT = this.cJ(n, n2);
        this.kSj.a(n, n2, CELL_COMPONENT);
        if (CELL_COMPONENT != null) {
            this.j((hms)CELL_COMPONENT);
        }
    }

    private void cM(int n, int n2) {
        hms hms2 = (hms)this.kSj.fM(n, n2);
        if (hms2 != null) {
            hms2.remove();
        }
    }

    private void nb(boolean bl) {
        for (hmw hmw2 : this.kSi) {
            hmw2.crt().a(bl, this.kSg);
        }
    }
}

