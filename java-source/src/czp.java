/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cex
 *  cug
 *  ha
 *  lcr
 *  lcw
 *  mcs
 */
public class czp
extends czc {
    private float fXC = 0.0f;
    private float fXD = 0.0f;
    private float fXE = 0.0f;
    private boolean gav = false;
    private boolean gaw = false;
    private boolean eQf = false;
    private boolean gax = false;
    private cte[] gay = null;

    public float bgs() {
        return this.fXC;
    }

    public void fB(float f2) {
        this.fXC = f2;
    }

    public float bgt() {
        return this.fXD;
    }

    public void fC(float f2) {
        this.fXD = f2;
    }

    public float bgu() {
        return this.fXE;
    }

    public void fD(float f2) {
        this.fXE = f2;
    }

    @Override
    public float xo(int n2) {
        switch (n2) {
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

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 9219: {
                this.a((fcs)dxq2);
                break;
            }
            case 19461: {
                this.a((ecw)dxq2);
                break;
            }
            case 6158: {
                this.a((gft)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected final boolean b(cwx.a a2, cwx.a a3) {
        if (a2 == cwx.a.fGw && (this.gav || this.gaw || this.eQf)) {
            this.gax = true;
            return true;
        }
        return super.b(a2, a3);
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        czp czp2 = (czp)((Object)cxc2);
        czp2.fB(this.fXC);
        czp2.fC(this.fXD);
        czp2.fD(this.fXE);
    }

    @Override
    protected final void a(czc.a a2) {
        switch (a2) {
            case fZG: {
                ha ha2;
                ha ha3 = ha2 = this.jk() != null && this.jk().bgR() != null && this.jk().bgR() instanceof cex ? ((cex)this.jk().bgR()).mA() : null;
                if (ha2 == null || !ha2.kv() || ha2.bX(this.SkillType)) break;
                ha2.c(mdc.uEZ.bD(this.SkillType));
                this.ber();
                this.beQ();
                return;
            }
            case fZI: {
                assert (this.getFunctionType() == bkd.dqO);
                if (this.fGh.akX == null) {
                    lfn.b(5, "SFHarvestingSkill", "doPerform() TargetObjectGUID is null.");
                    this.beQ();
                    return;
                }
                float f2 = this.xn(1539);
                if (ctg.ffh) {
                    f2 = 1.0f;
                }
                if (this.cS(f2)) {
                    this.b(cxd.p.fSi);
                    if (ResourceTree.isDescendant(this.fGh.dhr, cug.fpl) || ResourceTree.isDescendant(this.fGh.dhr, cug.fqX)) {
                        float f3 = this.bfw();
                        this.k(this.fGh.akX, f3);
                        break;
                    }
                    this.b(this.fGh.dsL, this.fGh.dhr, this.fGh.aZD);
                    break;
                }
                this.ber();
                this.bic();
                break;
            }
        }
    }

    @Override
    protected final void bex() {
        super.bex();
        this.gav = false;
        this.gaw = false;
        this.eQf = false;
        this.gax = false;
        this.gay = null;
    }

    private void zp(int n2) {
        float f2;
        ctk ctk2;
        cuj cuj2;
        assert (n2 > 0);
        int n3 = 0;
        if (this.jk() != null && this.jk().bgQ() != null && this.jk().bgQ().aAG() != null) {
            n3 = lea.ei(this.jk().bgQ().aAG().av());
        }
        if ((cuj2 = cxj.bu(n2, n3)) == null) {
            lfn.b(5, "SFHarvestingSkill", "createHarvestedResource() No resourceharvestinginfo found for resource '" + ResourceTree.getName(n2) + "'");
            return;
        }
        lmf lmf2 = lmf.rEt;
        if (this.jk() != null && this.jk().bgQ() != null && this.jk().bgQ().aAG() != null) {
            lmf2 = lea.eg(this.jk().bgQ().aAG().av());
        }
        float f3 = 1.0f;
        if (this.jk() != null && this.jk().bgQ() != null && this.jk().bgQ() instanceof cex) {
            f3 = ((cex)this.jk().bgQ()).b(dmh.gHY);
        }
        int n4 = -1;
        cex cex2 = (cex)this.jk().bgR();
        if (cex2 != null && cex2.aJB() != null) {
            n4 = cex2.aJB().uw();
        }
        if ((ctk2 = cuj2.a(f2 = lgp.erA().nextFloat(), lmf2, f3, n4)) == null) {
            lfn.b(5, "SFHarvestingSkill", "createHarvestedResource() HarvestingItem is null.");
            return;
        }
        cte cte2 = new cte();
        cte2.ResourceType = ctk2.ResourceType;
        cte2.asi = ctk2.asi;
        cte2.fex = false;
        this.b(new cte[]{cte2});
        this.gay = new cte[]{cte2};
    }

    private void a(ecw ecw2) {
        ha ha2;
        assert (this.gav);
        if (ecw2.ilW == null && ecw2.ilX == null) {
            if (this.fGh.dhr == cug.fpt) {
                this.a(mcs.uyS.bD(new Object[0]));
            } else if (this.fGh.dhr == cug.fpy) {
                this.a(mcs.uyT.bD(new Object[0]));
            } else if (this.fGh.dhr == cug.fpx) {
                this.a(mcs.uyU.bD(new Object[0]));
            } else if (this.fGh.dhr == cug.fpu) {
                this.a(mcs.uyV.bD(new Object[0]));
            } else if (this.fGh.dhr == cug.fpv) {
                this.a(mcs.uyW.bD(new Object[0]));
            } else if (this.fGh.dhr == cug.fpw) {
                this.a(mcs.uyX.bD(new Object[0]));
            } else {
                this.a(mcs.uyR.bD(this.fGh.dhr));
            }
            this.gav = false;
            this.b(cxd.p.fSi);
            this.ber();
            if (this.gax) {
                this.beQ();
            }
            return;
        }
        this.gav = false;
        this.bhq();
        cte[] cteArray = null;
        cteArray = ecw2.ilW == null ? new cte[]{ecw2.ilX} : (ecw2.ilX == null ? new cte[]{ecw2.ilW} : new cte[]{ecw2.ilW, ecw2.ilX});
        this.gay = cteArray;
        this.b(cteArray);
        this.bic();
        ha ha3 = ha2 = this.jk() != null && this.jk().bgR() != null && this.jk().bgR() instanceof cex ? ((cex)this.jk().bgR()).mA() : null;
        if (ha2 != null && ha2.kv()) {
            int n2 = 0;
            for (int i2 = 0; i2 < cteArray.length; ++i2) {
                n2 += cteArray[i2].asi;
            }
            ha2.m(this.SkillType, n2);
        }
    }

    private void a(fcs fcs2) {
        assert (this.gaw);
        if (fcs2.bst <= 0) {
            lfn.b(5, "SFHarvestingSkill", "handleFunctionCompletionResultMessage() FunctionType is invalid.");
            return;
        }
        if (fcs2.bst != this.getFunctionType()) {
            lfn.b(5, "SFHarvestingSkill", "handleFunctionCompletionResultMessage() FunctionType are different.");
            lfn.b(5, "SFHarvestingSkill", "handleFunctionCompletionResultMessage() Message.FunctionType='" + dqt.getName(fcs2.bst) + "'");
            lfn.b(5, "SFHarvestingSkill", "handleFunctionCompletionResultMessage() Skill.FunctionType='" + dqt.getName(this.getFunctionType()) + "'");
            return;
        }
        this.gaw = false;
        if (fcs2.iJq) {
            this.notifyListeners();
            this.b(cxd.p.fSi);
            this.bhr();
        } else {
            this.ber();
        }
        if (this.gax) {
            this.beQ();
        }
    }

    private void notifyListeners() {
        if (this.gay == null) {
            return;
        }
        cdb cdb2 = this.emI.bgQ();
        if (cdb2 != null && cdb2 instanceof cex) {
            cex cex2 = (cex)cdb2;
            ljq ljq2 = cex2.aAG() != null ? cex2.aAG().azb() : ljq.roQ;
            ha ha2 = cex2.mA();
            if (ha2 != null) {
                fst fst2 = (fst)this.MessageDelegator.h(30211, this.getGUID(), ha2.getGUID());
                fst2.Position = ljq2;
                fst2.eAc = this.fGh.dhr;
                fst2.iVC = this.gay;
                this.MessageDelegator.I(fst2);
            }
            jts.a(bqy.dGa, this.gay, ljq2, this.MessageDelegator, cdb2.getGUID());
        }
    }

    private void a(gft gft2) {
        assert (this.eQf);
        this.eQf = false;
        boolean bl = this.ld(gft2.jgp);
        if (!bl) {
            // empty if block
        }
        if (gft2.jgo) {
            ha ha2;
            this.bhq();
            this.zp(this.fGh.dhr);
            this.bic();
            ha ha3 = ha2 = this.jk() != null && this.jk().bgR() != null && this.jk().bgR() instanceof cex ? ((cex)this.jk().bgR()).mA() : null;
            if (ha2 != null && this.gay != null && ha2.kv()) {
                int n2 = 0;
                for (int i2 = 0; i2 < this.gay.length; ++i2) {
                    n2 += this.gay[i2].asi;
                }
                ha2.m(this.SkillType, n2);
            }
        } else {
            if (this.fGh.dhr == cug.fqr) {
                this.a(mcs.uyL.bD(new Object[0]));
            } else if (this.fGh.dhr == cug.fqA) {
                this.a(mcs.uyM.bD(new Object[0]));
            } else if (this.fGh.dhr == cug.fqB) {
                this.a(mcs.uyN.bD(new Object[0]));
            } else if (this.fGh.dhr == cug.fqC) {
                this.a(mcs.uyO.bD(new Object[0]));
            } else if (this.fGh.dhr == cug.fqD) {
                this.a(mcs.uyP.bD(new Object[0]));
            }
            this.b(cxd.p.fSi);
            this.ber();
            if (this.gax) {
                this.beQ();
            }
        }
    }

    private boolean ld(int n2) {
        cex cex2;
        ha ha2;
        cdb cdb2;
        if (n2 != -1 && (cdb2 = this.jk().bgQ()) instanceof cex && (ha2 = (cex2 = (cex)cdb2).mA()) != null) {
            int n3 = lcw.qGf;
            int n4 = lcw.qGe;
            int n5 = ha2.aN();
            String string = "\"" + ha2.getUserName() + "\"";
            int n6 = ha2.getGUID().enw();
            String string2 = "\"" + ha2.iP() + "\"";
            String string3 = "\"" + ha2.iR() + "\"";
            ljq ljq2 = cex2.aAG() != null && cex2.aAG().av() != null ? cex2.aAG().av() : new ljq();
            int n7 = this.fGh != null ? this.fGh.dhr : -1;
            ldv ldv2 = this.fGh != null && this.fGh.dsL != null ? this.fGh.dsL : new ldv(0L);
            ljq ljq3 = this.fGh != null && this.fGh.aZD != null ? this.fGh.aZD : new ljq();
            String string4 = "INSERT INTO player_fake_resource_messages ( GameID , WorldID , AccountID , UserName, CharacterID , FirstName, LastName, Position, ObjectGUID , ObjectResourceType , ObjectPosition, WarningType )  VALUES (" + lcw.qGe + "," + lcw.qGf + "," + n5 + "," + string + "," + n6 + "," + string2 + "," + string3 + ",\"" + ljq2.fk() + "\"," + ldv2.eny() + "," + n7 + ",\"" + ljq3.fk() + "\"," + n2 + ");";
            this.fQ(string4);
        }
        return n2 == -1;
    }

    private void fQ(String string) {
        if (lcw.enb()) {
            return;
        }
        kdj kdj2 = (kdj)this.MessageDelegator.i(259, this.GUID, lcr.qyX);
        kdj2.wA("Darkfall");
        kdj2.wB(string);
        this.MessageDelegator.b(kdj2);
    }

    private void k(ldv ldv2, float f2) {
        assert (ldv2 != null);
        assert (f2 >= 1.0f);
        ecv ecv2 = (ecv)this.MessageDelegator.h(19460, this.GUID, ldv2);
        ecv2.SkillLevel = f2;
        ecv2.Ri = this.emI.bgQ().mA().getGUID();
        ddx ddx2 = this.jk().bgQ().aJB();
        ecv2.ilV = ddx2 != null ? ddx2.uw() : -1;
        this.MessageDelegator.F(ecv2);
        this.gav = true;
    }

    private void b(cte[] cteArray) {
        assert (this.Initialized);
        assert (cteArray != null);
        fcy fcy2 = (fcy)this.MessageDelegator.h(9229, this.GUID, this.MessageDelegator.getGUID());
        fcy2.dul = 8;
        fcy2.bst = this.getFunctionType();
        fcy2.akX = fcy2.aZG = this.emI.bgQ().getGUID();
        fcy2.dtP = cteArray;
        fcy2.iyH = false;
        fcy2.iJG = true;
        fcy2.b(bqy.dGa);
        this.MessageDelegator.F(fcy2);
        this.gaw = true;
    }

    private void b(ldv ldv2, int n2, ljq ljq2) {
        assert (ldv2 != null);
        assert (n2 >= 0);
        gfs gfs2 = (gfs)this.MessageDelegator.h(6157, this.GUID, lcr.qEr);
        gfs2.gb = ldv2;
        gfs2.ResourceType = n2;
        gfs2.Position = ljq2;
        this.MessageDelegator.F(gfs2);
        this.eQf = true;
    }

    private void bic() {
        gjr gjr2 = (gjr)this.MessageDelegator.h(4629, this.GUID, this.jk().bhh());
        gjr2.SkillType = this.SkillType;
        this.MessageDelegator.F(gjr2);
    }
}

