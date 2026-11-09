/*
 * Decompiled with CFR.
 */
public enum bap {
    cNc,
    cNd,
    cNe,
    cNf,
    cNg,
    cNh;


    public static bap getValueByOrdinal(int n) {
        return n < 0 || n >= bap.values().length ? cNc : bap.values()[n];
    }
}

