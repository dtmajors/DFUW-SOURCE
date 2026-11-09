/*
 * Decompiled with CFR.
 */
public class bwp {
    public final int SkillType;
    public final int ResourceType;

    public bwp(int n, int n2) {
        this.SkillType = n;
        this.ResourceType = n2;
    }

    public boolean equals(Object object) {
        if (object instanceof bwp) {
            bwp bwp2 = (bwp)object;
            if (this.SkillType == bwp2.SkillType && this.ResourceType == bwp2.ResourceType) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.SkillType | this.ResourceType;
    }

    public String toString() {
        return "SFMissileInfoKey: SkillType=" + this.SkillType + " ResourceType=" + this.ResourceType;
    }
}

