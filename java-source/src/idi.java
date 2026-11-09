/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  jju
 */
import java.util.Iterator;
import java.util.Set;
import spenefett.hid.gui.serialization.dto.SFClanCityConfigurationUpdateDTO;
import spenefett.hid.gui.serialization.dto.SFClanCityStanceToPlayerDTO;
import spenefett.hid.gui.serialization.dto.SFClanHoldingCitizenDTO;
import spenefett.hid.gui.serialization.dto.SFClanVillageDetailsDTO;
import spenefett.hid.gui.serialization.dto.SFStringsClanCityOverviewDTO;

public class idi
extends idw
implements bto,
hta,
hte,
htf,
htg,
hti,
htl,
htn,
hto,
htp,
htr,
htx,
hud,
huf,
huu,
hvc {
    private double lKf = 1.0;
    private ldv dpx = null;
    private ayp lJY = null;
    private idq lKg = null;
    private lox lKh = null;
    private jjs lKi = null;
    private double lKj = 0.0;
    private lox lKk = null;
    private String lKl = null;
    private boolean lKe = false;

    public ldv iG() {
        return this.dpx;
    }

    public ayp bKm() {
        return this.lJY;
    }

    public void a(ldv ldv2, ayp ayp2) {
        this.dpx = ldv2;
        this.lJY = ayp2;
        this.lKe = false;
    }

    idi() {
        super("ClanCityOverview", "clancityoverview.swf", iee.lMx);
    }

    @Override
    public void cleanUp() {
        if (this.lKg != null) {
            this.lKg = null;
        }
        super.cleanUp();
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
            if (this.lJY != null && this.lLl.nc(this.lJY.getGUID())) {
                double d2 = this.lLl.nd(this.lJY.getGUID());
                if (d2 > 0.0) {
                    this.a("updateProtectionTimerString", new Object[]{lwa.tcS.bD(d2).exA()});
                }
            } else {
                double d3 = this.lJY.abt() - ldz2.rgz;
                if (d3 > 0.0) {
                    this.a("updateProtectionTimerString", new Object[]{this.lJY.abs() ? lwa.tcU.bD(d3, jng.itG.a(this.lJY.abi(), this.lJY.abr(), this.lJY.abu(), this.lJY.Xx())).exA() : lwa.tcT.bD(d3).exA()});
                }
            }
            if (this.lKi != null) {
                this.lKi.setText(this.lKl, this.lKk.bD(this.lKj - this.MessageDelegator.arc().rgz).exA().toUpperCase());
            }
        }
    }

    @Override
    protected void cOO() {
        this.leq.a(this);
        this.lLl.a(this);
        this.ler.a(this);
        this.lKe = false;
        if (this.lLs) {
            this.a("resetWindowState", new Object[0]);
        }
        this.a("takeHoldingDetails", new Object[]{this.lJY.a(hso.cxK().cxT().oB(), this.leq.sB(this.lJY.YS()), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        if (this.lJY != null && this.lJY.abo() != null) {
            this.a("takeHoldingBlueprint", new Object[]{this.lJY.abv()});
        }
        this.leq.a(this.dpx, this.lJY, this);
        azz azz2 = this.ler.sX(this.lJY.getGUID());
        if (azz2 == null) {
            boolean bl = false;
            if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null) {
                boolean bl2 = bl = hso.cxK().cxP().cyZ().kv() && !iw.nD();
            }
            if (!this.leq.dNh() || this.leq.dNi().iG().equals(this.dpx) || !this.leq.i(bca.cUy) || this.lLl.nc(this.lJY.getGUID()) || bl) {
                this.a("removeConquestComponent", new Object[0]);
            } else {
                this.a("showConquestInitiationComponent", new Object[]{this.leq.a(this.lJY.abi(), this.lJY.Xx(), this.lJY.abj(), null)});
            }
        } else {
            this.a("takeConquestChallenge", new Object[]{azz2.a(this.leq)});
        }
        this.lLs = false;
    }

    @Override
    protected void cOP() {
        this.a("setHeight", new Object[]{this.fc});
    }

    @Override
    public void cEc() {
        super.cEc();
        if (this.cEU() && this.lKe) {
            this.a("takeHoldingBlueprint", new Object[]{this.lJY.abv()});
            this.lKe = false;
        }
    }

    @Override
    public void oi() {
        this.leq.a(this.dpx, this.lJY, this);
    }

    @Override
    public void cyy() {
        this.leq.a(this.dpx, this.lJY, this);
    }

    @Override
    public void b(aym aym2) {
        if (!aym2.iG().equals(this.dpx)) {
            return;
        }
        this.leq.a(this.dpx, this.lJY, this);
    }

    @Override
    public void c(aym aym2) {
        boolean bl = false;
        if (aym2.abb() != null) {
            for (int j = 0; j < aym2.abb().length; ++j) {
                if (!aym2.abb()[j].getGUID().equals(this.lJY.getGUID())) continue;
                bl = true;
            }
        }
        if (aym2.iG().equals(this.dpx) || bl) {
            this.lLk.cIh();
        } else {
            this.lLs = true;
            this.cOO();
        }
    }

    @Override
    public void a(aym aym2, ayp ayp2, Set<aze> set) {
        if (!this.lJY.getGUID().equals(ayp2.getGUID())) {
            return;
        }
        this.lJY = ayp2;
        if (!this.cEU()) {
            this.lKe = true;
            return;
        }
        this.a("takeHoldingBlueprint", new Object[]{this.lJY.abv()});
    }

    @Override
    public void a(ldv ldv2, ldv ldv3, SFClanCityStanceToPlayerDTO sFClanCityStanceToPlayerDTO) {
        if (!ldv2.equals(this.dpx)) {
            return;
        }
        if (!ldv3.equals(this.lJY.getGUID())) {
            return;
        }
        this.a("setPlayerStanceValues", new Object[]{sFClanCityStanceToPlayerDTO});
    }

    @Override
    public void nu(String string) {
        this.a("cityUpdateSucceeded", new Object[]{string});
    }

    @Override
    public void nv(String string) {
        this.a("cityUpdateFailed", new Object[]{string});
    }

    @Override
    public void d(ayp ayp2) {
        if (!this.lJY.getGUID().equals(ayp2.getGUID())) {
            return;
        }
        this.lJY = ayp2;
        this.a("takeHoldingDetailsUpdate", new Object[]{this.lJY.a(hso.cxK().cxT().oB(), this.leq.sB(this.lJY.YS()), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        this.leq.a(this.dpx, this.lJY, this);
    }

    @Override
    public void e(ayp ayp2) {
        if (!this.lJY.getGUID().equals(ayp2.getGUID())) {
            return;
        }
        this.lJY = ayp2;
        this.a("takeHoldingDetailsUpdate", new Object[]{this.lJY.a(hso.cxK().cxT().oB(), this.leq.sB(this.lJY.YS()), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
    }

    @Override
    public void nq(String string) {
        this.a("conquestInitiationFailed", new Object[]{string});
    }

    @Override
    public void nr(String string) {
        this.a("conquestInitiationSucceeded", new Object[]{string});
    }

    @Override
    public void cyx() {
        azz azz2 = this.ler.sX(this.lJY.getGUID());
        if (azz2 == null) {
            boolean bl = false;
            if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null) {
                boolean bl2 = bl = hso.cxK().cxP().cyZ().kv() && !iw.nD();
            }
            if (!this.leq.dNh() || this.leq.dNi().iG().equals(this.dpx) || !this.leq.i(bca.cUy) || this.lLl.nc(this.lJY.getGUID()) || bl) {
                this.a("removeConquestComponent", new Object[0]);
            } else {
                this.a("showConquestInitiationComponent", new Object[]{this.leq.a(this.lJY.abi(), this.lJY.Xx(), this.lJY.abj(), null)});
            }
        } else {
            this.a("takeConquestChallenge", new Object[]{azz2.a(this.leq)});
            this.lKf = 0.0;
        }
        this.a("takeHoldingDetailsUpdate", new Object[]{this.lJY.a(hso.cxK().cxT().oB(), this.leq.sB(this.lJY.YS()), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
    }

    @Override
    public void b(azz azz2) {
        if (azz2.afl().equals(this.lJY.getGUID())) {
            this.a("takeConquestChallenge", new Object[]{azz2.a(this.leq)});
            this.lKf = 0.0;
        }
    }

    @Override
    public void f(azx azx2) {
        if (azx2.afl().equals(this.lJY.getGUID())) {
            this.a("updateBindstoneHealth", new Object[]{Float.valueOf(azx2.afn())});
        }
    }

    @Override
    public void d(azx azx2, azv azv2, azw azw2) {
        if (azx2.afl().equals(this.lJY.getGUID())) {
            this.a("updateSiegeStoneHealth", new Object[]{azw2.getName(), Float.valueOf(azw2.afi())});
        }
    }

    @Override
    public void e(azx azx2, azv azv2) {
        if (azx2.afl().equals(this.lJY.getGUID())) {
            azz azz2 = this.ler.sX(this.lJY.getGUID());
            if (azz2 == null) {
                return;
            }
            this.a("updateAttackerScore", new Object[]{azz2.fC(azv2.getGUID()), azv2.aer()});
        }
    }

    @Override
    public void g(azx azx2) {
        if (azx2.afl().equals(this.lJY.getGUID())) {
            this.a("updateWallRequirement", new Object[]{azx2.afo()});
        }
    }

    @Override
    public void cyE() {
        if (!this.leq.sz(this.lJY.abj())) {
            this.a("takeHoldingDetailsUpdate", new Object[]{this.lJY.a(hso.cxK().cxT().oB(), this.leq.sB(this.lJY.YS()), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
            azz azz2 = this.ler.sX(this.lJY.getGUID());
            if (azz2 == null) {
                boolean bl = false;
                if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null) {
                    boolean bl2 = bl = hso.cxK().cxP().cyZ().kv() && !iw.nD();
                }
                if (!this.leq.dNh() || this.leq.dNi().iG().equals(this.dpx) || !this.leq.i(bca.cUy) || this.lLl.nc(this.lJY.getGUID()) || bl) {
                    this.a("removeConquestComponent", new Object[0]);
                } else {
                    this.a("showConquestInitiationComponent", new Object[]{this.leq.a(this.lJY.abi(), this.lJY.Xx(), this.lJY.abj(), null)});
                }
            } else {
                this.a("takeConquestChallenge", new Object[]{azz2.a(this.leq)});
                this.lKf = 0.0;
            }
        }
    }

    @Override
    public void nI(String string) {
        this.a("mercenaryContractIssueFailed", new Object[]{string});
    }

    @Override
    public void nJ(String string) {
        this.a("mercenaryContractIssueSucceeded", new Object[]{string});
    }

    @Override
    public void cyF() {
    }

    @Override
    public void i(azg azg2) {
        if (!this.lJY.getGUID().equals(azg2.getGUID())) {
            return;
        }
        this.lLk.cIh();
    }

    @Override
    public void j(azg azg2) {
        if (!this.lJY.getGUID().equals(azg2.getGUID())) {
            return;
        }
        this.a("takeHoldingDetailsUpdate", new Object[]{this.lJY.a(hso.cxK().cxT().oB(), this.leq.sB(this.lJY.YS()), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
        this.leq.a(this.dpx, this.lJY, this);
        boolean bl = false;
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null) {
            boolean bl2 = bl = hso.cxK().cxP().cyZ().kv() && !iw.nD();
        }
        if (azg2.acV() > this.MessageDelegator.arc().rgz || bl) {
            this.a("removeConquestComponent", new Object[0]);
        } else if (this.leq.dNh() && !this.leq.dNi().iG().equals(this.dpx) && this.leq.i(bca.cUy) && !this.ler.sZ(this.lJY.getGUID())) {
            this.a("showConquestInitiationComponent", new Object[]{this.leq.a(this.lJY.abi(), this.lJY.Xx(), this.lJY.abj(), null)});
        } else {
            azz azz2 = this.ler.sX(this.lJY.getGUID());
            if (azz2 != null) {
                this.a("takeConquestChallenge", new Object[]{azz2.a(this.leq)});
                this.lKf = 0.0;
            }
        }
    }

    @Override
    public void cyB() {
        azz azz2 = this.ler.sX(this.lJY.getGUID());
        if (azz2 == null) {
            boolean bl = false;
            if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null) {
                boolean bl2 = bl = hso.cxK().cxP().cyZ().kv() && !iw.nD();
            }
            if (!this.leq.dNh() || this.leq.dNi().iG().equals(this.dpx) || !this.leq.i(bca.cUy) || this.lLl.nc(this.lJY.getGUID()) || bl) {
                this.a("removeConquestComponent", new Object[0]);
            } else {
                this.a("showConquestInitiationComponent", new Object[]{this.leq.a(this.lJY.abi(), this.lJY.Xx(), this.lJY.abj(), null)});
            }
        } else {
            this.a("takeConquestChallenge", new Object[]{azz2.a(this.leq)});
            this.lKf = 0.0;
        }
        this.a("takeHoldingDetailsUpdate", new Object[]{this.lJY.a(hso.cxK().cxT().oB(), this.leq.sB(this.lJY.YS()), this.leq, this.ler, this.lLl, this.MessageDelegator.arc())});
    }

    @Override
    protected void cON() {
        super.cON();
        if (this.isVisible()) {
            this.lLm.a(hyy.a.lrI, true);
            this.lLm.a(hyy.a.lrI, this);
            if (this.lKg != null) {
                if (this.lKg.cOX() != null) {
                    this.a("takeSelectedMayor", new Object[]{this.lKg.cOX().abM()});
                }
                this.lKg = null;
            }
            if (this.lLp != null) {
                this.lLm.a(new hyy.a[]{this.lLp, hyy.a.lrI}, this.cEF());
            }
        } else {
            this.lLm.a(hyy.a.lrI, false);
            this.lLm.b(hyy.a.lrI);
        }
    }

    @Override
    protected void c(hyy.b b2, int n) {
        switch (b2) {
            case lub: {
                this.lLk.cIh();
                return;
            }
        }
    }

    @Override
    protected void cOQ() {
        this.lKh = lwa.lKh;
        if (this.lKg != null) {
            this.lKg.d(this.lKh);
        }
        SFStringsClanCityOverviewDTO sFStringsClanCityOverviewDTO = new SFStringsClanCityOverviewDTO();
        sFStringsClanCityOverviewDTO.title = lwa.tce.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.stancePlayerCanEnter = lwa.tcy.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.stancePlayerCannotEnter = lwa.tcz.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.stancePlayerCanBind = lwa.tcA.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.stancePlayerIsBound = lwa.tcB.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.mayorTitle = lwa.tcC.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.noMayorText = lwa.tcD.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.guardPolicyTitle = lwa.tcE.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.guardPolicyNames = cla.getDisplayNames();
        sFStringsClanCityOverviewDTO.bankAccessPolicyTitle = lwa.tcF.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.bankAccessPolicyNames = ayx.getDisplayNames();
        sFStringsClanCityOverviewDTO.citizenListTitle = lwa.tcH.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.updateCityAction = lwa.tcI.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.updatingCityAction = lwa.tcJ.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.conquestTitle = lwa.tcK.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.gateControlPolicyTitle = lwa.tcL.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.gateControlPolicyNames = azf.getDisplayNames();
        sFStringsClanCityOverviewDTO.protectionTitle = lwa.tcM.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.protectionDescriptions = azh.getDisplayNames();
        sFStringsClanCityOverviewDTO.protectionCanBeAutoRenewed = lwa.tcO.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.protectionCannotBeAutoRenewed = lwa.tcP.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.protectionCanIncludeAssetDamage = lwa.tcQ.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.protectionCannotIncludeAssetDamage = lwa.tcR.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.villagesTitle = lwa.tcV.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.cityMapTitle = lwa.tcl.bD(new Object[0]).exA();
        sFStringsClanCityOverviewDTO.marketAccessPolicyTitle = lwa.tcG.bD(new Object[0]).exA();
        this.a("takeStrings", new Object[]{sFStringsClanCityOverviewDTO});
        this.a("takeConquestStrings", new Object[]{lwr.exR()});
    }

    @Override
    protected void cOR() {
        super.cOR();
        if (!lLj.containsKey("ClanCityOverviewShowOnMap")) {
            lLj.put("ClanCityOverviewShowOnMap", new lfs<lox, lox>(lym.tGm, lym.tGn));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public hyn s(int n, int n2, String string) {
        if (string != null && string.startsWith("Holding-")) {
            String string2 = string.substring(8, string.indexOf(";"));
            Set<azg> set = this.lLl.na(this.lJY.abj());
            azg azg2 = null;
            for (azg azg3 : set) {
                if (azg3.getID().compareTo(string2) != 0) continue;
                azg2 = azg3;
                break;
            }
            if (azg2 != null) {
                void var8_17;
                StringBuilder stringBuilder = new StringBuilder();
                switch (this.lJY.abi()) {
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
                stringBuilder.append(this.lJY.abk());
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
                    boolean object = true;
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
                    boolean bl2 = true;
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
                    boolean bl3 = true;
                }
                stringBuilder.append("Name");
                stringBuilder.append("=");
                stringBuilder.append(lvm.sWY.bD(string2).exA().toUpperCase());
                stringBuilder.append(";");
                String[] stringArray = string.split(";");
                float f = stringArray.length > 5 ? Float.parseFloat(stringArray[5]) : 0.0f;
                float f2 = stringArray.length > 6 ? Float.parseFloat(stringArray[6]) : 0.0f;
                jjs jjs2 = new jjs(stringBuilder.toString(), n - (int)f, n2 - (int)(f2 += (float)n2 >= idi.cxO().cHk().H / 2.0f ? -20.0f : 20.0f), 50, 50);
                if (var8_17 != false) {
                    this.lKi = jjs2;
                }
                return jjs2;
            }
        } else if (string != null && string.startsWith("Village-")) {
            String string3 = string.substring(8, string.indexOf(";"));
            Set<bbh> set = this.lLl.ni(this.lJY.getGUID());
            bbh bbh2 = null;
            for (bbh bbh3 : set) {
                if (bbh3.getID().compareTo(string3) != 0) continue;
                bbh2 = bbh3;
                break;
            }
            if (bbh2 != null) {
                Iterator<bbh> iterator = bbh2.iG() == null ? null : this.lLl.mX(bbh2.iG());
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ClanVillage;");
                stringBuilder.append(lzc.tOP.bD(new Object[0]).exA().toUpperCase());
                stringBuilder.append(";");
                boolean bl = false;
                if (iterator != null) {
                    stringBuilder.append("Owner=");
                    stringBuilder.append(((bcp)((Object)iterator)).iV());
                    stringBuilder.append(";");
                    if (bbh2.acU() > this.MessageDelegator.arc().rgz) {
                        stringBuilder.append("RemainingTime");
                        stringBuilder.append("=");
                        stringBuilder.append(lwa.tcW.bD(bbh2.acU() - this.MessageDelegator.arc().rgz).exA().toUpperCase());
                        stringBuilder.append(";");
                        stringBuilder.append("RemainingTimeId");
                        stringBuilder.append("=");
                        stringBuilder.append(bbh2.getGUID().toString());
                        stringBuilder.append(";");
                        this.lKj = bbh2.acU();
                        this.lKk = lwa.tcW;
                        this.lKl = bbh2.getGUID().toString();
                        bl = true;
                    } else {
                        stringBuilder.append("RemainingTime");
                        stringBuilder.append("=");
                        stringBuilder.append(lwk.tew.bD(new Object[0]).exA().toUpperCase());
                        stringBuilder.append(";");
                    }
                    if (bbh2.ajT() > this.MessageDelegator.arc().rgz) {
                        stringBuilder.append("RequisitionTime");
                        stringBuilder.append("=");
                        stringBuilder.append(lwa.tcW.bD(bbh2.acU() - this.MessageDelegator.arc().rgz).exA().toUpperCase());
                        stringBuilder.append(";");
                    }
                }
                stringBuilder.append("Name");
                stringBuilder.append("=");
                stringBuilder.append(lvm.sWZ.bD(string3).exA().toUpperCase());
                stringBuilder.append(";");
                String[] stringArray = string.split(";");
                float f = stringArray.length > 5 ? Float.parseFloat(stringArray[5]) : 0.0f;
                float f3 = stringArray.length > 6 ? Float.parseFloat(stringArray[6]) : 0.0f;
                jjs jjs3 = new jjs(stringBuilder.toString(), n - (int)f, n2 - (int)(f3 += (float)n2 >= idi.cxO().cHk().H / 2.0f ? -20.0f : 20.0f), 50, 50);
                if (bl) {
                    this.lKi = jjs3;
                }
                return jjs3;
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
    public void showHoldingOnMap() {
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
        jju2.dKe();
        jju2.ae(this.lJY.av().x, -this.lJY.av().rlV);
        jah2.a(hyc.lmJ, true);
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
        for (bbh bbh3 : this.lLl.ni(this.lJY.getGUID())) {
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
    public void showBuildHoldingWindow() {
        idh idh2 = (idh)idx.a(iee.lMy);
        idh2.a(this.dpx, this.lJY);
        this.lLk.a(iee.lMy, true);
    }

    @llk
    public void updateCityConfiguration(SFClanCityConfigurationUpdateDTO sFClanCityConfigurationUpdateDTO) {
        try {
            Set<ldv> set = lcn.emx();
            block2: for (SFClanHoldingCitizenDTO sFClanHoldingCitizenDTO : sFClanCityConfigurationUpdateDTO.citizensToKick) {
                for (ayz ayz2 : this.lJY.abp()) {
                    if (ayz2.iU().compareToIgnoreCase(sFClanHoldingCitizenDTO.playerName) != 0) continue;
                    set.add(ayz2.ach());
                    continue block2;
                }
            }
            this.leq.a(this.lJY.getGUID(), this.leq.a(sFClanCityConfigurationUpdateDTO.mayor), cla.getValueByOrdinal(sFClanCityConfigurationUpdateDTO.guardPolicy), ayx.getValueByOrdinal(sFClanCityConfigurationUpdateDTO.bankAccessPolicy), ayx.getValueByOrdinal(sFClanCityConfigurationUpdateDTO.marketAccessPolicy), azf.getValueByOrdinal(sFClanCityConfigurationUpdateDTO.gateControlPolicy), set.toArray(new ldv[set.size()]), azh.getValueByOrdinal(sFClanCityConfigurationUpdateDTO.protectionIndex), sFClanCityConfigurationUpdateDTO.protectionAutoRenew, sFClanCityConfigurationUpdateDTO.protectionIncludesAssetDamage, this);
        }
        catch (Throwable throwable) {
            this.a("cityUpdateFailed", new Object[]{aza.cCI.YF().bD(new Object[0]).exA()});
        }
    }

    @llk
    public void showClanMemberSelector() {
        this.lKg = (idq)idx.a(iee.lME);
        this.lKg.d(this.lKh);
        this.lKg.e(lyq.tIR);
        if (this.lJY.YS() != null) {
            this.lKg.c(new ays[]{this.leq.sB(this.lJY.YS())});
        }
        this.lLk.a(iee.lME, true);
    }

    @llk
    public void initiateConquestRequested(int n) {
        if (n <= 0) {
            this.a("conquestInitiationFailed", new Object[]{mat.rXy.bD(new Object[0]).toString()});
            return;
        }
        this.leq.a(this.lJY, n, this);
    }

    @llk
    public void applyToJoinDefendersAsMercenary(int n, double d2) {
        if (n <= 0 && d2 < 0.0 && d2 > 1.0) {
            this.a("mercenaryContractIssueFailed", new Object[]{mas.udH.bD(new Object[0]).exA()});
            return;
        }
        this.leq.a(this.lJY.getGUID(), this.lJY.getID(), n, (float)d2, new ldv[]{this.dpx}, this);
    }
}

