/*
 * Decompiled with CFR.
 */
public enum bbu {
    cRX(mbf.rXy),
    cRY(mbf.uiP),
    cRZ(mbf.uiQ),
    cSa(mbf.uiR),
    cSb(mbf.uiS),
    cSc(mbf.uiT),
    cSd(mbf.uiU),
    cSe(mbf.uiV),
    cSf(mbf.uiW),
    cSg(mbf.uiX),
    cSh(mbf.uiM);

    private lox ctl = null;

    public boolean vA() {
        return this == cSg;
    }

    public lox YF() {
        return this.ctl;
    }

    private bbu(lox lox2) {
        this.ctl = lox2;
    }

    public static bbu getValueByOrdinal(int n) {
        return n < 0 || n >= bbu.values().length ? cRX : bbu.values()[n];
    }
}

