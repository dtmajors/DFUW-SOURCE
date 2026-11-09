/*
 * Decompiled with CFR.
 */
public abstract class cye {
    public final int SkillType;

    public cye(int n2) {
        this.SkillType = n2;
    }

    public final String Bu() {
        return lea.enZ().getName(this.SkillType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": Skill='");
        stringBuilder.append(lea.enZ().getName(this.SkillType));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

