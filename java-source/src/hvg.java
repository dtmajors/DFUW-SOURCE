/*
 * Decompiled with CFR.
 */
public enum hvg {
    ldA,
    ldB,
    ldC,
    ldD,
    ldE,
    ldF,
    ldG,
    ldH,
    ldI,
    ldJ,
    ldK,
    ldL,
    ldM;


    public static final int getValueCount() {
        return hvg.values().length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < hvg.getValueCount();
    }

    public static final hvg getValueByOrdinal(int n) {
        if (hvg.isValidOrdinal(n)) {
            return hvg.values()[n];
        }
        return null;
    }
}

