/*
 * Decompiled with CFR.
 */
public class kyg {
    private int qiU = -1;
    private String qiV = null;
    private String qiW = null;
    private byte qiX = (byte)-1;
    private String qiY = null;

    public kyg(int n, String string, byte by, String string2) {
        this(n, string, null, by, string2);
    }

    public kyg(int n, String string, String string2, byte by, String string3) {
        this.qiU = n;
        this.qiV = string;
        this.qiW = string2;
        this.qiX = by;
        this.qiY = string3;
    }

    public int getLineNumber() {
        return this.qiU;
    }

    public int eiD() {
        return this.qiX;
    }

    public String eiE() {
        return this.qiV;
    }

    public String eiF() {
        return this.qiW;
    }

    public String eiG() {
        return this.qiY;
    }

    public String eiH() {
        if (this.qiU < 10) {
            return "000" + this.qiU;
        }
        if (this.qiU < 100) {
            return "00" + this.qiU;
        }
        if (this.qiU < 1000) {
            return "0" + this.qiU;
        }
        return "" + this.qiU;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFLogItem: ");
        stringBuilder.append(this.qiV);
        stringBuilder.append(" ");
        stringBuilder.append(this.qiW);
        stringBuilder.append(" ");
        stringBuilder.append("(");
        stringBuilder.append(lfn.rkl[this.qiX]);
        stringBuilder.append(")  ");
        stringBuilder.append(this.qiY);
        return stringBuilder.toString();
    }
}

