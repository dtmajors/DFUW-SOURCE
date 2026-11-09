/*
 * Decompiled with CFR.
 */
public class hmo
extends hmn {
    private final hnc kLu;
    private boolean kLv;
    private lgg kLw;
    private lgg kLx;

    public hmo(hnc hnc2, lnh lnh2, hpv hpv2) {
        super(hnc2.kAz, lnh2, hpv2);
        this.kLu = hnc2;
        this.kLw = this.kLt.cqw();
        this.kLx = hmo.a(this.kLu.kND.cqv(), this.kLt.cqD());
    }

    @Override
    protected void a(double d2, hpv hpv2) {
        hpv2.cB(this.a(d2, ldb.reo), this.a(d2, ldb.rep));
    }

    @Override
    protected void cqj() {
        super.cqj();
        boolean bl = this.csI();
        if (bl == this.kLv) {
            return;
        }
        this.kLv = bl;
        if (this.kLv) {
            switch (this.csH()) {
                case kPm: {
                    this.kLw = this.kLt.cqw();
                    this.kLx = hmo.a(this.kLu.kND.cqv(), this.kLt.cqD());
                    break;
                }
                case kPl: {
                    break;
                }
                default: {
                    assert (false);
                    break;
                }
            }
        }
    }

    private int a(double d2, ldb ldb2) {
        int n = this.kLw.r(ldb2);
        int n2 = this.kLx.r(ldb2);
        int n3 = (int)((double)(n - n2) * d2);
        int n4 = n2 + n3;
        return n4;
    }

    private static lgg a(lhf lhf2, lgs lgs2) {
        lgg lgg2 = lgs2.cfx();
        lgg lgg3 = new lgg(lhf2.rmN / 2, lhf2.H / 2);
        int n = lgg2.cf - lgg3.cf;
        int n2 = lgg2.cg - lgg3.cg;
        if (n == 0 && n2 == 0) {
            n2 = -1;
        }
        double d2 = Math.sqrt(n * n + n2 * n2);
        double d3 = Math.sqrt(lgs2.rmN * lgs2.rmN + lgs2.H * lgs2.H);
        double d4 = ((double)lgg3.length() + d3) / d2;
        n = (int)((double)n * d4);
        n2 = (int)((double)n2 * d4);
        int n3 = lgg2.cf + n;
        int n4 = lgg2.cg + n2;
        lgs lgs3 = new lgs(0 - lgs2.rmN / 2, 0 - lgs2.H / 2, lhf2.rmN + lgs2.rmN, lhf2.H + lgs2.H);
        lgg[] lggArray = new lgg[2];
        int n5 = hmo.a(lgg2, new lgg(n3, n4), lgs3, lggArray);
        assert (n5 == 1);
        return new lgg(lggArray[0].cf - lgs2.rmN / 2, lggArray[0].cg - lgs2.H / 2);
    }

    private static a a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, lgg[] lggArray, int n9) {
        double d2 = (n7 - n5) * (n2 - n6) - (n8 - n6) * (n - n5);
        double d3 = (n3 - n) * (n2 - n6) - (n4 - n2) * (n - n5);
        double d4 = (n8 - n6) * (n3 - n) - (n7 - n5) * (n4 - n2);
        if (d4 == 0.0) {
            if (d2 == 0.0 || d3 == 0.0) {
                return a.kLB;
            }
            return a.kLC;
        }
        double d5 = d2 / d4;
        double d6 = d3 / d4;
        if (0.0 <= d5 && d5 <= 1.0 && 0.0 <= d6 && d6 <= 1.0) {
            lggArray[n9] = new lgg((int)((double)n + d5 * (double)(n3 - n)), (int)((double)n2 + d5 * (double)(n4 - n2)));
            return a.kLz;
        }
        return a.kLA;
    }

    private static int a(lgg lgg2, lgg lgg3, lgs lgs2, lgg[] lggArray) {
        int n = 0;
        if (hmo.a(lgs2.cf, lgs2.cg, lgs2.cf + lgs2.rmN, lgs2.cg, lgg2.cf, lgg2.cg, lgg3.cf, lgg3.cg, lggArray, n) == a.kLz) {
            ++n;
        }
        if (hmo.a(lgs2.cf + lgs2.rmN, lgs2.cg, lgs2.cf + lgs2.rmN, lgs2.cg + lgs2.H, lgg2.cf, lgg2.cg, lgg3.cf, lgg3.cg, lggArray, n) == a.kLz) {
            ++n;
        }
        if (n == 2) {
            return n;
        }
        if (hmo.a(lgs2.cf + lgs2.rmN, lgs2.cg + lgs2.H, lgs2.cf, lgs2.cg + lgs2.H, lgg2.cf, lgg2.cg, lgg3.cf, lgg3.cg, lggArray, n) == a.kLz) {
            ++n;
        }
        if (n == 2) {
            return n;
        }
        if (hmo.a(lgs2.cf, lgs2.cg + lgs2.H, lgs2.cf, lgs2.cg, lgg2.cf, lgg2.cg, lgg3.cf, lgg3.cg, lggArray, n) == a.kLz) {
            ++n;
        }
        return n;
    }
}

