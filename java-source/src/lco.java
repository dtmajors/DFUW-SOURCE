/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.io.Serializable;

public class lco
implements Serializable {
    public float qwk;
    public float qwl;
    public float qwm;

    public lco() {
        this.qwm = 1.0f;
        this.qwl = 1.0f;
        this.qwk = 1.0f;
    }

    public lco(lco lco2) {
        this.qwk = lco2.qwk;
        this.qwl = lco2.qwl;
        this.qwm = lco2.qwm;
    }

    public lco(Color color) {
        this.qwk = (float)color.getRed() / 255.0f;
        this.qwl = (float)color.getGreen() / 255.0f;
        this.qwm = (float)color.getBlue() / 255.0f;
    }

    public lco(float f, float f2, float f3) {
        assert (f >= 0.0f && f <= 1.0f) : "Red color must be between 0 and 1!";
        assert (f2 >= 0.0f && f2 <= 1.0f) : "Green color must be between 0 and 1!";
        assert (f3 >= 0.0f && f3 <= 1.0f) : "Blue color must be between 0 and 1!";
        this.qwk = f;
        this.qwl = f2;
        this.qwm = f3;
    }

    public Color emK() {
        return new Color(this.qwk, this.qwl, this.qwm);
    }

    public ljr emL() {
        return new ljr(1.0f, this.qwk, this.qwl, this.qwm);
    }

    public void nb(float f) {
        assert (f >= 0.0f && f <= 1.0f) : "Red color must be between 0 and 1!";
        this.qwk = f;
    }

    public void nc(float f) {
        assert (f >= 0.0f && f <= 1.0f) : "Green color must be between 0 and 1!";
        this.qwl = f;
    }

    public void nd(float f) {
        assert (f >= 0.0f && f <= 1.0f) : "Blue color must be between 0 and 1!";
        this.qwm = f;
    }

    public float bVf() {
        return this.qwk;
    }

    public float bVg() {
        return this.qwl;
    }

    public float bVh() {
        return this.qwm;
    }

    public String toString() {
        return "Color: Red[" + this.qwk + "], Green[" + this.qwl + "], Blue[" + this.qwm + "]";
    }

    public boolean equals(Object object) {
        if (object instanceof lco) {
            lco lco2 = (lco)object;
            if (this.qwk == lco2.qwk && this.qwl == lco2.qwl && this.qwm == lco2.qwm) {
                return true;
            }
        } else if (object instanceof Color) {
            throw new NullPointerException("Unhandled check for equals in SFColor!!");
        }
        return false;
    }
}

