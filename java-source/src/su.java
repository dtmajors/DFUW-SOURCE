/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class su
extends qe {
    private String Filename;

    public su(md md2) {
        super(md2, me.ayt);
    }

    public void cd(String string) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerCreateOneFortress", "setFilename: Can't modify while working");
            assert (false);
            return;
        }
        this.Filename = string;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24834: {
                this.a((fcf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fcf fcf2) {
        if (fcf2.eo) {
            this.ca(null);
        } else {
            this.ca("Fortress creation failed for " + this.Filename);
        }
    }

    @Override
    protected void sO() {
        fce fce2 = (fce)this.MessageDelegator.h(24833, this.getGUID(), lcr.qBG);
        fce2.iJd = this.Filename;
        this.MessageDelegator.E(fce2);
    }

    @Override
    protected void sP() {
    }
}

