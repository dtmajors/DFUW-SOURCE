/*
 * Decompiled with CFR.
 */
public enum afo {
    bgX,
    bgY;

    private static final afo[] bgZ;

    public static final int getValueCount() {
        return bgZ.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < afo.getValueCount();
    }

    public static final afo getValueByName(String string) {
        for (afo afo2 : afo.values()) {
            if (!afo2.name().equalsIgnoreCase(string)) continue;
            return afo2;
        }
        return null;
    }

    static {
        bgZ = (afo[])afo.class.getEnumConstants();
    }
}

