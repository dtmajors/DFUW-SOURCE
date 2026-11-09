/*
 * Decompiled with CFR.
 */
import java.util.HashSet;

public class iao {
    private static iao lBP = new iao();
    private hwo[][] lBQ = new hwo[8][];
    private HashSet<iam> lBR;
    private int lBS;

    public static iao cKB() {
        return lBP;
    }

    public void a(iam iam2) {
        this.lBR.add(iam2);
    }

    public void b(iam iam2) {
        this.lBR.remove(iam2);
    }

    public hwo ds(int n, int n2) {
        if (!ial.dq(n, n2)) {
            return null;
        }
        return this.lBQ[n][n2];
    }

    public hwo Pk(int n) {
        if (!ial.Pi(n)) {
            return null;
        }
        for (int j = 1; j >= 0; --j) {
            hwo hwo2 = this.lBQ[n][j];
            if (hwo2 == null) continue;
            return hwo2;
        }
        return null;
    }

    public hwo[] Pl(int n) {
        if (!ial.Pi(n)) {
            return null;
        }
        hwo[] hwoArray = new hwo[2];
        for (int j = 0; j < 2; ++j) {
            hwoArray[j] = this.lBQ[n][j];
        }
        return hwoArray;
    }

    public hwo[] cKC() {
        return this.lBS >= 0 ? this.Pl(this.lBS) : null;
    }

    public hwo a(iap iap2) {
        if (iap2 == null) {
            return null;
        }
        return this.ds(iap2.lBT, iap2.index);
    }

    public iap d(hwo hwo2) {
        for (int j = 0; j < 8; ++j) {
            for (int i2 = 0; i2 < 2; ++i2) {
                if (this.lBQ[j][i2] != hwo2) continue;
                return new iap(j, i2);
            }
        }
        return null;
    }

    public boolean rs(ldv ldv2) {
        for (int j = 0; j < 8; ++j) {
            for (int i2 = 0; i2 < 2; ++i2) {
                hwo hwo2 = this.lBQ[j][i2];
                if (hwo2 == null || hwo2.cBu() == null || !hwo2.cBu().getGUID().equals(ldv2)) continue;
                return true;
            }
        }
        return false;
    }

    public iap rt(ldv ldv2) {
        for (int j = 0; j < 8; ++j) {
            for (int i2 = 0; i2 < 2; ++i2) {
                hwo hwo2 = this.lBQ[j][i2];
                if (hwo2 == null || hwo2.cBu() == null || !hwo2.cBu().getGUID().equals(ldv2)) continue;
                return new iap(j, i2);
            }
        }
        return null;
    }

    public iap Pm(int n) {
        for (int j = 0; j < 8; ++j) {
            for (int i2 = 0; i2 < 2; ++i2) {
                hwo hwo2 = this.lBQ[j][i2];
                if (hwo2 == null || hwo2.cBu() != null || hwo2.cBq().getType() != n) continue;
                return new iap(j, i2);
            }
        }
        return null;
    }

    public iap e(hwo hwo2) {
        iap iap2;
        if (hwo2 == null) {
            return null;
        }
        if (hwo2.cBu() != null && (iap2 = this.rt(hwo2.cBu().getGUID())) != null) {
            return iap2;
        }
        return this.Pm(hwo2.cBq().getType());
    }

    public iap ag(ldv ldv2, int n) {
        iap iap2;
        if (ldv2 != null && (iap2 = this.rt(ldv2)) != null) {
            return iap2;
        }
        return this.Pm(n);
    }

    public iap am(long l2) {
        for (int j = 0; j < 8; ++j) {
            for (int i2 = 0; i2 < 2; ++i2) {
                hwo hwo2 = this.lBQ[j][i2];
                if (hwo2 == null) continue;
                if (hwo2.cBu() != null && hwo2.cBu() instanceof bsl && ((bsl)hwo2.cBu()).AQ() == l2) {
                    return new iap(j, i2);
                }
                if (hwo2.cBo() != l2) continue;
                return new iap(j, i2);
            }
        }
        return null;
    }

    public iap a(hwo hwo2, int n) {
        if (hwo2 == null) {
            return null;
        }
        if (!ial.Pi(n)) {
            return null;
        }
        int n2 = 0;
        for (n2 = 0; n2 < 2 && this.lBQ[n][n2] != null; ++n2) {
        }
        if (n2 == 2) {
            return null;
        }
        this.lBQ[n][n2] = hwo2;
        iap iap2 = new iap(n, n2);
        for (iam iam2 : this.lBR) {
            iam2.a(hwo2, iap2);
        }
        return iap2;
    }

    public void f(hwo hwo2) {
        if (hwo2 == null) {
            return;
        }
        this.b(this.d(hwo2));
    }

