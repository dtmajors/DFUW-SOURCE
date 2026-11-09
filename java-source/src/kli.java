/*
 * Decompiled with CFR.
 */
public class kli
extends kld {
    public static final int pIF = 1;
    public static final int pIG = 2;
    public static final int pIH = 16;
    public static final int pII = 32;
    public static final int pIJ = 64;
    public static final int pIK = 128;
    public static final int pIL = 256;
    public static final int pIM = 512;
    public static final int pIN = 1024;
    private int Type = 0;
    private int[] pIO = null;
    private boolean pIP = false;
    private boolean dUV = false;
    private boolean dVa;
    private boolean dVb;
    private int dVc;
    private ljq Position = null;
    private lgl Rotation = null;
    private boolean dVd;
    private boolean dVe;
    public int pCY = 0;
    private int dVf;
    private float dVg;
    private float Radius;
    private int pIQ = 10;
    private ljq dVh = null;
    private float dVi;

    public kli() {
        this.Jv(1037);
    }

    public int getType() {
        return this.Type;
    }

    public void setType(int n) {
        this.Type = n;
    }

    public int[] ecG() {
        return this.pIO;
    }

    public void aM(int[] nArray) {
        this.pIO = nArray;
    }

    public void eU(boolean bl) {
        this.dUV = bl;
    }

    public boolean ecH() {
        return this.dUV;
    }

    public void eY(boolean bl) {
        this.dVa = bl;
    }

    public boolean ecI() {
        return this.dVa;
    }

    public void wY(boolean bl) {
        this.dVb = bl;
    }

    public boolean ecJ() {
        return this.dVb;
    }

    public void YO(int n) {
        this.dVc = n;
    }

    public int ecK() {
        return this.dVc;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public ljq av() {
        return this.Position;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void YP(int n) {
        this.dVf = n;
    }

    public int ecL() {
        return this.dVf;
    }

    public void mx(float f) {
        this.dVg = f;
    }

    public float ecM() {
        return this.dVg;
    }

    public void wZ(boolean bl) {
        this.dVd = bl;
    }

    public boolean ecN() {
        return this.dVd;
    }

    public void xa(boolean bl) {
        this.dVe = bl;
    }

    public boolean ecO() {
        return this.dVe;
    }

    public void setRadius(float f) {
        this.Radius = f;
    }

    public float getRadius() {
        return this.Radius;
    }

    public void YQ(int n) {
        this.pIQ = n;
    }

    public int ecP() {
        return this.pIQ;
    }

    public void bg(ljq ljq2) {
        this.dVh = ljq2;
    }

    public ljq aBz() {
        return this.dVh;
    }

    public void my(float f) {
        this.dVi = f;
    }

    public float ecQ() {
        return this.dVi;
    }

    public final boolean ecR() {
        return this.pIP;
    }

    public final void xb(boolean bl) {
        this.pIP = bl;
    }
}

