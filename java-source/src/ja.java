/*
 * Decompiled with CFR.
 */
public enum ja {
    aiS,
    aiT,
    aiU,
    aiV,
    aiW,
    aiX,
    aiY;


    public static ja getValueByOrdinal(int n) {
        return n < 0 || n >= ja.values().length ? aiS : ja.values()[n];
    }
}

