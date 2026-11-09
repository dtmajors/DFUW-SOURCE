/*
 * Decompiled with CFR.
 */
public abstract class hvm
implements hvr {
    private double lfT;
    private double lfU;
    private float lfV;
    private float lfW;
    private float lfX;

    public hvm(float f2, float f3, double d2) {
        this.lfV = f2;
        this.lfW = f3;
        this.lfU = d2;
    }

    @Override
    public void az(ldz ldz2) {
        this.lfT = ldz2.rgz;
        this.lfX = this.lfV;
    }

    @Override
    public void aA(ldz ldz2) {
    }

    @Override
    public void doTick(ldz ldz2) {
        double d2 = (ldz2.rgz - this.lfT) / this.lfU;
        if (d2 <= 1.0) {
            this.lfX = (float)((double)this.lfV + (double)(this.lfW - this.lfV) * d2);
            this.hz(this.lfX);
        } else if (this.lfX != this.lfW) {
            this.lfX = this.lfW;
            this.hz(this.lfX);
            this.czS();
            return;
        }
        if (Math.abs(this.lfX - this.lfW) <= Float.MIN_VALUE) {
            this.czS();
        }
    }

    public float czP() {
        return this.lfV;
    }

    public float czQ() {
        return this.lfW;
    }

    public float czR() {
        return this.lfX;
    }

    public abstract void hz(float var1);

    public void czS() {
    }
}

