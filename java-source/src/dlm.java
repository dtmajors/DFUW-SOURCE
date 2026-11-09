/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cph
 *  lcr
 */
public class dlm
extends dlo {
    private coz gGk = null;
    private cph eRt = null;
    private boolean gGl = false;
    private boolean ctc = false;

    @Override
    public void bpx() {
        super.bpx();
    }

    @Override
    public void XZ() {
        super.XZ();
        this.eRt = null;
        this.gGk = null;
    }

    @Override
    protected void bN(int n, int n2) {
        ffy ffy2 = (ffy)this.MessageDelegator.h(8449, this.getGUID(), lcr.qBg);
        ffy2.jS(true);
        ffy2.c(this.csA.av());
        ffy2.a(this.csA.aw());
        ffy2.oF(this.getGUID());
        ffy2.GB(n);
        ffy2.sk(n2);
        int n3 = cox.st(n);
        if (n3 <= 0) {
            lfn.b(5, "SFGunStructure", "createStructure() ERROR IN GUNRESOURCETYPE");
            return;
        }
        assert (n3 > 0);
        ffy2.l(n3);
        this.MessageDelegator.F(ffy2);
    }

    @Override
    protected void y(cbx cbx2) {
        assert (cbx2 instanceof cph);
        if (this.gGk == null) {
            return;
        }
        this.gGk.gC(false);
        this.gGk.aSI();
        this.MessageDelegator.hd(this.gGk.getGUID());
        this.MessageDelegator.hd(this.eRt.getGUID());
        this.gGk = null;
        this.eRt = null;
    }

    @Override
    protected void bpC() {
        super.bpC();
        if (this.gGk == null) {
            lfn.b(5, "SFGunStructure", "notifyAnimationUpDone() GunServer == null");
            return;
        }
        if (this.eRt == null) {
            lfn.b(5, "SFGunStructure", "notifyAnimationUpDone() GunBase == null");
            return;
        }
        if (this.gGk.aAG() == null || this.eRt.aAG() == null) {
            lfn.b(5, "SFGunStructure", "notifyAnimationUpDone() MeshObjects null");
            return;
        }
        lgj lgj2 = new lgj(-1, new ljw(this.eRt.aAG().av()), this.eRt.aAG().aw(), true);
        this.gGk.a(lgj2, true);
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.gGk == null) {
            return;
        }
        if (this.eRt == null) {
            return;
        }
        if (this.gGl && this.eRt.aAG().isReadyToRun() && this.gGk.aAG().isReadyToRun()) {
            this.gGl = false;
            this.gGk.jv(this.eRt.getGUID());
            this.gGk.kW(this.eRt.aAG().axa());
            this.gGk.kV(this.eRt.aAG().getGUID());
            this.gGk.aSF();
            this.gGk.aSH();
            if (this.ctc) {
                lgj lgj2 = new lgj(-1, new ljw(this.eRt.aAG().av()), this.eRt.aAG().aw(), true);
                this.gGk.a(lgj2, true);
                this.ctc = false;
            }
            this.gGt = true;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 8451: {
                this.b((ffz)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void b(ffz ffz2) {
        if (ffz2.aVk() < 2) {
            assert (false);
            return;
        }
        if (ffz2.bOZ() == null || ffz2.bPa() == null) {
            lfn.b(5, "SFGunStructure", "handleGunCreateResponse() Gun or Base is NULL");
            this.gGt = true;
            return;
        }
        this.gGt = true;
        if (ffz2.aVk() == 3) {
            lfn.b(0, "SFBuildingStructure", "handleBuildingCreateResponse() ChaningStructureDamage");
            this.c(ffz2);
            return;
        }
        if (ffz2.aVk() == 2) {
            this.y((cbx)this.eRt);
            this.eRt = null;
            this.Qg = null;
            this.gGk = null;
        }
        assert (ffz2.bOZ().length == 1);
        assert (ffz2.bPa().length == 1);
        this.gGk = (coz)ffz2.bOZ()[0];
        this.eRt = ffz2.bPa()[0];
        this.gGk.aXp();
        this.eRt.aXp();
        this.gGk.a(this);
        this.Qg = this.eRt;
        if (ffz2.aVk() == 5) {
            this.bpH();
            this.ctc = true;
        } else {
            this.aSv();
        }
        if (ffz2.aVk() != 5) {
            this.a((cbx)this.eRt, 15.0f, ep.a.Pe);
        }
        ljq ljq2 = this.csA.av();
        this.gGk.aAG().a(new lgl(this.csA.aw()));
        ljq ljq3 = new ljq(ljq2);
        assert (this.gGk.aSK() != null);
        ljq3.es(this.gGk.aSK());
        this.gGk.aAG().c(ljq3);
        this.MessageDelegator.a((amf)((Object)this.gGk));
        if (ffz2.aVk() != 5) {
            this.a((cbx)this.gGk, 15.0f, ep.a.Pe);
        } else {
            this.eRt.Hy();
            this.bpK();
            this.gGk.jm().c(352, this.csA.Yd());
            this.c(this.Qg, this.csA.XM());
        }
        this.gGl = true;
    }

    @Override
    public void b(cbx cbx2) {
        assert (cbx2 == this.eRt || cbx2 == this.gGk);
        if (cbx2 == this.gGk) {
            super.b((cbx)this.eRt);
        } else {
            super.b((cbx)this.eRt);
        }
    }

    private void c(ffz ffz2) {
        super.z((cbx)ffz2.bPa()[0]);
        this.gGk = (coz)ffz2.bOZ()[0];
        this.eRt = ffz2.bPa()[0];
        this.gGl = true;
    }

    @Override
    public amm aIB() {
        return null;
    }
}

