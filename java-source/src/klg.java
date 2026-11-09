/*
 * Decompiled with CFR.
 */
public class klg
extends kld {
    public static final int iWI = 1;
    public static final int iWJ = 2;
    public static final int iWK = 4;
    public static final int iWL = 8;
    public static final int iWM = 16;
    public static final int iWN = 32;
    public static final int iWO = 64;
    public static final int iWP = 128;
    private int pIE = 0;
    private ljq iWR = new ljq();
    private ljq my = new ljq();
    private lgl iWS = new lgl();
    private float mh = 0.0f;

    klg() {
        this.Jv(1032);
    }

    public int ecF() {
        return this.pIE;
    }

    public void YN(int n) {
        this.pIE = n;
    }

    public ljq bSh() {
        return this.iWR;
    }

    public void cL(ljq ljq2) {
        this.iWR = ljq2;
    }

    public ljq getRotation() {
        return this.my;
    }

    public void setRotation(ljq ljq2) {
        this.my = ljq2;
    }

    public lgl bSi() {
        return this.iWS;
    }

    public void M(lgl lgl2) {
        this.iWS = lgl2;
    }

    public float OF() {
        return this.mh;
    }

    public void fG(float f) {
        this.mh = f;
    }
}

