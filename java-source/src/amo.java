/*
 * Decompiled with CFR.
 */
public class amo {
    public static final int bzn = 0;
    public static final int bzo = 1;
    public static final int bzp = 2;
    public static final int bzq = 0;
    public static final int bzr = 1;
    public static final int bzs = 2;
    int type = 0;
    int color = 0;
    ljq bzt = null;
    ldv GUID;

    public amo() {
    }

    public amo(ldv ldv2) {
        this.GUID = ldv2;
    }

    public int Hr() {
        return this.color;
    }

    public void setColor(int n) {
        this.color = n;
    }

    public ljq av() {
        return this.bzt;
    }

    public void c(ljq ljq2) {
        this.bzt = ljq2;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int n) {
        this.type = n;
    }

    public ldv getGUID() {
        return this.GUID;
    }

    public void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }
}

