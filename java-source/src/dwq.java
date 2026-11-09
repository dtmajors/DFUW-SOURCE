/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class dwq
extends dvx {
    private static final String hlR = "darkfall.player_pvp_highscore_summary";
    private static final String hlS = "darkfall.player_pvp_highscore_day";
    private static final String hlT = "darkfall.player_pvp_highscore_week";
    private static final String hlU = "darkfall.player_pvp_highscore_month";
    private static final String hlV = "Today";
    private static final String hlW = "Yesterday";
    private static final String hlX = "Past7Days";
    private static final String hlY = "Past30Days";
    private static final String hlZ = "AllTime";
    private static final String hma = "{0}";
    private static final String hmb = "{1}";
    private static final String hmc = "{2}";
    private static final String hmd = "SELECT IFNULL(SUM(Counter), 0) AS AllTime, (SELECT IFNULL(SUM(Counter), 0) FROM darkfall.player_pvp_highscore_summary WHERE GameID = {0} AND WorldID = {1} AND CharacterID = {2} AND DDate = DATE(NOW())) AS Today, (SELECT IFNULL(SUM(Counter), 0) FROM darkfall.player_pvp_highscore_day WHERE GameID = {0} AND WorldID = {1} AND CharacterID = {2}) AS Yesterday, (SELECT IFNULL(SUM(Counter), 0) FROM darkfall.player_pvp_highscore_week WHERE GameID = {0} AND WorldID = {1} AND CharacterID = {2}) AS Past7Days, (SELECT IFNULL(SUM(Counter), 0) FROM darkfall.player_pvp_highscore_month WHERE GameID = {0} AND WorldID = {1} AND CharacterID = {2}) AS Past30Days FROM darkfall.player_pvp_highscore_summary WHERE GameID = {0} AND WorldID = {1} AND CharacterID = {2}";
    private int SN = -1;
    private int hme = 0;
    private int hmf = 0;
    private int hmg = 0;
    private int hmh = 0;
    private int hmi = 0;

    public int qe() {
        return this.SN;
    }

    public int bDy() {
        return this.hme;
    }

    public int bDz() {
        return this.hmf;
    }

    public int bDA() {
        return this.hmg;
    }

    public int bDB() {
        return this.hmh;
    }

    public int bDC() {
        return this.hmi;
    }

    private dwq(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.SN = n2;
        this.hme = n3;
        this.hmf = n4;
        this.hmg = n5;
        this.hmh = n6;
        this.hmi = n7;
    }

    public void bDD() {
        ++this.hmi;
        ++this.hme;
    }

    static dwq a(int n2, lmi[] lmiArray, lmg[] lmgArray) {
        if (lmiArray == null || lmgArray == null || lmiArray.length != lmgArray.length || lmgArray.length != 5) {
            return null;
        }
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        for (int i2 = 0; i2 < lmgArray.length; ++i2) {
            if (lmgArray[i2].getName().equals(hlZ)) {
                n3 = (int)dwq.f(lmiArray[i2]);
                if (n3 >= 0 && n3 != Integer.MAX_VALUE) continue;
                n3 = 0;
                continue;
            }
            if (lmgArray[i2].getName().equals(hlY)) {
                n4 = (int)dwq.f(lmiArray[i2]);
                if (n4 >= 0 && n4 != Integer.MAX_VALUE) continue;
                n4 = 0;
                continue;
            }
            if (lmgArray[i2].getName().equals(hlX)) {
                n5 = (int)dwq.f(lmiArray[i2]);
                if (n5 >= 0 && n5 != Integer.MAX_VALUE) continue;
                n5 = 0;
                continue;
            }
            if (lmgArray[i2].getName().equals(hlW)) {
                n6 = (int)dwq.f(lmiArray[i2]);
                if (n6 >= 0 && n6 != Integer.MAX_VALUE) continue;
                n6 = 0;
                continue;
            }
            if (!lmgArray[i2].getName().equals(hlV) || (n7 = (int)dwq.f(lmiArray[i2])) >= 0 && n7 != Integer.MAX_VALUE) continue;
            n7 = 0;
        }
        return new dwq(n2, n3, n4, n5, n6, n7);
    }

    static String CM(int n2) {
        return hmd.replace(hma, Integer.toString(lcw.qGe)).replace(hmb, Integer.toString(lcw.qGf)).replace(hmc, Integer.toString(n2));
    }
}

