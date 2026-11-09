/*
 * Decompiled with CFR.
 */
public class kxy {
    public static final int qir = 1;
    public static final int qis = 2;
    public static final int qit = 3;
    private int qiu = 0;
    private String qiv = null;
    private String qiw = "";
    private String qix = "";
    private kxy qiy = null;

    public int eiv() {
        return this.qiu;
    }

    public void abh(int n) {
        this.qiu = n;
    }

    public String eiw() {
        return this.qiv;
    }

    public void xA(String string) {
        this.qiv = string;
    }

    public String eix() {
        return this.qiw;
    }

    public void xB(String string) {
        this.qiw = string;
    }

    public String eiy() {
        return this.qix;
    }

    public void xC(String string) {
        this.qix = string;
    }

    public kxy eiz() {
        return this.qiy;
    }

    public void c(kxy kxy2) {
        this.qiy = kxy2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFFunctionTerm: TermName='");
        stringBuilder.append(this.qiv);
        stringBuilder.append("' CodeString='");
        stringBuilder.append(this.qiw);
        stringBuilder.append("' DebugString='");
        stringBuilder.append(this.qix);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

