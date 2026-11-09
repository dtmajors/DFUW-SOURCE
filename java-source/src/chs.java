/*
 * Decompiled with CFR.
 */
public class chs
extends che {
    public int SkillType;
    public float SkillLevel;

    public chs() {
        this.ezL = cgi.SKILL_LEVEL;
    }

    public boolean u(int n, float f) {
        if (this.SkillType != -1 && !lea.enZ().isDescendant(n, this.SkillType)) {
            return false;
        }
        return !(f < this.SkillLevel);
    }
}

