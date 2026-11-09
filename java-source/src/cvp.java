/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 */
public class cvp
extends cvn {
    private boolean fzR = false;
    private boolean fzS = false;
    private ldv ade = null;
    private ldv fzT = null;
    private ldv fzU = null;
    private ldv Ud = null;

    public cvp(int n) {
        super(n, true);
    }

    public boolean bF(ljq ljq2) {
        if (this.fzP == null || ljq2 == null) {
            lfn.b(5, "SFBankSessionHandlerServer", "isTooFarAway() BankPosition=" + this.fzP + " Position=" + ljq2);
            assert (false);
            return true;
        }
        float f2 = Math.abs(this.fzP.ez(ljq2));
        float f3 = 11.0f;
        dbv dbv2 = null;
        dbv2 = lea.eoW().get(cug.fnx);
        if (dbv2 != null) {
            f3 = dbv2.gcA;
        }
        return f2 > f3;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4865: {
                this.a((gam)dxq2);
                break;
            }
            case 4879: {
                this.a((gbc)dxq2);
                break;
            }
            case 9989: {
                this.a((gnu)dxq2);
                break;
            }
            case 9990: {
                this.a((gns)dxq2);
                break;
            }
            case 13834: {
                this.a((eny)dxq2);
                break;
            }
            case 13852: {
                this.a((eka)dxq2);
                break;
            }
            case 25864: {
                this.bdt().receiveMessage(dxq2);
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
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void Ci() {
        assert (this.fEK == cwg.a.fEO);
        this.bcz();
    }

    private void bcz() {
        this.fEK = cwg.a.fEQ;
        if (this.fzR) {
            this.lS(this.dAv);
        }
        if (this.fzS) {
            this.lS(this.bdu());
        }
        if (this.fzO.bdm() && this.fzO.bdq() && this.fzO.bdl()) {
            this.bcA();
        }
        if (this.fzU != null && this.Ud != null) {
            this.CM();
        }
        this.fzO = null;
        this.dAv = null;
        this.fzP = null;
        this.ade = null;
        this.fzT = null;
        this.fzU = null;
        this.Ud = null;
        this.bdw();
    }

    private void a(eka eka2) {
        if (this.fEK == cwg.a.fEQ) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleClanBankAccessRemoveMessage() Bank session is already stopped.");
            return;
        }
        this.bcz();
    }

    private void a(eny eny2) {
        assert (this.dAv == null);
        assert (this.ade != null);
        if (eny2.iwb == null) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleClanVaultSessionResponse() ClanVaultGUID is null.");
            this.fzO = null;
            this.dAv = null;
            this.fzP = null;
            this.ade = null;
            this.bdw();
            return;
        }
        this.dAv = eny2.iwb;
        this.z(this.bdk().ib(), this.gO());
    }

    private void a(gam gam2) {
        assert (this.fEK == cwg.a.fEM);
        this.fzO = cwf.a.getBankType(gam2.jcI);
        if (this.fzO == null) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleSessionBeginBankMessage() BankTypeOrdinal is invalid.");
            return;
        }
        if (gam2.fzP == null) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleSessionBeginBankMessage() BankPosition is null.");
            return;
        }
        if (this.fzO.bdl()) {
            if (gam2.ade == null) {
                lfn.b(5, "SFBankSessionHandlerServer", "handleSessionBeginBankMessage() ClanGUID is null.");
                return;
            }
            if (this.fzO.bdm() && gam2.fzT == null) {
                lfn.b(5, "SFBankSessionHandlerServer", "handleSessionBeginBankMessage() BankAccessManagerGUID is null.");
                return;
            }
        } else if (this.fzO.bdn()) {
            if (gam2.dAv == null) {
                lfn.b(5, "SFBankSessionHandlerServer", "handleSessionBeginBankMessage() BankGUID is null.");
                return;
            }
        } else {
            if (gam2.dAv == null) {
                lfn.b(5, "SFBankSessionHandlerServer", "handleSessionBeginBankMessage() BankGUID is null.");
                return;
            }
            if (gam2.fzT == null) {
                lfn.b(5, "SFBankSessionHandlerServer", "handleSessionBeginBankMessage() BankAccessManagerGUID is null.");
                return;
            }
        }
        this.fEK = cwg.a.fEO;
        if (this.fzO.bdl()) {
            this.dAv = null;
            this.fzP = new ljq(gam2.fzP);
            this.ade = gam2.ade;
            this.fzT = gam2.fzT;
            this.bcB();
        } else if (this.fzO.bdn()) {
            this.dAv = gam2.dAv;
            this.fzP = new ljq(gam2.fzP);
            this.ade = null;
            this.fzT = null;
            this.z(this.bdk().ib(), this.gO());
        } else {
            this.dAv = gam2.dAv;
            this.fzP = new ljq(gam2.fzP);
            this.ade = null;
            this.fzT = gam2.fzT;
            this.fzU = gam2.fzU;
            this.z(this.bdk().ib(), this.gO());
            if (this.fzO.bdo()) {
                this.CL();
            }
        }
    }

    private void CL() {
        if (this.fzU == null) {
            lfn.b(5, "SFBankSessionHandlerServer", "sendSensorCreateRequest() BankMeshObjectGUID == NULL");
            assert (false);
            return;
        }
        if (!this.fzO.bdo()) {
            lfn.b(5, "SFBankSessionHandlerServer", "sendSensorCreateRequest() wrong bank type");
            assert (false);
            return;
        }
        ghi ghi2 = (ghi)this.MessageDelegator.h(513, this.GUID, this.fzU.bFk());
        ghi2.jhz = cvk.a.fzK.ordinal();
        ghi2.fzI = this.fzU;
        this.MessageDelegator.F(ghi2);
    }

    private void a(ghj ghj2) {
        if (this.Ud != null) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleSensorCreateResponse() There is already a sensor attached.");
            assert (false);
            return;
        }
        if (!this.fzO.bdo()) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleSensorCreateResponse() wrong bank type");
            assert (false);
            return;
        }
        if (ghj2.jhz < 0) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleSensorCreateResponse() SensorType is invalid.");
            assert (false);
            return;
        }
        if (ghj2.fzI == null) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleSensorCreateResponse() ObjectToSenseGUID is null.");
            assert (false);
            return;
        }
        if (ghj2.Ud == null) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleSensorCreateResponse() SensorGUID is null.");
            assert (false);
            return;
        }
        this.Ud = ghj2.Ud;
        if (this.fEK == cwg.a.fEQ) {
            this.CM();
            this.Ud = null;
        }
    }

    private void CM() {
        if (this.Ud == null) {
            lfn.b(5, "SFBankSessionHandlerServer", "sendSensorRemoveRequest() SensorGUID == NULL.");
            assert (false);
            return;
        }
        if (!this.fzO.bdo()) {
            lfn.b(5, "SFBankSessionHandlerServer", "sendSensorRemoveRequest() wrong bank type");
            assert (false);
            return;
        }
        ghr ghr2 = (ghr)this.MessageDelegator.h(515, this.GUID, this.Ud);
        ghr2.iBr = false;
        this.MessageDelegator.F(ghr2);
    }

    private void a(gho gho2) {
        if (this.fzO == null) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleSensorObjectPositionTriggeredMessage() Bank Type os NULL.");
            assert (false);
            return;
        }
        if (!this.fzO.bdo()) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleSensorObjectPositionTriggeredMessage() wrong bank type");
            assert (false);
            return;
        }
        if (gho2.Position == null) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleSensorObjectPositionTriggeredMessage() Position is null.");
            return;
        }
        this.fzP = gho2.Position;
    }

    private void a(ghq ghq2) {
        if (this.fzO == null) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleSensorObjectToSenseRemovedMessage() Bank Type is NULL.");
            assert (false);
            return;
        }
        if (!this.fzO.bdo()) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleSensorObjectToSenseRemovedMessage() wrong bank type");
            assert (false);
            return;
        }
        if (this.Ud == null) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleSensorObjectToSenseRemovedMessage() SensorGUID is null.");
            return;
        }
        if (!this.Ud.equals(ghq2.aO())) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleSensorObjectToSenseRemovedMessage() SensorGUID=" + this.Ud);
            lfn.b(5, "SFBankSessionHandlerServer", "handleSensorObjectToSenseRemovedMessage() Message.FromGUID=" + ghq2.aO());
            return;
        }
    }

    private void a(gbc gbc2) {
        ldv ldv2 = this.bdu();
        if (!gbc2.aO().equals(ldv2) && !gbc2.aO().equals(this.dAv)) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleSessionEndRequest() Message received from unknown object: " + gbc2.aO());
            lfn.b(5, "SFBankSessionHandlerServer", "handleSessionEndRequest() ClientSessionHandlerGUID=" + ldv2);
            lfn.b(5, "SFBankSessionHandlerServer", "handleSessionEndRequest() BankGUID=" + this.dAv);
            return;
        }
        if (this.fEK == cwg.a.fEQ) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleSessionEndRequest() Bank session is already stopped.");
            return;
        }
        this.bcz();
    }

    private void a(gns gns2) {
        if (this.dAv == null) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleStorageObjectAwaitingRemovalMessage() BankGUID is null.");
            return;
        }
        if (!this.dAv.equals(gns2.aO())) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleStorageObjectAwaitingRemovalMessage() BankGUID=" + this.dAv + " Message.FromGUID=" + gns2.aO());
            return;
        }
        this.bcz();
    }

    private void a(gnu gnu2) {
        assert (this.fzO != null);
        assert (this.dAv != null);
        assert (this.fzP != null);
        if (this.fzO.bdo()) assert (this.fzU != null);
        assert (!this.fzS);
        if (!gnu2.jns) {
            lfn.b(5, "SFBankSessionHandlerServer", "handleStorageSessionCreateResponse() StorageSession could not be created.");
            this.bcz();
            return;
        }
        this.fzS = true;
        gam gam2 = (gam)this.MessageDelegator.h(4865, this.GUID, this.bdk());
        gam2.aYH = this.aYH;
        gam2.jcI = this.fzO.ordinal();
        gam2.dAv = this.dAv;
        gam2.fzP = this.fzP;
        this.MessageDelegator.F(gam2);
        fte fte2 = (fte)this.MessageDelegator.h(30209, this.getGUID(), this.gO());
        fte2.ResourceType = cug.fnx;
        fte2.SkillType = cxd.fHm;
        this.MessageDelegator.I(fte2);
    }

    private void bcA() {
        assert (this.fzO != null);
        assert (this.fzO.bdl());
        assert (this.fzT != null);
        eka eka2 = (eka)this.MessageDelegator.h(13852, this.GUID, this.fzT);
        eka2.Tr = this.gO();
        this.MessageDelegator.F(eka2);
    }

    private void bcB() {
        assert (this.dAv == null);
        assert (this.ade != null);
        if (this.gO() == null) {
            this.fzO = null;
            this.dAv = null;
            this.fzP = null;
            this.ade = null;
            this.bdw();
            return;
        }
        bdj bdj2 = null;
        switch (this.fzO) {
            case fEd: {
                bdj2 = bdj.dak;
                break;
            }
            case fEe: {
                bdj2 = bdj.dal;
                break;
            }
            case fEf: {
                bdj2 = bdj.dam;
            }
        }
        if (bdj2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "sendClanVaultSessionRequest() : Failed to Determine Clan Vault Type from Bank Type!!!... Bank Type = " + (Object)((Object)this.fzO));
            assert (false);
            eny eny2 = (eny)this.MessageDelegator.h(13834, this.ade, this.GUID);
            eny2.iwb = null;
            this.MessageDelegator.F(eny2);
        } else {
            enx enx2 = (enx)this.MessageDelegator.h(13833, this.GUID, this.ade);
            enx2.oH(this.gO());
            enx2.e(bdj2);
            this.MessageDelegator.F(enx2);
        }
    }

    private void lS(ldv ldv2) {
        assert (this.fEK != cwg.a.fEM);
        assert (ldv2 != null);
        gbb gbb2 = (gbb)this.MessageDelegator.h(4878, this.GUID, ldv2);
        this.MessageDelegator.F(gbb2);
    }

    private void z(int n, ldv ldv2) {
        assert (this.dAv != null);
        assert (n > 0);
        assert (ldv2 != null);
        gnt gnt2 = (gnt)this.MessageDelegator.h(9988, this.GUID, this.dAv);
        gnt2.RB = n;
        gnt2.Tr = ldv2;
        this.MessageDelegator.F(gnt2);
        this.fzR = true;
    }
}

