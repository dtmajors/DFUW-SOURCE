/*
 * Decompiled with CFR.
 */
import java.awt.Rectangle;
import java.util.Random;

public final class lgs
implements lbr {
    public int cf;
    public int cg;
    public int rmN;
    public int H;

    public lgs() {
    }

    public lgs(int n, int n2, int n3, int n4) {
        this.cf = n;
        this.cg = n2;
        this.rmN = n3;
        this.H = n4;
    }

    public lgs(int n, int n2, lhf lhf2) {
        this.cf = n;
        this.cg = n2;
        this.rmN = lhf2.rmN;
        this.H = lhf2.H;
    }

    public lgs(lgg lgg2, int n, int n2) {
        this.cf = lgg2.cf;
        this.cg = lgg2.cg;
        this.rmN = n;
        this.H = n2;
    }

    public lgs(ldb ldb2, int n, int n2, int n3, int n4) {
        this.n(ldb2, n);
        this.n(ldb2.eni(), n3);
        this.o(ldb2, n2);
        this.o(ldb2.eni(), n4);
    }

    public lgs(lgs lgs2) {
        this.cf = lgs2.cf;
        this.cg = lgs2.cg;
        this.rmN = lgs2.rmN;
        this.H = lgs2.H;
    }

    public lgs(lgg lgg2, lhf lhf2) {
        this.cf = lgg2.cf;
        this.cg = lgg2.cg;
        this.rmN = lhf2.rmN;
        this.H = lhf2.H;
    }

    public final lgg l(lhf lhf2) {
        return new lgg(this.cf + (this.rmN - lhf2.rmN) / 2, this.cg + (this.H - lhf2.H) / 2);
    }

    public final int erB() {
        return this.cf + this.rmN;
    }

    public final int cjG() {
        return this.cg + this.H;
    }

    public final void set(int n, int n2, int n3, int n4) {
        this.cf = n;
        this.cg = n2;
        this.rmN = n3;
        this.H = n4;
    }

    public final void s(lgs lgs2) {
        this.cf = lgs2.cf;
        this.cg = lgs2.cg;
        this.rmN = lgs2.rmN;
        this.H = lgs2.H;
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

    public final void n(ldb ldb2, int n) {
        switch (ldb2) {
            case reo: {
                this.cf = n;
                break;
            }
            case rep: {
                this.cg = n;
                break;
            }
            default: {
                assert (false) : ldb2;
                break;
            }
        }
    }

    public final int e(ldb ldb2) {
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

    public final void o(ldb ldb2, int n) {
        switch (ldb2) {
            case reo: {
                this.rmN = n;
                break;
            }
            case rep: {
                this.H = n;
                break;
            }
            default: {
                assert (false) : ldb2;
                break;
            }
        }
    }

    public final lgg aI() {
        return new lgg(this.cf, this.cg);
    }

    public final void c(lgg lgg2) {
        this.cf = lgg2.cf;
        this.cg = lgg2.cg;
    }

    public final lhf cqv() {
        return new lhf(this.rmN, this.H);
    }

    public final void c(lhf lhf2) {
        this.rmN = lhf2.rmN;
        this.H = lhf2.H;
    }

    public final lgg erC() {
        return new lgg(this.cf + this.rmN, this.cg + this.H);
    }

    public final boolean m(lhf lhf2) {
        return this.rmN == lhf2.rmN && this.H == lhf2.H;
    }

    public void t(lgs lgs2) {
        this.cf = lgs2.cf;
        this.cg = lgs2.cg;
        this.rmN = lgs2.rmN;
        this.H = lgs2.H;
    }

    public final int erD() {
        return this.cf + this.rmN / 2;
    }

    public final int erE() {
        return this.cg + this.H / 2;
    }

    public final lgg cfx() {
        return new lgg(this.erD(), this.erE());
    }

    public final boolean contains(int n, int n2, int n3, int n4) {
        int n5 = this.rmN;
        int n6 = this.H;
        if ((n5 | n6 | n3 | n4) < 0) {
            assert (false);
            return false;
        }
        int n7 = this.cf;
        int n8 = this.cg;
        if (n < n7 || n2 < n8) {
            return false;
        }
        n5 += n7;
        if ((n3 += n) <= n ? n5 >= n7 || n3 > n5 : n5 >= n7 && n3 > n5) {
            return false;
        }
        n6 += n8;
        return !((n4 += n2) <= n2 ? n6 >= n8 || n4 > n6 : n6 >= n8 && n4 > n6);
    }

    public final boolean u(lgs lgs2) {
        return this.contains(lgs2.cf, lgs2.cg, lgs2.rmN, lgs2.H);
    }

    public final boolean A(lgg lgg2) {
        return lgg2.cf >= this.cf && lgg2.cg >= this.cg && lgg2.cf < this.cf + this.rmN && lgg2.cg < this.cg + this.H;
    }

    public final boolean contains(int n, int n2) {
        return n >= this.cf && n2 >= this.cg && n < this.cf + this.rmN && n2 < this.cg + this.H;
    }

    public final boolean v(lgs lgs2) {
        return this.cf == lgs2.cf && this.cg == lgs2.cg && this.rmN == lgs2.rmN && this.H == lgs2.H;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof lgs)) {
            return false;
        }
        return this.v((lgs)object);
    }

    public int hashCode() {
        long l = this.cf;
        l += (long)(this.cg * 37);
        l += (long)(this.rmN * 43);
        return (int)(l += (long)(this.H * 47)) ^ (int)(l >> 32);
    }

    public final lgs w(lgs lgs2) {
        int n = Math.max(this.cf, lgs2.cf);
        int n2 = Math.max(this.cg, lgs2.cg);
        int n3 = Math.min(this.cf + this.rmN, lgs2.cf + lgs2.rmN);
        int n4 = Math.min(this.cg + this.H, lgs2.cg + lgs2.H);
        int n5 = Math.max(0, n3 - n);
        int n6 = Math.max(0, n4 - n2);
        return new lgs(n, n2, n5, n6);
    }

    public final boolean isEmpty() {
        return this.rmN <= 0 || this.H <= 0;
    }

    public final boolean x(lgs lgs2) {
        return this.L(lgs2.cf, lgs2.cg, lgs2.rmN, lgs2.H);
    }

    public final boolean L(int n, int n2, int n3, int n4) {
        int n5 = this.rmN;
        int n6 = this.H;
        int n7 = n3;
        int n8 = n4;
        if (n7 <= 0 || n8 <= 0 || n5 <= 0 || n6 <= 0) {
            return false;
        }
        int n9 = this.cf;
        int n10 = this.cg;
        int n11 = n;
        int n12 = n2;
        n8 += n12;
        n5 += n9;
        n6 += n10;
        return !((n7 += n11) >= n11 && n7 <= n9 || n8 >= n12 && n8 <= n10 || n5 >= n9 && n5 <= n11 || n6 >= n10 && n6 <= n12);
    }

    public final lgs n(lhf lhf2) {
        return new lgs(this.cf + lhf2.rmN, this.cg + lhf2.H, this.rmN, this.H);
    }

    public final lgs Y(lgg lgg2) {
        return new lgs(this.cf + lgg2.cf, this.cg + lgg2.cg, this.rmN, this.H);
    }

    public final void Z(lgg lgg2) {
        this.cf += lgg2.cf;
        this.cg += lgg2.cg;
    }

    public final lgs o(lhf lhf2) {
        return new lgs(this.cf - lhf2.rmN, this.cg - lhf2.H, this.rmN + lhf2.rmN * 2, this.H + lhf2.H * 2);
    }

    public final lgs gc(int n, int n2) {
        return new lgs(this.cf - n, this.cg - n2, this.rmN + n * 2, this.H + n2 * 2);
    }

    public final lgg a(Random random) {
        return new lgg(this.cf + random.nextInt(this.rmN), this.cg + random.nextInt(this.H));
    }

    public String toString() {
        return null;
    }

    @Override
    public boolean a(lfu lfu2) {
        this.cf = lfu2.ad("X", this.cf);
        this.cg = lfu2.ad("Y", this.cg);
        this.rmN = lfu2.ad("W", this.rmN);
        this.H = lfu2.ad("H", this.H);
        return lfu2.eqA();
    }

    public final lhf y(lgs lgs2) {
        int n;
        int n2 = 0;
        int n3 = 0;
        int n4 = lgs2.cf + lgs2.rmN - (this.cf + this.rmN);
        if (n4 > 0) {
            n2 = n4;
        }
        if ((n4 = lgs2.cf - n2 - this.cf) < 0) {
            n2 += n4;
        }
        if ((n = lgs2.cg + lgs2.H - (this.cg + this.H)) > 0) {
            n3 = n;
        }
        if ((n = lgs2.cg - n3 - this.cg) < 0) {
            n3 += n;
        }
        return new lhf(-n2, -n3);
    }

    public Rectangle erF() {
        return new Rectangle(this.cf, this.cg, this.rmN, this.H);
    }
}

