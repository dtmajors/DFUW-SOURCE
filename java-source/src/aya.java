/*
 * Decompiled with CFR.
 */
public enum aya {
    cvc,
    cvd,
    cve,
    cvf,
    cvg;


    public static aya getValueByOrdinal(int n) {
        return n < 0 || n >= aya.values().length ? cvc : aya.values()[n];
    }
}

