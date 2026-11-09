/*
 * Decompiled with CFR.
 */
public class dug {
    private String Name = null;
    private String ejK = null;
    private int heb = 0;
    private dui[] hec = null;

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    public String getClassName() {
        return this.ejK;
    }

    public void setClassName(String string) {
        this.ejK = string;
    }

    public int bBb() {
        return this.heb;
    }

    public void Cp(int n) {
        this.heb = n;
    }

    public dui[] bBc() {
        return this.hec;
    }

    public void a(dui[] duiArray) {
        this.hec = duiArray;
    }

    public String bBd() {
        return duk.Cs(this.heb);
    }

    public String toString() {
        assert (this.hec != null);
        return "SFEnumeration: Name='" + this.Name + "' ClassName='" + this.ejK + "' ValueType='" + this.bBd() + "' ItemCount=" + this.hec.length;
    }
}

