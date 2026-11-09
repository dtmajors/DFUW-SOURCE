/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
public class jqf {
    private static final double nRP = 5.0;
    private static final double nRQ = 0.2;
    public final int nRR;
    public boolean nPZ = false;
    public double nRS = 0.0;
    public double nRN = 0.0;

    public jqf(int n) {
        this.nRR = n;
    }

    public String dRc() {
        return cxd.nO((int)this.nRR);
    }

    public boolean dH(double d2) {
        if (this.nRN == 0.0) {
            return false;
        }
        if (d2 >= this.nRN) {
            this.nRN = 0.0;
            return false;
        }
        return true;
    }

    public void dD(double d2) {
        if (this.nPZ) {
            return;
        }
        if (this.dH(d2)) {
            return;
        }
        if (this.nRS > 0.0 && d2 - this.nRS <= 0.2) {
            this.nPZ = true;
            this.nRS = 0.0;
            this.nRN = d2 + 5.0;
        } else {
            this.nRS = d2;
        }
    }
}

