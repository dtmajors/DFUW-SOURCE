/*
 * Decompiled with CFR.
 */
import java.util.EnumSet;
import spenefett.hid.gui.serialization.dto.SFClanConfigurationValuesDTO;
import spenefett.hid.gui.serialization.dto.SFClanMembershipRestrictionsDTO;
import spenefett.hid.gui.serialization.dto.SFStringsClanConfigurationDTO;

public class idj
extends idw
implements bto,
htb,
htd,
htx,
hus {
    private static final double lKm = 1.0;
    private idq lKg = null;
    private lox lKn = null;
    private double lKo = 0.0;

    idj() {
        super("ClanConfiguration", "clanconfiguration.swf", iee.lMz);
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
        if (!this.cEU()) {
            return;
        }
        if (this.leq.dNi().abd().length == 0) {
            return;
        }
        if (ldz2.rgz - this.lKo < 1.0) {
            return;
        }
        this.a("updateVillageTimerValue", new Object[]{lwb.tdv.bD(this.leq.dNi().aaG() - ldz2.rgz).exA()});
        this.lKo = ldz2.rgz;
    }

    @Override
    protected void cON() {
        super.cON();
        this.lLm.a(hyy.b.ltu, this.isVisible() ? 1 : 0);
        if (this.isVisible() && this.lKg != null) {
            if (this.lKg.cOX() != null) {
                this.a("takeSelectedLeader", new Object[]{this.lKg.cOX().abM()});
            }
            this.lKg = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void pV(boolean bl) {
        void var6_9;
        SFClanMembershipRestrictionsDTO sFClanMembershipRestrictionsDTO = new SFClanMembershipRestrictionsDTO();
        sFClanMembershipRestrictionsDTO.acceptingAlfar = this.leq.Vm(1);
        sFClanMembershipRestrictionsDTO.acceptingDwarf = this.leq.Vm(2);
        sFClanMembershipRestrictionsDTO.acceptingHuman = this.leq.Vm(3);
        sFClanMembershipRestrictionsDTO.acceptingMahirim = this.leq.Vm(4);
        sFClanMembershipRestrictionsDTO.acceptingMirdain = this.leq.Vm(5);
        sFClanMembershipRestrictionsDTO.acceptingOrk = this.leq.Vm(6);
        sFClanMembershipRestrictionsDTO.acceptingNewMembers = this.leq.dNq();
        SFClanConfigurationValuesDTO sFClanConfigurationValuesDTO = new SFClanConfigurationValuesDTO();
        sFClanConfigurationValuesDTO.clanName = this.leq.acl();
        sFClanConfigurationValuesDTO.clanMotto = this.leq.dNj();
        sFClanConfigurationValuesDTO.clanCharter = this.leq.dNk();
        sFClanConfigurationValuesDTO.clanTags = lcn.emv();
        EnumSet<ayw> enumSet = this.leq.dNr();
        for (ayw object2 : enumSet) {
            sFClanConfigurationValuesDTO.clanTags.add(object2.acb());
        }
        sFClanConfigurationValuesDTO.membershipRestrictions = sFClanMembershipRestrictionsDTO;
        sFClanConfigurationValuesDTO.leader = this.leq.dNo().abM();
        sFClanConfigurationValuesDTO.founder = this.leq.dNn();
        sFClanConfigurationValuesDTO.founderInfo = this.leq.dNp() == null ? null : this.leq.dNp().abM();
        sFClanConfigurationValuesDTO.villageTimerOptions = lcn.emv();
        int n = jng.itE.aaU();
        Object var6_8 = null;
        for (dpv dpv2 : jng.itE.aaT()) {
            if (dpv2.getID() == this.leq.dNi().aaE()) {
                dpv dpv3 = dpv2;
            }
            if (dpv2.getID() == this.leq.dNi().aaF()) {
                sFClanConfigurationValuesDTO.currentVillageTimerOption = sFClanConfigurationValuesDTO.villageTimerOptions.size();
            }
            sFClanConfigurationValuesDTO.villageTimerOptions.add(lwb.tdt.bD(dpv2.bss(), (int)(dpv2.Bf(n) * 100.0f), dpv2.bst()).exA());
        }
        if (this.leq.dNi().abd().length == 0 || var6_9 == null) {
            sFClanConfigurationValuesDTO.villageTimerValue = lwb.tdu.bD(new Object[0]).exA();
            sFClanConfigurationValuesDTO.villageRewardsValue = lwb.tdu.bD(new Object[0]).exA();
            sFClanConfigurationValuesDTO.villageGlobulesValue = lwb.tdu.bD(new Object[0]).exA();
            sFClanConfigurationValuesDTO.hasVillages = false;
        } else {
            sFClanConfigurationValuesDTO.villageTimerValue = lwb.tdv.bD(this.leq.dNi().aaG() - this.MessageDelegator.arc().rgz).exA();
            sFClanConfigurationValuesDTO.villageRewardsValue = lwb.tdw.bD((int)(var6_9.Bf(n) * 100.0f)).exA();
            sFClanConfigurationValuesDTO.villageGlobulesValue = lwb.tdx.bD(var6_9.bst()).exA();
            sFClanConfigurationValuesDTO.hasVillages = true;
        }
        this.a("setConfiguration", new Object[]{sFClanConfigurationValuesDTO, bl});
    }

    @Override
    public void cyw() {
        this.pV(false);
    }

    @Override
    public void cyp() {
        this.pV(false);
    }

    @Override
    public void cyq() {
        this.pV(false);
    }

    @Override
    public void cyr() {
        this.pV(false);
    }

    @Override
    public void cys() {
        this.pV(false);
    }

    @Override
    public void cyt() {
        this.pV(false);
    }

    @Override
    public void cyv() {
        this.pV(false);
    }

    @Override
    public void no(String string) {
        this.lLn = false;
        this.a("clanConfigurationUpdateSucceeded", new Object[]{string});
    }

    @Override
    public void np(String string) {
        this.lLn = false;
        this.a("clanConfigurationUdpateFailed", new Object[]{string});
    }

    @Override
    public void oi() {
        if (!this.leq.dNh()) {
            this.closeWindow();
            return;
        }
        if (!this.leq.i(bca.cTE)) {
            this.closeWindow();
            return;
        }
        this.pV(true);
        this.cyy();
    }

    @Override
    public void cyy() {
        this.a("canEdit", new Object[]{this.leq.i(bca.cTF), this.leq.i(bca.cTB), this.leq.i(bca.cTD), this.leq.i(bca.cTI), this.leq.i(bca.cTv), this.leq.i(bca.cUv)});
    }

    @Override
    public void cyu() {
        this.pV(false);
    }

    @Override
    public void cyC() {
        int n = jng.itE.aaU();
        dpv dpv2 = null;
        for (dpv dpv3 : jng.itE.aaT()) {
            if (dpv3.getID() != this.leq.dNi().aaE()) continue;
            dpv2 = dpv3;
        }
        if (this.leq.dNi().abd().length == 0 || dpv2 == null) {
            this.a("updateVillageTimerCycleValues", new Object[]{lwb.tdu.bD(new Object[0]).exA(), lwb.tdu.bD(new Object[0]).exA(), lwb.tdu.bD(new Object[0]).exA(), false});
        } else {
            this.a("updateVillageTimerCycleValues", new Object[]{lwb.tdv.bD(this.leq.dNi().aaG() - this.MessageDelegator.arc().rgz).exA(), lwb.tdw.bD((int)(dpv2.Bf(n) * 100.0f)).exA(), lwb.tdx.bD(dpv2.bst()).exA(), true});
        }
    }

    @Override
    public void cyD() {
        int n = jng.itE.aaU();
        dpv dpv2 = null;
        for (dpv dpv3 : jng.itE.aaT()) {
            if (dpv3.getID() != this.leq.dNi().aaE()) continue;
            dpv2 = dpv3;
        }
        if (this.leq.dNi().abd().length == 0 || dpv2 == null) {
            this.a("updateVillageTimerCycleValues", new Object[]{lwb.tdu.bD(new Object[0]).exA(), lwb.tdu.bD(new Object[0]).exA(), lwb.tdu.bD(new Object[0]).exA(), false});
        } else {
            this.a("updateVillageTimerCycleValues", new Object[]{lwb.tdv.bD(this.leq.dNi().aaG() - this.MessageDelegator.arc().rgz).exA(), lwb.tdw.bD((int)(dpv2.Bf(n) * 100.0f)).exA(), lwb.tdx.bD(dpv2.bst()).exA(), true});
        }
    }

    @Override
    protected void cOO() {
        this.leq.a(this);
        if (!this.leq.dNh()) {
            this.closeWindow();
            return;
        }
        this.pV(true);
        this.cyy();
        this.a("setInputBounds", new Object[]{0, 100, 0, 200});
        this.lLs = false;
    }

    @Override
    protected void cOP() {
        this.a("setHeight", new Object[]{this.fc});
    }

    @Override
    protected void cOQ() {
        this.lKn = lwb.lKn;
        if (this.lKg != null) {
            this.lKg.d(this.lKn);
        }
        SFStringsClanConfigurationDTO sFStringsClanConfigurationDTO = new SFStringsClanConfigurationDTO();
        sFStringsClanConfigurationDTO.title = lwb.tce.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.clanNameTitle = lwb.tcY.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.clanMottoTitle = lwb.tcZ.bD(100).exA();
        sFStringsClanConfigurationDTO.clanCharterTitle = lwb.tda.bD(200).exA();
        sFStringsClanConfigurationDTO.membershipRestrictionsTitle = lwb.tdb.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.membershipRestrictionsInfo = lwb.tdc.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.humanRaceName = lvm.sXh.bD(3).exA();
        sFStringsClanConfigurationDTO.mirdainRaceName = lvm.sXh.bD(5).exA();
        sFStringsClanConfigurationDTO.dwarfRaceName = lvm.sXh.bD(2).exA();
        sFStringsClanConfigurationDTO.orkRaceName = lvm.sXh.bD(6).exA();
        sFStringsClanConfigurationDTO.alfarRaceName = lvm.sXh.bD(1).exA();
        sFStringsClanConfigurationDTO.mahirimRaceName = lvm.sXh.bD(4).exA();
        sFStringsClanConfigurationDTO.acceptingNewMembers = lwb.tdd.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.clanTagsTitle = lwb.tde.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.clanTagsInfo = lwb.tdf.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.updateClanText = lwb.tdg.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.updatingClanConfigurationText = lwb.tdh.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.clanTags = ayw.getGUIValues();
        sFStringsClanConfigurationDTO.leaderTitle = lwb.tdi.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.founderTitle = lwb.tdj.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.mottoDefaultText = lwb.tdk.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.charterDefaultText = lwb.tdl.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.villageTimerOptionsTitle = lwb.tdm.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.villageTimerCycleCurrentTitle = lwb.tdn.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.villageTimerCycleNextTitle = lwb.tdr.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.villageTimerCycleTimerLabel = lwb.tdo.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.villageTimerCycleRewardsLabel = lwb.tdp.bD(new Object[0]).exA();
        sFStringsClanConfigurationDTO.villageTimerCycleGlobulesLabel = lwb.tdq.bD(new Object[0]).exA();
        this.a("takeStrings", new Object[]{sFStringsClanConfigurationDTO});
    }

    @Override
    protected loz a(String string, lox lox2) {
        if (lox2 == null) {
            return super.a(string, lox2);
        }
        if (string.startsWith("OnlineIndicatorOffline")) {
            String string2 = string.substring(string.indexOf(":") + 1);
            ays ays2 = this.leq.sN(string2);
            if (ays2 == null) {
                return super.a(string, lox2);
            }
            return lyn.tHt.bD(this.ao(ays2.B(this.MessageDelegator.arc())));
        }
        return super.a(string, lox2);
    }

    @llk
    public void beginClanConfigurationUpdate(SFClanConfigurationValuesDTO sFClanConfigurationValuesDTO) {
        this.lLn = true;
        sFClanConfigurationValuesDTO.currentVillageTimerOption = jng.itE.aaT()[sFClanConfigurationValuesDTO.currentVillageTimerOption].getID();
        this.leq.a(this, sFClanConfigurationValuesDTO);
    }

    @llk
    public void showClanMemberSelector() {
        this.lKg = (idq)idx.a(iee.lME);
        this.lKg.d(this.lKn);
        this.lKg.e(lyq.tIQ);
        this.lKg.c(new ays[]{this.leq.dNo()});
        this.lLk.a(iee.lME, true);
    }

    @llk
    public void openChatWhisper(String string) {
        if (this.leq.dNu().getName().compareToIgnoreCase(string) == 0) {
            return;
        }
        idf idf2 = idj.cyJ().cHJ();
        if (idf2 == null) {
            return;
        }
        idf2.setVisible(true);
        idf2.cqF();
        idf2.oh(string);
    }

    @Override
    protected void cOR() {
        super.cOR();
    }
}

