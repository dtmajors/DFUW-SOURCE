/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  lcr
 *  lcw
 */
public class bms
extends bke {
    private cex dvy = null;

    public bms() {
        this.dsy = bkd.a.dsf;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        assert (fdo2 != null);
        fda fda2 = (fda)fdo2;
        if (fda2.YL == null) {
            lfn.b(5, "SFTeleportToPlayerFO", "doFunction() PlayerName is null.");
            this.Vc();
            return;
        }
        this.dvy = (cex)this.d(fdo2.akX);
        if (this.dvy == null) {
            lfn.b(5, "SFTeleportToPlayerFO", "doFunction() TargetObject " + fdo2.akX + " was not found.");
            this.Vc();
            return;
        }
        if (lcw.enb()) {
            if (!ctg.feM) {
                lfn.b(5, "SFTeleportToPlayerFO", "doFunction() Admin commands are currently disabled in standalone.");
                this.Vc();
                return;
            }
            fux fux2 = (fux)this.MessageDelegator.h(5639, this.GUID, this.GUID);
            fux2.Ri = this.dvy.mA().getGUID();
            this.MessageDelegator.F(fux2);
            return;
        }
        fux fux3 = (fux)this.MessageDelegator.h(5639, this.GUID, lcr.hac);
        fux3.bc = fda2.YL;
        this.MessageDelegator.F(fux3);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1028: {
                this.a((ftz)dxq2);
                break;
            }
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
        assert (fuu2 != null);
        if (fuu2.Ui == null) {
            lfn.b(5, "SFTeleportToPlayerFO", "handleObjectInfoGUIDResponseMessage() MeshObjectGUID is null.");
            this.Vc();
            return;
        }
        ftz ftz2 = (ftz)this.MessageDelegator.h(1028, this.GUID, fuu2.Ui);
        ftz2.hsP = true;
        this.MessageDelegator.F(ftz2);
    }

    private void a(fux fux2) {
        if (fux2.Ri == null) {
            lfn.b(5, "SFTeleportToPlayerFO", "handleObjectInfoNameLookupMessage() PSOGUID is null.");
            this.Vc();
            return;
        }
        fut fut2 = (fut)this.MessageDelegator.h(5635, this.GUID, fux2.Ri);
        fut2.iXt = 2;
        this.MessageDelegator.F(fut2);
    }

    private void a(ftz ftz2) {
        if (ftz2.Position == null) {
            lfn.b(5, "SFTeleportToPlayerFO", "handleObjectPositionInfoMessage() Position is null.");
            this.Vc();
            return;
        }
        ldv ldv2 = this.dvy.aJP().getGUID();
        gqt gqt2 = (gqt)this.MessageDelegator.h(11052, this.GUID, ldv2);
        gqt2.a(hx.a.aeK);
        gqt2.Position = ftz2.Position;
        gqt2.jpN = true;
        this.MessageDelegator.F(gqt2);
    }
}

