/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.sql.Timestamp;

public abstract class dwd
extends dvx {
    protected dwd() {
    }

    public static String a(int n2, Timestamp timestamp, ljq ljq2) {
        return timestamp == null || ljq2 == null ? null : "INSERT INTO player_suicide_log (" + dwd.a(new Enum[]{a.hij, a.hik, a.hil, a.him, a.hin, a.hio, a.hip, a.hir}, null) + ") " + "VALUES(" + lcw.qGe + ", " + lcw.qGf + ", " + n2 + ", " + dwd.aD(timestamp.toString()) + ", " + ljq2.x + ", " + ljq2.y + ", " + ljq2.rlV + ", " + dwd.aD(dwd.cB(ljq2)) + ") " + "ON DUPLICATE KEY UPDATE " + dwd.a(a.hiq, null) + " = " + dwd.a(a.hiq, null) + " + 1";
    }

    public static String a(Timestamp timestamp, int n2, String string, String string2, ljq ljq2, float f2) {
        return timestamp == null || string == null || string2 == null || ljq2 == null ? null : "CALL updatePlayerKilledMonsterTable(" + lcw.qGe + ", " + lcw.qGf + ", " + dwd.aD(timestamp.toString()) + ", " + n2 + ", " + dwd.aD(string) + ", " + dwd.aD(string2) + ", " + ljq2.x + ", " + ljq2.y + ", " + ljq2.rlV + ", " + dwd.aD(dwd.cB(ljq2)) + ", " + f2 + ")";
    }

    public static String a(Timestamp timestamp, ldv ldv2, String string, String string2, int n2, ldv ldv3, ljq ljq2) {
        return timestamp == null || ldv2 == null || string == null || string2 == null || ljq2 == null ? null : "CALL updateMonsterKilledPlayerTable(" + lcw.qGe + ", " + lcw.qGf + ", " + dwd.aD(timestamp.toString()) + ", " + ldv2.eny() + ", " + dwd.aD(string) + ", " + dwd.aD(string2) + ", " + n2 + ", " + (ldv3 == null ? null : Long.valueOf(ldv3.eny())) + ", " + ljq2.x + ", " + ljq2.y + ", " + ljq2.rlV + ", " + dwd.aD(dwd.cB(ljq2)) + ")";
    }

    public static String a(Timestamp timestamp, int n2, int n3, int n4, String string, String string2, int n5, int n6, int n7, String string3, ljq ljq2) {
        return timestamp == null || string2 == null || ljq2 == null ? null : "CALL updatePvPTables(" + lcw.qGe + ", " + lcw.qGf + ", " + dwd.aD(timestamp.toString()) + ", " + n2 + ", " + n3 + ", " + n4 + ", " + (string == null ? "''" : dwd.aD(string)) + ", " + dwd.aD(string2) + ", " + n5 + ", " + n6 + ", " + n7 + ", " + (string3 == null ? "''" : dwd.aD(string3)) + ", " + ljq2.x + ", " + ljq2.y + ", " + ljq2.rlV + ", " + dwd.aD(dwd.cB(ljq2)) + ")";
    }

    public static String a(Timestamp timestamp, int n2, String string, int n3, String string2, ljq ljq2, boolean bl) {
        return timestamp == null || ljq2 == null ? null : "CALL updatePlayerGankReviveTables(" + lcw.qGe + ", " + lcw.qGf + ", " + dwd.aD(timestamp.toString()) + ", " + n2 + ", " + (string == null ? "''" : dwd.aD(string)) + ", " + n3 + ", " + (string2 == null ? "''" : dwd.aD(string2)) + ", " + ljq2.x + ", " + ljq2.y + ", " + ljq2.rlV + ", " + (bl ? 1 : 0) + ", " + dwd.aD(dwd.cB(ljq2)) + ")";
    }

    public static String a(Timestamp timestamp, ldv ldv2, int n2, int n3) {
        return timestamp == null || ldv2 == null ? null : "CALL updateClanMemberReviveTables(" + lcw.qGe + ", " + lcw.qGf + ", " + dwd.aD(timestamp.toString()) + ", " + ldv2.eny() + ", " + n2 + ", " + n3 + ")";
    }

    public static String a(Timestamp timestamp, int n2, String string, String string2, String string3, String string4, ljq ljq2, float f2) {
        return timestamp == null || string == null || string2 == null || string3 == null || ljq2 == null ? null : "CALL updateDestroyedResourcesTable(" + lcw.qGe + ", " + lcw.qGf + ", " + dwd.aD(timestamp.toString()) + ", " + n2 + ", " + dwd.aD(string) + ", " + dwd.aD(string2) + ", " + dwd.aD(string3) + ", " + (string4 == null ? null : dwd.aD(string4)) + ", " + ljq2.x + ", " + ljq2.y + ", " + ljq2.rlV + ", " + dwd.aD(dwd.cB(ljq2)) + ", " + f2 + ")";
    }
}

