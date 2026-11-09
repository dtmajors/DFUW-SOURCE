/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  lcr
 *  lcw
 */
public class bmo
extends bke {
    private fda dvx = null;
    private ldv Ts = null;

    public bmo() {
        this.dsy = bkd.a.drT;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        assert (fdo2 != null);
        this.dvx = (fda)fdo2;
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
        fux3.bc = this.dvx.YL;
        this.MessageDelegator.F(fux3);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5636: {
                this.b((fuu)dxq2);
                break;
            }
            case 5639: {
                this.a((fux)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void b(fuu fuu2) {
        if (fuu2.dtj == null) {
            this.Vc();
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, fuu2.dtj);
        ern2.ilu = 2;
        ern2.YL = null;
        ern2.izI = this.dvx.iJJ;
        this.MessageDelegator.F(ern2);
        this.Vc();
    }

    private void a(fux fux2) {
        if (fux2.Ri == null) {
            this.Vc();
            return;
        }
        fut fut2 = (fut)this.MessageDelegator.h(5635, this.GUID, fux2.Ri);
        fut2.iXt = 1;
        this.MessageDelegator.F(fut2);
    }
}

