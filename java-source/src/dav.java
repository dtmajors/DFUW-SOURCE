/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  mcs
 */
public class dav
extends czb {
    private int aRX = -1;

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

    protected void beA() {
        assert (!this.fGZ);
        assert (this.fGh.akX != null);
        assert (this.fGh.dph != null);
        assert (this.fGh.dpi != null);
        ldv ldv2 = this.fGh.akX;
        bqs bqs2 = this.emI.bgQ().aJC().iK(ldv2);
        if (bqs2 == null) {
            lfn.b(5, "SFUseItemSkill", "doAction() Could not find item " + ldv2);
            return;
        }
        this.aRX = bqs2.az();
        this.biD();
    }

    private void a(fcs fcs2) {
        assert (!this.fGZ);
        assert (this.fGi == null);
        if (fcs2.bst <= 0) {
            return;
        }
        if (fcs2.bst != this.getFunctionType()) {
            lfn.b(5, "SFUseItemSkill", "handleFunctionCompletionResultMessage() FunctionType are different.");
            lfn.b(5, "SFUseItemSkill", "handleFunctionCompletionResultMessage() Message.FunctionType='" + dqt.getName(fcs2.bst) + "'");
            lfn.b(5, "SFUseItemSkill", "handleFunctionCompletionResultMessage() Skill.FunctionType='" + dqt.getName(this.getFunctionType()) + "'");
            return;
        }
        if (fcs2.iJq) {
            this.b(cxd.p.fSi);
            this.bhr();
        } else {
            if (lea.enW().isDescendant(this.aRX, cug.fnn)) {
                if (this.aJz().aKe()) {
                    this.a(mcs.uCd.bD(new Object[0]));
                }
                return;
            }
            this.ber();
        }
    }

    private void biD() {
        fds fds2 = (fds)this.MessageDelegator.h(9239, this.GUID, this.MessageDelegator.getGUID());
        fds2.bst = this.getFunctionType();
        fds2.dul = 40;
        fds2.akX = fds2.aZG = this.emI.bgQ().getGUID();
        fds2.aYF = fds2.aZG;
        fds2.bsG = this.emI.bgQ().az();
        fds2.aYC = this.SkillType;
        fds2.iKd = this.fGh.akX;
        fds2.diS = this.emI.bgQ().aAG().av();
        fds2.aZD = this.fGh.dph;
        fds2.iKe = this.fGh.dpi;
        this.MessageDelegator.F(fds2);
    }
}

