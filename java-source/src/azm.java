/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public final class azm
extends Enum<azm> {
    public static final /* enum */ azm cES = new azm(lpr.rTN);
    public static final /* enum */ azm cET = new azm(lpr.rTO);
    public static final /* enum */ azm cEU = new azm(lpr.rTP);
    public static final /* enum */ azm cEV = new azm(lpr.rTQ);
    public static final /* enum */ azm cEW = new azm(lpr.rTR);
    public static final /* enum */ azm cEX = new azm(lpr.rTS);
    public static final /* enum */ azm cEY = new azm(lpr.rTT);
    public static final /* enum */ azm cEZ = new azm(lpr.rTU);
    public static final /* enum */ azm cFa = new azm(lpr.rTV);
    private lox NameString = null;
    private static final /* synthetic */ azm[] cFb;

    public static azm[] values() {
        return (azm[])cFb.clone();
    }

    public static azm valueOf(String string) {
        return Enum.valueOf(azm.class, string);
    }

    public boolean jj(int n) {
        switch (this) {
            case cEV: 
            case cEY: {
                return n >= 0;
            }
            case cEW: 
            case cEX: 
            case cEZ: 
            case cFa: {
                return n <= 0;
            }
            case cES: {
                return n == 0;
            }
            case cEU: {
                return true;
            }
        }
        lfn.b(5, ((Object)((Object)this)).getClass().getSimpleName(), "validateAmount() : Unrecognised Clan-Points Transaction Type!!!... Somebody Forgot to Add a New Type to This Method!!!... Type = " + (Object)((Object)this));
        assert (false);
        return false;
    }

    public String cu() {
        return this.NameString == null ? null : this.NameString.getIdentifier();
    }

    private azm(lox lox2) {
        this.NameString = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.NameString.bD(new Object[0]).exA() : super.toString();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < azm.values().length;
    }

    public static azm getValueByOrdinal(int n) {
        return azm.isValidOrdinal(n) ? azm.values()[n] : null;
    }

    static {
        cFb = new azm[]{cES, cET, cEU, cEV, cEW, cEX, cEY, cEZ, cFa};
    }
}

