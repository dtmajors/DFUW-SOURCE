/*
 * Decompiled with CFR.
 */
public class lgd {
    private int rlF = -1;
    private ljq dZ = null;

    public lgd() {
    }

    public lgd(int n, ljq ljq2) {
        this.rlF = n;
        this.dZ = ljq2;
    }

    public int eqD() {
        return this.rlF;
    }

    public void acH(int n) {
        this.rlF = n;
    }

    public ljq eqE() {
        return this.dZ;
    }

    public void eo(ljq ljq2) {
        this.dZ = ljq2;
    }

    public String toString() {
        return "Place: " + this.rlF + ", Coords: " + this.dZ;
    }
}

