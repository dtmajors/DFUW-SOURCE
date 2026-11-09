/*
 * Decompiled with CFR.
 */
public class hne {
    public static final hbe jzX = hbe.jAM;
    private final a[] kNX = new a[2];
    private final hms[][] kNY;
    private final lgg kNZ;
    private int kOa;
    private boolean kOb;

    public hne(lhf lhf2, lgg lgg2) {
        assert (lhf2 != null);
        assert (lhf2.rmN > 0);
        assert (lhf2.H > 0);
        assert (lgg2 == null || lgg2.cf >= 0 && lgg2.cf < lhf2.rmN && lgg2.cg >= 0 && lgg2.cg < lhf2.H);
        this.kNZ = lgg2;
        for (ldb ldb2 : ldb.values()) {
            int n = lhf2.e(ldb2);
            this.kNX[ldb2.ordinal()] = new a(new int[n]);
        }
        this.kNY = new hms[lhf2.H][lhf2.rmN];
    }

    public final int getRowCount() {
        return this.f(ldb.rep);
    }

    public final int cst() {
        return this.f(ldb.reo);
    }

    public final int f(ldb ldb2) {
        return this.kNX[ldb2.ordinal()].kOc.length;
    }

    public final hms cE(int n, int n2) {
        assert (n >= 0 && n < this.getRowCount()) : n;
        assert (n2 >= 0 && n2 < this.cst()) : n2;
        return this.kNY[n][n2];
    }

    public final void a(int n, int n2, hms hms2) {
        assert (n >= 0 && n < this.getRowCount()) : n;
        assert (n2 >= 0 && n2 < this.cst()) : n2;
        this.kNY[n][n2] = hms2;
        if (this.kNY[n][n2] != null) {
            this.kNY[n][n2].z(this.cG(n, n2));
            this.kNY[n][n2].d(this.cF(n, n2));
        }
    }

    public final hms b(int n, int n2, hms hms2) {
        assert (n >= 0 && n < this.getRowCount()) : n;
        assert (n2 >= 0 && n2 < this.cst()) : n2;
        hms hms3 = this.kNY[n][n2];
        if (hms3 != null && hms3.isInitialized()) {
            hms3.remove();
        }
        this.a(n, n2, hms2);
        return hms2;
    }

    public int f(ldb ldb2, int n) {
        assert (n < this.f(ldb2));
        return this.kNX[ldb2.ordinal()].kOc[n];
    }

    public boolean a(ldb ldb2, int n, int n2) {
        assert (n < this.f(ldb2));
        assert (n2 >= 0);
        if (this.kNX[ldb2.ordinal()].kOc[n] == n2) {
            return false;
        }
        this.kNX[ldb2.ordinal()].kOc[n] = n2;
        return true;
    }

    public final lhf cF(int n, int n2) {
        return new lhf(this.kNX[ldb.reo.ordinal()].kOc[n2], this.kNX[ldb.rep.ordinal()].kOc[n]);
    }

    public final lgg cG(int n, int n2) {
        int n3;
        int n4 = 0;
        for (n3 = 0; n3 < n; ++n3) {
            n4 += this.kNX[ldb.rep.ordinal()].kOc[n3];
        }
        n3 = 0;
        for (int i = 0; i < n2; ++i) {
            n3 += this.kNX[ldb.reo.ordinal()].kOc[i];
        }
        return new lgg(n3, n4);
    }

    public boolean a(lhf lhf2, int n) {
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                return false;
            }
            if (this.f(lhf2)) break;
            ++n2;
        }
        return true;
    }

    public boolean f(lhf lhf2) {
        if (this.kOa != 0) {
            this.kOb = true;
            return true;
        }
        ++this.kOa;
        assert (!this.kOb);
        if (this.kNZ != null) {
            for (ldb ldb2 : ldb.values()) {
                int n;
                int n2 = 0;
                for (n = 0; n < this.kNX[ldb2.ordinal()].kOc.length; ++n) {
                    n2 += this.kNX[ldb2.ordinal()].kOc[n];
                }
                n = n2 - lhf2.e(ldb2);
                if (n == 0) continue;
                int n3 = this.kNZ.r(ldb2);
                int n4 = this.kNX[ldb2.ordinal()].kOc[n3];
                if ((n4 -= n) < 0) {
                    n4 = 0;
                }
                this.kNX[ldb2.ordinal()].kOc[n3] = n4;
            }
        }
        lgs lgs2 = new lgs();
        for (int i = 0; i < this.kNX[ldb.rep.ordinal()].kOc.length; ++i) {
            lgs2.H = this.kNX[ldb.rep.ordinal()].kOc[i];
            lgs2.cf = 0;
            for (int j = 0; j < this.kNX[ldb.reo.ordinal()].kOc.length; ++j) {
                lgs2.rmN = this.kNX[ldb.reo.ordinal()].kOc[j];
                assert (lgs2.aI().T(this.cG(i, j)));
                if (this.kNY[i][j] != null) {
                    this.kNY[i][j].j(lgs2);
                }
                lgs2.cf += lgs2.rmN;
                if (this.kOb) break;
            }
            lgs2.cg += lgs2.H;
            if (this.kOb) break;
        }
        --this.kOa;
        if (this.kOa == 0 && this.kOb) {
            this.kOb = false;
            return false;
        }
        return true;
    }
}

