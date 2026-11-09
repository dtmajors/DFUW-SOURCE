/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  lcr
 *  lcw
 */
public class bmp
extends bke {
    private fcp dvz = null;

    public bmp() {
        this.dsy = bkd.a.dsa;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        assert (fdo2 != null);
        this.dvz = (fcp)fdo2;
        if (this.dvz.YL == null) {
            this.Vc();
            return;
        }
        if (this.dvz.ff < 0) {
            this.Vc();
            return;
        }
        if (lcw.enb()) {
            if (!ctg.feM) {
                this.Vc();
                return;
            }
            cex cex2 = (cex)this.d(fdo2.akX);
            if (cex2 == null) {
                this.Vc();
                return;
            }
            fux fux2 = (fux)this.MessageDelegator.h(5639, this.GUID, this.GUID);
            fux2.Ri = cex2.mA().getGUID();
            this.MessageDelegator.F(fux2);
            return;
        }
        fux fux3 = (fux)this.MessageDelegator.h(5639, this.GUID, lcr.hac);
        fux3.bc = this.dvz.YL;
        this.MessageDelegator.F(fux3);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5639: {
                this.a((fux)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fux fux2) {
        if (fux2.Ri == null) {
            this.Vc();
            return;
        }
        gry gry2 = (gry)this.MessageDelegator.h(11070, this.GUID, fux2.Ri);
        gry2.ff = this.dvz.ff;
        this.MessageDelegator.F(gry2);
    }
}

