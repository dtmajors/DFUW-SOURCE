/*
 * Decompiled with CFR.
 */
public class ban {
    private ldv GUID = null;
    private String Name = null;
    private int ResourceType = -1;
    private ljq Position = null;
    private float bWk = 0.0f;
    private float cIk = 0.0f;
    private azw cHi = null;

    ldv getGUID() {
        return this.GUID;
    }

    String getName() {
        return this.Name;
    }

    int az() {
        return this.ResourceType;
    }

    ljq av() {
        return this.Position;
    }

    float Ub() {
        return this.bWk;
    }

    float afi() {
        return this.cIk;
    }

    ban(ldv ldv2, String string, int n, ljq ljq2, float f) {
        this.GUID = ldv2;
        this.Name = string;
        this.ResourceType = n;
        this.Position = ljq2;
        this.bWk = f;
        this.cIk = f;
    }

    boolean cm(float f) {
        if (this.cIk == f) {
            return false;
        }
        this.cIk = f;
        return true;
    }

    azw aew() {
        if (this.cHi == null) {
            this.cHi = new azw();
            this.cHi.setGUID(this.GUID);
            this.cHi.setName(this.Name);
            this.cHi.l(this.ResourceType);
            this.cHi.c(this.Position);
            this.cHi.ck(this.bWk);
        }
        this.cHi.cl(this.cIk);
        return this.cHi;
    }
}

