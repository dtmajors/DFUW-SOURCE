/*
 * Decompiled with CFR.
 */
public class dk
extends btk
implements bto {
    private boolean fE = true;
    private ljq mw = new ljq();
    private ljq mx = new ljq();
    private ljq my = new ljq();
    private ljq mz = new ljq();
    private ljq mA = new ljq();
    private float mB = 1000.0f;
    private ldv[] mC = new ldv[1];
    private int mD = 10;
    private float mE = 4.4f;
    private Integer[] mF = new Integer[1];
    private float mG = 0.0f;
    private boolean mH = false;
    private boolean mI = true;
    private lcq mJ = lcq.BRIGHT_WHITE;
    private lcq mK = lcq.BRIGHT_WHITE_TRANSPARENT;
    private float mL = 8.0f;
    private float mM = 1.0f;

    public void a(ljq ljq2, ljq ljq3, float f) {
        this.mw = ljq2;
        this.mx = ljq3;
        this.mB = f;
        this.mA = this.mw;
        this.mz.kl(this.mw.getX() + this.mB * this.mx.getX());
        this.mz.km(this.mw.getY() + this.mB * this.mx.getY());
        this.mz.fb(this.mw.bdV() + this.mB * this.mx.bdV());
        lfn.b(0, this.getClass().getName(), "Origin:" + this.mw + ", Direction:" + this.mx);
        this.Active = true;
    }

    @Override
    public void doTick(ldz ldz2) {
    }

    public void i(float f) {
    }

    private ljq[] a(float f, float f2, float f3) {
        ljq[] ljqArray = new ljq[this.mD];
        ljqArray[0] = new ljq(this.mA);
        ljq ljq2 = new ljq();
        float f4 = this.mB / ((float)this.mD - 1.0f);
        lfn.b(0, this.getClass().getName(), "Factor is:" + f4);
        for (int i = 1; i < this.mD; ++i) {
            ljq2.x = this.mA.x + (float)i * f4 * this.mx.x + (float)(Math.random() * (double)f);
            ljq2.y = this.mA.y + (float)i * f4 * this.mx.y + (float)(Math.random() * (double)f2);
            ljq2.rlV = this.mA.rlV + (float)i * f4 * this.mx.rlV + (float)(Math.random() * (double)f3);
            ljqArray[i] = new ljq(ljq2.x, ljq2.y, ljq2.rlV);
        }
        return ljqArray;
    }
}

