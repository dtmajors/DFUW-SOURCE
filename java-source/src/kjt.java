/*
 * Decompiled with CFR.
 */
public class kjt
extends kjx {
    public static final int iGy = 1;
    public static final int iGz = 2;
    public static final int iGA = 4;
    public static final int goA = 8;
    public static final int iGB = 16;
    private int pFC = 0;
    private ljq tu;
    private ljq my;
    private float daN;
    private String[] gRK;

    kjt() {
        this.Jv(1799);
        this.tu = new ljq();
        this.my = new ljq();
        this.gRK = new String[]{"."};
    }

    public int ebG() {
        return this.pFC;
    }

    public void Yp(int n) {
        this.pFC = n;
    }

    public ljq fb() {
        return this.tu;
    }

    public void K(ljq ljq2) {
        this.tu = ljq2;
    }

    public ljq getRotation() {
        return this.my;
    }

    public void setRotation(ljq ljq2) {
        this.my = ljq2;
    }

    public float getScale() {
        return this.daN;
    }

    public void setScale(float f) {
        this.daN = f;
    }

    public String[] buY() {
        return this.gRK;
    }

    public void m(String[] stringArray) {
        this.gRK = stringArray;
    }
}

