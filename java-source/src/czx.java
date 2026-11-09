/*
 * Decompiled with CFR.
 */
public class czx
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
        this.arx();
    }

    private void a(fcs fcs2) {
        if (fcs2.bst <= 0) {
            lfn.b(5, "SFReviveSkill", "handleFunctionCompletionResultMessage() FunctionType is invalid.");
            return;
        }
        if (fcs2.bst != this.getFunctionType()) {
            lfn.b(5, "SFReviveSkill", "handleFunctionCompletionResultMessage() FunctionType are different.");
            lfn.b(5, "SFReviveSkill", "handleFunctionCompletionResultMessage() Message.FunctionType='" + dqt.getName(fcs2.bst) + "'");
            lfn.b(5, "SFReviveSkill", "handleFunctionCompletionResultMessage() Skill.FunctionType='" + dqt.getName(this.getFunctionType()) + "'");
            return;
        }
        if (fcs2.iJq) {
            this.bhq();
            this.bhr();
            this.b(cxd.p.fSi);
        } else {
            this.ber();
        }
    }

    private void arx() {
        assert (this.fGh != null);
        fdk fdk2 = (fdk)this.MessageDelegator.h(9247, this.GUID, this.MessageDelegator.getGUID());
        fdk2.dul = 8;
        fdk2.bst = this.getFunctionType();
        fdk2.aZG = this.emI.bgQ().getGUID();
        fdk2.akX = this.fGh.akX;
        fdk2.aYF = this.emI.bgQ().getGUID();
        fdk2.bsG = this.emI.bgQ().az();
        fdk2.aYC = this.SkillType;
        fdk2.SkillLevel = this.bfw();
        this.MessageDelegator.F(fdk2);
    }
}

