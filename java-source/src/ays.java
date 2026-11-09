/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import spenefett.hid.gui.serialization.dto.SFClanMemberInformationDTO;

public class ays {
    private static String[] cAu = null;
    private static ays[] cAv = null;
    private ldv cAw = null;
    private String Name = null;
    private int cAx = bbs.NoRank.ordinal();
    private int aEP = 0;
    private int aEQ = 0;
    private bcb cAy = null;
    private int aEf = 0;
    private boolean cAz = false;
    private long cAA = -1L;
    private boolean aYb = false;
    private boolean cAB = false;
    private int Race = 0;
    private int Gender = 0;
    private long cAC = 0L;
    private double cAD = 0.0;

    public ldv abB() {
        return this.cAw;
    }

    public String getName() {
        return this.Name;
    }

    public bbs abC() {
        return bbs.getValueByOrdinal(this.cAx);
    }

    public int abD() {
        return this.aEP;
    }

    public int abE() {
        return this.aEQ;
    }

    public int abF() {
        return this.aEf;
    }

    public bcb abG() {
        return this.cAy;
    }

    public boolean b(bca bca2) {
        return this.cAy.d(bca2);
    }

    public boolean qf() {
        return this.cAz;
    }

    public long abH() {
        return this.cAA;
    }

    public boolean abI() {
        return this.cAA >= 0L;
    }

    public boolean abJ() {
        return this.aYb;
    }

    public int abK() {
        return this.Race;
    }

    public int abL() {
        return this.Gender;
    }

    public long B(ldz ldz2) {
        return this.cAC + (long)(ldz2.rgz - this.cAD);
    }

    @Deprecated
    public ays() {
    }

    public ays(bbr bbr2, boolean bl, dxr dxr2) {
        this.cAw = bbr2.abB();
        this.Name = bbr2.akp();
        this.cAx = bbr2.abP().ordinal();
        this.aEP = bbr2.abD();
        this.aEQ = bbr2.akr();
        this.cAy = bbr2.abG().akW();
        this.aEf = bbr2.abF();
        this.cAz = bbr2.qf();
        this.cAA = bbr2.aks();
        this.aYb = bbr2.abJ();
        this.cAB = bl;
        this.Race = bbr2.js();
        this.Gender = bbr2.jt();
        this.cAC = (dxr2.bzy().getTimeInMillis() - bbr2.akq()) / 1000L;
        this.cAD = dxr2.arc().rgz;
    }

    private ays(int n) {
        this.cAw = lcr.qAC;
        this.Name = cAu[n];
        this.aEP = (int)(lgp.erA().nextFloat() * 6000.0f);
        this.cAx = bbs.getRankForKills(this.aEP).ordinal();
        this.aEQ = (int)(lgp.erA().nextFloat() * 1000.0f);
        this.cAy = bcb.akZ();
        this.aEf = (int)(lgp.erA().nextFloat() * 10000.0f);
        this.cAz = lgp.erA().cS(lgp.erA().nextFloat());
        this.cAA = -1L;
        this.Race = (int)(lgp.erA().nextFloat() * 6.0f) + 1;
        this.Gender = (int)(lgp.erA().nextFloat() * 2.0f) + 1;
        this.cAC = this.cAz ? 0L : (long)(lgp.erA().nextFloat() * 4233600.0f);
        this.cAD = 0.0;
    }

    public void cp(boolean bl) {
        this.aYb = bl;
    }

    public void a(boolean bl, long l, double d2) {
        this.cAz = bl;
        this.cAC = l;
        this.cAD = d2;
    }

    public void iX(int n) {
        this.aEP = n;
    }

    public void a(bbs bbs2) {
        this.cAx = bbs2 == null ? this.cAx : bbs2.ordinal();
    }

    public void a(bcb bcb2) {
        this.cAy = bcb2;
    }

    public void iY(int n) {
        this.aEQ = n;
    }

    public void y(long l) {
        this.cAA = l;
    }

    public void iZ(int n) {
        this.aEf = n;
    }

    public void eU(String string) {
        this.Name = string;
    }

    public SFClanMemberInformationDTO abM() {
        ldv ldv2 = hso.cxK() != null && hso.cxK().bAn() != null ? hso.cxK().bAn().Tr : null;
        SFClanMemberInformationDTO sFClanMemberInformationDTO = new SFClanMemberInformationDTO();
        sFClanMemberInformationDTO.characterID = this.cAw.enw();
        sFClanMemberInformationDTO.name = this.Name;
        sFClanMemberInformationDTO.rank = this.cAx;
        sFClanMemberInformationDTO.killCount = this.aEP;
        sFClanMemberInformationDTO.clanPointsEarned = this.aEQ;
        sFClanMemberInformationDTO.playerPointsTotal = this.aEf;
        sFClanMemberInformationDTO.permissions = lcn.emv();
        sFClanMemberInformationDTO.isOnline = this.cAz;
        sFClanMemberInformationDTO.isLeavingClan = this.abI();
        for (bca bca2 : this.cAy) {
            sFClanMemberInformationDTO.permissions.add(bca2.getID());
            if (!bca2.akN()) continue;
            sFClanMemberInformationDTO.isManager = true;
        }
        sFClanMemberInformationDTO.isLeader = this.aYb;
        sFClanMemberInformationDTO.isFounder = this.cAB;
        sFClanMemberInformationDTO.isPlayer = this.cAw.equals(ldv2);
        sFClanMemberInformationDTO.gender = this.Gender;
        sFClanMemberInformationDTO.raceName = lvm.sXh.bD(this.Race).exA();
        return sFClanMemberInformationDTO;
    }

    public boolean a(ays ays2) {
        return this.cAx == ays2.cAx && this.aEP == ays2.aEP && this.aEQ == ays2.aEQ && this.cAy.size() == ays2.cAy.size() && this.cAy.containsAll(ays2.cAy) && this.aEf == ays2.aEf && this.cAz == ays2.cAz && this.cAA == ays2.cAA && this.aYb == ays2.aYb && this.cAC == ays2.cAC && this.cAD == ays2.cAD;
    }

    public static ays[] abN() {
        if (cAu == null) {
            cAu = new String[]{"Craig", "Mac", "Thanos", "Chris", "Elias", "George", "Paris", "Tassos", "Tasos", "Geo", "Demos", "Michael", "Erini", "Nicko", "Vele", "Adam", "Vangelis", "Tork", "Al", "Spiros", "Panos", "Vicky", "Anastasia", "Kjetil", "Erik", "Claus", "Henning", "Roman", "Mirco", "Nantia", "Anita", "Chryssa", "Aris"};
        }
        if (cAv == null) {
            cAv = new ays[cAu.length];
            for (int i = 0; i < cAv.length; ++i) {
                ays.cAv[i] = new ays(i);
            }
        }
        return cAv;
    }
}

