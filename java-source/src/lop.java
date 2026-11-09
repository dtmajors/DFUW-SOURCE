/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class lop {
    private int aDf = -1;

    public int qS() {
        return this.aDf;
    }

    public boolean exp() {
        return lcw.ena() ? this.exq() || this.exr() : false;
    }

    public boolean exq() {
        return lcw.ena() ? lpd.rHs.BE("Quests." + this.toString() + "_Name") != null : false;
    }

    public boolean exr() {
        return lcw.ena() ? lpd.rHs.BE("Quests." + this.toString() + "_Description") != null : false;
    }

    public lop(int n) {
        this.aDf = n;
    }

    public String toString() {
        return "questid" + this.aDf;
    }
}

