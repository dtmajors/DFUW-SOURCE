/*
 * Decompiled with CFR.
 */
public class dcs {
    public final int SkillType;
    public final float SkillLevel;

    public dcs(int n2, float f2) {
        this.SkillType = n2;
        this.SkillLevel = f2;
    }

    private dcs() {
        this.SkillType = 0;
        this.SkillLevel = 0.0f;
    }

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

