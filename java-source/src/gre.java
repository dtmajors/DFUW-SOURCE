/*
 * Decompiled with CFR.
 */
public class gre
extends grb {
    public static final int jpY = 1;
    public static final int jpZ = 2;
    public static final int jqa = 3;
    public static final int jqb = 4;
    public int iHL = 0;
    public int jqc = 0;
    public int jqd = -1;
    public ldv jqe = null;
    public ldv jqf = null;

    gre() {
        super(11034);
        this.jM(false);
    }

    public final int bNX() {
        return this.iHL;
    }

    public final void Gi(int n) {
        this.iHL = n;
    }

    public final int bWR() {
        return this.jqc;
    }

    public final void Kw(int n) {
        this.jqc = n;
    }

    public int bWS() {
        return this.jqd;
    }

    public void Kx(int n) {
        this.jqd = n;
    }

    public final ldv bWT() {
        return this.jqe;
    }

    public final void qx(ldv ldv2) {
        this.jqe = ldv2;
    }

    public final ldv bWU() {
        return this.jqf;
    }

    public final void qy(ldv ldv2) {
        this.jqf = ldv2;
    }

    public static final String Ky(int n) {
        switch (n) {
            case 1: {
                return "Receiving Object Not Found";
            }
            case 2: {
                return "Receiving OS Not Found";
            }
            case 3: {
                return "Outgoing Check Returned Null";
            }
            case 4: {
                return "Incoming Check Returned Null";
            }
        }
        return "Unknown ErrorType: " + n;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" '");
        stringBuilder.append(gre.Ky(this.iHL));
        stringBuilder.append("' FailedMessageType=");
        stringBuilder.append(this.jqc);
        stringBuilder.append(" FailedMessageTag=");
        stringBuilder.append(this.jqd);
        stringBuilder.append(" FailedFromGUID=");
        stringBuilder.append(this.jqe);
        stringBuilder.append(" FailedToGUID=");
        stringBuilder.append(this.jqf);
        return stringBuilder.toString();
    }
}

