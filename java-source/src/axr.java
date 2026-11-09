/*
 * Decompiled with CFR.
 */
public enum axr {
    ctd(may.ufW),
    cte(may.ufX),
    ctf(may.ufZ),
    ctg(may.uga),
    cth(may.ufY),
    cti(may.ugb),
    ctj(may.ugc),
    ctk(may.ufY);

    private lox ctl = null;

    public lox YF() {
        return this.ctl;
    }

    public boolean vA() {
        return this == cte;
    }

    private axr(lox lox2) {
        this.ctl = lox2;
    }

    public static axr getValueByOrdinal(int n) {
        return n < 0 || n >= axr.values().length ? ctd : axr.values()[n];
    }
}

