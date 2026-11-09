/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class log
extends btk {
    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 18714: {
                this.a((ehz)dxq2);
                break;
            }
            case 19980: {
                this.a((evf)dxq2);
                break;
            }
            case 11106: {
                this.a((gqc)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(ehz ehz2) {
        ehz2.on(lcr.qCn);
        this.MessageDelegator.F(ehz2);
    }

    private void a(evf evf2) {
        evf2.on(lcr.qEd);
        this.MessageDelegator.F(evf2);
    }

    private void a(gqc gqc2) {
        gqc gqc3 = (gqc)this.MessageDelegator.h(11106, this.getGUID(), gqc2.aO());
        gqc3.jpc = true;
        gqc3.jpb = gqc2.jpb;
        gqc3.aqs = gqc2.aqs;
        switch (gqc2.jpb) {
            case 0: {
                ceh.eoV = gqc2.jpd;
                gqc3.eo = true;
                break;
            }
            case 1: {
                ceh.eoU = gqc2.jpe;
                gqc3.eo = true;
                break;
            }
            default: {
                gqc3.eo = false;
                lfn.b(5, "SFGamelogicNodeMessageForwarder", "handleSystemConfigureGlobalSettingMessage(): Unhandled setting " + gqc2.jpb);
            }
        }
        this.MessageDelegator.E(gqc3);
    }
}

