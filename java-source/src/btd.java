/*
 * Decompiled with CFR.
 */
public class btd
extends bsv {
    private String dKK;
    private ldv GUID;
    private ljq Position;
    private String dKw;

    public btd() {
        this.dKf = bsv.a.dKi;
    }

    public String axx() {
        return this.dKK;
    }

    public void gk(String string) {
        this.dKK = string;
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

    @Override
    public String toString() {
        return this.dKw;
    }
}

