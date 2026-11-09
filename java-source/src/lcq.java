/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.StringTokenizer;

@XStreamAlias(value="ColorRGBA")
public final class lcq
implements lbq,
lbr {
    private static final lfr Out = lfr.rkC;
    private static final DecimalFormat DecimalFormatForDB = new DecimalFormat("#0.000", new DecimalFormatSymbols(Locale.US));
    public static final lcq BRIGHT_WHITE = new lcq(1.0f, 1.0f, 1.0f, 1.0f);
    public static final lcq BRIGHT_WHITE_TRANSPARENT = new lcq(1.0f, 1.0f, 1.0f, 0.0f);
    public static final lcq BLACK = new lcq(0.0f, 0.0f, 0.0f, 1.0f);
    public static final lcq BLACK_TRANSPARENT = new lcq(0.0f, 0.0f, 0.0f, 0.0f);
    public static final lcq COLORSHIFT_NEUTRAL = BRIGHT_WHITE;
    public static final lbs<lcq> Persistor = new lbs<lcq>(){
        static final /* synthetic */ boolean $assertionsDisabled;

        public lcq a(lfu lfu2, lcq lcq2) {
            float f = lfu2.e("R", lcq2 == null ? 0.0f : lcq2.r);
            float f2 = lfu2.e("G", lcq2 == null ? 0.0f : lcq2.g);
            float f3 = lfu2.e("B", lcq2 == null ? 0.0f : lcq2.b);
            float f4 = lfu2.e("A", lcq2 == null ? 0.0f : lcq2.a);
            if (lcq2 != null && lcq2.j(f, f2, f3, f4)) {
                return lcq2;
            }
            if (!$assertionsDisabled && !lfu2.eqA()) {
                throw new AssertionError();
            }
            return new lcq(f, f2, f3, f4);
        }

        static {
            $assertionsDisabled = !lcq.class.desiredAssertionStatus();
        }
    };
    public final float a;
    public final float r;
    public final float g;
    public final float b;

    public static lcq zb(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, ":");
        try {
            float f = Float.parseFloat(stringTokenizer.nextToken());
            float f2 = Float.parseFloat(stringTokenizer.nextToken());
            float f3 = Float.parseFloat(stringTokenizer.nextToken());
            float f4 = Float.parseFloat(stringTokenizer.nextToken());
            return new lcq(f, f2, f3, f4);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static lcq zc(String string) {
        if (string.charAt(0) != '[') {
            return null;
        }
        int n = string.length() - 1;
        if (string.charAt(n) != ']') {
            return null;
        }
        String string2 = string.substring(1, n);
        return lcq.zd(string2);
    }

    public static lcq zd(String string) {
        int n;
        if (string.startsWith("[")) {
            string = string.substring(1);
        }
        if (string.endsWith("]")) {
            string = string.substring(0, string.length() - 1);
        }
        if ((n = string.indexOf(44)) == -1) {
            throw new NumberFormatException("expected comma");
        }
        int n2 = string.indexOf(44, n + 1);
        if (n2 == -1) {
            throw new NumberFormatException("expected comma");
        }
        int n3 = string.indexOf(44, n2 + 1);
        if (n3 == -1) {
            throw new NumberFormatException("expected comma");
        }
        String string2 = string.substring(0, n);
        float f = Float.parseFloat(string2.trim());
        string2 = string.substring(n + 1, n2);
        float f2 = Float.parseFloat(string2.trim());
        string2 = string.substring(n2 + 1, n3);
        float f3 = Float.parseFloat(string2.trim());
        string2 = string.substring(n3 + 1);
        float f4 = Float.parseFloat(string2.trim());
        return new lcq(f, f2, f3, f4, true);
    }

    public static lcq ze(String string) {
        int n = string.indexOf(44);
        if (n == -1) {
            lfn.b(5, "SFColorRGBA", "parseColorRGBA_NoException() Expected comma.");
            return null;
        }
        int n2 = string.indexOf(44, n + 1);
        if (n2 == -1) {
            lfn.b(5, "SFColorRGBA", "parseColorRGBA_NoException() Expected comma.");
            return null;
        }
        int n3 = string.indexOf(44, n2 + 1);
        if (n3 == -1) {
            lfn.b(5, "SFColorRGBA", "parseColorRGBA_NoException() Expected comma.");
            return null;
        }
        String string2 = string.substring(0, n);
        float f = Float.parseFloat(string2.trim());
        string2 = string.substring(n + 1, n2);
        float f2 = Float.parseFloat(string2.trim());
        string2 = string.substring(n2 + 1, n3);
        float f3 = Float.parseFloat(string2.trim());
        string2 = string.substring(n3 + 1);
        float f4 = Float.parseFloat(string2.trim());
        return new lcq(f, f2, f3, f4, true);
    }

    public static lcq b(lcq lcq2, lcq lcq3) {
        if (lcq2 == null || lcq3 == null) {
            assert (false);
            return new lcq();
        }
        float f = lcq2.r + (lcq3.r - lcq2.r) * (float)Math.random();
        float f2 = lcq2.g + (lcq3.g - lcq2.g) * (float)Math.random();
        float f3 = lcq2.b + (lcq3.b - lcq2.b) * (float)Math.random();
        float f4 = lcq2.a + (lcq3.a - lcq2.a) * (float)Math.random();
        return new lcq(f, f2, f3, f4);
    }

    public lcq(float f, float f2, float f3, float f4) {
        assert (f4 >= 0.0f && f4 <= 1.0f) : f4;
        assert (f >= 0.0f && f <= 1.0f) : f;
        assert (f2 >= 0.0f && f2 <= 1.0f) : f2;
        assert (f3 >= 0.0f && f3 <= 1.0f) : f3;
        this.a = f4;
        this.r = f;
        this.g = f2;
        this.b = f3;
    }

    public Color getColor() {
        return new Color(this.r, this.g, this.b, this.a);
    }

    public ljr emQ() {
        return new ljr(this.a, this.r, this.g, this.b);
    }

    public int getRGB() {
        return this.emR() & 0xFFFFFF;
    }

    public int emR() {
        Color color = new Color(this.r, this.g, this.b, this.a);
        return color.getRGB();
    }

    public lcq(float f, float f2, float f3, float f4, boolean bl) {
        assert (bl);
        this.a = f4;
        this.r = f;
        this.g = f2;
        this.b = f3;
    }

    public lcq(lcq lcq2) {
        this.r = lcq2.r;
        this.g = lcq2.g;
        this.b = lcq2.b;
        this.a = lcq2.a;
    }

    public lcq(Color color) {
        this.r = (float)color.getRed() / 255.0f;
        this.g = (float)color.getGreen() / 255.0f;
        this.b = (float)color.getBlue() / 255.0f;
        this.a = 1.0f;
    }

    public lcq(float f, float f2, float f3) {
        this(f, f2, f3, 1.0f);
    }

    public final lcq V(lcq lcq2) {
        if (lcq2.X(COLORSHIFT_NEUTRAL)) {
            return this;
        }
        return new lcq(this.r * lcq2.r, this.g * lcq2.g, this.b * lcq2.b, this.a * lcq2.a, true);
    }

    public final lcq nf(float f) {
        return new lcq(this.r * f, this.g * f, this.b * f, this.a, true);
    }

    public final lcq W(lcq lcq2) {
        lcq lcq3 = new lcq(lcq2.r / this.r, lcq2.g / this.g, lcq2.b / this.b, lcq2.a / this.a, true);
        assert (this.V(lcq3).X(lcq2));
        return lcq3;
    }

    public static final lcq b(lcq[] lcqArray) {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        for (int i = 0; i < lcqArray.length; ++i) {
            f += lcqArray[i].r;
            f2 += lcqArray[i].g;
            f3 += lcqArray[i].b;
            f4 += lcqArray[i].a;
        }
        lcq lcq2 = new lcq(f /= (float)lcqArray.length, f2 /= (float)lcqArray.length, f3 /= (float)lcqArray.length, f4 /= (float)lcqArray.length, true);
        lcq2 = lcq2.emS();
        return lcq2;
    }

    public final boolean X(lcq lcq2) {
        if (lcq2 == this) {
            return true;
        }
        return this.j(lcq2.r, lcq2.g, lcq2.b, lcq2.a);
    }

    public final boolean j(float f, float f2, float f3, float f4) {
        return ldq.ai(this.r, f) && ldq.ai(this.g, f2) && ldq.ai(this.b, f3) && ldq.ai(this.a, f4);
    }

    public final boolean equals(Object object) {
        if (object instanceof lcq) {
            return this.X((lcq)object);
        }
        assert (false);
        return false;
    }

    public static boolean c(lcq lcq2, lcq lcq3) {
        if (lcq2 == null && lcq3 == null) {
            return true;
        }
        if (lcq2 == null) {
            return false;
        }
        if (lcq3 == null) {
            return false;
        }
        return lcq2.X(lcq3);
    }

    public final lcq emS() {
        float f = this.r;
        float f2 = this.g;
        float f3 = this.b;
        float f4 = this.a;
        boolean bl = false;
        if (f < 0.0f) {
            f = 0.0f;
            bl = true;
        } else if (f > 1.0f) {
            f = 1.0f;
            bl = true;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
            bl = true;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
            bl = true;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
            bl = true;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
            bl = true;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
            bl = true;
        } else if (f4 > 1.0f) {
            f4 = 1.0f;
            bl = true;
        }
        if (!bl) {
            return this;
        }
        return new lcq(f, f2, f3, f4);
    }

    public final String toString() {
        DecimalFormat decimalFormat = lda.zj("#0.00");
        return "[" + decimalFormat.format(this.r) + ", " + decimalFormat.format(this.g) + ", " + decimalFormat.format(this.b) + ", " + decimalFormat.format(this.a) + "]";
    }

    public static lcq a(lcq lcq2, lcq lcq3, float f) {
        float f2 = lcq2.r + (lcq3.r - lcq2.r) * f;
        float f3 = lcq2.g + (lcq3.g - lcq2.g) * f;
        float f4 = lcq2.b + (lcq3.b - lcq2.b) * f;
        float f5 = lcq2.a + (lcq3.a - lcq2.a) * f;
        return new lcq(f2, f3, f4, f5, true);
    }

    public static boolean d(lcq lcq2, lcq lcq3) {
        return (lcq2.r + lcq2.g + lcq2.b + lcq2.a) / 4.0f >= (lcq3.r + lcq3.g + lcq3.b + lcq3.a) / 4.0f;
    }

    public float Y(lcq lcq2) {
        double d2 = this.r - lcq2.r;
        double d3 = this.g - lcq2.g;
        double d4 = this.b - lcq2.b;
        double d5 = this.a - lcq2.a;
        double d6 = d2 * d2 + d3 * d3 + d4 * d4 + d5 * d5;
        d6 = Math.sqrt(d6);
        return (float)d6;
    }

    public final String fk() {
        return DecimalFormatForDB.format(lew.A(this.r, 0.0f, 1.0f)) + ":" + DecimalFormatForDB.format(lew.A(this.g, 0.0f, 1.0f)) + ":" + DecimalFormatForDB.format(lew.A(this.b, 0.0f, 1.0f)) + ":" + DecimalFormatForDB.format(lew.A(this.a, 0.0f, 1.0f));
    }

    public lbq n(lfu lfu2) {
        float f;
        float f2;
        float f3;
        float f4 = lfu2.e("R", this.r);
        if (this.j(f4, f3 = lfu2.e("G", this.g), f2 = lfu2.e("B", this.b), f = lfu2.e("A", this.a))) {
            return this;
        }
        assert (!lfu2.eqB());
        return new lcq(f4, f3, f2, f);
    }

    @Override
    public boolean a(lfu lfu2) {
        return false;
    }

    private lcq() {
        this.b = 1.0f;
        this.g = 1.0f;
        this.r = 1.0f;
        this.a = 1.0f;
    }

    public lcq(lco lco2) {
        this.r = lco2.bVf();
        this.g = lco2.bVg();
        this.b = lco2.bVh();
        this.a = 1.0f;
    }
}

