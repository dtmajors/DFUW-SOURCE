/*
 * Decompiled with CFR.
 */
public enum afp {
    bhb,
    bhc;

    private static final afp[] bhd;

    public static final int getValueCount() {
        return bhd.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < afp.getValueCount();
    }

    public static final afp getValueByName(String string) {
        for (afp afp2 : afp.values()) {
            if (!afp2.name().equalsIgnoreCase(string)) continue;
            return afp2;
        }
        return null;
    }

    static {
        bhd = (afp[])afp.class.getEnumConstants();
    }
}

