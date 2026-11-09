/*
 * Decompiled with CFR.
 */
public enum bbw {
    cSD,
    cSE,
    cSF,
    cSG,
    cSH,
    cSI,
    cSJ,
    cSK,
    cSL,
    cSM,
    cSN,
    cSO;

    private static final bbw[] cSP;

    public static final int getValueCount() {
        return cSP.length;
    }

    public static bbw getValueByOrdinal(int n) {
        if (n >= 0 && n < bbw.getValueCount()) {
            return cSP[n];
        }
        return null;
    }

    static {
        cSP = (bbw[])bbw.class.getEnumConstants();
    }
}

