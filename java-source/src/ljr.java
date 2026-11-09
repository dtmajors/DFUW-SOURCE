/*
 * Decompiled with CFR.
 */
public class ljr {
    public float rlW = 0.0f;
    public float x = 0.0f;
    public float y = 0.0f;
    public float rlV = 0.0f;

    public ljr() {
    }

    public ljr(float f, float f2, float f3, float f4) {
        this.rlW = f;
        this.x = f2;
        this.y = f3;
        this.rlV = f4;
    }

    public ljr(ljr ljr2) {
        if (ljr2 != null) {
            this.rlW = ljr2.rlW;
            this.x = ljr2.x;
            this.y = ljr2.y;
            this.rlV = ljr2.rlV;
        }
    }

    public float eqM() {
        return this.rlW;
    }

    public void nl(float f) {
        this.rlW = f;
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

    public void l(ljr ljr2) {
        this.rlW += ljr2.rlW;
        this.x += ljr2.x;
        this.y += ljr2.y;
        this.rlV += ljr2.rlV;
    }

    public void m(ljr ljr2) {
        this.rlW -= ljr2.rlW;
        this.x -= ljr2.x;
        this.y -= ljr2.y;
        this.rlV -= ljr2.rlV;
    }

    public String toString() {
        return "[" + this.x + "," + this.y + "," + this.rlV + "," + this.rlW + "]";
    }

    public void n(ljr ljr2) {
        this.rlW = ljr2.eqM();
        this.x = ljr2.getX();
        this.y = ljr2.getY();
        this.rlV = ljr2.bdV();
    }

    public void nt(float f) {
        this.rlW *= f;
        this.x *= f;
        this.y *= f;
        this.rlV *= f;
    }

    public float eqN() {
        return (float)Math.sqrt(this.x * this.x + this.y * this.y + this.rlV * this.rlV);
    }

    public void normalize() {
        float f = this.eqN();
        if (Math.abs(f) > 0.0f) {
            this.rlW /= f;
            this.x /= f;
            this.y /= f;
            this.rlV /= f;
        }
    }

    public boolean esJ() {
        return this.x == 0.0f && this.y == 0.0f && this.rlV == 0.0f && this.rlW == 0.0f;
    }

    public boolean equals(Object object) {
        if (object instanceof ljr) {
            ljr ljr2 = (ljr)object;
            if (this.x == ljr2.x && this.y == ljr2.y && this.rlV == ljr2.rlV && this.rlW == ljr2.rlW) {
                return true;
            }
        }
        return false;
    }

    public ljr esM() {
        ljr ljr2 = new ljr();
        ljr2.rlW = this.rlW;
        ljr2.x = this.x;
        ljr2.y = this.y;
        ljr2.rlV = this.rlV;
        return ljr2;
    }
}

