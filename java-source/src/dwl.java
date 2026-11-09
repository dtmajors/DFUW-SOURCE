/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public enum dwl {
    hkb(lze.tRN),
    hkc(lze.tRO),
    hkd(lze.tRP),
    hke(lze.tic),
    hkf(lze.tRQ),
    hkg(lze.tRR),
    hkh(lze.tRS),
    hki(lze.tRT),
    hkj(lze.tRU),
    hkk(lze.tRV),
    hkl(lze.tRW);

    private lox DisplayName = null;

    public lox wp() {
        return this.DisplayName;
    }

    public String cu() {
        return this.DisplayName == null ? null : this.DisplayName.getIdentifier();
    }

    public loz bCQ() {
        return lcw.ena() || lcw.enb() ? this.DisplayName.bD(new Object[0]) : null;
    }

    private dwl(lox lox2) {
        this.DisplayName = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.DisplayName.bD(new Object[0]).exA() : super.toString();
    }

    public int bCR() {
        return dwh.bCC().c(this);
    }

    public int bCS() {
        return dwh.bCC().b(this);
    }

    public static dwl getValueByOrdinal(int n2) {
        return n2 < 0 || n2 >= dwl.values().length ? hkb : dwl.values()[n2];
    }
}

