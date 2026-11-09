/*
 * Decompiled with CFR.
 */
public enum ayh {
    cxE(mak.rXy),
    cxF(mak.ubp),
    cxG(mak.ubq),
    cxH(mak.ubr),
    cxI(mak.ubs),
    cxJ(mak.ubt),
    cxK(mak.ubu),
    cxL(mak.ubv),
    cxM(mak.ubw),
    cxN(mak.ubx),
    cxO(mak.uby),
    cxP(mak.ubz),
    cxQ(mak.ubA),
    cxR(mak.ubB),
    cxS(mak.ubC),
    cxT(mak.ubD),
    cxU(mak.ubE);

    private lox ctl = null;

    public boolean vA() {
        return this == cxS || this == cxR;
    }

    public lox YF() {
        return this.ctl;
    }

    private ayh(lox lox2) {
        this.ctl = lox2;
    }

    public static ayh getValueByOrdinal(int n) {
        return n < 0 || n >= ayh.values().length ? cxE : ayh.values()[n];
    }
}

