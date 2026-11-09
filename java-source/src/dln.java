/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cph
 *  cug
 *  lcr
 */
public class dln
extends dlo {
    private static final double gGm = 30.0;
    private int gGn = -1;
    private coz gGk = null;
    private cph eRt = null;
    private boolean gGl = false;
    private boolean ctc = false;
    private fge gGo = null;

    public dln(int n) {
        this.gGn = n;
    }

    @Override
    protected void bN(int n, int n2) {
        if (n2 != 4 && n2 != 5) {
            assert (false) : "GunStructure does not support this tag : " + n2;
            return;
        }
        ffy ffy2 = (ffy)this.MessageDelegator.h(8449, this.getGUID(), lcr.qBg);
        ffy2.jS(true);
        ffy2.c(this.csA.av());
        ffy2.a(this.csA.aw());
        ffy2.oF(this.getGUID());
        ffy2.GB(n);
        ffy2.l(n2 == 5 ? this.gGn : -1);
        ffy2.sk(n2);
        this.MessageDelegator.F(ffy2);
    }

    private void b(ffz ffz2) {
        Object object;
        int n = ffz2.aVk();
        if (n != 4 && n != 5) {
            assert (false) : "GunStructure does not support this tag : " + n;
            return;
        }
        if (this.gGn > 0 && ffz2.bOZ() == null || ffz2.bPa() == null) {
            lfn.b(5, "SFGunStructure", "handleGunCreateResponse() Gun or Base is NULL");
            this.gGt = true;
            return;
        }
        this.gGt = true;
        if (ffz2.bPa().length != 1) {
            assert (false);
            return;
        }
        if (this.gGn > 0 && ffz2.bOZ().length != 1) {
            assert (false);
            return;
        }
        if (ffz2.bOZ()[0] != null) {
            this.gGk = (coz)ffz2.bOZ()[0];
        }
        this.eRt = ffz2.bPa()[0];
        this.eRt.a((btn)this);
        if (this.gGk != null) {
            this.gGk.aXp();
            this.gGk.a(this);
        }
        this.eRt.aXp();
        this.Qg = this.eRt;
        if (ffz2.aVk() == 5) {
            this.bpH();
            this.ctc = true;
        } else {
            this.aSv();
            this.a((cbx)this.eRt, 15.0f, ep.a.Pe);
        }
        if (this.gGk != null) {
            assert (this.gGk.aSK() != null);
            object = this.csA.av();
            ljq ljq2 = new ljq((ljq)object);
            this.gGk.aAG().a(new lgl(this.csA.aw()));
            ljq2.es(this.gGk.aSK());
            this.gGk.aAG().c(ljq2);
            this.MessageDelegator.a((amf)((Object)this.gGk));
        }
        if (ffz2.aVk() == 4) {
            if (this.gGk != null) {
                this.a((cbx)this.gGk, 15.0f, ep.a.Pe);
            }
        } else {
            this.eRt.Hy();
            this.bpK();
            if (this.gGk != null) {
                object = (et)this.eRt.fi().ae(352);
                this.gGk.jm().c(352, ((et)object).fN());
            }
            this.c(this.Qg, this.csA.XM());
        }
        this.gGl = true;
    }

    private void a(fge fge2) {
        Cloneable cloneable;
        if (this.gGo != null) {
            this.A(2, fge2.aO());
            return;
        }
        ldv ldv2 = this.XQ().Xw();
        if (fge2.ade == null || !fge2.ade.equals(ldv2)) {
            this.A(6, fge2.aO());
            return;
        }
        if (this.gGk != null) {
            cloneable = this.gGk.aXq();
            if (cloneable != null) {
                this.A(8, fge2.aO());
                return;
            }
            if (this.gGk.az() == fge2.iLr) {
                this.A(10, fge2.aO());
                return;
            }
        }
        if (this.bpD()) {
            cloneable = (fdt)this.MessageDelegator.h(9250, this.GUID, fge2.afF);
            ((fde)cloneable).sk(fge2.aVk());
            ((fdt)cloneable).kU(true);
            ((fdt)cloneable).cz(30.0);
            ((dxq)cloneable).jM(true);
            this.MessageDelegator.F((dxq)cloneable);
            this.gGo = fge2;
            if (this.gGk != null) {
                this.gGk.gE(true);
            }
            return;
        }
        this.A(1, fge2.aO());
    }

    private void a(fdu fdu2) {
        Cloneable cloneable;
        if (this.gGo == null) {
            lfn.b(5, "SFGunStructureNew", "handleFunctionUseObjectDelayResponseMessage() Request message is null.");
            assert (false);
            return;
        }
        int n = fdu2.aVk();
        if (n != this.gGo.aVk()) {
            lfn.b(5, "SFGunStructureNew", "handleFunctionUseObjectDelayResponseMessage() MessageTag : " + n + " HeadCreateRequestMessage.MessageTag : " + this.gGo.aVk());
            assert (false);
            return;
        }
        if (!fdu2.bOA()) {
            this.A(7, this.gGo.aO());
            this.gGo = null;
            if (this.gGk != null) {
                this.gGk.gE(false);
            }
            return;
        }
        if (this.gGk != null && (cloneable = this.gGk.aXq()) != null) {
            lfn.b(5, "SFGunStructureNew", "handleFunctionUseObjectDelayResponseMessage() Player : " + cloneable + " is attached on the cannon although it can not happen :-p");
            this.A(8, fdu2.aO());
            this.gGo = null;
            this.gGk.gE(false);
            assert (false);
            return;
        }
        if (this.bpD()) {
            cloneable = (fne)this.MessageDelegator.h(7981, this.getGUID(), this.gGo.Ri);
            ((fne)cloneable).ResourceType = cug.fqf;
            ((fne)cloneable).asi = 3;
            ((fmm)cloneable).sk(fdu2.aVk());
            ((dxq)cloneable).jM(true);
            ((fne)cloneable).b(bqy.dHw);
            this.MessageDelegator.F((dxq)cloneable);
            return;
        }
        this.A(1, this.gGo.aO());
    }

    private void a(fnf fnf2) {
        Cloneable cloneable;
        if (this.gGo == null) {
            lfn.b(5, "SFGunStructureNew", "handleInventoryResourceRemoveResponseMessage() Request message is null.");
            assert (false);
            return;
        }
        int n = fnf2.aVk();
        if (n != this.gGo.aVk()) {
            lfn.b(5, "SFGunStructureNew", "handleInventoryResourceRemoveResponseMessage() MessageTag : " + n + " HeadCreateRequestMessage.MessageTag : " + this.gGo.aVk());
            assert (false);
            return;
        }
        if (!fnf2.iQM) {
            this.A(4, this.gGo.aO());
            this.gGo = null;
            if (this.gGk != null) {
                this.gGk.gE(false);
            }
            return;
        }
        if (this.gGk != null && (cloneable = this.gGk.aXq()) != null) {
            lfn.b(5, "SFGunStructureNew", "handleInventoryResourceRemoveResponseMessage() Player : " + cloneable + " is attached on the cannon although it can not happen :-p");
            this.A(8, fnf2.aO());
            this.gGo = null;
            this.gGk.gE(false);
            assert (false);
            return;
        }
        if (this.bpD()) {
            cloneable = (ffw)this.MessageDelegator.h(8455, this.getGUID(), lcr.qBg);
            ((ffw)cloneable).eRt = this.eRt;
            ((ffw)cloneable).iLr = this.gGo.iLr;
            ((ffw)cloneable).ikP = true;
            ((ffw)cloneable).ilU = this.getGUID();
            ((dxq)cloneable).jM(true);
            this.MessageDelegator.F((dxq)cloneable);
            return;
        }
        this.A(1, this.gGo.aO());
        this.gGo = null;
        if (this.gGk != null) {
            this.gGk.gE(false);
        }
    }

    private void a(ffx ffx2) {
        Object object;
        if (this.gGo == null) {
            lfn.b(5, "SFGunStructureNew", "handleGunCreateHeadResponseMessage() Request message is null.");
            assert (false);
            return;
        }
        if (!this.bpD()) {
            this.A(1, this.gGo.aO());
            this.gGo = null;
            if (this.gGk != null) {
                this.gGk.gE(false);
            }
            return;
        }
        if (this.gGk != null && (object = this.gGk.aXq()) != null) {
            lfn.b(5, "SFGunStructureNew", "handleGunCreateHeadResponseMessage() Player : " + (Object)object + " is attached on the cannon although it can not happen :-p");
            this.A(8, ffx2.aO());
            this.gGo = null;
            this.gGk.gE(false);
            assert (false);
            return;
        }
        object = ffx2.bOU();
        if (object == null) {
            this.A(3, this.gGo.aO());
            this.gGo = null;
            if (this.gGk != null) {
                this.gGk.gE(false);
            }
            return;
        }
        if (this.gGk != null) {
            this.gGk.gC(false);
            this.gGk.aSI();
            this.MessageDelegator.hd(this.gGk.getGUID());
            this.gGk = null;
        }
        this.gGk = object;
        ljq ljq2 = this.csA.av();
        ljq ljq3 = new ljq(ljq2);
        this.gGk.aAG().a(new lgl(this.csA.aw()));
        this.gGk.aAG().c(ljq3);
        this.gGk.aXp();
        this.gGk.a(this);
        this.gGn = this.gGk.az();
        this.XL().iC(this.gGn);
        et et2 = (et)this.eRt.fi().ae(352);
        this.gGk.jm().c(352, et2.fN());
        this.MessageDelegator.a((amf)((Object)this.gGk));
    }

    @Override
    protected void y(cbx cbx2) {
        assert (cbx2 instanceof cph);
        if (this.gGk != null) {
            this.gGk.gC(false);
            this.gGk.aSI();
            this.MessageDelegator.hd(this.gGk.getGUID());
            this.gGk = null;
        }
        this.MessageDelegator.hd(this.eRt.getGUID());
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
        if (this.gGl && this.eRt.aAG().isReadyToRun() && (this.gGk == null || this.gGk.aAG().isReadyToRun())) {
            this.gGl = false;
            if (this.gGk != null) {
                this.gGk.jv(this.eRt.getGUID());
                this.gGk.kW(this.eRt.aAG().axa());
                this.gGk.kV(this.eRt.aAG().getGUID());
                this.gGk.aSF();
                this.gGk.aSH();
            }
            if (this.ctc) {
                lgj lgj2 = new lgj(-1, new ljw(this.eRt.aAG().av()), this.eRt.aAG().aw(), true);
                if (this.gGk != null) {
                    this.gGk.a(lgj2, true);
                }
                this.ctc = false;
            }
            this.gGt = true;
        }
        if (this.gGo != null && this.gGk != null && this.gGk.aAG().isReadyToRun() && !this.gGk.aWF()) {
            this.gGk.jv(this.eRt.getGUID());
            this.gGk.kW(this.eRt.aAG().axa());
            this.gGk.kV(this.eRt.aAG().getGUID());
            this.gGk.aSF();
            this.A(5, this.gGo.aO());
            this.gGo = null;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 8451: {
                this.b((ffz)dxq2);
                break;
            }
            case 8456: {
                this.a((ffx)dxq2);
                break;
            }
            case 7982: {
                this.a((fnf)dxq2);
                break;
            }
            case 9251: {
                this.a((fdu)dxq2);
                break;
            }
            case 11034: {
                this.h((gre)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void h(gre gre2) {
        if (this.gGo != null) {
            this.A(3, this.gGo.aO());
            this.gGo = null;
            if (this.gGk != null) {
                this.gGk.gE(false);
            }
        }
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

    private void A(int n, ldv ldv2) {
        fgf fgf2 = (fgf)this.MessageDelegator.h(8454, this.getGUID(), ldv2);
        fgf2.DR(n);
        this.MessageDelegator.F(fgf2);
    }

    @Override
    public boolean a(dxq dxq2, btk btk2) {
        switch (dxq2.bEz()) {
            case 8453: {
                return true;
            }
        }
        return false;
    }

    private boolean bpD() {
        if (this.eRt == null) {
            return false;
        }
        if (!this.isActive()) {
            return false;
        }
        if (this.isCleanedUp()) {
            return false;
        }
        if (!this.aAE()) {
            return false;
        }
        if (!this.isEnabled()) {
            return false;
        }
        if (!this.isInitialized()) {
            return false;
        }
        if (!this.isReadyToRun()) {
            return false;
        }
        return !this.isScheduledForRemoval();
    }

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
    public amm aIB() {
        return null;
    }
}

