/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFClanFortressDetailsDTO;

public class bbi {
    private ldv GUID = null;
    private ljq Position = null;
    private double cEd = 0.0;
    private double cQz = 0.0;
    private boolean cQA = false;
    private ldv ade = null;
    private String cQB = null;
    private int cEh = 0;
    private double cQC = 0.0;
    private double cQD = 0.0;

    public ldv getGUID() {
        return this.GUID;
    }

    public void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public double acU() {
        return this.cEd;
    }

    public void ao(double d2) {
        this.cEd = d2;
    }

    public double ajW() {
        return this.cQz;
    }

    public void aJ(double d2) {
        this.cQz = d2;
    }

    public boolean isDestroyed() {
        return this.cQA;
    }

    public void cN(boolean bl) {
        this.cQA = bl;
    }

    public ldv iG() {
        return this.ade;
    }

    public void ch(ldv ldv2) {
        this.ade = ldv2;
    }

    public String ajX() {
        return this.cQB;
    }

    public void fk(String string) {
        this.cQB = string;
    }

    public int acY() {
        return this.cEh;
    }

    public void ji(int n) {
        this.cEh = n;
    }

    public double ajY() {
        return this.cQC;
    }

    public void aK(double d2) {
        this.cQC = d2;
    }

    public double ajZ() {
        return this.cQD;
    }

    public void aL(double d2) {
        this.cQD = d2;
    }

    public SFClanFortressDetailsDTO d(jng jng2) {
        SFClanFortressDetailsDTO sFClanFortressDetailsDTO = new SFClanFortressDetailsDTO();
        sFClanFortressDetailsDTO.id = this.cQB;
        sFClanFortressDetailsDTO.name = lvm.sXg.bD(this.Position).exA();
        sFClanFortressDetailsDTO.owned = this.ade != null;
        sFClanFortressDetailsDTO.playersClanOwned = jng2.sz(this.ade);
        sFClanFortressDetailsDTO.isActive = this.cEd > 0.0;
        sFClanFortressDetailsDTO.isVulnerable = this.cEd > 0.0 && this.cEd < jng2.getMessageDelegator().arc().rgz;
        sFClanFortressDetailsDTO.isDestroyed = this.cQA;
        return sFClanFortressDetailsDTO;
    }
}

