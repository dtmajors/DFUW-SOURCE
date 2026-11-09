/*
 * Decompiled with CFR.
 */
public class kjv
extends kjx {
    public static int pFG = 1;
    public static int iHB = 2;
    public static int pFH = 4;
    public static int pFI = 8;
    public static int iGB = 16;
    public static int goA = 32;
    public static int goz = 64;
    public static int pFJ = 128;
    private int pFK;
    private boolean pFL;
    private float pFM;
    private lcq pFN;
    private ljq gSf;
    private String gSa;
    private lgl Rotation;
    private ljq Position;

    kjv() {
        this.Jv(1806);
    }

    public int ebJ() {
        return this.pFK;
    }

    public void Yq(int n) {
        this.pFK = n;
    }

    public float blQ() {
        return this.pFM;
    }

    public void go(float f) {
        this.pFM = f;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public boolean blR() {
        return this.pFL;
    }

    public void hR(boolean bl) {
        this.pFL = bl;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public ljq blS() {
        return this.gSf;
    }

    public void bM(ljq ljq2) {
        this.gSf = ljq2;
    }

    public lcq blT() {
        return this.pFN;
    }

    public void l(lcq lcq2) {
        this.pFN = lcq2;
    }

    public String blU() {
        return this.gSa;
    }

    public void iL(String string) {
        this.gSa = string;
    }
}

