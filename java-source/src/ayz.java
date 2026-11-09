/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import spenefett.hid.gui.serialization.dto.SFClanHoldingCitizenDTO;

public class ayz {
    private ldv YN = null;
    private String YL = null;
    private int cCF = 0;
    private int cCG = 0;
    private ldv cCH = null;
    private String YM = null;

    public ldv ach() {
        return this.YN;
    }

    public String iU() {
        return this.YL;
    }

    public int aci() {
        return this.cCF;
    }

    public int acj() {
        return this.cCG;
    }

    public ldv ack() {
        return this.cCH;
    }

    public String acl() {
        return this.YM;
    }

    @Deprecated
    public ayz() {
    }

    public ayz(ldv ldv2, String string, int n, int n2, ldv ldv3, String string2) {
        this.YN = ldv2;
        this.YL = string;
        this.cCF = n;
        this.cCG = n2;
        this.cCH = ldv3;
        this.YM = string2;
    }

    public void m(ldv ldv2, String string) {
        this.cCH = ldv2;
        this.YM = string;
    }

    public SFClanHoldingCitizenDTO eL(ldv ldv2) {
        SFClanHoldingCitizenDTO sFClanHoldingCitizenDTO = new SFClanHoldingCitizenDTO();
        sFClanHoldingCitizenDTO.playerName = this.YL;
        sFClanHoldingCitizenDTO.clanName = this.cCH == null || this.cCH.equals(lcr.qAC) ? null : this.YM;
        sFClanHoldingCitizenDTO.ownerClanMember = this.cCH == null ? false : this.cCH.equals(ldv2);
        return sFClanHoldingCitizenDTO;
    }
}

