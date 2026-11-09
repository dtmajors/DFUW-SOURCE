/*
 * Decompiled with CFR.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class dkq {
    private float doT = 1.0f;
    private boolean gEm = false;
    private boolean gEn = true;
    private boolean gEo = false;
    private boolean gEp = false;
    private boolean gEq = false;
    private boolean gEr = false;
    private boolean gEs = false;
    private boolean gEt = false;
    private float gEu = 0.0f;

    public float getDuration() {
        return this.doT;
    }

    public void setDuration(float f) {
        this.doT = f;
    }

    public boolean bnB() {
        return this.gEm;
    }

    public void hY(boolean bl) {
        this.gEm = bl;
    }

    public boolean bnC() {
        return this.gEn;
    }

    public void hZ(boolean bl) {
        this.gEn = bl;
    }

    public boolean bnD() {
        return this.gEo;
    }

    public void ia(boolean bl) {
        this.gEo = bl;
    }

    public boolean bnE() {
        return this.gEp;
    }

    public void ib(boolean bl) {
        this.gEp = bl;
    }

    public boolean bnF() {
        return this.gEq;
    }

    public void ic(boolean bl) {
        this.gEq = bl;
    }

    public boolean bnG() {
        return this.gEr;
    }

    public void id(boolean bl) {
        this.gEr = bl;
    }

    public boolean bnH() {
        return this.gEs;
    }

    public void ie(boolean bl) {
        this.gEs = bl;
    }

    public boolean bnI() {
        return this.gEt;
    }

    public void if(boolean bl) {
        this.gEt = bl;
    }

    public float bnJ() {
        return this.gEu;
    }

    public void gG(float f) {
        this.gEu = f;
    }

    public final void doTick(ldz ldz2) {
        this.blG();
    }

    private void blG() {
    }

    public abstract void bnK();

    public abstract dkq bnL();

    public abstract int bnM();

    protected void a(dkq dkq2) {
        dkq2.setDuration(this.doT);
        dkq2.hY(this.gEm);
        dkq2.hZ(this.gEn);
        dkq2.ia(this.gEo);
        dkq2.ib(this.gEp);
        dkq2.ic(this.gEq);
        dkq2.id(this.gEr);
        dkq2.ie(this.gEs);
        dkq2.if(this.gEt);
        dkq2.gG(this.gEu);
    }

    protected float bnN() {
        return this.doT / (float)(this.bnM() - 1);
    }

    protected final int gH(float f) {
        assert (f >= 0.0f && f <= this.doT);
        int n = this.bnM();
        return (int)Math.floor((float)(n - 1) * f / this.doT);
    }

    protected final float C(int n, float f) {
        assert (n >= 0 && n < this.bnM());
        assert (f >= 0.0f && f <= this.doT);
        float f2 = this.bnN();
        float f3 = (float)n * f2;
        float f4 = (float)(n + 1) * f2;
        return (f - f3) / (f4 - f3);
    }

    protected final float b(int n, float f, float f2, float f3) {
        float f4 = this.C(n, f3);
        return this.p(f4, f, f2);
    }

    private float p(float f, float f2, float f3) {
        float f4 = f2 + f3;
        if ((double)f4 == 0.0) {
            return f;
        }
        if ((double)f4 > 1.0) {
            f2 /= f4;
            f3 /= f4;
        }
        float f5 = (float)(1.0 / (2.0 - (double)f2 - (double)f3));
        if (f < f2) {
            return f5 / f2 * f * f;
        }
        if ((double)f > 1.0 - (double)f3) {
            return (float)((2.0 - (double)(f5 / f3 * f)) * (double)f);
        }
        return (float)((double)f5 * (2.0 * (double)f - (double)f2));
    }
}

