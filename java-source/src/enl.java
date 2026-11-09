/*
 * Decompiled with CFR.
 */
public class enl
extends emr {
    private ldv ade = null;
    private ldv isO = null;
    private int ijz = hc.aaz.ordinal();
    private int ivI = bcr.cXg.ordinal();

    public ldv iG() {
        return this.ade;
    }

    public void ch(ldv ldv2) {
        this.ade = ldv2;
    }

    public ldv bHL() {
        return this.isO;
    }

    public void oS(ldv ldv2) {
        this.isO = ldv2;
    }

    public hc bEN() {
        return hc.getAccessLevelType(this.ijz);
    }

    public void f(hc hc2) {
        this.ijz = hc2 == null ? this.ijz : hc2.ordinal();
    }

    public bcr bJA() {
        return bcr.getValueByOrdinal(this.ivI);
    }

    public void d(bcr bcr2) {
        this.ivI = bcr2 == null ? this.ivI : bcr2.ordinal();
    }

    enl() {
        super(13896);
    }
}

