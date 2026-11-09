/*
 * Decompiled with CFR.
 */
public class cxm {
    private static final boolean dtQ = false;
    private static final float fWV = 0.5f;
    private static final float fWW = 5.0f;
    private static final float fWX = 500.0f;

    public float n(float f2, float f3, float f4) {
        float f5 = this.E(f2, f3);
        if ((f5 *= f4) > 0.5f) {
            f5 = 0.5f;
        }
        return f5;
    }

    public float E(float f2, float f3) {
        float f4 = lgp.erA().acI(1);
        float f5 = f4 * f3 / this.fm(f2);
        if (f5 > 0.5f) {
            f5 = 0.5f;
        }
        return f5;
    }

    public float F(float f2, float f3) {
        float f4 = 0.5f;
        float f5 = f4 * f3 / this.fm(f2);
        if (f5 > 0.5f) {
            f5 = 0.5f;
        }
        return f5;
    }

    private float fm(float f2) {
        return 0.0495f * f2 * f2 + 5.0f;
    }

    public float a(float f2, float f3, float f4, float f5) {
        float f6 = 0.0f;
        float f7 = f4;
        float f8 = f4;
        float f9 = 0.0f;
        while (f8 < f5) {
            f9 = f2 * f3 / this.fm(f7);
            if ((double)f9 > 0.5) {
                f9 = 0.5f;
            }
            f7 = f8 = f7 + f9;
            f6 += 1.0f;
        }
        return f6;
    }
}

