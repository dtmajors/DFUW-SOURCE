/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  hvy
 */
import java.util.Set;
import spenefett.hid.gui.serialization.dto.SFClanMemberInformationDTO;
import spenefett.hid.gui.serialization.dto.SFClanMemberListDTO;
import spenefett.hid.gui.serialization.dto.SFStringsClanMemberRosterDTO;

public class idp
extends idw
implements htw,
hua,
hwf {
    private ays[] lKG = null;
    private iec lKH = iec.lMb;
    private hvy lep = null;
    private boolean lKI = false;

    idp() {
        super("ClanMemberRoster", "ClanMemberRoster.swf", iee.lMA);
    }

    @Override
    protected void cON() {
        super.cON();
        if (this.isVisible()) {
            this.lLm.a(hyy.a.lrD, this);
            this.lLm.a(hyy.a.lrD, true);
            switch (this.lKH) {
                case lMb: 
                case lMc: {
                    this.lLm.a(hyy.b.ltJ, this.lKH.cPf());
                    this.lLm.a(hyy.b.ltL, 0);
                    this.lLm.a(hyy.b.ltK, 0);
                    this.lLm.a(hyy.b.ltM, 0);
                    this.lLm.a(hyy.b.ltN, 0);
                    break;
                }
                case lMf: 
                case lMg: {
                    this.lLm.a(hyy.b.ltJ, 0);
                    this.lLm.a(hyy.b.ltL, this.lKH.cPf());
                    this.lLm.a(hyy.b.ltK, 0);
                    this.lLm.a(hyy.b.ltM, 0);
                    this.lLm.a(hyy.b.ltN, 0);
                    break;
                }
                case lMd: 
                case lMe: {
                    this.lLm.a(hyy.b.ltJ, 0);
                    this.lLm.a(hyy.b.ltL, 0);
                    this.lLm.a(hyy.b.ltK, this.lKH.cPf());
                    this.lLm.a(hyy.b.ltM, 0);
                    this.lLm.a(hyy.b.ltN, 0);
                    break;
                }
                case lMh: 
                case lMi: {
                    this.lLm.a(hyy.b.ltJ, 0);
                    this.lLm.a(hyy.b.ltL, 0);
                    this.lLm.a(hyy.b.ltK, 0);
                    this.lLm.a(hyy.b.ltM, this.lKH.cPf());
                    this.lLm.a(hyy.b.ltN, 0);
                    break;
                }
                case lMj: 
                case lMk: {
                    this.lLm.a(hyy.b.ltJ, 0);
                    this.lLm.a(hyy.b.ltL, 0);
                    this.lLm.a(hyy.b.ltK, 0);
                    this.lLm.a(hyy.b.ltM, 0);
                    this.lLm.a(hyy.b.ltN, this.lKH.cPf());
                }
            }
            if (this.lLp != null) {
                this.lLm.a(new hyy.a[]{this.lLp, hyy.a.lrD}, this.cEF());
            }
        } else {
            this.lLm.a(hyy.a.lrD, false);
            this.lLm.b(hyy.a.lrD);
        }
        this.lLm.a(hyy.b.ltv, this.isVisible() ? 1 : 0);
    }

    @Override
    protected void c(hyy.b b2, int n) {
        switch (b2) {
            case ltJ: {
                if (this.lKH.a(iec.lMb)) {
                    this.lKH = this.lKH.cPg();
                    break;
                }
                this.lLm.a(hyy.b.ltL, 0);
                this.lLm.a(hyy.b.ltK, 0);
                this.lLm.a(hyy.b.ltM, 0);
                this.lLm.a(hyy.b.ltN, 0);
                this.lKH = iec.lMb;
                break;
            }
            case ltL: {
                if (this.lKH.a(iec.lMf)) {
                    this.lKH = this.lKH.cPg();
                    break;
                }
                this.lLm.a(hyy.b.ltJ, 0);
                this.lLm.a(hyy.b.ltK, 0);
                this.lLm.a(hyy.b.ltM, 0);
                this.lLm.a(hyy.b.ltN, 0);
                this.lKH = iec.lMf;
                break;
            }
            case ltK: {
                if (this.lKH.a(iec.lMd)) {
                    this.lKH = this.lKH.cPg();
                    break;
                }
                this.lLm.a(hyy.b.ltJ, 0);
                this.lLm.a(hyy.b.ltL, 0);
                this.lLm.a(hyy.b.ltM, 0);
                this.lLm.a(hyy.b.ltN, 0);
                this.lKH = iec.lMd;
                break;
            }
            case ltM: {
                if (this.lKH.a(iec.lMh)) {
                    this.lKH = this.lKH.cPg();
                    break;
                }
                this.lLm.a(hyy.b.ltJ, 0);
                this.lLm.a(hyy.b.ltL, 0);
                this.lLm.a(hyy.b.ltK, 0);
                this.lLm.a(hyy.b.ltN, 0);
                this.lKH = iec.lMh;
                break;
            }
            case ltN: {
                if (this.lKH.a(iec.lMj)) {
                    this.lKH = this.lKH.cPg();
                    break;
                }
                this.lLm.a(hyy.b.ltJ, 0);
                this.lLm.a(hyy.b.ltL, 0);
                this.lLm.a(hyy.b.ltK, 0);
                this.lLm.a(hyy.b.ltM, 0);
                this.lKH = iec.lMj;
                break;
            }
            default: {
                return;
            }
        }
        this.lLm.a(b2, this.lKH.cPf());
        this.a("setSortOrder", new Object[]{this.lKH.ordinal()});
    }

    @Override
    public void oi() {
        if (this.lLk.cIj()) {
            this.lLk.pq(false);
        }
    }

    @Override
    public void cyA() {
        if (!this.isVisible() && !this.lLk.a((idv)this)) {
            return;
        }
        if (this.leq != null) {
            this.leq.a(this);
        }
    }

    @Override
    public void b(ays[] aysArray) {
        int n;
        this.lKG = aysArray;
        Set<Integer> set = lcn.emx();
        SFClanMemberListDTO sFClanMemberListDTO = new SFClanMemberListDTO();
        sFClanMemberListDTO.members = lcn.emv();
        if (this.lKG != null) {
            for (int j = 0; j < aysArray.length; ++j) {
                SFClanMemberInformationDTO sFClanMemberInformationDTO = aysArray[j].abM();
                sFClanMemberListDTO.members.add(sFClanMemberInformationDTO);
                if (aysArray[j].qf()) continue;
                set.add(j);
            }
        }
        Integer[] integerArray = set.toArray(new Integer[set.size()]);
        boolean bl = false;
        int n2 = integerArray.length - 1;
        while (!bl) {
            bl = true;
            for (n = 0; n < n2; ++n) {
                if (aysArray[integerArray[n]].B(this.MessageDelegator.arc()) <= aysArray[integerArray[n + 1]].B(this.MessageDelegator.arc())) continue;
                Integer n3 = integerArray[n];
                integerArray[n] = integerArray[n + 1];
                integerArray[n + 1] = n3;
                bl = false;
            }
            --n2;
        }
        for (n = 0; n < integerArray.length; ++n) {
            sFClanMemberListDTO.members.get((int)integerArray[n].intValue()).lastOnlineTimeSortOrderIdx = n;
        }
        this.a("takeMemberList", new Object[]{sFClanMemberListDTO});
        this.cOW();
        this.a("setSummonAvailability", new Object[]{this.lKI});
    }

    @Override
    public void a(ays ays2, htw.a a2) {
        if (!this.isVisible() && !this.lLk.a((idv)this)) {
            return;
        }
        this.a("updateClanMemberDetails", new Object[]{ays2.abM()});
        if (a2 == htw.a.ldq && !ays2.qf()) {
            this.a("incrementOfflineSortIndices", new Object[]{ays2.abM()});
        }
        if (this.lKH.a(a2)) {
            this.a("resortClanMemberList", new Object[0]);
        }
    }

    @Override
    public void cf(cxc cxc2) {
        if (cxc2 == null) {
            return;
        }
        if (cxc2.zg() == cxd.fHi) {
            this.cOW();
        }
    }

    @Override
    public void ck(cxc cxc2) {
        if (cxc2 == null) {
            return;
        }
        if (cxc2.zg() == cxd.fHi) {
            this.cOW();
        }
    }

    @Override
    public void cl(cxc cxc2) {
        if (cxc2 == null) {
            return;
        }
        if (cxc2.zg() == cxd.fHi) {
            this.cOW();
        }
    }

    @Override
    public void a(cxc cxc2, float f, double d2) {
        if (cxc2 == null) {
            return;
        }
        if (cxc2.zg() == cxd.fHi) {
            this.cOW();
        }
    }

    @Override
    public void c(cxc cxc2, boolean bl) {
        if (cxc2 == null) {
            return;
        }
        if (cxc2.zg() == cxd.fHi) {
            this.cOW();
        }
    }

    @Override
    public void i(cxc cxc2, int n) {
    }

    @Override
    protected void cOO() {
        if (this.leq != null) {
            this.leq.a(this);
        }
        if (this.lep == null && hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null) {
            this.lep = hso.cxK().cxP().cyZ();
            this.lep.a((hwf)this);
        }
        this.a("setSortOrder", new Object[]{this.lKH.ordinal()});
        this.cOW();
        this.lLs = false;
    }

    @Override
    protected void cOP() {
        this.a("setHeight", new Object[]{this.fc});
    }

    @Override
    public void zO() {
        super.zO();
        this.lKH = iec.lMb;
    }

    private void cOW() {
        cxc cxc2;
        boolean bl = this.lKI;
        this.lKI = false;
        if (this.lep != null && (cxc2 = this.lep.ht(cxd.fHi)) != null) {
            boolean bl2 = this.lKI = !this.lep.re(cxc2.getGUID());
        }
        if (bl != this.lKI) {
            this.a("setSummonAvailability", new Object[]{this.lKI});
        }
    }

    @Override
    protected void cOQ() {
        SFStringsClanMemberRosterDTO sFStringsClanMemberRosterDTO = new SFStringsClanMemberRosterDTO();
        sFStringsClanMemberRosterDTO.title = lwh.tce.bD(new Object[0]).exA();
        sFStringsClanMemberRosterDTO.memberNameHeader = lwh.teb.bD(new Object[0]).exA();
        sFStringsClanMemberRosterDTO.killsHeader = lwh.tec.bD(new Object[0]).exA();
        sFStringsClanMemberRosterDTO.clanPointsHeader = lwh.ted.bD(new Object[0]).exA();
        sFStringsClanMemberRosterDTO.searchFilterDefaultText = lwh.tee.bD(new Object[0]).exA();
        sFStringsClanMemberRosterDTO.raceNameAlfar = lvm.sXh.bD(1).exA();
        sFStringsClanMemberRosterDTO.raceNameDwarf = lvm.sXh.bD(2).exA();
        sFStringsClanMemberRosterDTO.raceNameHuman = lvm.sXh.bD(3).exA();
        sFStringsClanMemberRosterDTO.raceNameMahirim = lvm.sXh.bD(4).exA();
        sFStringsClanMemberRosterDTO.raceNameMirdain = lvm.sXh.bD(5).exA();
        sFStringsClanMemberRosterDTO.raceNameOrk = lvm.sXh.bD(6).exA();
        this.a("takeStrings", new Object[]{sFStringsClanMemberRosterDTO});
    }

    @Override
    protected void cOR() {
        super.cOR();
        if (!lLj.containsKey("ClanMemberRosterClanMemberOverview")) {
            lLj.put("ClanMemberRosterClanMemberOverview", new lfs<lox, lox>(lyp.tIK, lyp.tIL));
            lLj.put("ClanMemberRosterSummonClanMember", new lfs<lox, lox>(lyp.tIM, lyp.tIN));
        }
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
    public void showClanMemberOverview(int n) {
        if (this.lKG == null || n < 0 || n >= this.lKG.length || this.lKG[n] == null) {
            return;
        }
        ido ido2 = (ido)idx.a(iee.lMB);
        ido2.e(this.lKG[n]);
        this.lLk.a(iee.lMB, true);
    }

    @llk
    public void openChatWhisper(SFClanMemberInformationDTO sFClanMemberInformationDTO) {
        if (this.leq.f(this.leq.a(sFClanMemberInformationDTO))) {
            return;
        }
        idp.cyJ().oh(sFClanMemberInformationDTO.name);
    }

    @llk
    public void summonClanMember(SFClanMemberInformationDTO sFClanMemberInformationDTO) {
        if (this.leq.f(this.leq.a(sFClanMemberInformationDTO))) {
            return;
        }
        this.cOW();
        if (!this.lKI) {
            return;
        }
        if (hso.cxK() == null || hso.cxK().bAn() == null) {
            return;
        }
        gjt gjt2 = (gjt)this.MessageDelegator.h(4617, this.getGUID(), hso.cxK().bAn().gYY);
        gjt2.SkillType = cxd.fHi;
        gjt2.YL = sFClanMemberInformationDTO.name;
        this.MessageDelegator.F(gjt2);
        this.cOW();
    }
}

