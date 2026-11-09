/*
 * Decompiled with CFR.
 */
public enum cfx {
    evx,
    evy,
    evz,
    evA,
    evB,
    evC,
    evD,
    evE,
    evF,
    evG,
    evH;

    private static final cfx[] evI;

    public static final int getValueCount() {
        return evI.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cfx.getValueCount();
    }

    public static final cfx getValueByOrdinal(int n) {
        if (cfx.isValidOrdinal(n)) {
            return evI[n];
        }
        return evx;
    }

    static {
        evI = (cfx[])cfx.class.getEnumConstants();
    }
}

