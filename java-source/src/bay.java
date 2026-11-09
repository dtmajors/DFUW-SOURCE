/*
 * Decompiled with CFR.
 */
public class bay {
    private ldv aEF = null;
    private String aEG = null;
    private int cIv = ayb.cvi.ordinal();
    private ljq cIw = null;
    private int cPr = bab.cIN.ordinal();
    private baw cPs = null;
    private baw cPt = null;

    public ldv afl() {
        return this.aEF;
    }

    void fx(ldv ldv2) {
        this.aEF = ldv2;
    }

    public String afw() {
        return this.aEG;
    }

    void fb(String string) {
        this.aEG = string;
    }

    public ayb afx() {
        return ayb.getValueByOrdinal(this.cIv);
    }

    void h(ayb ayb2) {
        this.cIv = ayb2 == null ? this.cIv : ayb2.ordinal();
    }

    public ljq afy() {
        return this.cIw;
    }

    void aH(ljq ljq2) {
        this.cIw = ljq2;
    }

    public bab ajm() {
        return bab.getPhaseFromOrdinal(this.cPr);
    }

    void b(bab bab2) {
        this.cPr = bab2 == null ? this.cPr : bab2.ordinal();
    }

    public baw ajn() {
        return this.cPs;
    }

    public baw ajo() {
        return this.cPt;
    }

    void a(baw baw2, baw baw3) {
        this.cPs = baw2;
        this.cPt = baw3;
    }

    bay() {
    }
}

