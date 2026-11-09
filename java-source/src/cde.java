/*
 * Decompiled with CFR.
 */
public class cde {
    public final ldv enc;
    public final int SkillType;

    public cde(ldv ldv2, int n) {
        assert (ldv2 != null);
        assert (n > 0);
        this.enc = ldv2;
        this.SkillType = n;
    }

    private cde() {
        this.enc = null;
        this.SkillType = 0;
    }

    public cde aKf() {
        return new cde(this.enc, this.SkillType);
    }

    public String Bu() {
        return lea.enZ().getName(this.SkillType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFSkillRelation: SkillGUID=");
        stringBuilder.append(this.enc);
        stringBuilder.append(" SkillType='");
        stringBuilder.append(this.Bu());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

