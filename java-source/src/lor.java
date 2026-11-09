/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class lor {
    private int rHe = -1;

    public int exw() {
        return this.rHe;
    }

    public boolean exp() {
        return lcw.ena() ? this.exq() || this.exr() : false;
    }

    public boolean exq() {
        return lcw.ena() ? lpd.rHs.BE("Quests.Lines." + this.toString() + "_Name") != null : false;
    }

    public boolean exr() {
        return lcw.ena() ? lpd.rHs.BE("Quests.Lines." + this.toString() + "_Description") != null : false;
    }

    public lor(int n) {
        this.rHe = n;
    }

    public String toString() {
        return "questlineid" + this.rHe;
    }
}

