/*
 * Decompiled with CFR.
 */
public enum lf {
    asQ,
    asR,
    asS;


    public static lf getValueByOrdinal(int n) {
        return n < 0 || n >= lf.values().length ? null : lf.values()[n];
    }
}

