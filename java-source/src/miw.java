/*
 * Decompiled with CFR.
 */
public class miw {
    protected final int Type;
    private ldv nUB;
    private ldv nTN;
    private int iXS;
    private String aMH;

    private miw() {
        this.Type = 0;
    }

    protected miw(int n) {
        this.Type = n;
    }

    public int getErrorCode() {
        return this.iXS;
    }

    public void JY(int n) {
        this.iXS = n;
    }

    public String getErrorMessage() {
        return this.aMH;
    }

    public void ky(String string) {
        this.aMH = string;
    }

    public ldv dRt() {
        return this.nTN;
    }

    public void tk(ldv ldv2) {
        this.nTN = ldv2;
    }

    public ldv dRH() {
        return this.nUB;
    }

    public void tl(ldv ldv2) {
        this.nUB = ldv2;
    }

    public int getType() {
        return this.Type;
    }

    public String toString() {
        return this.getClass().getSimpleName() + ": ResponseGuid=" + this.nUB + ", RequestingObjectGuid=" + this.nTN + ", ErrorCode=" + this.iXS;
    }
}

