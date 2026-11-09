/*
 * Decompiled with CFR.
 */
public class mfw {
    public static final int guU = 0;
    public static final int guV = 1;
    public static final int guW = 2;

    private mfw() {
    }

    public static float S(int n, float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        if (Float.isInfinite(f)) {
            return 0.0f;
        }
        switch (n) {
            case 0: {
                return (float)Math.abs(Math.sin(f));
            }
            case 1: {
                if (f <= Float.MIN_VALUE) {
                    return 0.0f;
                }
                return (float)Math.abs(Math.sin(Math.abs(Math.log(f) * Math.abs(Math.sin(f)))));
            }
            case 2: {
                return (float)Math.random();
            }
        }
        lfn.b(5, "SFEffectLerper", "getEffectLerp() Unknown");
        return (float)Math.random();
    }

    public static float T(int n, float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        if (Float.isInfinite(f)) {
            return 0.0f;
        }
        switch (n) {
            case 0: {
                return (float)Math.asin(f);
            }
        }
        return 0.0f;
    }
}

