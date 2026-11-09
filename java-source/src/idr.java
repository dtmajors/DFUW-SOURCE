/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  jju
 */
import java.util.Set;
import spenefett.hid.gui.serialization.dto.SFClanFortressDetailsDTO;
import spenefett.hid.gui.serialization.dto.SFClanHoldingDetailsDTO;
import spenefett.hid.gui.serialization.dto.SFClanVillageDetailsDTO;
import spenefett.hid.gui.serialization.dto.SFConquestChallengeDTO;
import spenefett.hid.gui.serialization.dto.SFConquestMercenaryContractDTO;
import spenefett.hid.gui.serialization.dto.SFStringsClanOverviewDTO;

public class idr
extends idw
implements bto,
htb,
htl,
htw,
htx,
hub,
hue,
huf,
huh,
hul,
hun,
hva,
hvc,
hvf {
    private double lKf = 1.0;
    private ayq lKM = null;
    private aym lKN = null;
    private bao lKE = null;
    private jjs lKi = null;
    private double lKj = 0.0;
    private lox lKk = null;
    private String lKl = null;
    private double lKO = 0.0;
    private lox lKP = null;
    private String lKQ = null;

    public ayq cOY() {
        return this.lKM;
    }

    public void t(ayq ayq2) {
        this.lKM = ayq2;
        this.lKN = null;
        if (this.lLs) {
            this.a("resetWindowState", new Object[0]);
        }
        this.a("takeClanInfo", new Object[]{this.lKM.a(this.leq.u(this.lKM), hso.cxK().bAn().Tr)});
        if (this.lKM instanceof aym) {
            this.lKN = (aym)this.lKM;
        }
        this.cyy();
        if (this.lKN == null) {
            this.leq.a((htl)this, this.lKM);
        } else {
            this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        }
    }

    idr() {
        super("ClanOverview", "clanoverview.swf", iee.lMw);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.cDj()) {
            return;
        }
        this.lKf -= ldz2.qwh;
        if (this.lKf <= 0.0 && this.lKi != null) {
            this.lKi.setText(this.lKl, this.lKk.bD(this.lKj - this.MessageDelegator.arc().rgz).exA().toUpperCase());
            if (this.lKQ != null) {
                this.lKi.setText(this.lKQ, this.lKP.bD(this.lKO - this.MessageDelegator.arc().rgz).exA().toUpperCase());
            }
        }
    }

    public void PZ(int n) {
        this.lLr = n;
    }

    @Override
    public void oi() {
        if (!this.isVisible()) {
            return;
        }
        if (this.lLp != null) {
            this.lLm.a(this.lLp, false);
            this.lLm.b(this.lLp);
            this.lLp = null;
        }
        if (this.leq.dNh()) {
            this.lLp = hyy.a.lrA;
            this.cON();
            if (this.lKM.iG().equals(this.leq.dNi().iG())) {
                this.lLs = true;
                this.cOO();
                return;
            }
        } else {
            this.lLp = hyy.a.lrz;
            this.cON();
        }
        this.a("takePlayerClanStance", new Object[]{this.leq.u(this.lKM)});
    }

    @Override
    public void cyw() {
        if (!this.leq.sz(this.lKM.iG())) {
            return;
        }
        if (this.lKN == null) {
            return;
        }
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        this.a("takePlayerClanStance", new Object[]{this.leq.u(this.lKM)});
    }

    @Override
    public void cyu() {
        if (!this.leq.sz(this.lKM.iG())) {
            return;
        }
        if (this.lKN == null) {
            return;
        }
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        this.a("takePlayerClanStance", new Object[]{this.leq.u(this.lKM)});
    }

    @Override
    public void cyv() {
        if (!this.leq.sz(this.lKM.iG())) {
            return;
        }
        if (this.lKN == null) {
            return;
        }
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        this.a("takePlayerClanStance", new Object[]{this.leq.u(this.lKM)});
    }

    @Override
    public void cyp() {
        if (!this.leq.sz(this.lKM.iG())) {
            return;
        }
        if (this.lKN == null) {
            return;
        }
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        this.a("takePlayerClanStance", new Object[]{this.leq.u(this.lKM)});
    }

    @Override
    public void cyq() {
        if (!this.leq.sz(this.lKM.iG())) {
            return;
        }
        if (this.lKN == null) {
            return;
        }
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        this.a("takePlayerClanStance", new Object[]{this.leq.u(this.lKM)});
    }

    @Override
    public void cyr() {
        if (!this.leq.sz(this.lKM.iG())) {
            return;
        }
        if (this.lKN == null) {
            return;
        }
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        this.a("takePlayerClanStance", new Object[]{this.leq.u(this.lKM)});
    }

    @Override
    public void cys() {
        if (!this.leq.sz(this.lKM.iG())) {
            return;
        }
        if (this.lKN == null) {
            return;
        }
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        this.a("takePlayerClanStance", new Object[]{this.leq.u(this.lKM)});
    }

    @Override
    public void cyt() {
        if (!this.leq.sz(this.lKM.iG())) {
            return;
        }
        if (this.lKN == null) {
            return;
        }
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        this.a("takePlayerClanStance", new Object[]{this.leq.u(this.lKM)});
    }

    @Override
    public void b(aym aym2) {
        if (aym2 == null) {
            return;
        }
        if (this.lKN != null && !this.lKN.iG().equals(aym2.iG())) {
            return;
        }
        this.lKN = aym2;
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        this.a("takePlayerClanStance", new Object[]{this.leq.u(this.lKM)});
    }

    @Override
    public void rc(ldv ldv2) {
        if (!ldv2.equals(this.lKM.iG())) {
            return;
        }
        this.a("takePlayerClanStance", new Object[]{this.leq.u(this.lKM)});
    }

    @Override
    public void rd(ldv ldv2) {
        if (!ldv2.equals(this.lKM.iG())) {
            return;
        }
        if (this.lKN == null) {
            return;
        }
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        this.a("takePlayerClanStance", new Object[]{this.leq.u(this.lKM)});
    }

    @Override
    public void nM(String string) {
        this.a("politicalStanceUpdateSucceeded", new Object[]{string});
    }

    @Override
    public void nN(String string) {
        this.a("politicalStanceUpdateFailed", new Object[]{string});
    }

    @Override
    public void nG(String string) {
        this.a("applicationRequestFailed", new Object[]{string});
    }

    @Override
    public void nH(String string) {
        this.a("applicationRequestSucceeded", new Object[]{string});
    }

    @Override
    public void cyx() {
    }

    @Override
    public void b(azz azz2) {
    }

    @Override
    public void cyB() {
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
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
    public void cyy() {
        boolean bl = this.leq.sz(this.lKM.iG()) && this.leq.i(bca.cUC);
        boolean bl2 = this.leq.sz(this.lKM.iG()) && this.leq.i(bca.cUE);
        this.a("setPermissions", new Object[]{bl2, bl});
    }

    @Override
    public void cyF() {
    }

    @Override
    public void i(azg azg2) {
        if (this.lKN == null) {
            return;
        }
        if (!this.lKN.iG().equals(azg2.iG())) {
            return;
        }
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
    }

    @Override
    public void j(azg azg2) {
        if (this.lKN == null) {
            return;
        }
        if (!this.lKN.iG().equals(azg2.iG())) {
            return;
        }
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        if (this.lKi != null && this.lKl.compareTo(azg2.getGUID().toString()) == 0) {
            this.lKi.setVisible(false);
        }
    }

    @Override
    public void g(bbh bbh2) {
        if (this.lKN == null) {
            return;
        }
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
    }

    @Override
    public void h(bbh bbh2) {
        if (this.lKN == null) {
            return;
        }
        if (!this.lKN.iG().equals(bbh2.iG())) {
            return;
        }
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        if (this.lKi != null && this.lKl.compareTo(bbh2.getGUID().toString()) == 0) {
            this.lKi.setVisible(false);
        }
    }

    @Override
    public void f(bbi bbi2) {
        if (this.lKN == null) {
            return;
        }
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
    }

    @Override
    public void g(bbi bbi2) {
        if (this.lKN == null) {
            return;
        }
        if (!this.lKN.iG().equals(bbi2.iG())) {
            return;
        }
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        if (this.lKi != null && this.lKl.compareTo(bbi2.getGUID().toString()) == 0) {
            this.lKi.setVisible(false);
        }
    }

    @Override
    public void cyA() {
        if (!this.leq.sz(this.lKM.iG())) {
            return;
        }
        if (this.lKN == null) {
            return;
        }
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
    }

    @Override
    public void a(ays ays2, htw.a a2) {
        if (a2 != htw.a.ldq && a2 != htw.a.ldy) {
            return;
        }
        if (!this.leq.sz(this.lKM.iG())) {
            return;
        }
        if (this.lKN == null) {
            return;
        }
        this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
    }

    @Override
    protected void cON() {
        super.cON();
        if (this.lLk.cIi()) {
            if (this.isVisible()) {
                this.lLm.a(hyy.a.lrC, true);
                this.lLm.a(hyy.a.lrC, this);
                if (this.lLp != null) {
                    this.lLm.a(new hyy.a[]{this.lLp, hyy.a.lrC}, this.cEF());
                }
            } else {
                this.lLm.a(hyy.a.lrC, false);
                this.lLm.b(hyy.a.lrC);
                this.lLm.a(hyy.b.ltr, 0);
            }
        } else {
            this.lLm.a(hyy.b.ltr, this.isVisible() ? 1 : 0);
        }
    }

    @Override
    protected void c(hyy.b b2, int n) {
        switch (b2) {
            case ltH: {
                this.lLk.cIh();
                return;
            }
        }
    }

    @Override
    protected void cOO() {
        this.leq.a(this);
        this.lLl.a(this);
        if (this.lLs) {
            this.a("resetWindowState", new Object[0]);
        }
        this.a("takeClanInfo", new Object[]{this.lKM.a(this.leq.u(this.lKM), hso.cxK().bAn().Tr)});
        this.a("takePlayerClanStance", new Object[]{this.leq.u(this.lKM)});
        if (this.lKM instanceof aym) {
            this.lKN = (aym)this.lKM;
        }
        if (this.lKN == null) {
            this.leq.a((htl)this, this.lKM);
        } else {
            this.a("takeClanDetailedInfo", new Object[]{this.lKN.a(this.lLk.oB(), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        }
        this.cyy();
        this.lLs = false;
    }

    @Override
    protected void cOP() {
        this.a("setHeight", new Object[]{this.fc});
    }

    @Override
    protected void cOQ() {
        SFStringsClanOverviewDTO sFStringsClanOverviewDTO = new SFStringsClanOverviewDTO();
        sFStringsClanOverviewDTO.title = lwk.tej.bD(new Object[0]).exA();
        sFStringsClanOverviewDTO.titlePlayerClan = lwk.tek.bD(new Object[0]).exA();
        sFStringsClanOverviewDTO.clanCharterTitle = lwk.tda.bD(new Object[0]).exA();
        sFStringsClanOverviewDTO.leaderTitle = lwk.tdi.bD(new Object[0]).exA();
        sFStringsClanOverviewDTO.founderTitle = lwk.tdj.bD(new Object[0]).exA();
        sFStringsClanOverviewDTO.membersCount = lwk.tel.bD(new Object[0]).exA();
        sFStringsClanOverviewDTO.raceNameAlfar = lvm.sXh.bD(1).exA();
        sFStringsClanOverviewDTO.raceNameDwarf = lvm.sXh.bD(2).exA();
        sFStringsClanOverviewDTO.raceNameHuman = lvm.sXh.bD(3).exA();
        sFStringsClanOverviewDTO.raceNameMahirim = lvm.sXh.bD(4).exA();
        sFStringsClanOverviewDTO.raceNameMirdain = lvm.sXh.bD(5).exA();
        sFStringsClanOverviewDTO.raceNameOrk = lvm.sXh.bD(6).exA();
        sFStringsClanOverviewDTO.acceptingNewMembersText = lwk.tdd.bD(new Object[0]).exA();
        sFStringsClanOverviewDTO.holdingsTitle = lwk.tem.bD(new Object[0]).exA();
        sFStringsClanOverviewDTO.clanTagsTitle = lwk.tde.bD(new Object[0]).exA();
        sFStringsClanOverviewDTO.joinClanText = lwk.ten.bD(new Object[0]).exA();
        sFStringsClanOverviewDTO.joiningClanText = lwk.teo.bD(new Object[0]).exA();
        sFStringsClanOverviewDTO.updateClanText = lwk.tep.bD(new Object[0]).exA();
        sFStringsClanOverviewDTO.updatingClanText = lwk.tdh.bD(new Object[0]).exA();
        sFStringsClanOverviewDTO.restrictionsPreventApplicationText = lwk.teq.bD(new Object[0]).exA();
        sFStringsClanOverviewDTO.politicalStanceNames = bcr.getDisplayNames();
        sFStringsClanOverviewDTO.playerBannedFromJoiningText = lwk.ter.bD(new Object[0]).exA();
        sFStringsClanOverviewDTO.clanPointsTitle = lwk.tdN.bD(new Object[0]).exA();
        sFStringsClanOverviewDTO.villagesTitle = lwk.tcV.bD(new Object[0]).exA();
        sFStringsClanOverviewDTO.fortressesTitle = lwk.tes.bD(new Object[0]).exA();
        this.a("takeStrings", new Object[]{sFStringsClanOverviewDTO});
        this.a("takeConquestStrings", new Object[]{lwr.exR()});
    }

    @Override
    public hyn s(int n, int n2, String string) {
        if (string != null && string.startsWith("Holding-")) {
            String string2 = string.substring(8, string.indexOf(";"));
            Set<azg> set = this.lLl.na(this.lKM.iG());
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
                stringBuilder.append(this.lKM.iV());
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
                jjs jjs2 = new jjs(stringBuilder.toString(), n - (int)f, n2 - (int)(f2 += (float)n2 >= idr.cxO().cHk().H / 2.0f ? -20.0f : 20.0f), 50, 50);
                if (bl) {
                    this.lKi = jjs2;
                }
                return jjs2;
            }
        } else if (string != null && string.startsWith("Village-")) {
            String string3 = string.substring(8, string.indexOf(";"));
            Set<bbh> set = this.lLl.nh(this.lKM.iG());
            bbh bbh2 = null;
            for (bbh bbh3 : set) {
                if (bbh3.getID().compareTo(string3) != 0) continue;
                bbh2 = bbh3;
                break;
            }
            if (bbh2 != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ClanVillage;");
                stringBuilder.append(lzc.tOP.bD(new Object[0]).exA().toUpperCase());
                stringBuilder.append(";");
                stringBuilder.append("Owner=");
                stringBuilder.append(this.lKM.iV());
                stringBuilder.append(";");
                boolean bl = false;
                if (bbh2.acU() > 0.0 && bbh2.acU() > this.MessageDelegator.arc().rgz) {
                    stringBuilder.append("RemainingTime");
                    stringBuilder.append("=");
                    stringBuilder.append(lwk.teu.bD(bbh2.acU() - this.MessageDelegator.arc().rgz).exA().toUpperCase());
                    stringBuilder.append(";");
                    stringBuilder.append("RemainingTimeId");
                    stringBuilder.append("=");
                    stringBuilder.append(bbh2.getGUID().toString() + "-CaptureTimer");
                    stringBuilder.append(";");
                    this.lKj = bbh2.acU();
                    this.lKk = lwk.teu;
                    this.lKl = bbh2.getGUID().toString() + "-CaptureTimer";
                    bl = true;
                } else if (bbh2.ajT() > 0.0 && bbh2.ajT() > this.MessageDelegator.arc().rgz) {
                    stringBuilder.append("RemainingTime");
                    stringBuilder.append("=");
                    stringBuilder.append(lwk.tew.bD(new Object[0]).exA().toUpperCase());
                    stringBuilder.append(";");
                }
                stringBuilder.append("RequisitionStatus");
                stringBuilder.append("=");
                stringBuilder.append(lwk.tex.bD(new Object[0]).exA().toUpperCase());
                stringBuilder.append(";");
                if (bbh2.ajT() > 0.0 && bbh2.ajT() > this.MessageDelegator.arc().rgz) {
                    stringBuilder.append("RequisitionTime");
                    stringBuilder.append("=");
                    stringBuilder.append(lwk.tey.bD(bbh2.ajT() - this.MessageDelegator.arc().rgz).exA().toUpperCase());
                    stringBuilder.append(";");
                    stringBuilder.append("RequisitionTimeId");
                    stringBuilder.append("=");
                    stringBuilder.append(bbh2.getGUID().toString() + "-RequisitionTimer");
                    stringBuilder.append(";");
                    if (this.lKl == null) {
                        this.lKj = bbh2.ajT();
                        this.lKk = lwk.tey;
                        this.lKl = bbh2.getGUID().toString() + "-RequisitionTimer";
                    } else {
                        this.lKO = bbh2.ajT();
                        this.lKP = lwk.tey;
                        this.lKQ = bbh2.getGUID().toString() + "-RequisitionTimer";
                    }
                    bl = true;
                } else {
                    stringBuilder.append("RequisitionTime");
                    stringBuilder.append("=");
                    stringBuilder.append(lwk.tez.bD(new Object[0]).exA().toUpperCase());
                    stringBuilder.append(";");
                }
                stringBuilder.append("RequisitionRewardsPercentage");
                stringBuilder.append("=");
                stringBuilder.append(lzc.tPZ.bD((int)(bbh2.ajV() * 100.0f)).exA().toUpperCase());
                stringBuilder.append(";");
                stringBuilder.append("Name");
                stringBuilder.append("=");
                stringBuilder.append(lvm.sWZ.bD(string3).exA().toUpperCase());
                stringBuilder.append(";");
                String[] stringArray = string.split(";");
                float f = stringArray.length > 5 ? Float.parseFloat(stringArray[5]) : 0.0f;
                float f3 = stringArray.length > 6 ? Float.parseFloat(stringArray[6]) : 0.0f;
                jjs jjs3 = new jjs(stringBuilder.toString(), n - (int)f, n2 - (int)(f3 += (float)n2 >= idr.cxO().cHk().H / 2.0f ? -20.0f : 20.0f), 50, 50);
                if (bl) {
                    this.lKi = jjs3;
                }
                return jjs3;
            }
        }
        return super.s(n, n2, string);
    }

    @Override
    protected loz a(String string, lox lox2) {
        if (lox2 == null) {
            return super.a(string, lox2);
        }
        if (string.startsWith("OnlineIndicatorOffline") && this.leq.sz(this.lKM.iG())) {
            String string2 = string.substring(string.indexOf(":") + 1);
            ays ays2 = this.leq.sN(string2);
            if (ays2 == null) {
                return super.a(string, lox2);
            }
            return lyn.tHt.bD(this.ao(ays2.B(this.MessageDelegator.arc())));
        }
        return super.a(string, lox2);
    }

    public void q(hyn hyn2) {
        this.lKi = null;
        this.lKk = null;
        this.lKj = 0.0;
        this.lKl = null;
    }

    @llk
    public void showHoldingOverview(int n) {
        if (this.lKN == null || n < 0 || n >= this.lKN.abb().length || this.lKN.abb()[n] == null) {
            return;
        }
        idi idi2 = (idi)idx.a(iee.lMx);
        idi2.a(this.lKN.iG(), this.lKN.abb()[n]);
        this.lLk.a(iee.lMx, true);
    }

    @llk
    public void showHoldingOnMap(SFClanHoldingDetailsDTO sFClanHoldingDetailsDTO) {
        jju jju2;
        ayp ayp2 = null;
        ayp[] aypArray = this.lKN.abb();
        int n = aypArray.length;
        for (int j = 0; j < n; ++j) {
            ayp ayp3 = aypArray[j];
            if (ayp3.getID().compareTo(sFClanHoldingDetailsDTO.id) != 0) continue;
            ayp2 = ayp3;
            break;
        }
        if (ayp2 == null) {
            return;
        }
        ayp[] aypArray2 = aypArray = this.lLk == null ? null : this.lLk.cHw();
        if (aypArray == null) {
            return;
        }
        jju jju3 = jju2 = this.lLk == null ? null : this.lLk.cHB();
        if (jju2 == null) {
            return;
        }
        jju2.dKe();
        jju2.ae(ayp2.av().x, -ayp2.av().rlV);
        aypArray.a(hyc.lmJ, true);
    }

    @llk
    public void showVillageOnMap(SFClanVillageDetailsDTO sFClanVillageDetailsDTO) {
        jju jju2;
        jah jah2;
        jah jah3 = jah2 = this.lLk == null ? null : this.lLk.cHw();
        if (jah2 == null) {
            return;
        }
        jju jju3 = jju2 = this.lLk == null ? null : this.lLk.cHB();
        if (jju2 == null) {
            return;
        }
        bbh bbh2 = null;
        for (bbh bbh3 : this.lLl.nh(this.lKM.iG())) {
            if (sFClanVillageDetailsDTO.id.compareTo(bbh3.getID()) != 0) continue;
            bbh2 = bbh3;
            break;
        }
        if (bbh2 == null) {
            return;
        }
        jju2.dKe();
        jju2.ae(bbh2.av().x, -bbh2.av().rlV);
        jah2.a(hyc.lmJ, true);
    }

    @llk
    public void showFortressOnMap(SFClanFortressDetailsDTO sFClanFortressDetailsDTO) {
        jju jju2;
        jah jah2;
        jah jah3 = jah2 = this.lLk == null ? null : this.lLk.cHw();
        if (jah2 == null) {
            return;
        }
        jju jju3 = jju2 = this.lLk == null ? null : this.lLk.cHB();
        if (jju2 == null) {
            return;
        }
        bbi bbi2 = null;
        for (bbi bbi3 : this.lLl.nm(this.lKM.iG())) {
            if (sFClanFortressDetailsDTO.id.compareTo(bbi3.ajX()) != 0) continue;
            bbi2 = bbi3;
            break;
        }
        if (bbi2 == null) {
            return;
        }
        jju2.dKe();
        jju2.ae(bbi2.av().x, -bbi2.av().rlV);
        jah2.a(hyc.lmJ, true);
    }

    @llk
    public void updatePoliticalStance(int n) {
        this.leq.a(this, this.lKM, n);
    }

    @llk
    public void applyToJoinClan() {
        this.leq.a(this, this.lKM);
    }

    @llk
    public void showChallengeDetails(SFConquestChallengeDTO sFConquestChallengeDTO) {
        idm idm2 = (idm)idx.a(iee.lMG);
        azz azz2 = this.ler.sR(sFConquestChallengeDTO.holdingID);
        if (azz2 == null) {
            return;
        }
        idm2.c(azz2);
        this.lLk.a(iee.lMG, true);
    }

    @llk
    public void mercenaryContractAccepted(SFConquestChallengeDTO sFConquestChallengeDTO, SFConquestMercenaryContractDTO sFConquestMercenaryContractDTO) {
        if (this.lKE != null) {
            return;
        }
        azz azz2 = this.ler.sR(sFConquestChallengeDTO.holdingID);
        if (azz2 == null) {
            return;
        }
        bao bao2 = this.leq.A(azz2.afl(), sFConquestMercenaryContractDTO.clanName);
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
        azz azz2 = this.ler.sR(sFConquestChallengeDTO.holdingID);
        if (azz2 == null) {
            return;
        }
        idl idl2 = (idl)idx.a(iee.lMH);
        idl2.F(this.leq.A(azz2.afl(), sFConquestMercenaryContractDTO.clanName));
        idl2.c(azz2);
        this.lLk.a(iee.lMH, true);
    }

    @llk
    public void mercenaryContractRejected(SFConquestChallengeDTO sFConquestChallengeDTO, SFConquestMercenaryContractDTO sFConquestMercenaryContractDTO) {
        if (this.lKE != null) {
            return;
        }
        azz azz2 = this.ler.sR(sFConquestChallengeDTO.holdingID);
        if (azz2 == null) {
            return;
        }
        bao bao2 = this.leq.A(azz2.afl(), sFConquestMercenaryContractDTO.clanName);
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
        azz azz2 = this.ler.sR(sFConquestChallengeDTO.holdingID);
        if (azz2 == null) {
            return;
        }
        bao bao2 = this.leq.z(azz2.afl(), sFConquestMercenaryContractDTO.clanName);
        if (bao2 == null) {
            return;
        }
        this.lKE = bao2;
        this.leq.c(bao2, this);
    }

    @llk
    public void openChatWhisper(String string) {
        if (hso.cxK() == null || hso.cxK().cxP() == null || hso.cxK().cxP().cyZ() == null) {
            return;
        }
        String string2 = hso.cxK().cxP().cyZ().cAt() + " " + hso.cxK().cxP().cyZ().cAu();
        if (string2.compareTo(string) == 0) {
            return;
        }
        idr.cyJ().oh(string);
    }
}

