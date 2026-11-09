/*
 * Decompiled with CFR.
 */
import java.io.Serializable;

public class ljp
implements Serializable {
    public float x;
    public float y;
    public static final ljp roN = new ljp(0.0f, 0.0f);

    public ljp() {
    }

    public ljp(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public ljp(ljp ljp2) {
        if (ljp2 != null) {
            this.x = ljp2.x;
            this.y = ljp2.y;
        }
    }

    public void al(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public final void u(ljp ljp2) {
        if (ljp2 == null) {
            return;
        }
        this.x = ljp2.x;
        this.y = ljp2.y;
    }

    public float getX() {
        return this.x;
    }

    public final void kl(float f) {
        this.x = f;
    }

    public float getY() {
        return this.y;
    }

    public final void km(float f) {
        this.y = f;
    }

    public final void v(ljp ljp2) {
        this.x += ljp2.x;
        this.y += ljp2.y;
    }

    public final float eqN() {
        return (float)Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public final float eqF() {
        return this.x * this.x + this.y * this.y;
    }

    public final ljp w(ljp ljp2) {
        return new ljp(this.x - ljp2.x, this.y - ljp2.y);
    }

    public final float x(ljp ljp2) {
        if (ljp2 == null) {
            return 0.0f;
        }
        float f = this.x - ljp2.x;
        float f2 = this.y - ljp2.y;
        return (float)Math.sqrt(f * f + f2 * f2);
    }

    public final float y(ljp ljp2) {
        if (ljp2 == null) {
            return 0.0f;
        }
        float f = this.x - ljp2.x;
        float f2 = this.y - ljp2.y;
        return f * f + f2 * f2;
    }

    public final boolean z(ljp ljp2) {
        return ldq.ai(this.x, ljp2.x) && ldq.ai(this.y, ljp2.y);
    }

    public final boolean equals(Object object) {
        if (object instanceof ljp) {
            return this.z((ljp)object);
        }
        return false;
    }

    public String toString() {
        return "[" + this.x + "," + this.y + "]";
    }

    public static ljp As(String string) {
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
        String string2 = string.substring(0, n);
        float f = Float.parseFloat(string2.trim());
        string2 = string.substring(n + 1);
        float f2 = Float.parseFloat(string2.trim());
        return new ljp(f, f2);
    }

    public void nm(float f) {
        this.x *= f;
        this.y *= f;
    }
}

