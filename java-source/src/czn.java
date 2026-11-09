/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cex
 *  cug
 *  cxd
 *  ha
 *  lcr
 *  lcw
 */
import java.util.List;

public class czn
extends czc {
    private float fXA = 0.0f;
    private float fXB = 0.0f;
    private float fXC = 0.0f;
    private float fXD = 0.0f;
    private float fXE = 0.0f;
    private ctu bpC = null;
    private ajd gaq = null;
    private int fyj = 0;
    private ldv fBe = null;
    private ldv gar = null;
    private int gas = -1;
    private List<eye> gat = lcn.emv();

    public final float bgq() {
        return this.fXA;
    }

    public final void fz(float f2) {
        this.fXA = f2;
    }

    public final float bgr() {
        return this.fXB;
    }

    public final void fA(float f2) {
        this.fXB = f2;
    }

    public final float bgs() {
        return this.fXC;
    }

    public final void fB(float f2) {
        this.fXC = f2;
    }

    public final float bgt() {
        return this.fXD;
    }

    public final void fC(float f2) {
        this.fXD = f2;
    }

    public final float bgu() {
        return this.fXE;
    }

    public final void fD(float f2) {
        this.fXE = f2;
    }

    @Override
    public float xo(int n2) {
        switch (n2) {
            case 5: {
                return this.fXA;
            }
            case 6: {
                return this.fXB;
            }
            case 20: {
                return this.fXC;
            }
            case 19: {
                return this.fXD;
            }
            case 21: {
                return this.fXE;
            }
        }
        return super.xo(n2);
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        czn czn2 = (czn)((Object)cxc2);
        czn2.fz(this.fXA);
        czn2.fA(this.fXB);
        czn2.fB(this.fXC);
        czn2.fC(this.fXD);
        czn2.fD(this.fXE);
    }

    @Override
    protected final void a(czc.a a2) {
        if (a2 == czc.a.fZG) {
            assert (this.bpC == null);
            int n2 = this.fGh.fZd;
            if (n2 <= 0) {
                lfn.b(5, "SFCraftingSkillServer", "doPerform() CraftingResourceType is invalid.");
                this.beQ();
                return;
            }
            this.bpC = cwy.bm(this.SkillType, n2);
            if (this.bpC == null) {
                lfn.b(5, "SFCraftingSkillServer", "doPerform() No craftingrecipe found for resource '" + ResourceTree.getName(n2) + "'");
                this.beQ();
                return;
            }
            this.gaq = this.bia();
            if (this.gaq == null) {
                lfn.b(5, "SFCraftingSkillServer", "doPerform() No ingredientconstraint found in skill '" + this.getName() + "'");
                this.beQ();
                return;
            }
            cex cex2 = (cex)this.emI.bgQ();
            cvs cvs2 = (cvs)cex2.aMz().b(cwf.b.fEA);
            if (cvs2 == null) {
                lfn.b(5, "SFCraftingSkillServer", "doPerform() No crafting sessionhandler found for skill '" + this.getName() + "'");
                this.beQ();
                return;
            }
            this.fyj = cvs2.bcb();
            if (this.fyj <= 0) {
                lfn.b(5, "SFCraftingSkillServer", "doPerform() No workstationresourcetype found for skill '" + this.getName() + "'");
                this.beQ();
                return;
            }
            this.fBe = cvs2.bcE();
            if (ResourceTree.isDescendant(this.fyj, cug.fpr) && this.fBe == null) {
                lfn.b(5, "SFCraftingSkillServer", "doPerform() No workstationphysicalobjectguid found for skill '" + this.getName() + "'");
                this.beQ();
                return;
            }
            if (this.fGh.fZg) {
                this.gar = ((cvu)cvs2).bcJ();
                eye eye2 = (eye)this.MessageDelegator.h(34563, this.GUID, lcr.qEC);
                eye2.FH(this.bpC.az());
                eye2.cS(cex2.getGUID().enw());
                eye2.pu(this.gar);
                eye2.iS(this.bfw());
                this.MessageDelegator.E(eye2);
            }
        } else if (a2 != czc.a.fZH && a2 == czc.a.fZI) {
            int n3;
            cex cex3;
            assert (this.bpC != null);
            boolean bl = false;
            float f2 = cwy.a(this, this.bpC);
            if (f2 <= 0.0f) {
                lfn.b(5, "SFCraftingSkillServer", "doPerform() CraftingSkillLevel is invalid.");
                this.beQ();
                return;
            }
            if (this.fY(f2)) {
                cex3 = this.bpC.bbI();
                if (cex3 != null) {
                    n3 = ((ctz[])cex3).length;
                    for (int i2 = 0; i2 < n3; ++i2) {
                        int n4;
                        cxc cxc2;
                        if (cex3[i2].fgs <= 0.0f) continue;
                        float f3 = 1.0f;
                        if (f2 < this.bpC.bbJ() || f2 >= this.bpC.bbK()) {
                            f3 = 0.0f;
                        }
                        if ((cxc2 = this.emI.ht(n4 = cex3[i2].SkillType)) == null) {
                            lfn.b(5, "SFCraftingSkillServer", "doPerform() Required skill '" + aqN.getName(n4) + "' was not found.");
                            assert (false);
                            continue;
                        }
                        this.jk().a(cxc2, cex3[i2].fgs * cxd.fOB * f3);
                    }
                }
                this.bhr();
                if (!this.fGh.fZg) {
                    this.hv(true);
                    this.z(this.bpC.az(), this.bfw());
                } else {
                    this.m(true, false);
                }
                if (ResourceTree.isDescendant(this.fyj, cug.fpr)) {
                    assert (this.fBe != null);
                    eoc eoc2 = (eoc)this.MessageDelegator.h(13862, this.GUID, this.fBe);
                    eoc2.iwc = this.bpC.az();
                    this.MessageDelegator.F(eoc2);
                }
                if (ResourceTree.isDescendant(this.fyj, cug.fro) && this.jk().bgQ() != null && this.aJz().bgQ() instanceof cex) {
                    assert (this.fBe != null);
                    fip fip2 = (fip)this.MessageDelegator.h(23853, this.GUID, this.fBe);
                    fip2.GN(this.bpC.az());
                    fip2.pH(((cex)this.jk().bgQ()).mA().getGUID());
                    this.MessageDelegator.F(fip2);
                }
            } else {
                bl = true;
                this.ber();
                if (!this.fGh.fZg) {
                    this.hv(false);
                } else {
                    this.m(false, false);
                }
            }
            cex3 = (cex)this.emI.bgQ();
            ha ha2 = cex3.mA();
            if (ha2 != null) {
                fso fso2 = (fso)this.MessageDelegator.h(30220, this.getGUID(), ha2.getGUID());
                fso2.ilu = 1;
                fso2.ezP = bl;
                fso2.ResourceType = this.bpC.az();
                fso2.asi = this.bpC.vf();
                fso2.SkillType = this.zg();
                this.MessageDelegator.H(fso2);
            }
            if (this.fGh.fZg) {
                this.bG(this.fGh.fZd, 1);
            } else if (!lcw.emW()) {
                n3 = !bl ? (this.fGh.fZe = this.fGh.fZe - 1) : this.fGh.fZe;
                this.bG(this.fGh.fZd, n3);
            } else if (this.fGh.fZe >= 0) {
                n3 = --this.fGh.fZe;
                this.bG(this.fGh.fZd, n3);
            }
        }
    }

    @Override
    protected final void bex() {
        super.bex();
        this.bpC = null;
        this.gaq = null;
        this.fyj = 0;
        this.fBe = null;
        this.gar = null;
    }

    private void a(int n2, bsa bsa2, bri bri2) {
        assert (n2 > 0);
        assert (bsa2 != null);
        assert (n2 <= bsa2.vf());
        assert (bsa2.avX() != null);
        assert (bsa2.awJ() != null);
        assert (bsa2.avX().length == bsa2.awJ().length);
        brp[] brpArray = bsa2.avX();
        lef[] lefArray = bsa2.awJ();
        int n3 = brpArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (n2 > brpArray[i2].asi) {
                bri2.a(brpArray[i2].GUID, lefArray[i2], brpArray[i2].asi, bqy.dHx);
                n2 -= brpArray[i2].asi;
                continue;
            }
            bri2.a(brpArray[i2].GUID, lefArray[i2], n2, bqy.dHx);
            return;
        }
    }

    private ajd bia() {
        if (this.fGe == null) {
            lfn.b(5, "SFCraftingSkillServer", "getCraftingIngredientConstraint() No constraints added to skill '" + this.getName() + "'");
            return null;
        }
        int n2 = this.fGe.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!(this.fGe[i2] instanceof ajd)) continue;
            return (ajd)this.fGe[i2];
        }
        return null;
    }

    private boolean fY(float f2) {
        assert (f2 > 0.0f);
        float f3 = cwy.b((cxc)((Object)this), this.bpC);
        if (f3 < 0.0f || f3 > 1.0f) {
            lfn.b(5, "SFCraftingSkillServer", "performCraftingCheck() ChanceOfSuccess is invalid: " + f3);
            f3 = 0.0f;
        }
        boolean bl = lgp.erA().cS(f3);
        return bl;
    }

    private void hv(boolean bl) {
        assert (this.gaq != null);
        assert (this.gaq.Cy() != null);
        assert (this.gaq.Cy().length > 0);
        ctm[] ctmArray = this.gaq.Cy();
        bri bri2 = (bri)this.emI.bgQ().aJC().asf();
        assert (bri2 != null);
        bsa[] bsaArray = this.gaq.Cx();
        assert (bsaArray != null);
        lgp lgp2 = lgp.erA();
        int n2 = ctmArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (bl) {
                this.a(ctmArray[i2].asi, bsaArray[i2], bri2);
                continue;
            }
            if (ctmArray[i2].fgb == 0.0f || !(lgp2.nextFloat() < ctmArray[i2].fgb)) continue;
            int n3 = (int)(lgp2.nextFloat() * (float)ctmArray[i2].asi);
            if (n3 < 1) {
                n3 = 1;
            }
            this.a(n3, bsaArray[i2], bri2);
        }
    }

    protected void z(int n2, float f2) {
        assert (n2 > 0);
        assert (f2 > 0.0f);
        fcu fcu2 = (fcu)this.MessageDelegator.h(9226, this.GUID, this.MessageDelegator.getGUID());
        fcu2.bst = this.getFunctionType();
        fcu2.aZG = this.emI.bgQ().getGUID();
        fcu2.akX = this.emI.bgQ().getGUID();
        fcu2.aYF = this.emI.bgQ().getGUID();
        fcu2.bsG = this.emI.bgQ().az();
        fcu2.aYC = this.SkillType;
        fcu2.ResourceType = n2;
        fcu2.iJt = f2;
        fcu2.diS = this.emI.bgQ().aAG().av();
        fcu2.iJw = this.fyj;
        fcu2.fZi = this.fGh.gcw;
        this.MessageDelegator.I(fcu2);
    }

    private void bG(int n2, int n3) {
        gjr gjr2 = (gjr)this.MessageDelegator.h(4629, this.GUID, this.jk().bhh());
        gjr2.SkillType = this.SkillType;
        gjr2.fZd = n2;
        gjr2.fZe = n3;
        gjr2.fZf = this.fGh.fZf;
        gjr2.fZg = this.fGh.fZg;
        gjr2.fZi = this.fGh.gcw;
        this.MessageDelegator.F(gjr2);
    }

    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 34562) {
            this.a((eyj)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    protected void a(eyj eyj2) {
        if (eyj2.getResult() == 1) {
            this.gas = -2;
            this.beQ();
            return;
        }
        this.gas = eyj2.bNp();
        if (this.gat.size() > 0) {
            eye eye2 = this.gat.remove(0);
            eye2.FJ(this.gas);
            this.MessageDelegator.E(eye2);
            this.gas = -1;
        }
    }

    protected void m(boolean bl, boolean bl2) {
        if (this.bpC == null || this.gar == null) {
            assert (false);
            return;
        }
        cex cex2 = (cex)this.emI.bgQ();
        cvs cvs2 = (cvs)cex2.aMz().b(cwf.b.fEA);
        eye eye2 = (eye)this.MessageDelegator.h(34563, this.GUID, lcr.qEC);
        eye2.FH(this.bpC.az());
        eye2.pu(this.gar);
        eye2.FJ(this.gas);
        eye2.jO(bl);
        eye2.kO(bl2);
        if (this.gas == -1) {
            this.gat.add(eye2);
        } else {
            this.MessageDelegator.E(eye2);
            this.gas = -1;
        }
    }

    public void beP() {
        if (this.fGh.fZg) {
            if (this.gas != -2) {
                this.m(false, true);
            } else {
                this.gas = -1;
            }
        }
    }
}

