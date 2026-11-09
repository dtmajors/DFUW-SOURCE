/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.Set;
import spenefett.hid.gui.serialization.dto.SFConquestChallengeDTO;
import spenefett.hid.gui.serialization.dto.SFConquestMercenaryContractDTO;
import spenefett.hid.gui.serialization.dto.SFStringsConquestDetailsDTO;

public class idm
extends idw
implements bto,
hte,
htf,
htg,
htx,
hue,
huf {
    private double lKf = 1.0;
    private azz lKD = null;
    private bao lKE = null;
    private jjs lKi = null;
    private double lKj = 0.0;
    private lox lKk = null;
    private String lKl = null;

    public void c(azz azz2) {
        this.lKD = azz2;
    }

    idm() {
        super("ClanConquestDetails", "clanconquestdetails.swf", iee.lMG);
    }

    @Override
    protected void cON() {
        super.cON();
        if (this.isVisible()) {
            this.lLm.a(hyy.a.lrJ, true);
            this.lLm.a(hyy.a.lrJ, this);
            if (this.lLp != null) {
                this.lLm.a(new hyy.a[]{this.lLp, hyy.a.lrJ}, this.cEF());
            }
        } else {
            this.lLm.a(hyy.a.lrJ, false);
            this.lLm.b(hyy.a.lrJ);
        }
    }

    @Override
    protected void c(hyy.b b2, int n) {
        switch (b2) {
            case lus: {
                this.lLk.cIh();
                return;
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.cDj()) {
            return;
        }
        this.lKf -= ldz2.qwh;
        if (this.lKf <= 0.0) {
            this.lKf = 1.0;
            this.a("doTick", new Object[0]);
            if (this.lKi != null) {
                this.lKi.setText(this.lKl, this.lKk.bD(this.lKj - this.MessageDelegator.arc().rgz).exA().toUpperCase());
            }
        }
    }

    @Override
    public void cyx() {
        if (this.lKD == null) {
            return;
        }
        this.lKD = this.ler.sX(this.lKD.afl());
        this.lKf = 0.0;
        if (this.lKD == null) {
            if (this.isVisible()) {
                this.lLk.cIh();
            }
            return;
        }
        this.a("takeChallenge", new Object[]{this.lKD.a(this.leq)});
        if (this.lKi != null) {
            this.lKi.setVisible(false);
        }
    }

    @Override
    public void b(azz azz2) {
        if (this.lKD == null) {
            return;
        }
        if (!this.lKD.afl().equals(azz2.afl())) {
            return;
        }
        this.lKD = azz2;
        this.lKf = 0.0;
        this.a("takeChallenge", new Object[]{this.lKD.a(this.leq)});
        if (this.lKi != null) {
            this.lKi.setVisible(false);
        }
    }

    @Override
    public void f(azx azx2) {
        if (this.lKD != null && azx2.afl().equals(this.lKD.afl())) {
            this.a("updateBindstoneHealth", new Object[]{Float.valueOf(azx2.afn())});
        }
    }

    @Override
    public void d(azx azx2, azv azv2, azw azw2) {
        if (this.lKD != null && azx2.afl().equals(this.lKD.afl())) {
            this.a("updateSiegeStoneHealth", new Object[]{azw2.getName(), Float.valueOf(azw2.afi())});
        }
    }

    @Override
    public void e(azx azx2, azv azv2) {
        if (this.lKD != null && azx2.afl().equals(this.lKD.afl())) {
            this.a("updateAttackerScore", new Object[]{this.lKD.fC(azv2.getGUID()), azv2.aer()});
        }
    }

    @Override
    public void g(azx azx2) {
        if (this.lKD != null && azx2.afl().equals(this.lKD.afl())) {
            this.a("updateWallRequirement", new Object[]{azx2.afo()});
        }
    }

    @Override
    public void cyB() {
        if (this.lKD == null) {
            return;
        }
        this.lKD = this.ler.sX(this.lKD.afl());
        this.lKf = 0.0;
        if (this.lKD == null) {
            if (this.isVisible()) {
                this.lLk.cIh();
            }
            return;
        }
        this.a("takeChallenge", new Object[]{this.lKD.a(this.leq)});
    }

    @Override
    public void a(bao bao2, String string) {
        if (this.lKE == null) {
            return;
        }
        if (bao2 != this.lKE) {
            return;
        }
        this.lKE = null;
        this.a("contractManagementSucceeded", new Object[]{string});
    }

    @Override
    public void b(bao bao2, String string) {
        if (this.lKE == null) {
            return;
        }
        if (bao2 != this.lKE) {
            return;
        }
        this.lKE = null;
        this.a("contractManagementFailed", new Object[]{string});
    }

    @Override
    public void oi() {
        this.lLk.pq(false);
    }

    @Override
    public void cyy() {
        boolean bl = this.leq.i(bca.cUC);
        boolean bl2 = this.leq.i(bca.cUE);
        this.a("setPermissions", new Object[]{bl, bl2, bl});
    }

    @Override
    protected void cOO() {
        this.leq.a(this);
        azz azz2 = this.lKD = this.lKD == null ? null : this.ler.sX(this.lKD.afl());
        if (this.lKD == null) {
            if (this.isVisible()) {
                this.lLk.cIh();
            }
            return;
        }
        this.a("takeChallenge", new Object[]{this.lKD.a(this.leq)});
        this.cyy();
        this.a("setCreateContractVisibility", new Object[]{this.lKD.fD(this.leq.ack())});
    }

    @Override
    protected void cOP() {
        this.a("setHeight", new Object[]{this.fc});
    }

    @Override
    protected void cOQ() {
        SFStringsConquestDetailsDTO sFStringsConquestDetailsDTO = new SFStringsConquestDetailsDTO();
        sFStringsConquestDetailsDTO.title = lwe.tce.bD(new Object[0]).exA();
        this.a("takeStrings", new Object[]{sFStringsConquestDetailsDTO});
        this.a("takeConquestStrings", new Object[]{lwr.exR()});
    }

    @Override
    public hyn s(int n, int n2, String string) {
        if (string != null && string.startsWith("Holding-")) {
            String string2 = string.substring(8, string.indexOf(";"));
            Set<azg> set = this.lLl.na(this.leq.ack());
            azg azg2 = null;
            for (azg azg3 : set) {
                if (azg3.getID().compareTo(string2) != 0) continue;
                azg2 = azg3;
                break;
            }
            if (azg2 != null) {
                StringBuilder stringBuilder = new StringBuilder();
                switch (azg2.abi()) {
                    case cvj: {
                        stringBuilder.append("ClanCity;");
                        stringBuilder.append(lzc.tOm.bD(new Object[0]).exA().toUpperCase());
                        stringBuilder.append(";");
                        break;
                    }
                    case cvk: {
                        stringBuilder.append("ClanHamlet;");
                        stringBuilder.append(lzc.tOn.bD(new Object[0]).exA().toUpperCase());
                        stringBuilder.append(";");
                    }
                }
                stringBuilder.append("Owner=");
                stringBuilder.append(this.leq.acl());
                stringBuilder.append(";");
                boolean bl = false;
                if (azg2.acV() > 0.0) {
                    stringBuilder.append("RemainingTime");
                    stringBuilder.append("=");
                    stringBuilder.append(lwk.tet.bD(azg2.acV() - this.MessageDelegator.arc().rgz).exA().toUpperCase());
                    stringBuilder.append(";");
                    stringBuilder.append("RemainingTimeId");
                    stringBuilder.append("=");
                    stringBuilder.append(azg2.getGUID().toString());
                    stringBuilder.append(";");
                    this.lKj = azg2.acV();
                    this.lKk = lwk.tet;
                    this.lKl = azg2.getGUID().toString();
                    bl = true;
                } else if (azg2.acU() > 0.0) {
                    stringBuilder.append("RemainingTime");
                    stringBuilder.append("=");
                    stringBuilder.append(lwk.teu.bD(azg2.acU() - this.MessageDelegator.arc().rgz).exA().toUpperCase());
                    stringBuilder.append(";");
                    stringBuilder.append("RemainingTimeId");
                    stringBuilder.append("=");
                    stringBuilder.append(azg2.getGUID().toString());
                    stringBuilder.append(";");
                    this.lKj = azg2.acU();
                    this.lKk = lwk.teu;
                    this.lKl = azg2.getGUID().toString();
                    bl = true;
                } else if (azg2.acW() > 0.0) {
                    stringBuilder.append("RemainingTime");
                    stringBuilder.append("=");
                    stringBuilder.append(lwk.tev.bD(azg2.acW() - this.MessageDelegator.arc().rgz).exA().toUpperCase());
                    stringBuilder.append(";");
                    stringBuilder.append("RemainingTimeId");
                    stringBuilder.append("=");
                    stringBuilder.append(azg2.getGUID().toString());
                    stringBuilder.append(";");
                    this.lKj = azg2.acW();
                    this.lKk = lwk.tev;
                    this.lKl = azg2.getGUID().toString();
                    bl = true;
                }
                stringBuilder.append("Name");
                stringBuilder.append("=");
                stringBuilder.append(lvm.sWY.bD(string2).exA().toUpperCase());
                stringBuilder.append(";");
                String[] stringArray = string.split(";");
                float f = stringArray.length > 5 ? Float.parseFloat(stringArray[5]) : 0.0f;
                float f2 = stringArray.length > 6 ? Float.parseFloat(stringArray[6]) : 0.0f;
                jjs jjs2 = new jjs(stringBuilder.toString(), n - (int)f, n2 - (int)(f2 += (float)n2 >= idm.cxO().cHk().H / 2.0f ? -20.0f : 20.0f), 50, 50);
                if (bl) {
                    this.lKi = jjs2;
                }
                return jjs2;
            }
        }
        return super.s(n, n2, string);
    }

    public void q(hyn hyn2) {
        this.lKi = null;
        this.lKk = null;
        this.lKj = 0.0;
        this.lKl = null;
    }

    @llk
    public void createNewMercenaryContract(SFConquestChallengeDTO sFConquestChallengeDTO) {
        if (this.lKE != null) {
            return;
        }
        idl idl2 = (idl)idx.a(iee.lMH);
        idl2.F(null);
        idl2.c(this.lKD);
        this.lLk.a(iee.lMH, true);
    }

    @llk
    public void mercenaryContractAccepted(SFConquestChallengeDTO sFConquestChallengeDTO, SFConquestMercenaryContractDTO sFConquestMercenaryContractDTO) {
        if (this.lKE != null) {
            return;
        }
        bao bao2 = this.leq.A(this.lKD.afl(), sFConquestMercenaryContractDTO.clanName);
        if (bao2 == null) {
            return;
        }
        this.lKE = bao2;
        this.leq.a(bao2, this);
    }

    @llk
    public void mercenaryContractCounterOfferRequested(SFConquestChallengeDTO sFConquestChallengeDTO, SFConquestMercenaryContractDTO sFConquestMercenaryContractDTO) {
        if (this.lKE != null) {
            return;
        }
        idl idl2 = (idl)idx.a(iee.lMH);
        idl2.F(this.leq.A(this.lKD.afl(), sFConquestMercenaryContractDTO.clanName));
        idl2.c(this.lKD);
        this.lLk.a(iee.lMH, true);
    }

    @llk
    public void mercenaryContractRejected(SFConquestChallengeDTO sFConquestChallengeDTO, SFConquestMercenaryContractDTO sFConquestMercenaryContractDTO) {
        if (this.lKE != null) {
            return;
        }
        bao bao2 = this.leq.A(this.lKD.afl(), sFConquestMercenaryContractDTO.clanName);
        if (bao2 == null) {
            return;
        }
        this.lKE = bao2;
        this.leq.b(bao2, this);
    }

    @llk
    public void mercenaryContractWithdrawn(SFConquestChallengeDTO sFConquestChallengeDTO, SFConquestMercenaryContractDTO sFConquestMercenaryContractDTO) {
        if (this.lKE != null) {
            return;
        }
        bao bao2 = this.leq.z(this.lKD.afl(), sFConquestMercenaryContractDTO.clanName);
        if (bao2 == null) {
            return;
        }
        this.lKE = bao2;
        this.leq.c(bao2, this);
    }
}

