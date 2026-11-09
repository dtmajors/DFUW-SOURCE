/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cug
 *  lcr
 *  lcw
 */
public class cwm
extends cwk {
    private boolean fFk = false;
    private ldv fFl = null;
    private ldv fFm = null;
    private ldv atv = null;
    private cnj fFn = null;
    private boolean eNH = false;
    private ljq fFo = null;
    private int fFp = 0;
    private ldv Ui = null;
    private ldv Ud = null;
    private ljq fFq = null;
    private boolean fFr = false;
    private boolean fFs = false;
    private boolean fFt = false;

    public cwm(int n) {
        super(n, true);
    }

    public final ldv bdF() {
        return this.fFl;
    }

    public final cnj bdG() {
        return this.fFn;
    }

    public final boolean bdH() {
        return this.fFr;
    }

    public final int bdI() {
        return this.bdt().aFh().mA().hk().ib();
    }

    public final int bdJ() {
        return this.fFp;
    }

    public boolean bF(ljq ljq2) {
        assert (ljq2 != null);
        if (!this.fEU) {
            return false;
        }
        if (this.fFq == null) {
            return false;
        }
        float f2 = Math.abs(this.fFq.ez(ljq2));
        this.fFr = f2 > 11.0f;
        return this.fFr;
    }

    public boolean bdK() {
        boolean bl;
        if (!this.fEY) {
            return true;
        }
        if (this.fFs) {
            return true;
        }
        if (this.fEU) {
            boolean bl2;
            if (this.bdt().aFh() != null && this.bdt().aFh().mA() != null && !(bl2 = this.bdt().aFh().mA().jZ().oO())) {
                ldv ldv2 = lcr.ak((ldv)lcr.acL, (int)this.jr());
                this.f(ldv2, mcc.urL.bD(new Object[0]));
                return false;
            }
            return true;
        }
        if (this.bdt().aFh() != null && this.bdt().aFh().mA() != null && (bl = this.bdt().aFh().mA().jZ().oO())) {
            ldv ldv3 = lcr.ak((ldv)lcr.acL, (int)this.jr());
            this.f(ldv3, mcc.urM.bD(new Object[0]));
            if (this.fFm != null) {
                this.f(this.fFm, mcc.uoA.bD(new Object[0]));
            }
            return false;
        }
        this.fFs = true;
        return true;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
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
            case 4354: {
                this.a((gvn)dxq2);
                break;
            }
            case 4357: {
                this.a((gvt)dxq2);
                break;
            }
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            case 4878: {
                this.b((gbb)dxq2);
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
            case 18180: {
                this.b((esv)dxq2);
                break;
            }
            case 18433: {
                this.a((gxd)dxq2);
                break;
            }
            case 18434: {
                this.a((gxe)dxq2);
                break;
            }
            case 18435: {
                this.a((gxh)dxq2);
                break;
            }
            case 18436: {
                this.a((gxi)dxq2);
                break;
            }
            case 18440: {
                this.c((gxm)dxq2);
                break;
            }
            case 18441: {
                this.a((gxb)dxq2);
                break;
            }
            case 21768: {
                this.a((goc)dxq2);
                break;
            }
            case 11034: {
                this.handleSystemMessageSendingErrorMessage((gre)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        if (gre2.jqc == 18434) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleSystemMessageSendingErrorMessage(): " + this.GUID + " invite response failed, terminating session");
            this.Ci();
            if (!this.fEU) {
                this.bdw();
            }
        } else {
            super.handleSystemMessageSendingErrorMessage(gre2);
        }
    }

    public void X(ldv ldv2, ldv ldv3) {
        assert (this.fEK == cwg.a.fEM);
        if (ldv2 == null) {
            lfn.b(5, "SFTradingSessionHandlerServer", "startHostingTradingSession() PlayerObjectGUID is null.");
            return;
        }
        if (ldv3 == null) {
            lfn.b(5, "SFTradingSessionHandlerServer", "startHostingTradingSession() PlayerMeshObjectGUID is null.");
            return;
        }
        this.fEK = cwg.a.fEN;
        this.fEU = true;
        String string = this.iU() + " wants to start a trading session with you.";
        this.a(ldv2, this.gO(), this.iU(), string);
    }

    @Override
    public void Ci() {
        if (this.eNH) {
            lfn.b(5, "SFTradingSessionHandlerServer", "stopSession() Session has already been stopped.");
            lfn.b(5, "SFTradingSessionHandlerServer", "stopSession() " + this.toString());
            return;
        }
        this.eNH = true;
        if (this.fFl != null) {
            this.lS(this.fFl);
            if (this.fFn != null && !this.fFn.aUw()) {
                this.fFn.aUx();
            }
        }
        this.bdL();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" SessionHost=");
        stringBuilder.append(this.fEU);
        return stringBuilder.toString();
    }

    private void bdL() {
        this.fEK = cwg.a.fEQ;
        if (this.fFk) {
            this.lS(this.bdu());
        }
        if (this.atv != null) {
            this.bJ(this.atv);
        }
        if (this.fFn != null) {
            if (this.fFn.aUw()) {
                this.fFn.aUy();
            } else {
                this.MessageDelegator.hd(this.fFn.getGUID());
            }
        }
        if (this.Ui != null) {
            if (this.Ud != null) {
                this.CM();
            }
            this.bdP();
        }
        this.fEU = false;
        this.fEV = null;
        this.fEW = null;
        this.fFl = null;
        this.fFm = null;
        this.atv = null;
        this.fFn = null;
        this.fFp = 0;
        this.Ui = null;
        this.Ud = null;
        this.fFq = null;
        this.bdw();
    }

    private void b(esv esv2) {
        if (this.fEU) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleConfirmationResponse() Not sessionhost: " + this.toString());
            return;
        }
        if (esv2.iBx == null) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleConfirmationResponse() ConfirmationRespose is null.");
            return;
        }
        if (this.atv == null) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleConfirmationResponse() TimerGUID is null.");
            return;
        }
        if (this.eNH) {
            return;
        }
        this.bJ(this.atv);
        this.atv = null;
        bdv bdv2 = esv2.iBx;
        if (bdv2 instanceof bdw) {
            int n = ((bdw)bdv2).dbU;
            bdp.a a2 = bdp.a.getTradingInviteButtonType(n);
            if (a2 == null) {
                lfn.b(5, "SFTradingSessionHandlerServer", "handleConfirmationResponse() Invalid button ordinal provided: " + n);
                a2 = bdp.a.dbu;
            }
            switch (a2) {
                case dbt: {
                    int n2;
                    if (this.bdt().aFh().mA() != null) {
                        n2 = this.bdt().aFh().mA().hk().ib();
                    } else if (this.bdt().aFh().aJP() instanceof hy) {
                        n2 = ((hy)this.bdt().aFh().aJP()).jr();
                    } else {
                        lfn.b(5, this.getClass().getSimpleName(), "handleConfirmationResponse: cannot find Client ID");
                        return;
                    }
                    ldv ldv2 = this.bdt().aFh().aAG().getGUID();
                    this.a(n2, this.iU(), ldv2);
                    return;
                }
                case dbu: {
                    this.r(1, this.iU());
                    break;
                }
                case dbv: {
                    this.bdt().aFh().mA().c(this.fFm, this.fEX);
                    this.r(2, this.iU());
                    break;
                }
                default: {
                    lfn.b(5, "SFTradingSessionHandlerServer", "handleConfirmationResponse() Invalid buttontype provided: " + (Object)((Object)a2));
                }
            }
            this.bdS();
        } else if (bdv2 instanceof bdx) {
            this.r(4, null);
            this.bdS();
        } else {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleConfirmationResponse() Invalid response received: " + bdv2);
            this.r(1, null);
            this.bdS();
        }
    }

    private void a(gfn gfn2) {
        if (gfn2.dtF == null) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleResourceCreateResponse() Resource received from resourcemanager is null.");
            this.Ci();
            return;
        }
        this.fFn = (cnj)gfn2.dtF;
        this.fFn.a(this);
        this.fFn.gz(this.fEU);
        this.MessageDelegator.a((amf)((Object)this.fFn));
        this.fEV = this.fFn.getGUID();
        if (this.fEU) {
            this.bdQ();
        } else {
            this.bdR();
            this.lZ(this.bdk());
            int n = this.jr();
            ldv ldv2 = this.ayp();
            this.e(this.fEV, n, ldv2);
            this.e(this.fEW, n, ldv2);
        }
    }

    private void a(ghj ghj2) {
        assert (this.Ud == null);
        if (ghj2.jhz < 0) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleSensorCreateResponse() SensorType is invalid.");
            return;
        }
        if (ghj2.fzI == null) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleSensorCreateResponse() ObjectToSenseGUID is null.");
            return;
        }
        if (ghj2.Ud == null) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleSensorCreateResponse() SensorGUID is null.");
            return;
        }
        this.Ud = ghj2.Ud;
        if (this.eNH) {
            this.CM();
            this.Ud = null;
        }
    }

    private void a(gho gho2) {
        if (gho2.Position == null) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleSensorObjectPositionTriggeredMessage() Position is null.");
            return;
        }
        this.fFq = gho2.Position;
    }

    private void a(ghq ghq2) {
        if (this.Ud == null) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleSensorObjectToSenseRemovedMessage() SensorGUID is null.");
            return;
        }
        if (!this.Ud.equals(ghq2.aO())) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleSensorObjectToSenseRemovedMessage() SensorGUID=" + this.Ud);
            lfn.b(5, "SFTradingSessionHandlerServer", "handleSensorObjectToSenseRemovedMessage() Message.FromGUID=" + ghq2.aO());
            return;
        }
    }

    private void b(gbb gbb2) {
        if (this.eNH) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleSessionEndMessage() Session has been stopped already.");
            return;
        }
        if (this.fFl == null) {
            if (this.fEK == cwg.a.fEN) {
                this.bdL();
            }
            lfn.b(5, "SFTradingSessionHandlerServer", "handleSessionEndMessage() TradingSessionHandlerGUID is null and the state is : " + (Object)((Object)this.fEK));
            return;
        }
        assert (!this.fFl.equals(this.GUID));
        if (!gbb2.aO().equals(this.fFl)) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleSessionEndMessage() Received message from unknown object.");
            lfn.b(5, "SFTradingSessionHandlerServer", "handleSessionEndMessage() Message.FromGUID=" + gbb2.aO() + " TradingSessionHandlerGUID=" + this.fFl);
            return;
        }
        if (this.fEU) {
            gbb2.f(this.GUID);
            gbb2.on(this.fFl);
            this.MessageDelegator.F(gbb2);
            this.bdL();
        } else {
            this.bdL();
        }
    }

    private void a(gbc gbc2) {
        ldv ldv2 = this.bdu();
        if (!gbc2.aO().tV(ldv2)) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleSessionEndRequest() Message received from unknown object.");
            lfn.b(5, "SFTradingSessionHandlerServer", "handleSessionEndRequest() FromGUID=" + gbc2.aO() + " ClientSessionHandlerGUID=" + ldv2);
            return;
        }
        if (this.fEK == cwg.a.fEQ) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleSessionEndRequest() Trading session is already stopped.");
            return;
        }
        if (this.fFt) {
            assert (this.fFn.aUG());
            return;
        }
        if (this.fFn.aUG()) {
            this.fFt = true;
            return;
        }
        this.lS(ldv2);
        this.fFk = false;
        this.Ci();
    }

    public void bdM() {
        ldv ldv2 = this.bdu();
        this.lS(ldv2);
        this.fFk = false;
        this.Ci();
    }

    public boolean bdN() {
        return this.fFt;
    }

    private void a(gnu gnu2) {
        if (!gnu2.jns) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleStorageSessionCreateResponse() StorageSession could not be created.");
            lfn.b(5, "SFTradingSessionHandlerServer", "handleStorageSessionCreateResponse() " + this.toString());
            if (!lcw.enb()) assert (false);
        }
    }

    private void a(goc goc2) {
        if (goc2.Rs == null) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleSubscriptionListenerNotificationMessage() ObjectGUID is null.");
            return;
        }
        if (this.eNH) {
            this.bdP();
            return;
        }
        this.Ci();
    }

    private void a(gvn gvn2) {
        assert (!this.fEU);
        assert (this.atv == null);
        if (gvn2.atv == null) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleTimerCreateResponse() TimerGUID is null. Timer could not be created.");
            return;
        }
        this.atv = gvn2.atv;
    }

    private void a(gvt gvt2) {
        assert (!this.fEU);
        assert (this.atv != null);
        if (gvt2.atv == null) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleTimerTimeoutMessage() TimerGUID is null.");
            return;
        }
        if (!this.atv.equals(gvt2.atv)) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleTimerTimeoutMessage() TimerGUID is not equal to Message.TimerGUID.");
            lfn.b(5, "SFTradingSessionHandlerServer", "handleTimerTimeoutMessage() TimerGUID=" + this.atv + " Message.TimerGUID=" + gvt2.atv);
            return;
        }
        this.atv = null;
        if (this.eNH) {
            return;
        }
        this.r(4, null);
        this.bdS();
    }

    private void a(gxb gxb2) {
        gxb2.f(this.GUID);
        gxb2.on(this.bdu());
        this.MessageDelegator.F(gxb2);
    }

    private void a(gxd gxd2) {
        assert (gxd2.Tr != null);
        assert (gxd2.jsY != null);
        assert (gxd2.jsZ != null);
        this.fEU = false;
        this.fEX = gxd2.jsY;
        this.fFl = gxd2.aO();
        this.fFm = gxd2.Tr;
        double d2 = this.MessageDelegator.arc().rgz + 20.0;
        ldv ldv2 = lcr.p((ldv)lcr.aTZ, (int)this.jr(), (int)(this.gO() != null ? this.gO().enw() : this.ayp().enw()));
        if (!lcw.qOR) {
            String[] stringArray = bdp.dbm;
            bdr bdr2 = new bdr(this.GUID, d2, gxd2.jsZ, stringArray);
            bdr2.Title = "";
            est est2 = (est)this.MessageDelegator.h(18179, this.GUID, ldv2);
            est2.iBv = bdr2;
            this.MessageDelegator.F(est2);
        } else {
            bdt bdt2 = new bdt();
            bdt2.bsD = d2;
            bdt2.dbD = bds.dbB.ordinal();
            bdt2.ev = this.GUID;
            bdt2.dbE = lwq.tgk.bD(this.fEX);
            bdt2.ed = bdu.dbO.ordinal();
            bdt2.Ri = gxd2.Tr;
            esu esu2 = (esu)this.MessageDelegator.h(18183, this.getGUID(), ldv2);
            esu2.iBw = bdt2;
            this.MessageDelegator.F(esu2);
        }
        this.l(20.0);
    }

    private void a(gxe gxe2) {
        assert (this.fEU);
        assert (this.Ud == null);
        assert (this.Ui == null);
        if (!gxe2.jtg) {
            switch (gxe2.gKV) {
                case 2: {
                    String string = gxe2.jth != null ? gxe2.jth : "Unknown";
                    ((cex)this.bdt().aFh()).c(mdb.uEA.bD(string));
                    break;
                }
                case 3: {
                    String string = gxe2.jth != null ? gxe2.jth : "Unknown";
                    ((cex)this.bdt().aFh()).c(mdb.uEB.bD(string));
                    break;
                }
                case 1: {
                    ((cex)this.bdt().aFh()).c(mdb.uEz.bD(new Object[0]));
                    break;
                }
                case 4: {
                    ((cex)this.bdt().aFh()).c(mdb.uEC.bD(new Object[0]));
                    break;
                }
                case 5: {
                    ((cex)this.bdt().aFh()).c(mdb.uED.bD(new Object[0]));
                    break;
                }
                case 6: {
                    ((cex)this.bdt().aFh()).c(mdb.uEF.bD(new Object[0]));
                    break;
                }
                case 8: {
                    ((cex)this.bdt().aFh()).c(mdb.uEJ.bD(new Object[0]));
                    break;
                }
                case 7: {
                    ((cex)this.bdt().aFh()).c(mdb.uEG.bD(new Object[0]));
                    break;
                }
                case 9: {
                    ((cex)this.bdt().aFh()).c(mdb.uEK.bD(new Object[0]));
                    break;
                }
                default: {
                    lfn.b(5, "SFTradingSessionHandlerServer", "handleTradingInviteResponse() Unhandled reason provided: " + gxe2.gKV);
                }
            }
            this.Ci();
            return;
        }
        if (gxe2.RB <= 0) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleTradingInviteResponse() ClientNodeID is invalid.");
            this.lS(gxe2.aO());
            this.Ci();
            assert (false);
            return;
        }
        if (gxe2.jth == null) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleTradingInviteResponse() ParticipantPlayerName is null.");
            this.lS(gxe2.aO());
            this.Ci();
            assert (false);
            return;
        }
        if (gxe2.Ui == null) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleTradingInviteResponse() MeshObjectGUID is null.");
            this.lS(gxe2.aO());
            this.Ci();
            assert (false);
            return;
        }
        if (this.bdt().aFh().aLU().aEP().aEx()) {
            this.lS(gxe2.aO());
            this.Ci();
            return;
        }
        this.fEK = cwg.a.fEO;
        this.fEX = gxe2.jth;
        this.fFl = gxe2.aO();
        this.fFp = gxe2.RB;
        this.Ui = gxe2.Ui;
        if (this.bdt().aFh().aAG() != null) {
            this.fFo = this.bdt().aFh().aAG().av();
        }
        this.m(cug.fnL, this.GUID.bFk());
        this.CL();
        this.bdO();
    }

    private void a(gxh gxh2) {
        assert (!this.fEU);
        assert (this.fFl != null);
        if (gxh2.eOt == null) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleTradingSessionSetupRequest() StorageObjectGUID is null.");
            return;
        }
        this.fEK = cwg.a.fEO;
        this.fEW = gxh2.eOt;
        this.fEY = gxh2.fEY;
        this.atc = gxh2.atc;
        this.atf = gxh2.atf;
        this.fEZ = gxh2.fEZ;
        this.fFa = gxh2.fFa;
        this.m(cug.fnL, this.GUID.bFk());
    }

    private void a(gxi gxi2) {
        assert (this.fEU);
        if (gxi2.eOt == null) {
            lfn.b(5, "SFTradingSessionHandlerServer", "handleTradingSessionSetupResponse() StorageObjectGUID is null.");
            return;
        }
        this.fEW = gxi2.eOt;
        this.lZ(this.bdk());
        int n = this.jr();
        ldv ldv2 = this.ayp();
        this.e(this.fEV, n, ldv2);
        this.e(this.fEW, n, ldv2);
    }

    private void c(gxm gxm2) {
        assert (this.fFn != null);
        if (this.fEU) {
            if (gxm2.aO().equals(this.bdu())) {
                gxm2.f(this.GUID);
            }
            this.fFn.receiveMessage(gxm2);
        } else {
            gxm2.f(this.GUID);
            gxm2.on(this.fFl);
            this.MessageDelegator.F(gxm2);
        }
    }

    private void m(int n, ldv ldv2) {
        assert (n > 0);
        assert (ldv2 != null);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.GUID, lcr.qCq);
        gfm2.ResourceType = n;
        gfm2.iSi = 1;
        gfm2.Yc = ldv2;
        this.MessageDelegator.F(gfm2);
    }

    private void CL() {
        assert (this.Ui != null);
        ghi ghi2 = (ghi)this.MessageDelegator.h(513, this.GUID, this.Ui.bFk());
        ghi2.jhz = cvk.a.fzK.ordinal();
        ghi2.fzI = this.Ui;
        this.MessageDelegator.F(ghi2);
    }

    private void CM() {
        assert (this.Ud != null);
        ghr ghr2 = (ghr)this.MessageDelegator.h(515, this.GUID, this.Ud);
        ghr2.iBr = false;
        this.MessageDelegator.F(ghr2);
    }

    private void lZ(ldv ldv2) {
        assert (ldv2 != null);
        assert (this.aYH > 0);
        assert (this.fEV != null);
        assert (this.fEW != null);
        assert (this.fEX != null);
        assert (!this.fFk);
        gau gau2 = (gau)this.MessageDelegator.h(4871, this.GUID, ldv2);
        gau2.aYH = this.aYH;
        gau2.fEU = this.fEU;
        gau2.fEV = this.fEV;
        gau2.fEW = this.fEW;
        gau2.fEX = this.fEX;
        gau2.fEY = this.fEY;
        gau2.atc = this.atc;
        gau2.atf = this.atf;
        gau2.fEZ = this.fEZ;
        gau2.fFa = this.fFa;
        this.MessageDelegator.F(gau2);
        this.fFk = true;
    }

    private void lS(ldv ldv2) {
        assert (ldv2 != null);
        assert (!ldv2.equals(this.GUID));
        gbb gbb2 = (gbb)this.MessageDelegator.h(4878, this.GUID, ldv2);
        this.MessageDelegator.F(gbb2);
    }

    private void e(ldv ldv2, int n, ldv ldv3) {
        assert (ldv2 != null);
        assert (n > 0);
        assert (ldv3 != null);
        gnt gnt2 = (gnt)this.MessageDelegator.h(9988, this.GUID, ldv2);
        gnt2.RB = n;
        gnt2.Tr = ldv3;
        this.MessageDelegator.F(gnt2);
    }

    private void bdO() {
        assert (this.Ui != null);
        ldv ldv2 = this.bdt().aFh().mA().hk();
        ldv ldv3 = lcr.ak((ldv)lcr.qAJ, (int)this.Ui.ib());
        gny gny2 = (gny)this.MessageDelegator.h(21766, this.GUID, ldv3);
        gny2.adA = ldv2;
        gny2.Rs = this.Ui;
        this.MessageDelegator.F(gny2);
    }

    private void bdP() {
        assert (this.Ui != null);
        ldv ldv2 = this.bdt().aFh().mA().hk();
        ldv ldv3 = lcr.ak((ldv)lcr.qAJ, (int)this.Ui.ib());
        goi goi2 = (goi)this.MessageDelegator.h(21767, this.GUID, ldv3);
        goi2.adA = ldv2;
        goi2.Rs = this.Ui;
        this.MessageDelegator.F(goi2);
    }

    private void l(double d2) {
        assert (!this.fEU);
        assert (d2 > 0.0);
        gvm gvm2 = (gvm)this.MessageDelegator.h(4353, this.GUID, this.MessageDelegator.getGUID());
        gvm2.gdA = 1;
        gvm2.Rs = this.GUID;
        gvm2.oV = 0.0;
        gvm2.eNV = d2;
        this.MessageDelegator.F(gvm2);
    }

    private void bJ(ldv ldv2) {
        assert (!this.fEU);
        assert (ldv2 != null);
        gvr gvr2 = (gvr)this.MessageDelegator.h(4355, this.GUID, this.MessageDelegator.getGUID());
        gvr2.gdA = 1;
        gvr2.atv = ldv2;
        gvr2.jsw = false;
        this.MessageDelegator.F(gvr2);
    }

    private void a(ldv ldv2, ldv ldv3, String string, String string2) {
        assert (this.fEU);
        assert (this.fFl == null);
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (string != null);
        assert (string2 != null);
        gxd gxd2 = (gxd)this.MessageDelegator.h(18433, this.GUID, ldv2);
        gxd2.jM(true);
        gxd2.Tr = ldv3;
        gxd2.jsY = string;
        gxd2.jsZ = string2;
        this.MessageDelegator.F(gxd2);
    }

    private void r(int n, String string) {
        assert (!this.fEU);
        assert (this.fFl != null);
        assert (n > 0);
        gxe gxe2 = (gxe)this.MessageDelegator.h(18434, this.GUID, this.fFl);
        gxe2.jtg = false;
        gxe2.gKV = n;
        gxe2.RB = 0;
        gxe2.jth = string;
        gxe2.Ui = null;
        this.MessageDelegator.F(gxe2);
        this.fFl = null;
        this.fFm = null;
    }

    private void a(int n, String string, ldv ldv2) {
        assert (!this.fEU);
        assert (this.fFl != null);
        assert (n > 0);
        assert (string != null);
        assert (ldv2 != null);
        gxe gxe2 = (gxe)this.MessageDelegator.h(18434, this.GUID, this.fFl);
        gxe2.jM(true);
        gxe2.jtg = true;
        gxe2.RB = n;
        gxe2.jth = string;
        gxe2.Ui = ldv2;
        this.MessageDelegator.F(gxe2);
    }

    private void bdQ() {
        assert (this.fEU);
        assert (this.fFl != null);
        assert (this.fEV != null);
        gxh gxh2 = (gxh)this.MessageDelegator.h(18435, this.GUID, this.fFl);
        gxh2.eOt = this.fEV;
        gxh2.atc = this.atc;
        gxh2.atf = this.atf;
        gxh2.fEY = this.fEY;
        gxh2.fEZ = this.fEZ;
        gxh2.fFa = this.fFa;
        this.MessageDelegator.F(gxh2);
    }

    private void bdR() {
        assert (!this.fEU);
        assert (this.fFl != null);
        assert (this.fEV != null);
        gxi gxi2 = (gxi)this.MessageDelegator.h(18436, this.GUID, this.fFl);
        gxi2.eOt = this.fEV;
        this.MessageDelegator.F(gxi2);
    }

    private void bdS() {
        assert (!this.fEU);
        assert (!this.eNH);
        assert (this.fFl == null);
        this.eNH = true;
        this.bdL();
    }

    public final void ha(boolean bl) {
        this.fFs = bl;
    }
}

