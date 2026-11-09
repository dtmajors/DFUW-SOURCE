/*
 * Decompiled with CFR.
 */
public enum bcd {
    cVo,
    cVp,
    cVq,
    cVr,
    cVs,
    cVt,
    cVu,
    cVv;


    public static bcd getValueByOrdinal(int n) {
        return n < 0 || n >= bcd.values().length ? cVo : bcd.values()[n];
    }
}

