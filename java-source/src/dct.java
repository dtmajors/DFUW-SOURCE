/*
 * Decompiled with CFR.
 */
public class dct {
    public int SkillType = 0;
    public float SkillLevel = 0.0f;

    public String Bu() {
        return lea.enZ().getName(this.SkillType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  ");
        stringBuilder.append(this.Bu());
        stringBuilder.append("  ");
        stringBuilder.append(this.SkillLevel);
        return stringBuilder.toString();
    }
}

