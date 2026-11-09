/*
 * Decompiled with CFR.
 */
public abstract class cis
extends civ {
    private final float eCX;
    private final float eCY;

    public cis(int n, int n2, boolean bl, int n3, float f, float f2) {
        super(n, n2, bl, n3, null, 0);
        this.eCX = f;
        this.eCY = f2;
    }

    public float aPy() {
        return 1.0f - this.eCX;
    }

    public abstract float a(tv var1, float var2);

    public float aPz() {
        return this.eCY;
    }
}

