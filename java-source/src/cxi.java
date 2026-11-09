/*
 * Decompiled with CFR.
 */
public class cxi {
    public static final int fWk = 5;
    public static final float fWl = 25.0f;
    public static final float fWm = 50.0f;
    public static final float fWn = 75.0f;
    public static final float fWo = 100.0f;
    public static final float fWp = 100.0f;
    public static final int fWq = 4;
    public static final float fWr = 30.0f;
    private static final float[][] fWs = new float[][]{{0.6f, 0.7f, 0.8f, 0.9f, 1.0f}, {2.0f, 2.2f, 2.6f, 2.8f, 3.0f}, {3.0f, 3.5f, 4.0f, 4.5f, 5.0f}, {5.0f, 5.5f, 6.0f, 7.0f, 8.0f}, {11.0f, 12.0f, 13.0f, 14.0f, 16.0f}};

    public static int fj(float f2) {
        if (f2 < 1.0f || f2 > 100.0f) {
            lfn.b(5, "SFSkillPowerConstants", "getPowerGroup() SkillLevel is invalid.");
            return -1;
        }
        if (f2 < 25.0f) {
            return 0;
        }
        if (f2 < 50.0f) {
            return 1;
        }
        if (f2 < 75.0f) {
            return 2;
        }
        if (f2 < 100.0f) {
            return 3;
        }
        return 4;
    }

    public static float fk(float f2) {
        return lew.A(f2 + 0.25f, 0.0f, 1.0f);
    }

    public static float a(a a2, float f2) {
        if (a2 == null) {
            lfn.b(5, "SFSkillPowerConstants", "getRadius() RadiusType is null.");
            return 0.0f;
        }
        int n2 = cxi.fj(f2 * 100.0f);
        if (n2 < 0) {
            lfn.b(5, "SFSkillPowerConstants", "getRadius() Power is invalid.");
            return 0.0f;
        }
        return fWs[a2.ordinal()][n2];
    }

    public static float yd(int n2) {
        switch (n2) {
            case 1: {
                return 24.0f;
            }
            case 2: {
                return 49.0f;
            }
            case 3: {
                return 74.0f;
            }
            case 4: {
                return 99.0f;
            }
            case 5: {
                return 100.0f;
            }
        }
        lfn.b(5, "SFSkillPowerConstants", "getSkillLevel() Invalid powergroup provided: " + n2);
        return 0.0f;
    }

    public static boolean C(float f2, float f3) {
        int n2;
        int n3 = cxi.fj(f2);
        return n3 < (n2 = cxi.fj(f3));
    }

    public static boolean D(float f2, float f3) {
        float f4 = (float)Math.floor(f2);
        float f5 = (float)Math.floor(f3);
        float f6 = f5 - f4;
        return f6 >= 0.999995f;
    }

    public static boolean fl(float f2) {
        return cxi.fj(f2) == 4;
    }

    private cxi() {
    }
}

