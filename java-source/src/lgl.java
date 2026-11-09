/*
 * Decompiled with CFR.
 */
import java.text.DecimalFormat;

public class lgl {
    public float x = 0.0f;
    public float y = 0.0f;
    public float rlV = 0.0f;
    public float rlW = 1.0f;
    private static final DecimalFormat rgA = lda.zj("#0.00");

    public static lgl zF(String string) {
        ljq ljq2 = ljq.Au(string);
        lgl lgl2 = new lgl(ljq2);
        lgl2.normalize();
        return lgl2;
    }

    public static lgl zG(String string) {
        ljq ljq2 = ljq.Aw(string);
        if (ljq2 == null) {
            lfn.b(5, "SFQuaternion", "toString() Invalid vector provided: '" + string + "'");
            return new lgl();
        }
        lgl lgl2 = new lgl(ljq2);
        lgl2.normalize();
        return lgl2;
    }

    public lgl() {
    }

    public lgl(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.rlV = f3;
        this.rlW = f4;
    }

    public static lgl eqL() {
        float f = 2.0f * (lgp.erA().nextFloat() - 1.0f) * (float)Math.PI;
        float f2 = 2.0f * (lgp.erA().nextFloat() - 1.0f) * (float)Math.PI;
        float f3 = 2.0f * (lgp.erA().nextFloat() - 1.0f) * (float)Math.PI;
        return new lgl(f, f2, f3);
    }

    public lgl(ljq ljq2) {
        this.ep(ljq2);
    }

    public lgl(float f, float f2, float f3) {
        this.F(f, f2, f3);
    }

    public lgl(lgl lgl2) {
        this.X(lgl2);
    }

    public lgl(ljq ljq2, float f) {
        this.z(ljq2, f);
    }

    public void X(lgl lgl2) {
        if (lgl2 == null) {
            assert (false);
            return;
        }
        this.x = lgl2.x;
        this.y = lgl2.y;
        this.rlV = lgl2.rlV;
        this.rlW = lgl2.rlW;
    }

    public float getX() {
        return this.x;
    }

    public void kl(float f) {
        this.x = f;
    }

    public float getY() {
        return this.y;
    }

    public void km(float f) {
        this.y = f;
    }

    public float bdV() {
        return this.rlV;
    }

    public void fb(float f) {
        this.rlV = f;
    }

    public float eqM() {
        return this.rlW;
    }

    public void nl(float f) {
        this.rlW = f;
    }

    public void Y(lgl lgl2) {
        assert (lgl2 != null);
        float f = lgl2.rlW * this.rlW - lgl2.x * this.x - lgl2.y * this.y - lgl2.rlV * this.rlV;
        float f2 = lgl2.rlW * this.x + lgl2.x * this.rlW + lgl2.y * this.rlV - lgl2.rlV * this.y;
        float f3 = lgl2.rlW * this.y + lgl2.y * this.rlW + lgl2.rlV * this.x - lgl2.x * this.rlV;
        float f4 = lgl2.rlW * this.rlV + lgl2.rlV * this.rlW + lgl2.x * this.y - lgl2.y * this.x;
        this.rlW = f;
        this.x = f2;
        this.y = f3;
        this.rlV = f4;
    }

    public static lgl a(float f, lgl lgl2) {
        assert (lgl2 != null);
        return new lgl(f * lgl2.x, f * lgl2.y, f * lgl2.rlV, f * lgl2.rlW);
    }

    public void nm(float f) {
        this.x = f * this.x;
        this.y = f * this.y;
        this.rlV = f * this.rlV;
        this.rlW = f * this.rlW;
    }

    public void ep(ljq ljq2) {
        assert (ljq2 != null);
        this.F(ljq2.x, ljq2.y, ljq2.rlV);
    }

