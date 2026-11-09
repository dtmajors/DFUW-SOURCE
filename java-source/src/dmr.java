/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class dmr {
    private int gJh = 0;
    private int gJi = 0;
    private int[] gJj = null;
    private int[] gJk = null;
    private dms[] gJl = null;
    private dmt[] gJm = null;

    public int bqE() {
        return this.gJh;
    }

    public int bqF() {
        return this.gJi;
    }

    public int[] bqG() {
        return this.gJj;
    }

    public int[] bqH() {
        return this.gJk;
    }

    public dms[] bqI() {
        return this.gJl;
    }

    public dmt[] bqJ() {
        return this.gJm;
    }

    public dmr(int n, int n2, int[] nArray, int[] nArray2, dms[] dmsArray, dmt[] dmtArray) {
        this.gJh = n;
        this.gJi = n2;
        this.gJj = nArray;
        this.gJk = nArray2;
        this.gJl = dmsArray;
        this.gJm = dmtArray;
    }

    public Set<Integer> H(int n, boolean bl) {
        Set<Integer> set = lcn.emx();
        for (int i = 0; i < this.gJm.length; ++i) {
            if (this.gJm[i].bqK() != n) continue;
            for (int j = 0; j < this.gJm[i].bqO().length; ++j) {
                int n2 = this.gJl[this.gJm[i].bqO()[j]].bqK();
                int n3 = this.bR(n, n2);
                if (!bl && n3 == 999 || set.contains(n3)) continue;
                set.add(n3);
            }
        }
        return set;
    }

    public boolean bQ(int n, int n2) {
        int n3 = n2 / 100 % 1000;
        int n4 = n2 / 100 / 1000;
        return n == n3 || n == n4;
    }

    public int bR(int n, int n2) {
        if (!this.bQ(n, n2)) {
            return n;
        }
        int n3 = n2 / 100 % 1000;
        int n4 = n2 / 100 / 1000;
        return n == n3 ? n4 : n3;
    }

    public Set<Integer> AN(int n) {
        return this.bS(n, 999);
    }

    public Set<Integer> AO(int n) {
        Set<Integer> set = lcn.emx();
        for (int i = 0; i < this.gJm.length; ++i) {
            if (this.gJm[i].bqK() != n) continue;
            int n2 = n * 100000 + 99900;
            int n3 = n2 + 99;
            int n4 = 99900000 + n * 100;
            int n5 = n4 + 99;
            for (int j = 0; j < this.gJm[i].bqO().length; ++j) {
                int n6 = this.gJl[this.gJm[i].bqO()[j]].bqK();
                if (n6 >= n2 && n6 <= n3 || n6 >= n4 && n6 <= n5) continue;
                set.add(n6);
            }
        }
        return set;
    }

    public Set<Integer> bS(int n, int n2) {
        Set<Integer> set = lcn.emx();
        for (int i = 0; i < this.gJm.length; ++i) {
            if (this.gJm[i].bqK() != n) continue;
            int n3 = n * 100000 + n2 * 100;
            int n4 = n3 + 99;
            int n5 = n2 * 100000 + n * 100;
            int n6 = n5 + 99;
            for (int j = 0; j < this.gJm[i].bqO().length; ++j) {
                int n7 = this.gJl[this.gJm[i].bqO()[j]].bqK();
                if ((n7 < n3 || n7 > n4) && (n7 < n5 || n7 > n6)) continue;
                set.add(n7);
            }
        }
        return set;
    }
}

