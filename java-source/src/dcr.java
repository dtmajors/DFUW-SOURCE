/*
 * Decompiled with CFR.
 */
public class dcr {
    public int SkillType = 0;
    public int bnR = 0;
    public boolean eke = false;

    public boolean bI(int n2, int n3) {
        return this.SkillType == n2 && this.bnR == n3;
    }

    public boolean equals(Object object) {
        if (object instanceof dcr) {
            dcr dcr2 = (dcr)object;
            return this.bI(dcr2.SkillType, dcr2.bnR);
        }
        return false;
    }

    public String toString() {
        assert (this.SkillType >= 0);
        assert (this.bnR > 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFSkillFunctionRule: Skill='");
        stringBuilder.append(lea.enZ().getName(this.SkillType));
        stringBuilder.append("' SkillFunction='");
        stringBuilder.append(cxh.fH(this.bnR));
        stringBuilder.append("' ShowDebug=");
        stringBuilder.append(this.eke);
        return stringBuilder.toString();
    }
}

