/*
 * Decompiled with CFR.
 */
public abstract class dxh {
    private int Type = 0;
    private ldv GUID = null;
    private ldv Rs = null;
    private double oV = 0.0;
    private double hmY = 0.0;
    private double eNV = 0.0;

    public int getType() {
        return this.Type;
    }

    public void setType(int n2) {
        this.Type = n2;
    }

    public ldv getGUID() {
        return this.GUID;
    }

    public void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }

    public double aAw() {
        return this.oV;
    }

    public void o(double d2) {
        this.oV = d2;
    }

    public double bEd() {
        return this.hmY;
    }

    public void ca(double d2) {
        this.hmY = d2;
    }

    public double bjB() {
        return this.eNV;
    }

    public void by(double d2) {
        this.eNV = d2;
    }

    public String toString() {
        assert (this.Type > 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": Type='");
        stringBuilder.append(dxj.CU(this.Type));
        stringBuilder.append("' GUID=");
        stringBuilder.append(this.GUID);
        stringBuilder.append(" ObjectGUID=");
        stringBuilder.append(this.Rs);
        stringBuilder.append(" TimeOut=");
        stringBuilder.append(this.hmY);
        stringBuilder.append(" TimerLength=");
        stringBuilder.append(this.eNV);
        return stringBuilder.toString();
    }
}

