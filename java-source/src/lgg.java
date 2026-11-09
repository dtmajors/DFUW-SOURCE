/*
 * Decompiled with CFR.
 */
public final class lgg
implements lbq {
    public static final lgg rlI = new lgg(0, 0);
    public static final lbs<lgg> Persistor = new lbs<lgg>(){
        static final /* synthetic */ boolean $assertionsDisabled;

        public lgg a(lfu lfu2, lgg lgg2) {
            int n = lfu2.ad("X", lgg2 == null ? 0 : lgg2.cf);
            int n2 = lfu2.ad("Y", lgg2 == null ? 0 : lgg2.cg);
            if (lgg2 != null && lgg2.fU(n, n2)) {
                return lgg2;
            }
            if (!$assertionsDisabled && !lfu2.eqA()) {
                throw new AssertionError();
            }
            return new lgg(n, n2);
        }

        static {
            $assertionsDisabled = !lgg.class.desiredAssertionStatus();
        }
    };
    public final int cf;
    public final int cg;

    public lgg(int n, int n2) {
        this.cf = n;
        this.cg = n2;
    }

    public lgg(ldb ldb2, int n, int n2) {
        switch (ldb2) {
            case reo: {
                this.cf = n;
                this.cg = n2;
                break;
            }
            case rep: {
                this.cf = n2;
                this.cg = n;
                break;
            }
            default: {
                assert (false);
                this.cf = 0;
                this.cg = 0;
            }
        }
    }

    public final int r(ldb ldb2) {
        switch (ldb2) {
            case reo: {
                return this.cf;
            }
            case rep: {
                return this.cg;
            }
        }
        assert (false) : ldb2;
        return 0;
    }

    public final lgg m(ldb ldb2, int n) {
        int n2 = this.cf;
        int n3 = this.cg;
        switch (ldb2) {
            case reo: {
                n2 = n;
                break;
            }
            case rep: {
                n3 = n;
                break;
            }
            default: {
                assert (false) : ldb2;
                break;
            }
        }
        return new lgg(n2, n3);
    }

    public final lgg R(lgg lgg2) {
        return new lgg(this.cf + lgg2.cf, this.cg + lgg2.cg);
    }

    public final lgg S(lgg lgg2) {
        return new lgg(this.cf - lgg2.cf, this.cg - lgg2.cg);
    }

    public final lgg i(lhf lhf2) {
        return new lgg(this.cf + lhf2.rmN, this.cg + lhf2.H);
    }

    public final lgg j(lhf lhf2) {
        return new lgg(this.cf - lhf2.rmN, this.cg - lhf2.H);
    }

    public final lgg fY(int n, int n2) {
        return new lgg(this.cf + n, this.cg + n2);
    }

    public final boolean T(lgg lgg2) {
        return this.cf == lgg2.cf && this.cg == lgg2.cg;
    }

    public final boolean fU(int n, int n2) {
        return this.cf == n && this.cg == n2;
    }

    public final int U(lgg lgg2) {
        int n = lgg2.cf - this.cf;
        int n2 = lgg2.cg - this.cg;
        return n * n + n2 * n2;
    }

    public final lgg fZ(int n, int n2) {
        return new lgg(this.cf + n, this.cg + n2);
    }

    public final lgg k(lhf lhf2) {
        return new lgg(this.cf + lhf2.rmN, this.cg + lhf2.H);
    }

    public final lgg r(lgs lgs2) {
        return new lgg(this.cf < lgs2.cf ? lgs2.cf : (this.cf >= lgs2.erB() ? lgs2.erB() - 1 : this.cf), this.cg < lgs2.cg ? lgs2.cg : (this.cg >= lgs2.cjG() ? lgs2.cjG() - 1 : this.cg));
    }

    public final int length() {
        double d2 = (double)this.cf * (double)this.cf + (double)this.cg * (double)this.cg;
        return (int)Math.sqrt(d2);
    }

    public final float eqF() {
        return this.cf * this.cf + this.cg * this.cg;
    }

    public final lgg V(lgg lgg2) {
        return new lgg(this.cf - lgg2.cf, this.cg - lgg2.cg);
    }

    public final lgg ga(int n, int n2) {
        return new lgg(this.cf - n, this.cg - n2);
    }

    public final int W(lgg lgg2) {
        int n = this.cf - lgg2.cf;
        int n2 = this.cg - lgg2.cg;
        double d2 = (double)n * (double)n + (double)n2 * (double)n2;
        return (int)Math.sqrt(d2);
    }

    public final int X(lgg lgg2) {
        return this.gb(lgg2.cf, lgg2.cg);
    }

    public final int gb(int n, int n2) {
        int n3 = this.cf - n;
        int n4 = this.cg - n2;
        return n3 * n3 + n4 * n4;
    }

    public lgg a(lgg lgg2, double d2) {
        return new lgg((int)((double)this.cf * (1.0 - d2) + (double)lgg2.cf * d2), (int)((double)this.cg * (1.0 - d2) + (double)lgg2.cg * d2));
    }

    public boolean equals(Object object) {
        if (object instanceof lgg) {
            return this.T((lgg)object);
        }
        assert (false);
        return false;
    }

    public int hashCode() {
        int n = this.cf + this.cg;
        return n * (n + this.cg) / 2 + this.cf;
    }

    public String toString() {
        return null;
    }

    private lgg() {
        this.cg = 0;
        this.cf = 0;
    }
}

