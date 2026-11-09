/*
 * Decompiled with CFR.
 */
public class hap
extends hac {
    public static final int jyp = 1;
    public static final int jyq = 2;
    public static final int jyr = 4;
    public static final int jys = 8;
    public static final int jyt = 16;
    public static final int jyu = 32;
    private int jyv;
    private float jyw;
    private ldv jyx;
    private boolean jyy;
    private boolean jyz;
    private String jyA;
    private String fem;
    private String gnK;
    private String jyB;
    private String jyC;
    private String jyD;
    private boolean jyE;
    private float daN = 1.0f;
    private boolean jyF;
    private boolean jyG = false;
    private boolean jyH = false;
    private int jyI = 0;
    private jrw jyJ = null;

    hap() {
        super(4107);
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

    public void jM(float f2) {
        this.jyw = f2;
    }

    @Override
    public ldv oq() {
        return this.jyx;
    }

    public void qO(ldv ldv2) {
        this.jyx = ldv2;
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

    public jrw bZG() {
        return this.jyJ;
    }

    public void e(jrw jrw2) {
        this.jyJ = jrw2;
    }

    public boolean bZH() {
        return this.jyH;
    }

    public void mH(boolean bl) {
        this.jyH = bl;
    }

    public float getScale() {
        return this.daN;
    }

    public void setScale(float f2) {
        this.daN = f2;
    }

    public boolean bZI() {
        return this.jyF;
    }

    public void mI(boolean bl) {
        this.jyF = bl;
    }

    public boolean bZJ() {
        return this.jyG;
    }

    public void mJ(boolean bl) {
        this.jyG = bl;
    }
}

