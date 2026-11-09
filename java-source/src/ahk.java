/*
 * Decompiled with CFR.
 */
public class ahk {
    public static final int biL = 160;
    public static final int biM = 159;
    public static final int biN = 0;
    public static final int biO = 1;
    public static final int biP = 2;
    public static final int biQ = 3;
    public static final int biR = 4;
    public static final int biS = 5;
    public static final int biT = 6;
    public static final int biU = 7;
    public static final int biV = 1;
    public static final int biW = 2;
    public static final int biX = 1;
    public static final int biY = 2;
    public static final int biZ = 3;
    public static final int bja = 1;
    public static final int bjb = 2;
    public static final int bjc = 3;
    public static final int bjd = 3;
    public static final int bje = 4;
    public static final int bjf = 5;
    public static final int bjg = 6;
    public static final int bjh = 7;
    public static final int bji = 8;
    public static final int bjj = 9;
    public static final int bjk = 4;
    public static final int bjl = 5;
    public static final int bjm = 6;
    public static final int bjn = 7;
    public static final int bjo = 8;
    public static final int bjp = 9;
    public static final int bjq = 1;
    public static final int bjr = 2;
    public static final int bjs = 3;
    public static final int bjt = 4;
    public static final int bju = 5;
    public static final int bjv = 5;
    public static final int bjw = 6;
    public static final int bjx = 7;
    public static final int bjy = 5;
    public static final int bjz = 6;
    public static final int bjA = 6;
    public static final int bjB = 7;
    public static final int bjC = 8;
    public static final int bjD = 1;
    public static final int bjE = 2;
    public static final int bjF = 3;
    public static final int bjG = 4;
    public static final int bjH = 1;
    public static final int bjI = 2;
    public static final int bjJ = 3;
    public static final int bjK = 4;
    public static final int bjL = 5;
    public static final int bjM = 6;
    public static final int bjN = 7;
    public static final int bjO = 8;
    public static final int bjP = 9;
    public static final int bjQ = 10;
    public static final int bjR = 11;
    public static final int bjS = 1;
    public static final int bjT = 2;
    public static final int bjU = 3;
    public static final int bjV = 4;
    public static final int bjW = 5;
    public static final int bjX = 6;
    public static final int bjY = 7;
    public static final int bjZ = 8;
    public static final int bka = 9;
    public static final int bkb = 10;
    public static final int bkc = 11;
    public static final int bkd = 12;
    public static final int bke = 1;
    public static final int bkf = 2;
    public static final int bkg = 3;
    public static final int bkh = 4;
    public static final int bki = 1;
    public static final int bkj = 2;
    public static final int bkk = 1;
    public static final int bkl = 2;
    public static final int bkm = 3;
    public static final int bkn = 3;
    public static final int bko = 4;
    public static final int bkp = 5;
    public static final int bkq = 6;
    public static final int bkr = 7;
    public static final int bks = 8;
    public static final int bkt = 3;
    public static final int bku = 3;
    public static final int bkv = 4;
    public static final int bkw = 5;
    public static final int bkx = 6;
    public static final int bky = 7;
    public static final int bkz = 8;
    public static final int bkA = 3;
    public static final int bkB = 4;
    public static final int bkC = 3;
    public static final int bkD = 3;
    public static final int bkE = 4;
    public static final int bkF = 8;
    public static final int bkG = 9;
    public static final int bkH = 10;
    public static final int bkI = 8;
    public static final int bkJ = 9;
    public static final int bkK = 1;
    public static final int bkL = 2;
    public static final int bkM = 1;
    public static final int bkN = 2;
    public static final int bkO = 1;
    public static final int bkP = 2;
    public static final int bkQ = 3;
    public static final int bkR = 4;
    public static final int bkS = 5;
    public static final int bkT = 6;
    public static final int bkU = 7;
    public static final int bkV = 8;
    public static final int bkW = 9;
    public static final int bkX = 10;
    public static final int bkY = 11;
    public static final int bkZ = 12;
    public static final int bla = 3;
    public static final int blb = 4;
    public static final int blc = 1;
    public static final int bld = 2;
    public static final int ble = 3;
    public static final int blf = 4;
    public static final int blg = 5;
    public static final int blh = 6;
    public static final int bli = 3;
    public static final int blj = 4;
    public static final int blk = 3;
    public static final int bll = 4;
    public static final int blm = 3;
    public static final int bln = 4;

    private ahk() {
    }

    public static final String a(ahu.c c2, int n) {
        if (c2 == null) {
            lfn.b(5, "SFPropertyIDConstants", "getFixedPropertyName() StateObjectType is null.");
            return null;
        }
        if (n <= 0) {
            lfn.b(5, "SFPropertyIDConstants", "getFixedPropertyName() PropertyID is invalid.");
            return null;
        }
        if (n >= 159) {
            lfn.b(5, "SFPropertyIDConstants", "getFixedPropertyName() PropertyID is invalid.");
            return null;
        }
        aht aht2 = new ahv(null).a(c2, null);
        if (aht2 == null) {
            lfn.b(5, "SFPropertyIDConstants", "getFixedPropertyName() SO is null.");
            return null;
        }
        return aht2.eB(n);
    }
}

