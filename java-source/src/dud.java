/*
 * Decompiled with CFR.
 */
public enum dud {
    hdM,
    hdN,
    hdO,
    hdP,
    hdQ,
    hdR,
    hdS;

    public static dud[] hdT;

    public static final int getValueCount() {
        return hdT.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < dud.getValueCount();
    }

    public static final dud getValueByOrdinal(int n) {
        if (dud.isValidOrdinal(n)) {
            return hdT[n];
        }
        return null;
    }

    static {
        hdT = (dud[])dud.class.getEnumConstants();
    }
}

