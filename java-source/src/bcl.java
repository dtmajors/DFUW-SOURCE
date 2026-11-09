/*
 * Decompiled with CFR.
 */
public enum bcl {
    cWu,
    cWv,
    cWw;

    private static bcl[] cWx;

    public static final int getValueCount() {
        return cWx.length;
    }

    public static final bcl getValueByOrdinal(int n) {
        return cWx[n];
    }

    public static boolean isSafeOrdinal(int n) {
        return n >= 0 && n < bcl.getValueCount();
    }

    static {
        cWx = (bcl[])bcl.class.getEnumConstants();
    }
}

