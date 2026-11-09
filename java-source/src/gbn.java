/*
 * Decompiled with CFR.
 */
public class gbn
extends gbq {
    private ldv aEF = null;
    private String aEG = null;
    private int cIv = ayb.cvi.ordinal();
    private ldv aDn = null;
    private String aDo = null;

    public ldv afl() {
        return this.aEF;
    }

    public String afw() {
        return this.aEG;
    }

    public ayb afx() {
        return ayb.getValueByOrdinal(this.cIv);
    }

    public void a(ldv ldv2, String string, ayb ayb2) {
        this.aEF = ldv2;
        this.aEG = string;
        this.cIv = ayb2 == null ? ayb.cvi.ordinal() : ayb2.ordinal();
    }

    public ldv abj() {
        return this.aDn;
    }

    public String abk() {
        return this.aDo;
    }

    public void y(ldv ldv2, String string) {
        this.aDn = ldv2;
        this.aDo = string;
    }

    gbn() {
        super(24329);
    }
}

