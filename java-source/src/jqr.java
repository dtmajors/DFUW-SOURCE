/*
 * Decompiled with CFR.
 */
public class jqr
extends jqq
implements jpg {
    private double nTd;
    private boolean nTe;
    private double nTf;
    public int nvA;

    public jqr(jqk jqk2, jqp.a a2, String string, lip lip2, int n, int n2, lbi<jpk> lbi2) {
        super(jqk2, a2, string, lip2, n, lbi2);
        this.nvA = n2;
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
        this.dRp();
    }

    public final void Vt(int n) {
        assert (n > 0);
        this.nvA = n;
    }

    @Override
    public int dOH() {
        return this.nvA;
    }

    @Override
    protected void fH(int n, int n2) {
        assert (lda.acc(n2));
    }

    protected void h(double d2, int n) {
        this.kuT.m(new jpl(this, (float)(this.nTf * d2)));
    }

    public String toString() {
        return null;
    }

    private void dRp() {
        this.nTf = this.nTe ? -this.nTd : this.nTd;
    }
}

