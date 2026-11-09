/*
 * Decompiled with CFR.
 */
public class ktv {
    protected int qbN = 0;
    public ldv ec = null;
    public ldv ev = null;
    public ldv dJs = null;
    public int ew = -1;

    public int egT() {
        return this.qbN;
    }

    protected void EQ(int n) {
        this.qbN = n;
    }

    public ldv dXh() {
        return this.ec;
    }

    public void ts(ldv ldv2) {
        this.ec = ldv2;
    }

    public ldv dXg() {
        return this.ev;
    }

    public void tr(ldv ldv2) {
        this.ev = ldv2;
    }

    public ldv axa() {
        return this.dJs;
    }

    public void ju(ldv ldv2) {
        this.dJs = ldv2;
    }

    public void reset() {
    }

    public int getResult() {
        return this.ew;
    }

    public void DR(int n) {
        this.ew = n;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(1024);
        stringBuilder.append("[SFResponseBase:");
        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append("RequestingObjectGUID=");
        stringBuilder.append(this.ec);
        stringBuilder.append(",");
        stringBuilder.append("RequestGUID=");
        stringBuilder.append(this.dXg());
        stringBuilder.append(",");
        stringBuilder.append("EngineGUID=");
        stringBuilder.append(this.axa());
        stringBuilder.append(",");
        stringBuilder.append("Result=");
        stringBuilder.append(ldk.getName(this.ew));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

