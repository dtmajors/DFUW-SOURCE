/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public final class bcv
extends Enum<bcv> {
    public static final /* enum */ bcv cXR = new bcv(maz.uhn);
    public static final /* enum */ bcv cXS = new bcv(maz.uho);
    public static final /* enum */ bcv cXT = new bcv(maz.udD);
    public static final /* enum */ bcv cXU = new bcv(maz.ubl);
    public static final /* enum */ bcv cXV = new bcv(maz.uhp);
    public static final /* enum */ bcv cXW = new bcv(maz.uex);
    public static final /* enum */ bcv cXX = new bcv(maz.tYT);
    public static final /* enum */ bcv cXY = new bcv(maz.uhq);
    public static final /* enum */ bcv cXZ = new bcv(maz.uhr);
    private lox DisplayName = null;
    private static bcv[] cYa;
    private static final /* synthetic */ bcv[] cYb;

    public static bcv[] values() {
        return (bcv[])cYb.clone();
    }

    public static bcv valueOf(String string) {
        return Enum.valueOf(bcv.class, string);
    }

    public String cu() {
        return this.DisplayName == null ? null : this.DisplayName.getIdentifier();
    }

    private bcv(lox lox2) {
        this.DisplayName = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.DisplayName.bD(new Object[0]).exA() : super.toString();
    }

    public static final int getValueCount() {
        return cYa.length;
    }

    public static final bcv getValueByOrdinal(int n) {
        if (n < 0 || n >= bcv.getValueCount()) {
            assert (false);
            return cXR;
        }
        return cYa[n];
    }

    static {
        cYb = new bcv[]{cXR, cXS, cXT, cXU, cXV, cXW, cXX, cXY, cXZ};
        cYa = (bcv[])bcv.class.getEnumConstants();
    }
}

