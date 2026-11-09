/*
 * Decompiled with CFR.
 */
public abstract class lew {
    public static float min(float f, float f2) {
        if (f < f2) {
            return f;
        }
        return f2;
    }

    public static float max(float f, float f2) {
        if (f > f2) {
            return f;
        }
        return f2;
    }

    public static float ni(float f) {
        if (f < 0.0f) {
            return -1.0f;
        }
        return 1.0f;
    }

    public static float abs(float f) {
        if (f < 0.0f) {
            return -f;
        }
        return f;
    }

    public static float z(float f, float f2, float f3) {
        assert (f2 < f3);
        float f4 = f3 - f2;
        float f5 = f - f2;
        f5 /= f4;
        f5 -= (float)Math.floor(f5);
        return f2 + f5 * f4;
    }

    public static float eqr() {
        return (float)((Math.random() - 0.5) * 2.0);
    }

    public static int Q(int n, int n2, int n3) {
        assert (n2 < n3);
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }

    public static float A(float f, float f2, float f3) {
        assert (f2 < f3);
        if (f < f2) {
            return f2;
        }
        if (f > f3) {
            return f3;
        }
        return f;
    }

    public static double c(double d2, double d3, double d4) {
        assert (d3 < d4);
        if (d2 < d3) {
            return d3;
        }
        if (d2 > d4) {
            return d4;
        }
        return d2;
    }

    public static float aj(float f, float f2) {
        if (f == f2) {
            return f;
        }
        return f + (f2 - f) * (float)Math.random();
    }

    public static int fW(int n, int n2) {
        if (n == n2) {
            return n;
        }
        return (int)((float)(n + (n2 - n)) * (float)Math.random());
    }

    public static int fX(int n, int n2) {
        if (n == n2) {
            return n;
        }
        return Math.round((float)(n + (n2 - n)) * (float)Math.random());
    }

    public static boolean ak(float f, float f2) {
        return Math.abs(f) <= f2;
    }

    public static boolean B(float f, float f2, float f3) {
        return Math.abs(f - f2) <= f3;
    }

    public static float o(float f, float f2, float f3) {
        return f + (f2 - f) * f3;
    }

    public static double f(double d2, double d3, double d4) {
        return d2 + (d3 - d2) * d4;
    }

    public static int d(int n, int n2, float f) {
        return (int)((float)n + (float)(n2 - n) * f);
    }

    public static float nj(float f) {
        return f * ((float)Math.PI / 180);
    }

    public static float nk(float f) {
        return f * 57.29578f;
    }

    public static float C(float f, float f2, float f3) {
        if (f3 < f) {
            return 0.0f;
        }
        if (f3 > f2) {
            return 1.0f;
        }
        f3 = (f3 - f) / (f2 - f);
        return f3 * f3 * (3.0f - 2.0f * f3);
    }

    public static double g(double d2, double d3, double d4) {
        if (d4 < d2) {
            return 0.0;
        }
        if (d4 > d3) {
            return 1.0;
        }
        d4 = (d4 - d2) / (d3 - d2);
        return d4 * d4 * (3.0 - 2.0 * d4);
    }

    public static float D(float f, float f2, float f3) {
        if (f3 < f) {
            return 0.0f;
        }
        if (f3 > f2) {
            return 1.0f;
        }
        f3 = (f3 - f) / (f2 - f);
        return (float)((1.0 - Math.cos((double)f3 * Math.PI)) / 2.0);
    }

    public static double h(double d2, double d3, double d4) {
        if (d4 < d2) {
            return 0.0;
        }
        if (d4 > d3) {
            return 1.0;
        }
        d4 = (d4 - d2) / (d3 - d2);
        return (1.0 - Math.cos(d4 * Math.PI)) / 2.0;
    }

    public static int R(int n, int n2, int n3) {
        return Math.max(n, Math.min(n2, n3));
    }

    public static float E(float f, float f2, float f3) {
        return Math.max(f, Math.min(f2, f3));
    }

    public static double i(double d2, double d3, double d4) {
        return Math.max(d2, Math.min(d3, d4));
    }
}

