/*
 * Decompiled with CFR.
 */
public class cbs {
    public static final int ejX = 1;
    public static final int ejY = 2;
    public static final int ejZ = 3;
    public static final int eka = 4;
    public static final int ekb = 5;
    public static final int EG = 6;
    public static final int EH = 7;
    public static final int EI = 8;
    private static String[] ekc = new String[]{"Undefined GamelogicFunction", "gf_Death Animation Timer Length", "gf_Enter Death Percentage", "gf_GankMode Timer Long", "gf_GankMode Timer Short", "gf_Spell Failure", "gf_Stats Archery Penalty", "gf_Stats Magic Penalty", "gf_Stats Melee Penalty"};

    public static int gX(String string) {
        if (string == null) {
            return -1;
        }
        int n = ekc.length;
        for (int i2 = 1; i2 < n; ++i2) {
            if (!ekc[i2].equalsIgnoreCase(string)) continue;
            return i2;
        }
        return -1;
    }

    public static String oK(int n) {
        if (n <= 0 || n >= ekc.length) {
            return null;
        }
        return ekc[n];
    }

    private cbs() {
    }
}

