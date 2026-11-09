/*
 * Decompiled with CFR.
 */
public class gs {
    private boolean Xy = false;
    private float Xz = 20.0f;
    private float XA = 2.0f;
    private float XB = 40.0f;
    private float XC = 150.0f;
    private float XD = 750.0f;
    private float XE = 125.0f;
    private float XF = 1.0f;
    private float XG = 100.0f;
    private boolean XH = true;
    private float XI = 25.0f;
    private float XJ = 300.0f;
    private float XK = 560.0f;
    private float XL = 140.0f;
    private float XM = 5.0f;
    private float XN = 1.0f;
    private float XO = 140.0f;
    private double Tb = Double.MAX_VALUE;
    private double Tc = Double.MAX_VALUE;
    private boolean XP = true;
    private float XQ = this.XC;

    public float ij() {
        return this.XQ;
    }

    public void a(ldz ldz2, int n) {
        if (!this.Xy) {
            this.XQ = this.XC;
            return;
        }
        double d = ldz2.rgz;
        if (this.Tb == Double.MAX_VALUE) {
            this.Tb = d;
            this.Tc = d;
            return;
        }
        if (this.XQ > this.XC || this.XQ > this.XB && (float)n < this.Xz - this.XA) {
            float f;
            if (this.XP) {
                this.Tc = d;
                f = (float)(d - this.Tb);
            } else {
                f = (float)(d - this.Tc);
            }
            this.XP = false;
            this.Tb = d;
            assert (f > 0.0f);
            float f2 = Math.min(this.XG, f * this.XD / 60.0f);
            if (f2 < this.XF) {
                return;
            }
            this.XQ -= f2;
            if (this.XQ < this.XB) {
                this.XQ = this.XB;
            }
            this.Tc = d;
        } else if (this.XQ < this.XB || this.XQ < this.XC && (float)n > this.Xz + this.XA) {
            float f;
            if (this.XP) {
                f = (float)(d - this.Tc);
            } else {
                this.Tc = d;
                f = (float)(d - this.Tb);
            }
            this.XP = true;
            this.Tb = d;
            assert (f >= 0.0f);
            float f3 = Math.min(this.XG, f * this.XE / 60.0f);
            if (f3 < this.XF) {
                return;
            }
            this.XQ += f3;
            if (this.XQ > this.XC) {
                this.XQ = this.XC;
            }
            this.Tc = d;
        } else {
            this.Tc = d;
            this.Tb = d;
            return;
        }
    }

    public boolean ik() {
        return this.Xy;
    }

    public void F(boolean bl) {
        this.Xy = bl;
    }

    public float il() {
        return this.Xz;
    }

    public void s(float f) {
        this.Xz = f;
    }

    public float im() {
        return this.XA;
    }

    public void t(float f) {
        this.XA = f;
    }

    public float in() {
        return this.XB;
    }

    public void u(float f) {
        this.XB = f;
    }

    public float io() {
        return this.XC;
    }

    public void v(float f) {
        this.XC = f;
    }

    public float ip() {
        return this.XD;
    }

    public void w(float f) {
        this.XD = f;
    }

    public float iq() {
        return this.XE;
    }

    public void x(float f) {
        this.XE = f;
    }

    public float ir() {
        return this.XF;
    }

    public void y(float f) {
        this.XF = f;
    }

    public float is() {
        return this.XG;
    }

    public void z(float f) {
        this.XG = f;
    }

    public boolean it() {
        return this.XH;
    }

    public void G(boolean bl) {
        this.XH = bl;
    }

    public float iu() {
        return this.XI;
    }

    public void A(float f) {
        this.XI = f;
    }

    public float iv() {
        return this.XJ;
    }

    public void B(float f) {
        this.XJ = f;
    }

    public float iw() {
        return this.XK;
    }

    public void C(float f) {
        this.XK = f;
    }

    public float ix() {
        return this.XL;
    }

    public void D(float f) {
        this.XL = f;
    }

    public float iy() {
        return this.XM;
    }

    public void E(float f) {
        this.XM = f;
    }

    public float iz() {
        return this.XN;
    }

    public void F(float f) {
        this.XN = f;
    }

    public float iA() {
        return this.XO;
    }

    public void G(float f) {
        this.XO = f;
    }
}

