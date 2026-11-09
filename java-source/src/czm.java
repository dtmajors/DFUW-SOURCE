/*
 * Decompiled with CFR.
 */
public class czm
extends czn {
    private int gao = 0;
    private int gap = 0;

    public final void zn(int n2) {
        this.gao = n2;
    }

    public final void zo(int n2) {
        this.gap = n2;
    }

    @Override
    protected final void e(cxc cxc2) {
        super.e(cxc2);
        czm czm2 = (czm)((Object)cxc2);
        czm2.zn(this.gao);
        czm2.zo(this.gap);
    }

    @Override
    protected void z(int n2, float f2) {
        assert (n2 > 0);
        assert (f2 > 0.0f);
        fcu fcu2 = (fcu)this.MessageDelegator.h(9226, this.GUID, this.MessageDelegator.getGUID());
        fcu2.bst = this.getFunctionType();
        fcu2.aZG = this.emI.bgQ().getGUID();
        fcu2.akX = this.emI.bgQ().getGUID();
        fcu2.aYF = this.emI.bgQ().getGUID();
        fcu2.bsG = this.emI.bgQ().az();
        fcu2.aYC = this.SkillType;
        fcu2.ResourceType = n2;
        fcu2.iJt = f2;
        fcu2.diS = this.emI.bgQ().aAG().av();
        fcu2.gao = this.gao;
        fcu2.gap = this.gap;
        this.MessageDelegator.I(fcu2);
    }
}

