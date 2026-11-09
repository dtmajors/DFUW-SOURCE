/*
 * Decompiled with CFR.
 */
public class cdl
extends ccz {
    public cdl(cdw cdw2) {
        super(cdw2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 20481: {
                this.a((fse)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void a(fsj fsj2) {
        if (fsj2.dTY == null) {
            return;
        }
        if (this.isScheduledForRemoval()) {
            return;
        }
        if (this.aeg.aAG() == null) {
            return;
        }
        ldv ldv2 = this.aeg.aAG().getGUID();
        this.a(ldv2, fsj2.dTY);
        ljq ljq2 = fsj2.dTY.eqI();
        lgl lgl2 = fsj2.dTY.eqK();
        this.aeg.aAG().g(ljq2, lgl2);
    }

    private void a(fse fse2) {
        if (fse2.aWe <= 0) {
            return;
        }
        dzv dzv2 = (dzv)this.MessageDelegator.h(7425, this.GUID, this.aeg.KY());
        dzv2.dTs = fse2.aWe;
        this.MessageDelegator.H(dzv2);
    }
}

