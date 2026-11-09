/*
 * Decompiled with CFR.
 */
public class ctj {
    public static final int ffV = 1;
    public static final int ffW = 2;
    private static final String[] ffX = new String[]{"Undefined GunType", "Gun BFG", "Gun Mortar"};
    public static final int[] ffY = new int[]{1360, 9472, 9536, 9520};

    public static int hL(String string) {
        if (string == null) {
            return -1;
        }
        for (int i = 0; i < ffX.length; ++i) {
            if (!ffX[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        return -1;
    }

    public static String ul(int n) {
        if (n <= 0 || n >= ffX.length) {
            return null;
        }
        return ffX[n];
    }

    private ctj() {
    }
}

