/*
 * Decompiled with CFR.
 */
import java.util.List;

public abstract class iro
extends ipx {
    private ipz muE;
    private ipz muF;
    private int muG = 0;
    private int muH;
    private int muI;
    private int muJ;
    private iru muK;
    private boolean muL = false;
    private List<ipf> lWk = lcn.emv();

    public iro() {
        this.muE = new ipz();
        this.muE.sa(true);
        this.W(this.muE);
        this.muF = new ipz();
        this.muE.W(this.muF);
    }

    public int dnt() {
        return this.muH;
    }

    public int dnu() {
        return this.muI;
    }

    public void eI(int n, int n2) {
        this.muH = Math.max(n, 0);
        this.muI = Math.max(n2, 0);
        this.pack();
    }

    public int getItemCount() {
        return this.muJ;
    }

    public void Se(int n) {
        this.muJ = Math.max(n, 0);
        this.pack();
    }

    public int dnv() {
        return this.muG;
    }

    public void Sf(int n) {
        this.muG = Math.max(n, 0);
        this.pack();
    }

    public iru dnw() {
        return this.muK;
    }

    public void a(iru iru2) {
        if (this.muK != null) {
            this.muK.removeFromParent();
        }
        this.muK = iru2;
        if (this.muK != null) {
            this.W(this.muK);
        }
    }

    public int dnx() {
        return -this.muF.getY();
    }

    public void Sg(int n) {
        if ((n = lew.R(0, n, this.dny() - 1)) == this.dnx()) {
            return;
        }
        this.muF.RI(-n);
        this.pack();
        this.Sk(this.dnx());
    }

    public void Sh(int n) {
        this.Sg(n * this.muI - this.getHeight() / 2);
    }

    public ipf Si(int n) {
        int n2 = this.dnx() / this.muI;
        return n >= n2 && n < n2 + this.lWk.size() ? this.lWk.get(n - n2) : null;
    }

    public int dny() {
        return this.muJ * this.muI - this.getHeight();
    }

    public boolean dnz() {
        return this.muL;
    }

    public void sb(boolean bl) {
        this.muL = bl;
    }

    @Override
    public void cPj() {
        this.setSize(this.muH + this.muG, this.muI * this.muJ);
    }

    @Override
    public void cPk() {
        int n;
        this.muE.r(0, 0, this.getWidth() - this.muG, this.getHeight());
        int n2 = this.muJ * this.muI;
        int n3 = this.dny();
        boolean bl = n3 > 0;
        this.muF.r(0, bl ? lew.R(-n3 + 1, this.muF.getY(), 0) : 0, this.getWidth(), n2);
        int n4 = this.dnx() / this.muI;
        int n5 = (this.dnx() + Math.min(this.getHeight(), n2) + this.muI - 1) / this.muI;
        int n6 = n5 - n4;
        if (n6 > this.lWk.size()) {
            for (n = n4; n < n5; ++n) {
                ipf ipf2 = this.Qc(n);
                this.lWk.add(ipf2);
                this.muF.W(ipf2);
            }
        } else if (n6 < this.lWk.size()) {
            while (n6 < this.lWk.size()) {
                this.lWk.remove(this.lWk.size() - 1).removeFromParent();
            }
        }
        n = n4 * this.muI;
        for (int i = 0; i < this.lWk.size(); ++i) {
            ipf ipf3 = this.lWk.get(i);
            ipf3.r(0, n + i * this.muI, this.muH, this.muI);
            this.a(n4 + i, ipf3);
        }
        this.cPu();
        if (this.muK != null) {
            if (bl) {
                this.muK.setVisible(true);
                this.muK.cqF();
                this.muK.r(this.getWidth() - this.muG, 0, this.muG, this.getHeight());
                this.muK.a(0, this.muK.getValue(), n3, 1, this.getHeight(), false);
            } else {
                this.muK.setVisible(false);
            }
        }
    }

    public abstract ipf Qc(int var1);

    public abstract void a(int var1, ipf var2);

    public abstract void cPu();

    public void Sj(int n) {
    }

    public void Sk(int n) {
    }

    public void Sl(int n) {
    }

    @Override
    public boolean c(int n, int n2, float f) {
        this.Sg(this.dnx() - (int)f * 32);
        return true;
    }
}

