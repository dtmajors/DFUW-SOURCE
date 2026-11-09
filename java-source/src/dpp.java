/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class dpp {
    private ldv GUID = null;
    private String ResourceName = null;
    private int ResourceType = -1;
    private ljq Position = null;
    private lgl Rotation = null;

    public ldv getGUID() {
        return this.GUID;
    }

    public void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public String pa() {
        return this.ResourceName;
    }

    public void eY(String string) {
        this.ResourceName = string;
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public boolean aYq() {
        return lea.enW().isDescendant(this.ResourceType, cug.fqO);
    }

    public boolean aYr() {
        return lea.enW().isDescendant(this.ResourceType, cug.fqP);
    }

    public int bsi() {
        return lea.enW().getType(this.ResourceName + "_Base");
    }
}

