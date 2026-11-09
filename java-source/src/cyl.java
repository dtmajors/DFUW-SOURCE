/*
 * Decompiled with CFR.
 */
class cyl {
    public int SkillType = 0;
    public int SpecialEffectType = 0;
    public ldv aUa = null;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFSessionSpecialEffect: Skil='");
        stringBuilder.append(lea.enZ().getName(this.SkillType));
        stringBuilder.append("' SpecialEffect='");
        stringBuilder.append(del.zU(this.SpecialEffectType));
        stringBuilder.append("' SpecialEffectGUID=");
        stringBuilder.append(this.aUa);
        return stringBuilder.toString();
    }
}

