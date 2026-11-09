/*
 * Decompiled with CFR.
 */
public class klc
extends kld {
    public static final int pHP = 1;
    public static final int pHQ = 2;
    public static final int pHR = 4;
    public static final int pHS = 8;
    public static final int pHT = 16;
    public static final int pHU = 32;
    public static final int pHV = 64;
    public static final int pHW = 128;
    public static final int pHX = 256;
    public static final int pHY = 512;
    public static final int pHZ = 1024;
    public static final int pIa = 2048;
    public static final int pIb = 4096;
    public static final int pIc = 8192;
    public static final int pId = 16384;
    public static final int pIe = 32768;
    public static final int pIf = 65536;
    public static final int pIg = 131072;
    public static final int pIh = 262144;
    public static final int pIi = 524288;
    public static final int pIj = 0x100000;
    public static final int pIk = 0x200000;
    public static final int pIl = 0;
    public static final int pIm = 1;
    private int pIn;
    private int pIo;
    private int gDC;
    private int gDD;
    private boolean gDE;
    private boolean gDF;
    private boolean gDG;
    private boolean dsK;
    private boolean gDH;
    private float gDI;
    private float gDJ;
    private float gDK;
    private float gDL;
    private lcq gDM = lcq.BRIGHT_WHITE;
    private lcq gDN = lcq.BRIGHT_WHITE;
    private lcq gDO = lcq.BRIGHT_WHITE;
    private ljq gDP = ljq.roQ;
    private ljq gDQ = ljq.roQ;
    private ljq Position = ljq.roQ;
    private ljp gDR = ljp.roN;
    private ljp gDS = ljp.roN;
    private ljp gDT = ljp.roN;
    private ljp gDU = ljp.roN;
    private ljp gDV = ljp.roN;
    private String gDX = "";
    private String gDY = "";
    private boolean pIp = false;
    private float pIq = 20.0f;
    private float pIr = 3.0f;
    private float pIs = 1.0f;

    klc() {
        this.Jv(1038);
    }

    public boolean bUm() {
        return this.dsK;
    }

    public void lQ(boolean bl) {
        this.dsK = bl;
    }

    public lcq getImpactEndColor() {
        return this.gDO;
    }

    public void setImpactEndColor(lcq lcq2) {
        this.gDO = lcq2;
    }

    public float getImpactLifeTime() {
        return this.gDJ;
    }

    public void setImpactLifeTime(float f) {
        this.gDJ = f;
    }

    public lcq getImpactStartColor() {
        return this.gDN;
    }

    public void setImpactStartColor(lcq lcq2) {
        this.gDN = lcq2;
    }

    public String getImpactTexture() {
        return this.gDY;
    }

    public void setImpactTexture(String string) {
        this.gDY = string;
    }

    public ljp getImpactTextureEndScale() {
        return this.gDV;
    }

    public void setImpactTextureEndScale(ljp ljp2) {
        this.gDV = ljp2;
    }

    public ljp getImpactTextureStartScale() {
        return this.gDU;
    }

    public void setImpactTextureStartScale(ljp ljp2) {
        this.gDU = ljp2;
    }

    public lcq getMainColor() {
        return this.gDM;
    }

    public void setMainColor(lcq lcq2) {
        this.gDM = lcq2;
    }

    public String getMainTexture() {
        return this.gDX;
    }

    public void setMainTexture(String string) {
        this.gDX = string;
    }

    public float getMaxParticleSwingFrequency() {
        return this.gDL;
    }

    public void setMaxParticleSwingFrequency(float f) {
        this.gDL = f;
    }

    public float getMaxParticleSwingRadius() {
        return this.gDK;
    }

    public void setMaxParticleSwingRadius(float f) {
        this.gDK = f;
    }

    public float getMaxWindLerp() {
        return this.gDI;
    }

    public void setMaxWindLerp(float f) {
        this.gDI = f;
    }

    public int getNumberOfRays() {
        return this.gDC;
    }

    public void setNumberOfRays(int n) {
        this.gDC = n;
    }

    public int getNumParticlesPerLine() {
        return this.gDD;
    }

    public void setNumParticlesPerLine(int n) {
        this.gDD = n;
    }

    public int ecz() {
        return this.pIn;
    }

    public void YL(int n) {
        this.pIn = n;
    }

    public int ecA() {
        return this.pIo;
    }

    public void YM(int n) {
        this.pIo = n;
    }

    public ljq getOffsetValues() {
        return this.gDQ;
    }

    public void setOffsetValues(ljq ljq2) {
        this.gDQ = ljq2;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public ljq getStartingDirection() {
        return this.gDP;
    }

    public void setStartingDirection(ljq ljq2) {
        this.gDP = ljq2;
    }

    public ljp getTextureRepeat() {
        return this.gDR;
    }

    public void setTextureRepeat(ljp ljp2) {
        this.gDR = ljp2;
    }

    public ljp getTextureScale() {
        return this.gDS;
    }

    public void setTextureScale(ljp ljp2) {
        this.gDS = ljp2;
    }

    public ljp getTextureScrollSpeed() {
        return this.gDT;
    }

    public void setTextureScrollSpeed(ljp ljp2) {
        this.gDT = ljp2;
    }

    public boolean isUpdateAllLinesEveryFrame() {
        return this.gDG;
    }

    public void setUpdateAllLinesEveryFrame(boolean bl) {
        this.gDG = bl;
    }

    public boolean isUseCollisionTest() {
        return this.gDH;
    }

    public void setUseCollisionTest(boolean bl) {
        this.gDH = bl;
    }

    public boolean isUseImpact() {
        return this.gDE;
    }

    public void setUseImpact(boolean bl) {
        this.gDE = bl;
    }

    public boolean isUseWindInfluence() {
        return this.gDF;
    }

    public void setUseWindInfluence(boolean bl) {
        this.gDF = bl;
    }

    public boolean ecB() {
        return this.pIp;
    }

    public void hW(boolean bl) {
        this.pIp = bl;
    }

    public float ecC() {
        return this.pIq;
    }

    public void gv(float f) {
        this.pIq = f;
    }

    public float ecD() {
        return this.pIr;
    }

    public void gw(float f) {
        this.pIr = f;
    }

    public float ecE() {
        return this.pIs;
    }

    public void gx(float f) {
        this.pIs = f;
    }
}

