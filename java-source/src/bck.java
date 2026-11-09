/*
 * Decompiled with CFR.
 */
public enum bck {
    cWi,
    cWj,
    cWk,
    cWl,
    cWm,
    cWn,
    cWo,
    cWp,
    cWq,
    cWr;

    private static bck[] cWs;

    public static final int getValueCount() {
        return cWs.length;
    }

    public static final bck getValueByOrdinal(int n) {
        return cWs[n];
    }

    public static boolean isSafeOrdinal(int n) {
        return n >= 0 && n < bck.getValueCount();
    }

    static {
        cWs = (bck[])bck.class.getEnumConstants();
    }
}

