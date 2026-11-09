/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lkv
 */
public class bwv {
    public final int aWe;
    public final double dXe;

    private bwv() {
        this.aWe = 0;
        this.dXe = 0.0;
    }

    public String getName() {
        return lkv.adr((int)this.aWe);
    }

    public bwv(int n, double d2) {
        this.aWe = n;
        this.dXe = d2;
    }

    public String toString() {
        return "[" + String.format("%1.2f", this.dXe) + "] " + this.getName();
    }
}

