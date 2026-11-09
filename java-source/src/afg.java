/*
 * Decompiled with CFR.
 */
public enum afg {
    bgw,
    bgx;

    private static final afg[] bgy;

    public static final int getValueCount() {
        return bgy.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < afg.getValueCount();
    }

    public static final afg getValueByName(String string) {
        for (afg afg2 : afg.values()) {
            if (!afg2.name().equalsIgnoreCase(string)) continue;
            return afg2;
        }
        return null;
    }

    static {
        bgy = (afg[])afg.class.getEnumConstants();
    }
}

