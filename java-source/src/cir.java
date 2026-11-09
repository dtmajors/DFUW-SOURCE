/*
 * Decompiled with CFR.
 */
public class cir
extends cis {
    private final float eCU;
    private final float eCV;
    private final float eCW;

    public cir(int n, int n2, boolean bl, int n3, float f, float f2, float f3, float f4, float f5) {
        super(n, n2, bl, n3, f, f2);
        this.eCU = f3;
        this.eCV = f4;
        this.eCW = f5;
    }

    public float aPv() {
        return this.eCW;
    }

    public float aPw() {
        return this.eCV;
    }

    public float aPx() {
        return this.eCU;
    }

    @Override
    public float a(tv tv2, float f) {
        if (tv2 != tv.aVK && tv2 != tv.aVI) {
            return f;
        }
        return f + this.aPz() * f;
    }
}

