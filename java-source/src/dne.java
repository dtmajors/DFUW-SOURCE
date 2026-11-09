/*
 * Decompiled with CFR.
 */
public enum dne {
    gJZ,
    gKa;

    public static dne[] gKb;

    public static final int getValueCount() {
        return gKb.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < dne.getValueCount();
    }

    public static final dne getValueByOrdinal(int n) {
        return gKb[n];
    }

    static {
        gKb = (dne[])dne.class.getEnumConstants();
    }
}

