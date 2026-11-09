/*
 * Decompiled with CFR.
 */
public enum afi {
    bgB,
    bgC;

    private static final afi[] bgD;

    public static final int getValueCount() {
        return bgD.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < afi.getValueCount();
    }

    public static final afi getValueByName(String string) {
        for (afi afi2 : afi.values()) {
            if (!afi2.name().equalsIgnoreCase(string)) continue;
            return afi2;
        }
        return null;
    }

    static {
        bgD = (afi[])afi.class.getEnumConstants();
    }
}

