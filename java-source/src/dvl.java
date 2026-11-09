/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public abstract class dvl
extends dvx {
    protected dvl() {
    }

    protected static dxl.c a(lmi lmi2) {
        return lmi2 == null || lmi2.euR() || !(lmi2 instanceof lml) ? null : dxl.c.getValueByOrdinal(((lml)lmi2).getValue());
    }

    public static String ou(ldv ldv2) {
        return ldv2 == null ? null : "SELECT " + dvp.a.getSQLFieldList("c") + " " + "FROM " + "conquest" + " AS c " + "WHERE " + "(" + dvl.jD("c") + " " + "AND " + dvl.a(dvp.a.hgU, "c") + " = " + dvl.aD(ldv2.fk()) + ") " + "OR (" + dvl.a(dvp.a.hgT, "c") + " IN (" + "SELECT " + dvl.a(dvm.a.hfU, "a") + " " + "FROM " + "conquest_attackers" + " AS a " + "WHERE " + dvl.jD("a") + " " + "AND " + dvl.a(dvm.a.hfV, "a") + " = " + dvl.aD(ldv2.fk()) + ")) " + "ORDER BY " + dvl.a(dvp.a.hgZ, "c") + ", " + dvl.a(dvp.a.hha, "c");
    }

    public static String ov(ldv ldv2) {
        return ldv2 == null ? null : "SELECT " + dvp.a.getSQLFieldList("c") + " " + "FROM " + "conquest" + " AS c " + "WHERE " + dvl.jD("c") + " " + "AND " + dvl.a(dvp.a.hgX, "c") + " = " + ldv2.eny() + " " + "ORDER BY " + dvl.a(dvp.a.hgZ, "c") + ", " + dvl.a(dvp.a.hha, "c");
    }

    public static String a(dvp ... dvpArray) {
        return dvpArray == null || dvpArray.length == 0 ? null : "SELECT " + dvm.a.getSQLFieldList(null) + " " + "FROM " + "conquest_attackers" + " " + "WHERE " + dvl.jD(null) + " " + "AND " + dvl.a(dvm.a.hfU, null) + " " + dvl.d(dvpArray) + " " + "ORDER BY " + dvl.a(dvm.a.hfU, null) + ", " + dvl.a(dvm.a.hga, null);
    }

    public static String a(dvm ... dvmArray) {
        return dvmArray == null || dvmArray.length == 0 ? null : "SELECT " + dvn.a.getSQLFieldList(null) + " " + "FROM " + "conquest_attackers_siege_stones" + " " + "WHERE " + dvl.jD(null) + " " + "AND " + dvl.a(dvn.a.hgp, null) + " " + dvl.b(dvmArray) + " " + "ORDER BY " + dvl.a(dvn.a.hgp, null) + ", " + dvl.a(dvn.a.hgv, null);
    }

    public static String b(dvp ... dvpArray) {
        return dvpArray == null || dvpArray.length == 0 ? null : "SELECT " + dvq.a.getSQLFieldList(null) + " " + "FROM " + "conquest_mercenaries" + " " + "WHERE " + dvl.jD(null) + " " + "AND " + dvl.a(dvq.a.hhl, null) + " " + dvl.d(dvpArray) + " " + "ORDER BY " + dvl.a(dvq.a.hhl, null) + ", " + dvl.a(dvq.a.hhq, null);
    }

    public static String c(dvp ... dvpArray) {
        return dvpArray == null || dvpArray.length == 0 ? null : "SELECT " + dvo.a.getSQLFieldList(null) + " " + "FROM " + "conquest_bind_stone_damagers" + " " + "WHERE " + dvl.jD(null) + " " + "AND " + dvl.a(dvo.a.hgF, null) + " " + dvl.d(dvpArray) + " " + "ORDER BY " + dvl.a(dvo.a.hgF, null) + ", " + dvl.a(dvo.a.hgK, null);
    }

    public static String a(ldv ldv2, String string, int n, ldv ldv3, String string2) {
        return ldv2 == null || string == null || n < 0 || ldv3 == null || string2 == null ? null : "CALL conquestStartChallenge(" + lcw.qGe + ", " + lcw.qGf + ", " + dvl.aD(ldv2.fk()) + ", " + dvl.aD(string) + ", " + n + ", " + ldv3.eny() + ", " + dvl.aD(string2) + ")";
    }

    public static String a(ldv ldv2, ldv ldv3, ldv ldv4, String string, int n, ldv ldv5, String string2, int n2, int n3) {
        return ldv2 == null || ldv3 == null || ldv4 == null || string == null || ldv5 == null || string2 == null ? null : "CALL conquest_attackersCreateAttacker(" + lcw.qGe + ", " + lcw.qGf + ", " + dvl.aD(ldv2.fk()) + ", " + ldv3.eny() + ", " + dvl.aD(ldv4.fk()) + ", " + dvl.aD(string) + ", " + n + ", " + ldv5.enw() + ", " + dvl.aD(string2) + ", " + n2 + ", " + n3 + ")";
    }

    public static String a(ldv ldv2, ldv ldv3, ldv ldv4, int n, ljq ljq2, String string) {
        return ldv2 == null || ldv3 == null || ldv4 == null || ljq2 == null || string == null ? null : "CALL conquest_attackers_siege_stonesPlaceSiegeStone(" + lcw.qGe + ", " + lcw.qGf + ", " + dvl.aD(ldv2.fk()) + ", " + ldv3.eny() + ", " + dvl.aD(ldv4.fk()) + ", " + n + ", " + dvl.aD(ljq2.toString()) + ", " + dvl.aD(string) + ", " + Integer.toString(0) + ", " + dvl.aD("Unknown") + ")";
    }

    public static String a(ldv ldv2, ldv ldv3, ldv ldv4, ljq ljq2, ldv ldv5, String string, int n) {
        return ldv2 == null || ldv3 == null || ldv4 == null || ljq2 == null || ldv5 == null || string == null ? null : "CALL conquest_attackers_siege_stonesDestroySiegeStone(" + lcw.qGe + ", " + lcw.qGf + ", " + dvl.aD(ldv2.fk()) + ", " + ldv3.eny() + ", " + dvl.aD(ldv4.fk()) + ", " + dvl.aD(ljq2.toString()) + ", " + ldv5.eny() + ", " + dvl.aD(string) + ", " + n + ")";
    }

    public static String a(ldv ldv2, ldv ldv3, ldv ldv4, dxl.c c2) {
        return ldv2 == null || ldv3 == null || ldv4 == null || c2 == null ? null : "CALL conquest_attackersRemoveAttacker(" + lcw.qGe + ", " + lcw.qGf + ", " + dvl.aD(ldv2.fk()) + ", " + ldv3.eny() + ", " + dvl.aD(ldv4.fk()) + ", " + c2.ordinal() + ")";
    }

    public static String a(ldv ldv2, ldv ldv3, ldv ldv4, dxl.c c2, int n) {
        return ldv2 == null || ldv3 == null || ldv4 == null || c2 == null ? null : "CALL conquest_attackersAttackerWon(" + lcw.qGe + ", " + lcw.qGf + ", " + dvl.aD(ldv2.fk()) + ", " + ldv3.eny() + ", " + dvl.aD(ldv4.fk()) + ", " + c2.ordinal() + ", " + n + ")";
    }

    public static String a(ldv ldv2, ldv ldv3, ldv ldv4, String string, ldv ldv5, String string2, float f2, int n) {
        return ldv2 == null || ldv3 == null || ldv4 == null || ldv5 == null ? null : "CALL conquest_mercenariesAddMercenary(" + lcw.qGe + ", " + lcw.qGf + ", " + dvl.aD(ldv2.fk()) + ", " + ldv3.eny() + ", " + dvl.aD(ldv4.fk()) + ", " + dvl.aD(string) + ", " + dvl.aD(ldv5.fk()) + ", " + dvl.aD(string2) + ", " + (int)(f2 * 100.0f) + ", " + n + ")";
    }

    public static String b(ldv ldv2, ldv ldv3, ldv ldv4, dxl.c c2) {
        return ldv2 == null || ldv3 == null || ldv4 == null || c2 == null ? null : "CALL conquest_mercenariesRemoveMercenary(" + lcw.qGe + ", " + lcw.qGf + ", " + dvl.aD(ldv2.fk()) + ", " + ldv3.eny() + ", " + dvl.aD(ldv4.fk()) + ", " + c2.ordinal() + ")";
    }

    public static String a(ldv ldv2, ldv ldv3, ldv ldv4, String string, String string2, String string3, String string4, int n) {
        return ldv2 == null || ldv3 == null || ldv4 == null || string == null || string2 == null || string3 == null || string4 == null ? null : "CALL conquest_bind_stone_damagersInsertClan(" + lcw.qGe + ", " + lcw.qGf + ", " + dvl.aD(ldv2.fk()) + ", " + ldv3.eny() + ", " + dvl.aD(ldv4.fk()) + ", " + dvl.aD(string) + ", " + dvl.aD(string2) + ", " + dvl.aD(string3) + ", " + dvl.aD(string4) + ", " + n + ")";
    }

    public static String a(ldv ldv2, ldv ldv3, String string, String string2, String string3, int n) {
        return ldv2 == null || ldv3 == null || string == null || string2 == null || string3 == null ? null : "CALL conquest_bind_stone_damagersInsertPlayers(" + lcw.qGe + ", " + lcw.qGf + ", " + dvl.aD(ldv2.fk()) + ", " + ldv3.eny() + ", " + dvl.aD(string) + ", " + dvl.aD(string2) + ", " + dvl.aD(string3) + ", " + n + ")";
    }

    public static String a(ldv ldv2, ldv ldv3, dxl.c c2) {
        return ldv2 == null || ldv3 == null || c2 == null ? null : "CALL conquestEndChallenge(" + lcw.qGe + ", " + lcw.qGf + ", " + dvl.aD(ldv2.fk()) + ", " + ldv3.eny() + ", " + c2.ordinal() + ")";
    }

    private static String d(dvp ... dvpArray) {
        if (dvpArray == null || dvpArray.length < 1) {
            return null;
        }
        String string = null;
        if (dvpArray.length == 1) {
            string = "= " + dvpArray[0].bBA();
        } else {
            string = "IN (" + dvpArray[0].bBA();
            for (int i = 1; i < dvpArray.length; ++i) {
                string = string + ", " + dvpArray[i].bBA();
            }
            string = string + ")";
        }
        return string;
    }

    private static String b(dvm ... dvmArray) {
        if (dvmArray == null || dvmArray.length < 1) {
            return null;
        }
        String string = null;
        if (dvmArray.length == 1) {
            string = "= " + dvmArray[0].bBz();
        } else {
            string = "IN (" + dvmArray[0].bBz();
            for (int i = 1; i < dvmArray.length; ++i) {
                string = string + ", " + dvmArray[i].bBz();
            }
            string = string + ")";
        }
        return string;
    }
}

