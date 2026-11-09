/*
 * Decompiled with CFR.
 */
public class ajb {
    public static final int bom = 1;
    public static final int bon = 2;
    public static final int boo = 3;
    public static final int bop = 4;
    private static final String[] boq = new String[]{"Unknown operator", ">=", ">", "<=", "<"};

    public static int cG(String string) {
        if (string == null) {
            lfn.b(5, "SFConstraintTypes", "getOperatorType() OperatorName is null.");
            return -1;
        }
        int n = boq.length;
        for (int i = 0; i < n; ++i) {
            if (!boq[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFConstraintTypes", "getOperatorType() OperatorName '" + string + "' is invalid.");
        return -1;
    }

    public static String fI(int n) {
        if (n < 0 || n >= boq.length) {
            lfn.b(5, "SFConstraintTypes", "getOperatorName() OperatorType is invalid.");
            return null;
        }
        return boq[n];
    }

    private ajb() {
    }
}

