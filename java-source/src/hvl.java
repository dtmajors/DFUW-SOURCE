/*
 * Decompiled with CFR.
 */
public abstract class hvl
implements hvr {
    private float lfN;
    private float lfO;
    private double lfP;
    private double lfQ;
    private float lfR;
    private float lfS;

    public hvl(float f2, float f3, double d2) {
        this.lfN = f2;
        this.lfO = f3 - f2;
        this.lfP = d2;
        this.lfR = 1.0f;
    }

    @Override
    public void az(ldz ldz2) {
        this.lfQ = ldz2.rgz;
        this.lfS = -3.4028235E38f;
        this.hz(this.lfN);
    }

    @Override
    public void aA(ldz ldz2) {
        this.hz(this.lfN);
    }

    public abstract void hz(float var1);

    @Override
    public void doTick(ldz ldz2) {
        double d2 = ldz2.rgz - this.lfQ;
        float f2 = (float)Math.min(d2 / this.lfP, 1.0);
        float f3 = Math.max(0.0f, Math.min(this.lfN + this.lfO * (this.lfR > 0.0f ? f2 : 1.0f - f2), 1.0f));
        if ((double)Math.abs(this.lfS - f3) >= 0.1) {
            this.lfS = f3;
            this.hz(f3);
        }
        if (f2 >= 1.0f) {
            this.lfR = -this.lfR;
            this.lfQ = ldz2.rgz;
        }
    }
}

