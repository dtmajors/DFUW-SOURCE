/*
 * Decompiled with CFR.
 */
public class hwz
extends jau {
    private irr ljc = null;

    public hwz() {
        this.a(iqp.dmX());
        irs irs2 = new irs();
        irs2.Sn(2);
        irs2.qu("ActivationProgressBarBackgroundBitmap");
        irs2.ra("ActivationProgressBarForegroundBitmap");
        irs2.sl(false);
        this.ljc = new irr(irs2);
        this.W(this.ljc);
    }

    @Override
    public void cCy() {
        super.cCy();
    }

    @Override
    public void kh(float f2) {
        this.ljc.kh(f2);
    }

    public void OI(int n) {
        this.ljc.OI(n);
    }

    public void setProgress(int n, int n2, int n3) {
        this.ljc.setProgress((float)n, (float)n2, (float)n3);
    }

    public void setProgress(float f2, float f3, float f4) {
        this.ljc.setProgress(f2 / (f4 - f3));
    }

    public void setProgress(float f2) {
        this.ljc.setProgress(f2);
    }

    @Override
    public int cCz() {
        return 0;
    }

    @Override
    public int cCA() {
        return 0;
    }

    @Override
    public boolean cCB() {
        return false;
    }

    @Override
    public boolean cCC() {
        return false;
    }

    @Override
    public boolean cCD() {
        return false;
    }

    @Override
    public boolean cCE() {
        return false;
    }
}

