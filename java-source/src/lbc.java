/*
 * Decompiled with CFR.
 */
public class lbc {
    public static float j(short s) {
        return lbc.abE(s | 0);
    }

    public static short mV(float f) {
        return (short)(lbc.mW(f) & 0xFFFF);
    }

    private static float abE(int n) {
        int n2 = n & 0x3FF;
        int n3 = n & 0x7C00;
        if (n3 == 31744) {
            n3 = 261120;
        } else if (n3 != 0) {
            if (n2 == 0 && (n3 += 114688) > 115712) {
                return Float.intBitsToFloat((n & 0x8000) << 16 | n3 << 13 | 0x3FF);
            }
        } else if (n2 != 0) {
            n3 = 115712;
            do {
                n3 -= 1024;
            } while (((n2 <<= 1) & 0x400) == 0);
            n2 &= 0x3FF;
        }
        return Float.intBitsToFloat((n & 0x8000) << 16 | (n3 | n2) << 13);
    }

    private static int mW(float f) {
        int n = Float.floatToIntBits(f);
        int n2 = n >>> 16 & 0x8000;
        int n3 = (n & Integer.MAX_VALUE) + 4096;
        if (n3 >= 1199570944) {
            if ((n & Integer.MAX_VALUE) >= 1199570944) {
                if (n3 < 2139095040) {
                    return n2 | 0x7C00;
                }
                return n2 | 0x7C00 | (n & 0x7FFFFF) >>> 13;
            }
            return n2 | 0x7BFF;
        }
        if (n3 >= 0x38800000) {
            return n2 | n3 - 0x38000000 >>> 13;
        }
        if (n3 < 0x33000000) {
            return n2;
        }
        n3 = (n & Integer.MAX_VALUE) >>> 23;
        return n2 | (n & 0x7FFFFF | 0x800000) + (0x800000 >>> n3 - 102) >>> 126 - n3;
    }
}

