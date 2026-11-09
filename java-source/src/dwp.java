/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.sql.Timestamp;
import java.util.Calendar;

public class dwp
extends dvx {
    private static final String hlG = "darkfall.leaderboard_system";
    private int hlH = 0;
    private Timestamp hlI = new Timestamp(Calendar.getInstance().getTime().getTime());
    private int hlJ = 0;
    private int hlK = 0;
    private boolean hkv = false;

    public int bDr() {
        return this.hlH;
    }

    public Timestamp bDs() {
        return this.hlI;
    }

    public int bDt() {
        return this.hlJ;
    }

    public int bDu() {
        return this.hlK;
    }

    public boolean bCV() {
        return this.hkv;
    }

    dwp() {
    }

    public void bDv() {
        ++this.hlH;
        this.hlI = new Timestamp(Calendar.getInstance().getTime().getTime());
        this.hkv = false;
    }

    public void bDw() {
        ++this.hlJ;
        this.hlK = this.hlH;
        this.hkv = false;
    }

    static dwp h(lmi[] lmiArray, lmg[] lmgArray) {
        if (lmiArray == null || lmgArray == null || lmiArray.length != lmgArray.length) {
            return null;
        }
        dwp dwp2 = new dwp();
        block6: for (int i2 = 0; i2 < lmiArray.length; ++i2) {
            a a2 = a.getValueByName(lmgArray[i2].getName());
            if (a2 == null || a2.getType() != lmj.adz(lmiArray[i2].getType()) || lmiArray[i2].euR()) continue;
            switch (a2) {
                case hlM: {
                    dwp2.hlH = dwp.d(lmiArray[i2]);
                    continue block6;
                }
                case hlN: {
                    dwp2.hlI = dwp.i(lmiArray[i2]);
                    continue block6;
                }
                case hlO: {
                    dwp2.hlJ = dwp.d(lmiArray[i2]);
                    continue block6;
                }
                case hlP: {
                    dwp2.hlK = dwp.d(lmiArray[i2]);
                }
            }
        }
        dwp2.hkv = true;
        return dwp2;
    }

    static String bDx() {
        return "SELECT " + a.getSQLFieldList("a") + " " + "FROM " + hlG + " a " + "INNER JOIN " + "( " + "SELECT MAX(" + (Object)((Object)a.hlM) + ") mtn " + "FROM " + hlG + " " + "WHERE " + dwp.jD(null) + " " + ") b " + "ON " + "a." + (Object)((Object)a.hlM) + " = b.mtn " + "WHERE " + dwp.jD(null);
    }

    static String k(dwp dwp2) {
        return "INSERT INTO darkfall.leaderboard_system (GameID, WorldID, " + (Object)((Object)a.hlM) + ", " + (Object)((Object)a.hlO) + ", " + (Object)((Object)a.hlP) + ") " + "VALUES (" + lcw.qGe + ", " + lcw.qGf + ", " + dwp2.hlH + ", " + dwp2.hlJ + ", " + dwp2.hlK + ")";
    }
}

