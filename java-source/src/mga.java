/*
 * Decompiled with CFR.
 */
public class mga {
    public ljq mZ;
    public float Radius;

    public mga() {
    }

    public mga(ljq ljq2, float f) {
        this.mZ = ljq2;
        this.Radius = f;
    }

    void exW() {
        this.mZ.esz();
        this.Radius = 1.0f;
    }

    public ljq exX() {
        return this.mZ;
    }

    public void eL(ljq ljq2) {
        this.mZ = ljq2;
    }

    public float getRadius() {
        return this.Radius;
    }

    public void setRadius(float f) {
        this.Radius = f;
    }

    public ljq esL() {
        ljq ljq2 = mga.exY();
        ljq2.nm(this.getRadius());
        ljq2.es(this.exX());
        return ljq2;
    }

    public static ljq exY() {
        ljq ljq2 = new ljq();
        ljq2.rlV = 2.0f * (float)Math.random() - 1.0f;
        float f = lew.A((float)Math.PI * 2 * (float)Math.random(), 0.0f, (float)Math.PI * 2);
        float f2 = (float)Math.sqrt(lew.A(1.0f - ljq2.rlV * ljq2.rlV, 0.0f, 1.0f));
        ljq2.x = f2 * (float)Math.cos(f);
        ljq2.y = f2 * (float)Math.sin(f);
        return ljq2;
    }
}

