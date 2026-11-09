/*
 * Decompiled with CFR.
 */
public class dck {
    public int SkillType = 0;
    public boolean gcT = false;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFSkillCheckInfo: SkillType='");
        stringBuilder.append(lea.enZ().getName(this.SkillType));
        stringBuilder.append("' SkillAlwaysFails=");
        stringBuilder.append(this.gcT);
        return stringBuilder.toString();
    }
}

