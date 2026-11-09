/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public enum bnn {
    dwr(mcd.rXy),
    dws(mcd.urO),
    dwt(mcd.urP),
    dwu(mcd.urQ),
    dwv(mcd.urR),
    dww(mcd.urS),
    dwx(mcd.urT),
    dwy(mcd.urU),
    dwz(mcd.scW);

    private lox NameString = null;

    public boolean vA() {
        return this == dwz;
    }

    public lox Zv() {
        return this.NameString;
    }

    public String cu() {
        return this.NameString == null ? null : this.NameString.getIdentifier();
    }

    private bnn(lox lox2) {
        this.NameString = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.NameString.bD(new Object[0]).exA() : super.toString();
    }

    public static bnn getValueByOrdinal(int n) {
        return n < 0 || n >= bnn.values().length ? dwr : bnn.values()[n];
    }
}

