/*
 * Decompiled with CFR.
 */
public class lev {
    private int rjQ = -1;
    private int PC = -1;

    public lev() {
    }

    public lev(int n, int n2) {
        this.rjQ = n;
        this.PC = n2;
    }

    public int getKey() {
        return this.rjQ;
    }

    public void acw(int n) {
        this.rjQ = n;
    }

    public int getValue() {
        return this.PC;
    }

    public void setValue(int n) {
        this.PC = n;
    }
}

