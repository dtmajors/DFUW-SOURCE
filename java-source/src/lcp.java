/*
 * Decompiled with CFR.
 */
public class lcp {
    public int qwn = 0;
    private static final int qwo = 24;
    private static final int qwp = 16;
    private static final int qwq = 8;
    private static final int qwr = 0;

    public lcp() {
        this.qwn = 0;
    }

    public lcp(lcp lcp2) {
        this.qwn = 0;
        if (lcp2 != null) {
            this.qwn = lcp2.qwn;
        }
    }

    public lcp(int n, int n2, int n3, int n4) {
        this.K(n, n2, n3, n4);
    }

    public lcp(float f, float f2, float f3, float f4) {
        this.K(lcp.ne(f), lcp.ne(f2), lcp.ne(f3), lcp.ne(f4));
    }

    private void K(int n, int n2, int n3, int n4) {
        this.qwn = (n4 & 0xFF) << 24 | (n & 0xFF) << 16 | (n2 & 0xFF) << 8 | (n3 & 0xFF) << 0;
    }

    private static int ne(float f) {
        int n = (int)(f * 255.0f);
        if (n < 0) {
            n = 0;
        }
        if (n > 255) {
            n = 255;
        }
        return n;
    }

    private static float abL(int n) {
        return (float)n / 255.0f;
    }

    int emM() {
        return this.qwn >> 24 & 0xFF;
    }

    int emN() {
        return this.qwn >> 16 & 0xFF;
    }

    int emO() {
        return this.qwn >> 8 & 0xFF;
    }

    int emP() {
        return this.qwn >> 0 & 0xFF;
    }

    public static lcp l(lco lco2) {
        return new lcp(lco2.bVf(), lco2.bVg(), lco2.bVh(), 1.0f);
    }

    public static lco a(lcp lcp2) {
        return new lco(lcp.abL(lcp2.emN()), lcp.abL(lcp2.emO()), lcp.abL(lcp2.emP()));
    }

    public static lcp T(lcq lcq2) {
        return new lcp(lcq2.r, lcq2.g, lcq2.b, lcq2.a);
    }

    public static lcq b(lcp lcp2) {
        return new lcq(lcp.abL(lcp2.emN()), lcp.abL(lcp2.emO()), lcp.abL(lcp2.emP()), lcp.abL(lcp2.emM()));
    }

    public static void main(String[] stringArray) {
        lcp lcp2 = new lcp(1.0f, 0.5f, 0.4f, 2.3f);
        System.out.println("R: " + lcp.abL(lcp2.emN()));
        System.out.println("G: " + lcp.abL(lcp2.emO()));
        System.out.println("B: " + lcp.abL(lcp2.emP()));
        System.out.println("A: " + lcp.abL(lcp2.emM()));
    }

    public boolean m(lco lco2) {
        lco lco3 = lcp.a(this);
        if (Math.abs(lco3.bVf() - lco2.bVf()) > 0.01f) {
            return false;
        }
        if (Math.abs(lco3.bVg() - lco2.bVg()) > 0.01f) {
            return false;
        }
        return !(Math.abs(lco3.bVh() - lco2.bVh()) > 0.01f);
    }

    public boolean U(lcq lcq2) {
        lcq lcq3 = lcp.b(this);
        if (Math.abs(lcq3.r - lcq2.r) > 0.01f) {
            return false;
        }
        if (Math.abs(lcq3.g - lcq2.g) > 0.01f) {
            return false;
        }
        if (Math.abs(lcq3.b - lcq2.b) > 0.01f) {
            return false;
        }
        return !(Math.abs(lcq3.a - lcq2.a) > 0.01f);
    }
}

