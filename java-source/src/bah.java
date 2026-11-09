/*
 * Decompiled with CFR.
 */
final class bah {
    private ldv GUID = null;
    private int ResourceType = -1;
    private ljq Position = null;
    private String Name = null;
    private float bWk = 0.0f;
    private float cIk = 0.0f;
    private azw cHi = null;

    ldv getGUID() {
        return this.GUID;
    }

    int az() {
        return this.ResourceType;
    }

    ljq av() {
        return this.Position;
    }

    String getName() {
        return this.Name;
    }

    float Ub() {
        return this.bWk;
    }

    float afi() {
        return this.cIk;
    }

    void cl(float f) {
        this.cIk = f;
    }

    bah(ldv ldv2, int n, ljq ljq2, String string, float f) {
        this.GUID = ldv2;
        this.ResourceType = n;
        this.Position = ljq2;
        this.Name = string;
        this.cIk = f;
        this.bWk = f;
    }

    public azw aew() {
        if (this.cHi == null) {
            this.cHi = new azw();
            this.cHi.setGUID(this.GUID);
            this.cHi.l(this.ResourceType);
            this.cHi.c(this.Position);
            this.cHi.setName(this.Name);
            this.cHi.ck(this.bWk);
        }
        this.cHi.cl(this.cIk);
        return this.cHi;
    }
}

