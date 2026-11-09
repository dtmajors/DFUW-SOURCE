/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class jlz {
    private boolean nuw = true;
    private double nux = 0.05;
    private double nuy = 0.0;
    private final int nuz;
    private final ArrayList<a> nuA = new ArrayList();
    private final List<a> nuB = new LinkedList<a>();

    public jlz(int n, int n2) {
        this.nuz = n;
        this.nuA.add(new a(this, 0, n2));
    }

    public void uj(boolean bl) {
        this.nuw = bl;
    }

    public void fE(int n, int n2) {
        if (!this.nuA.isEmpty()) assert (n2 > this.nuA.get((int)(this.nuA.size() - 1)).nuD);
        this.nuA.add(new a(this, n - this.nuz, n2));
    }

    public double aD(ldz ldz2) {
        this.aE(ldz2);
        this.aF(ldz2);
        this.dLO();
        if (this.nuB.isEmpty()) {
            return 0.0;
        }
        double d2 = 0.0;
        for (a a2 : this.nuB) {
            d2 += this.a(a2);
        }
        if (d2 <= 0.0) {
            return 0.0;
        }
        double d3 = 0.0;
        for (a a3 : this.nuB) {
            d3 += this.a(a3) * ((double)a3.PC / d2);
        }
        if (this.nuw) {
            double d4 = d3 - this.nuy;
            this.nuy = d3;
            return d4;
        }
        double d5 = (double)this.nuB.get((int)(this.nuB.size() - 1)).PC - this.nuy;
        this.nuy = this.nuB.get((int)(this.nuB.size() - 1)).PC;
        return d5;
    }

    private void aE(ldz ldz2) {
        for (a a2 : this.nuB) {
            a2.nuC += ldz2.qwh;
        }
    }

    private void aF(ldz ldz2) {
        if (this.nuA.isEmpty()) {
            return;
        }
        int n = this.nuA.size();
        for (int j = 0; j < n; ++j) {
            a a2 = this.nuA.get(j);
            double d2 = (double)(n - j - 1) / (double)n;
            a2.nuC = d2 * ldz2.qwh;
            this.nuB.add(a2);
        }
        this.nuA.clear();
    }

    private void dLO() {
        Iterator<a> iterator = this.nuB.iterator();
        while (iterator.hasNext()) {
            a a2 = iterator.next();
            if (a2.nuC > this.nux) {
                iterator.remove();
                continue;
            }
            return;
        }
    }

    private double a(a a2) {
        assert (a2.nuC >= 0.0);
        assert (a2.nuC <= this.nux);
        double d2 = lew.c(a2.nuC / this.nux, 0.0, 1.0);
        double d3 = lew.c(0.5 * (1.0 + Math.cos(Math.PI * d2)), 0.0, 1.0);
        return d3;
    }

    public double dLP() {
        return this.nux;
    }

    public void dz(double d2) {
        this.nux = d2;
    }
}

