/*
 * Decompiled with CFR.
 */
public enum iia {
    lXQ(lxa.tma, null),
    lXR(lxa.tme, null),
    lXS(lxa.tmb, new lox[]{lxa.tmc}),
    lXT(lxa.tmb, new lox[]{lxa.tmd}),
    lXU(lyf.tDz, new lox[]{lyf.tDA}),
    lXV(lyf.tDz, new lox[]{lyf.tDB}),
    lXW(lxa.tlU, new lox[]{lxa.tlZ}),
    lXX(lxa.tlU, new lox[]{lxa.tlV, lxa.tlW, lxa.tlX, lxa.tlY});

    private lox lXY;
    private lox[] lXZ;

    public lox cYM() {
        return this.lXY;
    }

    public lox[] cYN() {
        return this.lXZ;
    }

    private iia(lox lox2, lox[] loxArray) {
        this.lXY = lox2;
        this.lXZ = loxArray;
    }

    public static iia getValueByName(String string) {
        for (iia iia2 : iia.values()) {
            if (iia2.name().compareTo(string) != 0) continue;
            return iia2;
        }
        return null;
    }
}

