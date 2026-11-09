/*
 * Decompiled with CFR.
 */
public class jqv
extends jqp {
    public final lbh kAz;
    public final int nvA;
    public final a nTg;
    public final a nTh;
    private double nTd;
    private boolean nTe;
    private boolean nTi;
    private int nTj;
    private double nTf;

    public jqv(lbh lbh2, jqk jqk2, jqp.a a2, String string, lip lip2, int n, int n2, lbi<jpk> lbi2, String string2, lip lip3, String string3, lip lip4) {
        super(jqk2, a2, string, lip2, n, lbi2);
        this.kAz = lbh2;
        this.nvA = n2;
        this.nTg = new a(jqk2, jqp.a.nST, string2, lip3, -1, lbi2);
        this.nTh = new a(jqk2, jqp.a.nST, string3, lip4, -1, lbi2);
        this.nTd = 1.0;
        this.nTe = false;
        this.dRp();
    }

    public final double dRn() {
        return this.nTd;
    }

    public final void dI(double d2) {
        assert (d2 >= 0.0);
        this.nTd = d2;
        this.dRp();
    }

    public final boolean dRo() {
        return this.nTe;
    }

    public final void uF(boolean bl) {
        this.nTe = bl;
        this.nTi = false;
        this.dRp();
    }

    public int dOH() {
        return this.nvA;
    }

    @Override
    protected void fH(int n, int n2) {
        assert (lda.acc(n2));
        if (!this.nTi) {
            this.nTj = n;
            this.nTi = true;
            return;
        }
        if (n == this.nTj) {
            return;
        }
        float f = (float)((double)(n - this.nTj) * this.nTf);
        this.nTj = n;
        int n3 = (int)Math.signum(f);
        int n4 = (int)Math.abs(f);
        if (this.nvA > 0) {
            n4 /= this.nvA;
        }
        block4: for (int i = 0; i < n4; ++i) {
            switch (n3) {
                case -1: {
                    this.nTh.fG(1, n2);
                    this.nTh.fG(0, n2 + 1);
                    continue block4;
                }
                case 1: {
                    this.nTg.fG(1, n2);
                    this.nTg.fG(0, n2 + 1);
                    continue block4;
                }
                default: {
                    assert (false);
                    continue block4;
                }
            }
        }
    }

    @Override
    public jpf[] dRm() {
        return new jpf[]{this.nTg, this.nTh};
    }

    public String toString() {
        return null;
    }

    private void dRp() {
        this.nTf = this.nTd;
        if (this.nTe) {
            this.nTf = -this.nTf;
        }
    }
}

