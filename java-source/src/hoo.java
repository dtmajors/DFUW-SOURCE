/*
 * Decompiled with CFR.
 */
public class hoo
extends hol {
    private boolean Initialized;
    private lgg kNZ;
    private final a[] kSN = new a[2];

    public final hms cE(int n, int n2) {
        assert (this.Initialized);
        assert (n >= 0 && n < this.kSN[ldb.rep.ordinal()].kOc.length) : n;
        assert (n2 >= 0 && n2 < this.kSN[ldb.reo.ordinal()].kOc.length) : n2;
        return this.crn().get(n * this.kSN[ldb.reo.ordinal()].kOc.length + n2);
    }

    public void c(int n, int n2, hms hms2) {
        assert (this.Initialized);
        hms hms3 = this.cE(n, n2);
        lgg lgg2 = hms3.cqw();
        lhf lhf2 = hms3.cqv();
        hms3.remove();
        this.j(hms2);
        hms2.z(lgg2);
        hms2.d(lhf2);
        this.b(hms2, n * this.kSN[ldb.reo.ordinal()].kOc.length + n2);
        this.layout();
    }

    public int f(ldb ldb2, int n) {
        assert (this.Initialized);
        return this.kSN[ldb2.ordinal()].kOc[n];
    }

    public void u(int n, int n2, int n3) {
        assert (this.Initialized);
        if (this.kSN[n].kOc[n2] == n3) {
            return;
        }
        this.kSN[n].kOc[n2] = n3;
        this.layout();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        for (ldb ldb2 : ldb.values()) {
            int[] nArray = new int[this.kSN[ldb2.ordinal()].kOc.length];
            for (int i = 0; i < nArray.length; ++i) {
                nArray[i] = this.kSN[ldb2.ordinal()].kOc[i];
            }
            this.kSN[ldb2.ordinal()] = new a(nArray);
        }
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cuf() {
        int n;
        int n2;
        if (this.kNZ != null) {
            ldb[] object = ldb.values();
            n2 = object.length;
            for (n = 0; n < n2; ++n) {
                int n3;
                ldb ldb2 = object[n];
                int n4 = 0;
                for (n3 = 0; n3 < this.kSN[ldb2.ordinal()].kOc.length; ++n3) {
                    n4 += this.kSN[ldb2.ordinal()].kOc[n3];
                }
                n3 = n4 - this.e(ldb2);
                if (n3 == 0) continue;
                int n5 = this.kNZ.r(ldb2);
                int n6 = this.kSN[ldb2.ordinal()].kOc[n5];
                if ((n6 -= n3) < 0) {
                    n6 = 0;
                }
                this.kSN[ldb2.ordinal()].kOc[n5] = n6;
            }
        }
        lgs lgs2 = new lgs();
        for (n2 = 0; n2 < this.kSN[ldb.rep.ordinal()].kOc.length; ++n2) {
            lgs2.H = this.kSN[ldb.rep.ordinal()].kOc[n2];
            lgs2.cf = 0;
            for (n = 0; n < this.kSN[ldb.reo.ordinal()].kOc.length; ++n) {
                lgs2.rmN = this.kSN[ldb.reo.ordinal()].kOc[n];
                this.cE(n2, n).j(lgs2);
                lgs2.cf += lgs2.rmN;
            }
            lgs2.cg += lgs2.H;
        }
    }

    protected hoo(hnc hnc2, String string, lgg lgg2, lhf lhf2) {
        super(hnc2, string, lgg2, lhf2);
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

