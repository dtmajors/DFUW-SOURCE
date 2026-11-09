/*
 * Decompiled with CFR.
 */
public class cjn
extends cjf {
    public int ResourceType;
    public int SkillType;
    public boolean eAg;

    public cjn() {
        super(cjo.SKILL);
    }

    public boolean aL(int n, int n2) {
        if (this.ResourceType != -1 && !lea.enW().isDescendant(n, this.ResourceType)) {
            return false;
        }
        return this.SkillType == -1 || lea.enZ().isDescendant(n2, this.SkillType);
    }

    public cjn aQh() {
        super.aPZ();
        cjn cjn2 = (cjn)super.aPZ();
        cjn2.ResourceType = this.ResourceType;
        cjn2.SkillType = this.SkillType;
        cjn2.eAg = this.eAg;
        cjn2.ayN = this.ayN;
        return cjn2;
    }

    @Override
    public /* synthetic */ cjf aPZ() {
        return this.aQh();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.aQh();
    }
}

