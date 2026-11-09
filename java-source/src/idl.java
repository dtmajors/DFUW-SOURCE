/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFClanInformationListDTO;
import spenefett.hid.gui.serialization.dto.SFConquestMercenaryContractToSendDTO;
import spenefett.hid.gui.serialization.dto.SFStringsConquestCreateContractDTO;

public class idl
extends idw
implements htv,
hud,
hue {
    private azz lKD = null;
    private ayq[] lJT = null;
    private SFClanInformationListDTO lJU = null;
    private ieb lJV = ieb.lLW;
    private bao iCR = null;

    public void c(azz azz2) {
        this.lKD = azz2;
    }

    public bao bMa() {
        return this.iCR;
    }

    public void F(bao bao2) {
        this.iCR = bao2;
    }

    idl() {
        super("ClanConquestCreateContract", "clanconquestcreatecontract.swf", iee.lMH);
    }

    @Override
    public void oi() {
        if (this.lLk.cIj()) {
            this.lLk.pq(false);
        }
    }

    @Override
    public void b(ayq[] ayqArray) {
        this.lJT = ayqArray;
        this.lJU = new SFClanInformationListDTO();
        this.lJU.clanInformationList = lcn.emv();
        for (int j = 0; j < this.lJT.length; ++j) {
            if (this.lJT[j] == null || this.lKD == null || ldv.au(this.lJT[j].iG(), this.leq.ack()) || this.leq.R(this.lJT[j].iG(), false) || this.leq.al(this.lJT[j].iG(), this.lKD.afl()) && this.iCR == null || this.lKD.q(this.lJT[j].iG(), true)) continue;
            this.lJU.clanInformationList.add(this.lJT[j].a(this.leq.u(this.lJT[j]), hso.cxK().bAn().Tr));
        }
        this.a("takeClanList", new Object[]{this.lJU});
    }

    @Override
    public void nI(String string) {
        this.a("sendRequestFailed", new Object[]{string});
    }

    @Override
    public void nJ(String string) {
        this.a("sendRequestSucceeded", new Object[]{string});
    }

    @Override
    public void a(bao bao2, String string) {
        if (this.iCR == null) {
            return;
        }
        if (this.iCR != bao2) {
            return;
        }
        this.a("counterOfferRequestFailed", new Object[]{string});
    }

    @Override
    public void b(bao bao2, String string) {
        if (this.iCR == null) {
            return;
        }
        if (this.iCR != bao2) {
            return;
        }
        this.a("counterOfferRequestSucceeded", new Object[]{string});
    }

    @Override
    protected void cON() {
        super.cON();
        if (this.isVisible()) {
            this.lLm.a(hyy.a.lrK, true);
            this.lLm.a(hyy.a.lrK, this);
            switch (this.lJV) {
                case lLW: 
                case lLX: {
                    this.lLm.a(hyy.b.luw, this.lJV.cPf());
                    this.lLm.a(hyy.b.lux, 0);
                    break;
                }
                case lLY: 
                case lLZ: {
                    this.lLm.a(hyy.b.luw, 0);
                    this.lLm.a(hyy.b.lux, this.lJV.cPf());
                }
            }
            if (this.lLp != null) {
                this.lLm.a(new hyy.a[]{this.lLp, hyy.a.lrK}, this.cEF());
            }
        } else {
            this.lLm.a(hyy.a.lrK, false);
            this.lLm.b(hyy.a.lrK);
        }
    }

    @Override
    protected void c(hyy.b b2, int n) {
        switch (b2) {
            case luu: {
                this.lLk.cIh();
                return;
            }
            case luv: {
                this.leq.a(this);
                return;
            }
            case luw: {
                if (this.lJV.a(ieb.lLW)) {
                    this.lJV = this.lJV.cPe();
                    break;
                }
                this.lLm.a(hyy.b.lux, 0);
                this.lJV = ieb.lLW;
                break;
            }
            case lux: {
                if (this.lJV.a(ieb.lLY)) {
                    this.lJV = this.lJV.cPe();
                    break;
                }
                this.lLm.a(hyy.b.luw, 0);
                this.lJV = ieb.lLY;
                break;
            }
            default: {
                return;
            }
        }
        this.lLm.a(b2, this.lJV.cPf());
        this.a("setSortOrder", new Object[]{this.lJV.ordinal()});
    }

    @Override
    public void cyx() {
        if (this.lKD == null) {
            return;
        }
        this.lKD = this.ler.sX(this.lKD.afl());
        if (this.lKD == null) {
            if (this.isVisible()) {
                this.lLk.cIh();
            }
            return;
        }
    }

    @Override
    public void b(azz azz2) {
        if (this.lKD == null) {
            return;
        }
        if (this.lKD.afl().equals(azz2.afl())) {
            this.lKD = azz2;
        }
    }

    @Override
    protected void cOO() {
        azz azz2 = this.lKD = this.lKD == null ? null : this.ler.sX(this.lKD.afl());
        if (this.lKD == null) {
            if (this.isVisible()) {
                this.lLk.cIh();
            }
            return;
        }
        if (this.leq != null) {
            this.leq.a(this);
        }
        this.a("setSortOrder", new Object[]{this.lJV.ordinal()});
        this.a("takeCounterOfferContract", new Object[]{this.iCR == null ? null : this.iCR.s(this.leq.dNi().iG(), true)});
        this.lLs = false;
    }

    @Override
    protected void cOP() {
        this.a("setHeight", new Object[]{this.fc});
    }

    @Override
    protected void cOQ() {
        SFStringsConquestCreateContractDTO sFStringsConquestCreateContractDTO = new SFStringsConquestCreateContractDTO();
        sFStringsConquestCreateContractDTO.title = lwd.tce.bD(new Object[0]).exA();
        sFStringsConquestCreateContractDTO.clanNameHeader = lwd.tcf.bD(new Object[0]).exA();
        sFStringsConquestCreateContractDTO.clanSizeHeader = lwd.tcg.bD(new Object[0]).exA();
        sFStringsConquestCreateContractDTO.filtersTitle = lwd.tch.bD(new Object[0]).exA();
        sFStringsConquestCreateContractDTO.textFilterDefaultText = lwd.tcj.bD(new Object[0]).exA();
        sFStringsConquestCreateContractDTO.issueContractsText = lwd.tdA.bD(new Object[0]).exA();
        sFStringsConquestCreateContractDTO.issuingContractsText = lwd.tdB.bD(new Object[0]).exA();
        this.a("takeStrings", new Object[]{sFStringsConquestCreateContractDTO});
        this.a("takeConquestStrings", new Object[]{lwr.exR()});
    }

    @llk
    public void showClanOverview(int n) {
        if (this.lJT == null || n < 0 || n >= this.lJT.length || this.lJT[n] == null) {
            return;
        }
        idr idr2 = (idr)idx.a(iee.lMw);
        idr2.t(this.lJT[n]);
        this.lLk.a(iee.lMw, true);
    }

    @llk
    public void fetchClanList() {
        if (this.leq != null) {
            this.leq.a(this);
        }
    }

    @llk
    public void sendContracts(SFConquestMercenaryContractToSendDTO sFConquestMercenaryContractToSendDTO) {
        if (sFConquestMercenaryContractToSendDTO.recipientNames.size() == 0 || this.iCR != null) {
            this.a("counterOfferRequestFailed", new Object[]{baq.cNj.fA().bD(new Object[0]).exA()});
            return;
        }
        if (sFConquestMercenaryContractToSendDTO.flatFeeReward <= 0 && (sFConquestMercenaryContractToSendDTO.wagerPercentageReward <= 0.0f || sFConquestMercenaryContractToSendDTO.wagerPercentageReward > 1.0f)) {
            this.a("counterOfferRequestFailed", new Object[]{baq.cNt.fA().bD(new Object[0]).exA()});
            return;
        }
        ldv[] ldvArray = new ldv[sFConquestMercenaryContractToSendDTO.recipientNames.size()];
        int n = 0;
        for (String string : sFConquestMercenaryContractToSendDTO.recipientNames) {
            boolean bl = false;
            for (int j = 0; j < this.lJT.length; ++j) {
                if (string.compareToIgnoreCase(this.lJT[j].iV()) != 0) continue;
                ldvArray[n++] = this.lJT[j].iG();
                bl = true;
                break;
            }
            if (bl) continue;
            this.a("counterOfferRequestFailed", new Object[]{baq.cNj.fA().bD(new Object[0]).exA()});
            return;
        }
        float f = (float)Math.round(sFConquestMercenaryContractToSendDTO.wagerPercentageReward * 100.0f) / 100.0f;
        this.leq.a(this.lKD.afl(), this.lKD.afw(), sFConquestMercenaryContractToSendDTO.flatFeeReward, f, ldvArray, this);
    }

    @llk
    public void counterOfferContract(int n, double d2) {
        if (this.iCR == null) {
            this.a("sendRequestFailed", new Object[]{baq.cNj.fA().bD(new Object[0]).exA()});
            return;
        }
        if (n <= 0 && (d2 <= 0.0 || d2 > 1.0)) {
            this.a("sendRequestFailed", new Object[]{baq.cNt.fA().bD(new Object[0]).exA()});
            return;
        }
        this.leq.a(this.iCR, n, (float)d2, this);
    }
}

