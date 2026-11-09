/*
 * Decompiled with CFR.
 */
public class lmg {
    private int Type = 0;
    private String Name = null;
    private int rEF = 0;

    public int getType() {
        return this.Type;
    }

    public void setType(int n) {
        this.Type = n;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    public int euQ() {
        return this.rEF;
    }

    public void ady(int n) {
        this.rEF = n;
    }

    public String toString() {
        return "Column Name =" + this.Name + ", Type =" + this.Type + ", MaxSize = " + this.rEF;
    }
}

