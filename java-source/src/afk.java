/*
 * Decompiled with CFR.
 */
public enum afk {
    bgI;

    private static final afk[] bgJ;

    public static final int getValueCount() {
        return bgJ.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < afk.getValueCount();
    }

    public static final afk getValueByName(String string) {
        for (afk afk2 : afk.values()) {
            if (!afk2.name().equalsIgnoreCase(string)) continue;
            return afk2;
        }
        return null;
    }

    static {
        bgJ = (afk[])afk.class.getEnumConstants();
    }
}

