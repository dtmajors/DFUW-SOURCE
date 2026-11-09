/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class ctl {
    public final int ResourceType;
    public final float bKJ;
    public final int aYG;
    public final int bnM;
    public final int SpecialEffectType;

    public ctl(int n, float f2, int n2, int n3, int n4) {
        this.ResourceType = n;
        this.bKJ = f2;
        this.aYG = n2;
        this.bnM = n3;
        this.SpecialEffectType = n4;
    }

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFHostileLiquidInfo: ResourceType='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' DamageMagnitude=");
        stringBuilder.append(this.bKJ);
        stringBuilder.append(" EffectType='");
        stringBuilder.append(lea.enT().getName(this.aYG));
        stringBuilder.append(" AttributeType='");
        stringBuilder.append(ep.aM((int)this.bnM));
        stringBuilder.append("' SpecialEffectType='");
        stringBuilder.append(del.zU(this.SpecialEffectType));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

