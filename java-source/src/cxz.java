/*
 * Decompiled with CFR.
 */
public class cxz
extends cxv {
    @Override
    protected void a(cxv.a a2) {
        switch (a2) {
            case fXw: {
                if (this.fGh.dcp == null) {
                    return;
                }
                this.emI.bgQ().aJD().nL(this.SkillType);
                this.emI.bgQ().aJN().a(this.fGh.dcp);
                break;
            }
        }
    }

    @Override
    protected void beO() {
        this.emI.bgQ().aJD().nM(this.SkillType);
        super.beO();
    }

    protected final void xg(int n2) {
        if ((n2 & 0x40) > 0) {
            this.emI.bgQ().aJN().a(this.fGh.dcp);
        }
    }
}