    public void b(iap iap2) {
        if (iap2 == null) {
            return;
        }
        if (!iap2.isValid()) {
            return;
        }
        hwo hwo2 = this.lBQ[iap2.lBT][iap2.index];
        if (hwo2 == null) {
            return;
        }
        this.lBQ[iap2.lBT][iap2.index] = null;
        for (iam iam2 : this.lBR) {
            iam2.d(hwo2, iap2);
        }
    }

    public void removeItem(int n) {
        if (!ial.Pi(n)) {
            return;
        }
        for (int j = 1; j >= 0; --j) {
            if (this.lBQ[n][j] == null) continue;
            this.b(new iap(n, j));
            return;
        }
    }

    public void Pn(int n) {
        if (!ial.Pi(n)) {
            return;
        }
        for (int j = 0; j < 2; ++j) {
            this.b(new iap(n, j));
        }
    }

    public void dt(int n, int n2) {
        int n3;
        if (!ial.Pi(n)) {
            return;
        }
        if (!ial.Pi(n2)) {
            return;
        }
        hwo[] hwoArray = new hwo[2];
        for (n3 = 0; n3 < 2; ++n3) {
            hwoArray[n3] = this.lBQ[n][n3];
        }
        this.Pn(n);
        this.Pn(n2);
        for (n3 = 0; n3 < 2; ++n3) {
            this.a(hwoArray[n3], n2);
        }
    }

    public int cKD() {
        for (int j = 0; j < 8; ++j) {
            if (this.Ps(j)) continue;
            return j;
        }
        return -1;
    }

    public boolean Po(int n) {
        if (!ial.Pi(n)) {
            return false;
        }
        return !this.Ps(n);
    }

    public void a(hwo hwo2, bsh bsh2) {
        if (hwo2 == null) {
            return;
        }
        iap iap2 = this.d(hwo2);
        if (iap2 == null) {
            return;
        }
        hwo2.y(bsh2);
        for (iam iam2 : this.lBR) {
            iam2.b(hwo2, iap2);
        }
    }

    public iap Pp(int n) {
        if (!ial.Pi(n)) {
            return null;
        }
        for (int j = 0; j < 2; ++j) {
            hwo hwo2 = this.lBQ[n][j];
            if (hwo2 == null || !hwo2.cBR() && !hwo2.cCg()) continue;
            return new iap(n, j);
        }
        return null;
    }

    public iap Pq(int n) {
        if (!ial.Pi(n)) {
            return null;
        }
        for (int j = 0; j < 2; ++j) {
            hwo hwo2 = this.lBQ[n][j];
            if (hwo2 == null || !hwo2.cBP() && !hwo2.cCe()) continue;
            return new iap(n, j);
        }
        return null;
    }

    public int cKE() {
        return this.lBS;
    }

    public void Pr(int n) {
        if (n != -1 && !ial.Pi(n)) {
            return;
        }
        if (n == this.lBS) {
            return;
        }
        this.lBS = n;
        for (iam iam2 : this.lBR) {
            iam2.Pf(n);
        }
    }

    public void dj(double d2) {
        int n = this.lBS;
        if (d2 < 0.0) {
            int n2 = 0;
            int n3 = this.lBS + 1;
            while (n2 < 8) {
                if (n3 == 8) {
                    n3 = 0;
                }
                if (this.Ps(n3)) {
                    n = n3;
                    break;
                }
                ++n2;
                ++n3;
            }
        } else if (d2 > 0.0) {
            int n4 = 0;
            int n5 = this.lBS - 1;
            while (n4 < 8) {
                if (n5 < 0) {
                    n5 = 7;
                }
                if (this.Ps(n5)) {
                    n = n5;
                    break;
                }
                ++n4;
                --n5;
            }
        } else {
            return;
        }
        this.Pr(n);
    }

    public void b(cxc cxc2, float f, int n) {
        for (int j = 0; j < 8; ++j) {
            for (int i2 = 0; i2 < 2; ++i2) {
                hwo hwo2 = this.lBQ[j][i2];
                if (hwo2 == null || !hwo2.a(cxc2, f, n)) continue;
                for (iam iam2 : this.lBR) {
                    iam2.c(hwo2, new iap(j, i2));
                }
            }
        }
    }

    private iao() {
        for (int j = 0; j < 8; ++j) {
            this.lBQ[j] = new hwo[2];
        }
        this.lBR = new HashSet();
        this.lBS = -1;
    }

    private boolean Ps(int n) {
        for (hwo hwo2 : this.lBQ[n]) {
            if (hwo2 == null) continue;
            return true;
        }
        return false;
    }
}

