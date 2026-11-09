/*
 * Decompiled with CFR.
 */
public enum bcs {
    cXk(mbq.rXy),
    cXl(mbq.uld),
    cXm(mbq.ubl),
    cXn(mbq.ubr),
    cXo(mbq.ule),
    cXp(mbq.ulf),
    cXq(mbq.ulg),
    cXr(mbq.ulh),
    cXs(mbq.uli),
    cXt(mbq.ulj);

    private lox ctl = null;

    public lox YF() {
        return this.ctl;
    }

    public boolean vA() {
        return this == cXt;
    }

    private bcs(lox lox2) {
        this.ctl = lox2;
    }

    public static bcs getValueByOrdinal(int n) {
        return n < 0 || n >= bcs.values().length ? cXk : bcs.values()[n];
    }
}

