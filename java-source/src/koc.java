/*
 * Decompiled with CFR.
 */
public class koc
extends knt {
    public static final int pSn = 1;
    public static final int pSo = 2;
    public static final int pSp = 4;
    public static final int pSq = 8;
    public static final int pSr = 16;
    public static final int goA = 32;
    public static final int pSs = 64;
    public static final int goz = 128;
    public static final int iWz = 512;
    public static final int pSt = 1024;
    public static final int pSu = 2048;
    public static final int iSY = 4096;
    public static final int jhW = 8192;
    public static final int pSv = 32768;
    private int pSw;
    private boolean fFD;
    private ljp fFz;
    private boolean fFE;
    private ljq fFA;
    private ljp fFB;
    private float eir;
    private lcq dMT;
    private boolean pSx;
    private int pSy;
    private int pSz;
    private int pSA;
    private int pSB;
    private ldv pSC;
    private int pgs;
    private int pgr;

    koc() {
        this.Jv(262);
    }

    public int eep() {
        return this.pSw;
    }

    public void ZD(int n) {
        this.pSw = n;
    }

    public boolean eeq() {
        return this.fFD;
    }

    public void hV(boolean bl) {
        this.fFD = bl;
    }

    public ljp bmS() {
        return this.fFz;
    }

    public void j(ljp ljp2) {
        this.fFz = ljp2;
    }

    public ljq bmR() {
        return this.fFA;
    }

    public void bS(ljq ljq2) {
        this.fFA = ljq2;
    }

    public ljp bmT() {
        return this.fFB;
    }

    public void k(ljp ljp2) {
        this.fFB = ljp2;
    }

    public boolean eer() {
        return this.fFE;
    }

    public void hU(boolean bl) {
        this.fFE = bl;
    }

    public float bmQ() {
        return this.eir;
    }

    public void gu(float f) {
        this.eir = f;
    }

    public lcq getColor() {
        return this.dMT;
    }

    public void setColor(lcq lcq2) {
        this.dMT = lcq2;
    }

    public boolean ees() {
        return this.pSx;
    }

    public void xq(boolean bl) {
        this.pSx = bl;
    }

    public int eet() {
        return this.pSy;
    }

    public void ZE(int n) {
        this.pSy = n;
    }

    public int eeu() {
        return this.pSz;
    }

    public void ZF(int n) {
        this.pSz = n;
    }

    public int eev() {
        return this.pSA;
    }

    public void ZG(int n) {
        this.pSA = n;
    }

    public int eew() {
        return this.pSB;
    }

    public void ZH(int n) {
        this.pSB = n;
    }

    public void p(lgs lgs2) {
        this.pSy = lgs2.cf;
        this.pSz = lgs2.cf + lgs2.rmN;
        this.pSA = lgs2.cg;
        this.pSB = lgs2.cg + lgs2.H;
    }

    public ldv eex() {
        return this.pSC;
    }

    public void tF(ldv ldv2) {
        this.pSC = ldv2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(1024);
        stringBuilder.append("{SF2DSpriteDCRequest: super=");
        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append("SF2DSpriteDCRequestType=");
        stringBuilder.append(koc.ZI(this.pSw));
        stringBuilder.append(",");
        stringBuilder.append("Scaling=");
        stringBuilder.append(this.fFz);
        stringBuilder.append(",");
        stringBuilder.append("RotationCenter=");
        stringBuilder.append(this.fFA);
        stringBuilder.append(",");
        stringBuilder.append("Translation=");
        stringBuilder.append(this.fFB);
        stringBuilder.append(",");
        stringBuilder.append("Rotation=");
        stringBuilder.append(this.eir);
        stringBuilder.append(",");
        stringBuilder.append("ZPos=");
        stringBuilder.append(this.ljZ);
        stringBuilder.append(",");
        stringBuilder.append("Color=");
        stringBuilder.append(this.dMT);
        stringBuilder.append(",");
        stringBuilder.append("Clipping=");
        stringBuilder.append(this.pSx);
        stringBuilder.append(",");
        stringBuilder.append("ClippingRectangleLeft=");
        stringBuilder.append(this.pSy);
        stringBuilder.append(",");
        stringBuilder.append("ClippingRectangleRight=");
        stringBuilder.append(this.pSz);
        stringBuilder.append(",");
        stringBuilder.append("ClippingRectangleTop=");
        stringBuilder.append(this.pSA);
        stringBuilder.append(",");
        stringBuilder.append("ClippingRectangleBottom=");
        stringBuilder.append(this.pSB);
        stringBuilder.append(",");
        stringBuilder.append("CallID=");
        stringBuilder.append(this.pSC);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private static String ZI(int n) {
        StringBuilder stringBuilder = new StringBuilder(1024);
        n = koc.a(stringBuilder, n, 1, "NewSprite");
        n = koc.a(stringBuilder, n, 4, "ModifyUseScaling");
        n = koc.a(stringBuilder, n, 8, "ModifyScaling");
        n = koc.a(stringBuilder, n, 16, "ModifyUseRotation");
        n = koc.a(stringBuilder, n, 32, "ModifyRotation");
        n = koc.a(stringBuilder, n, 64, "ModifySpriteCenter");
        n = koc.a(stringBuilder, n, 128, "ModifyPosition");
        n = koc.a(stringBuilder, n, 512, "ModifyVisible");
        n = koc.a(stringBuilder, n, 1024, "ModifyClippingOnOff");
        n = koc.a(stringBuilder, n, 2048, "ModifyClippingRectangle");
        n = koc.a(stringBuilder, n, 4096, "ModifyColor");
        n = koc.a(stringBuilder, n, 8192, "ModifyZ");
        if ((n = koc.a(stringBuilder, n, 32768, "ModifyDCCallID")) != 0) {
            assert (false) : n;
            stringBuilder.append("+" + n);
        }
        return stringBuilder.toString();
    }

    public int eey() {
        return this.pgs;
    }

    public void ZJ(int n) {
        this.pgs = n;
    }

    public int eez() {
        return this.pgr;
    }

    public void ZK(int n) {
        this.pgr = n;
    }
}

