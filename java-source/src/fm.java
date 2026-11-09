/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
public class fm
extends btk {
    private ldv ih;

    @Override
    public void initialize() {
        this.ih = lcr.abU((int)this.GUID.ib());
        if (lcw.hC != null) {
            gpj gpj2 = (gpj)this.MessageDelegator.h(11043, this.GUID, this.GUID);
            this.MessageDelegator.F(gpj2);
        }
        super.initialize();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11043: {
                this.a((gpj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gpj gpj2) {
        if (lcw.hC == null) {
            lfn.b(5, this.getClass().getName(), "handleCharacterSelectMessage() : CharacterGUID is null!!!");
            assert (false);
            return;
        }
        lfn.b(0, this.getClass().getName(), "handleCharacterSelectMessage() : CharGUID = " + lcw.hC);
        kcm kcm2 = (kcm)this.MessageDelegator.i(264, this.GUID, this.ih);
        kcm2.g(lcw.hC);
        this.MessageDelegator.b(kcm2);
    }
}

