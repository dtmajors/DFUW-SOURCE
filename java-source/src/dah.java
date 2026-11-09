/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cex
 *  cug
 *  cxd
 */
public class dah
extends czb {
    private bqs gbf = null;
    private lef dIW = null;

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
        ldv ldv2 = this.fGh.akX;
        this.gbf = this.emI.bgQ().aJF().iK(this.fGh.akX);
        if (this.gbf == null) {
            lfn.b(5, "SFConsumeSkill", "doAction() Could not find item " + this.fGh.akX);
            this.ber();
            return;
        }
        if (this.zg() == cxd.fHd && this.emI.bgQ() instanceof cex && cug.wH((int)this.gbf.az())) {
            boolean bl = false;
            cex cex2 = (cex)this.emI.bgQ();
            if (cex2.aJD() != null && cex2.aJD().aEP() != null) {
                bl = this.emI.bgQ().aJD().aEP().isAlive();
            }
            int n2 = cex2.aMY();
            boolean bl2 = cug.vM((int)n2);
            if (bl) {
                lfn.b(5, "SFConsumeSkill", "doAction() Player : " + this.emI.bgQ().getGUID() + " is still alive");
                this.ber();
                return;
            }
            if (cug.wI((int)this.gbf.az()) && !bl2) {
                lfn.b(5, "SFConsumeSkill", "doAction() Player : " + this.emI.bgQ().getGUID() + " is trying to use a pvp revive potion while died from a non player reason.");
                this.ber();
                return;
            }
            if (cug.wJ((int)this.gbf.az()) && bl2) {
                lfn.b(5, "SFConsumeSkill", "doAction() Player : " + this.emI.bgQ().getGUID() + " is trying to use a pve revive potion while died from another player.");
                this.ber();
                return;
            }
        }
        this.dIW = this.emI.bgQ().aJC().asf().auo().iX(this.fGh.akX);
        if (this.dIW == null) {
            this.ber();
            return;
        }
        this.aa(this.fGh.akX, this.gbf.az());
    }

    @Override
    protected void bex() {
        super.bex();
        if (this.dIW != null) {
            this.emI.bgQ().aJC().asf().auo().a(this.gbf.getGUID(), this.dIW);
        }
        this.gbf = null;
        this.dIW = null;
    }

    private et[] bip() {
        et[] etArray = new et[]{(et)this.emI.bgQ().fi().ah(160).fn(), (et)this.emI.bgQ().fi().ah(176).fn(), (et)this.emI.bgQ().fi().ah(208).fn(), (et)this.emI.bgQ().fi().ah(240).fn()};
        return etArray;
    }

    private void a(fcs fcs2) {
        assert (!this.fGZ);
        if (fcs2.bst <= 0) {
            lfn.b(5, "SFConsumeSkill", "handleFunctionCompletionResultMessage() FunctionType is invalid.");
            return;
        }
        if (fcs2.bst != this.getFunctionType()) {
            lfn.b(5, "SFConsumeSkill", "handleFunctionCompletionResultMessage() FunctionType are different.");
            lfn.b(5, "SFConsumeSkill", "handleFunctionCompletionResultMessage() Message.FunctionType='" + dqt.getName(fcs2.bst) + "'");
            lfn.b(5, "SFConsumeSkill", "handleFunctionCompletionResultMessage() Skill.FunctionType='" + dqt.getName(this.getFunctionType()) + "'");
            return;
        }
        if (fcs2.iJq) {
            if (this.emI == null || this.emI.bgQ() == null || this.emI.bgQ().aJC() == null || this.gbf == null) {
                lfn.b(5, "SFConsumeSkill", "handleFunctionCompletionResultMessage() NULL check here.");
                this.ber();
            } else {
                this.b(cxd.p.fSi);
                this.bhr();
                ((bri)this.emI.bgQ().aJC().asf()).a(this.gbf.getGUID(), this.dIW, 1, bqy.dHw);
            }
        } else {
            this.ber();
        }
    }

    private void aa(ldv ldv2, int n2) {
        assert (ldv2 != null);
        assert (n2 > 0);
        fct fct2 = (fct)this.MessageDelegator.h(9225, this.GUID, this.MessageDelegator.getGUID());
        fct2.bst = this.getFunctionType();
        fct2.dul = 8;
        fct2.aZG = this.emI.bgQ().getGUID();
        fct2.akX = ldv2;
        fct2.aYF = fct2.aZG;
        fct2.bsG = this.emI.bgQ().az();
        fct2.aYC = this.zg();
        fct2.aYH = this.aYH;
        if (this.SkillType == cxd.fHe) {
            fct2.iJr = cer.a((cex)this.emI.bgQ(), n2);
        }
        if (ResourceTree.isDescendant(this.gbf.az(), cug.fjS)) {
            fct2.iJs = this.bip();
        }
        this.MessageDelegator.F(fct2);
    }
}

