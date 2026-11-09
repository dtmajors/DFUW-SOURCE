/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
public class aje
extends aja {
    private ctu bpC = null;

    public aje() {
        this.bog = ajb.b.boF;
    }

    public boolean b(ctu ctu2) {
        if (ctu2 == null) {
            lfn.b(5, "SFCraftingRequirementConstraint", "checkRecipeRequirements() CraftingRecipe is null.");
            return false;
        }
        return this.c(ctu2) && this.d(ctu2);
    }

    @Override
    protected boolean BU() {
        this.bok = null;
        if (this.bpC == null) {
            int n = this.boj.beo().fZd;
            if (n <= 0) {
                lfn.b(5, "SFCraftingRequirementConstraint", "checkConstraint() CraftingResourceType is not set.");
                return false;
            }
            this.bpC = cwy.bm(this.boj.zg(), n);
            if (this.bpC == null) {
                lfn.b(5, "SFCraftingRequirementConstraint", "checkConstraint() No craftingrecipe found for resource '" + lea.enW().getName(n) + "'");
                this.bok = mcs.uBk.bD(new Object[0]);
                return false;
            }
        }
        if (!this.c(this.bpC)) {
            return false;
        }
        return this.d(this.bpC);
    }

    @Override
    public void reset() {
        super.reset();
        this.bpC = null;
    }

    private boolean c(ctu ctu2) {
        assert (ctu2 != null);
        int n = this.boj.aJz().bgQ().az();
        if (!lea.enW().isDescendant(n, ctu2.bbH())) {
            this.bok = mcs.uBm.bD(ctu2.bbH());
            return false;
        }
        return true;
    }

    private boolean d(ctu ctu2) {
        assert (ctu2 != null);
        ctz[] ctzArray = ctu2.bbI();
        if (ctzArray == null) {
            return true;
        }
        float f2 = 0.0f;
        int n = ctzArray.length;
        for (int i = 0; i < n; ++i) {
            f2 = this.boj.aJz().yQ(ctzArray[i].SkillType);
            if (!(f2 < ctzArray[i].SkillLevel)) continue;
            this.bok = mcs.uBn.bD(Float.valueOf(ctzArray[i].SkillLevel), ctzArray[i].Bu());
            return false;
        }
        return true;
    }
}

