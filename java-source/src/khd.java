/*
 * Decompiled with CFR.
 */
public abstract class khd {
    public ldv GUID = null;
    public ldv ec = null;
    public boolean hsP = false;
    public boolean iBr = false;
    public int pse;
    protected boolean psf = true;
    protected boolean psg = false;

    public ldv dXh() {
        return this.ec;
    }

    public void d(khd khd2) {
        this.ec = khd2.ec;
        this.GUID = khd2.GUID;
        this.pse = khd2.pse;
        this.psf = khd2.psf;
        this.iBr = khd2.iBr;
        this.hsP = khd2.hsP;
        this.psg = khd2.psg;
    }

    public void ts(ldv ldv2) {
        this.ec = ldv2;
    }

    public ldv getGUID() {
        return this.GUID;
    }

    void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public int bUV() {
        return this.pse;
    }

    protected void Jv(int n) {
        this.pse = n;
    }

    public boolean dZd() {
        return this.psg;
    }

    public void wC(boolean bl) {
        this.psg = bl;
    }

    public void wD(boolean bl) {
        this.iBr = bl;
    }

    public boolean dZe() {
        return this.iBr;
    }

    public void wE(boolean bl) {
        this.psf = bl;
    }

    public boolean dZf() {
        return this.psf;
    }

    public void clear() {
    }

    public boolean bEA() {
        return this.hsP;
    }

    public void jM(boolean bl) {
        this.hsP = bl;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(1024);
        stringBuilder.append("[SFRequestBase:");
        stringBuilder.append("GUID=");
        stringBuilder.append(this.GUID);
        stringBuilder.append(",");
        stringBuilder.append("ReqType=");
        stringBuilder.append(this.Xn(this.pse));
        stringBuilder.append(",");
        stringBuilder.append("RequestingObjectGUID=");
        stringBuilder.append(this.ec.toString());
        stringBuilder.append(",");
        stringBuilder.append("Receipt=");
        stringBuilder.append(this.iBr);
        stringBuilder.append(",");
        stringBuilder.append("ConditionalReceipt=");
        stringBuilder.append(this.hsP);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public String Xn(int n) {
        return this.getClass().getSimpleName();
    }

    public static final String Xo(int n) {
        return null;
    }

    public final int dZg() {
        return this.pse & 0xFF;
    }

    protected static final int a(StringBuilder stringBuilder, int n, int n2, String string) {
        if ((n & n2) != 0) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append('+');
            }
            stringBuilder.append(string);
            n &= ~n2;
        }
        return n;
    }
}

