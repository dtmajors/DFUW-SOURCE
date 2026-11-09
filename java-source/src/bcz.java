/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class bcz {
    public static final boolean cYC = true;
    public static final String aLb = "clan_vault_log";
    public static final String cYD = "TransactionID";
    public static final String cYE = "GameID";
    public static final String cYF = "WorldID";
    public static final String cYG = "ClanGUID";
    public static final String cYH = "TransactionType";
    public static final String cYI = "CharacterID";
    public static final String cYJ = "CharacterName";
    public static final String cYK = "SourceID";
    public static final String cYL = "SourceResource";
    public static final String cYM = "OtherClanGUID";
    public static final String cYN = "OtherClanName";
    public static final String cYO = "ResourceName";
    public static final String cYP = "Quantity";
    public static final String cYQ = "Timestamp";
    public static final int cYR = 10000;
    public static final int cYS = 1000;
    public static final int cYT = 5000;
    public static final double cYU = 0.25;
    public static final int cYV = 1;
    public static final int cYW = 30;
    public static final int cYX = 0;
    public static final int cYY = 1000000;
    public static final int cYZ = 30;
    public static final double cZa = 5.0;
    public static final double cZb = 0.5;
    public static final int cZc = Math.min(20, 30);

    public static String alw() {
        return " FROM clan_vault_log";
    }

    public static String gY(ldv ldv2) {
        return " WHERE GameID = " + Integer.toString(lcw.qGe) + " AND " + cYF + " = " + Integer.toString(lcw.qGf) + bcz.gZ(ldv2);
    }

    public static String gZ(ldv ldv2) {
        return " AND ClanGUID = " + dvx.aD(ldv2.fk());
    }

    public static String alx() {
        return " ORDER BY TransactionID DESC";
    }

    public static String ae(int n, int n2) {
        return " LIMIT " + Integer.toString(n) + ", " + Integer.toString(n2);
    }

    public static String ha(ldv ldv2) {
        return "SELECT COUNT(TransactionID)" + bcz.alw() + bcz.gY(ldv2);
    }

    public static String c(ldv ldv2, int n, int n2) {
        return "SELECT TransactionID" + bcz.alw() + bcz.gY(ldv2) + bcz.alx() + bcz.ae(n2 + n * 5000, 5000);
    }
}

