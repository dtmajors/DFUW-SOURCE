/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hph
extends hpk {
    public hph(hdm hdm2, String string, lgg lgg2, lhf lhf2, hpe.c c2, double d2) {
        super(hdm2, string, lgg2, lhf2, c2, hph.cV(d2), new String[0], null);
    }

    public hph(hdm hdm2, String string, lgg lgg2, lhf lhf2, hpe.c c2, double d2, String string2, hnt.a a2) {
        super(hdm2, string, lgg2, lhf2, c2, hph.cV(d2), string2, a2);
    }

    public void cU(double d2) {
        this.mV(hph.cV(d2));
    }

    private static String cV(double d2) {
        int n = (int)d2;
        int n2 = 0;
        if (n >= 60) {
            n2 = n / 60;
            n %= 60;
        }
        int n3 = 0;
        if (n2 >= 60) {
            n3 = n2 / 60;
            n2 %= 60;
        }
        String string = (n3 < 10 ? "0" : "") + Integer.toString(n3);
        String string2 = (n2 < 10 ? "0" : "") + Integer.toString(n2);
        String string3 = (n < 10 ? "0" : "") + Integer.toString(n);
        String string4 = string + ":" + string2 + ":" + string3;
        return string4;
    }
}

