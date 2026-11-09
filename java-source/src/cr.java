/*
 * Decompiled with CFR.
 */
public class cr {
    private String Name;
    private int Cost;
    private boolean jQ;

    public cr() {
    }

    public cr(cr cr2) {
        this.Name = cr2.Name;
        this.Cost = cr2.Cost;
        this.jQ = cr2.jQ;
    }

    public int cl() {
        return this.Cost;
    }

    public void K(int n) {
        this.Cost = n;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    public boolean cm() {
        return this.jQ;
    }

    public void setChecked(boolean bl) {
        this.jQ = bl;
    }
}

