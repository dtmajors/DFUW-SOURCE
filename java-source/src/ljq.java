/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.StringTokenizer;

public class ljq {
    public static final String roO = "^\\[[-]?[0-9]{1,5}\\.?[0-9]{1,5}\\,[-]?[0-9]{1,5}\\.?[0-9]{1,5}\\,[-]?[0-9]{1,5}\\.?[0-9]{1,5}\\]$";
    public float x = 0.0f;
    public float y = 0.0f;
    public float rlV = 0.0f;
    private static final float roP = (float)Math.PI * 2;
    public static final ljq roQ = new ljq(0.0f, 0.0f, 0.0f);
    private static final DecimalFormat DecimalFormatForDB = new DecimalFormat("#0.00", new DecimalFormatSymbols(Locale.US));

    public static boolean At(String string) {
        if (string == null) {
            return false;
        }
        return string.matches(roO);
    }

    public static ljq Au(String string) {
        int n;
        if (string.startsWith("[")) {
            string = string.substring(1, string.length());
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
        String string2 = string.substring(0, n);
        float f = Float.parseFloat(string2.trim());
        string2 = string.substring(n + 1, n2);
        float f2 = Float.parseFloat(string2.trim());
        string2 = string.substring(n2 + 1);
        float f3 = Float.parseFloat(string2.trim());
        return new ljq(f, f2, f3);
    }

    public final String fk() {
        return DecimalFormatForDB.format(this.x) + ":" + DecimalFormatForDB.format(this.y) + ":" + DecimalFormatForDB.format(this.rlV);
    }

    public static ljq Av(String string) {
        if (string == null || string.trim().equals("")) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(string, ":");
        try {
            float f = Float.parseFloat(stringTokenizer.nextToken());
            float f2 = Float.parseFloat(stringTokenizer.nextToken());
            float f3 = Float.parseFloat(stringTokenizer.nextToken());
            return new ljq(f, f2, f3);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public static ljq Aw(String string) {
        if (string.charAt(0) != '[') {
            return null;
        }
        int n = string.indexOf(44);
        if (n == -1) {
            return null;
        }
        int n2 = string.indexOf(44, n + 1);
        if (n2 == -1) {
            return null;
        }
        int n3 = string.length() - 1;
        if (string.charAt(n3) != ']') {
            return null;
        }
        try {
            String string2 = string.substring(1, n);
            float f = Float.parseFloat(string2.trim());
            string2 = string.substring(n + 1, n2);
            float f2 = Float.parseFloat(string2.trim());
            string2 = string.substring(n2 + 1, n3);
            float f3 = Float.parseFloat(string2.trim());
            return new ljq(f, f2, f3);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public ljq() {
    }

    public ljq(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.rlV = f3;
    }

    public ljq(double d2, double d3, double d4) {
        this.x = (float)d2;
        this.y = (float)d3;
        this.rlV = (float)d4;
    }

    public ljq(ljq ljq2) {
        if (ljq2 != null) {
            this.x = ljq2.x;
            this.y = ljq2.y;
            this.rlV = ljq2.rlV;
        }
    }

    public void kl(float f) {
        this.x = f;
    }

    public float getX() {
        return this.x;
    }

    public void km(float f) {
        this.y = f;
    }

    public float getY() {
        return this.y;
    }

    public void fb(float f) {
        this.rlV = f;
    }

    public float bdV() {
        return this.rlV;
    }

    public void esz() {
        this.rlV = 0.0f;
        this.y = 0.0f;
        this.x = 0.0f;
    }

    public void es(ljq ljq2) {
        this.x += ljq2.x;
        this.y += ljq2.y;
        this.rlV += ljq2.rlV;
    }

    public void et(ljq ljq2) {
        this.x -= ljq2.x;
        this.y -= ljq2.y;
        this.rlV -= ljq2.rlV;
    }

    public String esA() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append((double)this.x * 565.2);
        stringBuilder.append(",");
        stringBuilder.append((double)this.y * 565.2);
        stringBuilder.append(",");
        stringBuilder.append((double)this.rlV * 565.2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void eu(ljq ljq2) {
        this.G(ljq2.x, ljq2.y, ljq2.rlV);
    }

    public void G(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.rlV = f3;
    }

    public void nt(float f) {
        this.nm(f);
    }

    public void nm(float f) {
        this.x *= f;
        this.y *= f;
        this.rlV *= f;
    }

    public void esB() {
        this.x = -this.x;
        this.y = -this.y;
        this.rlV = -this.rlV;
    }

    public float eqN() {
        return (float)Math.sqrt(this.x * this.x + this.y * this.y + this.rlV * this.rlV);
    }

    public float esC() {
        if (this.x >= this.y && this.x >= this.rlV) {
            return this.x;
        }
        if (this.y >= this.x && this.y >= this.rlV) {
            return this.y;
        }
        return this.rlV;
    }

    public float eqF() {
        return this.x * this.x + this.y * this.y + this.rlV * this.rlV;
    }

    public void esD() {
        Object var1_1 = null;
    }

    public boolean esE() {
        boolean bl = false;
        boolean bl2 = false;
        float f = 0.0f;
        f = this.nu(this.x);
        if (f != this.x) {
            this.x = f;
            bl2 = true;
        }
        if ((f = this.nu(this.y)) != this.y) {
            this.y = f;
            bl2 = true;
        }
        if ((f = this.nu(this.rlV)) != this.rlV) {
            this.rlV = f;
            bl2 = true;
        }
        return bl2;
    }

    private float nu(float f) {
        boolean bl = false;
        if (f < (float)Math.PI * -2 || f > (float)Math.PI * 2) {
            if (f < 0.0f) {
                f = -f;
                bl = true;
            }
            assert (f >= 0.0f) : "Cannot mod a negativ value!";
            f %= (float)Math.PI * 2;
            if (bl) {
                f = -f;
            }
        }
        return f;
    }

    public void normalize() {
        float f = this.eqN();
        if (f != 0.0f) {
            this.x /= f;
            this.y /= f;
            this.rlV /= f;
        }
    }

    public static ljq ev(ljq ljq2) {
        assert (ljq2 != null);
        ljq2.normalize();
        return ljq2;
    }

    public boolean isNormalized() {
        float f = this.eqN();
        return (double)f >= 0.9999000000025262 && (double)f <= 1.0000999999974738;
    }

    public static ljq c(ljq ljq2, ljq ljq3, ljq ljq4, float f) {
        return new ljq(ljq4.x * f * f + ljq3.x * 2.0f * f * (1.0f - f) + ljq2.x * (1.0f - f) * (1.0f - f), ljq4.y * f * f + ljq3.y * 2.0f * f * (1.0f - f) + ljq2.y * (1.0f - f) * (1.0f - f), ljq4.rlV * f * f + ljq3.rlV * 2.0f * f * (1.0f - f) + ljq2.rlV * (1.0f - f) * (1.0f - f));
    }

    public static ljq d(ljq ljq2, ljq ljq3, ljq ljq4, float f) {
        return new ljq(ljq4.x * 2.0f * f + ljq3.x * 2.0f * (1.0f - 2.0f * f) - ljq2.x * 2.0f * (1.0f - f), ljq4.y * 2.0f * f + ljq3.y * 2.0f * (1.0f - 2.0f * f) - ljq2.y * 2.0f * (1.0f - f), ljq4.rlV * 2.0f * f + ljq3.rlV * 2.0f * (1.0f - 2.0f * f) - ljq2.rlV * 2.0f * (1.0f - f));
    }

    public static ljq e(ljq ljq2, ljq ljq3, float f) {
        return new ljq(ljq2.x * (1.0f - f) + ljq3.x * f, ljq2.y * (1.0f - f) + ljq3.y * f, ljq2.rlV * (1.0f - f) + ljq3.rlV * f);
    }

    public static void a(ljq ljq2, ljq ljq3, float f, ljq ljq4) {
        ljq4.G(ljq2.x * (1.0f - f) + ljq3.x * f, ljq2.y * (1.0f - f) + ljq3.y * f, ljq2.rlV * (1.0f - f) + ljq3.rlV * f);
    }

    public static float d(ljq ljq2, ljq ljq3, ljq ljq4) {
        return ljq2.x * (ljq3.y * ljq4.rlV - ljq3.rlV * ljq4.y) - ljq2.y * (ljq3.x * ljq4.rlV - ljq3.rlV * ljq4.x) + ljq2.rlV * (ljq3.x * ljq4.y - ljq3.y * ljq4.x);
    }

    public static ljq r(ljq ljq2, ljq ljq3) {
        return new ljq(0.5f * (ljq2.x + ljq3.x), 0.5f * (ljq2.y + ljq3.y), 0.5f * (ljq2.rlV + ljq3.rlV));
    }

    public static ljq A(ljq ljq2, float f) {
        ljq ljq3 = new ljq(2.0f * f * ((float)Math.random() - 0.5f), 2.0f * f * ((float)Math.random() - 0.5f), 2.0f * f * ((float)Math.random() - 0.5f));
        ljq3.x += ljq2.x;
        ljq3.y += ljq2.y;
        ljq3.rlV += ljq2.rlV;
        return ljq3;
    }

    public boolean ew(ljq ljq2) {
        return ldq.ai(this.x, ljq2.x) && ldq.ai(this.y, ljq2.y) && ldq.ai(this.rlV, ljq2.rlV);
    }

    public boolean B(ljq ljq2, float f) {
        return ldq.y(this.x, ljq2.x, f) && ldq.y(this.y, ljq2.y, f) && ldq.y(this.rlV, ljq2.rlV, f);
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + Float.floatToIntBits(this.x);
        n2 = 31 * n2 + Float.floatToIntBits(this.y);
        n2 = 31 * n2 + Float.floatToIntBits(this.rlV);
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        ljq ljq2 = (ljq)object;
        if (Float.floatToIntBits(this.x) != Float.floatToIntBits(ljq2.x)) {
            return false;
        }
        if (Float.floatToIntBits(this.y) != Float.floatToIntBits(ljq2.y)) {
            return false;
        }
        return Float.floatToIntBits(this.rlV) == Float.floatToIntBits(ljq2.rlV);
    }

    public ljq esF() {
        ljq ljq2 = new ljq();
        ljq2.x = this.x;
        ljq2.y = this.y;
        ljq2.rlV = this.rlV;
        return ljq2;
    }

    public void ex(ljq ljq2) {
        if (ljq2 == null) {
            return;
        }
        this.x = ljq2.x;
        this.y = ljq2.y;
        this.rlV = ljq2.rlV;
    }

    public ljq ey(ljq ljq2) {
        ljq ljq3 = new ljq(this);
        ljq3.et(ljq2);
        return ljq3;
    }

    public float ez(ljq ljq2) {
        assert (ljq2 != null);
        float f = this.x - ljq2.x;
        float f2 = this.y - ljq2.y;
        float f3 = this.rlV - ljq2.rlV;
        return (float)Math.sqrt(f * f + f2 * f2 + f3 * f3);
    }

    public float eA(ljq ljq2) {
        assert (ljq2 != null);
        float f = this.x - ljq2.x;
        float f2 = this.y - ljq2.y;
        float f3 = this.rlV - ljq2.rlV;
        return f * f + f2 * f2 + f3 * f3;
    }

    public boolean esG() {
        return this.x <= lcw.fym.x && this.y <= lcw.fym.y && this.rlV <= lcw.fym.rlV && this.x >= lcw.fyl.x && this.y >= lcw.fyl.y && this.rlV >= lcw.fyl.rlV;
    }

    public static boolean b(ljq ljq2, float f, ljq ljq3) {
        boolean bl;
        assert (ljq2 != null);
        assert (ljq3 != null);
        if (ljq2 == null || ljq3 == null) {
            return false;
        }
        boolean bl2 = bl = Math.pow(ljq2.x - ljq3.x, 2.0) + Math.pow(ljq2.rlV - ljq3.rlV, 2.0) <= Math.pow(f, 2.0);
        if (bl) {
            // empty if block
        }
        return bl;
    }

    public boolean esH() {
        return this.y <= lcw.fym.y && this.y >= lcw.fyl.y;
    }

    public String toString() {
        return "[" + this.x + "," + this.y + "," + this.rlV + "]";
    }

    public String esI() {
        return "X:" + (int)this.x + " Y:" + (int)this.rlV;
    }

    public static float nv(float f) {
        return f / 57.29578f;
    }

    public boolean esJ() {
        return this.x == 0.0f && this.y == 0.0f && this.rlV == 0.0f;
    }

    public boolean isZero() {
        return lew.ak(this.x, 1.0E-6f) && lew.ak(this.y, 1.0E-6f) && lew.ak(this.rlV, 1.0E-6f);
    }

    public void esK() {
        this.rlV = 0.0f;
        this.y = 0.0f;
        this.x = 0.0f;
    }

    public void setLength(float f) {
        this.normalize();
        this.nt(f);
    }

    public void reverse() {
        this.nt(-1.0f);
    }

    public static final ljq eB(ljq ljq2) {
        if (ljq2 == null) {
            return new ljq();
        }
        float f = (float)Math.atan2(ljq2.x, ljq2.rlV);
        float f2 = (float)Math.asin(ljq2.y);
        return new ljq(f2, f, 0.0f);
    }

    public static float s(ljq ljq2, ljq ljq3) {
        assert (ljq2 != null && ljq3 != null);
        float f = ljq2.x - ljq3.x;
        float f2 = ljq2.y - ljq3.y;
        float f3 = ljq2.rlV - ljq3.rlV;
        return (float)Math.sqrt(f * f + f2 * f2 + f3 * f3);
    }

    public static float t(ljq ljq2, ljq ljq3) {
        assert (ljq2 != null && ljq3 != null);
        float f = ljq2.x - ljq3.x;
        float f2 = ljq2.y - ljq3.y;
        float f3 = ljq2.rlV - ljq3.rlV;
        return f * f + f2 * f2 + f3 * f3;
    }

    public static float u(ljq ljq2, ljq ljq3) {
        return ljq2.x * ljq3.x + ljq2.y * ljq3.y + ljq2.rlV * ljq3.rlV;
    }

    public static ljq v(ljq ljq2, ljq ljq3) {
        float f = ljq.u(ljq2, ljq3);
        ljq ljq4 = new ljq(ljq3);
        ljq4.nm(f * 2.0f);
        ljq ljq5 = new ljq(ljq2);
        ljq5.et(ljq4);
        return ljq5;
    }

    public static ljq w(ljq ljq2, ljq ljq3) {
        ljq ljq4 = new ljq();
        ljq4.x = ljq2.y * ljq3.rlV - ljq2.rlV * ljq3.y;
        ljq4.y = ljq2.rlV * ljq3.x - ljq2.x * ljq3.rlV;
        ljq4.rlV = ljq2.x * ljq3.y - ljq2.y * ljq3.x;
        return ljq4;
    }

    public static ljq x(ljq ljq2, ljq ljq3) {
        ljq ljq4 = new ljq();
        ljq4.x = 0.5f * (ljq2.x + ljq3.x);
        ljq4.y = 0.5f * (ljq2.y + ljq3.y);
        ljq4.rlV = 0.5f * (ljq2.rlV + ljq3.rlV);
        return ljq4;
    }

    public static ljq a(ljq ljq2, ljq ljq3, ljq ljq4, ljq ljq5, float f) {
        float f2 = 2.0f * f * f * f - 3.0f * f * f + 1.0f;
        float f3 = f * f * f - 2.0f * f * f + f;
        float f4 = -2.0f * f * f * f + 3.0f * f * f;
        float f5 = f * f * f - f * f;
        ljq ljq6 = new ljq();
        ljq6.x = ljq2.x * f2 + ljq4.x * f3 + ljq3.x * f4 + ljq5.x * f5;
        ljq6.y = ljq2.y * f2 + ljq4.y * f3 + ljq3.y * f4 + ljq5.y * f5;
        ljq6.rlV = ljq2.rlV * f2 + ljq4.rlV * f3 + ljq3.rlV * f4 + ljq5.rlV * f5;
        return ljq6;
    }

    public static ljq e(ljq ljq2, ljq ljq3, ljq ljq4, float f) {
        assert (ljq2 != null && ljq3 != null && ljq4 != null);
        assert (f >= 0.0f && f <= 1.0f);
        float f2 = 1.0f - f;
        ljq ljq5 = ljq.D(ljq2, f2 * f2);
        ljq5.es(ljq.D(ljq3, 2.0f * f2 * f));
        ljq5.es(ljq.D(ljq4, f * f));
        return ljq5;
    }

    public static float y(ljq ljq2, ljq ljq3) {
        assert (!ljq2.isZero());
        assert (!ljq3.isZero());
        return (float)Math.acos(ljq.u(ljq2, ljq3) / (ljq2.eqN() * ljq3.eqN()));
    }

    public static ljq eC(ljq ljq2) {
        ljq ljq3 = new ljq(0.0f, 0.0f, 0.0f);
        if (lew.ak(ljq2.x, 0.0f)) {
            if (lew.ak(ljq2.y, 0.0f)) {
                if (lew.ak(ljq2.rlV, 0.0f)) {
                    assert (false) : "ERROR: Input is Zero vector!";
                } else {
                    ljq3.x = 1.0f;
                }
            } else if (lew.ak(ljq2.rlV, 0.0f)) {
                ljq3.x = 1.0f;
            } else {
                ljq3.y = ljq2.rlV;
                ljq3.rlV = -ljq2.y;
            }
        } else if (lew.ak(ljq2.y, 0.0f)) {
            if (lew.ak(ljq2.rlV, 0.0f)) {
                ljq3.y = 1.0f;
            } else {
                ljq3.x = ljq2.rlV;
                ljq3.rlV = -ljq2.x;
            }
        } else {
            ljq3.x = ljq2.y;
            ljq3.y = -ljq2.x;
        }
        return ljq3;
    }

    public static ljq esL() {
        ljq ljq2 = new ljq();
        ljq2.rlV = lew.aj(-1.0f, 1.0f);
        float f = lew.aj(0.0f, (float)Math.PI * 2);
        float f2 = (float)Math.sqrt(1.0f - ljq2.rlV * ljq2.rlV);
        ljq2.x = f2 * (float)Math.cos(f);
        ljq2.y = f2 * (float)Math.sin(f);
        return ljq2;
    }

    public static ljq nw(float f) {
        ljq ljq2 = new ljq(0.0f, 0.0f, 1.0f);
        double d2 = Math.PI * Math.random();
        lgl lgl2 = new lgl(new ljq(0.0, 1.0, 0.0), (float)d2);
        ljq ljq3 = lgl2.eq(ljq2);
        ljq3.normalize();
        float f2 = (float)(Math.random() - 0.5) * 2.0f;
        ljq3.nm(f * f2);
        return ljq3;
    }

    public static ljq C(ljq ljq2, float f) {
        float f2;
        assert (!ljq2.isZero());
        assert (f >= 0.0f && (double)f <= 1.5707963705062866);
        ljq ljq3 = new ljq();
        ljq ljq4 = new ljq();
        ljq ljq5 = new ljq(ljq2);
        ljq5.normalize();
        if (lew.ak(ljq5.x + ljq5.y, 0.001f)) {
            ljq3.x = 0.0f;
            ljq3.y = 1.0f;
            ljq3.rlV = 0.0f;
            ljq4.x = 1.0f;
            ljq4.y = 0.0f;
            ljq4.rlV = 0.0f;
        } else {
            f2 = (float)Math.sqrt(ljq5.x * ljq5.x + ljq5.y * ljq5.y);
            ljq3.x = ljq5.y / f2;
            ljq3.y = -ljq5.x / f2;
            ljq3.rlV = 0.0f;
            ljq3.normalize();
            ljq4 = ljq.w(ljq5, ljq3);
            ljq4.normalize();
        }
        f2 = lew.aj(0.0f, (float)Math.PI * 2);
        ljq ljq6 = new ljq();
        ljq6.x = (float)((double)ljq5.x * Math.cos(f) + (double)ljq3.x * Math.sin(f) * Math.cos(f2) + (double)ljq4.x * Math.sin(f) * Math.sin(f2));
        ljq6.y = (float)((double)ljq5.y * Math.cos(f) + (double)ljq3.y * Math.sin(f) * Math.cos(f2) + (double)ljq4.y * Math.sin(f) * Math.sin(f2));
        ljq6.rlV = (float)((double)ljq5.rlV * Math.cos(f) + (double)ljq3.rlV * Math.sin(f) * Math.cos(f2) + (double)ljq4.rlV * Math.sin(f) * Math.sin(f2));
        return ljq6;
    }

    public static ljq z(ljq ljq2, ljq ljq3) {
        assert (ljq2 != null) : "u == null";
        assert (ljq3 != null) : "v == null";
        return new ljq(ljq2.x - ljq3.x, ljq2.y - ljq3.y, ljq2.rlV - ljq3.rlV);
    }

    public static ljq A(ljq ljq2, ljq ljq3) {
        assert (ljq2 != null) : "u == null";
        assert (ljq3 != null) : "v == null";
        return new ljq(ljq2.x + ljq3.x, ljq2.y + ljq3.y, ljq2.rlV + ljq3.rlV);
    }

    public static ljq D(ljq ljq2, float f) {
        assert (ljq2 != null);
        return new ljq(ljq2.x * f, ljq2.y * f, ljq2.rlV * f);
    }

    public static void e(ljq ljq2, ljq ljq3, ljq ljq4) {
        assert (ljq2 != null) : "u == null";
        assert (ljq3 != null) : "v == null";
        ljq4.x = ljq2.x - ljq3.x;
        ljq4.y = ljq2.y - ljq3.y;
        ljq4.rlV = ljq2.rlV - ljq3.rlV;
    }

    public static void f(ljq ljq2, ljq ljq3, ljq ljq4) {
        assert (ljq2 != null) : "u == null";
        assert (ljq3 != null) : "v == null";
        ljq4.x = ljq2.x + ljq3.x;
        ljq4.y = ljq2.y + ljq3.y;
        ljq4.rlV = ljq2.rlV + ljq3.rlV;
    }

    public static void c(ljq ljq2, float f, ljq ljq3) {
        assert (ljq2 != null);
        ljq3.x = ljq2.x * f;
        ljq3.y = ljq2.y * f;
        ljq3.rlV = ljq2.rlV * f;
    }

    public static ljq b(float f, ljq ljq2) {
        assert (ljq2 != null);
        double d2 = Math.cos(f);
        double d3 = Math.sin(f);
        float f2 = (float)((double)ljq2.x * d2 + (double)ljq2.rlV * d3);
        float f3 = (float)((double)(-ljq2.x) * d3 + (double)ljq2.rlV * d2);
        return ljq.ev(new ljq(f2, 0.0f, f3));
    }

    public static ljq B(ljq ljq2, ljq ljq3) {
        assert (ljq2 != null && ljq3 != null);
        float f = ljq2.x + (ljq3.x - ljq2.x) * (float)Math.random();
        float f2 = ljq2.y + (ljq3.y - ljq2.y) * (float)Math.random();
        float f3 = ljq2.rlV + (ljq3.rlV - ljq2.rlV) * (float)Math.random();
        return new ljq(f, f2, f3);
    }

    public static ljq h(ljq ljq2, ljq ljq3, float f) {
        if (ljq2 == null || ljq3 == null) {
            return null;
        }
        lgl lgl2 = new lgl(ljq3, f);
        ljq ljq4 = new ljq(ljq2);
        return lgl2.eq(ljq4);
    }
}

