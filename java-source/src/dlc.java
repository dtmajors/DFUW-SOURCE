/*
 * Decompiled with CFR.
 */
public class dlc {
    private ljq gFk;
    private float dtg;
    private float doT;
    private float eur;
    private float gFl;
    private ljq gFm;
    private ljq gFn = new ljq();
    private boolean aME = false;

    public void gW(float f) {
        this.aME = true;
        this.eur = f + this.doT;
        this.gFl = f + 1.0f / this.dtg;
    }

    public void a(float f, ljq ljq2, float f2, float f3) {
        assert (f2 > 0.0f);
        assert (f3 > 0.0f);
        this.gFk = ljq2;
        this.dtg = f2;
        this.doT = f3;
        this.eur = f + f3;
        this.gFm = ljq2;
        this.gFl = f + 0.1f;
        this.gFn.esz();
    }

    public ljq J(float f, float f2) {
        assert (this.dtg > 0.0f);
        assert (this.doT > 0.0f);
        if (this.dtg <= 1.0E-6f) {
            return new ljq();
        }
        if (f2 <= 1.0E-6f) {
            return new ljq();
        }
        if (f <= 1.0E-6f) {
            return new ljq();
        }
        if (f > this.gFl) {
            this.gFl = f + 1.0f / this.dtg;
            if (Float.isInfinite(this.gFl) || Float.isNaN(this.gFl)) {
                this.gFl = Float.MAX_VALUE;
            }
            this.gFn = mga.exY();
            this.gFn.x *= this.gFm.x;
            this.gFn.y *= this.gFm.y;
            this.gFn.rlV *= this.gFm.rlV;
        }
        if (f <= 0.0f) {
            return new ljq(0.0f, 0.0f, 0.0f);
        }
        float f3 = (this.eur - f) / this.doT;
        if (f3 <= 1.0E-5f) {
            return new ljq(0.0f, 0.0f, 0.0f);
        }
        float f4 = this.dtg / f3;
        f3 *= f3;
        float f5 = f * f4;
        if (Float.isInfinite(f3) || Float.isInfinite(f5) || Float.isNaN(f3) || Float.isNaN(f5)) {
            return new ljq();
        }
        f3 *= (float)Math.sin(f5);
        float f6 = this.doT * this.dtg;
        if (!(lew.B(f6, 0.0f, 1.0E-4f) || Float.isInfinite(f6) || Float.isNaN(f6))) {
            ljq ljq2 = new ljq(this.gFm);
            ljq2.nm(f2 / f6);
            this.gFm.et(ljq2);
        }
        this.gFn.nm(f3);
        return this.gFn;
    }

    public ljq boL() {
        return this.gFk;
    }

    public void bX(ljq ljq2) {
        this.gFk = ljq2;
        this.bY(new ljq(this.gFk));
    }

    public ljq boM() {
        return this.gFm;
    }

    public void bY(ljq ljq2) {
        this.gFm = ljq2;
    }

    public float getDuration() {
        return this.doT;
    }

    public void setDuration(float f) {
        assert (f > 0.0f);
        this.doT = f;
    }

    public float boN() {
        return this.dtg;
    }

    public void eK(float f) {
        assert (f > 0.0f);
        this.dtg = f;
    }

    public ljq boO() {
        return this.gFn;
    }

    public void bZ(ljq ljq2) {
        this.gFn = ljq2;
    }

    public float boP() {
        return this.gFl;
    }

    public void gX(float f) {
        this.gFl = f;
    }

    public float boQ() {
        return this.eur;
    }

    public void gY(float f) {
        this.eur = f;
    }

    public boolean isStarted() {
        return this.aME;
    }

    public void setStarted(boolean bl) {
        this.aME = bl;
    }
}