    public void F(float f, float f2, float f3) {
        float f4 = f2;
        float f5 = f;
        float f6 = f3;
        float f7 = (float)Math.cos(0.5f * f4);
        float f8 = (float)Math.cos(0.5f * f5);
        float f9 = (float)Math.cos(0.5f * f6);
        float f10 = (float)Math.sin(0.5f * f4);
        float f11 = (float)Math.sin(0.5f * f5);
        float f12 = (float)Math.sin(0.5f * f6);
        float f13 = f8 * f9 - f11 * 0.0f - 0.0f - 0.0f * f12;
        float f14 = f8 * 0.0f + f11 * f9 + 0.0f * f12 - 0.0f;
        float f15 = f8 * 0.0f + 0.0f * f9 + 0.0f - f11 * f12;
        float f16 = f8 * f12 + 0.0f * f9 + f11 * 0.0f - 0.0f;
        float f17 = f7 * f13 - 0.0f * f14 - f10 * f15 - 0.0f * f16;
        float f18 = f7 * f14 + 0.0f * f13 + f10 * f16 - 0.0f * f15;
        float f19 = f7 * f15 + f10 * f13 + 0.0f * f14 - 0.0f * f16;
        float f20 = f7 * f16 + 0.0f * f13 + 0.0f * f15 - f10 * f14;
        this.rlW = f17;
        this.x = f18;
        this.y = f19;
        this.rlV = f20;
        this.normalize();
    }

    public void z(ljq ljq2, float f) {
        assert (ljq2 != null);
        float f2 = ljq2.eqN();
        if (0.0 == (double)f2) {
            this.eqQ();
        } else {
            float f3 = 0.5f * f;
            float f4 = (float)Math.sin(f3) / f2;
            this.x = f4 * ljq2.x;
            this.y = f4 * ljq2.y;
            this.rlV = f4 * ljq2.rlV;
            this.rlW = (float)Math.cos(f3);
        }
    }

    public float eqN() {
        return (float)Math.sqrt(this.x * this.x + this.y * this.y + this.rlV * this.rlV + this.rlW * this.rlW);
    }

    public float eqO() {
        return this.x * this.x + this.y * this.y + this.rlV * this.rlV + this.rlW * this.rlW;
    }

    public void normalize() {
        float f = this.eqN();
        if (0.0 == (double)f) {
            this.eqQ();
        } else {
            float f2 = 1.0f / f;
            this.x *= f2;
            this.y *= f2;
            this.rlV *= f2;
            this.rlW *= f2;
        }
    }

    public boolean isNormalized() {
        float f = this.eqN();
        return f >= 0.9999f && f <= 1.0001f;
    }

    public float Z(lgl lgl2) {
        assert (lgl2 != null);
        return this.x * lgl2.x + this.y * lgl2.y + this.rlV * lgl2.rlV + this.rlW * lgl2.rlW;
    }

    public boolean eqP() {
        return Math.abs(this.eqN() - 1.0f) < 0.001f;
    }

    public boolean isIdentity() {
        return 0.0 == (double)this.x && 0.0 == (double)this.y && 0.0 == (double)this.rlV && 1.0 == (double)this.rlW;
    }

    public void eqQ() {
        this.rlV = 0.0f;
        this.y = 0.0f;
        this.x = 0.0f;
        this.rlW = 1.0f;
    }

    public void eqR() {
        float f = this.eqN();
        if (0.0 == (double)f) {
            this.eqQ();
        } else {
            float f2 = 1.0f / f;
            this.x = -this.x * f2;
            this.y = -this.y * f2;
            this.rlV = -this.rlV * f2;
            this.rlW *= f2;
        }
    }

    public void eqS() {
        this.x = -this.x;
        this.y = -this.y;
        this.rlV = -this.rlV;
    }

    public ljq eqT() {
        float f = this.rlW * this.rlW;
        float f2 = this.x * this.x;
        float f3 = this.y * this.y;
        float f4 = this.rlV * this.rlV;
        ljq ljq2 = new ljq();
        ljq2.rlV = (float)Math.atan2(2.0f * (this.rlW * this.rlV + this.y * this.x), f - f2 + f3 - f4);
        ljq2.y = (float)Math.atan2(2.0f * (this.rlV * this.x + this.rlW * this.y), f - f2 - f3 + f4);
        float f5 = -2.0f * (this.y * this.rlV - this.rlW * this.x);
        ljq2.x = f5 < -1.0f ? -1.5707964f : (f5 > 1.0f ? 1.5707964f : (float)Math.asin(f5));
        return ljq2;
    }

    public float eqU() {
        float f = this.rlW * this.rlW;
        float f2 = this.x * this.x;
        float f3 = this.y * this.y;
        float f4 = this.rlV * this.rlV;
        return (float)Math.atan2(2.0f * (this.rlV * this.x + this.rlW * this.y), f - f2 - f3 + f4);
    }

    public static lgl b(lgl lgl2, lgl lgl3, float f) {
        lgl lgl4 = new lgl();
        lgl4.c(lgl2, lgl3, f);
        return lgl4;
    }

