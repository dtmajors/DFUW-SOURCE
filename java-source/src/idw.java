/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  hzo
 */
import java.util.Map;

public abstract class idw
extends hzk
implements idv {
    protected static final Map<String, lfs<lox, lox>> lLj = lcn.emw();
    protected hzo lLk = null;
    protected jng leq = null;
    protected jnr ler = null;
    protected dmn lLl = null;
    protected hyy lLm = null;
    protected boolean lLn = false;
    protected iee lLo = iee.lMt;
    protected hyy.a lLp = null;
    protected int lLq = 0;
    protected int lLr = 0;
    protected int fc = 0;
    protected int fb = 0;
    protected boolean lLs = true;
    protected idz lLt = null;

    @Override
    public jnz cOS() {
        return jnz.nFI;
    }

    @Override
    public boolean cPa() {
        return !this.lLn;
    }

    protected idw(String string, String string2, iee iee2) {
        this(string, string2, iee2, jnz.nGi, true);
    }

    protected idw(String string, String string2, iee iee2, boolean bl) {
        this(string, string2, iee2, jnz.nGi, bl);
    }

    protected idw(String string, String string2, iee iee2, int n) {
        this(string, string2, iee2, n, true);
    }

    protected idw(String string, String string2, iee iee2, int n, boolean bl) {
        super(string, string2);
        this.lLo = iee2;
        this.fb = 400;
        this.OQ(n);
        this.a(hya.lmu, bl);
        this.a(hxu.lle);
        this.a(hyb.lmC);
    }

    public void initialize() {
        super.initialize();
        if (idw.cxO() != null && idw.cxO() instanceof hzo) {
            this.lLk = (hzo)idw.cxO();
        }
        if (idw.cFj() != null && idw.cFj().cxP() != null) {
            this.leq = hso.cxK().cxP().czb();
        }
        if (idw.cFj() != null && idw.cFj().cxP() != null) {
            this.ler = hso.cxK().cxP().czc();
        }
        if (idw.cFj() != null && idw.cFj().cxP() != null) {
            this.lLl = hso.cxK().cxP().czd();
        }
        if (this.lLk != null) {
            this.lLm = this.lLk.cHx();
        }
        this.lLt = new a(this);
        this.cOR();
    }

    public void cleanUp() {
        if (this instanceof htm) {
            this.leq.b(this);
        }
        if (this instanceof hut) {
            this.ler.b((hut)((Object)this));
        }
        if (this instanceof huy) {
            this.lLl.b((huy)((Object)this));
        }
        super.cleanUp();
    }

    protected void cON() {
        this.lLt.cON();
    }

    @Override
    public final void b(hyy.b b2, int n) {
        this.lLt.b(b2, n);
    }

    @Override
    public boolean cGG() {
        return true;
    }

    @Override
    public boolean cGH() {
        return true;
    }

    protected void c(hyy.b b2, int n) {
    }

    @Override
    public void zO() {
        this.lLs = true;
    }

    @Override
    @llk
    public void closeWindow() {
        if (!this.lLn) {
            this.lLk.pq(false);
        }
    }

    protected abstract void cOO();

    protected abstract void cOP();

    protected abstract void cOQ();

    @Override
    public void oj() {
    }

    public void cBa() {
        super.cBa();
        this.lLs = true;
    }

    public void cEc() {
        super.cEc();
        this.cON();
        if (this.isVisible() && this.lLs) {
            this.cOO();
        }
    }

    public void cEk() {
        super.cEk();
        this.cOQ();
    }

    public void kr(float f) {
        this.fc = (int)f - this.lLq;
        lfn.b(0, this.getClass().getSimpleName(), "onHeightChangedByLayout() : NewHeight = " + f + ", Applied Height = " + this.fc);
        this.R((int)this.lLm.getWidth(), this.lLq);
        if (this.cCZ() != (float)this.fb / this.cEJ() || this.cDa() != (float)this.fc / this.cDc()) {
            this.N((float)this.fb / this.cEJ(), (float)this.fc / this.cDc());
        }
        this.cER();
        this.cOP();
    }

    public hyn s(int n, int n2, String string) {
        lox lox2;
        if (string == null) {
            return null;
        }
        String[] stringArray = string.split(";");
        float f = stringArray.length > 5 ? Float.parseFloat(stringArray[5]) : 0.0f;
        float f2 = stringArray.length > 6 ? Float.parseFloat(stringArray[6]) : 0.0f;
        f2 += (float)n2 >= idw.cxO().cHk().H / 2.0f ? -45.0f : 45.0f;
        lfs<lox, lox> lfs2 = lLj.get(stringArray[0].contains(":") ? stringArray[0].substring(0, stringArray[0].indexOf(":")) : stringArray[0]);
        lox lox3 = lfs2 == null ? null : (lox)lfs2.reX;
        lox lox4 = lox2 = lfs2 == null ? null : (lox)lfs2.reY;
        if (lox3 == null) {
            return null;
        }
        loz loz2 = this.b(stringArray[0], lox3);
        loz loz3 = this.a(stringArray[0], lox2);
        String string2 = "<font size='12'>" + loz2.exA().toUpperCase() + "</font>";
        String string3 = loz3 == null ? null : "<font size='12'>" + loz3.exA() + "</font>";
        iae iae2 = new iae(iae.a(string2, string3, 0, 0, 0, 0, new String[0]), n - (int)f, n2 - (int)f2);
        return iae2;
    }

    protected void cOR() {
        if (lLj.isEmpty()) {
            lLj.put("GenderMale", new lfs<lox, lox>(lvm.sWV, lyn.tGq));
            lLj.put("GenderFemale", new lfs<lox, lox>(lvm.sWW, lyn.tGp));
            lLj.put("BankPolicyAccessToAll", new lfs<lox, lox>(lpy.rWv, lyn.tGr));
            lLj.put("BankPolicyAccessToAllButEnemies", new lfs<lox, lox>(lpy.rWw, lyn.tGs));
            lLj.put("BankPolicyAccessToAllies", new lfs<lox, lox>(lpy.rWx, lyn.tGt));
            lLj.put("BankPolicyAccessOnlyToClan", new lfs<lox, lox>(lpy.rWy, lyn.tGu));
            lLj.put("MarketPolicyAccessToAll", new lfs<lox, lox>(lpy.rWv, lyn.tGv));
            lLj.put("MarketPolicyAccessToAllButEnemies", new lfs<lox, lox>(lpy.rWw, lyn.tGw));
            lLj.put("MarketPolicyAccessToAllies", new lfs<lox, lox>(lpy.rWx, lyn.tGx));
            lLj.put("MarketPolicyAccessOnlyToClan", new lfs<lox, lox>(lpy.rWy, lyn.tGy));
            lLj.put("CitizenBindIndicator", new lfs<lox, lox>(lyn.tGz, lyn.tGA));
            lLj.put("GuardPolicyAllButAllies", new lfs<lox, lox>(lqa.rWG, lyn.tGB));
            lLj.put("GuardPolicyOnlyEnemies", new lfs<lox, lox>(lqa.rWH, lyn.tGC));
            lLj.put("GuardPolicyNeverAttack", new lfs<lox, lox>(lqa.rWI, lyn.tGD));
            lLj.put("GatePolicyAll", new lfs<lox, lox>(lpz.rWA, lyn.tGE));
            lLj.put("GatePolicyAllButEnemies", new lfs<lox, lox>(lpz.rWB, lyn.tGF));
            lLj.put("GatePolicyAllies", new lfs<lox, lox>(lpz.rWC, lyn.tGG));
            lLj.put("GatePolicyAllClanMembers", new lfs<lox, lox>(lpz.rWD, lyn.tGH));
            lLj.put("GatePolicyPermittedClanMembers", new lfs<lox, lox>(lpz.rWE, lyn.tGI));
            lLj.put("HoldingListItemInfo", new lfs<lox, lox>(lyn.tGJ, lyn.tGK));
            lLj.put("HoldingListItemMap", new lfs<lox, lox>(lyn.tGL, lyn.tGM));
            lLj.put("MayorRemove", new lfs<lox, lox>(lyn.tGN, lyn.tGO));
            lLj.put("MayorSelect", new lfs<lox, lox>(lyn.tGP, lyn.tGQ));
            lLj.put("HoldingStanceCannotEnter", new lfs<lox, lox>(lwa.tcz, lyn.tGR));
            lLj.put("HoldingStanceCanEnter", new lfs<lox, lox>(lwa.tcy, lyn.tGS));
            lLj.put("HoldingStanceCanBind", new lfs<lox, lox>(lwa.tcA, lyn.tGT));
            lLj.put("HoldingStanceIsBound", new lfs<lox, lox>(lwa.tcB, lyn.tGU));
            lLj.put("HoldingBuildMapEditIndicator", new lfs<lox, lox>(lyn.tGV, lyn.tGW));
            lLj.put("EditIndicator", new lfs<lox, lox>(lyn.tGX, lyn.tGY));
            lLj.put("EditIndicatorSelected", new lfs<lox, lox>(lyn.tGZ, lyn.tHa));
            lLj.put("ChangeClanLeader", new lfs<lox, lox>(lyn.tHb, lyn.tHc));
            lLj.put("Leader", new lfs<lox, lox>(lyn.tHd, lyn.tHe));
            lLj.put("Founder", new lfs<lox, lox>(lyn.tHf, lyn.tHg));
            lLj.put("Manager", new lfs<lox, lox>(lyn.tHh, lyn.tHi));
            lLj.put("Recruit", new lfs<lox, lox>(lpu.rUf, lyn.tIg));
            lLj.put("Private", new lfs<lox, lox>(lpu.rUg, lyn.tIh));
            lLj.put("Corporal", new lfs<lox, lox>(lpu.rUh, lyn.tIn));
            lLj.put("Sergeant", new lfs<lox, lox>(lpu.rUi, lyn.tIj));
            lLj.put("Lieutenant", new lfs<lox, lox>(lpu.rUj, lyn.tIk));
            lLj.put("Captain", new lfs<lox, lox>(lpu.rUk, lyn.tIl));
            lLj.put("Major", new lfs<lox, lox>(lpu.rUl, lyn.tIm));
            lLj.put("Colonel", new lfs<lox, lox>(lpu.rUm, lyn.tIn));
            lLj.put("General", new lfs<lox, lox>(lpu.rUn, lyn.tIo));
            lLj.put("SupremeGeneral", new lfs<lox, lox>(lpu.rUo, lyn.tIp));
            lLj.put("AlfarEditable", new lfs<lox, lox>(mdn.vei, lyn.tHj));
            lLj.put("DwarfEditable", new lfs<lox, lox>(mdn.vdY, lyn.tHj));
            lLj.put("HumanEditable", new lfs<lox, lox>(mdn.vdO, lyn.tHj));
            lLj.put("MahirimEditable", new lfs<lox, lox>(mdn.ved, lyn.tHj));
            lLj.put("MirdainEditable", new lfs<lox, lox>(mdn.ven, lyn.tHj));
            lLj.put("OrkEditable", new lfs<lox, lox>(mdn.vdT, lyn.tHj));
            lLj.put("AcceptingNewMembersEditable", new lfs<lox, lox>(lyn.tHk, lyn.tHl));
            lLj.put("AlfarAssigned", new lfs<lox, lox>(mdn.vei, lyn.tHm));
            lLj.put("DwarfAssigned", new lfs<lox, lox>(mdn.vdY, lyn.tHm));
            lLj.put("HumanAssigned", new lfs<lox, lox>(mdn.vdO, lyn.tHm));
            lLj.put("MahirimAssigned", new lfs<lox, lox>(mdn.ved, lyn.tHm));
            lLj.put("MirdainAssigned", new lfs<lox, lox>(mdn.ven, lyn.tHm));
            lLj.put("OrkAssigned", new lfs<lox, lox>(mdn.vdT, lyn.tHm));
            lLj.put("AcceptingNewMembersAssigned", new lfs<lox, lox>(lyn.tHn, lyn.tHo));
            lLj.put("OnlineIndicatorOnline", new lfs<lox, lox>(lyn.tHp, lyn.tHq));
            lLj.put("OnlineIndicatorOffline", new lfs<lox, lox>(lyn.tHr, lyn.tHs));
            lLj.put("OnlineIndicatorPlayer", new lfs<lox, lox>(lyn.tHu, lyn.tHv));
            lLj.put("PermissionsShowAll", new lfs<lox, lox>(lyn.tHw, lyn.tHx));
            lLj.put("PermissionsAssign", new lfs<lox, lox>(lyn.tHy, lyn.tHz));
            lLj.put("War", new lfs<lox, lox>(lqb.rWK, lyn.tHA));
            lLj.put("Wary", new lfs<lox, lox>(lqb.rWL, lyn.tHB));
            lLj.put("Neutral", new lfs<lox, lox>(lqb.rWM, lyn.tHC));
            lLj.put("Friendly", new lfs<lox, lox>(lqb.rWN, lyn.tHD));
            lLj.put("Ally", new lfs<lox, lox>(lqb.rWO, lyn.tHE));
            lLj.put("TagGeneral", new lfs<lox, Object>(lqc.rUn, null));
            lLj.put("TagPvP", new lfs<lox, Object>(lqc.rWR, null));
            lLj.put("TagPvE", new lfs<lox, Object>(lqc.rWS, null));
            lLj.put("TagCrafting", new lfs<lox, Object>(lqc.rWT, null));
            lLj.put("TagMercenary", new lfs<lox, Object>(lqc.rWU, null));
            lLj.put("TagConquest", new lfs<lox, Object>(lqc.rUx, null));
            lLj.put("TagCasual", new lfs<lox, Object>(lqc.rWW, null));
            lLj.put("TagHardcore", new lfs<lox, Object>(lqc.rWV, null));
            lLj.put("TagNewPlayerFriendly", new lfs<lox, Object>(lqc.rWX, null));
            lLj.put("TagGeneralEditable", new lfs<lox, lox>(lqc.rUn, lyn.tHF));
            lLj.put("TagPvPEditable", new lfs<lox, lox>(lqc.rWR, lyn.tHG));
            lLj.put("TagPvEEditable", new lfs<lox, lox>(lqc.rWS, lyn.tHH));
            lLj.put("TagCraftingEditable", new lfs<lox, lox>(lqc.rWT, lyn.tHI));
            lLj.put("TagMercenaryEditable", new lfs<lox, lox>(lqc.rWU, lyn.tHJ));
            lLj.put("TagConquestEditable", new lfs<lox, lox>(lqc.rUx, lyn.tHK));
            lLj.put("TagCasualEditable", new lfs<lox, lox>(lqc.rWW, lyn.tHM));
            lLj.put("TagHardcoreEditable", new lfs<lox, lox>(lqc.rWV, lyn.tHL));
            lLj.put("TagNewPlayerFriendlyEditable", new lfs<lox, lox>(lqc.rWX, lyn.tHN));
            lLj.put("TagGeneralAssigned", new lfs<lox, lox>(lqc.rUn, lyn.tHO));
            lLj.put("TagPvPAssigned", new lfs<lox, lox>(lqc.rWR, lyn.tHP));
            lLj.put("TagPvEAssigned", new lfs<lox, lox>(lqc.rWS, lyn.tHQ));
            lLj.put("TagCraftingAssigned", new lfs<lox, lox>(lqc.rWT, lyn.tHR));
            lLj.put("TagMercenaryAssigned", new lfs<lox, lox>(lqc.rWU, lyn.tHS));
            lLj.put("TagConquestAssigned", new lfs<lox, lox>(lqc.rUx, lyn.tHT));
            lLj.put("TagCasualAssigned", new lfs<lox, lox>(lqc.rWW, lyn.tHV));
            lLj.put("TagHardcoreAssigned", new lfs<lox, lox>(lqc.rWV, lyn.tHU));
            lLj.put("TagNewPlayerFriendlyAssigned", new lfs<lox, lox>(lqc.rWX, lyn.tHW));
            lLj.put("TagGeneralFilter", new lfs<lox, lox>(lqc.rUn, lyn.tHX));
            lLj.put("TagPvPFilter", new lfs<lox, lox>(lqc.rWR, lyn.tHY));
            lLj.put("TagPvEFilter", new lfs<lox, lox>(lqc.rWS, lyn.tHZ));
            lLj.put("TagCraftingFilter", new lfs<lox, lox>(lqc.rWT, lyn.tIa));
            lLj.put("TagMercenaryFilter", new lfs<lox, lox>(lqc.rWU, lyn.tIb));
            lLj.put("TagConquestFilter", new lfs<lox, lox>(lqc.rUx, lyn.tIc));
            lLj.put("TagCasualFilter", new lfs<lox, lox>(lqc.rWW, lyn.tIe));
            lLj.put("TagHardcoreFilter", new lfs<lox, lox>(lqc.rWV, lyn.tId));
            lLj.put("TagNewPlayerFriendlyFilter", new lfs<lox, lox>(lqc.rWX, lyn.tIf));
            lLj.put("ConquestProtectionNoProtection", new lfs<lox, lox>(lyn.tIq, lyn.tIr));
            lLj.put("ConquestProtectionShortProtection", new lfs<lox, lox>(lyn.tIs, lyn.tIt));
            lLj.put("ConquestProtectionLongProtection", new lfs<lox, lox>(lyn.tIu, lyn.tIv));
            lLj.put("ConquestProtectionConquestProtection", new lfs<lox, lox>(lyn.tIw, lyn.tIx));
            lLj.put("ConquestProtectionAutoRenew", new lfs<lox, lox>(lyn.tIy, lyn.tIz));
            lLj.put("ConquestProtectionAssetDamage", new lfs<lox, lox>(lyn.tIA, lyn.tIB));
            lLj.put("VillageListItemMap", new lfs<lox, lox>(lyn.tIC, lyn.tID));
            lLj.put("ConquestJoinAttackers", new lfs<lox, lox>(lyt.tJj, lyt.tJk));
            lLj.put("ConquestIssueMercenaryContractFlatFee", new lfs<lox, lox>(lyt.tJn, lyt.tJo));
            lLj.put("ConquestIssueMercenaryContractWagerPercentage", new lfs<lox, lox>(lyt.tJl, lyt.tJm));
            lLj.put("ConquestSiegeStoneLargeUnplaced", new lfs<lox, lox>(lyt.tJp, lyt.tJq));
            lLj.put("ConquestSiegeStoneLargePlaced", new lfs<lox, lox>(lyt.tJr, lyt.tJs));
            lLj.put("ConquestSiegeStoneLargeVulnerable", new lfs<lox, lox>(lyt.tJt, lyt.tJu));
            lLj.put("ConquestSiegeStoneSmallUnplaced", new lfs<lox, lox>(lyt.tJv, lyt.tJw));
            lLj.put("ConquestSiegeStoneSmallPlaced", new lfs<lox, lox>(lyt.tJx, lyt.tJy));
            lLj.put("ConquestAttackerScoreCurrent", new lfs<lox, lox>(lyt.tJz, lyt.tJA));
            lLj.put("ConquestAttackerScoreWinning", new lfs<lox, lox>(lyt.tJB, lyt.tJC));
            lLj.put("ConquestBindstoneIcon", new lfs<lox, lox>(lyt.tJD, lyt.tJE));
            lLj.put("ConquestShowInGameMode", new lfs<lox, lox>(lyt.tJF, lyt.tJG));
            lLj.put("ConquestInformation", new lfs<lox, lox>(lyt.tJH, lyt.tJI));
            lLj.put("ConquestAcceptMercenaryContract", new lfs<lox, lox>(lyt.tJJ, lyt.tJJ));
            lLj.put("ConquestCounterOfferMercenaryContract", new lfs<lox, lox>(lyt.tJL, lyt.tJM));
            lLj.put("ConquestRejectMercenaryContract", new lfs<lox, lox>(lyt.tJN, lyt.tJO));
            lLj.put("ConquestCreateMercenaryContract", new lfs<lox, lox>(lyt.tJP, lyt.tJQ));
            lLj.put("ConquestClanInformation", new lfs<lox, lox>(lyt.tGb, lyt.tGc));
            lLj.put("ConquestSelectMercenaryClan", new lfs<lox, lox>(lyt.tJR, lyt.tJS));
        }
    }

    protected loz b(String string, lox lox2) {
        if (lox2 == null) {
            return null;
        }
        return lox2.bD(new Object[0]);
    }

    protected loz a(String string, lox lox2) {
        if (lox2 == null) {
            return null;
        }
        return lox2.bD(new Object[0]);
    }

    protected String ao(long l2) {
        long l3 = l2 / 60L;
        if (l3 < 60L) {
            return lvm.sWN.bD(new Object[0]).exA();
        }
        long l4 = l3 / 60L;
        if (l4 == 1L) {
            return lvm.sWO.bD(new Object[0]).exA();
        }
        if (l4 < 24L) {
            return lvm.sWP.bD(l4).exA();
        }
        long l5 = l4 / 24L;
        if (l5 == 1L) {
            return lvm.sWQ.bD(new Object[0]).exA();
        }
        if (l5 < 7L) {
            return lvm.sWR.bD(l5).exA();
        }
        long l6 = l5 / 7L;
        if (l6 == 1L) {
            return lvm.sWS.bD(new Object[0]).exA();
        }
        if (l6 < 6L) {
            return lvm.sWT.bD(l6).exA();
        }
        return lvm.sWU.bD(new Object[0]).exA();
    }
}

