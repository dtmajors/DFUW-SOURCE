/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  brg
 *  cdb
 *  cex
 *  cug
 *  ha
 *  lcr
 *  lcw
 *  mcs
 */
import java.util.Map;

public class czt
extends czc {
    private static final float gaH = 10.0f;
    private static final float gaI = 5.0f;
    private float fXC = 0.0f;
    private float fXD = 0.0f;
    private float fXE = 0.0f;
    private Map<ldv, ljq> gaJ;
    private int gaK;
    private int gaL;
    private ljq eQg;
    private boolean eQf = false;
    private boolean gaM = false;
    private boolean gaN = false;
    private boolean gaO = false;
    private boolean gaw = false;
    private boolean gax = false;
    private boolean gaP = false;
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

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        czt czt2 = (czt)((Object)cxc2);
        czt2.fB(this.fXC);
        czt2.fC(this.fXD);
        czt2.fD(this.fXE);
    }

    @Override
    protected final boolean b(cwx.a a2, cwx.a a3) {
        if (a2 == cwx.a.fGw && (this.eQf || this.gaM || this.gaN || this.gaO || this.gaw)) {
            lfn.b(1, "SFDiggingSkill", "handleAttributeValueResponseMessage(): AwaitingGlobalHarvestingResponse : " + this.eQf);
            lfn.b(1, "SFDiggingSkill", "handleAttributeValueResponseMessage(): AwaitingMapAttributesResponse    : " + this.gaM);
            lfn.b(1, "SFDiggingSkill", "handleAttributeValueResponseMessage(): AwaitingMapLockResponse          : " + this.gaN);
            lfn.b(1, "SFDiggingSkill", "handleAttributeValueResponseMessage(): AwaitingMapRemoveResponse        : " + this.gaO);
            lfn.b(1, "SFDiggingSkill", "handleAttributeValueResponseMessage(): AwaitingFunctionCompletionResult : " + this.gaw);
            this.gax = true;
            return true;
        }
        return super.b(a2, a3);
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
                return;
            }
            case fZI: {
                assert (this.getFunctionType() == bkd.dqO);
                if (!this.big()) {
                    lfn.b(5, "doPerform", "handleAttributeValueResponseMessage(): Skill failed");
                    this.ber();
                    return;
                }
                if (this.gaJ != null) {
                    this.gaJ.clear();
                }
                bqx bqx2 = (bqx)this.emI.bgQ().aJC();
                brg brg2 = (brg)bqx2.asf();
                brp[] brpArray = brg2.aun().avX();
                this.gaK = 0;
                this.gaL = -1;
                for (int i2 = 0; i2 < brpArray.length; ++i2) {
                    if (!cug.vN((int)brpArray[i2].ResourceType)) continue;
                    eaq eaq2 = (eaq)this.MessageDelegator.h(10759, this.getGUID(), brpArray[i2].GUID);
                    eaq2.bnM = 10976;
                    this.MessageDelegator.E(eaq2);
                    ++this.gaK;
                }
                boolean bl = this.gaM = this.gaK != 0;
                if (this.gaM) {
                    lfn.b(1, "SFDiggingSkill", "doPerform(): Now awaiting for AwaitingMapAttributesResponse");
                }
                if (this.gaK != 0) break;
                this.bie();
                break;
            }
        }
    }

    private void a(ear ear2) {
        if (ear2.bhp == null) {
            lfn.b(5, "SFDiggingSkill", "handleAttributeValueResponseMessage(): Couldn't get map position for " + ear2.aO());
        } else if (!(ear2.bhp instanceof fh)) {
            lfn.b(5, "SFDiggingSkill", "handleAttributeValueResponseMessage(): Map position for " + ear2.aO() + " isn't a vector3");
        } else {
            if (this.gaJ == null) {
                this.gaJ = lcn.emw();
            }
            this.gaJ.put(ear2.aO(), ((fh)ear2.bhp).gy());
        }
        --this.gaK;
        if (this.gaK == 0) {
            lfn.b(1, "SFDiggingSkill", "handleAttributeValueResponseMessage Got all responses for map attributes");
            this.gaM = false;
            this.bie();
        }
    }

    private void bie() {
        float f2;
        boolean bl;
        Object object;
        if (!this.big()) {
            this.b(cxd.p.fSi);
            this.ber();
            if (this.gax) {
                this.beQ();
            }
            return;
        }
        ljq ljq2 = this.aJz().bgQ().aAG().azb();
        bqx bqx2 = (bqx)this.emI.bgQ().aJC();
        brg brg2 = (brg)bqx2.asf();
        ldv ldv2 = null;
        float f3 = 0.0f;
        this.gaL = -1;
        if (this.gaJ != null) {
            for (ldv ldv3 : this.gaJ.keySet()) {
                float f4;
                object = this.gaJ.get(ldv3);
                if (object == null || (f4 = ((ljq)object).ez(ljq2)) > 10.0f) continue;
                if (brg2.iK(ldv3) == null) {
                    lfn.b(5, "SFDiggingSkill", "mapPositionsCollected(): Could not find inventory item " + ldv3 + " for " + this);
                    continue;
                }
                if (ldv2 != null && !(f4 < f3)) continue;
                ldv2 = ldv3;
                f3 = f4;
                this.gaL = brg2.iK(ldv2).az();
            }
            this.gaJ.clear();
        }
        if (bl = this.cS(f2 = this.xn(2067))) {
            if (ldv2 != null) {
                object = (flx)this.MessageDelegator.h(7949, this.getGUID(), brg2.getGUID());
                ((flx)object).iPs = new ldv[]{ldv2};
                this.MessageDelegator.E((dxq)object);
                this.gaN = true;
            } else {
                boolean bl2;
                boolean bl3 = bl2 = this.eQg == null || this.eQg.ez(ljq2) > 5.0f;
                if (!bl2) {
                    this.b(cxd.p.fSi);
                    this.ber();
                    this.a(mcs.uzc.bD(new Object[0]));
                    this.eQg = ljq2;
                    if (this.gax) {
                        this.beQ();
                    }
                    return;
                }
                this.b(this.fGh.dsL, this.fGh.dhr, this.fGh.aZD);
            }
        } else {
            this.b(cxd.p.fSi);
            this.ber();
            if (ldv2 != null) {
                this.a(mcs.uze.bD(new Object[0]));
            }
            if (this.gax) {
                this.beQ();
            }
        }
        this.eQg = ljq2;
    }

    private void a(fly fly2) {
        this.gaN = false;
        if (fly2.dJh == null || fly2.dJh.length == 0) {
            lfn.b(5, "SFDiggingSkill", "handleInventoryItemLockResponseMessage(): Couldn't lock treasure map for " + this);
            this.b(cxd.p.fSi);
            this.ber();
            if (this.gax) {
                this.beQ();
            }
            return;
        }
        if (!this.big()) {
            flw flw2 = (flw)this.MessageDelegator.h(7952, this.getGUID(), fly2.aO());
            flw2.iPs = fly2.iPs;
            flw2.dJh = fly2.dJh;
            this.MessageDelegator.E(flw2);
            this.b(cxd.p.fSi);
            this.ber();
            if (this.gax) {
                this.beQ();
            }
            return;
        }
        fmv fmv2 = (fmv)this.MessageDelegator.h(7940, this.getGUID(), fly2.aO());
        fmv2.aCK = fly2.iPs[0];
        fmv2.dIW = fly2.dJh[0];
        fmv2.iQA = true;
        fmv2.iQC = true;
        fmv2.b(bqy.dHW);
        this.MessageDelegator.E(fmv2);
        this.gaO = true;
    }

    private void a(fmw fmw2) {
        this.gaO = false;
        if (fmw2.iQE == null) {
            lfn.b(5, "SFDiggingSkill", "handleInventoryRemoveItemResponseMessage(): Couldn't remove treasure map for " + this);
            this.b(cxd.p.fSi);
            this.ber();
            if (this.gax) {
                this.beQ();
            }
            return;
        }
        if (!this.big()) {
            lfn.b(5, "SFDiggingSkill", "handleInventoryRemoveItemResponseMessage(): Removed item but can't create loot for " + this);
            this.b(cxd.p.fSi);
            this.ber();
            if (this.gax) {
                this.beQ();
            }
            return;
        }
        cup cup2 = lea.eoM().get(this.gaL);
        if (cup2 == null) {
            lfn.b(5, "SFDiggingSkill", "handleInventoryRemoveItemResponseMessage(): No InventoryInfo for " + this.gaL);
            this.b(cxd.p.fSi);
            this.ber();
            if (this.gax) {
                this.beQ();
            }
            return;
        }
        cte[] cteArray = ctf.a(cup2);
        if (cteArray == null) {
            lfn.b(5, "SFDiggingSkill", "handleInventoryRemoveItemResponseMessage(): No items created for " + this.gaL);
            this.b(cxd.p.fSi);
            this.ber();
            if (this.gax) {
                this.beQ();
            }
            return;
        }
        this.gaP = true;
        this.a(cteArray, bqy.dGG);
        jts.a(bqy.dGG, cteArray, this.aJz().bgQ().aAG().azb(), this.MessageDelegator, this.GUID);
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

    private void a(gft gft2) {
        assert (this.eQf);
        this.eQf = false;
        boolean bl = this.ld(gft2.jgp);
        if (!bl) {
            // empty if block
        }
        if (gft2.jgo) {
            ha ha2;
            this.gaP = false;
            this.bif();
            ha ha3 = ha2 = this.jk() != null && this.jk().bgR() != null && this.jk().bgR() instanceof cex ? ((cex)this.jk().bgR()).mA() : null;
            if (ha2 != null && this.gay != null && ha2.kv()) {
                int n2 = 0;
                for (int i2 = 0; i2 < this.gay.length; ++i2) {
                    n2 += this.gay[i2].asi;
                }
                ha2.m(this.SkillType, n2);
            }
        } else {
            this.b(cxd.p.fSi);
            this.ber();
            this.a(mcs.uzc.bD(new Object[0]));
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
            ljq ljq2 = cex2.aAG() != null ? cex2.aAG().av() : new ljq();
            int n7 = this.fGh != null ? this.fGh.dhr : -1;
            ldv ldv2 = this.fGh != null ? this.fGh.dsL : new ldv(0L);
            ljq ljq3 = this.fGh != null ? this.fGh.aZD : new ljq();
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

    private void bif() {
        cte[] cteArray = null;
        cup cup2 = lea.eoM().get(cug.fkR);
        if (cup2 != null) {
            cteArray = ctf.a(cup2);
        }
        if (cteArray == null || cteArray.length == 0) {
            this.b(cxd.p.fSi);
            this.ber();
            this.a(mcs.uzc.bD(new Object[0]));
            if (this.gax) {
                this.beQ();
            }
            return;
        }
        this.a(cteArray, bqy.dGG);
        this.gay = cteArray;
        jts.a(bqy.dGG, cteArray, this.aJz().bgQ().aAG().azb(), this.MessageDelegator, this.GUID);
    }

    private void a(cte[] cteArray, bqy bqy2) {
        fcy fcy2 = (fcy)this.MessageDelegator.h(9229, this.GUID, this.MessageDelegator.getGUID());
        fcy2.dul = 8;
        fcy2.bst = this.getFunctionType();
        fcy2.akX = fcy2.aZG = this.emI.bgQ().getGUID();
        fcy2.dtP = cteArray;
        fcy2.iyH = false;
        fcy2.iJG = true;
        fcy2.b(bqy2);
        this.MessageDelegator.F(fcy2);
        this.gaw = true;
    }

    private void a(fcs fcs2) {
        assert (this.gaw);
        if (fcs2.bst <= 0) {
            lfn.b(5, "SFDiggingSkill", "handleFunctionCompletionResultMessage() FunctionType is invalid.");
            assert (false);
            return;
        }
        if (fcs2.bst != this.getFunctionType()) {
            lfn.b(5, "SFDiggingSkill", "handleFunctionCompletionResultMessage() FunctionType are different.");
            lfn.b(5, "SFDiggingSkill", "handleFunctionCompletionResultMessage() Message.FunctionType='" + dqt.getName(fcs2.bst) + "'");
            lfn.b(5, "SFDiggingSkill", "handleFunctionCompletionResultMessage() Skill.FunctionType='" + dqt.getName(this.getFunctionType()) + "'");
            assert (false);
            return;
        }
        this.gaw = false;
        if (fcs2.iJq) {
            cex cex2;
            ha ha2;
            cdb cdb2;
            this.bhq();
            this.b(cxd.p.fSi);
            if (this.gaP) {
                this.a(mcs.uzd.bD(new Object[0]));
            } else {
                this.a(mcs.uzf.bD(new Object[0]));
            }
            if (this.gay != null && (cdb2 = this.emI.bgQ()) != null && cdb2 instanceof cex && (ha2 = (cex2 = (cex)cdb2).mA()) != null) {
                ljq ljq2 = cex2.aAG() != null ? cex2.aAG().azb() : ljq.roQ;
                fst fst2 = (fst)this.MessageDelegator.h(30211, this.getGUID(), ha2.getGUID());
                fst2.Position = ljq2;
                fst2.eAc = this.fGh.dhr;
                fst2.iVC = this.gay;
                this.MessageDelegator.I(fst2);
            }
            this.bhr();
        } else {
            this.b(cxd.p.fSi);
            this.ber();
        }
        if (this.gax) {
            this.beQ();
        }
    }

    @Override
    protected final void bex() {
        super.bex();
        this.eQf = false;
        this.gaM = false;
        this.gaK = 0;
        this.gax = false;
        this.gaN = false;
        this.gaO = false;
        this.gaw = false;
        this.gaP = false;
        this.gay = null;
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 10760: {
                this.a((ear)dxq2);
                break;
            }
            case 7951: {
                this.a((fly)dxq2);
                break;
            }
            case 7941: {
                this.a((fmw)dxq2);
                break;
            }
            case 6158: {
                this.a((gft)dxq2);
                break;
            }
            case 9219: {
                this.a((fcs)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private boolean big() {
        cex cex2;
        if (this.aJz() == null) {
            lfn.b(5, "SFDiggingSkill", "checkPlayerState(): SkillManager is null for " + this);
            return false;
        }
        if (this.aJz().bgQ() == null) {
            lfn.b(5, "SFDiggingSkill", "checkPlayerState(): SkillOwner is null for " + this);
            return false;
        }
        if (!(this.aJz().bgQ() instanceof cex)) {
            lfn.b(5, "SFDiggingSkill", "checkPlayerState(): SkillOwner isn't a SFPlayerObjectServer for " + this);
        }
        if ((cex2 = (cex)this.aJz().bgQ()).aAG() == null) {
            lfn.b(5, "SFDiggingSkill", "checkPlayerState(): MeshObject is null for " + cex2);
            return false;
        }
        if (cex2.aAG().azb() == null) {
            lfn.b(5, "SFDiggingSkill", "checkPlayerState(): MeshObject position is null for " + cex2);
            return false;
        }
        if (cex2.aJC() == null) {
            lfn.b(5, "SFDiggingSkill", "checkPlayerState(): InventoryManager is null for " + cex2);
            return false;
        }
        if (cex2.aJC().asf() == null) {
            lfn.b(5, "SFDiggingSkill", "checkPlayerState(): Inventory is null for " + cex2);
            return false;
        }
        return true;
    }
}

