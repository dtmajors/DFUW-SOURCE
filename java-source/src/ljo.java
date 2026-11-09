/*
 * Decompiled with CFR.
 */
public class ljo {
    private float roL;
    private float roM;
    private float auG;

    public ljo(float f, float f2) {
        this.roL = f;
        this.roM = f2;
        this.auG = f2;
    }

    public void nr(float f) {
        this.roM = f;
    }

    public float po() {
        return this.auG;
    }

    public float ns(float f) {
        float f2 = this.roM - this.auG;
        float f3 = lew.A(f2, -f * this.roL, f * this.roL);
        this.auG += f3;
        return this.auG;
    }
}

