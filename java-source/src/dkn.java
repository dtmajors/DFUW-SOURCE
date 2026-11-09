/*
 * Decompiled with CFR.
 */
public abstract class dkn {
    private float gEd = 0.0f;
    private float gEe = 0.0f;
    private float gEf = 0.0f;
    private float gEg = 0.0f;
    private float gEh = 0.0f;

    public float bnp() {
        return this.gEd;
    }

    public void gB(float f) {
        assert (f >= -1.0f && f <= 1.0f);
        this.gEd = f;
    }

    public float bnq() {
        return this.gEe;
    }

    public void gC(float f) {
        assert (f >= -1.0f && f <= 1.0f);
        this.gEe = f;
    }

    public float bnr() {
        return this.gEf;
    }

    public void gD(float f) {
        assert (f >= -1.0f && f <= 1.0f);
        this.gEf = f;
    }

    public float bns() {
        return this.gEg;
    }

    public void gE(float f) {
        assert (f >= 0.0f && f <= 1.0f);
        this.gEg = f;
    }

    public float bnt() {
        return this.gEh;
    }

    public void gF(float f) {
        assert (f >= 0.0f && f <= 1.0f);
        this.gEh = f;
    }

    public abstract dkn bnu();

    protected void a(dkn dkn2) {
        dkn2.gB(this.gEd);
        dkn2.gC(this.gEe);
        dkn2.gD(this.gEf);
        dkn2.gE(this.gEg);
        dkn2.gF(this.gEh);
    }
}

