/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public enum bnj {
    dwi(mby.rXy),
    dwj(mby.uoS),
    dwk(mby.uoT),
    dwl(mby.uoU),
    dwm(mby.scW);

    private lox NameString = null;

    public boolean vA() {
        return this == dwm;
    }

    public lox Zv() {
        return this.NameString;
    }

    public String cu() {
        return this.NameString == null ? null : this.NameString.getIdentifier();
    }

    private bnj(lox lox2) {
        this.NameString = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.NameString.bD(new Object[0]).exA() : super.toString();
    }

    public static bnj getValueByOrdinal(int n) {
        return n < 0 || n >= bnj.values().length ? dwi : bnj.values()[n];
    }
}

