/*
 * Decompiled with CFR.
 */
public class dui {
    private String Name = null;
    private int PC = 0;

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    public int getValue() {
        return this.PC;
    }

    public void setValue(int n) {
        this.PC = n;
    }

    public String toString() {
        return "SFEnumerationItem: Name='" + this.Name + "' Value=" + this.PC;
    }
}

