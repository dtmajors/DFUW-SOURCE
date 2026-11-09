/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cex
 *  cug
 *  mcs
 */
public class dao
extends czb {
    protected void beA() {
        bqs bqs2 = this.emI.bgQ().aJF().iK(this.fGh.akX);
        if (bqs2 == null) {
            lfn.b(5, "SFLearnCraftingRecipeSkill", "doAction() : Could Not Find Inventory Item!!!... Target Object GUID = " + this.fGh.akX);
            this.ber();
            return;
        }
        ff ff2 = (ff)bqs2.ae(13616);
        if (ff2 == null) {
            lfn.b(5, "SFLearnCraftingRecipeSkill", "doAction() : No Crafting Recipe to Unlock Attribute in Inventory Item!!!... Inventory Item Resource = " + bqs2.pa());
            this.ber();
            return;
        }
        ctu ctu2 = cwy.bm(1, cug.hV((String)ff2.getStringValue()));
        if (ctu2 == null) {
            lfn.b(5, "SFLearnCraftingRecipeSkill", "doAction() : No Crafting Recipe for Resource!!!... Resource = " + ff2.getStringValue());
            this.ber();
            return;
        }
        if (!ctu2.bbM()) {
            lfn.b(5, "SFLearnCraftingRecipeSkill", "doAction() : Crafting Recipe is Not Lockable!!!... Resource = " + ctu2.pa());
            this.ber();
            return;
        }
        if (((cex)this.emI.bgQ()).hg(ctu2.pa())) {
            ((cex)this.emI.bgQ()).c(mcs.uCf.bD(ctu2.pa()));
            this.b(cxd.p.fSi);
            this.bhr();
            return;
        }
        ((bri)this.emI.bgQ().aJC().asf()).a(bqs2.getGUID(), bqy.dIi);
        ((cex)this.emI.bgQ()).hh(ctu2.pa());
        ((cex)this.emI.bgQ()).c(mcs.uCg.bD(ctu2.pa()));
        this.b(cxd.p.fSi);
        this.bhr();
    }
}

