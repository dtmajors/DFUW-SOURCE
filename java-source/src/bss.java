/*
 * Decompiled with CFR.
 */
public class bss {
    public float dJw = 0.0f;
    public float dJx = 0.0f;
    public float dJy = 0.0f;
    public float dJz = 0.0f;
    public float dJA = 0.0f;
    public float dJB = 0.0f;

    public ljq axe() {
        ljq ljq2 = new ljq();
        ljq2.x = this.dJw + (this.dJz - this.dJw) / 2.0f;
        ljq2.y = this.dJx + (this.dJA - this.dJx) / 2.0f;
        ljq2.rlV = this.dJy + (this.dJB - this.dJy) / 2.0f;
        return ljq2;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + Float.floatToIntBits(this.dJz);
        n2 = 31 * n2 + Float.floatToIntBits(this.dJA);
        n2 = 31 * n2 + Float.floatToIntBits(this.dJB);
        n2 = 31 * n2 + Float.floatToIntBits(this.dJw);
        n2 = 31 * n2 + Float.floatToIntBits(this.dJx);
        n2 = 31 * n2 + Float.floatToIntBits(this.dJy);
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
        bss bss2 = (bss)object;
        if (Float.floatToIntBits(this.dJz) != Float.floatToIntBits(bss2.dJz)) {
            return false;
        }
        if (Float.floatToIntBits(this.dJA) != Float.floatToIntBits(bss2.dJA)) {
            return false;
        }
        if (Float.floatToIntBits(this.dJB) != Float.floatToIntBits(bss2.dJB)) {
            return false;
        }
        if (Float.floatToIntBits(this.dJw) != Float.floatToIntBits(bss2.dJw)) {
            return false;
        }
        if (Float.floatToIntBits(this.dJx) != Float.floatToIntBits(bss2.dJx)) {
            return false;
        }
        return Float.floatToIntBits(this.dJy) == Float.floatToIntBits(bss2.dJy);
    }
}

