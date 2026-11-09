/*
 * Decompiled with CFR.
 */
public class ifs {
    private float lSb;
    private float lSc;

    public ifs(float f, float f2) {
        this.lSb = f;
        this.lSc = f2;
    }

    public float cSX() {
        return this.lSb;
    }

    public float cSY() {
        return this.lSc;
    }

    public boolean j(ign ign2) {
        float f = ign2.cTO();
        return f >= this.lSb && f < this.lSc;
    }
}

