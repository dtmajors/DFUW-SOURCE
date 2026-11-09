/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class ibv {
    public static final ibu lGs = new ibu(lvw.taL, ics.lHE, 14262308, "g", aud.a.cap, aud.a.cap, aud.a.caq, aud.a.caJ, aud.a.caA, aud.a.caB);
    public static final ibu lGt = new ibw(cg.b.he, lvw.taM, ics.lHE, 14262308, "kr", aud.a.cap, aud.a.cap, aud.a.caq, aud.a.caJ, aud.a.caA, aud.a.caB);
    public static final ibu lGu = new ibw(cg.b.hd, lvw.taN, ics.lHE, 14262308, "jp", aud.a.caK, aud.a.caK, aud.a.caq, aud.a.caJ, aud.a.caA, aud.a.caB);
    public static final ibu lGv = new ibu(lvw.taO, ics.lHE, 0xC1C1C1, "l", aud.a.car, aud.a.car, new aud.a[0]);
    public static final ibu lGw = new ibu(lvw.taR, ics.lHE, 2661304, "p", aud.a.cav, aud.a.cav, aud.a.caI);
    public static final ibu lGx = new ibu(lvw.taP, ics.lHE, 3061064, "c", aud.a.cat, aud.a.cat, aud.a.cau, aud.a.caE, aud.a.caH);
    public static final ibu lGy = new ibu(lvw.taQ, ics.lHE, 2540158, "a", aud.a.caC, aud.a.caC, aud.a.caD);
    public static final ibu lGz = new ibu(lvw.taV, ics.lHE, 10779213, "t", aud.a.caG, aud.a.caG, new aud.a[0]);
    public static final ibu lGA = new ibu(lvw.taW, ics.lHE, 12067839, "w", aud.a.cas, aud.a.cas, new aud.a[0]);
    public static final ibu lGB = new ibu(lvw.taS, ics.lHE, 12435787, "h", aud.a.caL, aud.a.caL, new aud.a[0]);
    public static final ibu lGC = new ibu(lvw.tbB, ics.lHE, 0xFFFFFF, "gm", aud.a.caw, aud.a.caw, aud.a.cay, aud.a.cax, aud.a.caF);
    public static final ibu lGD = new ibu(lvw.tbA, ics.lHE, 0xFFFFFF, "adm", aud.a.caz, aud.a.caw, aud.a.cay, aud.a.cax, aud.a.caF, aud.a.caz);
    private static final ibu[] lGE = new ibu[]{lGv, lGs, lGw, lGx, lGy, lGz, lGA, lGB, lGC, lGD};
    private static final ibu[] lGF = new ibu[]{lGv, lGt, lGu, lGw, lGx, lGy, lGz, lGA, lGB, lGC, lGD};

    public static ibu[] cNA() {
        if (!lcw.emW() || lcw.enb()) {
            return lGE;
        }
        return lGF;
    }

    public static ibu pE(String string) {
        ibu[] ibuArray;
        for (ibu ibu2 : ibuArray = ibv.cNA()) {
            if (!ibu2.getId().equals(string)) continue;
            return ibu2;
        }
        return null;
    }
}

