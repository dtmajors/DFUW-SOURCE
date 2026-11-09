/*
 * Decompiled with CFR.
 */
public enum bbn {
    cRm,
    cRn,
    cRo,
    cRp,
    cRq;

    private static bbn[] cRr;

    public static final int getValueCount() {
        return cRr.length;
    }

    public static final bbn getValueByOrdinal(int n) {
        return cRr[n];
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < bbn.getValueCount();
    }

    public String getOperationName() {
        switch (this) {
            case cRn: {
                return "Add_Player";
            }
            case cRo: {
                return "Remove_Player";
            }
            case cRq: {
                return "ChangeGuardPolicy";
            }
            case cRp: {
                return "GetGuardPolicy";
            }
            case cRm: {
                return "Kill_On_Sight_List";
            }
        }
        return "Unknown_Operation";
    }

    static {
        cRr = (bbn[])bbn.class.getEnumConstants();
    }
}

