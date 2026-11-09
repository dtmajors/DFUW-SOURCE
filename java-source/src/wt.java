/*
 * Decompiled with CFR.
 */
public class wt {
    private short aZf;
    private short aZg;
    private short aZh;

    public static wt c(lgl lgl2) {
        wt wt2 = new wt();
        lgl lgl3 = new lgl(lgl2);
        lgl3.normalize();
        float f2 = lgl3.x;
        float f3 = lgl3.y;
        float f4 = lgl3.rlV;
        if (lgl3.rlW < 0.0f) {
            f2 *= -1.0f;
            f3 *= -1.0f;
            f4 *= -1.0f;
        }
        wt2.aZf = lbc.mV(f2);
        wt2.aZg = lbc.mV(f3);
        wt2.aZh = lbc.mV(f4);
        return wt2;
    }

    public static lgl a(wt wt2) {
        float f2 = lbc.j(wt2.aZf);
        float f3 = lbc.j(wt2.aZg);
        float f4 = lbc.j(wt2.aZh);
        float f5 = (float)Math.sqrt(1.0f - f2 * f2 - f3 * f3 - f4 * f4);
        return new lgl(f2, f3, f4, f5);
    }

    public static boolean a(lgl lgl2, wt wt2) {
        lgl lgl3 = new lgl(lgl2);
        lgl3.normalize();
        if (lgl3.rlW < 0.0f) {
            lgl3.x *= -1.0f;
            lgl3.y *= -1.0f;
            lgl3.rlV *= -1.0f;
        }
        if (Math.abs(lgl3.x - lbc.j(wt2.aZf)) > 0.001f) {
            return false;
        }
        if (Math.abs(lgl3.y - lbc.j(wt2.aZg)) > 0.001f) {
            return false;
        }
        return !(Math.abs(lgl3.rlV - lbc.j(wt2.aZh)) > 0.001f);
    }
}

