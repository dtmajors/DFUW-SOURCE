/*
 * Decompiled with CFR.
 */
public enum bcw {
    cYc,
    cYd;

    private static bcw[] cYe;

    public static final int getValueCount() {
        return cYe.length;
    }

    public static final bcw getValueByOrdinal(int n) {
        return cYe[n];
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < bcw.getValueCount();
    }

    public String getOperationName() {
        switch (this) {
            case cYc: {
                return "Get_Bank_Policy";
            }
            case cYd: {
                return "Change_Bank_Policy";
            }
        }
        return "Unknown_Operation";
    }

    static {
        cYe = (bcw[])bcw.class.getEnumConstants();
    }
}

