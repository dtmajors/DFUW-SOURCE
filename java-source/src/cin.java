/*
 * Decompiled with CFR.
 */
public enum cin {
    eCe,
    eCf,
    eCg,
    eCh,
    eCi,
    eCj,
    eCk,
    eCl,
    eCm,
    eCn,
    eCo,
    eCp,
    eCq,
    eCr,
    eCs;

    private static final cin[] eCt;

    public static final int getValueCount() {
        return eCt.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cin.getValueCount();
    }

    public static final cin getValueByOrdinal(int n) {
        if (cin.isValidOrdinal(n)) {
            return eCt[n];
        }
        return null;
    }

    static {
        eCt = (cin[])cin.class.getEnumConstants();
    }
}

