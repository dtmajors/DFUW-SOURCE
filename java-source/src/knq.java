/*
 * Decompiled with CFR.
 */
public class knq
extends knt {
    public static final int pQG = 1;
    public static final int pQH = 2;
    public static final int pQI = 0;
    public static final int pQJ = 100;
    public static final int pQK = 200;
    public static final int pQL = 300;
    public static final int pQM = 400;
    public static final int pQN = 500;
    public static final int pQO = 600;
    public static final int pQP = 700;
    public static final int pQQ = 800;
    public static final int pQR = 900;
    public static final int pQS = 0;
    public static final int pQT = 1;
    public static final int pQU = 2;
    public int pQV;
    public String pQW;
    public int dOX;
    public int dOW;
    public int dOY;
    public boolean kNd;

    knq() {
        this.Jv(261);
    }

    public void a(knq knq2) {
        this.pQV = knq2.pQV;
        this.pQW = knq2.pQW;
        this.dOX = knq2.dOX;
        this.dOW = knq2.dOW;
        this.dOY = knq2.dOY;
        this.kNd = knq2.kNd;
        super.c(knq2);
    }

    public int eej() {
        return this.pQV;
    }

    public void Zw(int n) {
        this.pQV = n;
    }

    public String blk() {
        return this.pQW;
    }

    public void iK(String string) {
        this.pQW = string;
    }

    public int bll() {
        return this.dOX;
    }

    public void zY(int n) {
        this.dOX = n;
    }

    public int blm() {
        return this.dOW;
    }

    public void zZ(int n) {
        this.dOW = n;
    }

    public int bln() {
        return this.dOY;
    }

    public void Aa(int n) {
        this.dOY = n;
    }

    public boolean isItalic() {
        return this.kNd;
    }

    public void hL(boolean bl) {
        this.kNd = bl;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(1024);
        stringBuilder.append("{SF2DFontRequest: super=");
        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append("FontRequestType=");
        stringBuilder.append(knq.Zx(this.pQV));
        stringBuilder.append(",");
        stringBuilder.append("TheFont=");
        stringBuilder.append(this.pQW);
        stringBuilder.append(",");
        stringBuilder.append("FontSize=");
        stringBuilder.append(this.dOX);
        stringBuilder.append(",");
        stringBuilder.append("FontWeight=");
        stringBuilder.append(this.dOW);
        stringBuilder.append(",");
        stringBuilder.append("FontPitch=");
        stringBuilder.append(this.dOY);
        stringBuilder.append(",");
        stringBuilder.append("Italic=");
        stringBuilder.append(this.kNd);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private static String Zx(int n) {
        StringBuilder stringBuilder = new StringBuilder(1024);
        if ((n = knq.a(stringBuilder, n, 1, "FONT_NEW")) != 0) {
            assert (false) : n;
            stringBuilder.append("+" + n);
        }
        return stringBuilder.toString();
    }
}

