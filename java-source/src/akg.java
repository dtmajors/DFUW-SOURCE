/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
public class akg
extends aja {
    private static final float bqt = 1.0f;
    private ctu bpC = null;

    public ctu Dk() {
        return this.bpC;
    }

    public akg() {
        this.bog = ajb.b.bpr;
    }

    @Override
    protected boolean BU() {
        int n;
        this.bok = null;
        if (this.bpC == null) {
            n = this.boj.beo().fZd;
            if (n <= 0) {
                lfn.b(5, "SFSalvagingCraftingSkillLevelConstraint", "checkConstraint() : CraftingResourceType is Invalid!");
                return false;
            }
            this.bpC = cwy.bm(this.boj.zg(), n);
            if (this.bpC == null) {
                lfn.b(5, "SFSalvagingCraftingSkillLevelConstraint", "checkConstraint() : No Crafting Recipe Found for Resource '" + lea.enW().getName(n) + "'");
                this.bok = mcs.uBk.bD(new Object[0]);
                return false;
            }
        }
        n = this.boj.aJz().bgQ().az();
        if (!lea.enW().isDescendant(n, this.bpC.bbH())) {
            this.bok = mcs.uBm.bD(this.bpC.bbH());
            return false;
        }
        ctz[] ctzArray = this.bpC.bbI();
        if (ctzArray != null) {
            int n2 = ctzArray.length;
            for (int i = 0; i < n2; ++i) {
                float f2 = this.boj.aJz().yQ(ctzArray[i].SkillType);
                if (!(f2 < ctzArray[i].SkillLevel * 1.0f)) continue;
                this.bok = mcs.uBn.bD(Float.valueOf(ctzArray[i].SkillLevel), ctzArray[i].Bu());
                return false;
            }
        }
        return true;
    }
}

