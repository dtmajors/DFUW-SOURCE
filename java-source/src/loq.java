/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class loq
extends lop {
    private int bbL = -1;

    public int xf() {
        return this.bbL;
    }

    @Override
    public boolean exp() {
        return lcw.ena() ? this.exq() || this.exr() : false;
    }

    @Override
    public boolean exq() {
        return this.exs() && this.ext();
    }

    public boolean exs() {
        return lcw.ena() ? lpd.rHs.BE("Quests.Items." + this.toString() + "_NameLocked") != null : false;
    }

    public boolean ext() {
        return lcw.ena() ? lpd.rHs.BE("Quests.Items." + this.toString() + "_NameUnlocked") != null : false;
    }

    @Override
    public boolean exr() {
        return this.exu() && this.exv();
    }

    public boolean exu() {
        return lcw.ena() ? lpd.rHs.BE("Quests.Items." + this.toString() + "_DescriptionLocked") != null : false;
    }

    public boolean exv() {
        return lcw.ena() ? lpd.rHs.BE("Quests.Items." + this.toString() + "_DescriptionUnlocked") != null : false;
    }

    public loq(int n, int n2) {
        super(n);
        this.bbL = n2;
    }

    @Override
    public String toString() {
        return "questid" + this.qS() + "_itemid" + this.bbL;
    }
}

