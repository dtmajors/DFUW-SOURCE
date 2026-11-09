/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 */
import java.util.EnumSet;
import spenefett.hid.gui.serialization.dto.SFClanInformationDTO;
import spenefett.hid.gui.serialization.dto.SFClanMembershipCountsDTO;
import spenefett.hid.gui.serialization.dto.SFClanMembershipRestrictionsDTO;
import spenefett.hid.gui.serialization.dto.SFClanToClanPoliticalStanceDTO;

public class ayq {
    protected ldv ade = null;
    protected String add = null;
    protected String aDF = null;
    protected String aDG = null;
    protected String cAe = null;
    protected String cAf = null;
    protected int[] cAg = null;
    protected boolean cAh = false;
    protected int cAi = 0;
    protected int[] cAj = null;
    protected ldv[] cAk = null;
    protected ldv[] cAl = null;
    protected ldv[] cAm = null;
    protected int aDP = 0;
    protected boolean cAn = false;
    protected boolean cAo = false;

    public ldv iG() {
        return this.ade;
    }

    public String iV() {
        return this.add;
    }

    public String ZK() {
        return this.aDF;
    }

    public String ZL() {
        return this.aDG;
    }

    public int abw() {
        return this.cAj[0];
    }

    public int iV(int n) {
        return n < 1 || n >= this.cAj.length ? 0 : this.cAj[n];
    }

    public String abx() {
        return this.cAe;
    }

    public String aby() {
        return this.cAf;
    }

    public boolean iW(int n) {
        for (int i = 0; i < this.cAg.length; ++i) {
            if (this.cAg[i] != n) continue;
            return true;
        }
        return false;
    }

    public boolean abz() {
        return this.cAh;
    }

    public EnumSet<ayw> ZO() {
        return ayw.getEnumSet(this.cAi);
    }

    public boolean eu(ldv ldv2) {
        if (this.cAk == null) {
            return false;
        }
        for (int i = 0; i < this.cAk.length; ++i) {
            if (!this.cAk[i].equals(ldv2)) continue;
            return true;
        }
        return false;
    }

    public boolean ev(ldv ldv2) {
        if (this.cAl == null) {
            return false;
        }
        for (int i = 0; i < this.cAl.length; ++i) {
            if (!this.cAl[i].equals(ldv2)) continue;
            return true;
        }
        return false;
    }

    public boolean ew(ldv ldv2) {
        if (this.cAm == null) {
            return false;
        }
        for (int i = 0; i < this.cAm.length; ++i) {
            if (!this.cAm[i].equals(ldv2)) continue;
            return true;
        }
        return false;
    }

    @Deprecated
    public ayq() {
    }

    public ayq(ayd ayd2) {
        int n;
        this.ade = ayd2.getGUID();
        this.add = ayd2.iV();
        this.aDF = ayd2.ZK();
        this.aDG = ayd2.ZL();
        this.cAe = ayd2.ZW();
        this.cAf = ayd2.ZY();
        this.cAh = ayd2.aaa();
        this.cAi = ayw.getTags(ayd2.ZO());
        this.cAk = ayd2.aaf();
        this.cAl = ayd2.aah();
        this.cAm = ayd2.aaj();
        this.aDP = ayd2.aap();
        this.cAn = ayd2.ZZ();
        this.cAo = ayd2.ZX();
        this.cAj = new int[7];
        this.cAj[0] = ayd2.ZT();
        for (n = 1; n < this.cAj.length; ++n) {
            this.cAj[n] = ayd2.iN(n);
        }
        n = 0;
        if (ayd2.iP(1)) {
            ++n;
        }
        if (ayd2.iP(2)) {
            ++n;
        }
        if (ayd2.iP(3)) {
            ++n;
        }
        if (ayd2.iP(4)) {
            ++n;
        }
        if (ayd2.iP(5)) {
            ++n;
        }
        if (ayd2.iP(6)) {
            ++n;
        }
        this.cAg = new int[n];
        n = 0;
        if (ayd2.iP(1)) {
            this.cAg[n++] = 1;
        }
        if (ayd2.iP(2)) {
            this.cAg[n++] = 2;
        }
        if (ayd2.iP(3)) {
            this.cAg[n++] = 3;
        }
        if (ayd2.iP(4)) {
            this.cAg[n++] = 4;
        }
        if (ayd2.iP(5)) {
            this.cAg[n++] = 5;
        }
        if (ayd2.iP(6)) {
            this.cAg[n++] = 6;
        }
    }

    public ayq(job job2) {
        this.ade = job2.dOx();
        this.add = job2.dOo();
        this.aDF = this.add + " Motto!";
        this.aDG = this.add + " Charter";
        this.cAf = this.cAe = job2.dOp();
        this.cAh = job2.dOn();
        this.cAi = job2.dOq();
        this.cAj = job2.dOs();
        this.cAg = job2.dOt();
    }

    protected ayq(ayq ayq2) {
        this.ade = ayq2.ade;
        this.add = ayq2.add;
        this.aDF = ayq2.aDF;
        this.aDG = ayq2.aDG;
        this.cAe = ayq2.cAe;
        this.cAf = ayq2.cAf;
        this.cAh = ayq2.cAh;
        this.cAi = ayq2.cAi;
        this.cAg = ayq2.cAg;
        this.cAj = ayq2.cAj;
    }

