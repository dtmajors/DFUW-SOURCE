/*
 * Decompiled with CFR.
 */
import java.util.Random;

public class arw {
    public static float bRP = 1.0f;
    public static final boolean bRQ = false;
    public static boolean bRR = false;
    public static final boolean bRS = false;
    public static boolean bRT = false;
    public static boolean bRU = false;
    public static boolean bRV = false;
    public static boolean bRW = false;
    public static boolean bRX = false;
    public static boolean bRY = false;
    public static final boolean bRZ = true;
    public static final int bSa = 250;
    public static final int bSb = 50;
    public static a bSc = a.bSn;
    public static final lfo ct = new lfo("");
    public static final int bSd = 5000;
    private static final Random bSe = new Random(System.nanoTime());
    public static final int bSf = 2;
    public static final int bSg = 5;
    public static final double bSh = 2.0;

    public static final float h(float f2, float f3) {
        float f4 = f3 - f2;
        float f5 = (float)Math.IEEEremainder(f4, Math.PI * 2);
        return f5;
    }

    public static ljq i(float f2, float f3) {
        return new ljq((double)(-f2) * Math.sin(f3), 0.0, (double)(-f2) * Math.cos(f3));
    }

    public static void a(float f2, float f3, ljq ljq2) {
        ljq2.x = (float)((double)(-f2) * Math.sin(f3));
        ljq2.y = 0.0f;
        ljq2.rlV = (float)((double)(-f2) * Math.cos(f3));
    }

    public static double Q(int n, int n2) {
        if (n < 0 || n > n2) {
            return 0.0;
        }
        return arw.ac(n2) / (arw.ac(n) * arw.ac(n2 - n));
    }

    public static double ac(double d2) {
        assert (d2 < 171.0);
        if (d2 == 0.0 || d2 == 1.0) {
            return 1.0;
        }
        return d2 * arw.ac(d2 - 1.0);
    }

    public static float b(ash.c c2) {
        switch (c2) {
            case bVr: 
            case bVt: 
            case bVi: {
                return 2500.0f;
            }
            case bVs: 
            case bVn: 
            case bVj: {
                return 250.0f;
            }
            case bVl: 
            case bVp: {
                return 450.0f;
            }
            case bVm: 
            case bVq: {
                return 150.0f;
            }
            case bVk: 
            case bVo: {
                return 700.0f;
            }
        }
        assert (false);
        return -1.0f;
    }

    public static final double e(double d2, double d3) {
        assert (d2 <= d3) : "min > max";
        return bSe.nextDouble() * (d3 - d2) + d2;
    }

    public static final void Su() {
        bSe.setSeed(System.nanoTime());
    }

    public static final boolean Sv() {
        return bSe.nextBoolean();
    }

    public static final double Sw() {
        return bSe.nextDouble();
    }

    public static final float Sx() {
        return bSe.nextFloat();
    }

    public static final double f(double d2, double d3) {
        return bSe.nextGaussian() * d3 + d2;
    }

    public static final int Sy() {
        return bSe.nextInt();
    }

    public static final int hK(int n) {
        return bSe.nextInt(n);
    }

    public static final long Sz() {
        return bSe.nextLong();
    }

    public static final int SA() {
        return arw.hK(128) * 101 >> 7;
    }

    public static int hL(int n) {
        return n >>> 24 | n << 24 | n << 8 & 0xFF0000 | n >> 8 & 0xFF00;
    }

    public static final float aA(ljq ljq2) {
        if (ljq2 == null) {
            return 0.0f;
        }
        return (float)Math.atan2(-ljq2.x, -ljq2.rlV);
    }

    public static final void a(ljq ljq2, float f2, float f3, float f4) {
        ljq2.x += f2;
        ljq2.y += f3;
        ljq2.rlV += f4;
    }

    public static final boolean a(ljq ljq2, ljq ljq3, ljq ljq4, ljq ljq5) {
        float f2 = ((ljq4.rlV - ljq5.rlV) * (ljq2.x - ljq5.x) + (ljq5.x - ljq4.x) * (ljq2.rlV - ljq5.rlV)) / ((ljq4.rlV - ljq5.rlV) * (ljq3.x - ljq5.x) + (ljq5.x - ljq4.x) * (ljq3.rlV - ljq5.rlV));
        if (f2 <= 0.0f) {
            return false;
        }
        float f3 = ((ljq5.rlV - ljq3.rlV) * (ljq2.x - ljq5.x) + (ljq3.x - ljq5.x) * (ljq2.rlV - ljq5.rlV)) / ((ljq4.rlV - ljq5.rlV) * (ljq3.x - ljq5.x) + (ljq5.x - ljq4.x) * (ljq3.rlV - ljq5.rlV));
        if (f3 <= 0.0f) {
            return false;
        }
        float f4 = 1.0f - f2 - f3;
        return !(f4 <= 0.0f);
    }

    public static final boolean b(ljq ljq2, ljq ljq3, ljq ljq4, float f2) {
        if (ljq2.eqF() > f2) {
            return false;
        }
        if (-ljq3.x * ljq2.rlV + ljq3.rlV * ljq2.x > 0.0f) {
            return false;
        }
        return !(-ljq4.x * ljq2.rlV + ljq4.rlV * ljq2.x < 0.0f);
    }

    private arw() {
    }
}

