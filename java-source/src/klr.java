/*
 * Decompiled with CFR.
 */
public class klr
extends klp {
    public static final int iYd = 1;
    public static final int iYe = 2;
    public static final int pJj = 4;
    public static final int pJk = 8;
    public static final int pJt = 16;
    public static final int pJu = 32;
    public static final int pJv = 64;
    public static final int pJw = 128;
    public static final int pJx = 256;
    public static final int pJy = 512;
    public static final int pJz = 1024;
    public static final int pJA = 2048;
    public static final int pJl = 4096;
    public static final int iYB = 8192;
    public static final int iYC = 16384;
    public static final int iYD = 32768;
    public static final int iYE = 65536;
    public static final int iYU = 131072;
    public static final int iYV = 262144;
    public static final int pJB = 524288;
    public static final int pJC = 0x100000;
    public static final int pJD = 0x200000;
    public static final int iYW = 0x400000;
    public static final int pJE = 0x800000;
    public static final int pJm = 0x1000000;
    public static final int pJo = 0x2000000;
    private int pJF = 0;
    private String fFC = null;
    private ljq pJq = null;
    private float grZ = 0.0f;
    private float pJG = 0.0f;
    private float gtr = 0.0f;
    private float pJH = 0.0f;
    private ljq pJI = null;
    private ljq pJJ = null;
    private float gAP = 0.0f;
    private float gsv = 0.0f;
    private float gsu = 0.0f;
    private int grQ = 0;
    private float doW = 0.0f;
    private float doX = 0.0f;
    private float gsw = 0.0f;
    private float gsx = 0.0f;
    private lcq eoo = null;
    private lcq eop = null;
    private float gsz = 0.0f;
    private float gsy = 0.0f;
    private float gsA = 0.0f;
    private int gtp = 0;
    private float gsf = 0.0f;
    private boolean pJr = false;
    private float pJs = 0.0f;
    private float gtD = 1.0f;

    klr() {
        this.Jv(2563);
    }

    public void a(klr klr2) {
        this.pJF = klr2.pJF;
        this.fFC = klr2.fFC;
        this.pJq = klr2.pJq;
        this.grZ = klr2.grZ;
        this.pJG = klr2.pJG;
        this.gtr = klr2.gtr;
        this.pJH = klr2.pJH;
        this.pJI = klr2.pJI;
        this.pJJ = klr2.pJJ;
        this.gAP = klr2.gAP;
        this.gsv = klr2.gsv;
        this.gsu = klr2.gsu;
        this.grQ = klr2.grQ;
        this.doW = klr2.doW;
        this.doX = klr2.doX;
        this.gsw = klr2.gsw;
        this.gsx = klr2.gsx;
        this.eoo = klr2.eoo;
        this.eop = klr2.eop;
        this.gsz = klr2.gsz;
        this.gsy = klr2.gsy;
        this.gsA = klr2.gsA;
        this.gtp = klr2.gtp;
        this.gsf = klr2.gsf;
        this.pJr = klr2.pJr;
        this.pJs = klr2.pJs;
        this.gtD = klr2.gtD;
        super.a(klr2);
    }

    public int edc() {
        return this.pJF;
    }

    public void YY(int n) {
        this.pJF = n;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public ljq blJ() {
        return this.pJq;
    }

    public void bL(ljq ljq2) {
        this.pJq = ljq2;
    }

    public float getParticleLifeTime() {
        return this.grZ;
    }

    public void setParticleLifeTime(float f) {
        this.grZ = f;
    }

    public float bmw() {
        return this.pJG;
    }

    public void gr(float f) {
        this.pJG = f;
    }

    public float getParticleAcceleration() {
        return this.gtr;
    }

    public void setParticleAcceleration(float f) {
        this.gtr = f;
    }

    public float bmx() {
        return this.pJH;
    }

    public void gs(float f) {
        this.pJH = f;
    }

    public ljq bmy() {
        return this.pJI;
    }

    public void bQ(ljq ljq2) {
        this.pJI = ljq2;
    }

    public ljq bmz() {
        return this.pJJ;
    }

    public void bR(ljq ljq2) {
        this.pJJ = ljq2;
    }

    public float getPullAcceleration() {
        return this.gAP;
    }

    public void setPullAcceleration(float f) {
        this.gAP = f;
    }

    public float getGravityInfluence() {
        return this.gsv;
    }

    public void setGravityInfluence(float f) {
        this.gsv = f;
    }

    public float getWindInfluence() {
        return this.gsu;
    }

    public void setWindInfluence(float f) {
        this.gsu = f;
    }

    public int getNumTextures() {
        return this.grQ;
    }

    public void setNumTextures(int n) {
        this.grQ = n;
    }

    public float getStartScale() {
        return this.doW;
    }

    public void setStartScale(float f) {
        this.doW = f;
    }

    public float getEndScale() {
        return this.doX;
    }

    public void setEndScale(float f) {
        this.doX = f;
    }

    public float getStartRotation() {
        return this.gsw;
    }

    public void setStartRotation(float f) {
        this.gsw = f;
    }

    public float getEndRotation() {
        return this.gsx;
    }

    public void setEndRotation(float f) {
        this.gsx = f;
    }

    public lcq getStartColor() {
        return this.eoo;
    }

    public void setStartColor(lcq lcq2) {
        this.eoo = lcq2;
    }

    public lcq getEndColor() {
        return this.eop;
    }

    public void setEndColor(lcq lcq2) {
        this.eop = lcq2;
    }

    public float getScaleTurbulencePercent() {
        return this.gsz;
    }

    public void setScaleTurbulencePercent(float f) {
        this.gsz = f;
    }

    public float getRotationTurbulencePercent() {
        return this.gsy;
    }

    public void setRotationTurbulencePercent(float f) {
        this.gsy = f;
    }

    public float getColorTurbulencePercent() {
        return this.gsA;
    }

    public void setColorTurbulencePercent(float f) {
        this.gsA = f;
    }

    public int getNumParticles() {
        return this.gtp;
    }

    public void setNumParticles(int n) {
        this.gtp = n;
    }

    public float getAnimationFrequency() {
        return this.gsf;
    }

    public void setAnimationFrequency(float f) {
        this.gsf = f;
    }

    public boolean blK() {
        return this.pJr;
    }

    public void hQ(boolean bl) {
        this.pJr = bl;
    }

    public float blM() {
        return this.pJs;
    }

    public void gn(float f) {
        this.pJs = f;
    }

    public void setScaleY(float f) {
        this.gtD = f;
    }

    public float getScaleY() {
        return this.gtD;
    }
}

