/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cug
 *  cxd
 *  ha
 */
public class czz
extends czc {
    @Override
    protected void a(czc.a a2) {
        if (a2 != czc.a.fZI) {
            return;
        }
        assert (!this.fGZ);
        assert (this.fGh.YL != null);
        assert (this.fGi == null);
        ake ake2 = this.bid();
        if (ake2 == null) {
            lfn.b(5, "SFSummonPlayerSkill", "doPerform() No constraint found in skill '" + this.getName() + "'");
            this.bhw();
            return;
        }
        bsa bsa2 = ake2.Dc();
        if (bsa2 == null) {
            lfn.b(5, "SFSummonPlayerSkill", "doPerform() No constraint found in skill '" + this.getName() + "'");
            this.bhw();
            return;
        }
        ake2.bb(false);
        fdq fdq2 = (fdq)this.MessageDelegator.h(9248, this.GUID, this.MessageDelegator.getGUID());
        fdq2.bst = bkd.drf;
        fdq2.aZG = this.aJz().bgQ().getGUID();
        fdq2.akX = this.aJz().bgQ().getGUID();
        fdq2.iKc = this.fGh.YL;
        this.MessageDelegator.F(fdq2);
        this.fXv = true;
    }

    private ake bid() {
        if (this.fGe == null) {
            lfn.b(5, "SFSummonPlayerSkill", "getResourceQuantityConstraint() No constraints added to skill '" + this.getName() + "'");
            return null;
        }
        int n2 = this.zg() == cxd.fHh ? cug.fnY : cug.fnX;
        int n3 = this.fGe.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            ake ake2;
            if (!(this.fGe[i2] instanceof ake) || (ake2 = (ake)this.fGe[i2]).az() != n2) continue;
            return ake2;
        }
        return null;
    }

    private void a(fcs fcs2) {
        assert (!this.fGZ);
        if (fcs2.bst <= 0) {
            lfn.b(5, "SFSummonPlayerSkill", "handleFunctionCompletionResultMessage() FunctionType is invalid.");
            this.bii();
            this.ber();
            return;
        }
        if (fcs2.bst != this.getFunctionType()) {
            lfn.b(5, "SFSummonPlayerSkill", "handleFunctionCompletionResultMessage() FunctionType are different.");
            lfn.b(5, "SFSummonPlayerSkill", "handleFunctionCompletionResultMessage() Message.FunctionType='" + dqt.getName(fcs2.bst) + "'");
            lfn.b(5, "SFSummonPlayerSkill", "handleFunctionCompletionResultMessage() Skill.FunctionType='" + dqt.getName(this.getFunctionType()) + "'");
            this.bii();
            this.ber();
            return;
        }
        if (fcs2.iJq) {
            lfn.b(2, "SFSummonPlayerSkill", "handleFunctionCompletionResultMessage() Function '" + dqt.getName(this.getFunctionType()) + "' was completed.");
            if (this.emI.bgQ() == null || this.emI.bgQ().aJC() == null || this.emI.bgQ().aJC().asf() == null) {
                lfn.b(5, "SFSummonPlayerSkill", "handleFunctionCompletionResultMessage() Player object is not in a valid state");
                this.bhw();
                return;
            }
            bri bri2 = (bri)this.emI.bgQ().aJC().asf();
            for (aja aja2 : this.fGe) {
                if (!(aja2 instanceof ake)) continue;
                bri2.a(((ake)aja2).Dc(), bqy.dHw);
            }
            ha ha2 = this.emI.bgQ().mA();
            if (ha2 != null) {
                fte fte2 = (fte)this.MessageDelegator.h(30209, ha2.getGUID(), ha2.getGUID());
                fte2.SkillType = this.SkillType;
                fte2.ResourceType = this.fGh.dhr;
                fte2.Position = this.fGh.aZD;
                this.MessageDelegator.I(fte2);
            }
            this.bii();
            this.bhr();
            return;
        }
        this.bii();
        this.ber();
    }

    public final void bii() {
        if (this.aJz() == null) {
            lfn.b(5, "SFSummonPlayerSkill", "resetConsumeConstraint() Skill manager is null.");
            return;
        }
        if (this.aJz().bgQ() == null) {
            lfn.b(5, "SFSummonPlayerSkill", "resetConsumeConstraint() There is no skill owner.");
            return;
        }
        if (this.aJz().bgQ().aJC() == null) {
            lfn.b(5, "SFSummonPlayerSkill", "resetConsumeConstraint() inventory manager is null.");
            return;
        }
        if (this.aJz().bgQ().aJC().asf() == null) {
            lfn.b(5, "SFSummonPlayerSkill", "resetConsumeConstraint() inventory is null.");
            return;
        }
        ake ake2 = this.bid();
        if (ake2 == null) {
            lfn.b(5, "SFSummonPlayerSkill", "resetConsumeConstraint() constraint is null.");
            return;
        }
        if (ake2.Dj()) {
            lfn.b(5, "SFSummonPlayerSkill", "resetConsumeConstraint() invalid state : " + ake2.Dj());
            return;
        }
        ake2.bb(true);
        ake2.reset();
    }

    public void initialize() {
        long l2;
        super.initialize();
        if (this.emI == null) {
            return;
        }
        if (this.emI.bgQ() == null) {
            return;
        }
        ha ha2 = this.emI.bgQ().mA();
        if (ha2 != null && (l2 = ha2.kX() - (long)this.MessageDelegator.arc().rgz) > 0L) {
            this.emI.a(this.SkillType, 0.0, (double)l2, this.SkillType, true);
        }
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 9219: {
                this.a((fcs)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

