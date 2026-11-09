/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class dli
extends dlk {
    private gor gFP = null;
    private ldv duu = null;
    private ldv duv = null;
    private final float gFQ = 10.0f;
    private final double gFR = 5.0;
    private int bRk;
    final String bhD;
    private String gFS;

    public dli(String string) {
        this.bhD = string;
    }

    @Override
    public boolean a(dxq dxq2, btk btk2) {
        switch (dxq2.bEz()) {
            case 33537: {
                this.b((gor)dxq2);
                return true;
            }
        }
        return super.a(dxq2, btk2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 33537: {
                this.b((gor)dxq2);
                break;
            }
            case 33538: {
                this.a((gos)dxq2);
                break;
            }
            case 33541: {
                this.a((goo)dxq2);
                break;
            }
            case 12812: {
                this.a((eeg)dxq2);
                break;
            }
            case 9251: {
                this.a((fdu)dxq2);
                break;
            }
            case 514: {
                this.a((ghj)dxq2);
                break;
            }
            case 518: {
                this.a((gho)dxq2);
                break;
            }
            case 520: {
                this.a((ghq)dxq2);
                break;
            }
            case 11034: {
                this.c((gre)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fdu fdu2) {
        if (fdu2.bOA()) {
            this.bpu();
        } else {
            this.J(this.gFP.YN, true);
            this.il(true);
        }
    }

    private void a(goo goo2) {
        if (!goo2.jer) {
            lfn.b(5, this.getClass().getSimpleName(), "***handleSummoningRitualAltarWindowResponse window returned error");
            this.il(true);
        } else {
            this.mP(this.gFP.YN);
            this.bpt();
            this.gFS = goo2.joh;
        }
    }

    private void c(gre gre2) {
        switch (gre2.jqc) {
            case 513: {
                if (gre2.iHL == 4) {
                    return;
                }
                lfn.b(5, this.getClass().getSimpleName(), "error sending SFSENSOR_CREATE_REQUEST_MESSAGE message");
                this.il(false);
                break;
            }
            case 12811: {
                lfn.b(5, this.getClass().getSimpleName(), "error sending SFCHARACTER_NAMED_PROPERTIES_REQUEST_MESSAGE message");
            }
        }
    }

    private void a(gos gos2) {
        if (gos2.jer) {
            this.b(gos2);
            this.J(this.gFP.YN, true);
        } else {
            lfn.b(5, this.getClass().getSimpleName(), "Failed to start summoning ritual to spawnpoint '" + gos2.gGR + "'");
            this.J(this.gFP.YN, false);
        }
        this.il(false);
    }

    private void b(gos gos2) {
    }

    public void a(ghq ghq2) {
        if (this.duv == null && this.duu == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleSensorObjectToSenseRemovedMessage() There are no sensors active.");
            return;
        }
        if (this.duv != null && !this.duv.equals(ghq2.aO()) && this.duu != null && !this.duu.equals(ghq2.aO())) {
            lfn.b(5, this.getClass().getSimpleName(), "handleSensorObjectToSenseRemovedMessage() LifeSensorGUID     = " + this.duv);
            lfn.b(5, this.getClass().getSimpleName(), "handleSensorObjectToSenseRemovedMessage() PositionSensorGUID = " + this.duu);
            lfn.b(5, this.getClass().getSimpleName(), "handleSensorObjectToSenseRemovedMessage() SensorGUID         = " + ghq2.aO());
        }
        this.il(true);
    }

    private void il(boolean bl) {
        if (bl) {
            // empty if block
        }
        this.arC();
        this.gFP = null;
        this.gFS = null;
    }

    private void mO(ldv ldv2) {
        assert (this.duv == null);
        assert (this.duu == null);
        ghi ghi2 = (ghi)this.MessageDelegator.h(513, this.GUID, ldv2.bFk());
        ghi2.jhz = cvk.a.fzJ.ordinal();
        ghi2.hsP = true;
        ghi2.fzI = ldv2;
        this.MessageDelegator.F(ghi2);
        ghi ghi3 = (ghi)this.MessageDelegator.h(513, this.GUID, ldv2.bFk());
        ghi3.jhz = cvk.a.fzK.ordinal();
        ghi3.fzI = ldv2;
        ghi3.hsP = true;
        this.MessageDelegator.F(ghi3);
    }

    private void arC() {
        ghr ghr2;
        if (this.duv != null) {
            ghr2 = (ghr)this.MessageDelegator.h(515, this.getGUID(), this.duv);
            ghr2.iBr = false;
            this.MessageDelegator.F(ghr2);
            this.duv = null;
        }
        if (this.duu != null) {
            ghr2 = (ghr)this.MessageDelegator.h(515, this.getGUID(), this.duu);
            ghr2.iBr = false;
            this.MessageDelegator.F(ghr2);
            this.duu = null;
        }
    }

    private void a(gho gho2) {
        if (gho2.Position == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleSensorObjectPositionTriggeredMessage() Player target position is NULL.");
            return;
        }
        assert (this.gFP != null);
        if (this.aze().aAG().azb().ez(gho2.Position) > 10.0f) {
            this.il(true);
        }
    }

    private void a(ghj ghj2) {
        if (ghj2.Ud == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleSensorCreateResponse() SensorGUID is NULL.");
            this.il(false);
            return;
        }
        if (ghj2.fzI == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleSensorCreateResponse() ObjectToSenseGUID is NULL.");
            this.il(false);
            return;
        }
        cvk.a a2 = cvk.a.getSensorType(ghj2.jhz);
        switch (a2) {
            case fzJ: {
                assert (this.duv == null);
                this.duv = ghj2.Ud;
                break;
            }
            case fzK: {
                assert (this.duu == null);
                this.duu = ghj2.Ud;
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleSensorCreateResponse() invalid type of sensor received for Clan Altar " + this.getGUID());
                this.il(false);
                return;
            }
        }
        if (this.duv != null && this.duu != null) {
            this.im(true);
        }
    }

    private void im(boolean bl) {
        assert (this.gFP != null);
        ldv ldv2 = new ldv(this.gFP.ewK, lcr.acL.enw(), lcr.acL.enx());
        gon gon2 = (gon)this.MessageDelegator.h(33540, this.GUID, ldv2);
        gon2.jog = bl;
        gon2.YN = this.gFP.YN;
        gon2.dOz = this.gFP.dOz;
        gon2.gGQ = this.bhD;
        this.MessageDelegator.F(gon2);
    }

    private void bpt() {
        fdt fdt2 = (fdt)this.MessageDelegator.h(9250, this.GUID, this.gFP.YN);
        fdt2.kU(true);
        fdt2.cz(5.0);
        fdt2.kT(true);
        this.MessageDelegator.F(fdt2);
    }

    private void b(gor gor2) {
        lfn.b(0, this.getClass().getSimpleName(), "***handleSummoningRitualSpawnpointRequest");
        if (this.gFP != null) {
            return;
        }
        dls dls2 = lea.epP().get(this.bhD);
        if (dls2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "***handleSummoningRitualSpawnpointRequest: no altar '" + this.bhD + "' defined");
            return;
        }
        String string = dls2.gGR;
        if (string == null || "".equals(string)) {
            lfn.b(5, this.getClass().getSimpleName(), "***handleSummoningRitualSpawnpointRequest: altar '" + this.bhD + "' has no spawnpoint name defined");
            return;
        }
        this.gFP = gor2;
        this.gFP.gGR = string;
        ldv ldv2 = lcr.tQ((ldv)gor2.YN);
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.GUID, ldv2);
        eef2.aqs = this.bRk++;
        eef2.hsP = true;
        this.MessageDelegator.F(eef2);
    }

    private void a(eeg eeg2) {
        if (this.gFP == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleCharacterNamedPropertiesResponseMessage() : No request found for character named properties!");
            assert (false);
            return;
        }
        if (eeg2.iG() != null && eeg2.iG().equals(this.XQ().Xw())) {
            this.mO(this.gFP.dOz);
        } else {
            lfn.b(5, this.getClass().getSimpleName(), "***player has no access to this altar!!!");
        }
    }

    private void bpu() {
        gor gor2 = (gor)this.gFP.clone();
        gor2.f(this.GUID);
        gor2.on(lcr.qCm);
        gor2.bfX = this.gFS;
        this.MessageDelegator.F(gor2);
    }

    private void mP(ldv ldv2) {
    }

    private void J(ldv ldv2, boolean bl) {
    }
}

