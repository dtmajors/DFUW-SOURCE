/*
 * Decompiled with CFR.
 */
public class cym {
    public final int SkillType;
    public final int aYG;
    public final float Magnitude;

    public cym(int n2, int n3, float f2) {
        this.SkillType = n2;
        this.aYG = n3;
        this.Magnitude = f2;
    }

    public String CE() {
        return lea.enT().getName(this.aYG);
    }

    public String Bu() {
        return lea.enZ().getName(this.SkillType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFSkillAmendment: Skill='");
        stringBuilder.append(this.Bu());
        stringBuilder.append("' Effect='");
        stringBuilder.append(this.CE());
        stringBuilder.append("' Magnitude=");
        stringBuilder.append(this.Magnitude);
        return stringBuilder.toString();
    }
}