    public void eT(String string) {
        this.add = string;
    }

    public boolean a(ayq ayq2) {
        if (ayq2 == null) {
            return true;
        }
        return !this.ade.equals(ayq2.ade);
    }

    public boolean b(ayq ayq2) {
        if (ayq2 == null) {
            return true;
        }
        if (this.c(ayq2)) {
            return true;
        }
        if (this.d(ayq2)) {
            return true;
        }
        if (this.e(ayq2)) {
            return true;
        }
        if (this.f(ayq2)) {
            return true;
        }
        return this.g(ayq2);
    }

    public boolean c(ayq ayq2) {
        if (ayq2 == null) {
            return true;
        }
        return !this.aDF.equals(ayq2.aDF);
    }

    public boolean d(ayq ayq2) {
        if (ayq2 == null) {
            return true;
        }
        return !this.aDG.equals(ayq2.aDG);
    }

    public boolean e(ayq ayq2) {
        if (ayq2 == null) {
            return true;
        }
        if (this.cAg.length != ayq2.cAg.length) {
            return true;
        }
        for (int i = 0; i < this.cAg.length; ++i) {
            boolean bl = false;
            int n = 0;
            if (n < ayq2.cAg.length) {
                bl = true;
            }
            if (bl) continue;
            return true;
        }
        return false;
    }

    public boolean f(ayq ayq2) {
        if (ayq2 == null) {
            return true;
        }
        return this.cAh != ayq2.cAh;
    }

    public boolean g(ayq ayq2) {
        if (ayq2 == null) {
            return true;
        }
        return this.cAi != ayq2.cAi;
    }

    public SFClanInformationDTO a(SFClanToClanPoliticalStanceDTO sFClanToClanPoliticalStanceDTO, ldv ldv2) {
        SFClanMembershipRestrictionsDTO sFClanMembershipRestrictionsDTO = new SFClanMembershipRestrictionsDTO();
        sFClanMembershipRestrictionsDTO.acceptingNewMembers = this.cAh;
        sFClanMembershipRestrictionsDTO.acceptingAlfar = this.iW(1);
        sFClanMembershipRestrictionsDTO.acceptingDwarf = this.iW(2);
        sFClanMembershipRestrictionsDTO.acceptingHuman = this.iW(3);
        sFClanMembershipRestrictionsDTO.acceptingMahirim = this.iW(4);
        sFClanMembershipRestrictionsDTO.acceptingMirdain = this.iW(5);
        sFClanMembershipRestrictionsDTO.acceptingOrk = this.iW(6);
        SFClanMembershipCountsDTO sFClanMembershipCountsDTO = new SFClanMembershipCountsDTO();
        sFClanMembershipCountsDTO.totalMembers = this.cAj[0];
        sFClanMembershipCountsDTO.alfarMembers = this.cAj[1];
        sFClanMembershipCountsDTO.dwarfMembers = this.cAj[2];
        sFClanMembershipCountsDTO.humanMembers = this.cAj[3];
        sFClanMembershipCountsDTO.mahirimMembers = this.cAj[4];
        sFClanMembershipCountsDTO.mirdainMembers = this.cAj[5];
        sFClanMembershipCountsDTO.orkMembers = this.cAj[6];
        SFClanInformationDTO sFClanInformationDTO = new SFClanInformationDTO();
        sFClanInformationDTO.clanName = this.add;
        sFClanInformationDTO.clanFounderName = this.cAe;
        sFClanInformationDTO.clanLeaderName = this.cAf;
        sFClanInformationDTO.clanMotto = this.aDF;
        sFClanInformationDTO.clanCharter = this.aDG;
        sFClanInformationDTO.membershipRestrictions = sFClanMembershipRestrictionsDTO;
        sFClanInformationDTO.membershipCounts = sFClanMembershipCountsDTO;
        EnumSet<ayw> enumSet = ayw.getEnumSet(this.cAi);
        sFClanInformationDTO.clanTags = lcn.emv();
        for (ayw ayw2 : enumSet) {
            sFClanInformationDTO.clanTags.add(ayw2.acb());
        }
        sFClanInformationDTO.politicalStance = sFClanToClanPoliticalStanceDTO == null ? bcr.cXg.ordinal() : sFClanToClanPoliticalStanceDTO.politicalStance;
        sFClanInformationDTO.theirPoliticalStance = sFClanToClanPoliticalStanceDTO == null ? bcr.cXg.ordinal() : sFClanToClanPoliticalStanceDTO.theirPoliticalStance;
        sFClanInformationDTO.playerOnKOS = this.eu(ldv2);
        sFClanInformationDTO.playerOnBanned = this.ev(ldv2);
        sFClanInformationDTO.playerOnAllowedBinds = this.ew(ldv2);
        sFClanInformationDTO.clanPointsTotal = this.aDP;
        sFClanInformationDTO.leaderOnline = this.cAn;
        sFClanInformationDTO.founderOnline = this.cAo;
        return sFClanInformationDTO;
    }
}

