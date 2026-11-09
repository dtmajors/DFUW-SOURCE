/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
public class bur
extends btk {
    private gpu dON = null;
    private boolean dOO = false;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24582: {
                this.a((gtz)dxq2);
                break;
            }
            case 24583: {
                this.a((gua)dxq2);
                break;
            }
            case 11112: {
                this.a((gpu)dxq2);
                break;
            }
            case 2578: {
                this.a((ffm)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gtz gtz2) {
        if (this.dOO) {
            this.as(4, -1);
            return;
        }
        if (this.dON != null) {
            this.as(4, -1);
            return;
        }
        this.dOO = true;
        gtz2.f(this.getGUID());
        gtz2.on(gtz2.jrN);
        this.MessageDelegator.F(gtz2);
    }

    private void a(gua gua2) {
        this.as(gua2.ew, gua2.jrO);
        this.dOO = false;
    }

    private void as(int n, int n2) {
        switch (n) {
            case 2: {
                this.j(mcw.uCu.bD(new Object[0]));
                break;
            }
            case 3: {
                this.j(mcw.uCv.bD(lea.aco(n2), cug.bbP()));
                break;
            }
            case 4: {
                this.j(mcw.uCw.bD(cug.bbP()));
                break;
            }
            case 0: {
                this.j(mcw.uCx.bD(new Object[0]));
                break;
            }
            case 1: {
                this.j(mcw.tYV.bD(new Object[0]));
                break;
            }
            case 5: {
                this.j(mcw.uCy.bD(cug.fnV, cug.fww));
                break;
            }
            case 6: {
                this.j(mcw.uCz.bD(new Object[0]));
                break;
            }
            default: {
                assert (false) : "Unhandler response type :" + n;
                break;
            }
        }
    }

    private final void j(loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, lcr.acL);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private void a(ffm ffm2) {
        if (this.dON == null) {
            lfn.b(5, "SFClanTeleportChamberClientManager", "handleGuiTeleportationChamberSelectResponseMessage(): Got unexpected message, PortalViewMessage is null");
            return;
        }
        gpt gpt2 = (gpt)this.MessageDelegator.h(11113, this.getGUID(), this.dON.aO());
        gpt2.eOO = ffm2.eOO;
        this.MessageDelegator.b(this.dON, gpt2);
        this.MessageDelegator.F(gpt2);
        this.dON = null;
    }

    private void a(gpu gpu2) {
        assert (gpu2.iLa != null);
        assert (gpu2.iLb != null);
        assert (gpu2.iLc != null);
        assert (gpu2.iLd != null);
        assert (gpu2.iLb.length == gpu2.iLc.length && gpu2.iLb.length == gpu2.iLd.length);
        this.dON = gpu2;
        this.dOO = false;
        ffl ffl2 = (ffl)this.MessageDelegator.h(2577, this.getGUID(), lcr.acL);
        ffl2.iLb = gpu2.iLb;
        ffl2.iLc = gpu2.iLc;
        ffl2.iLd = gpu2.iLd;
        ffl2.iLa = gpu2.iLa;
        ffl2.iLe = gpu2.iLe;
        this.MessageDelegator.F(ffl2);
    }
}

