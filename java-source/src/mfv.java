/*
 * Decompiled with CFR.
 */
public class mfv {
    private mfv() {
    }

    public static ljq f(ljq ljq2, ljq ljq3, ljq ljq4, float f) {
        f = lew.A(f, 0.0f, 1.0f);
        float f2 = 1.0f - f;
        f2 *= f2;
        float f3 = 2.0f * f * (1.0f - f);
        float f4 = f * f;
        ljq ljq5 = new ljq(ljq2);
        ljq5.nm(f2);
        ljq ljq6 = new ljq(ljq5);
        ljq5.eu(ljq3);
        ljq5.nm(f3);
        ljq6.es(ljq5);
        ljq5.eu(ljq4);
        ljq5.nm(f4);
        ljq6.es(ljq5);
        return ljq6;
    }

    public static float k(float f, float f2, float f3, float f4) {
        f4 = lew.A(f4, 0.0f, 1.0f);
        float f5 = 1.0f - f4;
        f5 *= f5;
        float f6 = 2.0f * f4 * (1.0f - f4);
        float f7 = f4 * f4;
        return f * f5 + f6 * f2 + f7 * f3;
    }

    public static lcq a(lcq lcq2, lcq lcq3, lcq lcq4, float f) {
        f = lew.A(f, 0.0f, 1.0f);
        float f2 = 1.0f - f;
        f2 *= f2;
        float f3 = 2.0f * f * (1.0f - f);
        float f4 = f * f;
        float f5 = f2 * lcq2.r + f3 * lcq3.r + f4 * lcq4.r;
        float f6 = f2 * lcq2.g + f3 * lcq3.g + f4 * lcq4.g;
        float f7 = f2 * lcq2.b + f3 * lcq3.b + f4 * lcq4.b;
        float f8 = f2 * lcq2.a + f3 * lcq3.a + f4 * lcq4.a;
        lcq lcq5 = new lcq(f5, f6, f7, f8, true);
        return lcq5;
    }

    public static lgl a(lgl lgl2, lgl lgl3, lgl lgl4, float f) {
        f = lew.A(f, 0.0f, 1.0f);
        float f2 = 1.0f - f;
        f2 *= f2;
        float f3 = 2.0f * f * (1.0f - f);
        float f4 = f * f;
        lgl lgl5 = lgl.b(lgl2, lgl3, f2);
        lgl lgl6 = lgl.b(lgl5, lgl4, f4);
        return lgl6;
    }
}

