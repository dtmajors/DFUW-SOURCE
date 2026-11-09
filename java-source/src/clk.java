/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public enum clk {
    eIR(mcb.rXy),
    eIS(mcb.urq),
    eIT(mcb.see),
    eIU(mcb.urr),
    eIV(mcb.urs);

    private lox NameString = null;

    public boolean vA() {
        return this == eIV;
    }

    public lox Zv() {
        return this.NameString;
    }

    public String cu() {
        return this.NameString == null ? null : this.NameString.getIdentifier();
    }

    private clk(lox lox2) {
        this.NameString = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.NameString.bD(new Object[0]).exA() : super.toString();
    }

    public static clk getValueByOrdinal(int n) {
        return n < 0 || n >= clk.values().length ? eIR : clk.values()[n];
    }
}

