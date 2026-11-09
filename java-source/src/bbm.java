/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public enum bbm {
    cQV(mbd.uhn),
    cQW(mbd.uho),
    cQX(mbd.uih),
    cQY(mbd.uii),
    cQZ(mbd.uij),
    cRa(mbd.uik),
    cRb(mbd.udD),
    cRc(mbd.ubl),
    cRd(mbd.uhp),
    cRe(mbd.uil),
    cRf(mbd.uim),
    cRg(mbd.uin),
    cRh(mbd.uaB),
    cRi(mbd.uex),
    cRj(mbd.uio);

    private lox NameString = null;
    private static bbm[] cRk;

    public String cu() {
        return this.NameString == null ? null : this.NameString.getIdentifier();
    }

    private bbm(lox lox2) {
        this.NameString = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.NameString.bD(new Object[0]).exA() : super.toString();
    }

    public static final int getValueCount() {
        return cRk.length;
    }

    public static final bbm getValueByOrdinal(int n) {
        return cRk[n];
    }

    static {
        cRk = (bbm[])bbm.class.getEnumConstants();
    }
}

