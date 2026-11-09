/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public enum ayb {
    cvi(lpt.rUa),
    cvj(lpt.rUb),
    cvk(lpt.rUc);

    private lox NameString = null;

    public lox Zv() {
        return this.NameString;
    }

    public String cu() {
        return this.NameString == null ? null : this.NameString.getIdentifier();
    }

    private ayb(lox lox2) {
        this.NameString = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.NameString.bD(new Object[0]).exA() : super.toString();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < ayb.values().length;
    }

    public static ayb getValueByOrdinal(int n) {
        return ayb.isValidOrdinal(n) ? ayb.values()[n] : cvi;
    }
}

