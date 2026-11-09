/*
 * Decompiled with CFR.
 */
public enum bch {
    cVT(mbm.rXy),
    cVU(mbm.udA),
    cVV(mbm.ubr),
    cVW(mbm.ubl),
    cVX(mbm.ukb),
    cVY(mbm.ujW),
    cVZ(mbm.ukc),
    cWa(mbm.ukd),
    cWb(mbm.uke),
    cWc(mbm.ujY),
    cWd(mbm.ujT),
    cWe(mbm.uex);

    private lox ctl = null;

    public lox YF() {
        return this.ctl;
    }

    public boolean vA() {
        return this == cWe;
    }

    private bch(lox lox2) {
        this.ctl = lox2;
    }

    public static bch getValueByOrdinal(int n) {
        return n < 0 || n >= bch.values().length ? cVT : bch.values()[n];
    }
}

