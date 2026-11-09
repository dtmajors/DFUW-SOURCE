/*
 * Decompiled with CFR.
 */
public class ctz {
    public static final float fgq = 50.0f;
    public static final float fgr = 0.0f;
    public int SkillType = 0;
    public float SkillLevel = 0.0f;
    public float fgs = 0.0f;
    public boolean fgt = false;

    public ctz bbN() {
        ctz ctz2 = new ctz();
        ctz2.SkillType = this.SkillType;
        ctz2.SkillLevel = this.SkillLevel;
        ctz2.fgs = this.fgs;
        ctz2.fgt = this.fgt;
        return ctz2;
    }

    public final String Bu() {
        return lea.enZ().getName(this.SkillType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFRequiredSkill: SkillName='");
        stringBuilder.append(this.Bu());
        stringBuilder.append("' SkillLevel=");
        stringBuilder.append(this.SkillLevel);
        stringBuilder.append(" InheritancePortion=");
        stringBuilder.append(this.fgs);
        stringBuilder.append(" UseInCraftingCheck=");
        stringBuilder.append(this.fgt);
        return stringBuilder.toString();
    }
}

