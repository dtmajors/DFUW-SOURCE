/*
 * Decompiled with CFR.
 */
import java.awt.Dimension;

public final class lhf
implements Comparable<lhf>,
lbq {
    public static final lhf rnv = new lhf(0, 0);
    public static final lbs<lhf> Persistor = new lbs<lhf>(){
        static final /* synthetic */ boolean $assertionsDisabled;

        public lhf a(lfu lfu2, lhf lhf2) {
            int n = lfu2.ad("W", lhf2 == null ? 0 : lhf2.rmN);
            int n2 = lfu2.ad("H", lhf2 == null ? 0 : lhf2.H);
            if (lhf2 != null && lhf2.fU(n, n2)) {
                return lhf2;
            }
            if (!$assertionsDisabled && !lfu2.eqA()) {
                throw new AssertionError();
            }
            return new lhf(n, n2);
        }

        static {
            $assertionsDisabled = !lhf.class.desiredAssertionStatus();
        }
    };
    public final int rmN;
    public final int H;

    public static lhf a(lhf lhf2, lhf lhf3) {
        int n = Math.min(lhf2.rmN, lhf3.rmN);
        int n2 = Math.min(lhf2.H, lhf3.H);
        if (n == lhf2.rmN && n2 == lhf2.H) {
            return lhf2;
        }
        if (n == lhf3.rmN && n2 == lhf3.H) {
            return lhf3;
        }
        return new lhf(n, n2);
    }

    public static lhf b(lhf lhf2, lhf lhf3) {
        int n = Math.max(lhf2.rmN, lhf3.rmN);
        int n2 = Math.max(lhf2.H, lhf3.H);
        if (n == lhf2.rmN && n2 == lhf2.H) {
            return lhf2;
        }
        if (n == lhf3.rmN && n2 == lhf3.H) {
            return lhf3;
        }
        return new lhf(n, n2);
    }

    public lhf(int n, int n2) {
        this.rmN = n;
        this.H = n2;
    }

    public lhf(lhf lhf2) {
        this(lhf2.rmN, lhf2.H);
    }

    public lhf(ldb ldb2, int n, int n2) {
        switch (ldb2) {
            case reo: {
                this.rmN = n;
                this.H = n2;
                break;
            }
            case rep: {
                this.rmN = n2;
                this.H = n;
                break;
            }
            default: {
                assert (false);
                this.rmN = 0;
                this.H = 0;
            }
        }
    }

    public final lhf p(lhf lhf2) {
        return this.gd(lhf2.rmN, lhf2.H);
    }

    public final lhf gd(int n, int n2) {
        return new lhf(this.rmN + n, this.H + n2);
    }

    public final lhf ea(double d2) {
        return new lhf((int)((double)this.rmN * d2), (int)((double)this.H * d2));
    }

    public final lhf t(ljp ljp2) {
        return new lhf((int)((float)this.rmN * ljp2.x), (int)((float)this.H * ljp2.y));
    }

    public final lhf q(lhf lhf2) {
        return new lhf(this.rmN - lhf2.rmN, this.H - lhf2.H);
    }

    public int e(ldb ldb2) {
        switch (ldb2) {
            case reo: {
                return this.rmN;
            }
            case rep: {
                return this.H;
            }
        }
        assert (false) : ldb2;
        return 0;
    }

    public lhf p(ldb ldb2, int n) {
        int n2 = this.rmN;
        int n3 = this.H;
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
        return new lhf(n2, n3);
    }

    public boolean r(lhf lhf2) {
        return this.rmN == lhf2.rmN && this.H == lhf2.H;
    }

    public boolean fU(int n, int n2) {
        return this.rmN == n && this.H == n2;
    }

    public static final lhf a(lhf lhf2, lhf lhf3, lhf lhf4) {
        return new lhf(lei.P(lhf2.rmN, lhf3.rmN, lhf4.rmN), lei.P(lhf2.H, lhf3.H, lhf4.H));
    }

    public final int length() {
        double d2 = (double)this.rmN * (double)this.rmN + (double)this.H * (double)this.H;
        return (int)Math.sqrt(d2);
    }

    public final int erS() {
        return this.rmN * this.rmN + this.H * this.H;
    }

    public final int s(lhf lhf2) {
        return this.erS() - lhf2.erS();
    }

    public boolean equals(Object object) {
        if (object instanceof lhf) {
            return this.r((lhf)object);
        }
        assert (false);
        return false;
    }

    public int hashCode() {
        int n = this.rmN + this.H;
        return n * (n + this.H) / 2 + this.rmN;
    }

    public String toString() {
        return null;
    }

    private lhf() {
        this.H = 0;
        this.rmN = 0;
    }

    public Dimension erT() {
        return new Dimension(this.rmN, this.H);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.s((lhf)object);
    }
}

