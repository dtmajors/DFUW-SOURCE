/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  lcr
 */
public class bvq
extends bvr {
    public bvq(bve.a a2) {
        super(a2);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.eE(false);
    }

    @Override
    protected final void azk() {
        cex cex2;
        super.azk();
        this.eE(true);
        if (this.Qg instanceof cex && (cex2 = (cex)this.Qg).mA() != null) {
            cex2.mA().jw();
            ((cat)cex2.aKu()).aGT();
            ((cat)cex2.aKu()).aGU();
        }
    }

    private void eE(boolean bl) {
        ldv ldv2 = lcr.qAR;
        gsx gsx2 = (gsx)this.MessageDelegator.h(11056, this.GUID, ldv2);
        gsx2.gYM = bl;
        this.MessageDelegator.F(gsx2);
    }
}

