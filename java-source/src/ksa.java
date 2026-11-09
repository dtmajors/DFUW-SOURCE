/*
 * Decompiled with CFR.
 */
public class ksa
extends ksl {
    public static final int jyp = 1;
    public static final int jyq = 2;
    public static final int jyr = 4;
    public static final int jys = 8;
    public static final int jyt = 16;
    public static final int jyu = 32;
    public static final int jyf = 64;
    public static final int pZl = 128;
    private int jyv;
    private float jyw;
    private ldv Rs = new ldv(0L);
    private boolean jyy;
    private boolean jyz;
    private String jyA = "";
    private String fem = "";
    private String gnK = "";
    private String jyB = "";
    private String jyC = "";
    private String jyD = "";
    private boolean jyE;
    private float daN = 1.0f;

    ksa() {
        this.pZN = 4;
    }

    public int bZy() {
        return this.jyv;
    }

    public void Ln(int n) {
        this.jyv = n;
    }

    public float bZz() {
        return this.jyw;
    }

    public void jM(float f) {
        this.jyw = f;
    }

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }

    public boolean bZA() {
        return this.jyy;
    }

    public void mE(boolean bl) {
        this.jyy = bl;
    }

    public boolean bZB() {
        return this.jyz;
    }

    public void mF(boolean bl) {
        this.jyz = bl;
    }

    public String bZC() {
        return this.jyA;
    }

    public void lz(String string) {
        this.jyA = string;
    }

    public String bBt() {
        return this.fem;
    }

    public void jC(String string) {
        this.fem = string;
    }

    public String getXMLFileName() {
        return this.gnK;
    }

    public void setXMLFileName(String string) {
        this.gnK = string;
    }

    public String getVersion() {
        return this.jyB;
    }

    public void setVersion(String string) {
        this.jyB = string;
    }

    public String bZD() {
        return this.jyC;
    }

    public void lA(String string) {
        this.jyC = string;
    }

    public String bZE() {
        return this.jyD;
    }

    public void lB(String string) {
        this.jyD = string;
    }

    public boolean bZF() {
        return this.jyE;
    }

    public void mG(boolean bl) {
        this.jyE = bl;
    }

    public float getScale() {
        return this.daN;
    }

    public void setScale(float f) {
        this.daN = f;
    }
}

