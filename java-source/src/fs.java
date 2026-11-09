/*
 * Decompiled with CFR.
 */
public class fs {
    public static final gs SZ = new gs();
    private float Ta = SZ.iv();
    private double Tb = Double.MAX_VALUE;
    private double Tc = Double.MAX_VALUE;
    private boolean Td = true;

    public float hg() {
        return this.Ta;
    }

    public boolean a(ldz ldz2, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (!SZ.it()) {
            if (this.Ta != SZ.iv()) {
                this.Ta = SZ.iv();
                return true;
            }
            return false;
        }
        double d = ldz2.rgz;
        if (this.Tb == Double.MAX_VALUE) {
            this.Tb = d;
            this.Tc = d;
            return false;
        }
        float f2 = SZ.iz();
        float f3 = SZ.iA();
        float f4 = SZ.iw();
        float f5 = SZ.ix();
        float f6 = SZ.ij();
        float f7 = SZ.iy();
        float f8 = SZ.iu();
        float f9 = SZ.iv();
        if (this.Ta > f9 || this.Ta > f8 && (float)n > f6 + f7) {
            float f10;
            if (this.Td) {
                this.Tc = d;
                f10 = (float)(d - this.Tb);
            } else {
                f10 = (float)(d - this.Tc);
            }
            this.Td = false;
            this.Tb = d;
            assert (f10 > 0.0f);
            float f11 = Math.min(f3, f10 * f4 / 60.0f);
            if (f11 < f2) {
                return false;
            }
            this.Ta = lew.A(this.Ta - f11, f8, f9);
            this.Tb = d;
            this.Tc = d;
            return true;
        }
        if (this.Ta < f8 || this.Ta < f9 && (float)n < f6 - f7) {
            float f12;
            if (this.Td) {
                f12 = (float)(d - this.Tc);
            } else {
                this.Tc = d;
                f12 = (float)(d - this.Tb);
            }
            this.Td = true;
            this.Tb = d;
            assert (f12 >= 0.0f);
            if (this.Ta >= f9) {
                return false;
            }
            float f13 = Math.min(f3, f12 * f5 / 60.0f);
            if (f13 < f2) {
                return false;
            }
            this.Ta = lew.A(this.Ta + f13, f8, f9);
            this.Tb = d;
            this.Tc = d;
            return true;
        }
        this.Tc = d;
        this.Tb = d;
        return false;
    }
}

