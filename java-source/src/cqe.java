/*
 * Decompiled with CFR.
 */
public enum cqe {
    eUF,
    eUG;

    public static cqe[] eUH;

    public static final int getValueCount() {
        return eUH.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cqe.getValueCount();
    }

    public static final cqe getValueByOrdinal(int n) {
        return eUH[n];
    }

    static {
        eUH = (cqe[])cqe.class.getEnumConstants();
    }
}

