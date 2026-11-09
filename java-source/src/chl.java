/*
 * Decompiled with CFR.
 */
public class chl
extends che {
    public cja eAa;
    public int eAb = -1;

    public chl() {
        this.ezL = cgi.GUI;
    }

    public boolean aL(int n, int n2) {
        if (this.eAa.ordinal() != n) {
            return false;
        }
        return this.eAb == -1 || this.eAb == n2;
    }
}

