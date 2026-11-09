/*
 * Decompiled with CFR.
 */
public enum jnz {
    nFA,
    nFB,
    nFC,
    nFD,
    nFE,
    nFF,
    nFG,
    nFH,
    nFI,
    nFJ,
    nFK,
    nFL,
    nFM,
    nFN,
    nFO,
    nFP,
    nFQ,
    nFR,
    nFS,
    nFT,
    nFU,
    nFV,
    nFW,
    nFX,
    nFY,
    nFZ;

    public static final int nGa;
    public static final int nGb;
    public static final int nGc;
    public static final int nGd;
    public static final int nGe;
    public static final int nGf;
    public static final int nGg;
    public static final int nGh;
    public static final int nGi;
    public static final int nGj;
    public static final int nGk;
    public static final int nGl;
    public static final int nGm;
    public static final int nGn;
    public static final int nGo;
    public static final int nGp;
    public static final int nGq;
    public static final int nGr;
    public static final int nGs;
    public static final int nGt;
    public static final int nGu;
    public static final int nGv;
    public static final int nGw;
    public static final int nGx;
    public static final int nGy;
    public static final int nGz;
    public static final int nGA;
    public static final int nGB;
    public static final int nGC;
    public static final int nGD;
    public static final int ALL = -1;

    public boolean isSet(int n) {
        return (1 << this.ordinal() & n) != 0;
    }

    static {
        nGa = 1 << nFA.ordinal();
        nGb = 1 << nFB.ordinal();
        nGc = 1 << nFC.ordinal();
        nGd = 1 << nFD.ordinal();
        nGe = 1 << nFE.ordinal();
        nGf = 1 << nFF.ordinal();
        nGg = 1 << nFG.ordinal();
        nGh = 1 << nFH.ordinal();
        nGi = 1 << nFI.ordinal();
        nGj = 1 << nFJ.ordinal();
        nGk = 1 << nFK.ordinal();
        nGl = 1 << nFL.ordinal();
        nGm = 1 << nFM.ordinal();
        nGn = 1 << nFN.ordinal();
        nGo = 1 << nFO.ordinal();
        nGp = 1 << nFP.ordinal();
        nGq = 1 << nFQ.ordinal();
        nGr = 1 << nFR.ordinal();
        nGs = 1 << nFS.ordinal();
        nGt = 1 << nFT.ordinal();
        nGu = 1 << nFU.ordinal();
        nGv = 1 << nFV.ordinal();
        nGw = 1 << nFW.ordinal();
        nGx = 1 << nFX.ordinal();
        nGy = 1 << nFY.ordinal();
        nGz = 1 << nFZ.ordinal();
        nGA = nGe | nGi | nGk | nGm;
        nGB = nGe | nGp | nGh | nGq | nGr | nGs | nGt | nGu | nGw;
        nGC = nGe | nGf | nGg | nGi;
        nGD = nGi;
    }
}

