/*
 * Decompiled with CFR.
 */
public class dec
extends dea {
    private int SkillType = 0;

    public int zg() {
        return this.SkillType;
    }

    public void eI(int n2) {
        this.SkillType = n2;
    }

    @Override
    public dea bks() {
        dec dec2 = new dec();
        dec2.gh(this.fgs);
        dec2.eI(this.SkillType);
        return dec2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFXPHeirSkill: InheritancePortion=");
        stringBuilder.append(this.fgs);
        stringBuilder.append(" SkillType='");
        stringBuilder.append(lea.enZ().getName(this.SkillType));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

