/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  cew
 *  cex
 *  cug
 *  mcs
 */
public class ajd
extends aja {
    private ctu bpC = null;
    private ctm[] Ingredients = null;
    private bsa[] bpD = null;

    public ajd() {
        this.bog = ajb.b.boE;
    }

    public bsa[] Cx() {
        return this.bpD;
    }

    public ctm[] Cy() {
        return this.Ingredients;
    }

    @Deprecated
    public int[] a(ctu ctu2) {
        if (ctu2 == null) {
            lfn.b(5, "SFCraftingIngredientConstraint", "getAvailableIngredientQuantities() Recipe is null.");
            return null;
        }
        ctm[] ctmArray = cwy.c((cxc)this.boj, ctu2);
        if (ctmArray == null) {
            lfn.b(5, "SFCraftingIngredientConstraint", "getAvailableIngredientQuantities() Ingredients array is null.");
            return null;
        }
        bqk bqk2 = this.boj.aJz().bgQ().aJC().asf();
        if (bqk2 == null) {
            lfn.b(5, "SFCraftingIngredientConstraint", "getAvailableIngredientQuantities() Inventory is null for skillowner " + this.boj.aJz().bgQ().getGUID());
            return null;
        }
        int[] nArray = new int[ctmArray.length];
        int n = ctmArray.length;
        for (int i = 0; i < n; ++i) {
            nArray[i] = bqk2.aup().o(ctmArray[i].ResourceType, true);
        }
        return nArray;
    }

    @Override
    public void reset() {
        super.reset();
        this.bpC = null;
        this.Ingredients = null;
        if (this.bpD != null) {
            int n = this.bpD.length;
            for (int i = 0; i < n; ++i) {
                if (this.bpD[i].awJ() == null) continue;
                this.a(this.bpD[i]);
            }
        }
        this.bpD = null;
    }

    @Override
    protected boolean BU() {
        this.bok = null;
        if (this.bpC == null) {
            cex cex2;
            assert (this.bpD == null);
            int n = this.boj.beo().fZd;
            if (n <= 0) {
                lfn.b(5, "SFCraftingIngredientConstraint", "checkConstraint() CraftingResourceType is not set.");
                return false;
            }
            this.bpC = cwy.bm(this.boj.zg(), n);
            if (this.bpC == null) {
                lfn.b(5, "SFCraftingIngredientConstraint", "checkConstraint() No craftingrecipe found for resource '" + lea.enW().getName(n) + "'");
                this.bok = mcs.uBk.bD(new Object[0]);
                return false;
            }
            this.Ingredients = new ctm[this.bpC.Ingredients.length];
            for (int i = 0; i < this.bpC.Ingredients.length; ++i) {
                this.Ingredients[i] = this.bpC.Ingredients[i];
            }
            cvs cvs2 = null;
            int n2 = -1;
            if (this.boj.bfF()) {
                cex2 = (cex)this.boj.aJz().bgQ();
                cvs2 = (cvs)cex2.aMz().b(cwf.b.fEA);
            } else {
                cex2 = (cew)this.boj.aJz().bgQ();
                cvs2 = (cvs)cex2.aMg().b(cwf.b.fEA);
            }
            if (cvs2 != null) {
                n2 = cvs2.bcb();
            }
            if (cug.we((int)n2)) {
                for (int i = 0; i < this.Ingredients.length; ++i) {
                    if (this.Ingredients[i].ResourceType != cug.fkb) continue;
                    ctm ctm2 = new ctm();
                    ctm2.fgb = this.Ingredients[i].fgb;
                    ctm2.ResourceType = this.Ingredients[i].ResourceType;
                    ctm2.asi = Math.max(1, (int)((float)this.Ingredients[i].asi * 0.9f));
                    this.Ingredients[i] = ctm2;
                }
            }
            this.bpD = this.Cz();
            if (this.bpD == null) {
                this.bok = mcs.uBl.bD(new Object[0]);
                this.bpC = null;
                this.Ingredients = null;
                return false;
            }
        }
        assert (this.Ingredients.length == this.bpD.length);
        return true;
    }

    private bsa[] Cz() {
        assert (this.boj.aJz().bgQ() != null);
        assert (this.bpC != null);
        assert (this.Ingredients != null);
        bqk bqk2 = this.boj.aJz().bgQ().aJC().asf();
        if (bqk2 == null) {
            lfn.b(5, "SFCraftingIngredientConstraint", "performIngredientQueries() Inventory is null for skillowner " + this.boj.aJz().bgQ().getGUID());
            return null;
        }
        brh brh2 = this.boj.aJz().bgQ().aJC().asf().aup();
        if (brh2 == null) {
            lfn.b(5, "SFCraftingIngredientConstraint", "performIngredientQueries() QueryManager is null.");
            return null;
        }
        boolean bl = this.boj.bfF();
        bsa[] bsaArray = brh2.a(this.Ingredients, bqm.c.dEV, bl);
        if (bsaArray != null) {
            boolean bl2 = false;
            int n = bsaArray.length;
            for (int i = 0; i < n; ++i) {
                if (bsaArray[i] != null) continue;
                bl2 = true;
            }
            if (!bl2) {
                return bsaArray;
            }
        }
        return null;
    }

    private void a(bsa bsa2) {
        assert (bsa2 != null);
        assert (bsa2.avX() != null);
        assert (bsa2.avX().length > 0);
        assert (bsa2.awJ().length > 0);
        assert (bsa2.avX().length == bsa2.awJ().length);
        bqu bqu2 = this.boj.aJz().bgQ().aJC().asf().auo();
        int n = bsa2.avX().length;
        for (int i = 0; i < n; ++i) {
            ldv ldv2 = bsa2.avX()[i].GUID;
            lef lef2 = bsa2.awJ()[i];
            if (bqu2.a(ldv2, lef2)) continue;
            lfn.b(5, "SFCraftingIngredientConstraint", "releaseItemLocks() Failed to release lock " + lef2 + " on item " + ldv2);
        }
    }
}

