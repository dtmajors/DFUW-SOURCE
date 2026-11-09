/*
 * Decompiled with CFR.
 */
public abstract class dey
extends btk
implements bto {
    protected int gnv = 0;
    protected double oV = 0.0;
    protected double eKm = 0.0;
    private static dez dKP = new dez();
    protected static dxr gnw = null;
    protected boolean gnx = true;
    protected boolean gny = true;
    protected static dfa gmW = null;

    dey() {
    }

    public final int blo() {
        return this.gnv;
    }

    public final String blp() {
        return del.zS(this.gnv);
    }

    public double aAw() {
        return this.oV;
    }

    public void o(double d2) {
        this.oV = d2;
    }

    public double Bw() {
        return this.eKm;
    }

    public boolean hasInfiniteDuration() {
        return this.eKm == -2.0;
    }

    public void setDuration(double d2) {
        this.eKm = d2;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    @Override
    public void doTick(ldz ldz2) {
    }

    public void setDefaultValues() {
        this.oV = 0.0;
        this.eKm = 1.0;
    }

    @Override
    public String toString() {
        return "SFSpecialEffectAtom: Type='" + this.blp() + "' StartTime=" + this.oV + " Duration=" + this.eKm;
    }

    protected float o(float f2, float f3, float f4) {
        assert (f2 >= 0.0f && f2 <= 1.0f) : "LerpFactor [" + f2 + "] should be between 0 and 1";
        return f3 + f2 * (f4 - f3);
    }

    protected lco a(float f2, lco lco2, lco lco3) {
        assert (f2 >= 0.0f && f2 <= 1.0f) : "LerpFactor [" + f2 + "] should be between 0 and 1";
        float f3 = lco2.qwk + f2 * (lco3.qwk - lco2.qwk);
        float f4 = lco2.qwl + f2 * (lco3.qwl - lco2.qwl);
        float f5 = lco2.qwm + f2 * (lco3.qwm - lco2.qwm);
        return new lco(f3, f4, f5);
    }

    protected float b(float f2, float f3, float f4, float f5) {
        return f4 * f5 * f5 + f3 * 2.0f * f5 * (1.0f - f5) + f2 * (1.0f - f5) * (1.0f - f5);
    }

    protected float c(float f2, float f3, float f4, float f5) {
        return f4 * 2.0f * f5 + f3 * 2.0f * (1.0f - 2.0f * f5) - f2 * 2.0f * (1.0f - f5);
    }

    public static dxr blq() {
        return gnw;
    }

    public static void c(dxr dxr2) {
        gnw = dxr2;
    }

    public boolean blr() {
        return this.gnx;
    }

    public static dfa bls() {
        return gmW;
    }

    public static void a(dfa dfa2) {
        gmW = dfa2;
    }

    public boolean blt() {
        return this.gny;
    }
}

