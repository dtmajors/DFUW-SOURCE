/*
 * Decompiled with CFR.
 */
public class kod
extends knt {
    public static final int pSn = 1;
    public static final int pSo = 2;
    public static final int pSp = 4;
    public static final int pSq = 8;
    public static final int pSr = 16;
    public static final int goA = 32;
    public static final int pSs = 64;
    public static final int goz = 128;
    public static final int pSD = 256;
    public static final int iWz = 512;
    public static final int pSt = 1024;
    public static final int pSu = 2048;
    public static final int iSY = 4096;
    public static final int jhW = 8192;
    public static final int pSE = 16384;
    public static final int pSF = 32768;
    public int pSG;
    public boolean fFD;
    public ljp fFz = new ljp(1.0f, 1.0f);
    public ljq fFA = new ljq();
    public ljp fFN;
    public boolean fFE;
    public float eir;
    public lcq dMT;
    public String fFC;
    public boolean pSH;
    public int pSy;
    public int pSz;
    public int pSA;
    public int pSB;
    public boolean lbk;

    kod() {
        this.Jv(259);
    }

    public final int eeA() {
        return this.pSG;
    }

    public final void ZL(int n) {
        this.pSG = n;
    }

    public final void hV(boolean bl) {
        this.fFD = bl;
    }

    public final void j(ljp ljp2) {
        this.fFz = ljp2;
    }

    public final void setColor(lcq lcq2) {
        this.dMT = lcq2;
    }

    public final void setTextureName(String string) {
        this.fFC = string;
    }

    public final void ZM(int n) {
        this.pSG = n;
    }

    public final void hU(boolean bl) {
        this.fFE = bl;
    }

    public final void gu(float f) {
        this.eir = f;
    }

    public final void bS(ljq ljq2) {
        this.fFA = ljq2;
    }

    public final void g(ljp ljp2) {
        this.fFN = ljp2;
    }

    public final void xr(boolean bl) {
        this.pSH = bl;
    }

    public final void q(lgs lgs2) {
        this.pSy = lgs2.cf;
        this.pSz = lgs2.rmN;
        this.pSA = lgs2.cg;
        this.pSB = lgs2.H;
    }

    public final boolean eeB() {
        return this.lbk;
    }

    public final void xs(boolean bl) {
        this.lbk = bl;
    }

    public final void p(lgs lgs2) {
        this.pSy = lgs2.cf;
        this.pSz = lgs2.cf + lgs2.rmN;
        this.pSA = lgs2.cg;
        this.pSB = lgs2.cg + lgs2.H;
    }

    @Override
    public String toString() {
        return null;
    }

    private static String ZN(int n) {
        return null;
    }
}

