/*
 * Decompiled with CFR.
 */
public class jod {
    public static final int nHa = 17;
    public static final int nHb = 18;
    public static final int nHc = 19;
    public static final int nHd = 20;
    public static final int nHe = 21;
    public static final int nHf = 22;
    public static final int nHg = 23;
    public static final int nHh = 24;
    public static final int nHi = 25;
    public static final int nHj = 26;
    public static final int nHk = 27;
    public static final int nHl = 28;
    public static final int nHm = 255;
    private ldv GUID;
    private String Name;
    private String nuL;
    private short nuN;
    private short nuM;
    private int Type;

    public ldv getGUID() {
        return this.GUID;
    }

    public void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    public String getProductName() {
        return this.nuL;
    }

    public void sY(String string) {
        this.nuL = string;
    }

    public int getType() {
        return this.Type & 0xFF;
    }

    public void setType(int n) {
        this.Type = n;
    }

    public short dOz() {
        return this.nuM;
    }

    public void e(short s) {
        this.nuM = s;
    }

    public short dOA() {
        return this.nuN;
    }

    public void f(short s) {
        this.nuN = s;
    }
}

