/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class lot
extends lop {
    private int jff = -1;

    public int bUf() {
        return this.jff;
    }

    @Override
    public boolean exp() {
        return lcw.ena() ? this.exx() : false;
    }

    public boolean exx() {
        return lcw.ena() ? lpd.rHs.BE("Quests.Tasks." + this.toString() + "_Instruction") != null : false;
    }

    public lot(int n, int n2) {
        super(n);
        this.jff = n2;
    }

    @Override
    public String toString() {
        return "questid" + this.qS() + "_taskid" + this.jff;
    }
}

