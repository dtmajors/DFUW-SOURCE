/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  lcw
 */
import java.util.Set;
import spenefett.hid.gui.serialization.dto.SFConquestChallengeAttackerDTO;
import spenefett.hid.gui.serialization.dto.SFConquestChallengeAttackerSiegeStoneDTO;
import spenefett.hid.gui.serialization.dto.SFConquestChallengeDTO;
import spenefett.hid.gui.serialization.dto.SFConquestChallengeDefenderMercenaryDTO;
import spenefett.hid.gui.serialization.dto.SFConquestChallengesDTO;
import spenefett.hid.gui.serialization.dto.SFConquestMercenaryContractDTO;
import spenefett.hid.gui.serialization.dto.SFStringsConquestChallengesDTO;

public class idk
extends idw
implements bto,
hte,
htf,
htg,
hth {
    private double lKf = 1.0;
    private azz[] lKp = null;
    private jjs lKi = null;
    private double lKj = 0.0;
    private lox lKk = null;
    private String lKl = null;

    idk() {
        super("ClanConquestChallenges", "clanconquestchallenges.swf", iee.lMF);
    }

    private azz rv(ldv ldv2) {
        if (this.lKp == null) {
            return null;
        }
        for (int j = 0; j < this.lKp.length; ++j) {
            if (!this.lKp[j].afl().equals(ldv2)) continue;
            return this.lKp[j];
        }
        return null;
    }

    @Override
    protected void cON() {
        super.cON();
        this.lLm.a(hyy.b.lty, this.isVisible() ? 1 : 0);
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
    protected void cOO() {
        if (lcw.enb()) {
            this.a("takeChallenges", new Object[]{this.cOT()});
        } else {
            this.lKp = this.ler.sY(this.leq.dNi().iG());
            azz azz2 = this.lLk.cIn() == null ? null : this.lLk.cIn().cQf();
            SFConquestChallengesDTO sFConquestChallengesDTO = new SFConquestChallengesDTO();
            sFConquestChallengesDTO.challenges = lcn.emv();
            sFConquestChallengesDTO.gameModeChallengeIdx = -1;
            for (int j = 0; j < this.lKp.length; ++j) {
                sFConquestChallengesDTO.challenges.add(this.lKp[j].a(this.leq));
                if (azz2 == null || !this.lKp[j].afl().equals(azz2.afl())) continue;
                sFConquestChallengesDTO.gameModeChallengeIdx = j;
            }
            this.a("takeChallenges", new Object[]{sFConquestChallengesDTO});
        }
        this.leq.a(this);
    }

    @Override
    protected void cOP() {
        this.a("setHeight", new Object[]{this.fc});
    }

    @Override
    public void oi() {
        if (this.lLk.cIj()) {
            this.lLk.pq(false);
        }
    }

    @Override
    public void cyx() {
        if (lcw.enb()) {
            this.a("takeChallenges", new Object[]{this.cOT()});
        } else {
            if (!this.leq.dNh()) {
                this.lLk.cIh();
                return;
            }
            this.lKp = this.ler.sY(this.leq.dNi().iG());
            this.lKf = 0.0;
            azz azz2 = this.lLk.cIn() == null ? null : this.lLk.cIn().cQf();
            SFConquestChallengesDTO sFConquestChallengesDTO = new SFConquestChallengesDTO();
            sFConquestChallengesDTO.challenges = lcn.emv();
            sFConquestChallengesDTO.gameModeChallengeIdx = -1;
            for (int j = 0; j < this.lKp.length; ++j) {
                sFConquestChallengesDTO.challenges.add(this.lKp[j].a(this.leq));
                if (azz2 == null || !this.lKp[j].afl().equals(azz2.afl())) continue;
                sFConquestChallengesDTO.gameModeChallengeIdx = j;
            }
            this.a("takeChallenges", new Object[]{sFConquestChallengesDTO});
            if (this.lKi != null) {
                this.lKi.setVisible(false);
            }
        }
    }

    @Override
    public void b(azz azz2) {
        if (lcw.enb()) {
            this.a("takeChallenges", new Object[]{this.cOT()});
        } else {
            if (!this.leq.dNh()) {
                this.lLk.cIh();
                return;
            }
            this.lKp = this.ler.sY(this.leq.dNi().iG());
            this.lKf = 0.0;
            azz azz3 = this.lLk.cIn() == null ? null : this.lLk.cIn().cQf();
            SFConquestChallengesDTO sFConquestChallengesDTO = new SFConquestChallengesDTO();
            sFConquestChallengesDTO.challenges = lcn.emv();
            sFConquestChallengesDTO.gameModeChallengeIdx = -1;
            for (int j = 0; j < this.lKp.length; ++j) {
                sFConquestChallengesDTO.challenges.add(this.lKp[j].a(this.leq));
                if (azz3 == null || !this.lKp[j].afl().equals(azz3.afl())) continue;
                sFConquestChallengesDTO.gameModeChallengeIdx = j;
            }
            this.a("takeChallenges", new Object[]{sFConquestChallengesDTO});
            if (this.lKi != null) {
                this.lKi.setVisible(false);
            }
        }
    }

    @Override
    public void f(azx azx2) {
        azz azz2 = this.rv(azx2.afl());
        if (azz2 == null) {
            return;
        }
        this.a("updateChallengeBindstoneHealth", new Object[]{azz2.afw(), Float.valueOf(azx2.afn())});
    }

    @Override
    public void d(azx azx2, azv azv2, azw azw2) {
        azz azz2 = this.rv(azx2.afl());
        if (azz2 == null) {
            return;
        }
        this.a("updateChallengeSiegeStoneHealth", new Object[]{azz2.afw(), azz2.fC(azv2.getGUID()), azw2.getName(), Float.valueOf(azw2.afi())});
    }

    @Override
    public void e(azx azx2, azv azv2) {
        azz azz2 = this.rv(azx2.afl());
        if (azz2 == null) {
            return;
        }
        this.a("updateChallengeAttackerScore", new Object[]{azz2.afw(), azz2.fC(azv2.getGUID()), azv2.aer()});
    }

    @Override
    public void g(azx azx2) {
        azz azz2 = this.rv(azx2.afl());
        if (azz2 == null) {
            return;
        }
        this.a("updateChallengeWallRequirement", new Object[]{azz2.afw(), azx2.afo()});
    }

    @Override
    protected void cOQ() {
        SFStringsConquestChallengesDTO sFStringsConquestChallengesDTO = new SFStringsConquestChallengesDTO();
        sFStringsConquestChallengesDTO.title = lwc.tce.bD(new Object[0]).exA();
        this.a("takeStrings", new Object[]{sFStringsConquestChallengesDTO});
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
                jjs jjs2 = new jjs(stringBuilder.toString(), n - (int)f, n2 - (int)(f2 += (float)n2 >= idk.cxO().cHk().H / 2.0f ? -20.0f : 20.0f), 50, 50);
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
    public void showInGameMode(SFConquestChallengeDTO sFConquestChallengeDTO) {
        azz azz2 = null;
        int n = -1;
        for (int j = 0; j < this.lKp.length; ++j) {
            if (this.lKp[j].afw().compareToIgnoreCase(sFConquestChallengeDTO.holdingID) != 0) continue;
            azz2 = this.lKp[j];
            n = j;
            break;
        }
        if (azz2 == null) {
            return;
        }
        ien ien2 = this.lLk.cIn();
        if (ien2 == null) {
            return;
        }
        azz azz3 = ien2.cQf();
        if (azz3 == null || !azz2.afl().equals(azz3.afl())) {
            ien2.c(azz2);
            this.a("setGameModeChallengeIndex", new Object[]{n});
            hso.cxK().a(jnz.nFE);
        } else if (azz3.afl().equals(azz2.afl())) {
            ien2.c((azz)null);
            this.a("setGameModeChallengeIndex", new Object[]{-1});
        }
    }

    @llk
    public void showDetails(SFConquestChallengeDTO sFConquestChallengeDTO) {
        idm idm2 = (idm)idx.a(iee.lMG);
        azz azz2 = null;
        for (azz azz3 : this.lKp) {
            if (azz3.afw().compareToIgnoreCase(sFConquestChallengeDTO.holdingID) != 0) continue;
            azz2 = azz3;
            break;
        }
        if (azz2 == null) {
            return;
        }
        idm2.c(azz2);
        this.lLk.a(iee.lMG, true);
    }

    private SFConquestChallengesDTO cOT() {
        SFConquestChallengesDTO sFConquestChallengesDTO = new SFConquestChallengesDTO();
        sFConquestChallengesDTO.challenges = lcn.emA();
        sFConquestChallengesDTO.challenges.add(this.a(a.lKu, 1));
        sFConquestChallengesDTO.challenges.add(this.a(a.lKw, 2));
        sFConquestChallengesDTO.challenges.add(this.a(a.lKv, 3));
        sFConquestChallengesDTO.challenges.add(this.a(a.lKw, 4));
        sFConquestChallengesDTO.challenges.add(this.a(a.lKu, 5));
        return sFConquestChallengesDTO;
    }

    private SFConquestChallengeDTO a(a a2, int n) {
        boolean bl = a2 == a.lKq;
        boolean bl2 = a2 == a.lKr || a2 == a.lKs || a2 == a.lKt;
        boolean bl3 = a2 != a.lKB && a2 != a.lKt;
        boolean bl4 = a2 == a.lKu;
        boolean bl5 = a2 == a.lKv;
        boolean bl6 = a2 == a.lKw;
        boolean bl7 = a2 == a.lKy || a2 == a.lKx || a2 == a.lKr;
        boolean bl8 = a2 == a.lKz || a2 == a.lKx || a2 == a.lKr;
        SFConquestChallengeDTO sFConquestChallengeDTO = new SFConquestChallengeDTO();
        sFConquestChallengeDTO.holdingName = "Test Holding " + n;
        sFConquestChallengeDTO.challengeType = (bl2 || bl ? bac.cIS : (bl6 ? bac.cIT : (bl5 ? bac.cIW : bac.cIU))).ordinal();
        sFConquestChallengeDTO.countdownTimer = 10820L;
        sFConquestChallengeDTO.wallsProtectingHolding = 0;
        sFConquestChallengeDTO.attackerVulnerabilityCountdown = 20;
        sFConquestChallengeDTO.defenderVulnerabilityCountdown = 3620;
        sFConquestChallengeDTO.defenderClanName = bl ? null : "Holding Owner Clan";
        sFConquestChallengeDTO.viewerHasClan = bl3;
        sFConquestChallengeDTO.viewerHasInitiatePermissions = bl7;
        sFConquestChallengeDTO.viewerHasIssueContractPermissions = bl8;
        sFConquestChallengeDTO.isPlayersClan = bl4;
        sFConquestChallengeDTO.stanceToPlayersClan = (bl4 ? bcr.cXg : (bl6 ? bcr.cXe : bcr.cXi)).ordinal();
        sFConquestChallengeDTO.bindstoneMaxHealth = 10000.0f;
        sFConquestChallengeDTO.bindstoneCurrentHealth = 7500.0f;
        sFConquestChallengeDTO.attackerWagerCost = !bl6 && !bl4 && !bl5 ? 100000 : 0;
        sFConquestChallengeDTO.pendingContracts = lcn.emA();
        SFConquestMercenaryContractDTO sFConquestMercenaryContractDTO = new SFConquestMercenaryContractDTO();
        sFConquestMercenaryContractDTO.clanName = "Mercenary Clan 1";
        sFConquestMercenaryContractDTO.flatFeeAmount = 125000;
        sFConquestMercenaryContractDTO.wagerPercentageAmount = 0.0f;
        sFConquestMercenaryContractDTO.receivedContract = true;
        sFConquestChallengeDTO.pendingContracts.add(sFConquestMercenaryContractDTO);
        sFConquestMercenaryContractDTO = new SFConquestMercenaryContractDTO();
        sFConquestMercenaryContractDTO.clanName = "Mercenary Clan 2";
        sFConquestMercenaryContractDTO.flatFeeAmount = 150000;
        sFConquestMercenaryContractDTO.wagerPercentageAmount = 0.0f;
        sFConquestMercenaryContractDTO.receivedContract = false;
        sFConquestChallengeDTO.pendingContracts.add(sFConquestMercenaryContractDTO);
        sFConquestMercenaryContractDTO = new SFConquestMercenaryContractDTO();
        sFConquestMercenaryContractDTO.clanName = "Mercenary Clan 3";
        sFConquestMercenaryContractDTO.flatFeeAmount = 175000;
        sFConquestMercenaryContractDTO.wagerPercentageAmount = 0.0f;
        sFConquestMercenaryContractDTO.receivedContract = true;
        sFConquestChallengeDTO.pendingContracts.add(sFConquestMercenaryContractDTO);
        sFConquestMercenaryContractDTO = new SFConquestMercenaryContractDTO();
        sFConquestMercenaryContractDTO.clanName = "Mercenary Clan 4";
        sFConquestMercenaryContractDTO.flatFeeAmount = 0;
        sFConquestMercenaryContractDTO.wagerPercentageAmount = 0.25f;
        sFConquestMercenaryContractDTO.receivedContract = false;
        sFConquestChallengeDTO.pendingContracts.add(sFConquestMercenaryContractDTO);
        sFConquestMercenaryContractDTO = new SFConquestMercenaryContractDTO();
        sFConquestMercenaryContractDTO.clanName = "Mercenary Clan 5";
        sFConquestMercenaryContractDTO.flatFeeAmount = 0;
        sFConquestMercenaryContractDTO.wagerPercentageAmount = 0.5f;
        sFConquestMercenaryContractDTO.receivedContract = true;
        sFConquestChallengeDTO.pendingContracts.add(sFConquestMercenaryContractDTO);
        sFConquestMercenaryContractDTO = new SFConquestMercenaryContractDTO();
        sFConquestMercenaryContractDTO.clanName = "Mercenary Clan 6";
        sFConquestMercenaryContractDTO.flatFeeAmount = 0;
        sFConquestMercenaryContractDTO.wagerPercentageAmount = 0.75f;
        sFConquestMercenaryContractDTO.receivedContract = false;
        sFConquestChallengeDTO.pendingContracts.add(sFConquestMercenaryContractDTO);
        if (!bl2 && !bl) {
            sFConquestChallengeDTO.defenderMercenaries = lcn.emA();
            SFConquestChallengeDefenderMercenaryDTO sFConquestChallengeDefenderMercenaryDTO = new SFConquestChallengeDefenderMercenaryDTO();
            sFConquestChallengeDefenderMercenaryDTO.clanName = "A mercenary clan";
            sFConquestChallengeDefenderMercenaryDTO.isPlayersClan = bl5;
            sFConquestChallengeDefenderMercenaryDTO.stanceToPlayersClan = (bl5 ? bcr.cXg : (bl6 ? bcr.cXe : bcr.cXi)).ordinal();
            sFConquestChallengeDefenderMercenaryDTO.percentageReward = 0.1f;
            sFConquestChallengeDefenderMercenaryDTO.goldReward = 0;
            sFConquestChallengeDTO.defenderMercenaries.add(sFConquestChallengeDefenderMercenaryDTO);
            sFConquestChallengeDefenderMercenaryDTO = new SFConquestChallengeDefenderMercenaryDTO();
            sFConquestChallengeDefenderMercenaryDTO.clanName = "A mercenary clan with an insanly long name, to check how the list component handles it";
            sFConquestChallengeDefenderMercenaryDTO.isPlayersClan = false;
            sFConquestChallengeDefenderMercenaryDTO.stanceToPlayersClan = bcr.cXg.ordinal();
            sFConquestChallengeDefenderMercenaryDTO.percentageReward = 0.0f;
            sFConquestChallengeDefenderMercenaryDTO.goldReward = 10000;
            sFConquestChallengeDTO.defenderMercenaries.add(sFConquestChallengeDefenderMercenaryDTO);
            sFConquestChallengeDefenderMercenaryDTO = new SFConquestChallengeDefenderMercenaryDTO();
            sFConquestChallengeDefenderMercenaryDTO.clanName = "Another mercenary clan to see how the list aligns after a long name";
            sFConquestChallengeDefenderMercenaryDTO.isPlayersClan = false;
            sFConquestChallengeDefenderMercenaryDTO.stanceToPlayersClan = (bl4 || bl5 ? bcr.cXi : (bl6 ? bcr.cXe : bcr.cXg)).ordinal();
            sFConquestChallengeDefenderMercenaryDTO.percentageReward = 0.25f;
            sFConquestChallengeDefenderMercenaryDTO.goldReward = 0;
            sFConquestChallengeDTO.defenderMercenaries.add(sFConquestChallengeDefenderMercenaryDTO);
            sFConquestChallengeDTO.attackers = lcn.emA();
            SFConquestChallengeAttackerDTO sFConquestChallengeAttackerDTO = new SFConquestChallengeAttackerDTO();
            sFConquestChallengeAttackerDTO.clanName = "The initial attacker clan";
            sFConquestChallengeAttackerDTO.isMercenary = false;
            sFConquestChallengeAttackerDTO.isPlayersClan = false;
            sFConquestChallengeAttackerDTO.isRemoved = false;
            sFConquestChallengeAttackerDTO.stanceToPlayersClan = (bl4 ? bcr.cXe : (bl6 ? bcr.cXg : bcr.cXi)).ordinal();
            sFConquestChallengeAttackerDTO.score = 12345.0f;
            sFConquestChallengeAttackerDTO.maxSiegeStones = 2;
            sFConquestChallengeAttackerDTO.siegeStonePlacementTimer = 0;
            sFConquestChallengeAttackerDTO.siegeStones = lcn.emA();
            SFConquestChallengeAttackerSiegeStoneDTO sFConquestChallengeAttackerSiegeStoneDTO = new SFConquestChallengeAttackerSiegeStoneDTO();
            sFConquestChallengeAttackerSiegeStoneDTO.worldX = 0.0f;
            sFConquestChallengeAttackerSiegeStoneDTO.worldY = 0.0f;
            sFConquestChallengeAttackerSiegeStoneDTO.worldZ = 0.0f;
            sFConquestChallengeAttackerSiegeStoneDTO.healthMax = 5000.0f;
            sFConquestChallengeAttackerSiegeStoneDTO.healthCurrent = 5000.0f;
            sFConquestChallengeAttackerSiegeStoneDTO.resourceName = "r_siege bindstone small";
            sFConquestChallengeAttackerDTO.siegeStones.add(sFConquestChallengeAttackerSiegeStoneDTO);
            sFConquestChallengeAttackerSiegeStoneDTO = new SFConquestChallengeAttackerSiegeStoneDTO();
            sFConquestChallengeAttackerSiegeStoneDTO.worldX = 0.0f;
            sFConquestChallengeAttackerSiegeStoneDTO.worldY = 0.0f;
            sFConquestChallengeAttackerSiegeStoneDTO.worldZ = 0.0f;
            sFConquestChallengeAttackerSiegeStoneDTO.healthMax = 5000.0f;
            sFConquestChallengeAttackerSiegeStoneDTO.healthCurrent = 5000.0f;
            sFConquestChallengeAttackerSiegeStoneDTO.resourceName = "r_siege bindstone small";
            sFConquestChallengeAttackerDTO.siegeStones.add(sFConquestChallengeAttackerSiegeStoneDTO);
            sFConquestChallengeDTO.attackers.add(sFConquestChallengeAttackerDTO);
            sFConquestChallengeAttackerDTO = new SFConquestChallengeAttackerDTO();
            sFConquestChallengeAttackerDTO.clanName = "The initial attacker's mercenary clan, with a stupidly long name to check the layout of the list";
            sFConquestChallengeAttackerDTO.isMercenary = true;
            sFConquestChallengeAttackerDTO.isPlayersClan = false;
            sFConquestChallengeAttackerDTO.isRemoved = true;
            sFConquestChallengeAttackerDTO.stanceToPlayersClan = (bl4 ? bcr.cXg : (bl6 ? bcr.cXi : bcr.cXg)).ordinal();
            sFConquestChallengeAttackerDTO.score = 12344.0f;
            sFConquestChallengeAttackerDTO.maxSiegeStones = 2;
            sFConquestChallengeAttackerDTO.siegeStonePlacementTimer = 0;
            sFConquestChallengeAttackerDTO.siegeStones = lcn.emA();
            sFConquestChallengeDTO.attackers.add(sFConquestChallengeAttackerDTO);
            sFConquestChallengeAttackerDTO = new SFConquestChallengeAttackerDTO();
            sFConquestChallengeAttackerDTO.clanName = "Yet another attacker, to check the list alignment";
            sFConquestChallengeAttackerDTO.isMercenary = false;
            sFConquestChallengeAttackerDTO.isPlayersClan = bl6;
            sFConquestChallengeAttackerDTO.isRemoved = false;
            sFConquestChallengeAttackerDTO.stanceToPlayersClan = (bl6 ? bcr.cXg : bcr.cXe).ordinal();
            sFConquestChallengeAttackerDTO.score = 12343.0f;
            sFConquestChallengeAttackerDTO.maxSiegeStones = 2;
            sFConquestChallengeAttackerDTO.siegeStonePlacementTimer = 0;
            sFConquestChallengeAttackerDTO.siegeStones = lcn.emA();
            sFConquestChallengeAttackerSiegeStoneDTO = new SFConquestChallengeAttackerSiegeStoneDTO();
            sFConquestChallengeAttackerSiegeStoneDTO.worldX = 0.0f;
            sFConquestChallengeAttackerSiegeStoneDTO.worldY = 0.0f;
            sFConquestChallengeAttackerSiegeStoneDTO.worldZ = 0.0f;
            sFConquestChallengeAttackerSiegeStoneDTO.healthMax = 5000.0f;
            sFConquestChallengeAttackerSiegeStoneDTO.healthCurrent = 4000.0f;
            sFConquestChallengeAttackerSiegeStoneDTO.resourceName = "r_siege bindstone small";
            sFConquestChallengeAttackerDTO.siegeStones.add(sFConquestChallengeAttackerSiegeStoneDTO);
            sFConquestChallengeDTO.attackers.add(sFConquestChallengeAttackerDTO);
        }
        return sFConquestChallengeDTO;
    }
}

