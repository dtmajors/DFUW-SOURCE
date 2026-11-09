/*
 * Decompiled with CFR.
 */
public class bes {
    public int dec;
    public int ded;
    public String Filename;

    public bes(int n, int n2, String string) {
        this.dec = n;
        this.ded = n2;
        this.Filename = string;
    }

    public String toString() {
        return "StartTime=" + this.dec + ", Inperolation=" + this.ded + ", Filename=" + this.Filename;
    }
}

