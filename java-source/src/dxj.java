/*
 * Decompiled with CFR.
 */
public class dxj {
    public static final int hna = 1;
    public static final int hnb = 2;
    public static final int hnc = 3;
    public static final int hnd = 4;
    private static final String[] hne = new String[]{"Undefined timer", "Basic Timer", "Infinite Basic Timer", "Infinite Repeating Timer", "Repeating Timer"};

    public static int jH(String string) {
        if (string == null) {
            return -1;
        }
        int n2 = hne.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!hne[i2].equalsIgnoreCase(string)) continue;
            return i2;
        }
        return -1;
    }

    public static String CU(int n2) {
        if (n2 <= 0 || n2 >= hne.length) {
            return null;
        }
        return hne[n2];
    }

    private dxj() {
    }
}

