/*
 * Decompiled with CFR.
 */
public class azr {
    private ldv GUID = null;
    private String Name = null;
    private int ResourceType = -1;
    private ljq Position = null;
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

    azr(ldv ldv2, String string, int n, ljq ljq2) {
        this.GUID = ldv2;
        this.Name = string;
        this.ResourceType = n;
        this.Position = ljq2;
    }

    public azw aew() {
        if (this.cHi == null) {
            this.cHi = new azw();
            this.cHi.setGUID(this.GUID);
            this.cHi.l(this.ResourceType);
            this.cHi.c(this.Position);
            this.cHi.setName(this.Name);
            this.cHi.ck(0.0f);
        }
        this.cHi.cl(0.0f);
        return this.cHi;
    }
}

