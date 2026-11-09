/*
 * Decompiled with CFR.
 */
public class mgc {
    private float DuH = 0.0f;
    private float DuI = 0.0f;
    private float DuJ = 0.0f;
    private float DuK = 40.0f;
    private float DuL = 0.7853982f;
    private float DuM = 0.8f;
    private float DuN = 1.5f;
    private float DuO = 1.5f;
    private float DuR = 0.0f;
    private float DuS = 0.0f;
    private float DuT = 0.0f;
    private float DuU = 40.0f;
    private float DuV = 0.7853982f;
    private float DuW = 0.8f;
    private float DuX = 1.5f;
    private float DuY = 1.5f;

    public void od(float f) {
        if (f <= 0.0f) {
            return;
        }
        this.ob(f);
        this.DuJ = 0.0f;
        this.oc(f);
        this.DuT = 0.0f;
    }

    public void nP(float f) {
        this.DuJ += f;
    }

    public void nQ(float f) {
        this.DuT += f;
    }

    public float exZ() {
        return this.DuI;
    }

    public float eya() {
        return this.DuS;
    }

    public void nR(float f) {
        this.DuK = f;
    }

    public float eyb() {
        return this.DuK;
    }

    public void nS(float f) {
        this.DuM = f;
    }

    public float eyc() {
        return this.DuM;
    }

    public void nT(float f) {
        this.DuL = f;
    }

    public float eyd() {
        return this.DuL;
    }

    public void nU(float f) {
        this.DuN = f;
    }

    public float eye() {
        return this.DuN;
    }

    public void nV(float f) {
        this.DuO = f;
    }

    public float eyf() {
        return this.DuO;
    }

    public void nW(float f) {
        this.DuU = f;
    }

    public float eyg() {
        return this.DuU;
    }

    public void nX(float f) {
        this.DuW = f;
    }

    public float eyh() {
        return this.DuW;
    }

    public void nY(float f) {
        this.DuV = f;
    }

    public float eyi() {
        return this.DuV;
    }

    public void nZ(float f) {
        this.DuX = f;
    }

    public float eyj() {
        return this.DuX;
    }

    public void oa(float f) {
        this.DuY = f;
    }

    public float eyk() {
        return this.DuY;
    }

    private void ob(float f) {
        float f2;
        assert (f > 0.0f);
        if (this.DuL == 0.0f) {
            this.DuI = 0.0f;
            this.DuH = 0.0f;
            return;
        }
        if (this.DuJ != 0.0f) {
            f2 = lew.A(this.DuK * this.DuJ, -1.0f, 1.0f);
            this.DuH += f2 * this.DuM / this.DuN * f;
        } else {
            f2 = lew.abs(this.DuH);
            this.DuH -= lew.ni(this.DuH) * lew.min(f2, this.DuM / this.DuO * f);
        }
        this.DuH = lew.A(this.DuH, -this.DuM, this.DuM);
        this.DuI += f * this.DuH;
        f2 = lew.A(this.DuI, -this.DuL, this.DuL);
        if (f2 != this.DuI) {
            this.DuH = 0.0f;
        }
        this.DuI = f2;
    }

    private void oc(float f) {
        float f2;
        assert (f > 0.0f);
        if (this.DuV == 0.0f) {
            this.DuS = 0.0f;
            this.DuR = 0.0f;
            return;
        }
        if (this.DuT != 0.0f) {
            f2 = lew.A(this.DuU * this.DuT, -1.0f, 1.0f);
            this.DuR += f2 * this.DuW / this.DuX * f;
        } else {
            f2 = lew.abs(this.DuR);
            this.DuR -= lew.ni(this.DuR) * lew.min(f2, this.DuW / this.DuY * f);
        }
        this.DuR = lew.A(this.DuR, -this.DuW, this.DuW);
        this.DuS += f * this.DuR;
        f2 = lew.A(this.DuS, -this.DuV, this.DuV);
        if (f2 != this.DuS) {
            this.DuR = 0.0f;
        }
        this.DuS = f2;
    }
}

