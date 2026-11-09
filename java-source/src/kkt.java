/*
 * Decompiled with CFR.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class kkt
extends kld {
    public static final int pGN = 0;
    public static final int pGO = 1;
    public static final int pGP = 2;
    public static final int pGQ = 3;
    protected int pGR = 0;
    protected int pGS = 300;
    protected float pGT = 10.0f;
    protected float pGU = 5.0f;
    protected String Texture = null;
    protected ljq Position = null;
    protected float pGV = 1.0f;
    protected ljq pGW = null;
    protected ljq pGX = null;
    protected int pGY = 0;

    public kkt() {
        this.Jv(1048);
    }

    public int eci() {
        return this.pGR;
    }

    public void YC(int n) {
        this.pGR = n;
    }

    public int ecj() {
        return this.pGS;
    }

    public void YD(int n) {
        this.pGS = n;
    }

    public float eck() {
        return this.pGT;
    }

    public void mv(float f) {
        this.pGT = f;
    }

    public float ecl() {
        return this.pGU;
    }

    public void mw(float f) {
        this.pGU = f;
    }

    public String aJ() {
        return this.Texture;
    }

    public void E(String string) {
        this.Texture = string;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public float getSize() {
        return this.pGV;
    }

    public void setSize(float f) {
        this.pGV = f;
    }

    public ljq ecm() {
        return this.pGW;
    }

    public void do(ljq ljq2) {
        this.pGW = ljq2;
    }

    public ljq ecn() {
        return this.pGX;
    }

    public void dp(ljq ljq2) {
        this.pGX = ljq2;
    }

    public int eco() {
        return this.pGY;
    }

    public void YE(int n) {
        this.pGY = n;
    }
}

