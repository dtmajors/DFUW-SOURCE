/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  ha
 */
public class dax
extends czb {
    private ljq fXW = null;

    public ljq bgF() {
        return this.fXW;
    }

    public void bH(ljq ljq2) {
        this.fXW = ljq2;
    }

    public String bfB() {
        return "SFJumpSkill";
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        dax dax2 = (dax)((Object)cxc2);
        dax2.bH(this.fXW.esF());
    }

    protected void beA() {
        cex cex2;
        ha ha2;
        this.emI.bgQ().aJD().amY();
        this.bhq();
        if (this.emI.bgQ() instanceof cex && (ha2 = (cex2 = (cex)this.emI.bgQ()).mA()) != null) {
            fte fte2 = (fte)ha2.getMessageDelegator().h(30209, ha2.getGUID(), ha2.getGUID());
            fte2.SkillType = this.SkillType;
            fte2.ResourceType = cex2.az();
            fte2.Position = cex2.aAG() != null ? cex2.aAG().av() : null;
            ha2.getMessageDelegator().I(fte2);
        }
    }
}

