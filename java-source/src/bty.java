/*
 * Decompiled with CFR.
 */
public enum bty {
    dMw,
    dMx,
    dMy;

    private static bty[] dMz;

    public static final int getValueCount() {
        return dMz.length;
    }

    public static final bty getValueByOrdinal(int n) {
        return dMz[n];
    }

    static {
        dMz = (bty[])bty.class.getEnumConstants();
    }
}

