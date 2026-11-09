/*
 * Decompiled with CFR.
 */
public class enf
extends emr
implements dxu {
    private int aqs = -1;
    private int gOd = bcg.cVM.ordinal();
    private ldv isO = null;
    private ldv cRC = null;
    private String aEN = null;
    private bcb cAy = null;
    private int ijz = hc.aaz.ordinal();

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public bcg bJc() {
        return bcg.getValueByOrdinal(this.gOd);
    }

    public void a(bcg bcg2) {
        this.gOd = bcg2 == null ? this.gOd : bcg2.ordinal();
    }

    public ldv bHL() {
        return this.isO;
    }

    public void oS(ldv ldv2) {
        this.isO = ldv2;
    }

    public ldv bJd() {
        return this.cRC;
    }

    public void oZ(ldv ldv2) {
        this.cRC = ldv2;
    }

    public String zo() {
        return this.aEN;
    }

    public void ke(String string) {
        this.aEN = string;
    }

    public bcb abG() {
        return this.cAy;
    }

    public void e(bcb bcb2) {
        this.cAy = bcb2;
    }

    public hc bEN() {
        return hc.getAccessLevelType(this.ijz);
    }

    public void f(hc hc2) {
        this.ijz = hc2 == null ? this.ijz : hc2.ordinal();
    }

    enf() {
        super(13880);
    }
}

