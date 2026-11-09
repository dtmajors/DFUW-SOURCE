/*
 * Decompiled with CFR.
 */
public class wo {
    public int aZa;
    public boolean aZb;
    public int aZc;
    public int aZd;
    public int aZe;
    public short aZf;
    public short aZg;
    public short aZh;
    public int aWg = 0;

    static wo a(lgj lgj2) {
        wo wo2 = new wo();
        wo2.aZa = lgj2.aZa;
        wo2.aZb = lgj2.aZb;
        wo2.aZc = lgj2.aZc;
        wo2.aZd = lgj2.aZd;
        wo2.aZe = lgj2.aZe;
        wo2.aWg = lgj2.aWg;
        lgl lgl2 = new lgl(lgj2.rlK, lgj2.rlL, lgj2.rlM, lgj2.rlN);
        lgl2.normalize();
        float f2 = lgl2.x;
        float f3 = lgl2.y;
        float f4 = lgl2.rlV;
        if (lgl2.rlW < 0.0f) {
            f2 *= -1.0f;
            f3 *= -1.0f;
            f4 *= -1.0f;
        }
        wo2.aZf = lbc.mV(f2);
        wo2.aZg = lbc.mV(f3);
        wo2.aZh = lbc.mV(f4);
        return wo2;
    }

    static lgj a(wo wo2) {
        float f2 = lbc.j(wo2.aZf);
        float f3 = lbc.j(wo2.aZg);
        float f4 = lbc.j(wo2.aZh);
        float f5 = (float)Math.sqrt(1.0f - f2 * f2 - f3 * f3 - f4 * f4);
        lgj lgj2 = new lgj(wo2.aZa, wo2.aZc, wo2.aZd, wo2.aZe, f2, f3, f4, f5, wo2.aZb);
        lgj2.aWg = wo2.aWg;
        return lgj2;
    }

    public static boolean a(wo wo2, lgj lgj2) {
        if (wo2.aZa != lgj2.aZa) {
            return false;
        }
        if (wo2.aZb != lgj2.aZb) {
            return false;
        }
        if (wo2.aZc != lgj2.aZc) {
            return false;
        }
        if (wo2.aZd != lgj2.aZd) {
            return false;
        }
        if (wo2.aZe != lgj2.aZe) {
            return false;
        }
        if (wo2.aWg != lgj2.aWg) {
            return false;
        }
        float f2 = lbc.j(wo2.aZf);
        float f3 = lbc.j(wo2.aZg);
        float f4 = lbc.j(wo2.aZh);
        if (lgj2.rlN < 0.0f) {
            f2 *= -1.0f;
            f3 *= -1.0f;
            f4 *= -1.0f;
        }
        lgl lgl2 = new lgl(lgj2.rlK, lgj2.rlL, lgj2.rlM, lgj2.rlN);
        lgl2.normalize();
        if (Math.abs(f2 - lgl2.x) > 0.001f) {
            return false;
        }
        if (Math.abs(f3 - lgl2.y) > 0.001f) {
            return false;
        }
        return !(Math.abs(f4 - lgl2.rlV) > 0.001f);
    }
}

