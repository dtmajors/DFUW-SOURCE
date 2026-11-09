/*
 * Decompiled with CFR.
 */
public class cfy {
    public static final boolean eqx = true;
    public static final boolean evK = true;
    public static final double evL = 30.0;
    public static final float evM = 70.0f;
    public static final double evN = 5.0;
    public static final double evO = 5.0;
    public static final float evP = 5.0f;
    public static final int evQ = 0;
    public static final int evR = 1;
    public static final int evS = 2;
    public static final int evT = 3;
    public static final int evU = del.dr("se_duels_banner");

    public static final String pN(int n) {
        if (n == 0) {
            return "LOGGED_OUT";
        }
        if (n == 1) {
            return "OUT_OF_AREA";
        }
        if (n == 2) {
            return "DEATH";
        }
        if (n == 3) {
            return "SYSTEM_SHUTDOWN";
        }
        assert (false);
        return "UNKNOWN";
    }
}

