/*
 * Decompiled with CFR.
 */
public class ciu
extends ciq {
    private final float eDb;
    private final float eCW;

    public ciu(int n, int n2, boolean bl, int n3, float f, float f2, float f3, float f4, boolean bl2, float f5, float f6) {
        super(n, n2, bl, n3, f, f2, f3, f4, bl2);
        this.eDb = f5;
        this.eCW = f6;
    }

    public int qG(int n) {
        return n + (int)(this.eDb * (float)n);
    }

    public float aPv() {
        return this.eCW;
    }

    @Override
    public float a(tv tv2, float f) {
        if (tv2 != tv.aVK) {
            return f;
        }
        return f + this.aPz() * f;
    }
}

