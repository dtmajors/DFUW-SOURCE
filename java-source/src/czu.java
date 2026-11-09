/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cex
 */
public class czu
extends czc {
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

    @Override
    protected void a(czc.a a2) {
        if (a2 != czc.a.fZI) {
            return;
        }
        assert (!this.fGZ);
        assert (this.fGh.akX != null);
        assert (this.fGi == null);
        this.bih();
        this.fXv = true;
    }

    private void a(fcs fcs2) {
        if (fcs2.bst <= 0) {
            lfn.b(5, "SFGankSkill", "handleFunctionCompletionResultMessage() FunctionType is invalid.");
            return;
        }
        if (fcs2.bst != this.getFunctionType()) {
            lfn.b(5, "SFGankSkill", "handleFunctionCompletionResultMessage() FunctionType are different.");
            lfn.b(5, "SFGankSkill", "handleFunctionCompletionResultMessage() Message.FunctionType='" + dqt.getName(fcs2.bst) + "'");
            lfn.b(5, "SFGankSkill", "handleFunctionCompletionResultMessage() Skill.FunctionType='" + dqt.getName(this.getFunctionType()) + "'");
            return;
        }
        if (fcs2.iJq) {
            cex cex2;
            this.bhq();
            this.bhr();
            this.b(cxd.p.fSi);
            cdb cdb2 = this.aJz().bgQ();
            if (cdb2 instanceof cex && (cex2 = (cex)cdb2).aMK() != null) {
                cex2.aMK().kM(fcs2.akX);
            }
        } else {
            this.ber();
        }
    }

    private void bih() {
        assert (this.fGh != null);
        fdo fdo2 = (fdo)this.MessageDelegator.h(9217, this.GUID, this.MessageDelegator.getGUID());
        fdo2.dul = 8;
        fdo2.bst = this.getFunctionType();
        fdo2.aZG = this.emI.bgQ().getGUID();
        fdo2.akX = this.fGh.akX;
        fdo2.aYF = this.emI.bgQ().getGUID();
        fdo2.bsG = this.emI.bgQ().az();
        fdo2.aYC = this.SkillType;
        ew ew2 = (ew)this.aJz().bgQ().fi().ae(12256);
        int n2 = fdo2.dhr = ew2 == null ? 0 : ew2.fQ();
        if (this.emI.bgQ() instanceof cex && ((cex)this.emI.bgQ()).mA().kA() <= (float)cg.gW) {
            fdo2.dhr |= 0x1000;
        }
        this.MessageDelegator.F(fdo2);
    }
}

