/*
 * Decompiled with CFR.
 */
public class dku {
    private dkv gEA = null;
    private dks gEB = null;
    private dkr gEC = null;
    private ljq etB = null;
    private lgl gED = null;
    private float daN = 1.0f;
    private float fXV = 1.0f;

    public dkv bnT() {
        return this.gEA;
    }

    public void b(dkv dkv2) {
        this.gEA = dkv2;
    }

    public ljq Bc() {
        return this.etB;
    }

    public lgl Bd() {
        return this.gED;
    }

    public float getScale() {
        return this.daN;
    }

    public void setScale(float f) {
        this.daN = f;
    }

    public float getSpeed() {
        return this.fXV;
    }

    public void setSpeed(float f) {
        this.fXV = f;
    }

    public dkr bnU() {
        return this.gEC;
    }

    public void b(dkr dkr2) {
        this.gEC = dkr2;
    }

    public dks bnV() {
        return this.gEB;
    }

    public void b(dks dks2) {
        this.gEB = dks2;
    }

    public dku bnW() {
        dku dku2 = new dku();
        dku2.b(this.gEA.bnX());
        dku2.b((dks)this.gEB.bnL());
        dku2.b((dkr)this.gEC.bnL());
        dku2.setScale(this.daN);
        dku2.setSpeed(this.fXV);
        return dku2;
    }

    public void gM(float f) {
        if (this.gEB != null) {
            this.etB = this.gEB.gJ(f * this.fXV);
            this.etB.nm(this.daN);
        }
        if (this.gEC != null) {
            this.gED = this.gEC.gI(f * this.fXV);
        }
    }

    public float getDuration() {
        if (this.gEC != null) {
            return this.gEC.getDuration();
        }
        if (this.gEB != null) {
            return this.gEB.getDuration();
        }
        return 0.0f;
    }
}

