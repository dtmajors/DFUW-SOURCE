/*
 * Decompiled with CFR.
 */
public enum bcg {
    cVM,
    cVN,
    cVO,
    cVP,
    cVQ,
    cVR;


    public static bcg getValueByOrdinal(int n) {
        return n < 0 || n >= bcg.values().length ? cVM : bcg.values()[n];
    }
}

