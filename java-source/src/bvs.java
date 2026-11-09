/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class bvs
extends bvr {
    private bvy dTu = null;

    public bvs(bve.a a2) {
        super(a2);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.eE(false);
        if (this.dTu != null) {
            this.MessageDelegator.hd(this.dTu.getGUID());
            this.dTu = null;
        }
    }

    @Override
    protected final void azk() {
        super.azk();
        this.eE(true);
    }

    private void eE(boolean bl) {
        ldv ldv2 = lcr.qAR;
        gsx gsx2 = (gsx)this.MessageDelegator.h(11056, this.GUID, ldv2);
        gsx2.gYM = bl;
        this.MessageDelegator.F(gsx2);
    }

    @Override
    protected void azj() {
        super.azj();
        this.dTu = new bvy(this);
        this.dTu.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.dTu);
        this.dTu.aAz();
    }

    public final bvy aAp() {
        return this.dTu;
    }
}

