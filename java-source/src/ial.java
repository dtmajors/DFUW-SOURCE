/*
 * Decompiled with CFR.
 */
public class ial {
    public static final int lBN = 8;
    public static final int lBO = 2;

    public static boolean Pi(int n) {
        return n >= 0 && n < 8;
    }

    public static boolean Pj(int n) {
        return n >= 0 && n < 2;
    }

    public static boolean dq(int n, int n2) {
        return ial.Pi(n) && ial.Pj(n2);
    }

    public static String dr(int n, int n2) {
        return "SFQuickItemPosition [slot = " + n + ", index = " + n2 + "]";
    }
}

