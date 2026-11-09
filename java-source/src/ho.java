/*
 * Decompiled with CFR.
 */
public class ho {
    public static final int adn = 1;
    public static final long ado = 21L;
    public static final long adp = 21L;
    public static final long adq = 21L;
    public static final long adr = 1L;
    public static final long ads = 0x1FFFFFL;
    public static final long adt = 0x1FFFFFL;
    public static final long adu = 0x1FFFFFL;
    public static final long adv = 1L;
    public static final long adw = 0L;
    public static final long adx = 21L;
    public static final long ady = 42L;
    public static final long adz = 63L;

    public static final boolean a(long l, int n) {
        return (ho.cg(n) & l) != 0L;
    }

    public static final boolean e(long l) {
        return (l >> 42 & 0x1FFFFFL) != 0L;
    }

    public static final int[] f(long l) {
        long l2;
        int n = 0;
        for (l2 = l >> 0 & 0x1FFFFFL; l2 != 0L; l2 >>= 1) {
            if ((l2 & 1L) == 0L) continue;
            ++n;
        }
        if (n == 0) {
            return null;
        }
        int[] nArray = new int[n];
        int n2 = 0;
        int n3 = 0;
        for (l2 = l >> 0 & 0x1FFFFFL; l2 != 0L; l2 >>= 1) {
            if ((l2 & 1L) != 0L) {
                nArray[n2] = n3;
                ++n2;
            }
            ++n3;
        }
        return nArray;
    }

    public static final int[] g(long l) {
        long l2;
        int n = 0;
        for (l2 = l >> 21 & 0x1FFFFFL; l2 != 0L; l2 >>= 1) {
            if ((l2 & 1L) == 0L) continue;
            ++n;
        }
        if (n == 0) {
            return null;
        }
        int[] nArray = new int[n];
        int n2 = 0;
        int n3 = 0;
        for (l2 = l >> 21 & 0x1FFFFFL; l2 != 0L; l2 >>= 1) {
            if ((l2 & 1L) != 0L) {
                nArray[n2] = n3;
                ++n2;
            }
            ++n3;
        }
        return nArray;
    }

    public static final boolean h(long l) {
        long l2 = l >> 63 & 1L;
        return l2 != 0L;
    }

    public static final long a(int[] nArray, int[] nArray2, boolean bl, int[] nArray3) {
        int n;
        long l = ho.Q(bl);
        if (nArray != null) {
            for (n = 0; n < nArray.length; ++n) {
                l |= ho.ce(nArray[n]);
            }
        }
        if (nArray2 != null) {
            for (n = 0; n < nArray2.length; ++n) {
                l |= ho.cf(nArray2[n]);
            }
        }
        if (nArray3 != null) {
            for (n = 0; n < nArray3.length; ++n) {
                l |= ho.cg(nArray3[n]);
            }
        }
        return l;
    }

    public static final long ce(int n) {
        if ((long)n < 21L) {
            long l = 1L << n;
            return l <<= 0;
        }
        assert (false);
        return 0L;
    }

    public static final long cf(int n) {
        if ((long)n < 21L) {
            long l = 1L << n;
            return l <<= 21;
        }
        assert (false);
        return 0L;
    }

    public static final long cg(int n) {
        if ((long)n < 21L) {
            long l = 1L << n;
            return l <<= 42;
        }
        assert (false);
        return 0L;
    }

    public static final long Q(boolean bl) {
        return bl ? Long.MIN_VALUE : 0L;
    }
}

