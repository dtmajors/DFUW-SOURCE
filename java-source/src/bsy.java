/*
 * Decompiled with CFR.
 */
public class bsy
extends bsv {
    private ljq Position;
    private ljq my;
    private String ResourceName;

    public bsy() {
        this.dKf = bsv.a.dKk;
    }

    public String pa() {
        return this.ResourceName;
    }

    public void eY(String string) {
        this.ResourceName = string;
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
}

