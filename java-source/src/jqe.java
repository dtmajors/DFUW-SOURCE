/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
public class jqe {
    private static final double nRH = 0.8;
    private static final double nRI = 0.25;
    private static final double nRJ = 0.5;
    private final jpx dOy;
    public boolean nPZ = false;
    private int nRK = -1;
    private double nRL = 0.0;
    private double nRM = 0.0;
    private double nRN = 0.0;
    private int nRO = -1;

    public jqe(jpx jpx2) {
        this.dOy = jpx2;
    }

    public int dRb() {
        return this.nRO;
    }

    public boolean dG(double d2) {
        if (this.nPZ) {
            return true;
        }
        return d2 - this.nRM < 0.5;
    }

    public void j(int n, double d2) {
        if (this.nRK != n) {
            this.nRK = n;
        } else if (d2 - this.nRL <= 0.25 && d2 - this.nRM >= 0.5) {
            this.k(n, d2);
        }
        this.nRL = d2;
    }

    private String nO(int n) {
        return cxd.nO((int)n);
    }

    private boolean dH(double d2) {
        if (this.nRN == 0.0) {
            return false;
        }
        if (d2 >= this.nRN) {
            this.nRN = 0.0;
            this.nRO = -1;
            return false;
        }
        return true;
    }

    private void k(int n, double d2) {
        if (this.nPZ) {
            return;
        }
        if (this.dH(d2)) {
            return;
        }
        byv byv2 = this.dOy.dQf().axF().aJD().aEP();
        if (byv2.vK() != 3) {
            return;
        }
        if (byv2.vO() == 3) {
            return;
        }
        if (byv2.Uv()) {
            return;
        }
        this.nRM = d2;
        this.nPZ = true;
        this.nRN = d2 + 0.8;
        this.nRO = n;
    }
}

