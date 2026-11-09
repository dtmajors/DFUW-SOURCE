/*
 * Decompiled with CFR.
 */
public enum aza {
    cCI(mba.rXy),
    cCJ(mba.ubl),
    cCK(mba.ubr),
    cCL(mba.uht),
    cCM(mba.uhu),
    cCN(mba.uhv),
    cCO(mba.uhw),
    cCP(mba.uhx),
    cCQ(mba.uhy),
    cCR(mba.uhz),
    cCS(mba.uhA),
    cCT(mba.uhB);

    private lox ctl = null;

    public boolean vA() {
        return this == cCQ;
    }

    public lox YF() {
        return this.ctl;
    }

    private aza(lox lox2) {
        this.ctl = lox2;
    }

    public static aza getValueByOrdinal(int n) {
        return n < 0 || n >= aza.values().length ? cCI : aza.values()[n];
    }
}

