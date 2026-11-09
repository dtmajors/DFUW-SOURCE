/*
 * Decompiled with CFR.
 */
public class jpu {
    private static final double nPY = 0.5;
    private final jpx dOy;
    public boolean nPZ = false;
    private double nQa = 0.0;

    public jpu(jpx jpx2) {
        this.dOy = jpx2;
    }

    public void dD(double d2) {
        if (d2 - this.nQa >= 1.5) {
            this.dE(d2);
        }
    }

    private void dE(double d2) {
        if (this.nPZ) {
            return;
        }
        byv byv2 = this.dOy.dQf().axF().aJD().aEP();
        if (byv2.Uv()) {
            return;
        }
        assert (byv2.aEA());
        this.nQa = d2;
        this.nPZ = true;
    }

    public boolean dF(double d2) {
        if (this.nPZ) {
            return true;
        }
        return d2 - this.nQa + 1.0 < 0.5;
    }
}

