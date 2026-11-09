/*
 * Decompiled with CFR.
 */
public class cpd {
    public static final int eSo = 1;
    public static final int eSp = 2;
    public static final int eSq = 3;
    public static final String[] eSr = new String[]{"UNKNOWN", "GUN_MISSILE", "GUN_LINE", "GUN_FLAMETHROWER"};

    private cpd() {
    }

    public static int hL(String string) {
        if (string == null) {
            return -1;
        }
        for (int i = 0; i < eSr.length; ++i) {
            if (!eSr[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        return -1;
    }

    public static String sw(int n) {
        if (n <= 0 || n >= eSr.length) {
            return null;
        }
        return eSr[n];
    }
}

