/*
 * Decompiled with CFR.
 */
public class jlx {
    public static final char[] nuj = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static void b(StringBuilder stringBuilder, int n) {
        assert (n >= 0 && n <= 255);
        stringBuilder.append(nuj[n / 16]);
        stringBuilder.append(nuj[n % 16]);
    }

    public static void c(StringBuilder stringBuilder, int n) {
        jlx.b(stringBuilder, n >>> 24);
        jlx.b(stringBuilder, n >>> 16 & 0xFF);
        jlx.b(stringBuilder, n >>> 8 & 0xFF);
        jlx.b(stringBuilder, n & 0xFF);
    }
}

