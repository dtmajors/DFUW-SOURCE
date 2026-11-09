/*
 * Decompiled with CFR.
 */
@llc
public enum cvc {
    NONE,
    SEA;

    private static final float SEA_LEVEL_MAX_HEIGHT_DIFFERENCE = 10.0f;
    public static final cvc[] Values;

    public static final int getValueCount() {
        return Values.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cvc.getValueCount();
    }

    public static final cvc getValueByOrdinal(int n) {
        if (n < 0 || n >= cvc.getValueCount()) {
            return NONE;
        }
        return Values[n];
    }

    public static final cvc getDynamicLootConstraintFromString(String string) {
        if (string == null) {
            return null;
        }
        string.toUpperCase();
        try {
            return cvc.valueOf(string);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public boolean bD(ljq ljq2) {
        if (this == NONE) {
            return true;
        }
        if (this == SEA) {
            float f2 = ljq2.y;
            return lew.B(ljq2.y, 215.0f, 10.0f);
        }
        return true;
    }

    static {
        Values = (cvc[])cvc.class.getEnumConstants();
    }
}

