/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
public class cmo
extends cml
implements bto {
    private static final String TC = "SFResourceMonolithServer";
    private bsx bBe = null;
    private float eLf = 0.0f;
    private float Radius = 0.0f;
    private ljq Position = null;
    private float eLg = 0.0f;
    private float eLh = 0.0f;
    private float eLi = 0.0f;
    private float eLj = 0.0f;
    private cmp eLk = cmp.eLs;
    private double eLl = 0.0;
    private double eLm = 0.0;
    private double eLn = 0.0;
    private double bEO = 0.0;
    private boolean avz = false;
    private ldv bBE = null;
    private ldv Ud = null;
    private fum eLo = null;
    private boolean eLp = false;
    private String eHA = null;
    private ldv aUa = null;
    private cmk eLq = new cmk();

    public cmo() {
        super(true);
    }

    public void b(bsx bsx2) {
        this.aIw();
        this.bBe = bsx2;
        this.eLf = ((Float)this.bBe.getValue("NotificationAreaMultiplier")).floatValue();
        this.Radius = ((Float)this.bBe.getValue("Radius")).floatValue();
        this.Position = (ljq)this.bBe.getValue("Position");
        this.eLg = ((Float)this.bBe.getValue("DelayTimer")).floatValue();
        this.eLh = ((Float)this.bBe.getValue("ActionTimer")).floatValue();
        this.eLi = ((Float)this.bBe.getValue("OutOfRangeTimer")).floatValue();
        this.eLj = ((Float)this.bBe.getValue("ActivatedTimer")).floatValue();
        this.eLk = cmp.valueOf(((String)this.bBe.getValue("Type")).toUpperCase());
        this.eHA = this.aIy();
        this.gt(true);
        this.aTp();
    }

    private void aTp() {
        lfn.b(5, TC, "sendCreateListenerRequest() Send a request to register a listener with : " + lcr.qAU);
        gbv gbv2 = (gbv)this.MessageDelegator.h(28673, this.getGUID(), lcr.qAU);
        gbv2.TileID = lcw.dZ((ljq)this.aAG().azb());
        this.MessageDelegator.F(gbv2);
    }

    public void cleanUp() {
        super.cleanUp();
        this.HR();
        this.eLq.cleanUp();
        if (this.aUa != null) {
            this.uZ();
        }
        this.eLo = null;
        this.bBE = null;
    }

    private void a(fum fum2) {
        if (fum2.diQ == null) {
            lfn.b(5, TC, "handleObjectUseSkillTriggeredOnMessage() RequestedPSOGuid is NULL!!");
            assert (false);
            return;
        }
        if (!this.isEnabled()) {
            lfn.b(5, TC, "handleObjectUseSkillTriggeredOnMessage() Hill Fortress is not enabled!!");
            this.c(mbw.uom.bD(new Object[0]), fum2.diQ);
            return;
        }
        if (this.eLo != null) {
            lfn.b(5, TC, "handleObjectUseSkillTriggeredOnMessage() There is already a pending process from player with guid " + this.eLo.diQ);
            this.c(mbw.uon.bD(new Object[0]), fum2.diQ);
            return;
        }
        if (this.eLq.Ri != null) {
            lfn.b(5, TC, "handleObjectUseSkillTriggeredOnMessage() There is already an owner with guid " + this.eLq.Ri);
            if (this.eLq.Ri.equals(fum2.diQ)) {
                this.c(mbw.uop.bD(new Object[0]), fum2.diQ);
            } else {
                this.c(mbw.scN.bD(new Object[0]), fum2.diQ);
            }
            return;
        }
        this.eLo = fum2;
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), this.eLo.diQ);
        eef2.jM(true);
        this.MessageDelegator.F(eef2);
    }

    private void a(eeg eeg2) {
        if (this.eLo == null) {
            lfn.b(5, TC, "handleCharacterNamedPropertiesResponseMessage() There is no pending request!!");
            assert (false);
            return;
        }
        if (!this.isEnabled()) {
            lfn.b(5, TC, "handleCharacterNamedPropertiesResponseMessage() Hill Fortress is not enabled!!");
            this.c(mbw.uom.bD(new Object[0]), this.eLo.diQ);
            this.eLo = null;
            return;
        }
        if (!eeg2.qf()) {
            lfn.b(5, TC, "handleCharacterNamedPropertiesResponseMessage() Player " + this.eLo.diQ + " is not online anymore!!");
            this.eLo = null;
            return;
        }
        this.eLq.FirstName = eeg2.iP();
        this.eLq.LastName = eeg2.iR();
        this.eLq.hC = eeg2.aP();
        fut fut2 = (fut)this.MessageDelegator.h(5635, this.GUID, this.eLo.diQ);
        fut2.jM(true);
        fut2.Ib(2);
        this.MessageDelegator.F(fut2);
    }

    private void a(fuu fuu2) {
        if (this.eLo == null) {
            lfn.b(5, TC, "handleObjectInfoGUIDResponse() There is no pending request!!");
            assert (false);
            return;
        }
        if (!this.isEnabled()) {
            lfn.b(5, TC, "handleObjectInfoGUIDResponse() Hill Fortress is not enabled!!");
            this.c(mbw.uom.bD(new Object[0]), this.eLo.diQ);
            this.eLo = null;
            this.eLq.cleanUp();
            return;
        }
        if (fuu2.Ui == null) {
            lfn.b(5, TC, "handleObjectInfoGUIDResponse() MeshObjectGUID == null");
            this.c(mbw.uoq.bD(new Object[0]), this.eLo.diQ);
            this.eLo = null;
            this.eLq.cleanUp();
            return;
        }
        this.eLq.bRN = fuu2.Ui;
        fdt fdt2 = (fdt)this.MessageDelegator.h(9250, this.GUID, this.eLq.hC);
        fdt2.kU(true);
        fdt2.cz(this.eLg);
        fdt2.jM(true);
        this.MessageDelegator.F(fdt2);
    }

    private void a(fdu fdu2) {
        if (this.eLo == null) {
            lfn.b(5, TC, "handleFunctionUseObjectDelayResponseMessage() There is no pending request!!");
            assert (false);
            return;
        }
        if (!this.isEnabled()) {
            lfn.b(5, TC, "handleFunctionUseObjectDelayResponseMessage() Hill Fortress is not enabled!!");
            this.c(mbw.uom.bD(new Object[0]), this.eLo.diQ);
            this.eLo = null;
            return;
        }
        if (!fdu2.bOA()) {
            lfn.b(5, TC, "handleObjectUseSkillTriggeredOnMessage() Player with guid " + this.eLo.diQ + " failed to conquer the fortress");
            this.c(mbw.uoq.bD(new Object[0]), this.eLo.diQ);
            this.eLo = null;
            return;
        }
        this.HN();
    }

    private void HN() {
        if (this.Ud != null) {
            assert (false);
            return;
        }
        kou kou2 = (kou)this.MessageDelegator.h(534);
        kou2.pTa = true;
        kou2.pUN = true;
        kou2.pUO = false;
        kou2.ec = this.GUID;
        kou2.iBr = true;
        kou2.dsK = true;
        kou2.Ud = ldv.rfe;
        kou2.pUL = 0;
        kou2.dtg = (float)arw.e(1.0, 2.0);
        kou2.pUM = this.Radius;
        kou2.pTs = this.Position;
        this.bBE = kou2.GUID;
        this.MessageDelegator.a(kou2);
    }

    private void a(kwr kwr2) {
        if (this.bBE != null && this.bBE.equals(kwr2.ev)) {
            if (this.eLo == null) {
                lfn.b(5, TC, "handleSensorResponse() There is no pending request!!");
                assert (false);
                return;
            }
            if (!this.isEnabled()) {
                lfn.b(5, TC, "handleSensorResponse() Hill Fortress is not enabled!!");
                this.c(mbw.uom.bD(new Object[0]), this.eLo.diQ);
                this.clearState();
                return;
            }
            double d2 = this.MessageDelegator.arc().rgz;
            this.Ud = kwr2.dJs;
            this.eLq.Ri = this.eLo.diQ;
            this.eLo = null;
            this.eLm = d2;
            this.bEO = d2;
            this.eLl = d2;
            this.fi().f(1280, true);
            this.nc(del.dr(lea.epp().aTm()));
            this.a(mbw.uoo.bD(this.eLq.getFullName()), this.Position, this.Radius * this.eLf);
        } else assert (false);
    }

    private void a(kws kws2) {
        if (!this.isEnabled()) {
            lfn.b(5, TC, "handleSphereSensorObjectResponse() Hill Fortress is not enabled anymore!!!");
            return;
        }
        if (this.eLq.Ri == null) {
            lfn.b(5, TC, "handleSphereSensorObjectResponse() There is no owner!!!");
            return;
        }
        ldv[] ldvArray = kws2.qfR;
        ldv[] ldvArray2 = kws2.qfT;
        if (ldvArray2 != null && ldvArray2.length > 0) {
            for (ldv ldv2 : ldvArray2) {
                if (!ldv2.equals(this.eLq.bRN)) continue;
                this.c(mbw.uos.bD(new Object[0]), this.eLq.Ri);
                this.eLn = this.MessageDelegator.arc().rgz;
                break;
            }
        }
        if (ldvArray != null && ldvArray.length > 0) {
            for (ldv ldv2 : ldvArray) {
                if (!ldv2.equals(this.eLq.bRN) || !(this.eLn > 0.0)) continue;
                this.eLn = 0.0;
                this.c(mbw.uot.bD(new Object[0]), this.eLq.Ri);
                break;
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.avz) {
            return;
        }
        if (this.eLq.Ri == null) {
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz;
        if (this.eLn > 0.0 && d2 > this.eLn + (double)this.eLi) {
            this.c(mbw.uou.bD(new Object[0]), this.eLq.Ri);
            this.clearState();
            if (this.eLp) {
                lfn.b(5, TC, "doTick() There is a shutdown request!!!");
                this.avz = false;
                this.gt(true);
            }
            return;
        }
        if (d2 > this.eLm + (double)this.eLj) {
            this.c(mbw.uov.bD(new Object[0]), this.eLq.Ri);
            this.clearState();
            if (this.eLp) {
                lfn.b(5, TC, "doTick() There is a shutdown request!!!");
                this.avz = false;
                this.gt(true);
            }
            return;
        }
        if (d2 > this.bEO + (double)this.eLh) {
            this.bEO = d2;
            switch (this.eLk) {
                case eLs: {
                    this.aTq();
                    break;
                }
                case eLu: {
                    this.aTr();
                    break;
                }
                case eLt: {
                    this.aTs();
                    break;
                }
                default: {
                    assert (false);
                    break;
                }
            }
        }
    }

    private void aTq() {
        float f = lgp.erA().nextFloat();
        cmn.a a2 = lea.epp().eC(f);
        if (a2 == null) {
            lfn.b(5, TC, "rewardOwner() HarvestingItem is null.");
            return;
        }
        fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.getGUID(), this.eLq.Ri);
        fmz2.bqd = new int[]{a2.az()};
        fmz2.iIY = new int[]{a2.vf()};
        fmz2.iQG = null;
        fmz2.iQH = f < lea.epp().aTl();
        fmz2.b(bqy.dGP);
        this.MessageDelegator.F(fmz2);
        if (fmz2.iQH) {
            this.c(mbw.uox.bD(a2.vf(), a2.az()), this.eLq.Ri);
        } else {
            this.c(mbw.uow.bD(a2.vf(), a2.az()), this.eLq.Ri);
        }
    }

    private void aTr() {
        assert (false) : "Not in use";
    }

    private void aTs() {
        assert (false) : "Not in use";
    }

    private void a(feb feb2) {
        this.shutDown(feb2.iKs);
    }

    private void a(fec fec2) {
        this.open();
    }

    private void shutDown(boolean bl) {
        if (bl) {
            this.avz = false;
            this.gt(true);
            this.clearState();
            return;
        }
        if (this.eLp) {
            return;
        }
        if (!this.avz) {
            return;
        }
        if (this.eLq.Ri != null) {
            this.eLp = true;
            return;
        }
        this.avz = false;
        this.gt(true);
    }

    private void open() {
        if (this.avz) {
            return;
        }
        this.eLp = false;
        this.avz = true;
        this.gt(false);
    }

    private void clearState() {
        this.fi().f(1280, false);
        this.HR();
        this.eLq.cleanUp();
        if (this.aUa != null) {
            this.uZ();
        }
        this.eLo = null;
        this.eLm = 0.0;
        this.eLn = 0.0;
        this.bEO = 0.0;
        this.eLp = false;
        this.bBE = null;
    }

    private void nc(int n) {
        if (this.aUa != null) {
            assert (false);
            return;
        }
        this.aUa = this.MessageDelegator.lL(lcr.qEb);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEb);
        glh2.SpecialEffectType = n;
        glh2.aUa = this.aUa;
        glh2.akX = this.eLq.bRN;
        glh2.aZD = new ljq();
        this.MessageDelegator.F(glh2);
    }

    private void uZ() {
        if (this.aUa == null) {
            assert (false);
            return;
        }
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.getGUID(), lcr.qEb);
        glj2.aUa = this.aUa;
        glj2.jkV = 1;
        this.MessageDelegator.F(glj2);
        this.aUa = null;
    }

    private void gt(boolean bl) {
    }

    public void receiveResponse(ktv ktv2) {
        if (ktv2.getResult() != 0) {
            lfn.b(5, TC, "receiveResponse() Response is not OK: " + ktv2);
            return;
        }
        switch (ktv2.egT()) {
            case 532: {
                this.a((kws)ktv2);
                break;
            }
            case 512: {
                this.a((kwr)ktv2);
                break;
            }
            default: {
                lfn.b(5, TC, "receiveResponse() Cannot handle: " + ktv2);
                super.receiveResponse(ktv2);
            }
        }
    }

    private void HR() {
        if (this.Ud != null) {
            kov kov2 = (kov)this.MessageDelegator.h(535);
            kov2.wD(false);
            kov2.ts(this.GUID);
            kov2.sy(this.Ud);
            this.MessageDelegator.a(kov2);
            this.Ud = null;
        }
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1046: {
                this.a((fum)dxq2);
                break;
            }
            case 9251: {
                this.a((fdu)dxq2);
                break;
            }
            case 12812: {
                this.a((eeg)dxq2);
                break;
            }
            case 5636: {
                this.a((fuu)dxq2);
                break;
            }
            case 11034: {
                this.handleSystemMessageSendingErrorMessage((gre)dxq2);
                break;
            }
            case 27908: {
                this.a((feb)dxq2);
                break;
            }
            case 27909: {
                this.a((fec)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void handleSystemMessageSendingErrorMessage(gre gre2) {
        if (!this.avz) {
            return;
        }
        int n = gre2.jqc;
        switch (n) {
            case 5635: 
            case 9250: 
            case 12811: {
                this.eLo = null;
                this.eLq.cleanUp();
            }
        }
    }

    private void c(loz loz2, ldv ldv2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private void a(loz loz2, ljq ljq2, float f) {
        fgh fgh2 = (fgh)this.MessageDelegator.h(29448, this.GUID, lcr.qAL);
        fgh2.r(loz2);
        fgh2.c(ljq2);
        fgh2.setRadius(f);
        this.MessageDelegator.F(fgh2);
    }

    public boolean isEnabled() {
        return this.avz && !this.eLp;
    }
}

