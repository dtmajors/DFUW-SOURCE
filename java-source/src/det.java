/*
 * Decompiled with CFR.
 */
public class det {
    public ldv GUID = null;
    public int SpecialEffectType = 0;
    public boolean gnd = false;
    public float doT = -2.0f;
    public dek blr = null;

    public final det bla() {
        det det2 = new det();
        det2.SpecialEffectType = this.SpecialEffectType;
        det2.gnd = this.gnd;
        det2.doT = this.doT;
        return det2;
    }

    public final String getSpecialEffectName() {
        return del.zU(this.SpecialEffectType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFSpecialEffectServer: '");
        stringBuilder.append(this.getSpecialEffectName());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

