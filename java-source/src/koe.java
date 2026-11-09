/*
 * Decompiled with CFR.
 */
public class koe
extends knt {
    public static final int jhU = 1;
    public static final int jhV = 2;
    public static final int goz = 4;
    public static final int iSY = 8;
    public static final int jhW = 16;
    public static final int iWz = 32;
    public static final int pSj = 64;
    public static final int jhY = 128;
    public static final int jhZ = 256;
    public static final int pSI = 512;
    public static final int pSJ = 1024;
    public static final int pSK = 2048;
    public static final int pSF = 4096;
    public static final int jia = 1;
    public static final int jib = 2;
    public static final int jic = 4;
    public static final int jid = 8;
    public static final int jie = 16;
    public static final int jif = 32;
    public static final int jig = 64;
    public static final int jih = 128;
    public static final int pSL = 256;
    public boolean pSM = false;
    public int pSN;
    public int pSO;
    public int pSP;
    public int pSQ;
    public ljp fFN;
    public ljp fFO;
    public lcq dMT;
    public int fFM;
    public String fFP;
    public int fFL;
    public ldv se;

    koe() {
        this.Jv(257);
    }

    public int bVb() {
        return this.fFL;
    }

    public void JA(int n) {
        this.fFL = n;
    }

    public void a(koe koe2) {
        this.pSM = koe2.pSM;
        this.pSN = koe2.pSN;
        this.pSO = koe2.pSO;
        this.pSP = koe2.pSP;
        this.pSQ = koe2.pSQ;
        this.fFN = koe2.fFN;
        this.fFO = koe2.fFO;
        this.dMT = koe2.dMT;
        this.fFM = koe2.fFM;
        this.fFP = koe2.fFP;
        this.fFL = koe2.fFL;
        this.se = koe2.se;
        super.c(koe2);
    }

    public void JB(int n) {
        this.fFN.x = n;
    }

    public void JC(int n) {
        this.fFN.y = n;
    }

    public void setColor(lcq lcq2) {
        this.dMT = lcq2;
    }

    public void setText(String string) {
        this.fFP = string;
    }

    public void ma(ldv ldv2) {
        this.se = ldv2;
    }

    public void xf(int n) {
        this.fFM = n;
    }

    public void h(ljp ljp2) {
        this.fFO = ljp2;
    }

    public void g(ljp ljp2) {
        this.fFN = ljp2;
    }

    @Override
    public String toString() {
        return null;
    }

    private static String ZO(int n) {
        return null;
    }

    private static String ZP(int n) {
        return null;
    }

    public int eeC() {
        return this.pSQ;
    }

    public void Ab(int n) {
        this.pSQ = n;
    }

    public int eeD() {
        return this.pSN;
    }

    public void Ac(int n) {
        this.pSN = n;
    }

    public int eeE() {
        return this.pSO;
    }

    public void Ad(int n) {
        this.pSO = n;
    }

    public int eeF() {
        return this.pSP;
    }

    public void Ae(int n) {
        this.pSP = n;
    }

    public boolean eeG() {
        return this.pSM;
    }

    public void hM(boolean bl) {
        this.pSM = bl;
    }
}

