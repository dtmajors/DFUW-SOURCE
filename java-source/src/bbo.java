/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFClanRecruitInformationDTO;

public class bbo {
    private ldv YN = null;
    private String YL = null;
    private int cCF = 0;
    private int cCG = 0;
    private int aEf = 0;

    public ldv ach() {
        return this.YN;
    }

    public void gw(ldv ldv2) {
        this.YN = ldv2;
    }

    public String iU() {
        return this.YL;
    }

    public void fm(String string) {
        this.YL = string;
    }

    public int aci() {
        return this.cCF;
    }

    public void jU(int n) {
        this.cCF = n;
    }

    public int acj() {
        return this.cCG;
    }

    public void jV(int n) {
        this.cCG = n;
    }

    public int akj() {
        return this.aEf;
    }

    public void jW(int n) {
        this.aEf = n;
    }

    public bbo() {
    }

    public bbo(ldv ldv2, String string, int n, int n2, int n3) {
        this.YN = ldv2;
        this.YL = string;
        this.cCF = n;
        this.cCG = n2;
        this.aEf = n3;
    }

    public SFClanRecruitInformationDTO akk() {
        SFClanRecruitInformationDTO sFClanRecruitInformationDTO = new SFClanRecruitInformationDTO();
        sFClanRecruitInformationDTO.playerName = this.YL;
        sFClanRecruitInformationDTO.playerGender = this.cCG;
        sFClanRecruitInformationDTO.playerPoints = this.aEf;
        sFClanRecruitInformationDTO.playerRace = lvm.sXh.bD(this.cCF).exA();
        return sFClanRecruitInformationDTO;
    }
}

