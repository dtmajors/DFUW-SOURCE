/*
 * Decompiled with CFR.
 */
public class bta
extends bsv {
    private ldv GUID;
    private ljq Position;
    private ljq my;
    private String dKw;

    public bta() {
        this.dKf = bsv.a.dKh;
    }

    public String axo() {
        return this.dKw;
    }

    public void gi(String string) {
        this.dKw = string;
    }

    public ldv getGUID() {
        return this.GUID;
    }

    public void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public ljq getRotation() {
        return this.my;
    }

    public void setRotation(ljq ljq2) {
        this.my = ljq2;
    }

    @Override
    public String toString() {
        return this.dKw;
    }
}

