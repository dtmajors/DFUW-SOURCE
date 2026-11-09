/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cxg
 *  lcw
 *  mcs
 */
public class dau
extends czb {
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

    protected void bey() {
    }

    protected void beC() {
        assert (this.fGZ);
        assert (this.fGi != null);
        this.j(this.fGi);
    }

    private void a(fcs fcs2) {
        assert (this.fGZ);
        assert (this.fGi != null);
        if (fcs2.bst <= 0) {
            lfn.b(5, "SFSkinningSkill", "handleFunctionCompletionResultMessage() FunctionType is invalid.");
            return;
        }
        if (fcs2.bst != this.getFunctionType()) {
            lfn.b(5, "SFSkinningSkill", "handleFunctionCompletionResultMessage() FunctionType are different.");
            lfn.b(5, "SFSkinningSkill", "handleFunctionCompletionResultMessage() Message.FunctionType='" + dqt.getName(fcs2.bst) + "'");
            lfn.b(5, "SFSkinningSkill", "handleFunctionCompletionResultMessage() Skill.FunctionType='" + dqt.getName(this.getFunctionType()) + "'");
            return;
        }
        czj czj2 = this.emI.mf(this.GUID);
        if (czj2 == null) {
            lfn.b(5, "SFSkinningSkill", "handleFunctionCompletionResultMessage() ParentSkill of skill '" + this.getName() + "' was not found.");
            return;
        }
        if (fcs2.iJq) {
            this.jk().ch((cxc)((Object)czj2));
            czj2.bhr();
            czj2.a(cxd.p.fSi, this.fGi);
        } else {
            this.a(mcs.uyH.bD(new Object[0]));
            czj2.ber();
        }
    }

    private void j(ddc ddc2) {
        assert (ddc2 != null);
        cxc cxc2 = this.emI.ht(ddc2.aYC);
        if (cxc2 == null) {
            lfn.b(5, "SFSkinningSkill", "sendFunctionSkinningMessage() ContainerSkill '" + aqN.getName(ddc2.aYC) + "' was not found.");
            assert (false);
            return;
        }
        float f2 = cxg.d((cxc)cxc2, (int)1544);
        if (lcw.emX()) {
            f2 += f2 * cil.e(this.emI.bgQ().fi());
            f2 = lew.A(f2, 0.0f, 1.0f);
        }
        if (f2 <= 0.0f || f2 > 1.000005f) {
            lfn.b(5, "SFSkinningSkill", "sendFunctionSkinningMessage() ProbabilityBase is invalid: " + f2);
            f2 = lew.A(f2, 0.0f, 1.0f);
        }
        float f3 = 1.0f;
        float f4 = 1.0f;
        if (this.emI.bgR() instanceof cex) {
            f3 = ((cex)this.emI.bgR()).b(dmh.gHZ);
            f4 = ((cex)this.emI.bgR()).b(dmh.gIa);
        }
        fdm fdm2 = (fdm)this.MessageDelegator.h(9236, this.GUID, this.MessageDelegator.getGUID());
        fdm2.dul = 8;
        fdm2.bst = this.getFunctionType();
        fdm2.aZG = ddc2.aYF;
        fdm2.akX = ddc2.akX;
        fdm2.aYF = ddc2.aYF;
        fdm2.bsG = this.emI.bgQ().az();
        fdm2.aYC = ddc2.aYC;
        fdm2.iJY = f2;
        fdm2.iJZ = f3;
        fdm2.iKa = f4;
        this.MessageDelegator.I(fdm2);
    }
}

