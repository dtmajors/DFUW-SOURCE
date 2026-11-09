/*
 * Decompiled with CFR.
 */
public enum afm {
    bgO,
    bgP,
    bgQ;

    private static final afm[] bgR;

    public static final int getValueCount() {
        return bgR.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < afm.getValueCount();
    }

    public static final afm getValueByName(String string) {
        for (afm afm2 : afm.values()) {
            if (!afm2.name().equalsIgnoreCase(string)) continue;
            return afm2;
        }
        return null;
    }

    static {
        bgR = (afm[])afm.class.getEnumConstants();
    }
}

