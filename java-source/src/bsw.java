/*
 * Decompiled with CFR.
 */
public class bsw
extends bsv {
    private ljq Position;
    private ljq my;
    private String ResourceName;
    private String ID;
    private String dKs;

    public String getID() {
        return this.ID;
    }

    public void setID(String string) {
        this.ID = string;
    }

    public bsw() {
        this.dKf = bsv.a.dKj;
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

    public String axm() {
        return this.dKs;
    }

    public void gh(String string) {
        this.dKs = string;
    }

    @Override
    public String toString() {
        return this.dKs;
    }
}

