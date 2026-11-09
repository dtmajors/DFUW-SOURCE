/*
 * Decompiled with CFR.
 */
public class ksj
extends ksl {
    public static final int pZx = 1;
    public static final int pZy = 2;
    public static final int pZz = 4;
    public static final int pZA = 8;
    public static final int pZB = 16;
    public static final int pZC = 32;
    public static final int pZD = 64;
    public static final int pZE = 128;
    public static final int pZF = 256;
    public static final int iWA = 512;
    public static final int pZG = 1024;
    public static final int pZH = 2048;
    public static final int pZI = 4096;
    public static final int pZJ = 8192;
    public static final int pZK = 16384;
    public static final int pZL = 32768;
    public static final int pZM = 65536;
    private int jzh;
    public String fFC;
    public String ctI;
    public String dBL;
    public String jzi;
    public String jzj;
    public String jzk;
    public String jzl;
    public String jzm;
    private boolean jxk;

    ksj() {
        this.pZN = 12;
    }

    public String caa() {
        return this.jzi;
    }

    public void lI(String string) {
        this.jzi = string;
    }

    public String cab() {
        return this.jzj;
    }

    public void lJ(String string) {
        this.jzj = string;
    }

    public String cac() {
        return this.jzl;
    }

    public void lK(String string) {
        this.jzl = string;
    }

    public String cad() {
        return this.jzm;
    }

    public void lL(String string) {
        this.jzm = string;
    }

    public String cae() {
        return this.jzk;
    }

    public void lM(String string) {
        this.jzk = string;
    }

    public String getMeshName() {
        return this.ctI;
    }

    public void setMeshName(String string) {
        this.ctI = string;
    }

    public int caf() {
        return this.jzh;
    }

    public void Lu(int n) {
        this.jzh = n;
    }

    public String aHa() {
        return this.dBL;
    }

    public void gW(String string) {
        this.dBL = string;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public boolean bYT() {
        return this.jxk;
    }

    public void my(boolean bl) {
        this.jxk = bl;
    }
}

