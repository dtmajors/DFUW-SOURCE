/*
 * Decompiled with CFR.
 */
public class ejt
extends ejm {
    private int ist = -1;
    private int ew = axz.cuC.ordinal();
    private double hsq = 0.0;
    private int isu = -1;
    private aze[] czW = null;

    public int bHD() {
        return this.ist;
    }

    public void El(int n) {
        this.ist = n;
    }

    public axz bHF() {
        return axz.getValueByOrdinal(this.ew);
    }

    public void a(axz axz2) {
        this.ew = axz2 == null ? this.ew : axz2.ordinal();
    }

    public double bHG() {
        return this.hsq;
    }

    public void ce(double d) {
        this.hsq = d;
    }

    public int bHH() {
        return this.isu;
    }

    public void Em(int n) {
        this.isu = n;
    }

    public aze[] abo() {
        return this.czW;
    }

    public void b(aze[] azeArray) {
        this.czW = azeArray;
    }

    ejt() {
        super(18730);
    }
}

