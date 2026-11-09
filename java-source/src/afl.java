/*
 * Decompiled with CFR.
 */
public enum afl {
    bgL;

    private static final afl[] bgM;

    public static final int getValueCount() {
        return bgM.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < afl.getValueCount();
    }

    public static final afl getValueByName(String string) {
        for (afl afl2 : afl.values()) {
            if (!afl2.name().equalsIgnoreCase(string)) continue;
            return afl2;
        }
        return null;
    }

    static {
        bgM = (afl[])afl.class.getEnumConstants();
    }
}

