/*
 * Decompiled with CFR.
 */
public class bbq {
    private double cRB = 0.0;
    private ldv cRC = null;
    private ldv cRD = null;
    private bbt cRE = null;

    public double akl() {
        return this.cRB;
    }

    public ldv akm() {
        return this.cRC;
    }

    public ldv akn() {
        return this.cRD;
    }

    public bbt ako() {
        return this.cRE;
    }

    private bbq() {
    }

    public static bbq a(double d2, ldv ldv2) {
        assert (ldv2 != null);
        bbq bbq2 = new bbq();
        bbq2.cRE = bbt.cRO;
        bbq2.cRC = ldv2;
        bbq2.cRD = ldv2;
        bbq2.cRB = d2;
        return bbq2;
    }

    public static bbq a(double d2, ldv ldv2, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        bbq bbq2 = new bbq();
        bbq2.cRE = bbt.cRM;
        bbq2.cRC = ldv2;
        bbq2.cRD = ldv3;
        bbq2.cRB = d2;
        return bbq2;
    }

    public static bbq b(double d2, ldv ldv2) {
        assert (ldv2 != null);
        bbq bbq2 = new bbq();
        bbq2.cRE = bbt.cRS;
        bbq2.cRC = ldv2;
        bbq2.cRD = ldv2;
        bbq2.cRB = d2;
        return bbq2;
    }

    public static bbq b(double d2, ldv ldv2, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        bbq bbq2 = new bbq();
        bbq2.cRE = bbt.cRN;
        bbq2.cRC = ldv2;
        bbq2.cRD = ldv3;
        bbq2.cRB = d2;
        return bbq2;
    }

    public static bbq c(double d2, ldv ldv2, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        bbq bbq2 = new bbq();
        bbq2.cRE = bbt.cRQ;
        bbq2.cRC = ldv2;
        bbq2.cRD = ldv3;
        bbq2.cRB = d2;
        return bbq2;
    }
}

