/*
 * Decompiled with CFR.
 */
public class iaz {
    public static final String lDA = "SKIN_COLORS";
    public static final String lDB = "HAIR_COLORS";
    public static final int[] iq = new int[]{3, 6, 2, 4, 5, 1};
    public static final float ic = 2.5f;
    public static final String ib = "zz_charcreator";
    public static final String lDC = "zz_charcreator_new";

    public static final int PA(int n) {
        for (int j = 0; j < iq.length; ++j) {
            if (iq[j] != n) continue;
            return j;
        }
        return -1;
    }
}

