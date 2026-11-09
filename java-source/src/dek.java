/*
 * Decompiled with CFR.
 */
public class dek {
    public int SpecialEffectType = 0;
    public ldv akX = null;
    public ljq aZD = null;
    public double oV = 0.0;
    public int aZF = 0;
    public ldv aZG = null;
    public ljq aZH = null;
    public lgl gfq = null;
    public float doT = 0.0f;
    public float biu = 0.0f;
    public float gfr = 0.0f;
    public boolean aZM = false;
    public ldv gfs = null;

    public final int bkI() {
        if ((this.aZF & 0x10) > 0) {
            assert (this.biu > 0.0f || this.biu <= 1.0f);
            return del.B(this.SpecialEffectType, this.biu);
        }
        return this.SpecialEffectType;
    }

    public final String getSpecialEffectName() {
        return del.zU(this.SpecialEffectType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFSpecialEffectConfig: SpecialEffect='");
        stringBuilder.append(this.getSpecialEffectName());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

