/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cug
 *  cxd
 *  ha
 *  lcr
 *  mcs
 */
public class dad
extends czc {
    private boolean gaA = false;

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1028: {
                this.a((ftz)dxq2);
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

    @Override
    protected boolean b(cwx.a a2, cwx.a a3) {
        if (a2 == cwx.a.fGw && this.gaA) {
            return true;
        }
        return super.b(a2, a3);
    }

    @Override
    protected void a(czc.a a2) {
        if (a2 != czc.a.fZG) {
            return;
        }
        assert (!this.fGZ);
        assert (this.fGh.akX != null);
        assert (this.fGi == null);
        assert (!this.gaA);
        ha ha2 = this.emI.bgQ().mA();
        if (ha2 == null) {
            this.beQ();
            return;
        }
        if (ha2.jy()) {
            this.beQ();
            return;
        }
        ha2.J(true);
        byv byv2 = this.emI.bgQ().aJD().aEP();
        if (byv2.Uu() || byv2.Uv()) {
            if (!this.bik()) {
                ha2.J(false);
            }
            this.beQ();
            return;
        }
        if (bsi.mF(this.fGh.dhr)) {
            float f2 = cug.bi((int)this.fGh.dhr, (int)1088);
            cxc cxc2 = this.emI.ht(cxd.fHz);
            if (cxc2.Bt() < f2 && this.emI.bgQ() instanceof cex) {
                ((cex)this.emI.bgQ()).c(mcs.uBq.bD(cxd.fHz, Float.valueOf(f2)));
                ha2.J(false);
                this.beQ();
                return;
            }
        }
        if (lea.enW().isDescendant(this.fGh.dhr, cug.fqz) && lea.enW().getName(this.fGh.dhr).toLowerCase().startsWith("r_exploration")) {
            fte fte2 = (fte)this.MessageDelegator.h(30209, this.getGUID(), ha2.getGUID());
            fte2.SkillType = this.SkillType;
            fte2.ResourceType = this.fGh.dhr;
            fte2.Position = this.fGh.aZD;
            this.MessageDelegator.I(fte2);
            ha2.J(false);
            this.beQ();
            return;
        }
        if (this.fGh.dsL == null) {
            lfn.b(5, "SFUseObjectSkill", "doPerform() TargetMeshObjectGUID is null.");
            ha2.J(false);
            this.beQ();
            return;
        }
        if (ctg.ffj) {
            this.fGh.akX = this.emI.bgQ().getGUID();
            this.fGh.dsL = this.emI.bgQ().aAG().getGUID();
            this.fGh.dhr = this.emI.bgQ().az();
        }
        if (this.fGh.akX.equals(lcr.qAC)) {
            fte fte3 = (fte)this.MessageDelegator.h(30209, this.getGUID(), ha2.getGUID());
            fte3.SkillType = this.SkillType;
            fte3.ResourceType = this.fGh.dhr;
            fte3.Position = this.fGh.aZD;
            this.MessageDelegator.I(fte3);
            this.bij();
            this.beQ();
        } else {
            ftz ftz2 = (ftz)this.MessageDelegator.h(1028, this.GUID, this.fGh.dsL);
            ftz2.hsP = true;
            ftz2.aqs = this.aYH;
            this.MessageDelegator.F(ftz2);
            this.gaA = true;
        }
    }

    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        if (!this.gaA) {
            return;
        }
        this.gaA = false;
        this.emI.bgQ().mA().J(false);
        this.beQ();
    }

    @Override
    protected void bex() {
        super.bex();
        this.gaA = false;
    }

    private void a(fcs fcs2) {
        if (fcs2.bst <= 0) {
            lfn.b(5, "SFUseObjectSkill", "handleFunctionCompletionResultMessage() FunctionType is invalid.");
            return;
        }
        if (fcs2.iJq) {
            this.b(cxd.p.fSi);
            this.bhr();
        } else {
            this.emI.bgQ().mA().J(false);
            this.ber();
        }
    }

    private void a(ftz ftz2) {
        if (!this.gaA) {
            return;
        }
        if (ftz2.aqs != this.aYH) {
            lfn.b(5, "SFUseObjectSkill", "handleObjectPositionInfoMessage() Invalid messagetag provided: " + ftz2.aqs);
            lfn.b(5, "SFUseObjectSkill", "handleObjectPositionInfoMessage() SessionID=" + this.aYH);
            return;
        }
        this.gaA = false;
        if (ftz2.Position == null) {
            lfn.b(5, "SFUseObjectSkill", "handleObjectPositionInfoMessage() Position is null.");
        } else if (this.a(this.fGh.dhr, this.fGh.dph, ftz2.Position)) {
            ha ha2 = this.emI.bgQ().mA();
            if (ha2 != null) {
                fte fte2 = (fte)this.MessageDelegator.h(30209, this.getGUID(), ha2.getGUID());
                fte2.SkillType = this.SkillType;
                fte2.ResourceType = this.fGh.dhr;
                fte2.Position = this.fGh.aZD;
                this.MessageDelegator.I(fte2);
            }
            this.bij();
        } else {
            this.emI.bgQ().mA().J(false);
        }
        this.beQ();
    }

    private void bij() {
        ew ew2;
        assert (this.fGh.akX != null);
        assert (this.fGh.dsL != null);
        assert (this.fGh.dhr > 0);
        assert (this.fGh.gcx);
        fdv fdv2 = (fdv)this.MessageDelegator.h(9240, this.GUID, this.MessageDelegator.getGUID());
        fdv2.dul = 8;
        fdv2.bst = this.getFunctionType();
        fdv2.aZG = this.emI.bgQ().getGUID();
        fdv2.akX = this.fGh.akX;
        fdv2.aYF = fdv2.aZG;
        fdv2.bsG = this.emI.bgQ().az();
        fdv2.aYC = this.SkillType;
        fdv2.aZH = this.aJz().bgQ().aAG() == null ? new ljq(0.0f, 0.0f, 0.0f) : this.aJz().bgQ().aAG().av();
        fdv2.aZD = this.fGh.dph;
        fdv2.dsL = this.fGh.dsL;
        fdv2.RB = this.jk().jr();
        if (this.aJz().bgQ() instanceof cex) {
            fdv2.iKk = ((cex)this.aJz().bgQ()).mA().kA();
        }
        if ((ew2 = (ew)this.aJz().bgQ().fi().ae(12256)) != null) {
            fdv2.Nationality = ew2.fQ();
        }
        if (this.fGh.akX.equals(lcr.qAC)) {
            fdv2.akX = lcr.qEk;
            fdv2.dhr = this.fGh.dhr;
        }
        this.MessageDelegator.F(fdv2);
    }

    private boolean bik() {
        ew ew2;
        assert (this.fGh.akX != null);
        assert (this.fGh.gcx);
        if (this.fGh.akX.equals(lcr.qAC)) {
            lfn.b(5, "SFUseObjectSkill", "startUseFunctionForExternalObject() TargetObjectGUID=" + this.fGh.akX);
            return false;
        }
        fdv fdv2 = (fdv)this.MessageDelegator.h(9240, this.GUID, this.MessageDelegator.getGUID());
        fdv2.dul = 8;
        fdv2.bst = this.getFunctionType();
        fdv2.aZG = this.emI.bgQ().getGUID();
        fdv2.akX = this.fGh.akX;
        fdv2.aYF = fdv2.aZG;
        fdv2.bsG = this.emI.bgQ().az();
        fdv2.aYC = this.SkillType;
        fdv2.aZD = this.fGh.dph;
        ljq ljq2 = fdv2.aZH = this.aJz().bgQ().aAG() == null ? new ljq(0.0f, 0.0f, 0.0f) : this.aJz().bgQ().aAG().av();
        if (this.aJz().bgQ() instanceof cex) {
            fdv2.iKk = ((cex)this.aJz().bgQ()).mA().kA();
        }
        if ((ew2 = (ew)this.aJz().bgQ().fi().ae(12256)) != null) {
            fdv2.Nationality = ew2.fQ();
        }
        this.MessageDelegator.F(fdv2);
        return true;
    }
}

