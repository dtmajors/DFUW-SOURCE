/*
 * Decompiled with CFR.
 */
public class msa
implements Comparable {
    private String Name;
    private boolean Epn;
    private int Type = -1;

    public msa() {
    }

    public msa(String string, boolean bl, int n) {
        this.Name = string;
        this.Epn = bl;
        this.Type = n;
    }

    public String toString() {
        String string = "";
        if (this.Epn) {
            string = string + "(2points) ";
        }
        string = string + this.Name;
        return string;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    public boolean eNc() {
        return this.Epn;
    }

    public void Ag(boolean bl) {
        this.Epn = bl;
    }

    public int compareTo(Object object) {
        assert (object instanceof msa);
        return this.toString().compareTo(((msa)object).toString());
    }

    public int getType() {
        return this.Type;
    }
}

