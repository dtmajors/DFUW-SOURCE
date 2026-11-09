/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class sv
extends qe {
    private String aRA;

    public sv(md md2) {
        super(md2, me.ays);
    }

    public void ce(String string) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerCreateOneVillage", "setVillageFilename: Can't modify while working");
            assert (false);
            return;
        }
        this.aRA = string;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24322: {
                this.a((gbj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gbj gbj2) {
        if (gbj2.eo) {
            this.ca(null);
        } else {
            this.ca("Village creation failed for " + this.aRA);
        }
    }

    @Override
    protected void sO() {
        gbi gbi2 = (gbi)this.MessageDelegator.h(24321, this.getGUID(), lcr.qBE);
        gbi2.eUC = this.aRA;
        this.MessageDelegator.E(gbi2);
    }

    @Override
    protected void sP() {
    }
}

