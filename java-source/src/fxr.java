/*
 * Decompiled with CFR.
 */
public enum fxr {
    jao,
    jap,
    jaq,
    jar,
    jas,
    jat,
    jau,
    jav,
    jaw,
    jax,
    jay,
    jaz,
    jaA,
    jaB,
    jaC,
    jaD,
    jaE,
    jaF,
    jaG,
    jaH,
    jaI,
    jaJ;

    private static fxr[] jaK;

    public static final int getValueCount() {
        return jaK.length;
    }

    public static final fxr getValueByOrdinal(int n) {
        return jaK[n];
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < fxr.getValueCount();
    }

    static {
        jaK = (fxr[])fxr.class.getEnumConstants();
    }
}

