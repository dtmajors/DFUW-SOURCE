/*
 * Decompiled with CFR.
 */
public class jne
extends jnc {
    private String iKc = null;

    public boolean dNb() {
        return this.dMW().equals("<self>");
    }

    public String dNc() {
        return this.iKc;
    }

    private jne(double d2, long l, String string, hc hc2, ldv ldv2, String string2, aud.a a2, String string3) {
        super(jnd.nDj, d2, l, string, hc2, ldv2, a2, string3);
        this.iKc = string2;
    }

    public static jne d(double d2, long l, egz egz2) {
        if (egz2 == null) {
            return null;
        }
        return new jne(d2, l, egz2.ipL, hc.getAccessLevelType(egz2.ipR), egz2.Ri, egz2.ipM, aud.a.getValue(egz2.ipK), egz2.ipN);
    }
}

