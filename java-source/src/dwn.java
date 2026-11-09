/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;
import java.util.Map;

public class dwn
extends dvx {
    private static final String hkp = "darkfall.leaderboard_entries";
    private static final String hkq = "PreviousTermPoints";
    private static final String hkr = "HighestTermPoints";
    private static final String hks = "HighestRank";
    private static final String hkt = "LastTermSeasonPoints";
    private static final String hku = "BestSeasonPoints";
    private boolean hkv = false;
    private int hkw = b.access$000(b.hkX);
    private int SN = -1;
    private float hkx = 0.0f;
    private float hky = 0.0f;
    private float hkz = 0.0f;
    private float hkA = 0.0f;
    private int hkB = 0;
    private int hkC = 0;
    private int hkD = 0;
    private int cAx = 0;
    private Map<Integer, Integer> hkE = null;
    private float hkF = 0.0f;
    private float hkG = 0.0f;
    private int hkH = 0;
    private int hkI = 0;
    private int hkJ = 0;

    public boolean bCV() {
        return this.hkv;
    }

    public int qe() {
        return this.SN;
    }

    public float bCW() {
        return this.hkx;
    }

    public float bCX() {
        return this.hky;
    }

    public float bCY() {
        return this.hkz;
    }

    public float bCZ() {
        return this.hkA;
    }

    public int bDa() {
        return this.hkB;
    }

    public int bDb() {
        return this.hkC;
    }

    public int bCR() {
        return this.hkD;
    }

    public int bDc() {
        return this.cAx;
    }

    public dwl bDd() {
        return dwl.getValueByOrdinal(this.cAx);
    }

    public float bDe() {
        return this.hkF;
    }

    public float bDf() {
        return this.hkG;
    }

    public int bDg() {
        return this.hkH;
    }

    public dwl bDh() {
        return dwl.getValueByOrdinal(this.hkH);
    }

    public int bDi() {
        return this.hkI;
    }

    public int bDj() {
        return this.hkJ;
    }

    public dwn(int n2) {
        this.SN = n2;
        this.hkE = lcn.emw();
    }

    public boolean a(b b2) {
        return b2 == null ? false : (this.hkw & b2.hlb) == b2.hlb;
    }

    public int CF(int n2) {
        return this.hkE.containsKey(n2) ? this.hkE.get(n2) : 0;
    }

    public void iE(float f2) {
        this.hkx += f2;
        if (f2 > 0.0f) {
            this.hkz += f2;
        }
        if (f2 < 0.0f) {
            this.hkA += f2;
        }
        if (this.hkx > this.hkG) {
            this.hkG = this.hkx;
        }
        this.hky = f2;
        this.hkv = false;
    }

    public void CG(int n2) {
        ++this.hkB;
        this.hkE.put(n2, this.CF(n2) + 1);
        this.hkv = false;
    }

    public void bDk() {
        ++this.hkC;
        this.hkv = false;
    }

    public void d(dwl dwl2) {
        if (dwl2 == null) {
            return;
        }
        this.cAx = dwl2.ordinal();
        this.hkD += dwl2.bCR();
        this.hkv = false;
    }

    void f(lmi[] lmiArray, lmg[] lmgArray) {
        if (lmgArray == null) {
            return;
        }
        if (lmiArray != null && lmiArray.length != lmgArray.length) {
            return;
        }
        boolean bl = false;
        for (int i2 = 0; i2 < lmgArray.length; ++i2) {
            a a2 = a.getValueByName(lmgArray[i2].getName());
            if (a2 == null) {
                if (lmgArray[i2].getName().equals(hkq)) {
                    if (lmiArray != null) {
                        this.hkF = dwn.e(lmiArray[i2]);
                    }
                    this.hkw |= b.hkZ.hlb;
                    continue;
                }
                if (lmgArray[i2].getName().equals(hkr)) {
                    if (lmiArray != null) {
                        this.hkG = dwn.e(lmiArray[i2]);
                    }
                    this.hkw |= b.hkZ.hlb;
                    continue;
                }
                if (lmgArray[i2].getName().equals(hks)) {
                    if (lmiArray != null) {
                        this.hkH = dwn.d(lmiArray[i2]);
                    }
                    this.hkw |= b.hkZ.hlb;
                    continue;
                }
                if (lmgArray[i2].getName().equals(hkt)) {
                    if (lmiArray != null) {
                        this.hkI = dwn.d(lmiArray[i2]);
                    }
                    this.hkw |= b.hla.hlb;
                    continue;
                }
                if (!lmgArray[i2].getName().equals(hku)) continue;
                if (lmiArray != null) {
                    this.hkJ = dwn.d(lmiArray[i2]);
                }
                this.hkw |= b.hla.hlb;
                continue;
            }
            if (lmiArray != null && (a2.getType() != lmj.adz(lmiArray[i2].getType()) || lmiArray[i2].euR())) continue;
            switch (a2) {
                case hkP: {
                    this.hkx = lmiArray != null ? dwn.e(lmiArray[i2]) : (float)dwh.bCC().bCH().bCK();
                    this.hkw |= b.hkY.hlb;
                    break;
                }
                case hkQ: {
                    if (lmiArray != null) {
                        this.hkz = dwn.e(lmiArray[i2]);
                    }
                    this.hkw |= b.hkY.hlb;
                    break;
                }
                case hkR: {
                    if (lmiArray != null) {
                        this.hkA = dwn.e(lmiArray[i2]);
                    }
                    this.hkw |= b.hkY.hlb;
                    break;
                }
                case hkS: {
                    if (lmiArray != null) {
                        this.hkB = dwn.d(lmiArray[i2]);
                    }
                    this.hkw |= b.hkY.hlb;
                    break;
                }
                case hkT: {
                    if (lmiArray != null) {
                        this.hkC = dwn.d(lmiArray[i2]);
                    }
                    this.hkw |= b.hkY.hlb;
                    break;
                }
                case hkU: {
                    if (lmiArray != null) {
                        this.hkD = dwn.d(lmiArray[i2]);
                    }
                    this.hkw |= b.hkY.hlb;
                    break;
                }
                case hkV: {
                    if (lmiArray != null) {
                        this.cAx = dwn.d(lmiArray[i2]);
                    }
                    this.hkw |= b.hkY.hlb;
                }
            }
            bl = true;
        }
        if (bl) {
            this.hkv = true;
        }
    }

    static dwn g(lmi[] lmiArray, lmg[] lmgArray) {
        for (int i2 = 0; i2 < lmgArray.length; ++i2) {
            a a2 = a.getValueByName(lmgArray[i2].getName());
            if (a2 == null || a2 != a.hkM) continue;
            int n2 = dwn.d(lmiArray[i2]);
            dwn dwn2 = new dwn(n2);
            dwn2.f(lmiArray, lmgArray);
            return dwn2;
        }
        return null;
    }

    static String a(int n2, int n3, b b2) {
        switch (b2) {
            case hkY: {
                return "SELECT currentTerm." + (Object)((Object)a.hkP) + ", " + "currentTerm." + (Object)((Object)a.hkQ) + ", " + "currentTerm." + (Object)((Object)a.hkR) + ", " + "currentTerm." + (Object)((Object)a.hkS) + ", " + "currentTerm." + (Object)((Object)a.hkT) + ", " + "previousTerm." + (Object)((Object)a.hkU) + ", " + "IFNULL(previousTerm." + (Object)((Object)a.hkV) + ", 0) AS " + (Object)((Object)a.hkV) + " " + "FROM " + hkp + " currentTerm " + "INNER JOIN " + hkp + " previousTerm " + "ON currentTerm.GameID = previousTerm.GameID " + "AND currentTerm.WorldID = previousTerm.WorldID " + "AND currentTerm." + (Object)((Object)a.hkM) + " = previousTerm." + (Object)((Object)a.hkM) + " " + "AND currentTerm." + (Object)((Object)a.hkN) + " = " + Integer.toString(n3 - 1) + " " + "WHERE currentTerm.GameID = " + lcw.qGe + " " + "AND currentTerm.WorldID = " + lcw.qGf + " " + "AND currentTerm." + (Object)((Object)a.hkM) + " = " + n2 + " " + "AND currentTerm." + (Object)((Object)a.hkN) + " = " + n3;
            }
            case hkZ: {
                return "SELECT IFNULL(" + (Object)((Object)a.hkP) + ", 0) AS " + hkq + ", " + "(" + "SELECT IFNULL(MAX(" + (Object)((Object)a.hkP) + "), 0) " + "FROM " + hkp + " " + "WHERE " + dwn.jD(null) + " " + "AND " + (Object)((Object)a.hkM) + " = " + n2 + ") AS " + hkr + ", " + "(" + "SELECT IFNULL(MAX(" + (Object)((Object)a.hkV) + "), 0) " + "FROM " + hkp + " " + "WHERE " + dwn.jD(null) + " " + "AND " + (Object)((Object)a.hkM) + " = " + n2 + ") AS " + hks + " " + "FROM " + hkp + " " + "WHERE " + dwn.jD(null) + " " + "AND " + (Object)((Object)a.hkM) + " = " + n2 + " " + "AND " + (Object)((Object)a.hkN) + " = " + (n3 - 1);
            }
            case hla: {
                return "SELECT IFNULL(" + (Object)((Object)a.hkU) + ", 0) AS " + hkt + ", " + "(" + "SELECT IFNULL(MAX(" + (Object)((Object)a.hkU) + "), 0) " + "FROM " + hkp + " " + "WHERE " + dwn.jD(null) + " " + "AND " + (Object)((Object)a.hkM) + " = " + n2 + ") AS " + hku + " " + "FROM " + hkp + " " + "WHERE " + dwn.jD(null) + " " + "AND " + (Object)((Object)a.hkM) + " = " + n2 + " " + "AND " + (Object)((Object)a.hkN) + " = " + (n3 - 1);
            }
        }
        return null;
    }

    static String a(dwn dwn2, int n2, int n3) {
        return "INSERT INTO darkfall.leaderboard_entries (GameID, WorldID, " + a.getSQLFieldList(null) + ") " + "VALUES (" + lcw.qGe + ", " + lcw.qGf + ", " + dwn2.qe() + ", " + n2 + ", " + n3 + ", " + dwn2.bCW() + ", " + dwn2.bCY() + ", " + dwn2.bCZ() + ", " + dwn2.bDa() + ", " + dwn2.bDb() + ", " + dwn2.bCR() + ", " + dwn2.bDc() + ") " + "ON DUPLICATE KEY UPDATE " + (Object)((Object)a.hkP) + " = VALUES(" + (Object)((Object)a.hkP) + "), " + (Object)((Object)a.hkQ) + " = VALUES(" + (Object)((Object)a.hkQ) + "), " + (Object)((Object)a.hkR) + " = VALUES(" + (Object)((Object)a.hkR) + "), " + (Object)((Object)a.hkS) + " = VALUES(" + (Object)((Object)a.hkS) + "), " + (Object)((Object)a.hkT) + " = VALUES(" + (Object)((Object)a.hkT) + "), " + (Object)((Object)a.hkU) + " = VALUES(" + (Object)((Object)a.hkU) + "), " + (Object)((Object)a.hkV) + " = VALUES(" + (Object)((Object)a.hkV) + ")";
    }

    static String a(List<dwn> list, int n2, int n3) {
        String string = "";
        for (dwn dwn2 : list) {
            if (dwn2.hkv) continue;
            string = string + (string.isEmpty() ? "" : ", ") + "(" + lcw.qGe + ", " + lcw.qGf + ", " + dwn2.qe() + ", " + n2 + ", " + n3 + ", " + dwn2.bCW() + ", " + dwn2.bCY() + ", " + dwn2.bCZ() + ", " + dwn2.bDa() + ", " + dwn2.bDb() + ", " + dwn2.bCR() + ", " + dwn2.bDc() + ")";
        }
        if (string.isEmpty()) {
            return "";
        }
        return "INSERT INTO darkfall.leaderboard_entries (GameID, WorldID, " + a.getSQLFieldList(null) + ") " + "VALUES " + string + " " + "ON DUPLICATE KEY UPDATE " + (Object)((Object)a.hkP) + " = VALUES(" + (Object)((Object)a.hkP) + "), " + (Object)((Object)a.hkQ) + " = VALUES(" + (Object)((Object)a.hkQ) + "), " + (Object)((Object)a.hkR) + " = VALUES(" + (Object)((Object)a.hkR) + "), " + (Object)((Object)a.hkS) + " = VALUES(" + (Object)((Object)a.hkS) + "), " + (Object)((Object)a.hkT) + " = VALUES(" + (Object)((Object)a.hkT) + "), " + (Object)((Object)a.hkU) + " = VALUES(" + (Object)((Object)a.hkU) + "), " + (Object)((Object)a.hkV) + " = VALUES(" + (Object)((Object)a.hkV) + ")";
    }

    static String CH(int n2) {
        return "SELECT " + (Object)((Object)a.hkM) + ", " + (Object)((Object)a.hkP) + ", " + (Object)((Object)a.hkQ) + ", " + (Object)((Object)a.hkR) + ", " + (Object)((Object)a.hkS) + ", " + (Object)((Object)a.hkT) + ", " + (Object)((Object)a.hkU) + " " + "FROM " + hkp + " " + "WHERE " + (Object)((Object)a.hkN) + " = " + n2 + " " + "ORDER BY " + (Object)((Object)a.hkP) + " DESC";
    }
}

