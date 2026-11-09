/*
 * Decompiled with CFR.
 */
public class kyb
extends kxv {
    private int SkillType = -1;

    public int zg() {
        return this.SkillType;
    }

    public void eI(int n) {
        this.SkillType = n;
    }

    public String Bu() {
        return lea.enZ().getName(this.SkillType);
    }

    @Override
    public String getFunctionName() {
        return cxh.fH(this.bst);
    }

    @Override
    public int compareTo(Object object) {
        if (object instanceof kyb) {
            kyb kyb2 = (kyb)object;
            if (kyb2.zg() == this.SkillType) {
                if (this.bst < kyb2.getFunctionType()) {
                    return -1;
                }
                if (this.bst > kyb2.getFunctionType()) {
                    return 1;
                }
                return 0;
            }
            if (this.SkillType < kyb2.zg()) {
                return -1;
            }
            return 1;
        }
        lfn.b(5, "SFSkillFunctionCode", "compareTo() Object is not a SFSkillFunctionCode. It's a " + object.getClass().getName());
        assert (false);
        return -1;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof kyb) {
            kyb kyb2 = (kyb)object;
            return kyb2.zg() == this.SkillType && kyb2.getFunctionType() == this.bst;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFSkillFunctionCode: Skill='");
        stringBuilder.append(this.Bu());
        stringBuilder.append("' SkillFunction='");
        stringBuilder.append(this.getFunctionName());
        stringBuilder.append("' '");
        stringBuilder.append(this.ein());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

