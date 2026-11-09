/*
 * Decompiled with CFR.
 */
public abstract class ciq
extends cis {
    private final float bih;
    private final float eCS;
    private final boolean eCT;

    public ciq(int n, int n2, boolean bl, int n3, float f, float f2, float f3, float f4, boolean bl2) {
        super(n, n2, bl, n3, f, f2);
        this.bih = f3;
        this.eCS = f4;
        this.eCT = bl2;
    }

    public float es(float f) {
        return f + this.bih * f;
    }

    public float et(float f) {
        return f + this.eCS * f;
    }

    public final boolean aPu() {
        return this.eCT;
    }
}

