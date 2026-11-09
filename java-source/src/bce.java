/*
 * Decompiled with CFR.
 */
public enum bce {
    cVx(mbl.rXy),
    cVy(mbl.udA),
    cVz(mbl.ued),
    cVA(mbl.ubr),
    cVB(mbl.ujT),
    cVC(mbl.ujU),
    cVD(mbl.ujV),
    cVE(mbl.ujW),
    cVF(mbl.ujX),
    cVG(mbl.ujY),
    cVH(mbl.uex);

    private lox ctl = null;

    public lox YF() {
        return this.ctl;
    }

    public boolean vA() {
        return this == cVH;
    }

    private bce(lox lox2) {
        this.ctl = lox2;
    }

    public static bce getValueByOrdinal(int n) {
        return n < 0 || n >= bce.values().length ? cVx : bce.values()[n];
    }
}

