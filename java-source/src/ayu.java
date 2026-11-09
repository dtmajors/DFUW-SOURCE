/*
 * Decompiled with CFR.
 */
public enum ayu {
    cAR(mbi.rXy),
    cAS(mbi.ubr),
    cAT(mbi.ujA),
    cAU(mbi.ujB),
    cAV(mbi.ujC),
    cAW(mbi.ujD),
    cAX(mbi.uft),
    cAY(mbi.ufu),
    cAZ(mbi.ufs),
    cBa(mbi.tYU),
    cBb(mbi.ujE);

    private lox ctl = null;

    public boolean vA() {
        return this == cBb || this == cBb;
    }

    public lox YF() {
        return this.ctl;
    }

    private ayu(lox lox2) {
        this.ctl = lox2;
    }

    public static ayu getValueByOrdinal(int n) {
        return n < 0 || n >= ayu.values().length ? cAR : ayu.values()[n];
    }
}

