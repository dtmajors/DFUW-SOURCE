/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class los
extends lop {
    private int di = -1;

    public int ib() {
        return this.di;
    }

    @Override
    public boolean exp() {
        return lcw.ena() ? this.exx() || this.exy() : false;
    }

    public boolean exx() {
        return lcw.ena() ? lpd.rHs.BE("Quests.Nodes." + this.toString() + "_Instruction") != null : false;
    }

    public boolean exy() {
        return lcw.ena() ? lpd.rHs.BE("Quests.Nodes." + this.toString() + "_JournalEntry") != null : false;
    }

    public los(int n, int n2) {
        super(n);
        this.di = n2;
    }

    @Override
    public String toString() {
        return "questid" + this.qS() + "_nodeid" + this.di;
    }
}

