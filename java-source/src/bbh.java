/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFClanVillageDetailsDTO;

public class bbh {
    private ldv GUID = null;
    private String ID = null;
    private ljq Position = null;
    private ldv ade = null;
    private double cEd = 0.0;
    private double cEg = 0.0;
    private double cQw = 0.0;
    private double cQx = 0.0;
    private int cEh = 0;
    private float cQy = 0.0f;

    public ldv getGUID() {
        return this.GUID;
    }

    public void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String string) {
        this.ID = string;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public ldv iG() {
        return this.ade;
    }

    public void ch(ldv ldv2) {
        this.ade = ldv2;
    }

    public double acU() {
        return this.cEd;
    }

    public void ao(double d2) {
        this.cEd = d2;
    }

    public double acX() {
        return this.cEg;
    }

    public void ar(double d2) {
        this.cEg = d2;
    }

    public double ajT() {
        return this.cQw;
    }

    public void aH(double d2) {
        this.cQw = d2;
    }

    public double ajU() {
        return this.cQx;
    }

    public void aI(double d2) {
        this.cQx = d2;
    }

    public int acY() {
        return this.cEh;
    }

    public void ji(int n) {
        this.cEh = n;
    }

    public float ajV() {
        return this.cQy;
    }

    public void cr(float f) {
        this.cQy = f;
    }

    public SFClanVillageDetailsDTO c(jng jng2) {
        SFClanVillageDetailsDTO sFClanVillageDetailsDTO = new SFClanVillageDetailsDTO();
        sFClanVillageDetailsDTO.id = this.ID;
        sFClanVillageDetailsDTO.name = lvm.sWZ.bD(this.ID).exA();
        sFClanVillageDetailsDTO.owned = this.ade != null;
        sFClanVillageDetailsDTO.playersClanOwned = jng2.sz(this.ade);
        sFClanVillageDetailsDTO.isVulnerable = this.cEd <= 0.0;
        sFClanVillageDetailsDTO.isRequisitioningAvailable = this.cQw <= jng2.getMessageDelegator().arc().rgz;
        return sFClanVillageDetailsDTO;
    }
}