    public void c(lgl lgl2, lgl lgl3, float f) {
        assert (lgl2 != null);
        assert (lgl3 != null);
        assert (lgl2.isNormalized()) : " Q1 : " + lgl2;
        assert (lgl3.isNormalized()) : " Q2 : " + lgl3;
        float f2 = lgl2.x * lgl3.x + lgl2.y * lgl3.y + lgl2.rlV * lgl3.rlV + lgl2.rlW * lgl3.rlW;
        if (1.0f + f2 > 1.0E-6f) {
            float f3;
            float f4;
            float f5;
            float f6;
            if (Math.abs(f2) > 1.0f) {
                f2 /= Math.abs(f2);
            }
            if ((f6 = (float)Math.sin(f5 = (float)Math.acos(f2))) >= 1.0E-6f || f6 <= -1.0E-6f) {
                f4 = (float)Math.sin((1.0f - f) * f5) / f6;
                f3 = (float)Math.sin(f * f5) / f6;
            } else {
                f4 = 1.0f - f;
                f3 = f;
            }
            this.x = f4 * lgl2.x + f3 * lgl3.x;
            this.y = f4 * lgl2.y + f3 * lgl3.y;
            this.rlV = f4 * lgl2.rlV + f3 * lgl3.rlV;
            this.rlW = f4 * lgl2.rlW + f3 * lgl3.rlW;
            this.normalize();
        } else {
            lgl lgl4 = new lgl();
            lgl4.x = -lgl2.y;
            lgl4.y = lgl2.x;
            lgl4.rlV = -lgl2.rlW;
            lgl4.rlW = lgl2.rlV;
            float f7 = (float)Math.sin((1.0 - (double)f) * 1.5707963267948966);
            float f8 = (float)Math.sin((double)f * 1.5707963267948966);
            this.x = f7 * lgl2.x + f8 * lgl4.x;
            this.y = f7 * lgl2.y + f8 * lgl4.y;
            this.rlV = f7 * lgl2.rlV + f8 * lgl4.rlV;
            this.rlW = f7 * lgl2.rlW + f8 * lgl4.rlW;
            this.normalize();
        }
    }

    public String toString() {
        ljq ljq2 = this.eqT();
        return "Vector [" + ljq2.toString() + "] Quaternion [ " + "X : " + this.x + " Y : " + this.y + " Z : " + this.rlV + " W : " + this.rlW + "]";
    }

    public static lgl zH(String string) {
        ljq ljq2 = ljq.Av(string);
        if (ljq2 == null) {
            return null;
        }
        return new lgl(ljq2);
    }

    public String fk() {
        return this.eqT().fk();
    }

    public boolean equals(Object object) {
        if (object instanceof lgl) {
            lgl lgl2 = (lgl)object;
            return this.x == lgl2.x && this.y == lgl2.y && this.rlV == lgl2.rlV && this.rlW == lgl2.rlW;
        }
        return false;
    }

    public void aa(lgl lgl2) {
        assert (lgl2 != null);
        this.x += lgl2.x;
        this.y += lgl2.y;
        this.rlV += lgl2.rlV;
        this.rlW += lgl2.rlW;
    }

    public void ab(lgl lgl2) {
        assert (lgl2 != null);
        this.x -= lgl2.x;
        this.y -= lgl2.y;
        this.rlV -= lgl2.rlV;
        this.rlW -= lgl2.rlW;
    }

    public ljq eq(ljq ljq2) {
        assert (ljq2 != null);
        return lgl.a(this, ljq2);
    }

    public static lgl a(lgl lgl2, lgl lgl3) {
        assert (lgl2 != null);
        assert (lgl3 != null);
        float f = (float)Math.sqrt(lgl3.x * lgl3.x + lgl3.y * lgl3.y + lgl3.rlV * lgl3.rlV);
        float f2 = f == 0.0f ? 1.0f : (float)Math.sin(f) / f;
        lgl2.x = lgl3.x * f2;
        lgl2.y = lgl3.y * f2;
        lgl2.rlV = lgl3.rlV * f2;
        lgl2.rlW = (float)Math.cos(f);
        return lgl2;
    }

