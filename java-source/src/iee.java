/*
 * Decompiled with CFR.
 */
public enum iee {
    lMt,
    lMu,
    lMv,
    lMw,
    lMx,
    lMy,
    lMz,
    lMA,
    lMB,
    lMC,
    lMD,
    lME,
    lMF,
    lMG,
    lMH,
    lMI;


    public static iee getValueByOrdinal(int n) {
        return n < 0 || n >= iee.values().length ? lMt : iee.values()[n];
    }
}

