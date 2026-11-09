/*
 * Decompiled with CFR.
 */
public class jna
extends jnc {
    private String nDa = null;
    private bbs nDb = null;

    public String dMT() {
        return this.nDa;
    }

    public bbs dMU() {
        return this.nDb;
    }

    private jna(double d2, long l, String string, hc hc2, ldv ldv2, String string2, bbs bbs2, aud.a a2, String string3) {
        super(jnd.nDi, d2, l, string, hc2, ldv2, a2, string3);
        this.nDa = string2;
        this.nDb = bbs2;
    }

    public static jna b(double d2, long l, egz egz2) {
        if (egz2 == null) {
            return null;
        }
        return new jna(d2, l, egz2.ipL, hc.getAccessLevelType(egz2.ipR), egz2.Ri, egz2.ipP, bbs.getValueByOrdinal(egz2.ipQ), aud.a.getValue(egz2.ipK), egz2.ipN);
    }
}

