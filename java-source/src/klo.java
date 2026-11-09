/*
 * Decompiled with CFR.
 */
public class klo
extends klp {
    public static final int iYd = 1;
    public static final int iYe = 2;
    public static final int pJj = 4;
    public static final int pJk = 8;
    public static final int pJl = 16;
    public static final int iYB = 32;
    public static final int iYC = 64;
    public static final int iYD = 128;
    public static final int iYE = 256;
    public static final int iYU = 512;
    public static final int iYV = 1024;
    public static final int pJm = 2048;
    public static final int pJn = 4096;
    public static final int pnG = 8192;
    public static final int pJo = 16384;
    private String fFC;
    private int pJp;
    private ljq pJq;
    private float grZ;
    private int grQ;
    private float doW;
    private float doX;
    private float gsw;
    private float gsx;
    private lcq eoo;
    private lcq eop;
    private boolean pJr;
    private float pJs = 0.0f;
    float aZE;
    float gsZ;

    public klo() {
        this.Jv(2564);
    }

    public void a(klo klo2) {
        this.fFC = klo2.fFC;
        this.pJp = klo2.pJp;
        this.pJq = klo2.pJq;
        this.grZ = klo2.grZ;
        this.grQ = klo2.grQ;
        this.doW = klo2.doW;
        this.doX = klo2.doX;
        this.gsw = klo2.gsw;
        this.gsx = klo2.gsx;
        this.eoo = klo2.eoo;
        this.eop = klo2.eop;
        this.pJr = klo2.pJr;
        this.aZE = klo2.aZE;
        this.gsZ = klo2.gsZ;
        this.pJs = klo2.pJs;
        super.a(klo2);
    }

    public lcq getEndColor() {
        return this.eop;
    }

    public void setEndColor(lcq lcq2) {
        this.eop = lcq2;
    }

    public float getEndRotation() {
        return this.gsx;
    }

    public void setEndRotation(float f) {
        this.gsx = f;
    }

    public float getEndScale() {
        return this.doX;
    }

    public void setEndScale(float f) {
        this.doX = f;
    }

    public int edb() {
        return this.pJp;
    }

    public void YW(int n) {
        this.pJp = n;
    }

    public int getNumTextures() {
        return this.grQ;
    }

    public void setNumTextures(int n) {
        this.grQ = n;
    }

    public float getParticleLifeTime() {
        return this.grZ;
    }

    public void setParticleLifeTime(float f) {
        this.grZ = f;
    }

    public ljq blJ() {
        return this.pJq;
    }

    public void bL(ljq ljq2) {
        this.pJq = ljq2;
    }

    public lcq getStartColor() {
        return this.eoo;
    }

    public void setStartColor(lcq lcq2) {
        this.eoo = lcq2;
    }

    public float getStartRotation() {
        return this.gsw;
    }

    public void setStartRotation(float f) {
        this.gsw = f;
    }

    public float getStartScale() {
        return this.doW;
    }

    public void setStartScale(float f) {
        this.doW = f;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public boolean blK() {
        return this.pJr;
    }

    public void hQ(boolean bl) {
        this.pJr = bl;
    }

    public float getStartTime() {
        return this.aZE;
    }

    public void setStartTime(float f) {
        this.aZE = f;
    }

    public float getDepthModifier() {
        return this.gsZ;
    }

    public void setDepthModifier(float f) {
        this.gsZ = f;
    }

    public float blM() {
        return this.pJs;
    }

    public void gn(float f) {
        this.pJs = f;
    }
}