    public static lgl b(lgl lgl2, lgl lgl3) {
        assert (lgl2 != null);
        assert (lgl3 != null);
        double d2 = Math.sqrt(lgl3.x * lgl3.x + lgl3.y * lgl3.y + lgl3.rlV * lgl3.rlV);
        double d3 = Math.atan2(d2, lgl3.rlW);
        double d4 = d2 == 0.0 ? 0.0 : d3 / d2;
        lgl2.x = lgl3.x * (float)d4;
        lgl2.y = lgl3.y * (float)d4;
        lgl2.rlV = lgl3.rlV * (float)d4;
        lgl2.rlW = 0.0f;
        return lgl2;
    }

    public static lgl c(lgl lgl2, lgl lgl3) {
        assert (lgl2 != null);
        assert (lgl3 != null);
        lgl lgl4 = new lgl();
        lgl4.rlW = lgl3.rlW * lgl2.rlW - lgl3.x * lgl2.x - lgl3.y * lgl2.y - lgl3.rlV * lgl2.rlV;
        lgl4.x = lgl3.rlW * lgl2.x + lgl3.x * lgl2.rlW + lgl3.y * lgl2.rlV - lgl3.rlV * lgl2.y;
        lgl4.y = lgl3.rlW * lgl2.y + lgl3.y * lgl2.rlW + lgl3.rlV * lgl2.x - lgl3.x * lgl2.rlV;
        lgl4.rlV = lgl3.rlW * lgl2.rlV + lgl3.rlV * lgl2.rlW + lgl3.x * lgl2.y - lgl3.y * lgl2.x;
        return lgl4;
    }

    public static ljq a(lgl lgl2, ljq ljq2) {
        assert (lgl2 != null);
        assert (ljq2 != null);
        ljq ljq3 = new ljq();
        lgl lgl3 = new lgl(ljq2.x, ljq2.y, ljq2.rlV, 0.0f);
        lgl lgl4 = new lgl(lgl2);
        lgl4.eqS();
        lgl lgl5 = lgl.c(lgl4, lgl3);
        lgl5 = lgl.c(lgl5, lgl2);
        ljq3.x = lgl5.x;
        ljq3.y = lgl5.y;
        ljq3.rlV = lgl5.rlV;
        return ljq3;
    }

    public static lgl er(ljq ljq2) {
        if (ljq2 == null) {
            lfn.b(4, "SFQuaternion#SFQuaternionGetRotationFromWorldAxis()", "null normal vector. Returning unit quaternion.");
            return new lgl();
        }
        float f = (float)(-Math.asin(ljq2.y));
        float f2 = (float)Math.atan2(ljq2.x, ljq2.rlV);
        float f3 = 0.0f;
        return new lgl(f, f2, f3);
    }

    public static lgl q(ljq ljq2, ljq ljq3) {
        assert (ljq2 != null);
        assert (ljq3 != null);
        ljq ljq4 = new ljq(ljq2);
        ljq4.normalize();
        ljq ljq5 = new ljq(ljq3);
        ljq5.normalize();
        ljq ljq6 = ljq.w(ljq4, ljq5);
        float f = ljq.u(ljq4, ljq5);
        if (ldq.y(f, 1.0f, 1.0E-6f)) {
            return new lgl();
        }
        if (ldq.y(f, -1.0f, 1.0E-6f)) {
            ljq ljq7 = ljq.eC(ljq4);
            lgl lgl2 = new lgl();
            lgl2.z(ljq7, (float)Math.PI);
            return lgl2;
        }
        float f2 = (float)Math.sqrt(2.0f * (1.0f + f));
        assert (f2 != 0.0f);
        ljq6.nm(1.0f / f2);
        lgl lgl3 = new lgl(ljq6.x, ljq6.y, ljq6.rlV, 0.5f * f2);
        return lgl3;
    }

    public static final lgl c(ljq ljq2, ljq ljq3, ljq ljq4) {
        lgl lgl2 = new lgl();
        lgl2.rlW = 0.5f * (float)Math.sqrt(1.0 + (double)ljq2.x + (double)ljq3.y + (double)ljq4.rlV);
        float f = 4.0f * lgl2.rlW;
        lgl2.x = (ljq3.rlV - ljq4.y) / f;
        lgl2.y = (ljq4.x - ljq2.rlV) / f;
        lgl2.rlV = (ljq2.y - ljq3.x) / f;
        return lgl2;
    }

    public lgl eqV() {
        return new lgl(this.x, this.y, this.rlV, this.rlW);
    }
}

