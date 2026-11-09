/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.sql.Timestamp;

public abstract class dvk
extends dvx {
    protected dvk() {
    }

    public static String a(Timestamp timestamp, ldv ldv2, int n, int n2, int n3, int n4) {
        return timestamp == null || ldv2 == null ? null : "INSERT INTO clan_membership_transactions (GameID, WorldID, TimeStamp, ClanGUID, CharacterID, TargetCharacterID, ClanMemberOperation, MemberNewAccessLevel) VALUES(" + lcw.qGe + ", " + lcw.qGf + ", " + dvk.aD(timestamp.toString()) + ", " + dvk.aD(ldv2.fk()) + ", " + n + ", " + n2 + ", " + n3 + ", " + n4 + ")";
    }

    public static String a(Timestamp timestamp, ldv ldv2, ldv ldv3, int n, int n2) {
        return timestamp == null || ldv2 == null || ldv3 == null ? null : "INSERT INTO clan_politics_transactions (GameID, WorldID, TimeStamp, ThisClanGUID, OtherClanGUID, CharacterID, ClanPoliticType) VALUES(" + lcw.qGe + ", " + lcw.qGf + ", " + dvk.aD(timestamp.toString()) + ", " + dvk.aD(ldv2.fk()) + ", " + dvk.aD(ldv3.fk()) + ", " + n + ", " + n2 + ")";
    }

    public static String a(ldv ldv2, String string, ldv ldv3, String string2, int n) {
        return ldv2 == null || string == null || ldv3 == null || string2 == null ? null : "INSERT INTO city_found_history (GameID, WorldID, ClanGUID, ClanName, ObjectGUID, ObjectName, ObjectType) VALUES(" + lcw.qGe + ", " + lcw.qGf + ", " + dvk.aD(ldv2.fk()) + ", " + dvk.aD(string) + ", " + ldv3.eny() + ", " + dvk.aD(string2) + ", " + n + ") " + "ON DUPLICATE KEY UPDATE ClanGUID = VALUES(ClanGUID), ClanName = VALUES(ClanName)";
    }

    public static String a(int n, ldv ldv2, ldv ldv3, String string, int n2, int n3) {
        return ldv2 == null || ldv3 == null || string == null ? null : "INSERT INTO clan_city_ownership_history (ChallengeID, GameID, WorldID, ChallengerClanGUID, ObjectGUID, ObjectName, ObjectType, ObjectStatus) VALUES(" + n + ", " + lcw.qGe + ", " + lcw.qGf + ", " + dvk.aD(ldv2.fk()) + ", " + ldv3.eny() + ", " + dvk.aD(string) + ", " + n2 + ", " + n3 + ")";
    }

    public static String a(ldv ldv2, ldv ldv3, String string, int n, String string2, String string3, int n2, Timestamp timestamp) {
        return ldv2 == null || ldv3 == null || string == null || string2 == null || string3 == null || timestamp == null ? null : "INSERT INTO clan_city_structure_history (GameID, WorldID, ClanGUID, ObjectGUID, ObjectName, ObjectType, ResourceName, DisplayName, Status, TimeStamp) VALUES(" + lcw.qGe + ", " + lcw.qGf + ", " + dvk.aD(ldv2.fk()) + ", " + ldv3.eny() + ", " + dvk.aD(string) + ", " + n + ", " + dvk.aD(string2) + ", " + dvk.aD(string3) + ", " + n2 + ", " + dvk.aD(timestamp.toString()) + ")";
    }

    public static String a(ldv ldv2, String string, ldv ldv3, String string2, int n, ljq ljq2, Timestamp timestamp, int n2) {
        return ldv2 == null || string == null || ldv3 == null || string2 == null || ljq2 == null || timestamp == null ? null : "INSERT INTO clan_fortress_history (GameID, WorldID, ClanGUID, ClanName, FortressGUID, FortressName, CharacterID, PositionX, PositionY, PositionZ, Timestamp, Reason) VALUES(" + lcw.qGe + ", " + lcw.qGf + ", " + dvk.aD(ldv2.fk()) + ", " + dvk.aD(string) + ", " + ldv3.eny() + ", " + dvk.aD(string2) + ", " + n + ", " + ljq2.x + ", " + ljq2.y + ", " + ljq2.rlV + ", " + dvk.aD(timestamp.toString()) + ", " + n2 + ")";
    }

    public static String a(ldv ldv2, Timestamp timestamp, int n, String string, String string2) {
        return ldv2 == null || timestamp == null || string == null || string2 == null ? null : "INSERT INTO clan_all_events (GameID, WorldID, ClanGUID, TimeStamp, EventType, MainParameter, Parameters) VALUES(" + lcw.qGe + ", " + lcw.qGf + ", " + dvk.aD(ldv2.fk()) + ", " + dvk.aD(timestamp.toString()) + ", " + n + ", " + dvk.aD(string) + ", " + (string2.isEmpty() ? "''" : dvk.aD(string2)) + ")";
    }

    public static String a(ldv ldv2, bda bda2) {
        return ldv2 == null || bda2 == null ? null : "CALL updateClanVaultTables_New(" + Integer.toString(lcw.qGe) + ", " + Integer.toString(lcw.qGf) + ", " + dvk.aD(ldv2.fk()) + ", " + Integer.toString(bda2.alz().ordinal()) + ", " + dvk.aD(bda2.pa()) + ", " + Integer.toString(bda2.vf()) + ", " + dvk.aD(bda2.alI().toString()) + ", " + Integer.toString(bda2.qe()) + ", " + (bda2.hl() == null ? "NULL" : dvk.aD(bda2.hl())) + ", " + (bda2.alB() == null ? "NULL" : dvk.aD(bda2.alB())) + ", " + (bda2.alH() == null ? "NULL" : dvk.aD(bda2.alH())) + ", " + (bda2.alD() == null ? "NULL" : dvk.aD(bda2.alD().fk())) + ", " + (bda2.alE() == null || bda2.alE().isEmpty() ? "NULL" : dvk.aD(bda2.alE())) + ", " + Integer.toString(bda2.alz().alS()) + ")";
    }
}

