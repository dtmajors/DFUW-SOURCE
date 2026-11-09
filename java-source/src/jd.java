/*
 * Decompiled with CFR.
 */
public enum jd {
    ajB,
    ajC,
    ajD,
    ajE,
    ajF,
    ajG,
    ajH,
    ajI,
    ajJ,
    ajK,
    ajL;


    public static jd getValueByOrdinal(int n) {
        return n < 0 || n >= jd.values().length ? ajB : jd.values()[n];
    }
}

