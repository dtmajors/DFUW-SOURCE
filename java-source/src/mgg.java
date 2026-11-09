/*
 * Decompiled with CFR.
 */
public class mgg
extends mgf {
    private int Dvg;
    private lgl Dvh = new lgl();
    private ljq Dvi = new ljq();
    private float Dvj;
    private double Dvk;

    public mgg() {
        this.setDefaultValues();
        this.Dvk = Math.PI * 2 * Math.random();
    }

    @Override
    public ljq ez(double d2) {
        d2 += this.Dvk;
        float f = (float)(d2 *= Math.PI * 2 / (double)this.Dvj);
        float f2 = (float)((double)this.Dvg * d2);
        ljq ljq2 = new ljq();
        ljq2.x = (float)((double)this.Dvi.x * Math.cos(f) * Math.sin(f2));
        ljq2.y = (float)((double)this.Dvi.y * Math.sin(f) * Math.sin(f2));
        ljq2.rlV = (float)((double)this.Dvi.rlV * Math.cos(f2));
        ljq2 = this.Dvh.eq(ljq2);
        return ljq2;
    }

    public void setDefaultValues() {
        this.Dvg = 9;
        this.Dvh.eqQ();
        this.Dvi.x = 1.0f;
        this.Dvi.y = 1.5f;
        this.Dvi.rlV = 0.5f;
        this.Dvj = 5.0f;
    }

    public void setNumLoops(int n) {
        this.Dvg = n;
    }

    public void ad(lgl lgl2) {
        this.Dvh = lgl2;
    }

    public void setRadius(ljq ljq2) {
        this.Dvi = ljq2;
    }

    public void setFullCycleTime(float f) {
        this.Dvj = f;
    }
}

