/*
 * Decompiled with CFR.
 */
public class mfy {
    public float[] DuE = new float[16];

    public mfy() {
    }

    public mfy(mfy mfy2) {
        System.arraycopy(mfy2.DuE, 0, this.DuE, 0, 16);
    }

    public mfy(float[] fArray) {
        System.arraycopy(fArray, 0, this.DuE, 0, 16);
    }

    public String toString() {
        int n = 0;
        String string = "";
        for (int i = 0; i < 4; ++i) {
            string = string + "\t[ ";
            for (int j = 0; j < 4; ++j) {
                string = string + String.valueOf(this.DuE[n++]) + " ";
            }
            string = string + "]\n";
        }
        string = string + "]";
        return string;
    }

    public mfy(lgl lgl2) {
        this.ac(lgl2);
    }

    public void eqQ() {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                this.DuE[(i << 2) + j] = i == j ? 1 : 0;
            }
        }
    }

    public float gi(int n, int n2) {
        assert (n < 4 && n2 < 4) : "Index outside 4x4 Matrix";
        return this.DuE[(n << 2) + n2];
    }

    public void a(mfy mfy2) {
        System.arraycopy(mfy2.DuE, 0, this.DuE, 0, 16);
    }

    public void e(int n, int n2, float f) {
        assert (n < 4 && n2 < 4) : "Index outside 4x4 Matrix";
        this.DuE[(n << 2) + n2] = f;
    }

    public float[] exS() {
        return this.DuE;
    }

    public boolean isIdentity() {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                if (!(i == j ? this.DuE[(i << 2) + j] != 1.0f : this.DuE[(i << 2) + j] != 0.0f)) continue;
                return false;
            }
        }
        return true;
    }

    public void exT() {
        for (int i = 0; i < 4; ++i) {
            for (int j = i + 1; j < 4; ++j) {
                float f = this.DuE[(j << 2) + i];
                this.DuE[(j << 2) + i] = this.DuE[(i << 2) + j];
                this.DuE[(i << 2) + j] = f;
            }
        }
    }

    public void H(float f, float f2, float f3) {
        this.eqQ();
        this.DuE[3] = f;
        this.DuE[7] = f2;
        this.DuE[11] = f3;
    }

    public void eG(ljq ljq2) {
        this.H(ljq2.x, ljq2.y, ljq2.rlV);
    }

    public void I(float f, float f2, float f3) {
        this.eqQ();
        this.DuE[0] = f;
        this.DuE[5] = f2;
        this.DuE[10] = f3;
    }

    public void nM(float f) {
        this.f(1, 2, f);
    }

    public void nN(float f) {
        this.f(2, 0, f);
    }

    public void nO(float f) {
        this.f(0, 1, f);
    }

    public void J(float f, float f2, float f3) {
        lgl lgl2 = new lgl(f, f2, f3);
        this.ac(lgl2);
    }

    public void eH(ljq ljq2) {
        lgl lgl2 = new lgl(ljq2);
        this.ac(lgl2);
    }

    public void ac(lgl lgl2) {
        float f = lgl2.x + lgl2.x;
        float f2 = lgl2.y + lgl2.y;
        float f3 = lgl2.rlV + lgl2.rlV;
        float f4 = lgl2.x * f;
        float f5 = lgl2.x * f2;
        float f6 = lgl2.x * f3;
        float f7 = lgl2.y * f2;
        float f8 = lgl2.y * f3;
        float f9 = lgl2.y * f3;
        float f10 = lgl2.rlW * f;
        float f11 = lgl2.rlW * f2;
        float f12 = lgl2.rlW * f3;
        this.DuE[0] = 1.0f - (f7 + f9);
        this.DuE[1] = f5 - f12;
        this.DuE[2] = f6 + f11;
        this.DuE[4] = f5 + f12;
        this.DuE[5] = 1.0f - (f4 + f9);
        this.DuE[6] = f8 - f10;
        this.DuE[8] = f6 - f11;
        this.DuE[9] = f8 + f10;
        this.DuE[10] = 1.0f - (f4 + f7);
        this.DuE[15] = 1.0f;
        this.DuE[11] = 0.0f;
        this.DuE[7] = 0.0f;
        this.DuE[3] = 0.0f;
    }

    public void b(mfy mfy2) {
        mfy mfy3 = new mfy();
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                mfy3.DuE[(i << 2) + j] = 0.0f;
                int n = (i << 2) + j;
                mfy3.DuE[n] = mfy3.DuE[n] + this.DuE[(i << 2) + 0] * mfy2.DuE[0 + j];
                int n2 = (i << 2) + j;
                mfy3.DuE[n2] = mfy3.DuE[n2] + this.DuE[(i << 2) + 1] * mfy2.DuE[4 + j];
                int n3 = (i << 2) + j;
                mfy3.DuE[n3] = mfy3.DuE[n3] + this.DuE[(i << 2) + 2] * mfy2.DuE[8 + j];
                int n4 = (i << 2) + j;
                mfy3.DuE[n4] = mfy3.DuE[n4] + this.DuE[(i << 2) + 3] * mfy2.DuE[12 + j];
            }
        }
        this.a(mfy3);
    }

    public void c(mfy mfy2) {
        mfy mfy3 = new mfy();
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                mfy3.DuE[(i << 2) + j] = 0.0f;
                int n = (i << 2) + j;
                mfy3.DuE[n] = mfy3.DuE[n] + mfy2.DuE[(i << 2) + 0] * this.DuE[0 + j];
                int n2 = (i << 2) + j;
                mfy3.DuE[n2] = mfy3.DuE[n2] + mfy2.DuE[(i << 2) + 1] * this.DuE[4 + j];
                int n3 = (i << 2) + j;
                mfy3.DuE[n3] = mfy3.DuE[n3] + mfy2.DuE[(i << 2) + 2] * this.DuE[8 + j];
                int n4 = (i << 2) + j;
                mfy3.DuE[n4] = mfy3.DuE[n4] + mfy2.DuE[(i << 2) + 3] * this.DuE[12 + j];
            }
        }
        this.a(mfy3);
    }

    public void a(float f, ljq ljq2, lgl lgl2, ljq ljq3) {
        mfy mfy2 = new mfy();
        mfy mfy3 = new mfy();
        mfy mfy4 = new mfy();
        mfy mfy5 = new mfy();
        mfy mfy6 = new mfy();
        mfy2.I(f, f, f);
        mfy5.ac(lgl2);
        mfy6.eG(ljq3);
        mfy3.eG(ljq2);
        mfy4.H(-ljq2.x, -ljq2.y, -ljq2.rlV);
        mfy2 = mfy.a(mfy2, mfy4);
        mfy2 = mfy.a(mfy2, mfy5);
        mfy2 = mfy.a(mfy2, mfy3);
        mfy2 = mfy.a(mfy2, mfy6);
        this.a(mfy2);
    }

    public ljq eI(ljq ljq2) {
        ljq ljq3 = new ljq();
        ljq3.x = this.DuE[0] * ljq2.x + this.DuE[4] * ljq2.y + this.DuE[8] * ljq2.rlV;
        ljq3.y = this.DuE[1] * ljq2.x + this.DuE[5] * ljq2.y + this.DuE[9] * ljq2.rlV;
        ljq3.rlV = this.DuE[2] * ljq2.x + this.DuE[6] * ljq2.y + this.DuE[10] * ljq2.rlV;
        return ljq3;
    }

    public ljq eJ(ljq ljq2) {
        ljq ljq3 = new ljq();
        ljq3.x = this.DuE[0] * ljq2.x + this.DuE[4] * ljq2.y + this.DuE[8] * ljq2.rlV + this.DuE[12];
        ljq3.y = this.DuE[1] * ljq2.x + this.DuE[5] * ljq2.y + this.DuE[9] * ljq2.rlV + this.DuE[13];
        ljq3.rlV = this.DuE[2] * ljq2.x + this.DuE[6] * ljq2.y + this.DuE[10] * ljq2.rlV + this.DuE[14];
        float f = this.DuE[3] * ljq2.x + this.DuE[7] * ljq2.y + this.DuE[11] * ljq2.rlV + this.DuE[15];
        ljq3.x /= f;
        ljq3.y /= f;
        ljq3.rlV /= f;
        return ljq3;
    }

    public ljq eK(ljq ljq2) {
        return this.eI(ljq2);
    }

    public ljr o(ljr ljr2) {
        ljr ljr3 = new ljr();
        ljr3.x = this.DuE[0] * ljr2.x + this.DuE[4] * ljr2.y + this.DuE[8] * ljr2.rlV + this.DuE[12] * ljr2.rlW;
        ljr3.y = this.DuE[1] * ljr2.x + this.DuE[5] * ljr2.y + this.DuE[9] * ljr2.rlV + this.DuE[13] * ljr2.rlW;
        ljr3.rlV = this.DuE[2] * ljr2.x + this.DuE[6] * ljr2.y + this.DuE[10] * ljr2.rlV + this.DuE[14] * ljr2.rlW;
        ljr3.rlW = this.DuE[3] * ljr2.x + this.DuE[7] * ljr2.y + this.DuE[11] * ljr2.rlV + this.DuE[15] * ljr2.rlW;
        return ljr3;
    }

    public static mfy a(mfy mfy2, mfy mfy3) {
        mfy mfy4 = new mfy();
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                mfy4.DuE[(i << 2) + j] = 0.0f;
                int n = (i << 2) + j;
                mfy4.DuE[n] = mfy4.DuE[n] + mfy2.DuE[(i << 2) + 0] * mfy3.DuE[0 + j];
                int n2 = (i << 2) + j;
                mfy4.DuE[n2] = mfy4.DuE[n2] + mfy2.DuE[(i << 2) + 1] * mfy3.DuE[4 + j];
                int n3 = (i << 2) + j;
                mfy4.DuE[n3] = mfy4.DuE[n3] + mfy2.DuE[(i << 2) + 2] * mfy3.DuE[8 + j];
                int n4 = (i << 2) + j;
                mfy4.DuE[n4] = mfy4.DuE[n4] + mfy2.DuE[(i << 2) + 3] * mfy3.DuE[12 + j];
            }
        }
        return mfy4;
    }

    private void f(int n, int n2, float f) {
        this.eqQ();
        float f2 = (float)Math.cos(f);
        this.DuE[(n2 << 2) + n2] = f2;
        this.DuE[(n << 2) + n] = f2;
        this.DuE[(n << 2) + n2] = (float)(-Math.sin(f));
        this.DuE[(n2 << 2) + n] = -this.DuE[(n << 2) + n2];
    }

    public ljq adY(int n) {
        return new ljq(this.DuE[n << 2], this.DuE[(n << 2) + 1], this.DuE[(n << 2) + 2]);
    }

    public ljq adZ(int n) {
        return new ljq(this.DuE[n], this.DuE[4 + n], this.DuE[8 + n]);
    }

    public void w(ljq ljq2, lgl lgl2) {
        ljq2.ex(this.adZ(3));
        lgl2.X(lgl.c(this.adZ(0), this.adZ(1), this.adZ(2)));
    }
}

