/*
 * Decompiled with CFR.
 */
public class jnc
extends jmz {
    private String nDd = null;
    private hc nDe = hc.aaz;
    private ldv nDf = null;
    private aud.a nDg = aud.a.cas;
    private String ipN = null;

    public String dMW() {
        return this.nDd;
    }

    public hc dMX() {
        return this.nDe;
    }

    public ldv dMY() {
        return this.nDf;
    }

    public aud.a dMZ() {
        return this.nDg;
    }

    public String dNa() {
        return this.ipN;
    }

    private jnc(double d2, long l, String string, hc hc2, ldv ldv2, aud.a a2, String string2) {
        this(jnd.nDh, d2, l, string, hc2, ldv2, a2, string2);
    }

    protected jnc(jnd jnd2, double d2, long l, String string, hc hc2, ldv ldv2, aud.a a2, String string2) {
        super(jnd2, d2, l);
        this.nDd = string;
        this.nDe = hc2;
        this.nDf = ldv2;
        this.nDg = a2;
        this.ipN = string2;
    }

    public static jnc c(double d2, long l, egz egz2) {
        if (egz2 == null) {
            return null;
        }
        return new jnc(d2, l, egz2.ipL, hc.getAccessLevelType(egz2.ipR), egz2.Ri, aud.a.getValue(egz2.ipK), egz2.ipN);
    }
}

