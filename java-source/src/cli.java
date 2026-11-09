/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public enum cli {
    eII(mca.rXy),
    eIJ(mca.url),
    eIK(mca.urm),
    eIL(mca.urn),
    eIM(mca.see),
    eIN(mca.uro),
    eIO(mca.scW);

    private lox NameString = null;

    public boolean vA() {
        return this == eIO;
    }

    public lox Zv() {
        return this.NameString;
    }

    public String cu() {
        return this.NameString == null ? null : this.NameString.getIdentifier();
    }

    private cli(lox lox2) {
        this.NameString = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.NameString.bD(new Object[0]).exA() : super.toString();
    }

    public static cli getValueByOrdinal(int n) {
        return n < 0 || n >= cli.values().length ? eII : cli.values()[n];
    }
}

