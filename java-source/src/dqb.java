/*
 * Decompiled with CFR.
 */
public class dqb {
    private ldv aEF = null;
    private String aEG = null;
    private ayb gNJ = ayb.cvi;
    private ldv aDn = null;
    private String aDo = null;

    public ldv afl() {
        return this.aEF;
    }

    public String afw() {
        return this.aEG;
    }

    public ayb afx() {
        return this.gNJ;
    }

    public ldv abj() {
        return this.aDn;
    }

    public String abk() {
        return this.aDo;
    }

    public dqb(ldv ldv2, String string, ayb ayb2) {
        this.aEF = ldv2;
        this.aEG = string;
        this.gNJ = ayb2;
    }

    public void a(gbn gbn2) {
        if (gbn2 == null) {
            return;
        }
        if (!this.aEF.equals(gbn2.afl())) {
            return;
        }
        this.aEG = gbn2.afw();
        this.gNJ = gbn2.afx();
        this.aDn = gbn2.abj();
        this.aDo = gbn2.abk();
    }

    public void a(gbm gbm2) {
        if (gbm2 == null) {
            return;
        }
        if (!this.aEF.equals(gbm2.afl())) {
            return;
        }
        if (this.aDn == null || !ldv.au(this.aDn, gbm2.iG())) {
            return;
        }
        this.aDo = gbm2.iV();
    }
}

