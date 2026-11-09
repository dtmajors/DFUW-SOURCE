/*
 * Decompiled with CFR.
 */
public class czw
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
        bqs bqs2 = (bqs)this.emI.bgQ().aJC().asf().iF(this.fGh.akX);
        if (bqs2 == null) {
            lfn.b(5, "SFReadSkill", "doPerform() Could not find item " + this.fGh.akX);
            return;
        }
        int n2 = bqs2.ap(10384);
        if (n2 <= 0) {
            lfn.b(5, "SFReadSkill", "doPerform() Manual skilltype is invalid for " + bqs2);
            return;
        }
        this.Z(bqs2.getGUID(), n2);
    }

    private void a(fcs fcs2) {
        if (fcs2.bst <= 0) {
            lfn.b(5, "SFReadSkill", "handleFunctionCompletionResultMessage() FunctionType is invalid.");
            return;
        }
        if (fcs2.bst != this.getFunctionType()) {
            lfn.b(5, "SFReadSkill", "handleFunctionCompletionResultMessage() FunctionType are different.");
            lfn.b(5, "SFReadSkill", "handleFunctionCompletionResultMessage() Message.FunctionType='" + dqt.getName(fcs2.bst) + "'");
            lfn.b(5, "SFReadSkill", "handleFunctionCompletionResultMessage() Skill.FunctionType='" + dqt.getName(this.getFunctionType()) + "'");
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

    private void Z(ldv ldv2, int n2) {
        assert (ldv2 != null);
        assert (n2 > 0);
        fdi fdi2 = (fdi)this.MessageDelegator.h(9246, this.GUID, this.MessageDelegator.getGUID());
        fdi2.dul = 8;
        fdi2.bst = this.getFunctionType();
        fdi2.akX = fdi2.aZG = this.emI.bgQ().getGUID();
        fdi2.aYF = fdi2.aZG;
        fdi2.bsG = this.emI.bgQ().az();
        fdi2.aYC = this.SkillType;
        fdi2.iJV = ldv2;
        fdi2.iJW = n2;
        this.MessageDelegator.F(fdi2);
    }
}

