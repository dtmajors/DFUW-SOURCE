/*
 * Decompiled with CFR.
 */
public final class ayv
extends Enum<ayv> {
    public static final /* enum */ ayv cBd = new ayv();
    public static final /* enum */ ayv cBe = new ayv();
    public static final /* enum */ ayv cBf = new ayv();
    public static final /* enum */ ayv cBg = new ayv();
    public static final /* enum */ ayv cBh = new ayv();
    public static final /* enum */ ayv cBi = new ayv();
    public static final /* enum */ ayv cBj = new ayv();
    public static final /* enum */ ayv cBk = new ayv();
    public static final /* enum */ ayv cBl = new ayv();
    public static final /* enum */ ayv cBm = new ayv();
    public static final /* enum */ ayv cBn = new ayv();
    public static final /* enum */ ayv cBo = new ayv();
    public static final /* enum */ ayv cBp = new ayv();
    public static final /* enum */ ayv cBq = new ayv();
    public static final /* enum */ ayv cBr = new ayv();
    public static final /* enum */ ayv cBs = new ayv();
    public static final /* enum */ ayv cBt = new ayv();
    public static final /* enum */ ayv cBu = new ayv();
    public static final /* enum */ ayv cBv = new ayv();
    public static final /* enum */ ayv cBw = new ayv();
    public static final /* enum */ ayv cBx = new ayv();
    public static final /* enum */ ayv cBy = new ayv();
    public static final /* enum */ ayv cBz = new ayv();
    public static final /* enum */ ayv cBA = new ayv();
    public static final /* enum */ ayv cBB = new ayv();
    public static final /* enum */ ayv cBC = new ayv();
    public static final /* enum */ ayv cBD = new ayv();
    public static final /* enum */ ayv cBE = new ayv();
    public static final /* enum */ ayv cBF = new ayv();
    public static final /* enum */ ayv cBG = new ayv();
    public static final /* enum */ ayv cBH = new ayv();
    public static final /* enum */ ayv cBI = new ayv();
    public static final /* enum */ ayv cBJ = new ayv();
    public static final /* enum */ ayv cBK = new ayv();
    public static final /* enum */ ayv cBL = new ayv();
    public static final /* enum */ ayv cBM = new ayv();
    public static final /* enum */ ayv cBN = new ayv();
    public static final /* enum */ ayv cBO = new ayv();
    public static final /* enum */ ayv cBP = new ayv();
    public static final /* enum */ ayv cBQ = new ayv();
    public static final /* enum */ ayv cBR = new ayv();
    public static final /* enum */ ayv cBS = new ayv();
    public static final /* enum */ ayv cBT = new ayv();
    public static final /* enum */ ayv cBU = new ayv();
    public static final /* enum */ ayv cBV = new ayv();
    public static final /* enum */ ayv cBW = new ayv();
    public static final /* enum */ ayv cBX = new ayv();
    public static final /* enum */ ayv cBY = new ayv();
    public static final /* enum */ ayv cBZ = new ayv();
    public static final /* enum */ ayv cCa = new ayv();
    public static final /* enum */ ayv cCb = new ayv();
    public static ayv[] cCc;
    private static final /* synthetic */ ayv[] cCd;

    public static ayv[] values() {
        return (ayv[])cCd.clone();
    }

    public static ayv valueOf(String string) {
        return Enum.valueOf(ayv.class, string);
    }

    public boolean abZ() {
        switch (this) {
            case cBe: 
            case cBs: 
            case cBf: 
            case cBg: 
            case cBo: 
            case cBq: 
            case cBr: 
            case cBE: 
            case cBF: 
            case cBG: 
            case cBH: 
            case cBI: 
            case cBJ: 
            case cBK: 
            case cBL: 
            case cBM: {
                return true;
            }
        }
        return false;
    }

    public static final int getValueCount() {
        return cCc.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < ayv.getValueCount();
    }

    public static final ayv getValueByOrdinal(int n) {
        if (ayv.isValidOrdinal(n)) {
            return cCc[n];
        }
        assert (false) : "Invalid Ordinal [" + n + "].Check Code";
        return cBd;
    }

    public lox aca() {
        switch (this) {
            case cBf: 
            case cBg: 
            case cBF: 
            case cBJ: 
            case cBK: 
            case cBL: 
            case cBM: 
            case cBw: 
            case cBz: 
            case cBA: 
            case cBN: 
            case cBO: 
            case cBP: 
            case cBQ: 
            case cBR: 
            case cBT: 
            case cBU: 
            case cBV: 
            case cBW: 
            case cBX: 
            case cBY: 
            case cBS: 
            case cBB: 
            case cBC: 
            case cBD: 
            case cBj: 
            case cBp: 
            case cBu: 
            case cBl: 
            case cBt: {
                return mbj.rXy;
            }
            case cBe: 
            case cBs: 
            case cBo: 
            case cBq: 
            case cBr: 
            case cBE: 
            case cBG: 
            case cBH: 
            case cBI: {
                return mbj.uex;
            }
            case cBd: 
            case cBy: {
                return mbj.rXy;
            }
            case cBh: {
                return mbj.ujI;
            }
            case cBi: {
                return mbj.ujK;
            }
            case cBk: {
                return mbj.ujL;
            }
            case cBm: {
                return mbj.ujM;
            }
            case cBn: {
                return mbj.ujN;
            }
            case cBv: {
                return mbj.ujJ;
            }
            case cBx: {
                return mbj.ubr;
            }
            case cBZ: {
                return mbj.ujO;
            }
            case cCa: {
                return mbj.ujP;
            }
        }
        return mbj.rXy;
    }

    static {
        cCd = new ayv[]{cBd, cBe, cBf, cBg, cBh, cBi, cBj, cBk, cBl, cBm, cBn, cBo, cBp, cBq, cBr, cBs, cBt, cBu, cBv, cBw, cBx, cBy, cBz, cBA, cBB, cBC, cBD, cBE, cBF, cBG, cBH, cBI, cBJ, cBK, cBL, cBM, cBN, cBO, cBP, cBQ, cBR, cBS, cBT, cBU, cBV, cBW, cBX, cBY, cBZ, cCa, cCb};
        cCc = (ayv[])ayv.class.getEnumConstants();
    }
}

