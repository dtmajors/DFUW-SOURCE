/*
 * Decompiled with CFR.
 */
public abstract class hze {
    public static final int NONE = 0;
    public static final int LEFT = 1;
    public static final int RIGHT = 2;
    public static final int CENTER = 3;
    public static final int TOP = 1;
    public static final int BOTTOM = 2;

    public abstract void c(joa var1);

    public abstract void close();

    public static joa a(joa joa2, joa joa3, int n, int n2, float f, float f2, float f3, float f4) {
        float f5 = joa3.X + f;
        float f6 = joa3.Y + f2;
        float f7 = joa3.W - f - f3;
        float f8 = joa3.H - f2 - f4;
        joa joa4 = hso.cxK().cxY();
        switch (n) {
            case 1: {
                f5 = joa2.X - f7;
                if (!(f5 < 0.0f)) break;
                f5 = joa2.dOj();
                break;
            }
            case 3: {
                f5 = joa2.dOk() - f7 / 2.0f;
                break;
            }
            case 2: {
                f5 = joa2.dOj();
                if (!(f5 + f7 > joa4.W)) break;
                f5 = joa2.X - f7;
                break;
            }
            default: {
                f5 = joa2.X;
            }
        }
        switch (n2) {
            case 1: {
                f6 = joa2.Y - f8;
                if (!(f6 < 0.0f)) break;
                f6 = joa2.TG();
                break;
            }
            case 3: {
                f6 = joa2.dOl() - f8 / 2.0f;
                break;
            }
            case 2: {
                f6 = joa2.TG();
                if (!(f6 + f8 > joa4.H)) break;
                f6 = joa2.Y - f8;
                break;
            }
            default: {
                f6 = joa2.Y;
            }
        }
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f5 + f7 > joa4.W) {
            f5 = joa4.W - f7;
        }
        if (f6 + f8 > joa4.H) {
            f6 = joa4.H - f8;
        }
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f5 + f7 > joa4.W) {
            f7 = joa4.W - f5;
        }
        if (f6 + f8 > joa4.H) {
            f8 = joa4.H - f6;
        }
        return new joa(f5 - f, f6 - f2, f7 + f + f3, f8 + f2 + f4);
    }

    public static joa a(joa joa2, joa joa3, int n, int n2) {
        return hze.a(joa2, joa3, n, n2, 0.0f, 0.0f, 0.0f, 0.0f);
    }
}

