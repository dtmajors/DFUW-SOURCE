/*
 * Decompiled with CFR.
 */
public class cit
extends ciq {
    private final float eCZ;
    private final float eCV;
    private final float eCU;
    private final float eDa;

    public cit(int n, int n2, boolean bl, int n3, float f, float f2, float f3, float f4, boolean bl2, float f5, float f6, float f7, float f8) {
        super(n, n2, bl, n3, f, f2, f3, f4, bl2);
        this.eCZ = f5;
        this.eCV = f6;
        this.eCU = f7;
        this.eDa = f8;
    }

    public float aPA() {
        return this.eCZ;
    }

    public float aPw() {
        return this.eCV;
    }

    public float aPx() {
        return this.eCU;
    }

    public float aPB() {
        return this.eDa;
    }

    @Override
    public float a(tv tv2, float f) {
        if (tv2 != tv.aVJ && tv2 != tv.aVI) {
            return f;
        }
        return f + this.aPz() * f;
    }
}

