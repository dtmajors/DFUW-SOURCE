/*
 * Decompiled with CFR.
 */
public class irf
implements irj {
    private double mun = 1.0;

    public irf(double d2) {
        this.mun = Math.max(0.0, Math.min(d2, 1.0));
    }

    @Override
    public int getSize(int n) {
        return (int)((double)n * this.mun);
    }
}

