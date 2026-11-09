/*
 * Decompiled with CFR.
 */
public class duf {
    private String Name = null;
    private String hdY = null;
    private String hdZ = null;
    private duj[] hea = null;

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    public String getPackageName() {
        return this.hdY;
    }

    public void setPackageName(String string) {
        this.hdY = string;
    }

    public String bAZ() {
        return this.hdZ;
    }

    public void jy(String string) {
        this.hdZ = string;
    }

    public duj[] bBa() {
        return this.hea;
    }

    public void a(duj[] dujArray) {
        this.hea = dujArray;
    }

    public String toString() {
        assert (this.hea != null);
        return "SFClass: Name='" + this.Name + "' PackageName='" + this.hdY + "' FieldCount=" + this.hea.length;
    }
}

