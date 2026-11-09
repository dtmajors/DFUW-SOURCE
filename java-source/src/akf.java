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
public class akf
extends aja {
    private ctu bpC = null;
    private int aEx = 0;
    private bsa bqq = null;
    private lef bqr = null;
    private ldv bqs = null;

    public ctu Dk() {
        return this.bpC;
    }

    public int Dl() {
        return this.aEx;
    }

    public bsa Dm() {
        return this.bqq;
    }

    public lef Dn() {
        return this.bqr;
    }

    public akf() {
        this.bog = ajb.b.bpq;
    }

    @Override
    protected boolean BU() {
        bqk bqk2;
        this.bok = null;
        if (this.bpC == null) {
            int n = this.boj.beo().fZd;
            if (n <= 0) {
                lfn.b(5, "SFSalvagingCraftingRecipeConstraint", "checkConstraint() : CraftingResourceType is Invalid!");
                return false;
            }
            this.bpC = cwy.bm(this.boj.zg(), n);
            if (this.bpC == null) {
                lfn.b(5, "SFSalvagingCraftingRecipeConstraint", "checkConstraint() : No Crafting Recipe Found for Resource '" + lea.enW().getName(n) + "'");
                this.bok = mcs.uBk.bD(new Object[0]);
                return false;
            }
        }
        if ((bqk2 = this.boj.aJz().bgQ().aJC().asf()) == null) {
            lfn.b(5, "SFSalvagingCraftingRecipeConstraint", "checkConstraint() : Inventory is 'null' for Skill-Owner " + this.boj.aJz().bgQ().getGUID());
            return false;
        }
        brh brh2 = this.boj.aJz().bgQ().aJC().asf().aup();
        if (brh2 == null) {
            lfn.b(5, "SFSalvagingCraftingRecipeConstraint", "checkConstraint() : Inventory QueryManager is 'null'");
            return false;
        }
        if (this.bqq == null) {
            this.aEx = 0;
            for (int i = 0; i < this.bpC.Ingredients.length; ++i) {
                if (this.bpC.Ingredients[i].ResourceType != cug.fkb) continue;
                this.aEx += this.bpC.Ingredients[i].asi;
            }
            cvs cvs2 = null;
            int n = -1;
            if (this.boj.bfF()) {
                cex cex2 = (cex)this.boj.aJz().bgQ();
                cvs2 = (cvs)cex2.aMz().b(cwf.b.fEA);
            } else {
                cew cew2 = (cew)this.boj.aJz().bgQ();
                cvs2 = (cvs)cew2.aMg().b(cwf.b.fEA);
            }
            if (cvs2 != null) {
                n = cvs2.bcb();
            }
            if (cug.we((int)n)) {
                this.aEx = Math.max(1, (int)((float)this.aEx * 0.9f));
            }
            if (this.aEx > 0) {
                this.bqq = brh2.a(cug.fkb, this.aEx, bqm.c.dEV, this.boj.bfF());
                if (this.bqq == null) {
                    this.bok = mcs.uBl.bD(new Object[0]);
                    this.bpC = null;
                    return false;
                }
            }
        }
        if (this.bqr == null) {
            if (!bqk2.iE(this.boj.beo().akX)) {
                this.bok = mcs.uBl.bD(new Object[0]);
                this.bpC = null;
                return false;
            }
            if (this.boj.bfF()) {
                this.bqr = bqk2.auo().iX(this.boj.beo().akX);
                if (this.bqr == null) {
                    this.bok = mcs.uBl.bD(new Object[0]);
                    this.bpC = null;
                    return false;
                }
                this.bqs = this.boj.beo().akX;
            }
        }
        return true;
    }

    @Override
    public void reset() {
        bqk bqk2;
        if (this.bqq != null && this.bqq.awJ() != null) {
            this.a(this.bqq);
        }
        if (this.bqr != null && this.bqs != null && (bqk2 = this.boj.aJz().bgQ().aJC().asf()).iE(this.bqs) && bqk2.auo().iW(this.bqs) && !bqk2.auo().a(this.bqs, this.bqr)) {
            lfn.b(5, "SFSalvagingCraftingRecipeConstraint", "reset() : Failed to Release Specific Item Lock " + this.bqr.intValue() + " on Item " + this.bqs);
        }
        this.bpC = null;
        this.bqq = null;
        this.bqr = null;
        this.bqs = null;
        super.reset();
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
            lfn.b(5, "SFSalvagingCraftingRecipeConstraint", "releaseItemLocks() : Failed to Release Lock " + lef2 + " on Item " + ldv2);
        }
    }
}

